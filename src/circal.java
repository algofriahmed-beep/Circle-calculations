public class circal {

    //the vars
    private double radius;

    // constructor
    circal(){}
    //the methods
    double circalArea(){return Math.pow(this.radius, 2) * Math.PI;}
    double circalCircumfirence(){return 2 * Math.PI *this.radius;}
    double circalVolum(){return (4.0/3.0) * Math.PI * Math.pow(radius, 3);}

    //get and set


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
