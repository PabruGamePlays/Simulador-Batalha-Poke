package pokemon;

import java.util.Scanner;

public class Pokemon {

    private static int Poke1;
    private static int Poke2;
    
    public static void main(String[] args) {
        
        System.out.println("Bem-vindo ao simulador de batalha Pokemon \n");           
        
        Scanner SelectPoke = new Scanner (System.in); 
        
        
        
        //PRIMEIRO POKEMON
         System.out.println("Escolha o 1º Pokemon: \n");
         System.out.println("DIGITE -> 1 para Pikachu");
         System.out.println("DIGITE -> 2 para Charmander");
         System.out.println("DIGITE -> 3 para Bulbasaur");
         System.out.println("DIGITE -> 4 para Squirtle");
         
         Poke1 = SelectPoke.nextInt();
         
        switch (Poke1){
            case 1:
            Poke Pikachu = new Poke("Pikachu", "Eletrico", 0);
            break;
            
            case 2:
            Poke Charmander = new Poke("Charmander", "Fogo", 0);
            break;
            
            case 3:
            Poke Bulbasaur = new Poke("Bulbasaur", "Planta", 0);
            break;
            
            case 4:
            Poke Squirtle = new Poke("Squirtle", "Agua", 0);
            break;
                
                    default:
                    System.out.println("Pokemon Inexistente, recomece a simulação!");
                    return;
        }
        
        System.out.println("\n");
        
        //SEGUNDO POKEMON
        System.out.println("Escolha o 2º Pokemon: \n");
         System.out.println("DIGITE -> 1 para Pikachu");
         System.out.println("DIGITE -> 2 para Charmander");
         System.out.println("DIGITE -> 3 para Bulbasaur");
         System.out.println("DIGITE -> 4 para Squirtle");
         
         Poke2 = SelectPoke.nextInt();
         
        switch (Poke2){
            case 1:
            Poke Pikachu = new Poke("Pikachu", "Eletrico", 0);           
            break;
            
            case 2:
            Poke Charmander = new Poke("Charmander", "Fogo", 0);
            break;
            
            case 3:
            Poke Bulbasaur = new Poke("Bulbasaur", "Planta", 0);
            break;
            
            case 4:
            Poke Squirtle = new Poke("Squirtle", "Agua", 0);
            break;
                
                    default:
                    System.out.println("Pokemon Inexistente, recomece a simulação!");
                    return;
        }
                        
        System.out.println("PRIMEIRO Pokemon é: " + Poke1 + " e SEGUNDO Pokemon é: " + Poke2);
        System.out.println("\n");
        System.out.println("VAMOS BATALHAR!!!!!! \n");
        
                       
                //Batalha
            if (Poke1 > Poke2) {
                System.out.println("O pokemon vencedor é: " + Poke1 + "\n" + "PARABENS!!!! \n");
           }
            
       else {
            System.out.println("O Pokemon vencedor é: " + Poke2 + "\n" + "PARABENS!!!!\n");
            }
    
    }
}
