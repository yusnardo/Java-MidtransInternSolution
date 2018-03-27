import java.util.ArrayList;
/**
 *
 * @author Yusnardo
 */
public class Problem4 {
    String name;
    int origin,destination;
    
    public Problem4(String name,int origin,int destination){
        this.name=name;
        this.origin=origin;
        this.destination=destination;
    }
    public static void main(String[]args){
        int cost=0;
        boolean isEnter=true,isExit=false;
        
        Problem4 p1=new Problem4("p1",1,5);
        Problem4 p2=new Problem4("p2",2,3);
        Problem4 p3=new Problem4("p3",2,4);
        Problem4 p4=new Problem4("p4",3,4);
        Problem4 p5=new Problem4("p5",3,1);
        Problem4 p6=new Problem4("p6",5,1);
        
        Problem4[]people={p1,p2,p3,p4,p5,p6};
        ArrayList<String> start=new ArrayList<>();
        ArrayList<String> end=new ArrayList<>();
        
        for(int i=1;i<=5;i++){
            for(int j=0;j<people.length;j++){
                if(people[j].origin==i){
                    start.add(people[j].name);
                    isEnter=true;
                }
                else if(people[j].destination==i&&people[j].origin<people[j].destination){
                    end.add(people[j].name);
                    isExit=true;
                }               
            }
            if(isEnter==true||isExit==true){
                cost+=2;
            }  
            cost++;
        }
        for(int i=5;i>=1;i--){
            for(int j=0;j<people.length;j++){
                //disembark
                if(people[j].destination==i&&people[j].origin>people[j].destination){
                    end.add(people[j].name);
                }
            }
            cost++;
        }   
        System.out.println("Cost : "+cost);
        System.out.print("Embark orders : ");
        for(int i=0;i<start.size();i++){
            System.out.print(start.get(i)+" , ");
        }

        System.out.print("\nDisembark orders : ");

        for(int i=0;i<end.size();i++){
            System.out.print(end.get(i)+" , ");
        }
    }
}
