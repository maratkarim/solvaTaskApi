package solva.TaskApi.mapper;

import org.mapstruct.Mapper;
import solva.TaskApi.dto.ExchangerDto;
import solva.TaskApi.entites.Exchange;

@Mapper(componentModel = "spring")
public interface ExchangerMapper {
    Exchange toEntity(ExchangerDto exchangerDto);
    ExchangerDto toDto(Exchange exchanger);
}
