package levente.libardi.abris.repository;

import levente.libardi.abris.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
