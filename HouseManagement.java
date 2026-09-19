import java.util.Scanner;

// Class to manage individual school house data and analytical calculations
class SchoolHouse {
    private String houseName;
    private String leaderName;
    private int academicPoints;
    private int sportsPoints;
    private int culturalPoints;

    // Constructor to initialize the school house details
    public SchoolHouse(String name, String leader) {
        this.houseName = name;
        this.leaderName = leader;
        this.academicPoints = 0;
        this.sportsPoints = 0;
        this.culturalPoints = 0;
    }

    // Methods to add points dynamically based on achievements
    public void addAcademicPoints(int points) { this.academicPoints += points; }
    public void addSportsPoints(int points) { this.sportsPoints += points; }
    public void addCulturalPoints(int points) { this.culturalPoints += points; }

    // Analytical skill implementation: Calculating total cumulative score
    public int getTotalPoints() {
        return academicPoints + sportsPoints + culturalPoints;
    }

    // Method to display the clean performance report for admissions data
    public void displayPerformanceReport() {
        System.out.println("\n-------------------------------------------");
        System.out.println("★ HOUSE PERFORMANCE REPORT: " + houseName.toUpperCase() + " HOUSE ★");
        System.out.println("Designated Student Leader: " + leaderName);
        System.out.println("-------------------------------------------");
        System.out.println("1. Academic Points (e.g., Science Exhibition): " + academicPoints);
        System.out.println("2. Sports Points (e.g., Inter-House Track): " + sportsPoints);
        System.out.println("3. Cultural Points (e.g., Group Song/Rangoli): " + culturalPoints);
        System.out.println(">>>> CUMULATIVE ANALYTICAL SCORE: " + getTotalPoints());
        System.out.println("-------------------------------------------");
    }
}

// Main operational class for system execution
public class HouseManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================================");
        System.out.println("   SCHOOL HOUSE DUTY & PERFORMANCE ANALYZER (v1.0)   ");
        System.out.println("====================================================");

        // Capturing real-world context data based on your Vice-Captain experience
        System.out.print("Enter your School House Name (e.g., Mother Teresa): ");
        String houseName = scanner.nextLine();
        
        System.out.print("Enter your Name (e.g., Ananya Dubey): ");
        String leaderName = scanner.nextLine();

        // Object-Oriented Programming (OOP) initialization
        SchoolHouse myHouse = new SchoolHouse(houseName, leaderName);

        boolean running = true;
        while (running) {
            System.out.println("\n--- VICE-CAPTAIN CONTROL PANEL ---");
            System.out.println("1. Add Academic Competition Points");
            System.out.println("2. Add Sports Event Points");
            System.out.println("3. Add Cultural Event Points (Song/Rangoli/Art)");
            System.out.println("4. Generate Analytical House Performance Report");
            System.out.println("5. Save Data & Exit System");
            System.out.print("Select operational choice (1-5): ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter academic score points to log: ");
                    int acPoints = scanner.nextInt();
                    myHouse.addAcademicPoints(acPoints);
                    System.out.println("✓ Points successfully logged into the database!");
                    break;
                case 2:
                    System.out.print("Enter sports score points to log: ");
                    int spPoints = scanner.nextInt();
                    myHouse.addSportsPoints(spPoints);
                    System.out.println("✓ Points successfully logged into the database!");
                    break;
                case 3:
                    System.out.print("Enter cultural score points to log: ");
                    int clPoints = scanner.nextInt();
                    myHouse.addCulturalPoints(clPoints);
                    System.out.println("✓ Points successfully logged into the database!");
                    break;
                case 4:
                    myHouse.displayPerformanceReport();
                    break;
                case 5:
                    running = false;
                    System.out.println("\n[SYSTEM INFO] Data saved successfully. Thank you for your leadership!");
                    break;
                default:
                    System.out.println("✖ Invalid choice! Please select an option between 1 and 5.");
            }
        }
        scanner.close();
    }
                      }
