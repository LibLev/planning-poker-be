package levente.libardi.abris.repository;

import levente.libardi.abris.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {

    List<Card> findAllByTaskId(Long id);

}
