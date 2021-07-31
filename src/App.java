public class App {
    public static void main(String[] args) throws Exception {
        Figura corazon = new Corazon();
        Figura rayo = new Rayo();
        Figura estrella = new Estrella();

        Lienzo lienzo = new Lienzo();
        

        lienzo.Add(corazon, new Rectangulo(new Point(15, 56),new Point(87, 90)));
        lienzo.Add(rayo,  new Rectangulo(new Point(53, 84),new Point(120, 145)));
        lienzo.Add(estrella,  new Rectangulo(new Point(23, 12),new Point(35, 68)));
    }
}
