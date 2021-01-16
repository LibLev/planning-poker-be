package levente.libardi.abris.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {

    @Id
    @NotNull
    @GeneratedValue
    private int id;
    private String nameOfTask;
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;
}
