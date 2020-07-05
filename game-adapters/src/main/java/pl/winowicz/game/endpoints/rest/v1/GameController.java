package pl.winowicz.game.endpoints.rest.v1;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.winowicz.game.domain.GameFacade;
import pl.winowicz.game.dto.PlayerDto;

@RestController
@RequestMapping("v1/game")
@RequiredArgsConstructor
class GameController {

    private final GameFacade gameFacade;

    @PostMapping("/start")
    public String startGame(@RequestBody PlayerDto playerDto) {
        return gameFacade.startGame(playerDto);
    }

}
