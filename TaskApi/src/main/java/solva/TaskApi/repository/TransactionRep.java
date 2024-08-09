package solva.TaskApi.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import solva.TaskApi.entites.Transaction;

@Repository
@Transactional
public interface TransactionRep extends JpaRepository<Transaction, Long> {
}
