class passMan {
    private static final int maxAttempts = 3;
    private int attempts = 0;

    // function that accepts a password
    public void login(String password) throws maxAttemptsExceeded, incorrectPassException {
        if (password.equals("the right password")) {
            System.out.println("Login successful!");

            // call other function instead of exiting after logging in
            System.exit(0);
        } else {
            attempts++;

            if (attempts >= maxAttempts) {
                throw new maxAttemptsExceeded("Too many login attempts! Account locked.");
            } else {
                throw new incorrectPassException("Incorrect password!");
            }
        }

    }

}