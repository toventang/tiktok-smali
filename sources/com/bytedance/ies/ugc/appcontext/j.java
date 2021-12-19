package com.bytedance.ies.ugc.appcontext;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import h.f.b.l;

public final class j {
    static {
        Covode.recordClassIndex(20760);
    }

    public static final d.c a(Context context) {
        PackageInfo packageInfo;
        String str = "";
        l.d(context, str);
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Exception e2) {
            e2.printStackTrace();
            packageInfo = null;
        }
        long j2 = -1;
        if (packageInfo != null) {
            String str2 = packageInfo.versionName;
            l.b(str2, str);
            j2 = (long) packageInfo.versionCode;
            str = str2;
        }
        return new d.c(j2, str);
    }

    public static final d.a b(Context context) {
        String str;
        long j2;
        l.d(context, "");
        String i2 = d.i();
        long h2 = d.h();
        try {
            str = (String) k.a(context, "SS_VERSION_NAME");
            l.b(str, "");
        } catch (Throwable unused) {
            str = i2;
        }
        try {
            h2 = (long) k.b(context, "SS_VERSION_CODE");
        } catch (Throwable unused2) {
        }
        try {
            j2 = (long) k.b(context, "UPDATE_VERSION_CODE");
        } catch (Throwable unused3) {
            j2 = -1;
        }
        return new d.a(h2, str, j2);
    }

    public static final String a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        try {
            Object a2 = h.a(context).a(str);
            if (!(a2 instanceof String)) {
                return "";
            }
            return (String) a2;
        } catch (Exception unused) {
            return null;
        }
    }
}
