package Midtrans;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Yusnardo
 */
public class Problem3 {
    public static void main(String[] args) throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);
        String phoneNumber =in.readLine();
        if(phoneNumber.contains("-")){
            phoneNumber=phoneNumber.replace("", "");
        }
        if(phoneNumber.substring(0,1).equalsIgnoreCase("+")){
            phoneNumber=phoneNumber.replace("+","");
        }
        if(phoneNumber.substring(0,1).equalsIgnoreCase("0")&&phoneNumber.substring(1, phoneNumber.length())!=""){
            phoneNumber=phoneNumber.replace("0","62");
        }
        
        if(phoneNumber.contains("62")){
            phoneNumber=phoneNumber.replace("","");
        }
        if(phoneNumber.contains("null")){
            phoneNumber=phoneNumber.replace("","");
        }
        
        System.out.println(phoneNumber);
    }
}
