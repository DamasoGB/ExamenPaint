import java.util.List;

public class Rayo extends Figura {
    private Rectangulo rectangulo;
    
    public void draw(Figura figura) {
        System.out.println("Figura: "+figura.getForma()+"\nColor Fondo: "+figura.getColorFondo()+"\nColor Bordes: "+figura.getColorBordes()+"\n");
    }

    
    public void setSelected(Rectangulo rectangulo) {
        
        this.rectangulo = rectangulo;
    }

    
    public Figura getSelected(Point point, List<Figura> lista) {
        Selected figuraSelected = this;
        
        for (Selected figuras: lista){
            if((figuras.getRectangulo().left<=point.x && figuras.getRectangulo().right>=point.x) && (figuras.getRectangulo().top<=point.y && figuras.getRectangulo().bottom>=point.y)){
                figuraSelected=figuras;
            }
        }
        System.out.println("Figura seleccionada: ");
        draw((Figura)figuraSelected);
        return (Figura)figuraSelected;
    }

    public Rectangulo getRectangulo(){
        return this.rectangulo;
    }
    
}
