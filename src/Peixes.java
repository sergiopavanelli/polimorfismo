public class Peixes extends Animal {
    private String corEscama;
  
    @Override
    public void locomover() {
      System.out.println("Nadando");
    }
  
    @Override
    public void alimentar() {
      System.out.println("Comendo Substâncias");
    }
  
    @Override
    public void emitirSom() {
      System.out.println("Não faz som");
    }
  
  
    public void soltarBolha() {
      System.out.println("Soltando bolha");
    }
  
    public String getCorEscama() {
      return corEscama;
    }
  
    public void setCorEscama(String corEscama) {
      this.corEscama = corEscama;
    }
  }