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

    @OneToOne(mappedBy = "card", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Task task;

    @ManyToOne (cascade = CascadeType.ALL)
    private AppUser user;

}
