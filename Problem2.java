import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author Yusnardo
 * Menurut saya data structure yang sebaiknya digunakan adalah union–find data structure.
 * Menurut saya algoritma yang seharusnya digunakan adalah Fuzzy c-Means.
 * A clustering algorithm organises items into groups based on a similarity criteria. 
 * The Fuzzy c-Means algorithm is a clustering algorithm 
 * where each item may belong to more than one group (hence the word fuzzy), 
 * where the degree of membership for each item is given by a probability distribution over the clusters.
 Sumber Penjelasan Fuzzy c-Means = https://github.com/gyaikhom/fcm 
 */
public class Problem2 {
    public static void main(String[]args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Customer customer = new Customer();
		
	String a;
	int id = 1;
        
	while ((a= in.readLine()) != null) {
            String[] input = a.split(",");
            Transaction x = new Transaction(id, input[1], input[2], input[3]);
            customer.add(x);
        }
    }
}
class Customer{
    private Transaction transaction;
    private ArrayList<Transaction> customer;
    private ArrayList<Transaction> listCustomer;
    public Customer(){
        
    }
    public Transaction getTransaction(){
	return transaction;
    }
    public void setTransaction(Transaction transaction){
	this.transaction = transaction;
    }
    public ArrayList<Transaction> getCustomer(){
	return customer;
    }
    public void setCustomer(ArrayList<Transaction> customer){
	this.customer = customer;
    }
    public void add(Transaction x){
	customer.add(x);
    }
    public void print(){
	for(int i = 0; i < customer.size(); i++){
            for(int j = 0; j < customer.size(); j++){
		if(customer.get(i).getEmail().equals(customer.get(j).getEmail()) || customer.get(i).getPhone().equals(customer.get(j).getPhone()) || customer.get(i).getCard().equals(customer.get(j).getCard())){
                    listCustomer.add(customer.get(i));					
		}
            }
	}
    }
}
class Transaction{
    private int id;
    private String email,phone,card;
    public Transaction(int id,String email,String phone,String card){
        this.setId(id);
	this.setEmail(email);
	this.setPhone(phone);
	this.setCard(card);
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getCard(){
        return card;
    }
    public void setCard(String card){
        this.card = card;
    }
}
