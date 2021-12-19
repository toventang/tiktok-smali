package com.bytedance.android.live.core.f;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(4594);
    }

    public static Activity a(Context context) {
        while (context != null) {
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

    public static e b(Context context) {
        while (context != null) {
            if (context instanceof e) {
                return (e) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
