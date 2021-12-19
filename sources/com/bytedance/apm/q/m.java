package com.bytedance.apm.q;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.b.k.e;
import com.bytedance.b.k.f;
import com.bytedance.covode.number.Covode;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class m {
    static {
        Covode.recordClassIndex(14712);
    }

    public static JSONObject a(JSONObject jSONObject, String str) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return jSONObject.optJSONObject(str);
    }

    public static boolean a(String str, List<String> list) {
        if (!f.a(list) && !TextUtils.isEmpty(str)) {
            try {
                String host = Uri.parse(str).getHost();
                for (String str2 : list) {
                    if (host.equalsIgnoreCase(str2)) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014 A[Catch:{ Exception -> 0x0031 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0015 A[Catch:{ Exception -> 0x0031 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> b(org.json.JSONObject r7, java.lang.String r8) {
        /*
            r6 = 0
            org.json.JSONArray r5 = r7.optJSONArray(r8)     // Catch:{ Exception -> 0x0031 }
            r4 = 0
            if (r5 == 0) goto L_0x0011
            int r0 = r5.length()     // Catch:{ Exception -> 0x0031 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            if (r0 == 0) goto L_0x0015
            return r6
        L_0x0015:
            int r3 = r5.length()     // Catch:{ Exception -> 0x0031 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0031 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0031 }
        L_0x001e:
            if (r4 >= r3) goto L_0x0030
            java.lang.String r1 = r5.getString(r4)     // Catch:{ Exception -> 0x0031 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0031 }
            if (r0 != 0) goto L_0x002d
            r2.add(r1)     // Catch:{ Exception -> 0x0031 }
        L_0x002d:
            int r4 = r4 + 1
            goto L_0x001e
        L_0x0030:
            return r2
        L_0x0031:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.q.m.b(org.json.JSONObject, java.lang.String):java.util.List");
    }

    public static List<String> c(JSONObject jSONObject, String str) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (e.a(optJSONObject)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (optJSONObject.optInt(next) == 1) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<Pattern> d(JSONObject jSONObject, String str) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return null;
            }
            int length = optJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                String string = optJSONArray.getString(i2);
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(Pattern.compile(string));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<Pattern> e(JSONObject jSONObject, String str) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (e.a(optJSONObject)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (optJSONObject.optInt(next) == 1) {
                    arrayList.add(Pattern.compile(next));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean a(String str, List<String> list, List<Pattern> list2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!f.a(list)) {
            for (String str2 : list) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        try {
            String path = new URI(str).getPath();
            if (!f.a(list2)) {
                for (Pattern pattern : list2) {
                    if (pattern.matcher(path).matches()) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
