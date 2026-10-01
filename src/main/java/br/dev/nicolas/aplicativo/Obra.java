package br.dev.nicolas.aplicativo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KGe
 */
public class Obra {
    
    String proprietario;
    String local;
    String cidade;
    String uf;
    
    List<Comodo> listaComodos = new ArrayList<>();

    public Obra() {
    }

    public Obra(String proprietario, String local, String cidade, String uf) {
        this.proprietario = proprietario;
        this.local = local;
        this.cidade = cidade;
        this.uf = uf;
    }
    
    public double calcularAreaTotal() {
        
        double areaTotal = 0;
        
        for (Comodo c : this.listaComodos) {
            areaTotal += c.calcularArea();
            // areaTotal = areaTotal + c.calcularArea();
        }
        
        return areaTotal;
        
    }

    @Override
    public String toString() {
        String aux = String.format("Dados da Obra: \n");
        aux += String.format("Propritario: %s | Local: %s | Cidade: %s | UF: %s | Area Total: %10.2f\n",
                this.proprietario,
                this.local,
                this.cidade,
                this.uf,
                this.calcularAreaTotal());
        
        
        for (Comodo c : this.listaComodos) {
            
            aux += c.toString();
            
        }
        
        return aux;
    }
    
    
    
}