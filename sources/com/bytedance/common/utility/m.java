package com.bytedance.common.utility;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

public final class m {
    static {
        Covode.recordClassIndex(15916);
    }

    public static boolean a(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static String a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                String str2 = map.get(str);
                if (!a(str) && !a(str2)) {
                    jSONObject.put(str, str2);
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(String str) {
        if (a(str)) {
            return str;
        }
        try {
            str = str.replace("[ss_random]", String.valueOf(new Random().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    public static String c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bytes = str.getBytes("UTF-8");
            for (int i2 = 0; i2 < bytes.length; i2++) {
                bytes[i2] = (byte) (bytes[i2] ^ 5);
            }
            return d.a(bytes, bytes.length);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] a2 = d.a(str);
            for (int i2 = 0; i2 < a2.length; i2++) {
                a2[i2] = (byte) (a2[i2] ^ 5);
            }
            return new String(a2, 0, a2.length, "UTF-8");
        } catch (Exception unused) {
            return str;
        }
    }

    public static boolean a(String str, String str2) {
        if (a(str) && a(str2)) {
            return true;
        }
        if (str == null || !str.equals(str2)) {
            return false;
        }
        return true;
    }

    public static Map<String, String> a(String str, Map<String, String> map) {
        if (a(str) || map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject.getString(next);
                if (!a(next) && !a(string)) {
                    map.put(next, string);
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }
}
