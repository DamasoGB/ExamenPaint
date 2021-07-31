import java.util.List;

public class Lienzo {
    public void Add (IFigura figura,List<IFigura> lista, String colorFondo, String colorBordes, Point pointX, Point pointY){
        lista.add(figura);
        
        figura.setColorFondo(colorFondo);
        figura.setColorBordes(colorBordes);
        
        Selected figuraSelected = (Figura) figura; 
        Rectangulo rectangulo = new Rectangulo(pointX, pointY);
        figuraSelected.setSelected(rectangulo);
        
    }
}
