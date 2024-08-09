package solva.TaskApi.mapper;

import org.mapstruct.Mapper;
import solva.TaskApi.dto.TransactionDto;
import solva.TaskApi.entites.Transaction;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    Transaction toEntity(TransactionDto transactionDto);
    TransactionDto toDto(Transaction transaction);
}
