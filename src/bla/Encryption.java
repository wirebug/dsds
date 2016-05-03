package bla; /**
 * Created by Developer on 30.04.2016.
 */
import java.security.*;
import javax.crypto.*;

public class Encryption {
    private Key key;

    public Key symKey(String option) throws Exception{
        // get a DES private key
        KeyGenerator keyGen;
        System.out.println("\nStart generating DES key");
        if (option == "DES") {
            keyGen = KeyGenerator.getInstance("DES");
        } else {
            keyGen = KeyGenerator.getInstance("AES");
        }
        keyGen.init(56);
        Key key = keyGen.generateKey();
        System.out.println("Finish generating DES key");

        return key;
    }

    public KeyPair asymKeypair() throws Exception{
        System.out.println("\nStart generating RSA key");
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(1024);
        KeyPair key = keyGen.generateKeyPair();
        System.out.println("Finish generating RSA key");

        System.out.println(key);
        return key;


    }
/*
    public void asymEncyription(KeyPair key) throws Exception{
        // get an RSA cipher object and print the provider
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        System.out.println("\n" + cipher.getProvider().getInfo());
        // encrypt the plaintext using the public key
        System.out.println("\nStart encryption");
        cipher.init(Cipher.ENCRYPT_MODE, key.getPublic());
        byte[] cipherText = cipher.doFinal(plainText);
        System.out.println("Finish encryption: ");
        System.out.println(new String(cipherText, "UTF8"));

    }

    public void asymDecryption(KeyPair key) throws Exception{
        // get an RSA cipher object and print the provider
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        System.out.println("\n" + cipher.getProvider().getInfo());
        // decrypt the ciphertext using the private key
        System.out.println("\nStart decryption");
        cipher.init(Cipher.DECRYPT_MODE, key.getPrivate());
        byte[] newPlainText = cipher.doFinal(cipherText);
        System.out.println("Finish decryption: ");
        System.out.println(new String(newPlainText, "UTF8"));
    }

}

    public void symEncyrption (Key key) throws Exception throws Exception{
        // get a DES cipher object and print the provider
        Cipher cipher=Cipher.getInstance("DES/ECB/PKCS5Padding");
        System.out.println("\n"+cipher.getProvider().getInfo());
        //
        // encrypt using the key and the plaintext
        System.out.println("\nStart encryption");
        cipher.init(Cipher.ENCRYPT_MODE,key);
        byte[]cipherText=cipher.doFinal(plainText);
        System.out.println("Finish encryption: ");
        System.out.println(new String(cipherText,"UTF8"));
        }
        public void symDEcyrption (Key key) {
            // get a DES cipher object and print the provider
             Cipher cipher=Cipher.getInstance("DES/ECB/PKCS5Padding");
            System.out.println("\n"+cipher.getProvider().getInfo());
            //
        // decrypt the ciphertext using the same key
        System.out.println( "\nStart decryption" );
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] newPlainText = cipher.doFinal(cipherText);
        System.out.println( "Finish decryption: " );

        System.out.println( new String(newPlainText, "UTF8") );
    }

    public Signature sign(KeyPair key) throws Exception{
        // get a signature object using the MD5 and RSA combo
        // and sign the plaintext with the private key,
        // listing the provider along the way
        Signature sig = Signature.getInstance("MD5WithRSA");
        //Signature sig = Signature.getInstance("SHA1WithRSA");
        sig.initSign(key.getPrivate());
        sig.update(plainText);
        byte[] signature = sig.sign();
        System.out.println( sig.getProvider().getInfo() );
        System.out.println( "\nSignature:" );
        System.out.println( new String(signature, "UTF8") );
        //
        // verify the signature with the public key
        System.out.println( "\nStart signature verification" );
        sig.initVerify(key.getPublic());
        sig.update(plainText);
        try {
            if (sig.verify(signature)) {
                System.out.println( "Signature verified" );
            } else System.out.println( "Signature failed" );
        } catch (SignatureException se) {
            System.out.println( "Signature failed" );
        }
    }
*/

}
