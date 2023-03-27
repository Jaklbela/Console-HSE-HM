import java.util.ArrayList;
import java.util.List;

public class Console implements IConsole{
    public Console() {
        followers = new ArrayList<>();
    }

    @Override
    public void register(Person person) {
        followers.add(person);
    }

    @Override
    public void remove(Person person) {
        followers.remove(person);
    }

    @Override
    public void notifyPeople() {
        for (Person person: followers
             ) {
            person.express(newGame);
        }
    }

    public void newGameDropped(Game newGame) {
        this.newGame = newGame;
        notifyPeople();
    }

    private List<Person> followers;
    private Game newGame;
}
