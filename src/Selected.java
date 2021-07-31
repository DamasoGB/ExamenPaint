import java.util.List;

public interface Selected {
    public void setSelected(Rectangulo rectangulo);
    public Figura getSelected(Point point,List<Figura> lista);
    public Rectangulo getRectangulo();
}
