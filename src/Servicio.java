public class Servicio {
    public Figura createShape(String figura){
        figura = figura.toUpperCase();
        
        if(figura.equals(Figuras.RAYO.name())){
            return new Rayo();
        }else if (figura.equals(Figuras.CORAZON.name())){
            return new Corazon();
        }else if (figura.equals(Figuras.ESTRELLA.name())){
            return new Estrella();
        }
        return null;
    }
}
