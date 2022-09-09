package Questao4;

/** Aluno ifba : Brendo Gomes Prates
 * Github: BrendoGP
 * Primeira lista avaliativa (Questão 04)*/

public class Movie {
    
  //Variáveis ( dados dos filmes )
    
    private String titulo ;
    private int minutos ;
    private boolean legendas, audio ;/** ----> por se tratarem de funções
     * (on/off) apenas duas opções achei interesante por em variáveis boolean
     * para armazenar. E adicionei metodos para estas decisões.*/
    
 //Construtores
    
  //Construtor para inciar as variáveis uma por uma !
   public Movie(){}
   
  //Construtor ja com as variáveis iniciadas !
   public Movie(String ti , int min ,  boolean aud , boolean leg){
   this.titulo = ti;
   this.minutos = min;
   this.audio = aud;
   this.legendas = leg;  
   
    }
   
 //metodos publicos 
 
  //Conversor do tempo de filme para horas e minutos !   
  public String getDuracaoHorasMinutos(){
      
  int h , m ; // h = horas , m = minutos
     h = (minutos / 60);      // 1 hora é igual a  60minutos;
     m = (minutos % 60);     // minutos restantes é o resto da divisão;
        return h + " horas e " + m + " minutos";
     
 /**da para usar double ao inves de int nas hrs e min e acrescentar um if else
   * para assim mostrar  as hrs só se tiver mais que 59min, 
   * (assim filmes que tem menos que 1 hr nao ficariam 0:59 por exemplo)
   * assim ficaria mais limpo mais por outro lado mais complexo, ja usando
   * int  o codigo fica mais limpo fora que é uma preocupação a menos 
   * (ja que com double tem que configurar os numeros depois da virgula)*/
  }
  
  //Método para retornar  nome e tempo de filme !
  
  public String getDescricao(){
    // retorna nome do filme + duração (ja convertida em horas e minutos).
      return "Nome do filme : " + getTitulo() +
             " / Duração do filme : " + getDuracaoHorasMinutos();
  } 
  
 //metodo da legenda (para mostrar se esta ou não legendado)
  
  public String getOnOffLegendas(){ 
  if(legendas == true)
  {
  return "com legendas";
  } 
  else{
  return "sem legendas";}
  }
  
  
 //metodo do áudio (para mostrar se é dublado ou original)
  
  public String getOnOffAudio(){ 
  if(audio == true)
  {
  return "audio original";
  }
  else{
  return "audio dublado";}
  }
  
  //Getters e Setters
    
    public String getTitulo() {
      return titulo;
    }
    public void setTitulo(String titulo) {
      this.titulo = titulo;
    }
    public int getMinutos(){
      return minutos;
    } 
    public void setMinutos(int minutos){
      this.minutos = minutos;
    }
    public boolean getAudio(){
      return audio;
    }
    public void setAudio(boolean audio){
      this.audio = audio;            
    }
    public boolean getLegendas(){
    return legendas;
    }
    public void setLegendas(boolean legendas){
    this.legendas = legendas;
    }
    
}
