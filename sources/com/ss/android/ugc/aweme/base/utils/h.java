package com.ss.android.ugc.aweme.base.utils;

import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.zhiliaoapp.musically.R;

public final class h {
    static {
        Covode.recordClassIndex(42134);
    }

    public static int a(int i2) {
        return d.a().getResources().getColor(i2);
    }

    public static String b(int i2) {
        return d.a().getResources().getString(i2);
    }

    public static int a(Resources resources) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(R.integer.ar);
        if (matchConfig == null) {
            return resources.getInteger(R.integer.ar);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(R.integer.ar);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(R.integer.ar);
        }
    }
}
