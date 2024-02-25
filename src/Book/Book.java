package Book;

public class Book
{
    private String name;
    private String author;
    private boolean hardcover;
    private float price;
    private int pages;
    private int timesRead;

    public Book(String name, String author, boolean hardcover, float price, int pages)
    {
        this.name = name;
        this.author = author;
        this.hardcover = hardcover;
        this.price = price;
        this.pages = pages;
        this.timesRead = 0;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAuthor()
    {
        return this.author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public boolean isHardcover()
    {
        return this.hardcover;
    }

    public void setHardcover(boolean hardcover)
    {
        this.hardcover = hardcover;
    }

    public float getPrice()
    {
        return this.price;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public int getPages()
    {
        return this.pages;
    }

    public void setPages(int pages)
    {
        this.pages = pages;
    }

    public int getTimesRead()
    {
        return this.timesRead;
    }

    public void setTimesRead(int timesRead)
    {
        this.timesRead = timesRead;
    }

    public void readBook()
    {
        this.timesRead++;
    }

    public String timeToReadBook()
    {
        double time = this.pages/0.8;
        if(time < 61)
        {
            return "You can read this";
        } else if(time > 60 && time <= 240)
        {
            return "Are you sure you want to read this now?";
        } else
        {
            return "You should not start reading this right now";
        }
    }

}