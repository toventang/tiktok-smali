package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f54624a;

    static {
        Covode.recordClassIndex(33895);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle(this.f54624a);
        for (String str : this.f54624a.keySet()) {
            if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final Bundle d() {
        Bundle bundle = new Bundle(this.f54624a);
        for (String str : this.f54624a.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final long[] a() {
        JSONArray g2 = g("gcm.n.vibrate_timings");
        if (g2 == null) {
            return null;
        }
        try {
            if (g2.length() > 1) {
                int length = g2.length();
                long[] jArr = new long[length];
                for (int i2 = 0; i2 < length; i2++) {
                    jArr[i2] = g2.optLong(i2);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            String.valueOf(String.valueOf(g2)).length();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final int[] b() {
        JSONArray g2 = g("gcm.n.light_settings");
        if (g2 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (g2.length() == 3) {
                int parseColor = Color.parseColor(g2.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = g2.optInt(1);
                    iArr[2] = g2.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            String.valueOf(String.valueOf(g2)).length();
            return null;
        } catch (IllegalArgumentException e2) {
            String valueOf = String.valueOf(g2);
            String message = e2.getMessage();
            String.valueOf(valueOf).length();
            String.valueOf(message).length();
            return null;
        }
    }

    public o(Bundle bundle) {
        Objects.requireNonNull(bundle, "data");
        this.f54624a = new Bundle(bundle);
    }

    private static String h(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    private static String i(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    public static boolean a(Bundle bundle) {
        if ("1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(i("gcm.n.e")))) {
            return true;
        }
        return false;
    }

    private String e(String str) {
        if (!this.f54624a.containsKey(str) && str.startsWith("gcm.n.")) {
            String i2 = i(str);
            if (this.f54624a.containsKey(i2)) {
                return i2;
            }
        }
        return str;
    }

    public final boolean b(String str) {
        String a2 = a(str);
        if ("1".equals(a2) || Boolean.parseBoolean(a2)) {
            return true;
        }
        return false;
    }

    private Object[] f(String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if ("_loc_args".length() != 0) {
            str2 = valueOf.concat("_loc_args");
        } else {
            str2 = new String(valueOf);
        }
        JSONArray g2 = g(str2);
        if (g2 == null) {
            return null;
        }
        int length = g2.length();
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = g2.optString(i2);
        }
        return strArr;
    }

    private JSONArray g(String str) {
        String a2 = a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            return new JSONArray(a2);
        } catch (JSONException unused) {
            String.valueOf(h(str)).length();
            String.valueOf(a2).length();
            return null;
        }
    }

    public final String a(String str) {
        return this.f54624a.getString(e(str));
    }

    public final Integer c(String str) {
        String a2 = a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(a2));
        } catch (NumberFormatException unused) {
            String.valueOf(h(str)).length();
            String.valueOf(a2).length();
            return null;
        }
    }

    public final Long d(String str) {
        String a2 = a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(a2));
        } catch (NumberFormatException unused) {
            String.valueOf(h(str)).length();
            String.valueOf(a2).length();
            return null;
        }
    }

    public final String a(Resources resources, String str, String str2) {
        String a2 = a(str2);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        return b(resources, str, str2);
    }

    private String b(Resources resources, String str, String str2) {
        String str3;
        String str4;
        String valueOf = String.valueOf(str2);
        if ("_loc_key".length() != 0) {
            str3 = valueOf.concat("_loc_key");
        } else {
            str3 = new String(valueOf);
        }
        String a2 = a(str3);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        int identifier = resources.getIdentifier(a2, "string", str);
        if (identifier == 0) {
            String valueOf2 = String.valueOf(str2);
            if ("_loc_key".length() != 0) {
                str4 = valueOf2.concat("_loc_key");
            } else {
                str4 = new String(valueOf2);
            }
            String.valueOf(h(str4)).length();
            String.valueOf(str2).length();
            return null;
        }
        Object[] f2 = f(str2);
        if (f2 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, f2);
        } catch (MissingFormatArgumentException unused) {
            String h2 = h(str2);
            String arrays = Arrays.toString(f2);
            String.valueOf(h2).length();
            String.valueOf(arrays).length();
            return null;
        }
    }
}
