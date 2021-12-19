package com.ss.android.ugc.aweme.player.sdk.c;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.player.sdk.a;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.api.e;
import com.ss.android.ugc.aweme.player.sdk.api.i;
import com.ss.android.ugc.aweme.player.sdk.api.j;
import com.ss.android.ugc.aweme.player.sdk.api.k;
import com.ss.android.ugc.aweme.player.sdk.api.l;
import com.ss.android.ugc.aweme.player.sdk.api.m;
import com.ss.android.ugc.aweme.player.sdk.b.d;
import com.ss.android.ugc.playerkit.a.b;
import com.ss.android.ugc.playerkit.model.c;
import com.ss.android.ugc.playerkit.model.g;
import com.ss.android.ugc.playerkit.model.m;
import com.ss.android.ugc.playerkit.model.p;
import java.lang.ref.WeakReference;

public class h implements l {

    /* renamed from: a  reason: collision with root package name */
    private f f115432a;

    /* renamed from: b  reason: collision with root package name */
    private c f115433b;

    /* renamed from: c  reason: collision with root package name */
    private Surface f115434c;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<OnUIPlayListener> f115435d;

    /* renamed from: e  reason: collision with root package name */
    private b f115436e;

    /* renamed from: f  reason: collision with root package name */
    private e f115437f;

    /* renamed from: g  reason: collision with root package name */
    private k f115438g;

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.aweme.player.sdk.api.h f115439h;

    /* renamed from: i  reason: collision with root package name */
    private com.ss.android.ugc.aweme.player.sdk.api.b f115440i;

