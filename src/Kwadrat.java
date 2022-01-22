public class Kwadrat extends Figura{

    @Override
    double getPole(double x, double y) {
        return x*x;
    }

    @Override
    double getObwod(double x, double y) {
        return x*4;
    }
}
