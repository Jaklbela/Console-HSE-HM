public class Player implements Person{
    @Override
    public void express(Game game) {
        System.out.print("Player says: I like " + game.name + " and I've got achievements:");
        for (String ach: game.achievements
             ) {
            System.out.print(" " + ach + ",");
        }
        System.out.println();
    }
}
