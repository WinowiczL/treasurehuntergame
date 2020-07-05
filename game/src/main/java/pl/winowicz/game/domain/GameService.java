package pl.winowicz.game.domain;

import lombok.AllArgsConstructor;
import pl.winowicz.game.dto.GameDto;
import pl.winowicz.game.dto.PlayerDto;

@AllArgsConstructor
class GameService {

    private final GameRepository gameRepository;
    private final GameFactory gameFactory;
    private final Specification specification;

    String assignPlayerToBoard(PlayerDto playerDto) throws UnsatisfiedSpecificationException {
        Game game = gameFactory.createFrom(playerDto);
        boolean isGameValid = specification.canGameStart(game.dto());

        if (isGameValid) {
            return gameRepository.saveGame(game);
        }
        return null;
    }

    GameDto findGame(String gameId) {
        return gameRepository.findById(gameId).dto();
    }
}
