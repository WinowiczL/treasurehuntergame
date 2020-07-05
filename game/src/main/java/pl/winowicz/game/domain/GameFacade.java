package pl.winowicz.game.domain;


import lombok.AllArgsConstructor;
import pl.winowicz.game.dto.GameDto;
import pl.winowicz.game.dto.PlayerDto;

@AllArgsConstructor
public class GameFacade {

    private final GameRepository gameRepository;
    private final GameService gameService;

    public String startGame(PlayerDto playerDto) {
        return gameService.assignPlayerToBoard(playerDto);
    }

    public GameDto findGame(String gameId) {
        return gameService.findGame(gameId);
    }
}
