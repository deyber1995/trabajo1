package Trabajofuncion;

public class Trabajofuncion{
public static void main(String[] args) {
        
        
    
    double p = 0,n=-5.5;
    int i;
    
    for(i=1;i<=20;i++)
    {
        
        System.out.print("Cuando X="+n+"\t\t");
        p=(double)Math.pow(2.7182,n)*n;
        
        System.out.print("Funcion= ");
        
        System.out.print(java.lang.Math.sin(p));
        System.out.println("");
        
        
        n=n-(-0.5);
    }
    
    
    
    
    
    }
    
}
