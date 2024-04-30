public class App {
    public static void main(String[] args) throws Exception {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixes p = new Peixes();
        Ave a = new Ave();
    
    
    
        a.locomover();
        m.emitirSom();
        r.emitirSom();
        p.soltarBolha();
     
    }
}
