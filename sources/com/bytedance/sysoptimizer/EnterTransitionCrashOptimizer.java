package com.bytedance.sysoptimizer;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public class EnterTransitionCrashOptimizer {
    private static Context sContext;

    static {
        Covode.recordClassIndex(26978);
    }

    public static Context getContext() {
        return sContext;
    }

    public static void fix(Context context) {
        sContext = context;
    }
}
