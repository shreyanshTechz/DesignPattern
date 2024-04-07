package state;

public class SelectionTool implements Tools{

    @Override
    public void mouseDown() {
        System.out.println("Selection Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw Dashed Rectangle");
    }
}
