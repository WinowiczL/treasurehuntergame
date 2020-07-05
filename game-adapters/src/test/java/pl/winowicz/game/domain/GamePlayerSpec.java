package pl.winowicz.game.domain;

import org.junit.jupiter.api.Test;
import pl.winowicz.game.dto.PlayerDto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GamePlayerSpec {

    GameFacade facade = new GameConfiguration().gameFacade();

    @Test
    public void shouldAssignPlayerWithGameWhenGameStarted() {
        // given
        String playerName = "Joe Doe";
        PlayerDto playerDto = new PlayerDto(playerName);
        // when
        String gameId = facade.startGame(playerDto);
        // then
        assertEquals(playerName, facade.findGame(gameId).playerDto().name());
    }

    @Test
    public void shouldThrowExceptionWhenPlayerNameNotFilled() {
        // given
        PlayerDto playerDto = new PlayerDto("");
        // when
        // then
        assertThrows(UnsatisfiedSpecificationException.class, () -> facade.startGame(playerDto));
    }

}
