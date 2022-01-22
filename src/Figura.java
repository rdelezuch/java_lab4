abstract class Figura {

    abstract double getPole(double x, double y);
    abstract double getObwod(double x, double y);

    public String nazwaFigury(String figura) {
        return "To jest figura: " + figura;
    }
}
