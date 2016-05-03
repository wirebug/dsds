package bla;

import java.security.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Encryption en = new Encryption();
        try {
            KeyPair kp = en.asymKeypair();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
