package password_validation;

public class PasswordValidator {

    public static boolean isValid(String password){

        return hasMoreThan8Characters(password)
                && containsACapitalLetter(password)
                && containsALowercase(password)
                && containsANumber(password)
                && containsAnUnderscore(password);
    }

    private static boolean containsACapitalLetter(String password) {
        return password.matches("(?s).*[A-Z].*");
    }

    private static boolean containsANumber(String password) {
        return password.matches("(?s).*[0-9].*");
    }

    private static boolean hasMoreThan8Characters(String password) {
        return password.length() > 8;
    }

    private static boolean containsALowercase(String password) {
        return password.matches("(?s).*[a-z].*");
    }

    private static boolean containsAnUnderscore(String password) {
        return password.contains("_");
    }
}
