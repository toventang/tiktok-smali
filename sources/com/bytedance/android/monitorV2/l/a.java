package com.bytedance.android.monitorV2.l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(14156);
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
                HybridMultiMonitor.getInstance().getExceptionHandler();
                return null;
            }
        }
        return null;
    }
}
