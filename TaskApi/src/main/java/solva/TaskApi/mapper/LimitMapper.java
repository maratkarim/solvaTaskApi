package solva.TaskApi.mapper;

import org.mapstruct.Mapper;
import solva.TaskApi.dto.LimitDto;

import solva.TaskApi.entites.Limits;

@Mapper(componentModel = "spring")
public interface LimitMapper {
    Limits toEntity(LimitDto limitDto);
    LimitDto toDto(Limits limit);
}
