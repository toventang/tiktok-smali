package com.bytedance.crash.nativecrash;

import com.bytedance.covode.number.Covode;
import org.json.JSONArray;

public final class d {
    static {
        Covode.recordClassIndex(16277);
    }

    public static String a(JSONArray jSONArray) {
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String optString = jSONArray.optString(i2);
            if (optString.endsWith(")") && optString.contains("[xcrash] child terminated by a signal")) {
                return optString.substring(optString.lastIndexOf(40) + 1, optString.length() - 1);
            }
        }
        return null;
    }

    public static boolean a(String str) {
        int i2 = 0;
        for (String str2 : str.split("\n")) {
            if (str2.trim().startsWith("#")) {
                i2++;
            }
        }
        if (i2 <= 1) {
            return true;
        }
        return false;
    }
}
