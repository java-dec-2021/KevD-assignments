public class AlfredTest {


    public static void main(String[] args) {

        AlfredQuotes alfredBot = new AlfredQuotes();
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Kevin", "afternoon");
        String testDateAnnouncement = alfredBot.dateAnnouncement();

        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play some Disma");
        String alfredTest = alfredBot.respondBeforeAlexis("Alfred, I need help.");
        String neitherTest = alfredBot.respondBeforeAlexis("Maybe Batman is not real...");


        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(neitherTest);
    }

}
