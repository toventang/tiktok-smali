package com.ss.android.ugc.aweme.i18n.xbridge.d;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f100050a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(63760);
    }

    public static Activity a(WeakReference<Context> weakReference) {
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
}
