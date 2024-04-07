package Iterator;

import java.util.ArrayList;
import java.util.List;




public class BrowseHistory {
    private List<String> urls = new ArrayList<String>();

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lastUrl = urls.getLast();
        urls.removeLast();
        return lastUrl;
    }

    public boolean isEmpty() {
        return urls.isEmpty();
    }

    public class ListIterator implements Iterator<String> {
        private int index ;
        private BrowseHistory history;
        public ListIterator(BrowseHistory history){
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }



}
