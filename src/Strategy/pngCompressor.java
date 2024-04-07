package Strategy;

public class pngCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println(fileName + ".png Compressor");
    }
}
