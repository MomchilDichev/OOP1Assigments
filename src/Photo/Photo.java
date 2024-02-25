package Photo;

import java.util.ArrayList;
import java.util.List;

public class Photo
{
    private int length;
    private int width;
    private String description;
    private List<Person> people;
    private int DPI;

    public Photo(int length, int width, String description, int DPI)
    {
        this.length = length;
        this.width = width;
        this.description = description;
        this.people = new ArrayList<>();
        this.DPI = DPI;
    }

    public int getLength()
    {
        return this.length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getWidth()
    {
        return this.width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public List<Person> getPeople()
    {
        return this.people;
    }

    public void addPerson(Person person)
    {
        if(!person.getName().equals(null))
        {
            this.people.add(person);
        }
    }

    public int getDPI()
    {
        return this.DPI;
    }

    public void setDPI(int DPI)
    {
        this.DPI = DPI;
    }

    public boolean canBePrinted()
    {
        if(this.getDPI() >= 150 && this.getLength() > 585 && this.getWidth() > 878)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public boolean isAGroupPhoto()
    {
        if (this.getPeople().size() > 2)
        {
            return true;
        } else
        {
            return false;
        }
    }

}
