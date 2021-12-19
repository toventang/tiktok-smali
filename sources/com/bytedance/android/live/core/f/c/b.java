package com.bytedance.android.live.core.f.c;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.live.core.f.ad;
import com.bytedance.covode.number.Covode;
import i.a.a.a.a.a;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private static String f9060a;

    /* renamed from: b  reason: collision with root package name */
    private static String f9061b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f9062c;

    static {
        boolean z;
        Covode.recordClassIndex(4636);
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        f9062c = z;
    }

    public static String a() {
        if (f9060a == null) {
            if (!TextUtils.isEmpty(ad.a("ro.miui.ui.version.name"))) {
                f9061b = ad.a("ro.miui.ui.version.name");
                f9060a = "MIUI";
            } else if (!TextUtils.isEmpty(ad.a("ro.build.version.emui"))) {
                f9061b = ad.a("ro.build.version.emui");
                f9060a = "EMUI";
            } else if (!TextUtils.isEmpty(ad.a("ro.build.version.opporom"))) {
                f9061b = ad.a("ro.build.version.opporom");
                f9060a = "OPPO";
            } else if (!TextUtils.isEmpty(ad.a("ro.vivo.os.version"))) {
                f9061b = ad.a("ro.vivo.os.version");
                f9060a = "VIVO";
            } else if (!TextUtils.isEmpty(ad.a("ro.smartisan.version"))) {
                f9061b = ad.a("ro.smartisan.version");
                f9060a = "SMARTISAN";
            } else {
                String str = Build.DISPLAY;
                f9061b = str;
                if (str.toUpperCase().contains("FLYME")) {
                    f9060a = "FLYME";
                } else {
                    f9061b = "unknown";
                    f9060a = Build.MANUFACTURER.toUpperCase();
                }
            }
            f9060a.equals("");
        }
        return f9060a;
    }
}
