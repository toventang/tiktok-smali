package com.kakao.util.apicompatibility;

import android.content.Intent;
import android.os.Build;
import com.bytedance.covode.number.Covode;

public abstract class APICompatibility {
    private static volatile APICompatibility instance;

    static {
        Covode.recordClassIndex(34472);
    }

    public abstract String getSmsMessage(Intent intent);

    public static APICompatibility getInstance() {
        if (instance == null) {
            synchronized (APICompatibility.class) {
                if (instance == null) {
                    if (Build.VERSION.SDK_INT > 20) {
                        instance = new APILevel21Compatibility();
                    } else {
                        instance = new APILevel19Compatibility();
                    }
                }
            }
        }
        return instance;
    }
}
