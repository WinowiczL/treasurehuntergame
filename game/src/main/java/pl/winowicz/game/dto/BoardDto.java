package pl.winowicz.game.dto;

import lombok.Value;
import lombok.With;

import java.util.List;

@Value
@With
public class BoardDto {

    int width;
    int height;
    List<PositionDto> treasurePositionsDto;

}
