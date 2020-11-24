public class Demo {
    public static void main(String[] args) {
        int current = 100;
        int transfer = 1100;
        int bonus = 0;
        if (transfer>=1000) {
            current = transfer + current;
            bonus = bonus + transfer / 100;
        } else {
            current = transfer + current;
        }
        int total = bonus + current;

        System.out.println(bonus); System.out.println(current);System.out.println(total);
    }
}
