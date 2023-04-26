package com.proyecto;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
        
public class Encrytar {
    
    public static void main(String[] args) {
       var codigo = new BCryptPasswordEncoder();
       var claveFiorella = codigo.encode("1234.");
       var clavePedro = codigo.encode("2458");
       var claveLucia = codigo.encode("34km;");
       
      System.out.println("Fiorella (1234.): "+claveFiorella);
      System.out.println("Pedro (2458): "+clavePedro);
      System.out.println("Lucia (32km;): "+claveLucia);
    }
}
