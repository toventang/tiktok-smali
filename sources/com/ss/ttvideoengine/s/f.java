package com.ss.ttvideoengine.s;

import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.h.h;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final e f153268a = new e();

    /* renamed from: b  reason: collision with root package name */
    public final e f153269b = new e();

    /* renamed from: c  reason: collision with root package name */
    public final e f153270c = new e();

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f153271d;

    /* renamed from: e  reason: collision with root package name */
    private final h f153272e;

    /* renamed from: f  reason: collision with root package name */
    private final h.b f153273f;

    static {
        Covode.recordClassIndex(101780);
    }

    public final void c() {
        this.f153268a.d();
        this.f153269b.d();
        this.f153270c.d();
    }

    public final void d() {
        this.f153268a.e();
        this.f153269b.e();
        this.f153270c.e();
    }

    public final void a() {
        if (this.f153271d) {
            j.a("PlayDurationManager", "Already started");
            return;
        }
        this.f153271d = true;
        this.f153268a.a();
        if (this.f153272e.b()) {
            this.f153269b.a();
        } else if (this.f153272e.c()) {
            this.f153270c.a();
        }
        j.b("PlayDurationManager", "start play");
    }

    public final void b() {
        if (!this.f153271d) {
            j.a("PlayDurationManager", "Already stopped");
            return;
        }
        this.f153271d = false;
        this.f153268a.b();
        if (this.f153272e.b()) {
            this.f153269b.b();
        }
        if (this.f153272e.c()) {
            this.f153270c.b();
        }
        j.b("PlayDurationManager", a.a("stop: play duration: %s, wiredDuration: %s, wirelessDuration: %s", new Object[]{Integer.valueOf(this.f153268a.c()), Integer.valueOf(this.f153269b.c()), Integer.valueOf(this.f153270c.c())}));
    }

    public f(h hVar) {
        AnonymousClass1 r1 = new h.b() {
            /* class com.ss.ttvideoengine.s.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(101781);
            }

            @Override // com.ss.ttvideoengine.h.h.b
            public final void a(boolean z, boolean z2) {
                j.b("PlayDurationManager", "onHeadsetStateChanged: " + z + ", " + z2);
                if (!z) {
                    f.this.f153269b.b();
                    f.this.f153270c.b();
                } else if (z2) {
                    if (f.this.f153271d) {
                        f.this.f153270c.a();
                        f.this.f153269b.b();
                    }
                } else if (f.this.f153271d) {
                    f.this.f153269b.a();
                    f.this.f153270c.b();
                }
                j.b("PlayDurationManager", a.a("wiredDuration: %s, wirelessDuration: %s", new Object[]{Integer.valueOf(f.this.f153269b.c()), Integer.valueOf(f.this.f153270c.c())}));
            }
        };
        this.f153273f = r1;
        this.f153272e = hVar;
        hVar.f152615b = r1;
    }
}
