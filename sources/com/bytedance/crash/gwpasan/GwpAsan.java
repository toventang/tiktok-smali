package com.bytedance.crash.gwpasan;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.crash.m;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.r;
import com.bytedance.crash.util.v;
import com.bytedance.librarian.Librarian;
import java.io.File;
import org.json.JSONArray;

public class GwpAsan {

    /* renamed from: g  reason: collision with root package name */
    public static String f27591g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f27592h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f27593i;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f27594j;

    /* renamed from: k  reason: collision with root package name */
    public static File f27595k;

    /* renamed from: l  reason: collision with root package name */
    public static Context f27596l;

    /* renamed from: m  reason: collision with root package name */
    static String f27597m;
    private static File o;

    /* renamed from: a  reason: collision with root package name */
    public int f27598a;

    /* renamed from: b  reason: collision with root package name */
    public int f27599b;

    /* renamed from: c  reason: collision with root package name */
    public int f27600c;

    /* renamed from: d  reason: collision with root package name */
    public int f27601d;

    /* renamed from: e  reason: collision with root package name */
    public int f27602e;

    /* renamed from: f  reason: collision with root package name */
    public int f27603f;
    private boolean n;

    static {
        Covode.recordClassIndex(16198);
    }

    public static native void GwpAsanSetParams(int i2, int i3, String str, String str2, String str3);

    public static native int gwpAsanNativeInit(int i2, int i3, int i4, int i5, int i6);

    public final boolean a() {
        v.a("XASAN", "loadLibrary...");
        if (!this.n) {
            try {
                Librarian.b("npth_xasan", true, f27596l);
                this.n = true;
            } catch (Throwable unused) {
            }
        }
        return this.n;
    }

    public static boolean b() {
        File b2 = r.b(m.f27724a);
        if (!b2.exists() || !b2.isDirectory()) {
            b2.mkdirs();
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (a(b2, "gwpfile")) {
            try {
                long parseLong = Long.parseLong(j.a(o, "\n"));
                if (currentTimeMillis >= parseLong && currentTimeMillis - parseLong < 259200) {
                    d.a("XAsanCheckTime Less than 3 day lastTime:" + parseLong + " currentTime:" + currentTimeMillis, "EnsureNotReachHere", null);
                    return false;
                } else if (currentTimeMillis >= parseLong && currentTimeMillis - parseLong >= 259200) {
                    j.a(o);
                    return true;
                } else if (parseLong > currentTimeMillis) {
                    d.a("XAsanCheckTime lastTime:" + parseLong + " currentTime:" + currentTimeMillis, "EnsureNotReachHere", null);
                    return false;
                }
            } catch (Throwable th) {
                d.a("NPTH_CATCH", th);
            }
        }
        return true;
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append((CharSequence) str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable unused) {
        }
        return sb.toString().toUpperCase();
    }

    private static boolean a(File file, String str) {
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            try {
                if (!file2.getName().isEmpty() && !file2.isDirectory() && file2.getName().equals(str) && file2.length() > 0) {
                    o = file2.getAbsoluteFile();
                    return true;
                }
            } catch (Throwable th) {
                d.a("NPTH_CATCH", th);
            }
        }
        return false;
    }

    public static int a(JSONArray jSONArray, int i2, String str) {
        while (i2 < jSONArray.length()) {
            String optString = jSONArray.optString(i2, null);
            if (optString != null && optString.startsWith(str)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public GwpAsan(Context context, File file, int i2, int i3, int i4, int i5, int i6, int i7) {
        f27596l = context == null ? m.f27724a : context;
        f27595k = file;
        this.f27599b = i3;
        this.f27600c = i4;
        this.f27601d = i5;
        this.f27598a = i6;
        this.f27603f = i7;
        this.f27602e = i2;
        f27593i = false;
        f27594j = false;
    }
}
