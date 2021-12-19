package com.facebook.a.i;

import android.util.Patterns;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    static Map<String, String> f46834a;

    /* renamed from: b  reason: collision with root package name */
    static Map<String, String> f46835b;

    /* renamed from: c  reason: collision with root package name */
    static Map<String, String> f46836c;

    /* renamed from: d  reason: collision with root package name */
    static JSONObject f46837d;

    /* renamed from: e  reason: collision with root package name */
    static boolean f46838e;

    static {
        Covode.recordClassIndex(28526);
    }

    a() {
    }

    static float[] a(JSONObject jSONObject, String str) {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return null;
        }
        try {
            if (!f46838e) {
                return null;
            }
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            try {
                String lowerCase = str.toLowerCase();
                JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                String optString = jSONObject.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                a(jSONObject2, jSONArray);
                a(fArr, a(jSONObject2));
                JSONObject c2 = c(jSONObject2);
                if (c2 == null) {
                    return null;
                }
                a(fArr, a(c2, jSONArray, optString, jSONObject2.toString(), lowerCase));
                return fArr;
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return null;
        }
    }

    private static float[] a(JSONObject jSONObject) {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            String lowerCase = jSONObject.optString("text").toLowerCase();
            String lowerCase2 = jSONObject.optString("hint").toLowerCase();
            String lowerCase3 = jSONObject.optString("classname").toLowerCase();
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (a(new String[]{"$", "amount", "price", "total"}, strArr)) {
                double d2 = (double) fArr[0];
                Double.isNaN(d2);
                fArr[0] = (float) (d2 + 1.0d);
            }
            if (a(new String[]{"password", "pwd"}, strArr)) {
                double d3 = (double) fArr[1];
                Double.isNaN(d3);
                fArr[1] = (float) (d3 + 1.0d);
            }
            if (a(new String[]{"tel", "phone"}, strArr)) {
                double d4 = (double) fArr[2];
                Double.isNaN(d4);
                fArr[2] = (float) (d4 + 1.0d);
            }
            if (a(new String[]{"search"}, strArr)) {
                double d5 = (double) fArr[4];
                Double.isNaN(d5);
                fArr[4] = (float) (d5 + 1.0d);
            }
            if (optInt >= 0) {
                double d6 = (double) fArr[5];
                Double.isNaN(d6);
                fArr[5] = (float) (d6 + 1.0d);
            }
            if (optInt == 3 || optInt == 2) {
                double d7 = (double) fArr[6];
                Double.isNaN(d7);
                fArr[6] = (float) (d7 + 1.0d);
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                double d8 = (double) fArr[7];
                Double.isNaN(d8);
                fArr[7] = (float) (d8 + 1.0d);
            }
            if (lowerCase3.contains("checkbox")) {
                double d9 = (double) fArr[8];
                Double.isNaN(d9);
                fArr[8] = (float) (d9 + 1.0d);
            }
            if (a(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                double d10 = (double) fArr[10];
                Double.isNaN(d10);
                fArr[10] = (float) (d10 + 1.0d);
            }
            if (lowerCase3.contains("radio") && lowerCase3.contains("button")) {
                double d11 = (double) fArr[12];
                Double.isNaN(d11);
                fArr[12] = (float) (d11 + 1.0d);
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    a(fArr, a(optJSONArray.getJSONObject(i2)));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return null;
        }
    }

    private static float[] a(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            int length = jSONArray.length();
            fArr[3] = (float) (length > 1 ? length - 1 : 0);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    if (b(jSONArray.getJSONObject(i2))) {
                        fArr[9] = fArr[9] + 1.0f;
                    }
                } catch (JSONException unused) {
                }
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            a(jSONObject, sb2, sb);
            String sb3 = sb.toString();
            String sb4 = sb2.toString();
            fArr[15] = a("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[16] = a("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[17] = a("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", sb3) ? 1.0f : 0.0f;
            fArr[18] = str2.contains("password") ? 1.0f : 0.0f;
            fArr[19] = a("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
            fArr[20] = a("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
            fArr[21] = a("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
            fArr[22] = a("ENGLISH", "PURCHASE", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[24] = a("ENGLISH", "PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[25] = a("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb4) ? 1.0f : 0.0f;
            fArr[27] = a("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
            fArr[28] = a("ENGLISH", "LEAD", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[29] = a("ENGLISH", "LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            return fArr;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return null;
        }
    }

    private static boolean a(String[] strArr, String[] strArr2) {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (str2.contains(str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return false;
        }
    }

    static boolean a() {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return false;
        }
        try {
            return f46838e;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return false;
        }
    }

    private static boolean b(JSONObject jSONObject) {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return false;
        }
        try {
            if ((jSONObject.optInt("classtypebitmask") & 32) > 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return false;
        }
    }

    private static JSONObject c(JSONObject jSONObject) {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return null;
            }
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject c2 = c(optJSONArray.getJSONObject(i2));
                if (c2 != null) {
                    return c2;
                }
            }
            return null;
        } catch (JSONException unused) {
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
        }
    }

    private static void a(float[] fArr, float[] fArr2) {
        if (!com.facebook.internal.a.b.a.a(a.class)) {
            int i2 = 0;
            while (true) {
                try {
                    fArr[i2] = fArr[i2] + fArr2[i2];
                    i2++;
                    if (i2 >= 30) {
                        return;
                    }
                } catch (Throwable th) {
                    com.facebook.internal.a.b.a.a(th, a.class);
                    return;
                }
            }
        }
    }

    private static boolean a(String str, String str2) {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return false;
        }
    }

    private static boolean a(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        boolean z2;
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int i2 = 0;
            while (true) {
                if (i2 >= optJSONArray.length()) {
                    z = false;
                    z2 = false;
                    break;
                } else if (optJSONArray.getJSONObject(i2).optBoolean("is_interacted")) {
                    z = true;
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    jSONArray.put(optJSONArray.getJSONObject(i3));
                }
            } else {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i4);
                    if (a(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z2;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return false;
        }
    }

    static String a(String str, String str2, String str3) {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return null;
        }
        try {
            return (str3 + " | " + str2 + ", " + str).toLowerCase();
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return null;
        }
    }

    private static void a(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (!com.facebook.internal.a.b.a.a(a.class)) {
            try {
                String lowerCase = jSONObject.optString("text", "").toLowerCase();
                String lowerCase2 = jSONObject.optString("hint", "").toLowerCase();
                if (!lowerCase.isEmpty()) {
                    sb.append(lowerCase).append(" ");
                }
                if (!lowerCase2.isEmpty()) {
                    sb2.append(lowerCase2).append(" ");
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                if (optJSONArray != null) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        try {
                            a(optJSONArray.getJSONObject(i2), sb, sb2);
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, a.class);
            }
        }
    }

    private static boolean a(String str, String str2, String str3, String str4) {
        if (com.facebook.internal.a.b.a.a(a.class)) {
            return false;
        }
        try {
            return a(f46837d.optJSONObject("rulesForLanguage").optJSONObject(f46834a.get(str)).optJSONObject("rulesForEvent").optJSONObject(f46835b.get(str2)).optJSONObject("positiveRules").optString(f46836c.get(str3)), str4);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, a.class);
            return false;
        }
    }
}
