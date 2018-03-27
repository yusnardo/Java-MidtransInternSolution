import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Yusnardo
 */
public class Problem1 {
    boolean jalan;
    boolean nomor;
    boolean rt;
    boolean rw;
    boolean kota;
    
    public Problem1() {
        this.jalan = false;
        this.nomor=false;
        this.rt = false;
        this.rw=false;
        this.kota = false;
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);
        String input =in.readLine();

        Problem1 alamatPertama=new Problem1();
        alamatPertama.fillAddress(input);

        input=in.readLine();
        Problem1 alamatKedua=new Problem1();
        alamatKedua.fillAddress(input);

        Problem1.compare(alamatPertama,alamatKedua);
    }
    public void fillAddress(String input){
        if(input.contains("jln")||input.contains("Jalan")||input.contains("jl")||input.contains("Jl")||input.contains("JL")||input.contains("Jln")){
            this.jalan=true;
        }
        if(input.contains("NO.")||input.contains("no")||input.contains("nomor")||input.contains("Nomor")){
            this.nomor=true;
        }
        if(input.contains("Rt.")||input.contains("rt")||input.contains("RT.")){
            this.rt=true;
        }
        if(input.contains("Rw")||input.contains("rw")||input.contains("/")||input.contains("RW")){
            this.rw=true;
        }
        //Asumsi kota hanya Surabaya dan Jakarta
        if(input.contains("SBY")||input.contains("Jak")){
            this.kota=true;
        }
    }
    public static void compare(Problem1 pertama, Problem1 kedua){
        if(pertama.jalan==true&&kedua.jalan==true){
            System.out.print("Kedua alamat memiliki data nama jalan");
        }
        if(pertama.nomor==true&&kedua.nomor==true){
            System.out.print("Kedua alamat memiliki data nomor rumah");
        }
        if(pertama.rt==true&&kedua.rt==true){
            System.out.print("Kedua alamat memiliki data RT");
        }
        if(pertama.rw==true&&kedua.rw==true){
            System.out.print("Kedua alamat memiliki data RW");
        }
        if(pertama.kota==true&&kedua.kota==true){
            System.out.print("Kedua alamat memiliki data kota");
        }  
    }
}

