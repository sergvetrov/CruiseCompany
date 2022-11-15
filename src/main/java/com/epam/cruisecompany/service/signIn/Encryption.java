package com.epam.cruisecompany.service.signIn;

import org.jasypt.util.password.BasicPasswordEncryptor;

import java.security.SecureRandom;

public class Encryption {
    private static SecureRandom secureRandom = new SecureRandom();
    private static BasicPasswordEncryptor basicPasswordEncryptor = new BasicPasswordEncryptor();

    public static int generationSalt(){
        return secureRandom.nextInt();
    }

    public static String encryption(String password){
        return basicPasswordEncryptor.encryptPassword(password);
    }

    public static boolean checkPassword(String userPassword, String bdPassword){
        return  basicPasswordEncryptor.checkPassword(userPassword, bdPassword);
    }
}
