public class Journalist implements Person{
    @Override
    public void express(Game game) {
        System.out.println("Journalist says: There is a game about " + game.info);
    }
}
