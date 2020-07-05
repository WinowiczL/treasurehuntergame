package pl.winowicz.game.domain;

import pl.winowicz.game.dto.PlayerDto;

import java.util.ArrayList;
import java.util.List;

import static java.util.UUID.randomUUID;

class GameFactory {

    private final static int boardWith = 5;
    private final static int boardHeight = 5;

    Game createFrom(PlayerDto playerDto) {
        return new Game(
                generateId(),
                new Player(playerDto.name()),
                new Board(boardWith, boardHeight, treasurePosition())
        );
    }

    private String generateId() {
        return randomUUID().toString();
    }

    private List<Position> treasurePosition() {
        return new ArrayList<>();
    }

}
