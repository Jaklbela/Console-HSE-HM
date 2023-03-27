import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Console console = new Console();
        Person player = new Player();
        Person journalist = new Journalist();
        Person developer = new Developer();
        console.register(player);
        console.register(journalist);
        console.register(developer);
        Game game = new Game();
        game.name = "Dark Souls 3";
        List<String> achievements = new ArrayList<>();
        achievements.add("Know a flame");
        achievements.add("Judje Gundir");
        achievements.add("Light up a fireplace");
        game.achievements = achievements;
        game.info = "Dark Souls will continue to test players for strength in the new chapter of the famous series," +
                " which has collected many awards and defined the face of the genre." +
                " Gather your courage and plunge into the darkness!";
        game.technical_info = "ОС: Windows 7 SP1 64bit, Windows 8.1 64bit Windows 10 64bit\n" +
                "Процессор: Intel Core i3-2100 / AMD® FX-6300\n" +
                "Оперативная память: 4 GB ОЗУ\n" +
                "Видеокарта: NVIDIA® GeForce GTX 750 Ti / ATI Radeon HD 7950";
        console.newGameDropped(game);
    }
}