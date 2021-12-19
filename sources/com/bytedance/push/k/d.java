package com.bytedance.push.k;

import android.os.Build;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.f;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static String f42234a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f42235b;

    /* renamed from: c  reason: collision with root package name */
    private static final f f42236c;

    /* renamed from: d  reason: collision with root package name */
    private static String f42237d;

    public static boolean a() {
        if (!f.c()) {
            return false;
        }
        try {
            if (Integer.parseInt(f42236c.a("ro.miui.ui.version.name").substring(1)) >= 12) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    private static boolean b() {
        String str = Build.MANUFACTURER;
        if (!m.a(str)) {
            return str.toLowerCase().contains("oppo");
        }
        return false;
    }

    private static boolean c() {
        try {
            String a2 = f42236c.a("ro.build.version.emui");
            f42237d = a2;
            if (m.a(a2)) {
                return false;
            }
            f42237d = f42237d.toLowerCase();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(25803);
        String valueOf = String.valueOf(Build.VERSION.SDK);
        f42235b = valueOf;
        f fVar = new f();
        f42236c = fVar;
        f42234a = valueOf;
        try {
            if (c()) {
                if (m.a(f42237d)) {
                    f42237d = fVar.a("ro.build.version.emui");
                }
                String lowerCase = (f42237d + "_" + Build.DISPLAY).toLowerCase();
                if (!m.a(lowerCase)) {
                    valueOf = lowerCase.toLowerCase();
                }
            } else {
                String a2 = fVar.a("ro.vivo.os.build.display.id");
                if (!m.a(a2) && a2.toLowerCase().contains("funtouch")) {
                    valueOf = (fVar.a("ro.vivo.os.build.display.id") + "_" + fVar.a("ro.vivo.product.version")).toLowerCase();
                } else if (b()) {
                    if (b()) {
                        valueOf = ("coloros_" + fVar.a("ro.build.version.opporom") + "_" + Build.DISPLAY).toLowerCase();
                    }
                } else if (f.c()) {
                    valueOf = ("miui_" + fVar.a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL).toLowerCase();
                }
            }
        } catch (Throwable unused) {
            valueOf = null;
        }
        if (m.a(valueOf)) {
            valueOf = f42235b;
        }
        f42234a = valueOf;
    }
}
