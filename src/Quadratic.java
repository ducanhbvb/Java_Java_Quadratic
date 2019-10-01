public class Quadratic {
    private double a,b,c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public void Quadratic(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDenta(){
        return this.b*this.b-4*this.a*this.c;
    }
    public double getX1(){
        return (-this.b+Math.sqrt(getDenta()))/(2*this.a);
    }
    public double getX2(){
        return (-this.b-Math.sqrt(getDenta()))/(2*this.a);
    }

}
