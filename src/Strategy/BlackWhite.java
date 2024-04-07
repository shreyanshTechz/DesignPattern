package Strategy;

public class BlackWhite implements Filter{
    @Override
    public void apply(String filename) {
        System.out.println("Black White Filter to " + filename);
    }
}
