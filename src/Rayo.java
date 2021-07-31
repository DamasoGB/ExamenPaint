import java.util.List;

public class Rayo extends Figura {
    private Rectangulo rectangulo;
    
    public void draw() {
        //TODO: Este metodo pinta la figura en el lienzo
        
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
        
        return (Figura)figuraSelected;
    }

    public Rectangulo getRectangulo(){
        return this.rectangulo;
    }
    
}
