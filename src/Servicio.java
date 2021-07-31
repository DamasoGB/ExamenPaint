public class Servicio {
    public IFigura createShape(Figura figura){
        Figuras figuras= Figuras.CORAZON;
        if(figuras==Figuras.RAYO){
            return figura;
        }else if (figuras==Figuras.CORAZON){
            return figura;
        }else if (figuras==Figuras.ESTRELLA){
            return figura;
        }
        return null;
    }
}
