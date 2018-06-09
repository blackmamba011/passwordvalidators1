package com.example.passwordvalidators1;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordValidator {
    public String pass="";
    private boolean secure=true;


    public String lowp="";
    public String highp=pass.toUpperCase();

    public void setPass(String p) {
        this.pass=p;
        this.lowp=pass.toLowerCase();
    }

    public String getPass() {
        return pass;

    }

    public boolean getSecure(){
        return secure;
    }

    public boolean isSecure() {
        boolean s=passCheck(pass,lowp,secure);
        if(secure==true){
            return true;
        }
        else
            return false;
    }


    public boolean passCheck(String p1,String l1,boolean s) {
        if (p1.length() < 8) {
            this.secure = false;
            return this.secure;
        }
        else if (l1.equals("password")) {
            this.secure = false;
            return this.secure;
        }
        //15 or less
        else if(p1.length()>16){
            this.secure=false;
            return this.secure;
        }
        //contains a number
        else if(!(Pattern.compile("[0-9]").matcher(p1).find())){
            this.secure=false;
            return this.secure;
        }
        //capital letter check
        else if(!(Pattern.compile("[A-Z]").matcher(p1).find())){
            this.secure=false;
            return this.secure;
        }

        else if(!(Pattern.compile("[a-z]").matcher(p1).find())){
            this.secure=false;
            return this.secure;
        }

        
        else
            return this.secure;

    }

}
