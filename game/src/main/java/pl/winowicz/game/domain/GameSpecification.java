package pl.winowicz.game.domain;

import lombok.RequiredArgsConstructor;
import pl.winowicz.game.dto.GameDto;
import pl.winowicz.game.dto.PlayerDto;

import java.util.List;

abstract class Specification {
    abstract boolean canGameStart(GameDto gameDto);
}

class GameSpecificationFactory {
    Specification defineGameSpecification() {
        return new GameSpecification(List.of(new PlayerSpecification()));
    }
}

@RequiredArgsConstructor
class GameSpecification extends Specification {

    private final List<Specification> specifications;

    boolean canGameStart(GameDto gameDto){
        return specifications.stream()
                .allMatch(specification -> specification.canGameStart(gameDto));
    }
}

class PlayerSpecification extends Specification {

    boolean canGameStart(GameDto gameDto) {
        PlayerDto playerDto = gameDto.playerDto();

        boolean isPlayerNotDefined = playerDto == null || playerDto.name() == null || playerDto.name().isEmpty();

        if (isPlayerNotDefined) {
            throw new UnsatisfiedSpecificationException("Player name is needed");
        }
        return true;
    }
}
