package logicaNegocio;

public class Delfin extends Animal{
    
     TipoHabitat habitat = Delfin.getHabitat;

    @Override
    public String emitirSonido() {
        return "Chirrido";
    }

    @Override
    public String obtenerDieta() {
        return "Pescado";
    }
 
  
}

