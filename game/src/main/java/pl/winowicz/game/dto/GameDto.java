package pl.winowicz.game.dto;

import lombok.Value;
import lombok.With;

@Value
@With
public class GameDto {

    PlayerDto playerDto;
    BoardDto boardDto;

}
