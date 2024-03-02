public class LocationFinder {
    int n;

    public LocationFinder() {
        System.out.println("\t===================================");
        System.out.println("\t\tDealership Finder");
        System.out.println("\t===================================");
        System.out.println("\t'-->Navigate by inserting index<--'");
        System.out.println("\t1.IN Barishal");
        System.out.println("\t2.IN Chittagong");
        System.out.println("\t3.IN Dhaka");
        System.out.println("\t4.IN Khulna");
        System.out.println("\t5.IN Rajshahi");
        System.out.println("\t6.IN Rangpur");
        System.out.println("\t7.IN Sylhet");
        System.out.println("\t===================================");
        System.out.print("\tInsert number between 1 to 5:  ");

        // Use AppScanner for user input
        this.n = AppScanner.nextInt();

        switch (n) {
            case 1:
                System.out.println("\t===================================");
                System.out.println("\t\tBarishal Dealership");
                System.out.println("\t===================================");
                System.out.println("\tAddress : Fake address\n\tCall : Fake number");
                System.out.println("\t===================================");
                break;
            case 2:
                System.out.println("\t===================================");
                System.out.println("\t\tChittagong Dealership");
                System.out.println("\t===================================");
                System.out.println("\tAddress : Fake address\n\tCall : Fake number");
                System.out.println("\t===================================");
                break;
            case 3:
                System.out.println("\t===================================");
                System.out.println("\t\tDhaka Dealership");
                System.out.println("\t===================================");
                System.out.println("\tAddress : Fake address\n\tCall : Fake number");
                System.out.println("\t===================================");
                break;
            case 4:
                System.out.println("\t===================================");
                System.out.println("\t\tKhulna Dealership");
                System.out.println("\t===================================");
                System.out.println("\tAddress : Fake address\n\tCall : Fake number");
                System.out.println("\t===================================");
                break;
            case 5:
                System.out.println("\t===================================");
                System.out.println("\t\tRajshahi Dealership");
                System.out.println("\t===================================");
                System.out.println("\tAddress : Fake address\n\tCall : Fake number");
                System.out.println("\t===================================");
                break;
            case 6:
                System.out.println("\t===================================");
                System.out.println("\t\tRangpur Dealership");
                System.out.println("\t===================================");
                System.out.println("\tAddress : Fake address\n\tCall : Fake number");
                System.out.println("\t===================================");
                break;
            case 7:
                System.out.println("\t===================================");
                System.out.println("\t\tSylhet Dealership");
                System.out.println("\t===================================");
                System.out.println("\tAddress : Fake address\n\tCall : Fake number");
                System.out.println("\t===================================");
                break;
            default:
                // dummy
                break;
        }

        System.out.println("\t-------->Going back to menu<-------");
        new Menu();
    }
}
