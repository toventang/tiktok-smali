package com.kakao.usermgmt.response.model;

import com.bytedance.covode.number.Covode;

public enum BirthdayType {
    SOLAR,
    LUNAR,
    UNKNOWN;

    public final String toString() {
        return name();
    }

    static {
        Covode.recordClassIndex(34454);
    }

    public static BirthdayType getType(String str) {
        BirthdayType[] values = values();
        for (BirthdayType birthdayType : values) {
            if (birthdayType.name().equalsIgnoreCase(str)) {
                return birthdayType;
            }
        }
        return UNKNOWN;
    }
}
