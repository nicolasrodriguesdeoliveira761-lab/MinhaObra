package br.dev.nicolas.aplicativo;

/**
 * Representa o cĆ´modo de uma obra.
 * 
 * @author KGe
 */
public class Comodo {
   
    String nome;
    double largura;
    double comprimento;

    public Comodo() {
    }

    public Comodo(String nome, double largura, double comprimento) {
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
    }
    
        
    public double calcularArea() {
        
        return this.largura * this.comprimento;
        
    }

    @Override
    public String toString() {
        String aux = String.format("Comodo: %s | Largura: %10.2f | Comprimento: %10.2f | Area: %10.2f |\n",
                
                this.nome,
                this.largura,
                this.comprimento,
                this.calcularArea());
        return aux;
    }

    
    
    
    
    
}