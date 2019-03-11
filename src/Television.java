
class Television
{

    boolean power;
    int currentVolume;
    int currentChannel;
    char choice;
    String choice2;

   public Television(boolean power,int currentChannel,int currentVolume,char choice,int number,String choice2)
    {
        this.power=power;
        this.currentChannel=currentChannel;
        this.currentVolume=currentVolume;
        
       
    }

    // public boolean powerMethod(boolean power)
    // {
    //     this.power=!this.power;
    //     return power;
    // }

    public void setChannel(int channel,char choice)
    {
        if((choice=='Y' || choice=='y') )
        {
            this.currentChannel=channel;
            System.out.println("Now current channel is "+currentChannel);
        }
        else if (choice=='N' || choice=='n')
        {

           currentChannel=currentChannel;
            System.out.println(" current channel is "+currentChannel);
        }
        
    }


   
    public void setVolume(int currentVolume,String choice2,int number)
    {
        if(choice2.equals("increase"))
        {
            this.currentVolume=currentVolume+number;
          
        }
        else
        {
            this.currentVolume=currentVolume-number;
        }
     
    }

    public void display()
    {
        System.out.println("State of power is "+power);
        System.out.println("Current Channel is "+currentChannel);
        System.out.println("current volume is "+currentVolume);
    }
 
    
    
}