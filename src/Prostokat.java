public class Prostokat extends  Figura{

    @Override
    double getPole(double x, double y) {
        return x*y;
    }

    @Override
    double getObwod(double x, double y) {
        return (x*2) + (y*2);
    }
}
