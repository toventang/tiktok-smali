package com.bytedance.sdk.a.f;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.a.k.a.a;

public class g implements a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f43202a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f43203b;

    static {
        Covode.recordClassIndex(26493);
    }

    private g(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f43203b = applicationContext;
    }

    public static a a(Context context) {
        MethodCollector.i(11459);
        if (f43202a == null) {
            synchronized (g.class) {
                try {
                    if (f43202a == null) {
                        f43202a = new g(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11459);
                    throw th;
                }
            }
        }
        a aVar = f43202a;
        MethodCollector.o(11459);
        return aVar;
    }
}
