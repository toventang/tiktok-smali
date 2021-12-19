package com.bytedance.android.livesdk;

import com.bytedance.android.livesdkapi.host.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static l f21748a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final u f21749b = new u();

    /* renamed from: c  reason: collision with root package name */
    private static int f21750c;

    public static final class a implements l {
        static {
            Covode.recordClassIndex(12821);
        }

        @Override // com.bytedance.android.livesdkapi.host.l
        public final boolean a() {
            return false;
        }

        a() {
        }
    }

    private u() {
    }

    static {
        Covode.recordClassIndex(12820);
    }

    public final synchronized boolean a() {
        MethodCollector.i(10956);
        int i2 = f21750c;
        boolean z = false;
        if (i2 > 0) {
            MethodCollector.o(10956);
            return false;
        }
        try {
            f21750c = i2 + 1;
            boolean a2 = f21748a.a();
            f21750c = 0;
            z = a2;
        } catch (Exception unused) {
            f21750c = 0;
        } catch (Throwable th) {
            f21750c = 0;
            MethodCollector.o(10956);
            throw th;
        }
        MethodCollector.o(10956);
        return z;
    }
}
