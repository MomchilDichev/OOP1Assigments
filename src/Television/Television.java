package Television;

public class Television
{
    private String brand;
    private String model;
    private int currentVolume;
    private int currentChannel;
    private String lockCode;
    private boolean childLock;

    public Television(String brand, String model) 
    {
        this.brand = brand;
        this.model = model;
        this.childLock = false;
        this.currentVolume = 100;
        this.currentChannel = 1;
    }

    public String getBrand()
    {
        return this.brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getModel()
    {
        return this.model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getLockCode()
    {
        return this.lockCode;
    }

    public void setCurrentVolume(int currentVolume)
    {
        if(currentVolume >= 0 && currentVolume <= 100)
        {
            this.currentVolume = currentVolume;
        }
    }

    public int getCurrentVolume() 
    {
        return currentVolume;
    }

    public void setCurrentChannel(int currentChannel) 
    {
        if(currentChannel >= 1 && currentChannel <= 75)
        {
            this.currentChannel = currentChannel;
        }
    }

    public int getCurrentChannel() 
    {
        return this.currentChannel;
    }

    public void childLock(String lockCode)
    {
        if(lockCode.length() == 4 && this.lockCode == null)
        {
            this.lockCode = lockCode;
            this.childLock = true;
        }
        
        if(this.getLockCode() != null && lockCode == this.getLockCode())
        {
            this.lockCode = null;
            this.childLock = false;
        }
    }

    public boolean isChildLock()
    {
        return this.childLock;
    }
}
