package com.ss.bytertc.base.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;
import org.webrtc.ContextUtils;

public class RtcContextUtils {
    private static Context applicationContext;

    static {
        Covode.recordClassIndex(100729);
    }

    public static Context getApplicationContext() {
        return ContextUtils.getApplicationContext();
    }

    public static Context com_ss_bytertc_base_utils_RtcContextUtils_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext2 = context.getApplicationContext();
        if (a.f107168c && applicationContext2 == null) {
            return a.f107166a;
        }
        return applicationContext2;
    }

    public static void initialize(Context context) {
        if (context != null) {
            ContextUtils.initialize(com_ss_bytertc_base_utils_RtcContextUtils_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context));
            return;
        }
        throw new IllegalArgumentException("Application context cannot be null for ContextUtils.initialize.");
    }
}
