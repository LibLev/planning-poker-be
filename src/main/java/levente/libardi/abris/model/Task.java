package levente.libardi.abris.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameOfTask;
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;
}
