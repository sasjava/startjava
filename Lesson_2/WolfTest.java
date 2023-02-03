public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setNickname("Белый клык");
        wolf.setGender('M');
        wolf.setWeight(20);
        wolf.setAge(9);
        wolf.setColor("Серый");
        System.out.println("Имя волка:\t" + wolf.getNickname());
        System.out.println("Пол:\t\t" + wolf.getGender());
        System.out.println("Вес:\t\t" + wolf.getWeight());
        System.out.println("Возраст:\t" + wolf.getAge());
        System.out.println("Окрас:\t\t" + wolf.getColor());
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}