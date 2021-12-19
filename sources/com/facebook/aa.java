package com.facebook;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.facebook.GraphRequest;
import com.facebook.internal.a.b.a;

/* access modifiers changed from: package-private */
public final class aa {

    /* renamed from: a  reason: collision with root package name */
    final long f46890a = m.f();

    /* renamed from: b  reason: collision with root package name */
    public long f46891b;

    /* renamed from: c  reason: collision with root package name */
    long f46892c;

    /* renamed from: d  reason: collision with root package name */
    public long f46893d;

    /* renamed from: e  reason: collision with root package name */
    private final GraphRequest f46894e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f46895f;

    static {
        Covode.recordClassIndex(28545);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f46891b > this.f46892c) {
            GraphRequest.b bVar = this.f46894e.f46549k;
            final long j2 = this.f46893d;
            if (j2 > 0 && (bVar instanceof GraphRequest.d)) {
                final long j3 = this.f46891b;
                final GraphRequest.d dVar = (GraphRequest.d) bVar;
                Handler handler = this.f46895f;
                if (handler != null) {
                    handler.post(new Runnable() {
                        /* class com.facebook.aa.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(28546);
                        }

                        public final void run() {
                            a.a(this);
                        }
                    });
                }
                this.f46892c = this.f46891b;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        this.f46893d += j2;
    }

    aa(Handler handler, GraphRequest graphRequest) {
        this.f46894e = graphRequest;
        this.f46895f = handler;
    }
}
