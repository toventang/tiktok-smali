package com.bytedance.ies.web.jsbridge2;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class aj {

    /* renamed from: a  reason: collision with root package name */
    static boolean f35614a;

    static {
        Covode.recordClassIndex(21276);
    }

    static String a(Throwable th) {
        int i2;
        StringBuilder sb = new StringBuilder("{\"code\":");
        if (th instanceof z) {
            i2 = ((z) th).code;
        } else {
            i2 = 0;
        }
        return sb.append(i2).append("}").toString();
    }

    static <T> JSONObject a(T t) {
        if (!(t instanceof JSONObject)) {
            return null;
        }
        try {
            t.put("code", 1);
            return t;
        } catch (JSONException unused) {
            return null;
        }
    }

    static <T> String a(j jVar, T t) {
        String str;
        if ((t instanceof JSONObject) && f35614a && jVar.f35670b) {
            T t2 = t;
            try {
                t2.put("code", 1);
                return t2.toString();
            } catch (JSONException unused) {
            }
        }
        String a2 = jVar.a((Object) t);
        if (TextUtils.isEmpty(a2)) {
            return "{\"code\":1}";
        }
        if (f35614a) {
            str = a2.substring(1, a2.length() - 1);
        } else {
            str = "";
        }
        String concat = "{\"code\":1,\"__data\":".concat(String.valueOf(a2));
        if (!str.isEmpty()) {
            return concat + "," + str + "}";
        }
        return concat + "}";
    }
}
