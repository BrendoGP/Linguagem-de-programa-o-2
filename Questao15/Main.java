
package Questao15;
 
/** Aluno ifba : Brendo Gomes Prates
 * Github: BrendoGP
 * LP2: Primeira lista avaliativa (Questão 15).
 * observações em : Questao15.java;
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
public static void main( String [] args){
        
  // instanciando um objeto para poder ler as entradas do teclado     
  Scanner keyboard = new Scanner(System.in);
  
  // variavel usada na estrutura de repetição( do/while )
  boolean onOff = false;
  
  
  //menu para ajudar a reconhecer os operadores com seus caractéres
   System.out.println("--------------------------------------------------");
      System.out.println("              && Calculadora &&                   ");
 System.out.println("as operações a serem realizadas estão de acordo com o sinal");
      System.out.println("");
      System.out.println("         Operação / Caractere Indicador           ");
      System.out.println("           Soma              +          ");
      System.out.println("         Subtração           -          ");
      System.out.println("         Multiplicação       *          ");
      System.out.println("         Divisão             /          ");
      System.out.println("--------------------------------------------------");
  
  // bloco try para capturar erros
  try{
           
  // método para poder fazer várias contas sem precisar fechar o programa
  do{
      
  // Pequeno menu  de inicio do programa
     System.out.println("-------------------------------------");
      System.out.println("Digite ( 1 ) para iniciar :)");
      System.out.println("Digite ( 2 ) para sair :(");
     System.out.println("------------------------------------");
      int entrada = keyboard.nextInt();// entrada do menu
      
      // pega a entrada do menu e o divide em opções
      switch(entrada){
          
      // caso o usuário digite 1 - inicia a calculadora    
       case 1:{
           
        System.out.println("digite o primeiro numero: ");
    double n1 = keyboard.nextDouble(); //primeiro numero da operação
    
        System.out.println("digite a operação a ser realizada: ");
    char s1 = keyboard.next().charAt(0); //char correspondente a operação
    
        System.out.println("digite o segundo numero : ");
    double n2 = keyboard.nextDouble();//segundo numero da operação
    
   //Instanciando as variáveis do metodo operar
     Operador.operar(n1, n2, s1);
     
   //Impressão do método operar
      System.out.println("--------------------------------------------------");   
      System.out.println("Resultado: "+ n1 + " " + s1 + " " + n2 + " = " 
                                                + Operador.operar(n1, n2, s1));
      System.out.println("--------------------------------------------------");   

             break; 
              }
             
      // caso o usuário digite 2 - encerra o switch bye bye :)
       case 2:
          onOff = true;  
           break;  
       
      //caso o usuário digite qualquer outro numero inteiro    
       default:
     System.out.println("valor informado incorreto !!!");
      // aparecera a mensagem e voltara denovo pro pequeno menu   
      }
      
  }
  // fim do (do/while) caso tenha a negação da variável (onOff)
  while(!onOff);
 
 }
 // captura de erro de inicialização de variavel não correspondente a esperada
  catch(InputMismatchException ex){
     System.out.println("Valor  digitado não  corresponde ao tipo esperado");}
  
  // mensagem de fim de programa
 System.out.println("Obrigado ;)");
  
}   
}
