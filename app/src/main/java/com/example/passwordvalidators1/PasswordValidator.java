package com.example.passwordvalidators1;

public class PasswordValidator {
    private String pass="ABCDEFGH";
    private boolean secure=true;

    private String lowp=pass.toLowerCase();

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

        else
            return secure;

    }

}
