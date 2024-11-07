package logicaNegocio;

public class Delfin extends Animal{
    
    private TipoHabitat tipoHabitat = TipoHabitat.ACUATICO;



    @Override
    public String emitirSonido() {
        return "Chirrido";
    }

    @Override
    public String obtenerDieta() {
        return "Pescado";
    }
}

