package LEDStrip;

public class LED
{
    private int red;
    private int blue;
    private int green;
    private int dimmer;
    private int MIN_VALUE;
    private int MAX_VALUE;

    public LED()
    {
        this.MIN_VALUE = 0;
        this.MAX_VALUE = 255;
    }

    public int getRed()
    {
        return this.red;
    }

    public void setRed(int red)
    {
        if (green <= MAX_VALUE || green >= MIN_VALUE) 
        {
            this.red = red;
        }
    }

    public int getBlue()
    {
        return this.blue;
    }

    public void setBlue(int blue)
    {
        if (green <= MAX_VALUE || green >= MIN_VALUE) 
        {
            this.blue = blue;
        }
    }

    public int getGreen()
    {
        return this.green;
    }

    public void setGreen(int green)
    {
        if(green <= MAX_VALUE || green >= MIN_VALUE)
        {
            this.green = green;
        }
    }

    public int getDimmer()
    {
        return this.dimmer;
    }

    public void setDimmer(int dimmer)
    {
        if (green <= MAX_VALUE || green >= MIN_VALUE) 
        {
            this.dimmer = dimmer;
        }
    }

    public void resetColor()
    {
        setRed(0);
        setBlue(0);
        setGreen(0);
    }

    public boolean setColorFromText(String color)
    {
        resetColor();

        if(color.equals("Red"))
        {
            setRed(255);
            return true;
        } 
        else if (color.equals("BLue"))
        {
            setBlue(255);
            return true;
        } 
        else if (color.equals("Green"))
        {
            setGreen(255);
            return true;
        } 
        else if (color.equals("Purple")) 
        {
            setRed(255);
            setBlue(255);
            return true;
        } 
        else if (color.equals("Orange")) 
        {
            setRed(255);
            setGreen(165);
            return true;
        } 
        else if (color.equals("Sun")) 
        {
            setRed(201);
            setBlue(38);
            setGreen(141);
            return true;
        } 
        else
        {
            return false;
        }
    }

    public String getColorInText()
    {
        if(this.getRed() == 255 && this.getBlue() == 0 && this.getGreen() == 0)
        {
            return "Red";
        } 
        else if (this.getRed() == 0 && this.getBlue() == 255 && this.getGreen() == 0)
        {
            return "Blue";
        } 
        else if (this.getRed() == 0 && this.getBlue() == 0 && this.getGreen() == 255)
        {
            return "Green";
        } 
        else if (this.getRed() == 255 && this.getBlue() == 255 && this.getGreen() == 0)
        {
            return "Purple";
        } 
        else if (this.getRed() == 255 && this.getBlue() == 0 && this.getGreen() == 165)
        {
            return "Orange";
        } 
        else if (this.getRed() == 201 && this.getBlue() == 38 && this.getGreen() == 141)
        {
            return "Sun";
        } 
        else
        {
            return "Cannot get that color.";
        }
    }

    public void adjustDimmerByPercentage(float percentage)
    {
        float calculation = (MAX_VALUE*percentage)/100;
        setDimmer(Math.round(calculation));
    }
}
