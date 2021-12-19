package com.bytedance.sysoptimizer.java;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.Collections;

public class OppoNAlarmProtector {
    private static boolean sIsInit;

    static {
        Covode.recordClassIndex(27024);
    }

    public static void install(Context context) {
        if (Build.VERSION.SDK_INT == 25 && Build.MANUFACTURER.equals("oppo") && context != null && !sIsInit) {
            sIsInit = BinderServiceWrapperProtector.install(context, "alarm", Collections.singletonList("set"), "OppoNAlarm", BinderServiceWrapperProtector.VOID_ADMIN_RESULT);
        }
    }
}
