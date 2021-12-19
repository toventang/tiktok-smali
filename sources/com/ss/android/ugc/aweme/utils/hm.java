package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class hm {
    static {
        Covode.recordClassIndex(93634);
    }

    public static synchronized PackageInfo a(Context context, String str) {
        PackageInfo packageInfo;
        synchronized (hm.class) {
            MethodCollector.i(9093);
            packageInfo = null;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str, 1);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            MethodCollector.o(9093);
        }
        return packageInfo;
    }
}
