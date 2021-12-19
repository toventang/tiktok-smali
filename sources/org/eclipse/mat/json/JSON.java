package org.eclipse.mat.json;

import com.bytedance.covode.number.Covode;

public class JSON {
    static {
        Covode.recordClassIndex(106453);
    }

    static String toString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    static double checkDouble(double d2) {
        if (!Double.isInfinite(d2) && !Double.isNaN(d2)) {
            return d2;
        }
        throw new JSONException("Forbidden numeric value: ".concat(String.valueOf(d2)));
    }

    static Boolean toBoolean(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            return Boolean.valueOf((String) obj);
        }
        return null;
    }

    static Double toDouble(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Double.valueOf((String) obj);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Integer toInteger(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Integer.valueOf((int) Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Long toLong(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Long.valueOf((long) Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static JSONException typeMismatch(Object obj, String str) {
        if (obj == null) {
            throw new JSONException("Value is null.");
        }
        throw new JSONException("Value " + obj + " of type " + obj.getClass().getName() + " cannot be converted to " + str);
    }

    public static void put(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null && str != null && str.length() != 0) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static JSONException typeMismatch(Object obj, Object obj2, String str) {
        if (obj2 == null) {
            throw new JSONException("Value at " + obj + " is null.");
        }
        throw new JSONException("Value " + obj2 + " at " + obj + " of type " + obj2.getClass().getName() + " cannot be converted to " + str);
    }
}
