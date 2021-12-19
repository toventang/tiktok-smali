package com.bytedance.lottie.f;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(24977);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
