public class App {
    public static void main(String[] args) throws Exception {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixes p = new Peixes();
        Ave a = new Ave();
        Ave a2 = new Ave();
    
    
    
        a.locomover();
        a2.emitirSom();
        a.emitirSom(3);
        a2.emitirSom(7);
        m.emitirSom();
        r.emitirSom();
        p.soltarBolha();
     
    }
}
