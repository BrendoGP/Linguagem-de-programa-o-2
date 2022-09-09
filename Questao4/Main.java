
package Questao4;
/* Aluno ifba : Brendo Gomes Prates
 * Github: BrendoGP
 * LP2: Primeira lista avaliativa (Questão 04)
 * observações em : Questao4.java ( no fim da classe )
 */
public class Main {
   public static void main(String[]args){
    
 //criando os objetos do tipo Filme(Movie)
    
 //Movie(String titulo , int minutos , boolean audio, boolean legendas);
  
    Movie f1 = new Movie("A noiva Cadaver", 77, true, true);
    Movie f2 = new Movie("Avatar", 161, false, false);
    Movie f3 = new Movie("O auto da Compadecida", 104, true, false);
    Movie f4 = new Movie("A Bela e a Fera", 84, false, true);
    Movie f5 = new Movie("A Casa de Cera", 113, true, true);
    
    Movie f6 = new Movie(); // instanciado os elementos 1 por 1 ; 
    f6.setTitulo("Sing 2");
    f6.setMinutos(110);
    f6.setAudio(true);
    f6.setLegendas(false);
    
  
    
   // Descrição detalhada dos filmes:
   
       System.out.println("------------------------------------------------------------------------");
       System.out.println("                       @@@ LISTA DE FILMES @@@");
       System.out.println("------------------------------------------------------------------------");
       
       System.out.println("Filme 1:"); // Dados do Movie 1
         System.out.println(f1.getDescricao() + " / " + f1.getOnOffAudio() + " / "+f1.getOnOffLegendas());
          System.out.println("------------------------------------------------------------------------");
         
       System.out.println("Filme 2:"); // Dados do Movie 2
         System.out.println(f2.getDescricao() + " / " + f2.getOnOffAudio() + " / "+f2.getOnOffLegendas());
          System.out.println("------------------------------------------------------------------------");
          
       System.out.println("Filme 3:"); // Dados do Movie 3
         System.out.println(f3.getDescricao() + " / " + f3.getOnOffAudio() + " / "+f3.getOnOffLegendas());
          System.out.println("------------------------------------------------------------------------");
          
       System.out.println("Filme 4:"); // Dados do Movie 4
         System.out.println(f4.getDescricao() + " / " + f4.getOnOffAudio() + " / "+f4.getOnOffLegendas());
          System.out.println("------------------------------------------------------------------------");
          
       System.out.println("Filme 5:"); // Dados do Movie 5
         System.out.println(f5.getDescricao() + " / " + f5.getOnOffAudio() + " / "+f5.getOnOffLegendas());
          System.out.println("------------------------------------------------------------------------");
          
       System.out.println("Filme 6:"); // Dados do Movie 6
         System.out.println(f6.getDescricao() + " / " + f6.getOnOffAudio() + " / "+f6.getOnOffLegendas());
         
       System.out.println("------------------------------------------------------------------------");
       
    
    //media ( calculo feito para calcular a média dos filmes )
      // media = soma de todos os minutos / quantidade de variaveis no caso 6 ;
      
    int mediaFilmes;
    mediaFilmes = (( f1.getMinutos() + f2.getMinutos() + f3.getMinutos() +
            f4.getMinutos() + f5.getMinutos() + f6.getMinutos() ) / 6);
       
    //Mostrar os filmes com duração maior que a média dos filmes;
    
    System.out.println("*************************************************************");
   System.out.println("************** duração media dos filmes : " + (mediaFilmes/60) + 
                               " horas e "+ (mediaFilmes%60) +"minutos" );
   System.out.println("************** Filmes com duração maior que a média :");
    System.out.println("------------------------------------------------------------------------");
    if(f1.getMinutos() > mediaFilmes)                      // método para ver se é maior que a média !
         { System.out.println("* " + f1.getDescricao()); } 
       
     if(f2.getMinutos() > mediaFilmes)
         { System.out.println("* " + f2.getDescricao()); }
     
      if(f3.getMinutos() > mediaFilmes)
         { System.out.println("* " + f3.getDescricao()); }
      
       if(f4.getMinutos() > mediaFilmes)
         { System.out.println("* " + f4.getDescricao()); }
       
        if(f5.getMinutos() > mediaFilmes)
         { System.out.println("* " + f5.getDescricao()); }
       
        if(f6.getMinutos() > mediaFilmes)
         { System.out.println("* " + f6.getDescricao()); }
    
   System.out.println("------------------------------------------------------------------------");
    
}
 }

