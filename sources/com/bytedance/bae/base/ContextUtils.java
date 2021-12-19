package com.bytedance.bae.base;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public class ContextUtils {
    private static Context applicationContext;

    static {
        Covode.recordClassIndex(15328);
    }

    public static Context getApplicationContext() {
        return applicationContext;
    }

    public static void initialize(Context context) {
        if (context != null) {
            applicationContext = context;
            return;
        }
        throw new IllegalArgumentException("Application context cannot be null for ContextUtils.initialize.");
    }

    public static void setApplicationContext(Context context) {
        if (context != null) {
            applicationContext = context;
            return;
        }
        throw new IllegalArgumentException("Application context cannot be null for ContextUtils.initialize.");
    }
}
