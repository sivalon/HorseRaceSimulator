public class Main {
    public static void main(String[] args) {
        // 1) Create your Horse instances
        Horse horse1 = new Horse('♘', "PIPPI LONGSTOCKING", 0.6);
        Horse horse2 = new Horse('♞', "KOKOMO", 0.7);
        Horse horse3 = new Horse('♖', "EL JEFE", 0.5);

        // 2) Create a Race of length 20
        Race race = new Race(20);

        // 3) Add each horse to its lane
        race.addHorse(horse1, 1);
        race.addHorse(horse2, 2);
        race.addHorse(horse3, 3);

        // 4) Start the race
        race.startRace();
    }
}
