package Strategy;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String filename) {
        System.out.println(filename + ".Jpeg Compressor");
    }
}
