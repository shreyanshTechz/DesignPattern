import Iterator.BrowseHistory;
import Iterator.Iterator;
import Strategy.*;
import momento.Editor;
import momento.History;
import state.BrushTool;
import state.Canvas;
import state.SelectionTool;

public class Main {
    public static void main(String[] args) {
        // Momento pattern
        var editor = new Editor();
        var history = new History();
        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        editor.restoreState(history.pop());
        editor.restoreState(history.pop());
        System.out.println(editor.getContent());

        // state pattern
        var canvas = new Canvas();
        var select_Tool = new SelectionTool();
        var brush = new BrushTool();
        canvas.setCurrentToolType(select_Tool);
        canvas.mouseDown();
        canvas.mouseUp();
        canvas.setCurrentToolType(brush);
        brush.mouseDown();
        brush.mouseUp();

        // iterator pattern
        var browse_History = new BrowseHistory();
        browse_History.push("Naughty America");
        browse_History.push("Hello world C++");
        browse_History.push("Hello world Java");

        Iterator iterator = browse_History.createIterator();
        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }


        // strategy
        var imageStorage = new ImageStorage();
        imageStorage.store("S",new pngCompressor(),new BlackWhite());
        imageStorage.store("S",new pngCompressor(),new ColoredFilter());
    }
}