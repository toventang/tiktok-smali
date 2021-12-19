package com.google.android.gms.common.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static c f50295a = new c();

    /* renamed from: b  reason: collision with root package name */
    private b f50296b;

    static {
        Covode.recordClassIndex(31353);
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public final synchronized b a(Context context) {
        b bVar;
        MethodCollector.i(13389);
        if (this.f50296b == null) {
            if (b(context) != null) {
                context = b(context);
            }
            this.f50296b = new b(context);
        }
        bVar = this.f50296b;
        MethodCollector.o(13389);
        return bVar;
    }
}
