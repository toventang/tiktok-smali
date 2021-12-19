package com.bytedance.monitor.collector;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.a.b.a;
import com.bytedance.monitor.a.b.c;
import com.bytedance.monitor.a.b.d;
import com.bytedance.monitor.a.b.e;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public String f41450a;

    /* renamed from: b  reason: collision with root package name */
    protected int f41451b;

    /* renamed from: c  reason: collision with root package name */
    protected int f41452c = 1;

    /* renamed from: d  reason: collision with root package name */
    protected volatile boolean f41453d;

    /* renamed from: e  reason: collision with root package name */
    protected d f41454e;

    static {
        Covode.recordClassIndex(25395);
    }

    /* access modifiers changed from: package-private */
    public Pair<String, ?> a(long j2, long j3) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f41451b = 1;
    }

    /* access modifiers changed from: protected */
    public abstract void b(int i2);

    /* access modifiers changed from: package-private */
    public Pair<String, ?> c() {
        return null;
    }

    public void a() {
        if (this.f41451b >= 0) {
            this.f41451b = 2;
            return;
        }
        throw new IllegalStateException("collector has destroyed, can not start.");
    }

    public final void a(final int i2) {
        e a2 = c.a("refreshConfig", new Runnable() {
            /* class com.bytedance.monitor.collector.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25396);
            }

            public final void run() {
                int i2;
                if (b.this.f41451b >= 0 && b.this.f41451b == 2 && b.this.f41452c != (i2 = i2)) {
                    b.this.f41452c = i2;
                    b.this.b(i2);
                }
            }
        });
        d dVar = this.f41454e;
        if (dVar != null) {
            dVar.a(a2);
        }
    }

    public b(int i2, String str) {
        this.f41450a = str;
        this.f41452c = i2;
        k a2 = k.a();
        if (!a2.f41546b.contains(this)) {
            a2.f41546b.add(this);
            if (a2.f41548d) {
                a();
            }
        }
        this.f41454e = a.C1013a.f41371a;
    }
}
