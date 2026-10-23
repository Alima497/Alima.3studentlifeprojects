import java.util.Scanner;
public class StudyPlanner {
    public static void main (String [] args) {
Scanner scanner = new Scanner (System.in);
int weeklyGoal = 600;
int totalStudyTime = 0;
int sessionCount = 0;
int programmingTime = 0;
int mathematicsTime = 0;
int englishTime = 0;
int otherTime = 0;
int choice = 0;
while (choice != 4) {
    System.out.println("==== Study Planner =====");
    System.out.println("1. Add study session");
    System.out.println("2. View statistics");
    System.out.println("3. Check weekly goal");
    System.out.println("4. Exit");
    System.out.println("Choose an option");
    choice = scanner.nextInt();
    if (choice == 1) {
        System.out.println("Choose subject");
        System.out.println("1. Programming");
        System.out.println("2. Mathematics");
        System.out.println("3. English");
        System.out.println("4. Other");
        System.out.println("Choose an option");
        int subjectChoice = scanner.nextInt();
        if (subjectChoice < 1 || subjectChoice > 4 ) {
            System.out.println("Invalid subjectChoice");
            continue;
        }
        System.out.println("Study time in minutes: ");
        int minutes = scanner.nextInt();
        if ( minutes <= 0) {
            System.out.println("Invalid study time. Time must be greater than 0");
            continue;
        }
        if (subjectChoice == 1) {
            programmingTime = programmingTime + minutes;
        } else if ( subjectChoice ==2) {
            mathematicsTime = mathematicsTime + minutes;
        } else if ( subjectChoice == 3) {
            englishTime = englishTime + minutes;
        } else if (subjectChoice == 4) {
            otherTime = otherTime + minutes;
        }
        totalStudyTime = totalStudyTime + minutes;
        sessionCount = sessionCount +1;
        System.out.println("Study session added!");
        System.out.println("Current total study time: " + totalStudyTime+ "minutes");
        } else if (choice == 2) {
        System.out.println("==== WEEKLY STATISTICS ====");
        System.out.println("Study sessions: " + sessionCount);
        System.out.println("Total study time: " + totalStudyTime + "minutes");
        System.out.println("Programming : " + programmingTime + "minutes");
        System.out.println("Mathematics:" + mathematicsTime + "minutes");
        System.out.println(" English:" + englishTime + "minutes");
        System.out.println("Other:" + otherTime + "minutes");
    } else if (choice == 3) {
        System.out.println("weekly goal:" + weeklyGoal + "minutes");
        System.out.println("You studied: " + totalStudyTime + "minutes");
        if (totalStudyTime >= weeklyGoal) {
            System.out.println("Weekly goal achived!");
        } else {
            int remaining = weeklyGoal - totalStudyTime;
            System.out.println("Remaining:" + remaining + "minutes");
        }
    } else if (choice == 4) {
        System.out.println("Study planner closed. Keep up the good work!");
    } else {
        System.out.println("Invalid option. Try again");
    }
    }
scanner.close();
    }

}







