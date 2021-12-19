package com.google.android.gms.measurement.module;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.measurement.internal.ff;

public class Analytics {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Analytics f52097a;

    /* renamed from: b  reason: collision with root package name */
    private final ff f52098b;

    static {
        Covode.recordClassIndex(32392);
    }

    private Analytics(ff ffVar) {
        r.a(ffVar);
        this.f52098b = ffVar;
    }

    public static Analytics getInstance(Context context) {
        MethodCollector.i(6649);
        if (f52097a == null) {
            synchronized (Analytics.class) {
                try {
                    if (f52097a == null) {
                        f52097a = new Analytics(ff.a(context, null, null));
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6649);
                    throw th;
                }
            }
        }
        Analytics analytics = f52097a;
        MethodCollector.o(6649);
        return analytics;
    }
}
