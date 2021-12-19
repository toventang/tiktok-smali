package com.bytedance.android.live.liveinteract.multiguest.a.e;

import com.bytedance.android.livesdk.ab.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class e implements a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f11131b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b f11132a;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f11133c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f11134d;

    static {
        Covode.recordClassIndex(5983);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5984);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.e.a
    public final void c() {
        h();
        i.b();
        i.a("Guest_PreInitStrategy", "onRefuseInvite");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.e.a
    public final void d() {
        h();
        i.b();
        i.a("Guest_PreInitStrategy", "dispose");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.e.a
    public final void e() {
        a(false);
        i.b();
        i.a("Guest_PreInitStrategy", "onApplySucceed");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.e.a
    public final void f() {
        h();
        i.b();
        i.a("Guest_PreInitStrategy", "onCancelApply");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.e.a
    public final void g() {
        a(false);
        i.b();
        i.a("Guest_PreInitStrategy", "onReceiveInviteMsg");
    }

    private final void h() {
        i.b();
        i.a("Guest_PreInitStrategy", "disposeRtc");
        this.f11132a.d();
        this.f11133c = false;
        this.f11134d = true;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.e.a
    public final void a() {
        this.f11132a.a();
        i();
        i.b();
        i.a("Guest_PreInitStrategy", "onReceivePermitMsg");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.e.a
    public final void b() {
        this.f11132a.a();
        i();
        i.b();
        i.a("Guest_PreInitStrategy", "onAcceptInvite");
    }

    private final void i() {
        i.b();
        i.a("Guest_PreInitStrategy", "joinRtc enter");
        if (!this.f11133c || this.f11134d) {
            i.b();
            i.a("Guest_PreInitStrategy", "joinRtc not init, wait...");
            a(true);
        }
        this.f11132a.c();
        i.b();
        i.a("Guest_PreInitStrategy", "joinRtc exit");
    }

    public e(b bVar) {
        l.d(bVar, "");
        this.f11132a = bVar;
    }

    private final synchronized void a(boolean z) {
        MethodCollector.i(7637);
        i.b();
        i.a("Guest_PreInitStrategy", "initRtc enter");
        if (!this.f11133c || this.f11134d) {
            this.f11132a.a(z);
            this.f11133c = true;
            this.f11134d = false;
            i.b();
            i.a("Guest_PreInitStrategy", "initRtc exit");
            MethodCollector.o(7637);
            return;
        }
        i.b();
        i.c("Guest_PreInitStrategy", "initRtc is already init");
        MethodCollector.o(7637);
    }
}
