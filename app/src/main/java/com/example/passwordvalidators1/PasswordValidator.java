package com.example.passwordvalidators1;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordValidator {
    private String pass="ABCDEFGH";
    private boolean secure=true;


    private String lowp=pass.toLowerCase();
    private String highp=pass.toUpperCase();

    public void setInfo(String p,boolean s){
        lowp=p;
        secure=s;
    }


    public String getPass() {
        return lowp;
    }

    public boolean getSecure(){
        return secure;
    }

    public boolean isSecure() {
        return passCheck();
    }


    public boolean passCheck() {
        if (lowp.length() < 8) {
            secure = false;
            return secure;
        }
        else if (lowp.equals("password")) {
            secure = false;
            return secure;
        }
        //15 or less
        else if(pass.length()>15){
            secure=false;
            return secure;
        }
        //contains a number
        else if(!(Pattern.compile("[0-9]").matcher(pass).find())){
            secure=false;
            return secure;
        }
        //capital letter check
        else if(!(Pattern.compile("[A-Z]").matcher(pass).find())){
            secure=false;
            return secure;
        }

        else
            return secure;

    }

}
