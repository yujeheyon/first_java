package test;

public class Book implements Manageable
{
    private int id;
    private String title;
    private String author;

    public int getId()        { return id; }
    public String getTitle()  { return title; }
    public String getAuthor() { return author; }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    @Override 
    public void addItem(Book book)
    {

    }

    @Override 
    public void displayAll()
    {

    }

    @Override 
    public void saveToFile()
    {

    }

    @Override 
    public void loadFromFile()
    {

    }
}
