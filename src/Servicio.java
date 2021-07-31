public class Servicio {
    public IFigura createShape(Figura figura){
        Figuras figuras= Figuras.Corazon;
        if(figuras==Figuras.Rayo){
            return figura;
        }else if (figuras==Figuras.Corazon){
            return figura;
        }else if (figuras==Figuras.Estrella){
            return figura;
        }
        return null;
    }
}
