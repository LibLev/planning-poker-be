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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int numOfCard;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Task task;

    @ManyToOne (cascade = CascadeType.MERGE)
    private AppUser user;

}
