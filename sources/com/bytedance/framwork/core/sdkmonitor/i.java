package com.bytedance.framwork.core.sdkmonitor;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.b.e.d;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static String f29544a;

    static {
        Covode.recordClassIndex(17194);
    }

    public static String a(Context context) {
        if (f29544a == null) {
            String replace = d.a().replace(context.getPackageName(), "p").replace(":", "_");
            f29544a = replace;
            f29544a = replace.replace(".", "_");
        }
        return f29544a;
    }
}
