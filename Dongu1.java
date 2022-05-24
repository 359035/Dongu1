/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dongu1;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;
public class Dongu1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int k,i=1,sayac=0,toplam=0;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Pozitif Sayi Giriniz");
        k=input.nextInt();
        
        while(i<=k){
            if(i%3==0&&i%4==0){
                System.out.println(i);
                sayac++;
                toplam+=i;
                i++;
                
            }else{
                i++;
            }
            
            
        }System.out.println("Ortalama:"+toplam/sayac);
        
    }
    
}
