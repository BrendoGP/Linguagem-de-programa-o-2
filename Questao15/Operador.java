
package Questao15;

/** Aluno ifba : Brendo Gomes Prates
 * Github: BrendoGP
 * LP2: Primeira lista avaliativa (Questão 15).
 */

public class Operador {
 

  // metodo estático ( da para instanciar sem precisar criar um objeto da class) 
  static double operar(double numero1 , double numero2 , char sinal){
    
   // try: monitorar para ver se a alguma exceção   
    try{
    
   //pega o  caracter informado pelo usuário e o aplica em casos
    switch(sinal){
        
   // Caso de soma  
     case  '+' -> {
          return numero1 + numero2 ; // break; ñ foi possivel usar
             }
      
   // Caso de subtração 
     case '-' -> {
          return numero1 - numero2 ;
             }
      
   // Caso de multiplicação   
     case '*' -> {
          return numero1 * numero2 ;
             }
      
   // Caso de divisão    
     case '/' -> {
           return numero1 / numero2 ;
             }
       
   // Caso as outras obções não forem iniciada   
     default -> 
      throw new Exception(); // gerando uma exceção  caso o sinal esteja errado
    
    }
     }
    
   /** //captura uma exceção de erro aritmédico
        catch(ArithmeticException ex)  // Capturando a exceção aritmédica
     {
        System.out.println("Ops: alguma operação aritmética é inválida :( ");
     } */
    
    // captura qualquer exceção 
       catch(Exception ex)  // Capturando as exceções
     {
     System.out.println("sinal informado pode estar errado !!!");
              System.out.println("esta incorreta a seguinte operação: ");
     } 
     
     return 0f; // retorna 0 caso nenhuma auternativa de certo
     // não deu para retornar null , e o break não foi possivel utilizar
    
 }
 
 
    
}
