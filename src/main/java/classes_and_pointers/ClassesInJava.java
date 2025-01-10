package classes_and_pointers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClassesInJava {
    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("blue");

        cookieOne.setColor("Red");
        cookieTwo.setColor("yellow");

        log.info("Cookie one color: {}", cookieOne.getColor());
        log.info("Cookie two color: {}", cookieTwo.getColor());
    }
}
