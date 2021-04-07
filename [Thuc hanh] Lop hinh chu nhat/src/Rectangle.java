public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    double getArea(){
        return this.height * this.width;
    }
    double getPerimeter(){
        return (this.height + this.width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println(rectangle);
    }
}
