package core.basesyntax;

public class HelloWorld {
    public static void main(final String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier fs = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i <= 2) {
                figures[i] = fs.getRandomFigure();
            } else {
                figures[i] = fs.getDefaultFigure();
            }
        }
        for (final Figure f : figures) {
            f.draw();
        }
    }
}
