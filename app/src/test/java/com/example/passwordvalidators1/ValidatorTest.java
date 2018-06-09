package com.example.passwordvalidators1;


import org.junit.Test;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ValidatorTest {
    static boolean secure=true;
    static String pass="ABCDEFGH";
    static String lowp=pass.toLowerCase();

    static PasswordValidator Validator;

    @BeforeClass
    public static void init(){
        Validator=new PasswordValidator();
        Validator.setPass(lowp);
    }


    @Test
    public void passIsCorrect(){
    assertEquals(lowp, Validator.getPass());
    }
    //public void secureIsCorrect(){assertEquals(secure,Validator.getSecure());}

    //@Test
    // public void checkIsCorrect(){
     //   assertEquals(secure, Validator.passCheck());
    //}
}