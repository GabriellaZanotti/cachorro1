/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author senai
 */
public class Cachorro {
    String color;
    int idade;
    int peso;
    
    public Cachorro(String CachorroColor, int Cachorroidade, int Cachorropeso)
    {
        color= CachorroColor;
        idade= Cachorroidade;
        peso= Cachorropeso;
    }
    
    public static void main(String[] args) {
        Cachorro labrador = new Cachorro("amarelo", 1,27);
        Cachorro shitzu = new Cachorro ("blue", 2, 70);
    
        System.out.println(labrador.idade);
        System.out.println(shitzu.idade); 
    }    
}