package miage.m1.dice;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class DiceRollLog {
    @Id
    @GeneratedValue
    private Long id;

    private int diceCount;

    @ElementCollection
    private List<Integer> results;

    private long timestamp;
}
