package com.gdx.encapsulation;
import java.lang.String;


public class atm {
    int acc_number;
    String password;
    int acc_money;

    public void setAcc_number(int acc_number){
        String account = String.valueOf(acc_number);
        if(account.length()== 5){
           this.acc_number = acc_number;
        }else{
            System.out.println("Not Correct");
        }
    }

    public void setPassword(String password){
        int upper = 0;
        int lower = 0;
        int special = 0;
        for(int i = 0; i< password.length(); i++){
            char c = password.charAt(i);
            if(c<='Z'&& c>='A'){
                upper++;
            } else if(c<='z'&& c>'a'){
                lower++;
            }else {
                special++;
            }
        }
        if(upper<1 || lower<1 || special>0){
            System.out.println("This password is invalid");
        }else{
            this.password = password;
        }
    }

    public void setAcc_money(int money){
        if(money<1000){
            this.acc_money = money;
        }else{
            System.out.println("Not Acceptable");
        }
    }
    public void atm(int acc_number, String password, int acc_money){
        this.setAcc_number(acc_number);
        this.setPassword(password);
        this.setAcc_money(acc_money);
    }

}
