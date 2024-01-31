import java.util.Scanner;

public class Paint {
    private double length;
    private double width;
    private double height;
    private int numWindows;
    private int numDoors;

    // Constructor
    public paint (double length, double width, double height, int numWindows, int numDoors) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.numWindows = numWindows;
        this.numDoors = numDoors;
    }

    // Calculate the total area to be painted
    public double calculatePaintableArea() {
        double wallArea = 2 * (length + width) * height;
        double windowArea = numWindows * 15;
        double doorArea = numDoors * 21;
        return wallArea - windowArea - doorArea;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the room in feet:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the room in feet:");
        double width = scanner.nextDouble();

        System.out.println("Enter the height of the room in feet:");
        double height = scanner.nextDouble();

        System.out.println("Enter the number of windows:");
        int numWindows = scanner.nextInt();

        System.out.println("Enter the number of doors:");
        int numDoors = scanner.nextInt();

        Paint roomAndPaint = new Paint(length, width, height, numWindows, numDoors);

        double paintableArea = roomAndPaint.calculatePaintableArea();
        int gallonsNeeded = (int) Math.ceil(paintableArea / 350);
        double quartsNeeded = (paintableArea % 350) / 350 * 4;

        System.out.printf("To paint the room, you will need %d gallons and %.2f quarts%n", gallonsNeeded, quartsNeeded);
    }
}
