/**
 *
 * @author Yusnardo
 */
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[]args){ 
        Scanner in = new Scanner(new InputStreamReader(System.in));
        CustomerName customer = new CustomerName();
        int length = in.nextInt();
        for(int i=0;i<length;i++){
            String a= in.nextLine();
            String[]b= a.split(" ");
            if(b[0].equalsIgnoreCase("add")){
                String inputAdd=b[1];
                customer.add(inputAdd);
            }
            else if (b[0].equalsIgnoreCase("find")){
                String find= b[1];
                customer.find(find);
            }
        }
    }
}
class CustomerName{
    private ArrayList<String> customer;
    public CustomerName(){
	this.customer = new ArrayList<String>();
    }
    public ArrayList<String> getCustomer() { //getFunction for customer
		return customer;
	}
    public void setCustomer(ArrayList<String> customer) { //setFunction for customer
	this.customer = customer;
    }
    public void add(String a){
	customer.add(a);
    }
    public void find(String a){
	int count = 0;
	for(int i = 0; i < customer.size(); i++){
            if(customer.get(i).substring(0,a.length()).equalsIgnoreCase(a)){
		count++;
            }
	}
	if(count > 1){
            System.out.println(count + " # because there are " + count + " names started with '" + a + "'");			
	} else {
            System.out.println(count + " # because there is " + count + " names started with '" + a + "'");
	}
    }
}
