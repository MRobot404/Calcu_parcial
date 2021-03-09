package com.mycompany.calcu_parcial;
public class Recursividad {
   public int Factorial(int parametro){
       if (parametro>0) {
       int valor = parametro * Factorial(parametro -1);
       return valor;       
       }
       return 1;
   }
    
}
