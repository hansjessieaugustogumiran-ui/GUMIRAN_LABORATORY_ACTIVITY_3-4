public class CoffeeShop {
    public static void main(String[] args) {
        // 1. Create at least three Customer objects
        Customer joseph = new Customer("Joseph", 200);
        Customer peter = new Customer("Peter");
        Customer unknown = new Customer();

        // 2. Peter earns points from transactions
        peter.addPoints(200); // pastries and beverages
        System.out.println("Peter earned 200 points. Total Points: " + peter.getPoints());
        peter.addPoints(20);  // water
        System.out.println("Peter earned 20 points. Total Points: " + peter.getPoints());
        System.out.println();

        // 3. Try to redeem rewards for all customers
        joseph.redeemReward();
        peter.redeemReward();
        unknown.redeemReward();
        System.out.println();

        // 4. Display each customer's info and total customers
        joseph.displayCustomerInfo();
        peter.displayCustomerInfo();
        unknown.displayCustomerInfo();
        Customer.displayTotalCustomers();
        System.out.println();

        // 5. A fourth customer comes in (Diane)
        Customer diane = new Customer("Diane");
        diane.addPoints(50);
        System.out.println("Diane earned 50 points. Total Points: " + diane.getPoints());
        Customer.displayTotalCustomers();
        System.out.println();

        // 6. Show how many rewards each customer can redeem
        Customer.getAllowedRewardsRedemption(joseph);
        Customer.getAllowedRewardsRedemption(peter);
        Customer.getAllowedRewardsRedemption(diane);
        Customer.getAllowedRewardsRedemption(unknown);
    }
}


class Customer {
    // Instance Variables
    private String name;
    private int points;

    // Static Variable
    private static int totalCustomers = 0;

    // ===== Constructors =====
    // Default Constructor
    public Customer() {
        this.name = "Unknown";
        this.points = 0;
        totalCustomers++;
    }

    // Parameterized Constructor (name and points)
    public Customer(String name, int points) {
        this.name = name;
        this.points = points;
        totalCustomers++;
    }

    // Parameterized Constructor (name only)
    public Customer(String name) {
        this.name = name;
        this.points = 0;
        totalCustomers++;
    }

    // ===== Instance Methods =====
    public void addPoints(int earnedPoints) {
        this.points += earnedPoints;
    }

    public void redeemReward() {
        if (points >= 100) {
            System.out.println("Congratulations " + name + "! You redeemed a free drink!");
            points -= 100;
            System.out.println("Remaining Points: " + points);
        } else {
            System.out.println(name + " does not have enough points to redeem a drink.");
            System.out.println("Current Points: " + points);
        }
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Points: " + points);
        System.out.println("---------------------------");
    }

    public int getPoints() {
        return points;
    }

    // ===== Static Methods =====
    public static void displayTotalCustomers() {
        System.out.println("Total Registered Customers: " + totalCustomers);
    }

    public static void getAllowedRewardsRedemption(Customer customer) {
        int redeemable = customer.points / 100;
        System.out.println(customer.name + " can redeem " + redeemable + " free drink(s).");
    }
}

// GUMIRAN, HANS JESSIE AUGUSTO M.
// BSCS-2D
// AI USED: ChatGPT-5 
// Conversation of AI: https://chatgpt.com/share/68f4fcf5-7f4c-8010-b920-5465336bcdaa
// https://chatgpt.com/share/68f4ad01-f3d0-8005-b1e7-7799dd423efe
