package com.allianz.example.util;

import com.allianz.example.util.dbutil.BaseEntity;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@NoRepositoryBean
public abstract class BaseService<DTO extends BaseDTO, Entity extends BaseEntity, RequestDTO extends BaseRequestDTO> {


	// Bu, her servis için doğru depoyu (repository) döndürmek için uygulanması gereken bir metoddur.
	protected abstract JpaRepository<Entity, UUID> getRepository();

	// Eğer bir mapper kullanılıyorsa, bu metodun da somut sınıflar tarafından uygulanması gerekmektedir.
	protected abstract DTO entityToDTO(Entity entity);
	protected abstract Entity dtoToEntity(RequestDTO requestDTO);

	protected abstract Entity requestDtoToExistEntity(RequestDTO dto, Entity entity);




	public DTO save(RequestDTO requestDTO){
		Entity entity = dtoToEntity(requestDTO);
		entity = getRepository().save(entity);
		return entityToDTO(entity);
	}

	public List<DTO> getAll(){
		List<Entity> entities = getRepository().findAll();
		return entities.stream().map(this::entityToDTO).collect(Collectors.toList());
	}

	public DTO update(UUID uuid, RequestDTO requestDTO){
		Entity existingEntity = getRepository().findById(uuid).orElse(null);
		if (existingEntity == null) {
			return null;
		}

		requestDtoToExistEntity(requestDTO, existingEntity );

		existingEntity = getRepository().save(existingEntity);
		return entityToDTO(existingEntity);
	}

	public Boolean delete(UUID uuid){
		if(!getRepository().existsById(uuid)){
			return false;
		}
		getRepository().deleteById(uuid);
		return true;
	}

	public DTO getSettingByUuid(UUID uuid){
		Entity entity = getRepository().findById(uuid).orElse(null);
		if(entity == null) {
			return null;
		}
		return entityToDTO(entity);
	}
}
