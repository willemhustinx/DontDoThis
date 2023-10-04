package nl.sogeti._06Private;

import java.lang.reflect.Field;


@SuppressWarnings("ALL")
public class _06Private {
    public static void main(String args[]) throws Exception {
        new _06Private().run();
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

