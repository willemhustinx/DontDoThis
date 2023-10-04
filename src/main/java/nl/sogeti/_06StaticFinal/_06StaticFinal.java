package nl.sogeti._06StaticFinal;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


@SuppressWarnings("ALL")
public class _06StaticFinal {
    public static void main(String args[]) throws Exception {
        new _06StaticFinal().run();
    }

    public void run() throws Exception {
        Afblijven afblijven = new Afblijven();
        afblijven.print();

        changePrivateField(afblijven, "Reflection is geweldig!");

        afblijven.print();
    }
    public class Afblijven {
        private String nietDoen = "Niet Doen";

        public void print(){
            System.out.println(nietDoen);
        }
    }










    private static void changePrivateField(Afblijven afblijven, String text) throws Exception {
        Field field = afblijven.getClass().getDeclaredField("nietDoen");
        field.setAccessible(true);
        field.set(afblijven, text);
    }


}

