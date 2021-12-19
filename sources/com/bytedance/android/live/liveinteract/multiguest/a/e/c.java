package com.bytedance.android.live.liveinteract.multiguest.a.e;

import com.bytedance.android.livesdk.ab.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class c implements a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f11125b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b f11126a;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f11127c;

    static {
        Covode.recordClassIndex(5979);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5980);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.e.a
    public final void a() {
        i();
        i.b();
        i.a("Guest_NormalInitStrategy", "onReceivePermitMsg");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.e.a
    public final void b() {
        i();
        i.b();
        i.a("Guest_NormalInitStrategy", "onAcceptInvite");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.e.a
    public final void c() {
        j();
        i.b();
        i.a("Guest_NormalInitStrategy", "onRefuseInvite");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.e.a
    public final void d() {
        j();
        i.b();
        i.a("Guest_NormalInitStrategy", "dispose");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.e.a
    public final void e() {
        i.b();
        i.a("Guest_NormalInitStrategy", "onApplySucceed");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.e.a
    public final void f() {
        i.b();
        i.a("Guest_NormalInitStrategy", "onCancelApply");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.e.a
    public final void g() {
        i.b();
        i.a("Guest_NormalInitStrategy", "onReceiveInviteMsg");
    }

    private final void j() {
        i.b();
        i.a("Guest_NormalInitStrategy", "disposeRtc");
        this.f11126a.d();
        this.f11127c = false;
    }

    private final synchronized void h() {
        MethodCollector.i(7574);
        i.b();
        i.a("Guest_NormalInitStrategy", "initRtc enter");
        if (this.f11127c) {
            MethodCollector.o(7574);
            return;
        }
        this.f11127c = true;
        this.f11126a.a(true);
        i.b();
        i.a("Guest_NormalInitStrategy", "initRtc exit");
        MethodCollector.o(7574);
    }

    private final void i() {
        i.b();
        i.a("Guest_NormalInitStrategy", "joinRtc enter");
        if (!this.f11127c) {
            i.b();
            i.a("Guest_NormalInitStrategy", "joinRtc not init, wait...");
            h();
        }
        this.f11126a.c();
        i.b();
        i.a("Guest_NormalInitStrategy", "joinRtc exit");
    }

    public c(b bVar) {
        l.d(bVar, "");
        this.f11126a = bVar;
    }
}
