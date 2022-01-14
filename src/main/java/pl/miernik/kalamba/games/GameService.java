package pl.miernik.kalamba.games;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GameService {
    private GameRepository gameRepository;

    public void saveGame(GameEntity gameEntity){
        gameRepository.save(gameEntity);
    }

    public List<GameEntity> gameList (){
        return gameRepository.findAll();
    }
}
