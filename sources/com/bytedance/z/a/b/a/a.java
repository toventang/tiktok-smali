package com.bytedance.z.a.b.a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.z.a.a.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public c f46258a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f46259b;

    /* renamed from: c  reason: collision with root package name */
    private long f46260c;

    static {
        Covode.recordClassIndex(28253);
    }

    public final boolean a() {
        b();
        return this.f46259b;
    }

    private void b() {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f46260c;
        if (j2 == 0 || elapsedRealtime - j2 >= 5000) {
            this.f46260c = elapsedRealtime;
            float f2 = this.f46258a.f();
            int e2 = this.f46258a.e();
            int d2 = this.f46258a.d();
            boolean z2 = false;
            if (f2 > ((float) this.f46258a.a().f46222d)) {
                z = false;
            } else {
                z = true;
            }
            if (e2 < this.f46258a.a().f46223e) {
                z = false;
            }
            if (d2 != 1) {
                z2 = z;
            }
            this.f46259b = z2;
        }
    }

    public a(c cVar) {
        this.f46258a = cVar;
    }
}
