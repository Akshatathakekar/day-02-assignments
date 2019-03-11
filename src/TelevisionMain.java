import java.util.Scanner;
class TelevisionMain
{
    public static void main(String args[])
    {
        boolean power=false;
        int currentVolume=0;
        int currentChannel=0;
        char choice1='y';
        String choice="increase";
        int numberLevel=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("What do you want ( Television Turn ON/OFF)?");
        power=sc.nextBoolean();

        if(power==false)
        {
            System.out.println("Sorry,You can't operate Television");
        }
        else
        {

        System.out.println("Enter a Channel number");
        currentVolume=sc.nextInt();
        
        System.out.println("Enter channel volume");
        currentChannel=sc.nextInt();

        Television t=new Television(power,currentChannel,currentVolume,choice1,numberLevel,choice);

      //  boolean power=t.power();
        System.out.println("State of power is "+power);
        System.out.println("Current Channel is "+currentChannel);
        System.out.println("current volume is "+currentVolume);
        System.out.println();
        System.out.println("Do you want to change a channel(Y/N)?");
        choice1=sc.next().charAt(0);
        if(choice1=='y')
        {
        System.out.println("enter a channel number");
        currentChannel=sc.nextInt();
        }
        t.setChannel(currentChannel,choice1);
        t.display();

        System.out.println();
        System.out.println("What do you want (increase/decrease volume)?");
        choice=sc.next();
        System.out.println("volume increase/decrease by ?");
     
        numberLevel=sc.nextInt();
       
        t.setVolume(currentVolume,choice,numberLevel);
        t.display();

       power= !power;
       System.out.println("state is "+power);

         }

     

    }

    
}