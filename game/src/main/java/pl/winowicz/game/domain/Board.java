package pl.winowicz.game.domain;

import lombok.AllArgsConstructor;
import pl.winowicz.game.dto.BoardDto;
import pl.winowicz.game.dto.PositionDto;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
class Board {

    private final int width;
    private final int height;
    private final List<Position> treasurePositions;

    BoardDto dto() {
        return new BoardDto(width, height, positionDtos());
    }

    private List<PositionDto> positionDtos() {
        return treasurePositions.stream().map(Position::dto).collect(Collectors.toList());
    }

}

@AllArgsConstructor
class Position {

    private final int x;
    private final int y;

    PositionDto dto() {
        return new PositionDto(x, y);
    }

}
