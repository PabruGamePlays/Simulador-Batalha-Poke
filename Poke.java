package pokemon;

import java.util.Random;

    public class Poke {
    //Atributos
    private String nome;
    private String tipo;
    private double vida = 200;
    private double defesa;
    private double ataque;
    double poder;
    
    //metodo para conseguir o level aleatorio
    Random aleatorio = new Random();
    int level = aleatorio.nextInt(100) + 50;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getDefesa() {
        return defesa;
    }
    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }
    public double getAtaque() {
        return ataque;
    }
    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public double getPoder() {
        return poder;
    }
    public void setPoder(double poder) {
        this.poder = poder;
    }
    
    //Construtor
    public Poke(String nome, String tipo, double poder ) {
        this.nome = nome;
        this.tipo = tipo;  
        this.poder = poder;
                        
        calculaAtributos();
        calculaLevel();
        imprimeAtributos();
    }
       
    //Métodos
    
    //Forma de calcular os atributos do Pokemon
    public void calculaLevel(){
        vida = vida + (level / 2);
        ataque = ataque + (level / 3);
        defesa = defesa + (level / 4);
        
        poder = defesa + ataque + vida;
    }
    
    //Mostra os pokemons e seus detalhes
    private void imprimeAtributos(){
    System.out.println("Nome: "+ this.nome + " | " + "Tipo: " + this.tipo + " | " + 
            "Vida: " + this.vida + " | " + "Level: " + this.level + " | " +
            "Defesa: " + this.defesa + " | " + "Ataque: " + this.ataque + " | " 
            + "Poder: " + this.poder + "\n");
    }
    
    private void calculaAtributos(){        
        switch(this.tipo){
            case "Fogo":
                this.ataque = 100; 
                this.defesa = 50;
                this.vida = this.vida + 35;
            break;
            
            case "Agua":
                this.ataque = 80; 
                this.defesa = 70;
                this.vida = this.vida + 35;
            break;
            
            case "Eletrico":
                this.ataque = 70; 
                this.defesa = 100;
                this.vida = this.vida + 35;
            break;
            
            case "Planta":
                this.ataque = 80; 
                this.defesa = 70;
                this.vida = this.vida + 35;
            break;
        }
    }   
    
}
