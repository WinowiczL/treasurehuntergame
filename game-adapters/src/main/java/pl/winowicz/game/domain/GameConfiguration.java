package pl.winowicz.game.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class GameConfiguration {

    @Bean
    GameFacade gameFacade() {
        InMemoryGameRepository repository = new InMemoryGameRepository();

        return new GameFacade(
                repository,
                new GameService(repository,
                        new GameFactory(),
                        new GameSpecificationFactory().defineGameSpecification())
        );
    }
}
