package state;

public class Canvas {

    private Tools currentToolType;

    public void mouseDown(){
       currentToolType.mouseDown();
    }

    public void mouseUp(){
        currentToolType.mouseUp();
    }

    public Tools getCurrentToolType() {
        return currentToolType;
    }

    public void setCurrentToolType(Tools currentToolType) {
        this.currentToolType = currentToolType;
    }
}
