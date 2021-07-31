public class Rectangulo {
    public final int left;
    public final int right;
    public final int top;
    public final int bottom;
    public final int height;
    public final int width;

    Rectangulo (Point start, Point end){
        this.left = start.x;
        this.right = end.x;
        this.top = start.y;
        this.bottom = end.y;
        this.width = this.right - this.left;
        this.height = this.bottom - this.top;
    }
}
