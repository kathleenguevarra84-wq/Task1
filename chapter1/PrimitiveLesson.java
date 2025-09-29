package chapter1;

public class PrimitiveLesson {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        byte b = -128;
        short c = 32000;
        float pi = 3.14f;
        double d = 5.1D;
        long e = 56L;
        byte f = 0b101; //0b means binary, 101 is 5
        System.out.println(f);
        byte h = 0xA; //0x means hexadecimal, A is 10
        System.out.println(h);

        // you can have underscores in numbers to make them easier to read
        int million1 = 1_000_000;
        System.out.println(million1);

        long i = 5_____________6L;
        System.out.println(i);

        char ch = 65535; // only accepts positive numbers and zero, but it has range
        System.out.println (Character.MAX_VALUE);
        short sh = 'c';
        String emoji = "😀";
        System.out.println (Short.MAX_VALUE);
        System.out.println (sh);
        System.out.println (emoji);
    }
}
