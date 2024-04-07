package Strategy;

public class ColoredFilter implements Filter {
    @Override
    public void apply(String filename) {
        System.out.println("Applying ColoredFilter to " + filename);
    }
}
