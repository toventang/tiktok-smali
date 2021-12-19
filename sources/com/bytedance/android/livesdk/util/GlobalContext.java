package com.bytedance.android.livesdk.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public class GlobalContext {
    private static Context sApplication;

    static {
        Covode.recordClassIndex(13022);
    }

    public static Context getApplicationContext() {
        return sApplication;
    }

    public static void setApplicationContext(Context context) {
        sApplication = context;
    }
}