    static {
        Covode.recordClassIndex(74105);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void A() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(j.e eVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void s() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(p pVar) {
        OnUIPlayListener onUIPlayListener;
        if (a.f115103a) {
            a.a("SimplifyAsyncPlayerV3", "prepare() " + (pVar != null ? pVar.f148803j : "null"));
        }
        if (pVar != null) {
            WeakReference<OnUIPlayListener> weakReference = this.f115435d;
            if (weakReference != null) {
                onUIPlayListener = weakReference.get();
            } else {
                onUIPlayListener = null;
            }
            if (c.f148702a.isPrerenderSurfaceSlowSetFix() || pVar.K) {
                a.a("SimplifyAsyncPlayerV3", "fix prerender surface slow : fill surface before startSession");
                pVar.u = this.f115434c;
            }
            this.f115432a.a(pVar, onUIPlayListener, this.f115440i);
            c cVar = this.f115432a.f115412c;
            this.f115433b = cVar;
            com.ss.android.ugc.aweme.player.sdk.api.h hVar = this.f115439h;
            if (hVar != null) {
                cVar.a(hVar);
            }
            if (this.f115434c != null) {
                if (!pVar.an || !((Boolean) com.ss.android.ugc.playerkit.exp.b.o.getValue()).booleanValue()) {
                    this.f115433b.a(this.f115434c);
                } else {
                    this.f115433b.b(this.f115434c);
                }
                this.f115434c = null;
            }
            b bVar = this.f115436e;
            if (bVar != null) {
                this.f115433b.a(bVar);
            }
            e eVar = this.f115437f;
            if (eVar != null) {
                this.f115433b.a(eVar);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(p pVar, com.ss.android.ugc.aweme.player.sdk.api.b bVar) {
        MethodCollector.i(4346);
        if (a.f115103a) {
            a.a("SimplifyAsyncPlayerV3", "nextPrepare()" + (pVar != null ? pVar.f148803j : "null"));
        }
        if (pVar == null) {
            MethodCollector.o(4346);
        } else if (pVar.ao) {
            f fVar = this.f115432a;
            synchronized (fVar.f115421m) {
                try {
                    if (!f.f115409i) {
                        fVar.b();
                        if (!fVar.f115419k.f115424c) {
                            Message obtain = Message.obtain();
                            obtain.what = 2;
                            obtain.obj = new d(pVar, bVar);
                            fVar.f115419k.sendMessage(obtain);
                        }
                        MethodCollector.o(4346);
                    }
                } finally {
                    MethodCollector.o(4346);
                }
            }
        } else {
            f fVar2 = this.f115432a;
            if (!fVar2.f115415f) {
                if (fVar2.f115413d != null && !fVar2.f115413d.f115375i && !fVar2.f115413d.f115376j) {
                    if (TextUtils.equals(pVar.f148803j, fVar2.f115413d.f115369c) || (fVar2.f115412c != null && TextUtils.equals(pVar.f148803j, fVar2.f115412c.f115369c))) {
                        if (a.f115103a) {
                            a.a("PlaySessionManager", "current or preparing, ignore id:" + pVar.f148803j);
                        }
                        MethodCollector.o(4346);
                        return;
                    }
                    if (a.f115103a) {
                        a.a("PlaySessionManager", "prepareSession drop missed mNextSession:" + fVar2.f115413d);
                    }
                    if (fVar2.c(fVar2.f115413d) && f.b(fVar2.f115413d)) {
                        f.a(fVar2.f115413d);
                        if (!fVar2.f115417h.n) {
                            fVar2.f115414e = fVar2.f115413d;
                        } else {
                            fVar2.d(fVar2.f115413d);
                        }
                        fVar2.f115411b.remove(fVar2.f115413d);
                        fVar2.f115413d = null;
                    } else if (!fVar2.f115413d.c()) {
                        fVar2.f115413d.g();
                        fVar2.f115413d.h();
                        fVar2.f115413d = null;
                    }
                }
                if (f.b(fVar2.f115413d)) {
                    fVar2.f115413d = fVar2.b(pVar);
                }
                c cVar = fVar2.f115413d;
                if (cVar != null && cVar.c() && !cVar.f115376j && !cVar.f115375i) {
                    h.f.b.l.c(pVar, "");
                    pVar.az = 102;
                    a.a("AccelerateSessionMonitor", "updateStatus：render with rendered session");
                }
                if (fVar2.f115413d == null) {
                    fVar2.f115413d = fVar2.a(pVar);
                }
                if (pVar.u != null) {
                    fVar2.f115413d.a(pVar.u);
                }
                fVar2.f115413d.a(bVar);
                fVar2.f115413d.a(pVar);
                if (!fVar2.f115411b.contains(fVar2.f115413d)) {
                    fVar2.f115411b.add(fVar2.f115413d);
                }
                if (a.f115103a) {
                    a.a("PlaySessionManager", "prepareSession mNextSession:" + fVar2.f115413d);
                }
            }
            MethodCollector.o(4346);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(String str) {
        if (a.f115103a) {
            a.a("SimplifyAsyncPlayerV3", "resume()".concat(String.valueOf(str)));
        }
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.f115371e.obtainMessage(4, str).sendToTarget();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(b bVar) {
        this.f115436e = bVar;
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.a(bVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(e eVar) {
        this.f115437f = eVar;
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.a(eVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean a(String str, String str2) {
        c cVar = this.f115433b;
        return cVar != null && TextUtils.equals(str, cVar.f115369c);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(i iVar) {
        this.f115432a.f115416g = iVar;
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.f115372f.x = iVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(g gVar) {
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.f115371e.obtainMessage(25, gVar).sendToTarget();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(OnUIPlayListener onUIPlayListener) {
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.a(onUIPlayListener);
        }
        this.f115435d = new WeakReference<>(onUIPlayListener);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(k kVar) {
        this.f115438g = kVar;
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.a(kVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(com.ss.android.ugc.aweme.player.sdk.api.h hVar) {
        this.f115439h = hVar;
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.a(hVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(boolean z) {
        c cVar = this.f115433b;
        if (cVar != null && cVar.f115372f != null) {
            Message message = new Message();
            message.what = 18;
            message.arg1 = 1;
            message.arg2 = z ? 1 : 0;
            cVar.f115371e.sendMessage(message);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(m mVar) {
        c cVar = this.f115433b;
        if (cVar != null && cVar.f115372f != null) {
            Message message = new Message();
            message.what = 18;
            message.arg1 = 2;
            message.obj = mVar;
            cVar.f115371e.sendMessage(message);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(com.ss.android.ugc.aweme.player.sdk.api.a aVar) {
        c cVar = this.f115433b;
        if (cVar != null && cVar.f115372f != null) {
            Message message = new Message();
            message.what = 22;
            message.arg1 = 2;
            message.obj = aVar;
            cVar.f115371e.sendMessage(message);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(boolean z, Bundle bundle) {
        c cVar = this.f115433b;
        if (cVar != null && cVar.f115372f != null) {
            Message message = new Message();
            message.what = 23;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("crop_param_open", z);
            message.obj = bundle;
            cVar.f115371e.sendMessage(message);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void r() {
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.e();
        }
    }

    private String B() {
        c cVar = this.f115433b;
        if (cVar != null) {
            return cVar.f115369c;
        }
        return "null";
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean i() {
        c cVar = this.f115433b;
        if (cVar == null || !cVar.f115372f.i()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final long j() {
        c cVar = this.f115433b;
        if (cVar != null) {
            return cVar.f115372f.j();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final long k() {
        c cVar = this.f115433b;
        if (cVar != null) {
            return cVar.f115372f.k();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean l() {
        c cVar = this.f115433b;
        if (cVar == null || !cVar.f115372f.l()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final String n() {
        c cVar = this.f115433b;
        if (cVar != null) {
            return cVar.f115372f.n();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final int o() {
        c cVar = this.f115433b;
        if (cVar != null) {
            return cVar.f115372f.n;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void p() {
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.f115372f.p();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final m.e t() {
        c cVar = this.f115433b;
        if (cVar != null) {
            return cVar.f115372f.f115141d;
        }
        return m.e.TT;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean x() {
        c cVar = this.f115433b;
        if (cVar == null || !cVar.f115372f.x()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean y() {
        c cVar = this.f115433b;
        if (cVar == null || !cVar.f115372f.y()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean z() {
        c cVar = this.f115433b;
        if (cVar == null || !cVar.f115372f.z()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final int a() {
        c cVar = this.f115433b;
        if (cVar != null) {
            return cVar.f115372f.p;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void h() {
        if (a.f115103a) {
            a.a("SimplifyAsyncPlayerV3", "resume()");
        }
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.f115371e.obtainMessage(4).sendToTarget();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void q() {
        c cVar = this.f115433b;
        if (cVar != null && !cVar.f115376j && !cVar.f115375i) {
            cVar.f115371e.a(300);
            cVar.f115371e.sendEmptyMessage(12);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final j.g u() {
        c cVar = this.f115433b;
        if (cVar == null || cVar.f115372f == null) {
            return null;
        }
        return cVar.f115372f.u();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final j.f v() {
        c cVar = this.f115433b;
        if (cVar == null || cVar.f115372f == null) {
            return null;
        }
        return cVar.f115372f.v();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final String w() {
        c cVar = this.f115433b;
        if (cVar == null || cVar.f115372f == null) {
            return null;
        }
        return cVar.f115372f.w();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void b() {
        if (a.f115103a) {
            a.a("SimplifyAsyncPlayerV3", "init()");
        }
        if (this.f115433b == null) {
            f fVar = this.f115432a;
            fVar.f115412c = fVar.a((p) null);
            this.f115433b = fVar.f115412c;
        }
        k kVar = this.f115438g;
        if (kVar != null) {
            this.f115433b.a(kVar);
        }
        com.ss.android.ugc.aweme.player.sdk.api.h hVar = this.f115439h;
        if (hVar != null) {
            this.f115433b.a(hVar);
        }
        this.f115433b.a();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void c() {
        if (a.f115103a) {
            a.a("SimplifyAsyncPlayerV3", "render()" + B());
        }
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.f115371e.sendEmptyMessage(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void d() {
        if (a.f115103a) {
            a.a("SimplifyAsyncPlayerV3", "start() key:" + B());
        }
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.f115371e.sendEmptyMessage(3);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void e() {
        if (a.f115103a) {
            a.a("SimplifyAsyncPlayerV3", "stop()" + B());
        }
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void f() {
        if (a.f115103a) {
            a.a("SimplifyAsyncPlayerV3", "pause()" + B());
        }
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.f115371e.sendEmptyMessage(5);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void g() {
        if (a.f115103a) {
            a.a("SimplifyAsyncPlayerV3", "release()" + B());
        }
        this.f115432a.a();
        this.f115433b = null;
        this.f115434c = null;
        this.f115436e = null;
        this.f115437f = null;
        this.f115438g = null;
        this.f115439h = null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void m() {
        a.a("SimplifyAsyncPlayerV3", "sleep()" + B());
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.f115371e.obtainMessage(19).sendToTarget();
        }
        if (((Boolean) com.ss.android.ugc.playerkit.exp.b.f148670d.getValue()).booleanValue()) {
            a.a("SimplifyAsyncPlayerV3", "sleep : release background session");
            f fVar = this.f115432a;
            if (fVar.f115413d != null) {
                fVar.f115413d.h();
            }
            fVar.f115413d = null;
            if (fVar.f115414e != null) {
                fVar.f115414e.h();
            }
            fVar.f115414e = null;
            if (fVar.f115419k != null) {
                fVar.f115419k.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(com.ss.android.ugc.aweme.player.sdk.api.b bVar) {
        this.f115440i = bVar;
    }

    public h(m.e eVar) {
        this(eVar, null);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final float a(int i2) {
        c cVar = this.f115433b;
        if (cVar != null) {
            return cVar.f115372f.a(i2);
        }
        return 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void b(float f2) {
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.f115372f.b(f2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void b(int i2) {
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.f115371e.a(i2);
            cVar.f115371e.sendEmptyMessage(12);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void c(int i2) {
        c cVar = this.f115433b;
        if (cVar != null && cVar.f115372f != null) {
            Message message = new Message();
            message.what = 18;
            message.arg1 = 0;
            message.arg2 = i2;
            cVar.f115371e.sendMessage(message);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void d(int i2) {
        c cVar = this.f115433b;
        if (cVar != null && cVar.f115372f != null) {
            Message message = new Message();
            message.what = 22;
            message.arg1 = 0;
            message.arg2 = i2;
            cVar.f115371e.sendMessage(message);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(float f2) {
        if (a.f115103a) {
            a.a("SimplifyAsyncPlayerV3", "seekTo() progress:" + f2 + ", key:" + B());
        }
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.f115371e.obtainMessage(11, Float.valueOf(f2)).sendToTarget();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void b(Surface surface) {
        if (a.f115103a) {
            a.a("SimplifyAsyncPlayerV3", "setSurfaceDirectly(), surface = " + surface + ", mCurrentPlaySession = " + this.f115433b + ", " + B());
        }
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.b(surface);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void c(k kVar) {
        MethodCollector.i(4196);
        f fVar = this.f115432a;
        synchronized (fVar.f115421m) {
            try {
                if (!f.f115409i) {
                    fVar.b();
                    if (!fVar.f115419k.f115424c) {
                        fVar.f115420l = kVar;
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        obtain.obj = kVar;
                        fVar.f115419k.sendMessage(obtain);
                    }
                    MethodCollector.o(4196);
                }
            } finally {
                MethodCollector.o(4196);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void b(k kVar) {
        if (a.f115103a) {
            a.a("SimplifyAsyncPlayerV3", "initNextSession()");
        }
        f fVar = this.f115432a;
        fVar.f115413d = fVar.a((p) null);
        c cVar = fVar.f115413d;
        if (cVar != null) {
            cVar.a(kVar);
            com.ss.android.ugc.aweme.player.sdk.api.h hVar = this.f115439h;
            if (hVar != null) {
                cVar.a(hVar);
            }
            cVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void b(String str) {
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.f115372f.b(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(Surface surface) {
        if (a.f115103a) {
            a.a("SimplifyAsyncPlayerV3", "setSurface(), surface = " + surface + ", mCurrentPlaySession = " + this.f115433b + ", " + B());
        }
        this.f115434c = surface;
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.a(surface);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean b(OnUIPlayListener onUIPlayListener) {
        c cVar = this.f115433b;
        if (cVar != null && cVar.f115377k != null && this.f115433b.f115377k.getWrapperedListener() != null && this.f115433b.f115377k.getWrapperedListener().equals(onUIPlayListener)) {
            return true;
        }
        WeakReference<OnUIPlayListener> weakReference = this.f115435d;
        if (weakReference == null || weakReference.get() == null || this.f115435d.get().getWrapperedListener() == null || !this.f115435d.get().getWrapperedListener().equals(onUIPlayListener)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(SurfaceHolder surfaceHolder) {
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.f115371e.obtainMessage(14, surfaceHolder).sendToTarget();
        }
    }

    public h(m.e eVar, d dVar) {
        this.f115432a = new f(eVar, dVar);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(float f2, float f3) {
        if (a.f115103a) {
            a.a("SimplifyAsyncPlayerV3", "setVolume() leftVolume:" + f2 + ", rightVolume:" + f3 + ", key:" + B());
        }
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.f115371e.obtainMessage(9, new Pair(Float.valueOf(f2), Float.valueOf(f3))).sendToTarget();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(int i2, int i3) {
        c cVar = this.f115433b;
        if (cVar != null) {
            cVar.f115371e.obtainMessage(13, new Pair(Integer.valueOf(i2), Integer.valueOf(i3))).sendToTarget();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(int i2, Bundle bundle) {
        c cVar = this.f115433b;
        if (cVar != null && cVar.f115372f != null) {
            Message message = new Message();
            message.what = 24;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("texture_layout_param", i2);
            message.obj = bundle;
            cVar.f115371e.sendMessage(message);
        }
    }
}
