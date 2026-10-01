package br.dev.nicolas.aplicativo;

import java.util.Scanner;

/**
 *
 * @author KGe
 */
public class Aplicativo {
    
    
    public static void main(String[] args) {
        
        Scanner tecladoNumerico = new Scanner(System.in);
        Scanner tecladoTexto = new Scanner(System.in);
        
        // Entrada de Dados
        // Pedir os dados da obra
        
        Obra minhaObra = new Obra();
        System.out.println("-".repeat(20));
        System.out.printf("AppObra\n");
        System.out.println("-".repeat(20));
        
        System.out.printf("\nInforme Dados da Obra\n\n");
        System.out.printf("Proprietario: ");
        minhaObra.proprietario = tecladoTexto.nextLine();
        
        System.out.printf("Local       : ");
        minhaObra.local = tecladoTexto.nextLine();
        
        System.out.printf("Cidade      : ");
        minhaObra.cidade = tecladoTexto.nextLine();
        
        System.out.printf("UF          : ");
        minhaObra.uf = tecladoTexto.nextLine();
        //
        // Pedir os comodos da obra enquanto nome comodo != ""
        // 
        
        System.out.println("-".repeat(20));
        System.out.printf("Dados dos Comodos\n");
        System.out.println("-".repeat(20));
        
        Comodo comodoAuxiliar;
        
        do {
            
             comodoAuxiliar = new Comodo();
             System.out.printf("Nome Comodo: ");
             comodoAuxiliar.nome = tecladoTexto.nextLine();
             
             if (comodoAuxiliar.nome.isBlank() ) {
            
                 break;
             
             }
             
            System.out.printf("Largura    : ");
            comodoAuxiliar.largura = tecladoNumerico.nextDouble();

            System.out.printf("Comprimento: ");
            comodoAuxiliar.comprimento = tecladoNumerico.nextDouble();

            // Adicionar na lista de comodos da Obra
            minhaObra.listaComodos.add(comodoAuxiliar);
            
        } while (  true );

        
        // SaÃ­da de Dados
        // Mostrar os dados da Obra e os dados dos comodos.
        System.out.println( minhaObra.toString() );

    }
}