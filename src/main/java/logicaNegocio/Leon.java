package logicaNegocio;

public class Leon extends Animal { 
    
    private TipoHabitat tipoHabitat = TipoHabitat.TERRESTRE;

    @Override
    public String emitirSonido() {
        return " Rugido";
    }

    @Override
    public String obtenerDieta() {
        return "Carnivoro";
    }
   
}
