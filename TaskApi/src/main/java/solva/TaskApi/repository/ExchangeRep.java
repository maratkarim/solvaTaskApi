package solva.TaskApi.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import solva.TaskApi.entites.Exchange;

@Repository
@Transactional
public interface ExchangeRep extends JpaRepository<Exchange, Long> {
}
