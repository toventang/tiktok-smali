package com.samsung.sdk.sperf;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public class SPerf {
    private static SPerfManager sPerfManager;

    static {
        Covode.recordClassIndex(35504);
    }

    private SPerf() {
    }

    public static int getVersionCode() {
        return 1;
    }

    public static String getVersionName() {
        return "v1.0.0";
    }

    public static boolean initialize(Context context) {
        if (context == null || !Boost.init()) {
            return false;
        }
        SPerfManager createInstance = SPerfManager.createInstance(context);
        sPerfManager = createInstance;
        return createInstance != null;
    }

    private static boolean isFeatureEnabled(int i2) {
        return sPerfManager != null;
    }

    public static void setDebugModeEnabled(boolean z) {
        SPerfUtil.setDebug(z);
    }
}
