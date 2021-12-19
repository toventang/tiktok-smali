package com.ss.android.ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.core.h;
import com.ss.android.ad.splash.f.q;
import com.ss.ttvideoengine.aj;
import com.ss.ttvideoengine.bb;
import com.ss.ttvideoengine.bf;
import com.ss.ttvideoengine.j.p;
import com.ss.ttvideoengine.s.c;
import com.ss.ttvideoengine.s.i;
import com.ss.ttvideoengine.s.j;
import java.util.ArrayList;
import java.util.Iterator;

public final class d implements g, i, q.a, bb, bf {

    /* renamed from: a  reason: collision with root package name */
    protected Context f58864a;

    /* renamed from: b  reason: collision with root package name */
    protected h f58865b;

    /* renamed from: c  reason: collision with root package name */
    protected aj f58866c;

    /* renamed from: d  reason: collision with root package name */
    protected q f58867d = new q(this);

    /* renamed from: e  reason: collision with root package name */
    public b f58868e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f58869f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<Runnable> f58870g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private boolean f58871h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f58872i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f58873j = false;

    /* renamed from: k  reason: collision with root package name */
    private long f58874k;

    static {
        Covode.recordClassIndex(36443);
    }

    @Override // com.ss.ttvideoengine.bb
    public final void a(aj ajVar) {
    }

    @Override // com.ss.ttvideoengine.bb
    public final void a(aj ajVar, int i2, int i3) {
    }

    @Override // com.ss.ttvideoengine.bf
    public final boolean a(p pVar) {
        return false;
    }

    @Override // com.ss.ttvideoengine.bb
    public final void b(aj ajVar) {
    }

    @Override // com.ss.ttvideoengine.bb
    public final void b(aj ajVar, int i2) {
    }

