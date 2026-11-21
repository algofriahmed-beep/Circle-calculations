public class circle {

    //the vars
    private double radius;

    // constructor
    circle(){}
    //the methods
    double circalArea(){return 2 * Math.PI *this.radius;}
    double circalCircumfirence(){return Math.pow(this.radius, 2) * Math.PI;}
    double circalVolum(){return (4.0/3.0) * Math.PI * Math.pow(radius, 3);}

    //get and set
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
