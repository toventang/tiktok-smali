package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.c.c;
import com.google.android.gms.common.g;
import com.google.android.gms.common.h;

public final class n {
    static {
        Covode.recordClassIndex(31476);
    }

    public static boolean a(Context context, int i2) {
        if (!a(context, i2, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            h a2 = h.a(context);
            if (packageInfo != null) {
                if (h.a(packageInfo, false)) {
                    return true;
                }
                if (!h.a(packageInfo, true) || !g.b(a2.f50304a)) {
                    return false;
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean a(Context context, int i2, String str) {
        return c.f50295a.a(context).a(i2, str);
    }
}
