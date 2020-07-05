package pl.winowicz.game.domain;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class InMemoryGameRepository implements GameRepository {

    private final Map<String, Game> games = new ConcurrentHashMap<>();

    @Override
    public Game findById(String gameId) {
        return (games.get(gameId));
    }

    @Override
    public String saveGame(Game game) {
        games.put(game.id(), game);
        return game.id();
    }

}
