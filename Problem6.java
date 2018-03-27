import java.util.Scanner;
/**
 *
 * @author Yusnardo
 */
public class Problem6 {
    public static void Check(String inputFirst, String inputSecond){
        String a="",b= "",input=inputFirst+inputSecond,out="";
        String[]firstString=new String[inputFirst.length()];
        String[]secondString=new String[inputSecond.length()];
        
        for(int i=0;i<inputFirst.length();i++){
            firstString[i]=inputFirst.charAt(i)+"";
        }
        for(int j=0;j<inputSecond.length();j++){
            secondString[j]=inputSecond.charAt(j)+"";
        }
        for(int i = 0; i < firstString.length; i++){
            for(int j = 0; j < secondString.length; j++){
		if(firstString[i].equalsIgnoreCase(secondString[j])){
                    if(!a.contains(firstString[i])){
                        a += firstString[i];
                    }
                    if(a.contains(secondString[i])){
			a += secondString[i];
                    }
		}
            }
	}
        for(int i = 0; i < a.length(); i++){
            for(int j = 0; j < input.length(); j++){
		if(!a.contains(input.charAt(j) + "")){
                    if(!b.contains(input.charAt(j) + "")){
			b += input.charAt(j) + "";
                    }
		}
            }
	}
        for (int i = 0; i < b.length(); i++){
            if(out.length() > 0){
		out += "," + b.charAt(i);				
            } else 
		out += b.charAt(i) + "";							
	}
        String output = b.length() + "# removing " + out;
        System.out.println (output);
    }
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        String inputFirst=in.nextLine();
        String inputSecond=in.nextLine();
        
        Check(inputFirst,inputSecond);
    }
}
