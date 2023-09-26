package nl.sogeti;

public class Smile {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.repeat("Hello ", 2);
        sb.repeat(0x1f600, 5);
        sb.repeat('!', 3);
        System.out.println(sb);

    }
}