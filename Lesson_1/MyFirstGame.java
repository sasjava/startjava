public class MyFirstGame {
    
    public static void main(String[] args) {
        int number = 5;
        int min = 1;
        int max = 100;
        int variant = max / 2;
        int offset = max / 2;
        int count = 0;
        while (number != variant) {
            count++;
            if (offset > 1) {
                offset /= 2;
            }
            System.out.print("число " + variant);
            if (variant > number) {
                System.out.print(" больше");
                variant -= offset;
            } else if (variant < number) {
                System.out.print(" меньше");
                variant += offset;
            }
            System.out.println(" того, что загадал компьютер");
        }
        System.out.println("Вы победили! Компьютер загадал число " + number);
        System.out.println("Вы угадали за " + count + " попытки!");
    }
}