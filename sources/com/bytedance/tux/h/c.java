package com.bytedance.tux.h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    static {
        Covode.recordClassIndex(27503);
    }

    public static final Activity a(Context context) {
        l.c(context, "");
        while (context != null) {
            if (!(context instanceof Activity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (Activity) context;
            }
        }
        return null;
    }
}