    @Override // com.ss.android.ad.splash.core.video2.i
    public final boolean b(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // com.ss.ttvideoengine.bb
    public final void c(aj ajVar, int i2) {
    }

    @Override // com.ss.ttvideoengine.bb
    public final void d(aj ajVar, int i2) {
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || this.f58865b == null) {
            return false;
        }
        aj ajVar = this.f58866c;
        if (ajVar != null) {
            ajVar.n();
        }
        aj ajVar2 = new aj(this.f58864a, 0);
        this.f58866c = ajVar2;
        ajVar2.g(true);
        this.f58866c.aI = "splash_ad";
        this.f58866c.a((bb) this);
        this.f58866c.a((bf) this);
        this.f58866c.f(4, 2);
        this.f58866c.f(str);
        if (!TextUtils.isEmpty(str2)) {
            this.f58866c.a(str2);
        }
        this.f58866c.a(0);
        Surface surface = this.f58865b.getSurface();
        if (surface == null || !surface.isValid()) {
            this.f58865b.setSurfaceViewVisibility(0);
            AnonymousClass1 r1 = new Runnable() {
                /* class com.ss.android.ad.splash.core.video2.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(36444);
                }

                public final void run() {
                    d.this.a();
                }
            };
            if (this.f58869f) {
                r1.run();
            } else {
                this.f58870g.add(r1);
            }
        } else {
            this.f58866c.a(surface);
            a();
        }
        this.f58872i = false;
        return true;
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final void a(boolean z) {
        aj ajVar = this.f58866c;
        if (ajVar != null) {
            ajVar.g(z);
        }
    }

    @Override // com.ss.ttvideoengine.bb
    public final void a(c cVar) {
        b bVar = this.f58868e;
        if (bVar != null) {
            bVar.b();
        }
    }

    public final void a() {
        try {
            this.f58866c.h(false);
            this.f58866c.k();
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final float c() {
        aj ajVar = this.f58866c;
        if (ajVar == null) {
            return 0.0f;
        }
        return i.b(ajVar.aa);
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final float d() {
        aj ajVar = this.f58866c;
        if (ajVar == null) {
            return 0.0f;
        }
        return ajVar.e();
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final boolean e() {
        aj ajVar = this.f58866c;
        if (ajVar == null || ajVar.v != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final int f() {
        aj ajVar = this.f58866c;
        if (ajVar != null) {
            return ajVar.s();
        }
        return 0;
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final int g() {
        aj ajVar = this.f58866c;
        if (ajVar != null) {
            return ajVar.x;
        }
        return 0;
    }

    public d() {
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final void b() {
        if (this.f58866c != null && !this.f58872i) {
            this.f58868e.a(f(), g());
            this.f58866c.m();
            this.f58872i = true;
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final void h() {
        if (this.f58866c != null && e()) {
            this.f58866c.l();
            b bVar = this.f58868e;
            if (bVar != null) {
                bVar.c(f());
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final void i() {
        aj ajVar = this.f58866c;
        if (ajVar != null && ajVar.v == 2) {
            this.f58866c.k();
            b bVar = this.f58868e;
            if (bVar != null) {
                bVar.j();
            }
        }
    }

    private void k() {
        if (!this.f58871h && !this.f58870g.isEmpty()) {
            this.f58871h = true;
            Iterator it = new ArrayList(this.f58870g).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f58870g.clear();
            this.f58871h = false;
        }
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final void j() {
        h hVar = this.f58865b;
        if (hVar != null) {
            hVar.a();
        }
        aj ajVar = this.f58866c;
        if (ajVar != null) {
            ajVar.a((bb) null);
            this.f58866c.a((bf) null);
            if (h.a().f58921m) {
                aj ajVar2 = this.f58866c;
                j.a("TTVideoEngine", "releaseAsync,".concat(String.valueOf(ajVar2)));
                ajVar2.aX = true;
                if (ajVar2.ch.a(false)) {
                    ajVar2.ch.a(5);
                } else {
                    ajVar2.O();
                }
            } else {
                this.f58866c.n();
            }
            this.f58866c = null;
        }
        this.f58868e = null;
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final void a(b bVar) {
        this.f58868e = bVar;
    }

    @Override // com.ss.ttvideoengine.bb
    public final void a(int i2) {
        b bVar = this.f58868e;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // com.ss.ttvideoengine.bb
    public final void c(aj ajVar) {
        b bVar = this.f58868e;
        if (bVar != null) {
            bVar.b(ajVar.x);
        }
    }

    @Override // com.ss.ttvideoengine.bb
    public final void d(aj ajVar) {
        b bVar = this.f58868e;
        if (bVar != null) {
            bVar.a(g());
        }
    }

    public d(h hVar) {
        a(hVar);
    }

    @Override // com.ss.android.ad.splash.core.video2.i
    public final void a(SurfaceTexture surfaceTexture) {
        this.f58869f = true;
        Surface surface = this.f58865b.getSurface();
        if (surface == null) {
            surface = new Surface(surfaceTexture);
        }
        aj ajVar = this.f58866c;
        if (ajVar != null) {
            ajVar.a(surface);
            k();
        }
    }

    @Override // com.ss.android.ad.splash.f.q.a
    public final void a(Message message) {
        b bVar;
        if (message.what == 1000 && this.f58866c != null) {
            if (e()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long j2 = this.f58874k;
                long j3 = uptimeMillis - j2;
                long j4 = 100;
                if (j2 != 0 && j3 > 100) {
                    j4 = 100 - (j3 % 100);
                }
                this.f58867d.sendMessageDelayed(this.f58867d.obtainMessage(1000), j4);
                this.f58874k = uptimeMillis;
            } else {
                this.f58874k = 0;
            }
            int i2 = this.f58866c.x;
            if (i2 > 0 && (bVar = this.f58868e) != null) {
                bVar.f(this.f58866c.s(), i2);
            }
        }
    }

    public final void a(h hVar) {
        if (hVar != null) {
            this.f58865b = hVar;
            hVar.setVideoViewCallback(this);
            this.f58864a = this.f58865b.getApplicationContext();
            return;
        }
        throw new IllegalArgumentException("IBDASplashVideoView can not be null");
    }

    @Override // com.ss.android.ad.splash.core.video2.g
    public final void a(float f2, float f3) {
        aj ajVar = this.f58866c;
        if (ajVar != null) {
            ajVar.a(f2, f3);
        }
    }

    @Override // com.ss.ttvideoengine.bb
    public final void a(aj ajVar, int i2) {
        if (i2 == 1) {
            b bVar = this.f58868e;
            if (bVar != null && !this.f58873j) {
                bVar.a();
            }
            this.f58867d.removeMessages(1000);
            this.f58867d.sendEmptyMessage(1000);
            this.f58873j = true;
        }
    }
}
