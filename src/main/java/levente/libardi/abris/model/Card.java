package levente.libardi.abris.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Card {

    @Id
    @NotNull
    @GeneratedValue
    private int id;
    private int numOfCard;

    @OneToOne(mappedBy = "card", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Task task;

    @OneToOne(mappedBy = "card", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private User user;

}
