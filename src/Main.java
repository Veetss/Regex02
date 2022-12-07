public class Main {
    public static void main(String[] args) {
        String a = "tup tuup tuuup tuuuup";
        String b = a.replaceAll("[uu]{2,3}", "X");

        System.out.println(b);
    }
}