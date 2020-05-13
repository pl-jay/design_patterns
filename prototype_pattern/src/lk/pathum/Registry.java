package lk.pathum;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<ItemTypes, Item> items = new HashMap<ItemTypes, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(ItemTypes type) {
        Item item = null;
        try {
            item = (Item) (items.get(type).clone());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {

        Movie movie = new Movie();
        movie.setPrice(25.99);
        movie.setTitle("Star Wars");
        movie.setRuntime("220 min");
        items.put(ItemTypes.MOVIE,movie);

        Book book = new Book();
        book.setTitle("Lord of The Rings");
        book.setNumberOfPages(1500);
        book.setPrice(45.99);
        items.put(ItemTypes.BOOK, book);

    }

}
