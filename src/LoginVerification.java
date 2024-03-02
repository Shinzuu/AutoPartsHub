public class LoginVerification {

    public LoginVerification() {
        boolean loginSuccessful = false;

        do {
            System.out.print("\tPlease input User Id: ");
            String id = AppScanner.nextLine();
            System.out.print("\tPlease input Password: ");
            String pass = AppScanner.nextLine();

            // Default login admin admin
            if (id.equals("admin") && pass.equals("admin")) {
                // Login successful
                loginSuccessful = true;
                new AdminPanel();
            } else {
                System.out.println("\tPress R to retry or M to go back to menu :");
                String c = AppScanner.nextLine();

                if (c.equalsIgnoreCase("M")) {
                    new Menu();
                    break;
                }
            }
        } while (!loginSuccessful);
    }
}
