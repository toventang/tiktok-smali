package com.bytedance.android.livesdk.util;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static Set<Class<? extends Activity>> f22113a = new HashSet();

    static {
        Covode.recordClassIndex(13024);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.Set<java.lang.Class<? extends android.app.Activity>> */
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity) {
        if (activity != null) {
            f22113a.add(activity.getClass());
        }
    }
}
