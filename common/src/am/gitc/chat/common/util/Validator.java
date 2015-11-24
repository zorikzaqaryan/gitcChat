package am.gitc.chat.common.util;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.List;

public class Validator {
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean isEmpty(List<?> list) {
        return list == null || list.size() == 0;
    }

    public static boolean isNotEmpty(List<?> list) {
        return !isEmpty(list);
    }

    public static boolean isInvalidEmail(String email) {
        if (isEmpty(email)) {
            return true;
        }
        try {
            new InternetAddress(email).validate();
        } catch (AddressException e) {
            return true;
        }
        return false;
    }
}
