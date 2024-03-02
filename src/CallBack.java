public class CallBack {
    public CallBack() {
        try {
            System.out.println("\tInstert 1 to find the Nearest dealer\n\t\t2 to go back to menu");
            System.out.print("\tInsert here: ");
            int n;
            while (true) {
                try {
                    n = AppScanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }

            if (n == 1) {
                new LocationFinder();
            } else if (n == 2) {
                new Menu();
            } else {
                while (n != 1 && n != 2) {
                    System.out.println("\tInvalid range. \n\tPlease insert either 1 or 2.");
                    System.out.print("\tSelect range: ");

                    while (true) {
                        try {
                            n = AppScanner.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please enter a number.");
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
