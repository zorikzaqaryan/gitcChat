package am.gitc.chat.common.model;

import java.io.Serializable;

public enum UserStatus implements Serializable {
    ACTIVE              (1,"Active"),
    EMAIL_NOT_CONFIRMED (2,"Email Not Confirmed");

    UserStatus(int value, String title) {
        this.value = value;
        this.title = title;
    }

    public static UserStatus valueOf(int value) {
        for (UserStatus e : UserStatus.values()) {
            if (e.value == value) {
                return e;
            }
        }
        return null;
    }

    private final int value;

    private final String title;

    public int getValue() {
        return value;
    }

    public String getTitle() {
        return title;
    }
}
