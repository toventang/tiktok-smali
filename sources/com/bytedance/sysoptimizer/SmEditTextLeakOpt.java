package com.bytedance.sysoptimizer;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public class SmEditTextLeakOpt {
    private static final String TAG = SmEditTextLeakOpt.class.getName();

    public static int com_bytedance_sysoptimizer_SmEditTextLeakOpt_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(27006);
    }

    public static void optimize(Application application) {
        try {
            if ("samsung".equalsIgnoreCase(Build.MANUFACTURER) && Build.VERSION.SDK_INT < 23) {
                int i2 = Build.VERSION.SDK_INT;
                Method declaredMethod = Class.forName("android.sec.clipboard.ClipboardUIManager").getDeclaredMethod("getInstance", Context.class);
                declaredMethod.setAccessible(true);
                com_bytedance_sysoptimizer_SmEditTextLeakOpt_com_ss_android_ugc_aweme_lancet_LogLancet_i(TAG, Build.MANUFACTURER + "," + declaredMethod.invoke(null, application).toString());
            }
        } catch (Throwable unused) {
        }
    }
}
