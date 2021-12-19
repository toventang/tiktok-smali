package com.bytedance.lighten.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static Context f39857a;

    static {
        Covode.recordClassIndex(24605);
    }

    public static void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        f39857a = applicationContext;
    }
}
