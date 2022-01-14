package pl.miernik.kalamba.games;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "games")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private int gameId;
    private String action;

}
