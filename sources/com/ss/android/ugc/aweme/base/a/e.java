package com.ss.android.ugc.aweme.base.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;

public final class e {
    static {
        Covode.recordClassIndex(41843);
    }

    public static final Activity a(Context context) {
        while (context != null && !(context instanceof Application)) {
            if (!(context instanceof Activity)) {
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                    if (context == null) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return (Activity) context;
            }
        }
        return null;
    }
}
