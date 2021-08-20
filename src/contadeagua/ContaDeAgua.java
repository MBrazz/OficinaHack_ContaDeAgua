/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadeagua;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class ContaDeAgua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaro variavel para calcular o valor da conta de água (1000L de quantAgua = 2% do salarioMinimo)
        float valorConta = 0;
        
        // Entrada: Obtendo a 1º informação do usuário
        Scanner lerSalario = new Scanner(System.in);
        
        // Saída: Solicitando informações ao usuário 
        System.out.println("Informe o salário mínimo: ");
        
        // Declaro o tipo de variavel para a 1º informação de Entrada
        float salarioMinimo = lerSalario.nextFloat();
        
        // Entrada: Obtendo a 2º informação do usuário
        Scanner lerAgua = new Scanner(System.in);
        
        // Saída: Solicitando informações ao usuário 
        System.out.println("Informe a quatidade de água gasta no mês: ");
        
        // Declaro o tipo de variavel para a 2º informação de Entrada
        float quantAgua = lerAgua.nextFloat();
        
        // Condição: Se quantAgua (Quantidade de água gasta no mês) for MENOR ou IGUAL a 500 então:
        if (quantAgua <= 500){
            valorConta = (salarioMinimo * 0.01f);
        
        // Condição: Se quantAgua (Quantidade de água gasta no mês) for MENOR ou IGUAL a 1000 então:
        } else if (quantAgua <= 1000) {
            valorConta = (salarioMinimo * 0.02f);
        }
        
        // Condição: Se quantAgua (Quantidade de água gasta no mês) for MENOR ou IGUAL a 1500 então:
        else if (quantAgua <= 1500) {
            valorConta = (salarioMinimo * 0.03f);
        }
        
        // Condição: Se quantAgua (Quantidade de água gasta no mês) for MENOR ou IGUAL a 2000 então:
        else if (quantAgua <= 2000) {
            valorConta = (salarioMinimo * 0.04f);
        }
        
        // Condição: Se quantAgua (Quantidade de água gasta no mês) for MENOR ou IGUAL a 2500 então:
        else if (quantAgua <= 2500) {
            valorConta = (salarioMinimo * 0.05f);
        }
        
        // Condição: Se quantAgua (Quantidade de água gasta no mês) for MENOR ou IGUAL a 3000 então:
        else if (quantAgua <= 3000) {
            valorConta = (salarioMinimo * 0.06f);
        }
        
        // Declaro variavel para calcular desconto de 15% da conta a ser paga
        float descontoConta = valorConta * 0.15f;
        
        // Saída: Resultado do calculo: valorConta 
        System.out.println("O valor da conta de água é aproximadamente: " + valorConta);
        
        // Saída: Resultado do calculo: descontoConta
        System.out.println("O valor a ser pago com um desconto de 15% é aproximadamente: " + descontoConta);
        
    }
    
}
