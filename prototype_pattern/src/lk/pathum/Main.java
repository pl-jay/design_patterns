package lk.pathum;

public class Main {

    public static void main(String[] args) {
	    Registry registry = new Registry();
	    Movie movie = (Movie)registry.createItem(ItemTypes.MOVIE);
        movie.setTitle("Jhon Wick");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie)registry.createItem(ItemTypes.MOVIE);
        anotherMovie.setTitle("Star Wars");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getUrl());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getPrice());

        Book book = (Book)registry.createItem(ItemTypes.BOOK);
        System.out.println(book);
        System.out.println(book.getNumberOfPages());
        System.out.println(book.getPrice());
        System.out.println(book.getPrice());

    }
}
