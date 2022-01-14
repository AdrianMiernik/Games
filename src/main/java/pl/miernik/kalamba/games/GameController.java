package pl.miernik.kalamba.games;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
@AllArgsConstructor
public class GameController {
    private GameService gameService;

    @PostMapping("/add")
    public void addNewGame(@RequestBody GameEntity gameEntity) {
        gameService.saveGame(gameEntity);
    }

    @GetMapping("/list")
    public List<GameEntity> gameList(){
        return gameService.gameList();
    }

}