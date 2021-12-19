package com.ss.android.ad.splash.core.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.core.b.b;

public class a extends b {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f58341c;

    static {
        Covode.recordClassIndex(36233);
    }

    @Override // com.ss.android.ad.splash.core.b.b
    public final /* bridge */ /* synthetic */ b.c a() {
        return super.a();
    }

    private a(Context context) {
        super(context);
    }

    public static a a(Context context) {
        MethodCollector.i(3124);
        if (f58341c == null) {
            synchronized (a.class) {
                try {
                    if (f58341c == null) {
                        f58341c = new a(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3124);
                    throw th;
                }
            }
        }
        a aVar = f58341c;
        MethodCollector.o(3124);
        return aVar;
    }
}
