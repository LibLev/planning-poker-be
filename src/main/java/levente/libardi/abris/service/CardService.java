package levente.libardi.abris.service;

import levente.libardi.abris.model.Card;
import levente.libardi.abris.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    //Sav card to DB
    public void saveCard(Card card) {
        cardRepository.save(card);
    }

    public List<Card> getAllCardOfTask(Long id) {
        return cardRepository.findAllByTaskId(id);
    }
}
