package pl.winowicz.game.domain;

interface GameRepository {

    String saveGame(Game game);

    Game findById(String gameId);



}
