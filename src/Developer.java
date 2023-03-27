public class Developer implements Person{
    @Override
    public void express(Game game) {
        System.out.println("Developer says: I like this technical info - " + game.technical_info);
    }
}
