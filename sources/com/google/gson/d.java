package com.google.gson;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.Locale;

public enum d implements e {
    IDENTITY {
        @Override // com.google.gson.e
        public final String a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        @Override // com.google.gson.e
        public final String a(Field field) {
            return a(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        @Override // com.google.gson.e
        public final String a(Field field) {
            return a(a(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        @Override // com.google.gson.e
        public final String a(Field field) {
            return a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        @Override // com.google.gson.e
        public final String a(Field field) {
            return a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        @Override // com.google.gson.e
        public final String a(Field field) {
            return a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    static {
        Covode.recordClassIndex(33921);
    }

    static String a(String str) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i2 < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i2++;
            charAt = str.charAt(i2);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        int i3 = i2 + 1;
        if (i3 < str.length()) {
            valueOf = upperCase + str.substring(i3);
        } else {
            valueOf = String.valueOf(upperCase);
        }
        return sb.append(valueOf).toString();
    }

    static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* synthetic */ d(byte b2) {
        this();
    }
}
