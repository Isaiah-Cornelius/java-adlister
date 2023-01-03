import java.util.*;

public class BeanTest {
    public static void main(String[] args) {
        Album album1 = new Album();
        album1.setId(1);
        album1.setArtist("Artist1");
        album1.setName("Album1");
        album1.setRelease_date(new Date(1990, 12, 11));
        album1.setSales((float) 1.1);
        album1.setGenre("Rock");

//        System.out.println("album1.getArtist() = " + album1.getArtist());

        Author author1 = new Author();
        author1.setId(1);
        author1.setFirstName("Ayy");
        author1.setLastName("Ason");

        System.out.println("author1.getId() = " + author1.getId());
        System.out.println("author1.getFirstName() = " + author1.getFirstName());
        System.out.println("author1.getLastName() = " + author1.getLastName());

        Quote quote1 = new Quote();
        quote1.setId(1);
        quote1.setAuthor(author1);
        quote1.setQuote("Quote 1");

        Quote quote2 = new Quote();
        quote2.setId(2);
        quote2.setAuthor(author1);
        quote2.setQuote("Quote 2");

        ArrayList <Quote> quotesArray = new ArrayList<>();
        quotesArray.add(quote1);
        quotesArray.add(quote2);

        for (int i = 0; i < quotesArray.size(); i++){
            System.out.println("quotesArray.get(i).getId() = " + quotesArray.get(i).getId());
            System.out.println("quotesArray.get(i).getAuthor().getFirstName() = " + quotesArray.get(i).getAuthor().getFirstName());
            System.out.println("quotesArray.get(i).getAuthor().getLastName() = " + quotesArray.get(i).getAuthor().getLastName());
            System.out.println("quotesArray.get(i).getQuote() = " + quotesArray.get(i).getQuote());
        }

    }
}
