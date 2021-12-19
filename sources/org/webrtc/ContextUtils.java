package org.webrtc;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public class ContextUtils {
    private static Context applicationContext;

    static {
        Covode.recordClassIndex(106554);
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
}
