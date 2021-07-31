import java.util.ArrayList;
import java.util.List;

public class Lienzo {
    List<Figura> figuras = new ArrayList<Figura>();

    public void Add (Figura figura, Rectangulo rectangulo){
        figuras.add(figura);
        
        IFigura ifigura = figura;
        ifigura.setColorFondo("Blanco");
        ifigura.setColorBordes("Negro");
        
        Selected figuraSelected = (Figura) figura; 
        figuraSelected.setSelected(rectangulo);
    }
}
