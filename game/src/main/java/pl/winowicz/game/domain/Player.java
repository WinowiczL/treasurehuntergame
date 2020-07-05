package pl.winowicz.game.domain;

import lombok.AllArgsConstructor;
import pl.winowicz.game.dto.PlayerDto;

@AllArgsConstructor
class Player {

    private final String name;

    PlayerDto dto() {
        return new PlayerDto(name);
    }


}
