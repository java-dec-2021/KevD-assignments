import java.util.Date;

public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name, String dayPeriod) {
        
        return String.format("Good %s! Stupendous to see you %s!", dayPeriod, name);
        

    }

    public String dateAnnouncement() {
    
        return String.format("Today is %s", new Date());
    }

    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") > -1) {
            return "She is really of no help. What can I do for you?";
        }
        if(conversation.indexOf("Alfred") > -1) {
            return "At your service, of course. How may I be of assistance?";
        }
        return "Right. And with that, I shall retire.";
    }

    }




