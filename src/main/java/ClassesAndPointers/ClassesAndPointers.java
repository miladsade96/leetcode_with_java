package ClassesAndPointers;

public class ClassesAndPointers {
    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("blue");

        cookieOne.setColor("Red");
        cookieTwo.setColor("yellow");

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
    }
}
