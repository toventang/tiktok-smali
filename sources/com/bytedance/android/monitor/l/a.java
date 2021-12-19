package com.bytedance.android.monitor.l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(13976);
    }

    public static Activity a(View view) {
        return a(view.getContext());
    }

    public static Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            try {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } catch (Exception unused) {
                HybridMonitor.getInstance().getExceptionHandler();
                return null;
            }
        }
        return null;
    }
}
