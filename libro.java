class Book {
    String title;
    String author;
    int numberOfPages;
    String ISBN;
    
    Book(String tit, String aut, int num) {
        title = tit; author = aut;
        numberOfPages = num;
        ISBN = "unkown";
    }

    Book(String tit, String aut, int num, String isbn) {
        title = tit; author = aut;
        numberOfPages = num;
        ISBN = isbn;
    }  
}

class libro {
    public static void main (String [] args) {
        Book b1, b2;
        
        b1= new Book("Thinking in Java", "Bruce Eckel", 1229);
        System.out.println(b1.title + ":" + b1.author + ":" + b1.numberOfPages + ":" + b1.ISBN);
        b2= new Book("Thinking in Java", "Bruce Eckel", 1129, "0-13-027363-5");
        System.out.println(b2.title + ":" + b2.author + ":" + b2.numberOfPages + ":" + b2.ISBN);

    }
    
}

