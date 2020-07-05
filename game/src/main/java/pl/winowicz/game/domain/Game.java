package pl.winowicz.game.domain;

import lombok.*;
import pl.winowicz.game.dto.GameDto;

@AllArgsConstructor
@Getter(AccessLevel.PACKAGE)
class Game {

    @Setter
    @With
    private String id;
    private final Player player;
    private final Board board;

    GameDto dto() {
        return new GameDto(player.dto(), board.dto());
    }


}
