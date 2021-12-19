package com.bytedance.android.livesdk;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class g {

    /* renamed from: b  reason: collision with root package name */
    private static volatile g f17809b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile int f17810c;

    /* renamed from: a  reason: collision with root package name */
    public t<Boolean> f17811a = new t<>();

    static {
        Covode.recordClassIndex(9890);
    }

    public final void b() {
        f17810c++;
        this.f17811a.postValue(true);
    }

    public final void c() {
        int i2 = f17810c - 1;
        f17810c = i2;
        if (i2 < 0) {
            f17810c = 0;
        }
        if (f17810c == 0) {
            this.f17811a.postValue(false);
        }
    }

    public static g a() {
        MethodCollector.i(11115);
        if (f17809b == null) {
            synchronized (g.class) {
                try {
                    if (f17809b == null) {
                        f17809b = new g();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11115);
                    throw th;
                }
            }
        }
        g gVar = f17809b;
        MethodCollector.o(11115);
        return gVar;
    }
}
