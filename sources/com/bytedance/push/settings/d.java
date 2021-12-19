package com.bytedance.push.settings;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class d {
    static {
        Covode.recordClassIndex(25847);
    }

    private static Boolean a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num.intValue() == 1) {
                return true;
            }
            if (num.intValue() == 0) {
                return false;
            }
            return null;
        } else if (!(obj instanceof String)) {
            return null;
        } else {
            String str = (String) obj;
            if ("true".equalsIgnoreCase(str) || "1".equals(str)) {
                return true;
            }
            if ("false".equalsIgnoreCase(str) || "0".equals(str)) {
                return false;
            }
            return null;
        }
    }

    public static boolean a(JSONObject jSONObject, String str) {
        Boolean a2 = a(jSONObject.opt(str));
        if (a2 != null) {
            return a2.booleanValue();
        }
        return false;
    }
}
