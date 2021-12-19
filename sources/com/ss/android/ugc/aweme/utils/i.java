package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;

public final class i {
    static {
        Covode.recordClassIndex(93659);
    }

    public static Activity a(Context context) {
        while (context != null && !(context instanceof Application)) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
