package gr.aueb.cf.schoolapp.security;

import org.mindrot.jbcrypt.BCrypt;

public class SecUtil {
    private SecUtil() {}

    public static String hasPassword(String inputPasswd) {
        int workload = 12;
        String salt = BCrypt.gensalt(workload);
        return BCrypt.hashpw(inputPasswd, salt);
    }

    public static boolean checkPassword(String inputPasswd, String storedhashedPasswd) {
        return BCrypt.checkpw(inputPasswd, storedhashedPasswd);
    }
}
