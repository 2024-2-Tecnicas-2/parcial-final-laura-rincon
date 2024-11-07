package logicaNegocio;

public class Perro extends Animal implements Domestico{

    @Override
    public String emitirSonido() {
       return "Ladrido";
    }

    @Override
    public String obtenerDieta() {
        return "Omnivoro";
    }
    
}
