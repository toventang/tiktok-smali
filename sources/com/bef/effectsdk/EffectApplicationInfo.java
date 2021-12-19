package com.bef.effectsdk;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;

public class EffectApplicationInfo {
    private static Context appContext;

    static {
        Covode.recordClassIndex(2829);
    }

    private static native int nativeSetHomeDir(String str);

    public static Context getAppContext() {
        return appContext;
    }

    private static void onSetAppContext() {
        MethodCollector.i(1620);
        Context context = appContext;
        if (context != null) {
            nativeSetHomeDir(com_bef_effectsdk_EffectApplicationInfo_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context).getAbsolutePath());
        }
        MethodCollector.o(1620);
    }

    public static void setAppContext(Context context) {
        appContext = context;
        onSetAppContext();
    }

    public static File com_bef_effectsdk_EffectApplicationInfo_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }
}
