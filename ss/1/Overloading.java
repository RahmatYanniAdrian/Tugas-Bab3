package OOPpraktikumBAB3;
import java.util.Scanner;
public class Overloading{
    
   
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        kelas ob = new kelas();
        System.out.print("masukan input angka: ");
        int input = in.nextInt();
        System.out.print("hasil konversinya  : ");
        ob.overloadingMeth(input);
        
        System.out.println("==========================");
        
        System.out.print("masukan input teks : ");
        String input2 = in.nextLine()+in.nextLine();
        System.out.print("hasil konversinya : ");
        ob.overloadingMeth(input2);
        
        
        
        
        
    }
}