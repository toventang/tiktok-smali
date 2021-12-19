package com.bytedance.common.utility.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.lancet.c.b;

public final class a {
    static {
        Covode.recordClassIndex(15871);
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static int a(Context context, String str) {
        Object b2 = b(context, str);
        if (b2 == null) {
            return -1;
        }
        return ((Integer) b2).intValue();
    }

    private static Object b(Context context, String str) {
        ApplicationInfo applicationInfo;
        if (context == null) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (TextUtils.equals(packageName, d.a().getPackageName())) {
                if (b.f107191a == null) {
                    b.f107191a = packageManager.getApplicationInfo(packageName, 128);
                }
                applicationInfo = b.f107191a;
            } else {
                applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            }
            return a(applicationInfo.metaData, str);
        } catch (Exception unused) {
            return null;
        }
    }
}
