package com.ss.android.ugc.aweme.account.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class r {
    static {
        Covode.recordClassIndex(40282);
    }

    public static synchronized PackageInfo a(Context context, String str) {
        PackageInfo packageInfo;
        synchronized (r.class) {
            MethodCollector.i(9948);
            packageInfo = null;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str, 1);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            MethodCollector.o(9948);
        }
        return packageInfo;
    }
}
