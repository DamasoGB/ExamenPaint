import java.util.ArrayList;
import java.util.List;

public class Lienzo {
    public List<Figura> figuras = new ArrayList<Figura>();

    public void Add (Figura figura, Rectangulo rectangulo){
        
        IFigura ifigura = figura;
        ifigura.setColorFondo("Blanco");
        ifigura.setColorBordes("Negro");
        ifigura.setForma(figura.getClass().getName());
        
        Selected figuraSelected = (Figura) figura; 
        figuraSelected.setSelected(rectangulo);
        
        figuras.add(figura);
        figura.draw(figura);
    }
}
