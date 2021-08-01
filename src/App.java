public class App {
    public static void main(String[] args) throws Exception {
        Servicio servicio = new Servicio();
        Lienzo lienzo = new Lienzo();
        
        
        Figura figura1 = servicio.createShape("corazon");
        lienzo.Add(figura1, new Rectangulo(new Point(15, 56),new Point(87, 90)));
        figura1.setColorFondo("Rojo");
        figura1.setColorBordes("Negro");

        Figura figura2 = servicio.createShape("rayo");
        lienzo.Add(figura2,  new Rectangulo(new Point(53, 84),new Point(120, 145)));
        figura2.setColorFondo("Amarillo");
        figura2.setColorBordes("Negro");
        
        Figura figura3 = servicio.createShape("estrella");
        lienzo.Add(figura3,  new Rectangulo(new Point(23, 12),new Point(35, 68)));
        figura3.setColorBordes("Amarillo");

        Point puntero = new Point(20, 62);
        Figura figuraSeleccionada = figura1.getSelected(puntero,lienzo.figuras);

        
        System.out.println("Figura seleccionada: "+figuraSeleccionada.getForma()+"\nColor Fondo: "+figuraSeleccionada.getColorFondo()+"\nColor Bordes: "+figuraSeleccionada.getColorBordes());
        figuraSeleccionada.setColorBordes("Rosa");
        figuraSeleccionada.setColorFondo("Verde");
        System.out.println("Cambios: Color Fondo: "+figuraSeleccionada.getColorFondo()+" Color Bordes: "+figuraSeleccionada.getColorBordes());
    }
}
