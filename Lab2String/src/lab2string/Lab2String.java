package lab2string;

public class Lab2String {

    public static void main(String[] args) {
        System.out.println(containDigit(""));
        System.out.println(containDigit("Hello world"));
        System.out.println(containDigit("Hello world5"));
    }

    public static boolean containDigit(String str) {
        boolean hasDigit = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) != false){
                hasDigit = true;
            }
        }
        return hasDigit;
    }

}
