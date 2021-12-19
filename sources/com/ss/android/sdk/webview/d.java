package com.ss.android.sdk.webview;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class d {
    static {
        Covode.recordClassIndex(37174);
    }

    public static Context a(Context context) {
        while (context != null) {
            if ((context instanceof Activity) || !(context instanceof ContextWrapper)) {
                return context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static Activity b(WeakReference<Context> weakReference) {
        if (weakReference == null) {
            return null;
        }
        for (Context context = weakReference.get(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public static Context a(WeakReference<Context> weakReference) {
        if (weakReference == null) {
            return null;
        }
        Context context = weakReference.get();
        while (context != null) {
            if ((context instanceof Activity) || !(context instanceof ContextWrapper)) {
                return context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
