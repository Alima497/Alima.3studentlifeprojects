import java.util.Scanner;
public class GradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double assignmentPoints = 0;
        int assignmentCount = 0;
        double examPoints = 0;
        int examCount = 0;
        int option = 0;
        while (option !=4) {
            System.out.println("===== SEMESTER GRADE TRACKER =====");
            System.out.println("1. Add assignment result");
            System.out.println("2. Add exam result");
            System.out.println("3. View current grade");
            System.out.println("4. Exit");
            System.out.println("Choose an option:");
            option = scanner.nextInt();
            if (option == 1) {
                System.out.println("Enter your assignment score : ");
                double score = scanner.nextDouble();
                if (score < 0 || score > 100) {
                    System.out.println("Invalid score. Enter a value from 0 to 100");
                } else {
                    assignmentPoints = assignmentPoints + score;
                    assignmentCount = assignmentCount + 1;
                    System.out.println("Assignment score added.");
                }
            } else if ( option == 2) {
                System.out.println("Enter yor exam score");
                double score = scanner.nextInt();
                if (score < 0 || score > 100) {
                    System.out.println("Invalid score. Enter value from 0 to 100");
                } else {
                    examPoints = examPoints + score;
                    examCount = examCount + 1;
                    System.out.println("Exam score added");
                }
            } else if (option == 3) {
if ( assignmentCount== 0 && examCount ==0) {
    System.out.println("No results available yet.");
    continue;
}
double assignmentAverage = 0;
double examAverage = 0;
double overallAverage = 0;
                System.out.println("==== Current results ====");
                System.out.println("assignment completed: " + assignmentCount);
                if (assignmentCount > 0) {
                    assignmentAverage= assignmentPoints/assignmentCount;
                    System.out.println("Assignment average : " + assignmentAverage);
                }
                System.out.println("Exams completed: " + examCount);
                if (examCount > 0) {
                    examAverage = examPoints / examCount;
                    System.out.println("Exam average: " + examAverage);
                }
                if (assignmentCount > 0 && examCount > 0) {
                    overallAverage = (assignmentAverage * 0.50) + (examAverage * 0.50);
                } else if (assignmentCount > 0) {
                    overallAverage = assignmentAverage;
                } else {
                    overallAverage = examAverage;
                }
                System.out.println("Overall average: " + overallAverage);
                String grade = "F";
                if (overallAverage>=90){
                    grade = "A";
                } else if (overallAverage >=80) {
                    grade = "B";
                } else if (overallAverage >=70) {
                    grade = "C";
                }  else if (overallAverage >=60) {
                    grade = "D";
                }
                System.out.println("Grade: " + grade);
                if (overallAverage>=60) {
                    System.out.println("Status: Passing");
                } else {
                    System.out.println("Status: Failing");
                }
                } else if (option == 4) {
                System.out.println("Grade tracker closed.");
            } else {
                System.out.println("Invalid option.Try again.");
            }
            }
        scanner.close();
        }
    }

