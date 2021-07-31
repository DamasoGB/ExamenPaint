public abstract class Figura implements IFigura, Selected {
    private String colorFondo;
    private String colorBordes;
    private String forma;

    public void setColorFondo(String colorFondo){
        this.colorFondo=colorFondo;
    }
    public String getColorFondo(){
        return this.colorFondo;
    }

    public void setColorBordes(String colorBordes){
        this.colorBordes=colorBordes;
    }
    public String getColorBordes(){
        return this.colorBordes;
    }
    
    public void setForma(String forma){
        this.forma=forma;
    }
    public String getForma(){
        return this.forma;
    }


}
