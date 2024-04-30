

public class Ave extends Animal {
    private String corPena;
    


  
    @Override
    public void locomover() {
      System.out.println("Voando");
    }
  
    @Override
    public void alimentar() {
      System.out.println("Comendo Frutas");
    }
  
    @Override
    public void emitirSom() {

      System.out.println("Som de Ave");
    }

     // Método sobrecarregado emitirSom
     public void emitirSom(int intensidade) {


        if (intensidade > 5) {
            System.out.println("Som de Ave alto!");
        } else {
            System.out.println("Som de Ave moderado.");
        }
    }



    
    
  
    public void fazerNinho() {
      System.out.println("Fazendo Ninho");
    }
  
    public String getCorPena() {
      return corPena;
    }
  
    public void setCorPena(String corPena) {
      this.corPena = corPena;
    }
  }