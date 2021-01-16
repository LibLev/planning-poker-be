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

    public int findClosestFibonacciNumber(int num){
        if ((Math.sqrt(5*Math.pow(num,2)+4)%1) == 0 || (Math.sqrt(5*Math.pow(num,2)-4)%1) == 0){
            return num;
        }else{
            int c = 0;
            while (true){
                c += 1;
                if (Math.sqrt(5*Math.pow((num+c),2)+4)%1==0 || Math.sqrt(5*Math.pow((num+c),2)-4)%1==0){
                    return num+c;
                }
                if (Math.sqrt(5*Math.pow((num-c),2)+4)%1==0 || Math.sqrt(5*Math.pow((num-c),2)-4)%1==0){
                    return num-c;
                }
            }
        }
    }
}
