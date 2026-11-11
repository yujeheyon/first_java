package etc;

public class Book 
{
    String title;
    String author;
    int price;

    Book(String title, String author, int price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void printBookInfo()
    {
        System.out.println("책 제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price + "원");
    }

    public static void main(String[] args) 
    {
        Book book = new Book("자바의 정석", "남궁성", 30000);
        book.printBookInfo();
    }
}
