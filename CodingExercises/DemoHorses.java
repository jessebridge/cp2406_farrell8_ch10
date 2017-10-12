public class DemoHorses {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();
        horse1.setHorseName("allah");
        horse1.setBirthYear(1990);
        horse1.setHorseColour("pink");
        horse2.setBirthYear(1948);
        horse2.setRaces(63);
        horse2.setHorseColour("blue");
        horse2.setHorseName("gary");
        System.out.println(horse1.getHorseName() + " is " + horse1.getHorseColour() + " and was born in " + horse1.getBirthYear());
        System.out.println(horse2.getHorseName() + " is " + horse2.getHorseColour() + " and was born in " + horse2.getBirthYear() + " and has raced " + horse2.getRaces() + " times");
    }


}
