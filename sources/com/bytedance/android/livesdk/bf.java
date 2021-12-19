package com.bytedance.android.livesdk;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class bf {

    /* renamed from: c  reason: collision with root package name */
    private static volatile bf f14204c;

    /* renamed from: a  reason: collision with root package name */
    boolean f14205a;

    /* renamed from: b  reason: collision with root package name */
    public final t<Boolean> f14206b = new t<>();

    /* renamed from: d  reason: collision with root package name */
    private int f14207d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14208e;

    static {
        Covode.recordClassIndex(7870);
    }

    private bf() {
    }

    public final void b() {
        if (this.f14205a) {
            this.f14207d++;
        }
    }

    public final void e() {
        if (this.f14205a) {
            this.f14205a = false;
            this.f14207d = 0;
            this.f14208e = false;
        }
    }

    private void f() {
        if (this.f14207d == 0 && !this.f14208e) {
            this.f14206b.postValue(true);
        }
    }

    public final void c() {
        if (this.f14205a) {
            int i2 = this.f14207d - 1;
            this.f14207d = i2;
            if (i2 < 0) {
                this.f14207d = 0;
            }
            if (this.f14207d == 0) {
                f();
            }
        }
    }

    public final boolean d() {
        if (!this.f14205a) {
            return false;
        }
        if (this.f14207d != 0 || this.f14208e) {
            return true;
        }
        return false;
    }

    public static bf a() {
        MethodCollector.i(10784);
        if (f14204c == null) {
            synchronized (bf.class) {
                try {
                    if (f14204c == null) {
                        f14204c = new bf();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10784);
                    throw th;
                }
            }
        }
        bf bfVar = f14204c;
        MethodCollector.o(10784);
        return bfVar;
    }

    public final void a(boolean z) {
        if (this.f14205a) {
            this.f14208e = z;
            if (!z) {
                f();
            }
        }
    }
}
