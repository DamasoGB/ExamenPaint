public interface IFigura {
    public void setColorFondo(String colorFondo);
    public String getColorFondo();
    public void setColorBordes(String colorBordes);
    public String getColorBordes();
    public void setForma(String forma);
    public String getForma();

    public void draw(Figura figura);
}
