import java.util.Scanner;
public class ScreenTimeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int socialMediaTime = 0;
        int gamingTime = 0;
        int studyingTime = 0;
        int streamingTime = 0;
        int totalScreenTime = 0;
        int recordedSession = 0;
        int option = 0;
        while (option != 6) {
            System.out.println(" ==== Screen_time tracker ====");
            System.out.println("1. Add social media time");
            System.out.println("2. Add gaming time");
            System.out.println("3. Add studying time");
            System.out.println("4. Add video or streaming time");
            System.out.println("5. View statistics");
            System.out.println("6. Exit");
            System.out.println("Choose an option:");
            option = scanner.nextInt();
            if (option >= 1 && option <= 4) {
                System.out.println("Enter minutes: ");
                int minutes = scanner.nextInt();
                if (minutes <= 0) {
                    System.out.println("Invalid value. Minutes must be greater than 0");
                    continue;
                }
                if (option == 1) {
                    socialMediaTime = socialMediaTime + minutes;
                } else if (option == 2) {
                    gamingTime = gamingTime + minutes;
                } else if (option == 3) {
                    studyingTime = studyingTime + minutes;
                } else if (option == 4) {
                    streamingTime = streamingTime + minutes;
                }
                totalScreenTime = totalScreenTime + minutes;
                recordedSession = recordedSession + 1;
                System.out.println("Time added successfully!");
            } else if (option == 5) {
                System.out.println(" ==== Today's screen time ====");
                System.out.println("Social media time:" + socialMediaTime + "minutes");
                System.out.println("Gaming time: " + gamingTime + "minutes");
                System.out.println("Studying time: " + studyingTime + "minutes");
                System.out.println("Video or streaming time " + streamingTime + "minutes");
                System.out.println("Total screen time: " + totalScreenTime + "minutes");
                System.out.println("Recorded sessions:" + recordedSession);
                int entertainmentTime = socialMediaTime + gamingTime + streamingTime;
                if (studyingTime > entertainmentTime) {
                    System.out.println("Study screen time is greater than entertainment screen time. Good job!");
                } else if (studyingTime < entertainmentTime) {
                    System.out.println("Entertainment screen time is less than strudy screen time. TRy harder!");
                } else {
                    System.out.println("Entertainment screen time equals study screen time");
                }
                if (totalScreenTime < 120) {
                    System.out.println("Low screen time");
                } else if (totalScreenTime <= 240) {
                    System.out.println("Moderate screen time");
                } else {
                    System.out.println("High screen time");
                }
                } else if (option == 6) {
                    System.out.println("Screen-time tracker closed");
                } else {
                    System.out.println("Invalid option. Try again");
                }
            }
            scanner.close();

        }
    }



