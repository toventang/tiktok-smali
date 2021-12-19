package com.b.a.a;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f5995a;

    static {
        Covode.recordClassIndex(2816);
    }

    public static void a(Context context) {
        if (context != null && b.f5993a) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (a.f107168c) {
                    if (applicationContext == null) {
                        applicationContext = a.f107166a;
                    }
                }
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
                f5995a = true;
            } catch (Throwable unused) {
            }
        }
    }
}
