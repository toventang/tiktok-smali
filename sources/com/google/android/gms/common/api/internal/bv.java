package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import java.lang.ref.WeakReference;

public final class bv<R extends p> extends t<R> implements q<R> {

    /* renamed from: a  reason: collision with root package name */
    s<? super R, ? extends p> f50118a;

    /* renamed from: b  reason: collision with root package name */
    bv<? extends p> f50119b;

    /* renamed from: c  reason: collision with root package name */
    volatile r<? super R> f50120c;

    /* renamed from: d  reason: collision with root package name */
    k<R> f50121d;

    /* renamed from: e  reason: collision with root package name */
    final Object f50122e;

    /* renamed from: f  reason: collision with root package name */
    Status f50123f;

    /* renamed from: g  reason: collision with root package name */
    final WeakReference<i> f50124g;

    /* renamed from: h  reason: collision with root package name */
    final bw f50125h;

    /* renamed from: i  reason: collision with root package name */
    boolean f50126i;

    static {
        Covode.recordClassIndex(31265);
    }

    private final boolean a() {
        i iVar = this.f50124g.get();
        if (this.f50120c == null || iVar == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(Status status) {
        MethodCollector.i(11768);
        synchronized (this.f50122e) {
            try {
                this.f50123f = status;
                b(status);
            } finally {
                MethodCollector.o(11768);
            }
        }
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(R r) {
        MethodCollector.i(11767);
        synchronized (this.f50122e) {
            try {
                if (!r.D_().c()) {
                    a(r.D_());
                } else if (this.f50118a != null) {
                    bo.f50104a.submit(new bx(this, r));
                } else {
                    a();
                }
            } finally {
                MethodCollector.o(11767);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(Status status) {
        MethodCollector.i(11769);
        synchronized (this.f50122e) {
            try {
                if (this.f50118a != null) {
                    com.google.android.gms.common.internal.r.a(status, "onFailure must not return null");
                    this.f50119b.a(status);
                } else {
                    a();
                }
            } finally {
                MethodCollector.o(11769);
            }
        }
    }
}
