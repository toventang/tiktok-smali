package com.ss.android.ugc.aweme.player.sdk.a;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.api.b;
import com.ss.android.ugc.aweme.player.sdk.api.e;
import com.ss.android.ugc.aweme.player.sdk.api.i;
import com.ss.android.ugc.aweme.player.sdk.api.j;
import com.ss.android.ugc.aweme.player.sdk.api.k;
import com.ss.android.ugc.aweme.player.sdk.api.l;
import com.ss.android.ugc.aweme.player.sdk.api.m;
import com.ss.android.ugc.playerkit.model.g;
import com.ss.android.ugc.playerkit.model.m;
import com.ss.android.ugc.playerkit.model.p;

public final class h implements l {

    /* renamed from: a  reason: collision with root package name */
    public OnUIPlayListener f115124a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f115125b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f115126c;

    /* renamed from: d  reason: collision with root package name */
    private l f115127d;

    /* renamed from: e  reason: collision with root package name */
    private HandlerThread f115128e;

    /* renamed from: f  reason: collision with root package name */
    private a f115129f;

    /* renamed from: g  reason: collision with root package name */
    private String f115130g;

    static {
        Covode.recordClassIndex(73993);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void A() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(j.e eVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(p pVar, b bVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void b(k kVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void c(k kVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void s() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void m() {
        e();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(final p pVar) {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyAsyncPlayer", "prepare()" + (pVar != null ? pVar.f148803j : "null"));
        }
        if (pVar != null) {
            if (this.f115126c) {
                com.ss.android.ugc.aweme.player.sdk.a.b("SimplifyAsyncPlayer", "mIsLastPlayThreadQuiting when prepare");
                return;
            }
            this.f115130g = pVar.f148803j;
            if (pVar.B && this.f115124a != null) {
                this.f115125b.post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.h.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(73996);
                    }

                    public final void run() {
                        if (h.this.f115124a != null && pVar != null) {
                            h.this.f115124a.onPreparePlay(pVar.f148803j);
                        }
                    }
                });
            }
            if (pVar.A) {
                if (this.f115129f == null) {
                    B();
                }
                this.f115129f.obtainMessage(1, pVar).sendToTarget();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(b bVar) {
        this.f115127d.a(bVar);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(String str) {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyAsyncPlayer", "resume()" + this.f115130g);
        }
        a aVar = this.f115129f;
        if (aVar != null) {
            aVar.obtainMessage(4, str).sendToTarget();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(k kVar) {
        this.f115127d.a(kVar);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(com.ss.android.ugc.aweme.player.sdk.api.h hVar) {
        this.f115127d.a(hVar);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(com.ss.android.ugc.playerkit.a.b bVar) {
        this.f115127d.a(bVar);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(e eVar) {
        this.f115127d.a(eVar);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean a(String str, String str2) {
        return TextUtils.equals(str, this.f115130g);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(i iVar) {
        this.f115127d.a(iVar);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(g gVar) {
        a aVar = this.f115129f;
        if (aVar != null) {
            aVar.obtainMessage(17, gVar).sendToTarget();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(boolean z) {
        l lVar = this.f115127d;
        if (lVar != null) {
            lVar.a(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(m mVar) {
        l lVar = this.f115127d;
        if (lVar != null) {
            lVar.a(mVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(com.ss.android.ugc.aweme.player.sdk.api.a aVar) {
        l lVar = this.f115127d;
        if (lVar != null) {
            lVar.a(aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(boolean z, Bundle bundle) {
        l lVar = this.f115127d;
        if (lVar != null) {
            lVar.a(z, bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean i() {
        return this.f115127d.i();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final long j() {
        return this.f115127d.j();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final long k() {
        return this.f115127d.k();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean l() {
        return this.f115127d.l();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final String n() {
        return this.f115127d.n();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final int o() {
        return this.f115127d.o();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void p() {
        this.f115127d.p();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final m.e t() {
        return this.f115127d.t();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean x() {
        return this.f115127d.x();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean y() {
        return this.f115127d.y();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean z() {
        return this.f115127d.z();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final int a() {
        return this.f115127d.a();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void b() {
        a aVar = this.f115129f;
        if (aVar != null) {
            aVar.sendEmptyMessage(16);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void r() {
        a aVar = this.f115129f;
        if (aVar != null) {
            aVar.removeMessages(12);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final j.g u() {
        l lVar = this.f115127d;
        if (lVar != null) {
            return lVar.u();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final j.f v() {
        l lVar = this.f115127d;
        if (lVar != null) {
            return lVar.v();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final String w() {
        l lVar = this.f115127d;
        if (lVar != null) {
            return lVar.w();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void h() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyAsyncPlayer", "resume()");
        }
        a aVar = this.f115129f;
        if (aVar != null) {
            aVar.obtainMessage(4).sendToTarget();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void q() {
        a aVar = this.f115129f;
        if (aVar != null) {
            aVar.a(300);
            this.f115129f.sendEmptyMessage(12);
        }
    }

    private void B() {
        Looper looper;
        try {
            HandlerThread handlerThread = new HandlerThread("play_thread", 0);
            this.f115128e = handlerThread;
            handlerThread.start();
        } catch (Exception unused) {
            this.f115128e = null;
        }
        this.f115125b = new Handler(Looper.getMainLooper());
        AnonymousClass1 r2 = new a.AbstractC2947a() {
            /* class com.ss.android.ugc.aweme.player.sdk.a.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(73994);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.a.h.a.AbstractC2947a
            public final void a() {
                h.this.f115125b.post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.h.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(73995);
                    }

                    public final void run() {
                        h.this.f115126c = false;
                    }
                });
            }
        };
        HandlerThread handlerThread2 = this.f115128e;
        if (handlerThread2 == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = handlerThread2.getLooper();
        }
        this.f115129f = new a(r2, looper, this.f115127d);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void c() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyAsyncPlayer", "render()" + this.f115130g);
        }
        a aVar = this.f115129f;
        if (aVar != null) {
            aVar.sendEmptyMessage(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void d() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyAsyncPlayer", "start()" + this.f115130g);
        }
        a aVar = this.f115129f;
        if (aVar != null) {
            aVar.sendEmptyMessage(3);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void e() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyAsyncPlayer", "stop()" + this.f115130g);
        }
        a aVar = this.f115129f;
        if (aVar != null) {
            aVar.sendEmptyMessage(6);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void f() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyAsyncPlayer", "pause()" + this.f115130g);
        }
        a aVar = this.f115129f;
        if (aVar != null) {
            aVar.sendEmptyMessage(5);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void g() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyAsyncPlayer", "release()" + this.f115130g);
        }
        a aVar = this.f115129f;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
            this.f115129f.sendEmptyMessage(7);
            this.f115129f.sendEmptyMessage(10);
            this.f115126c = true;
            this.f115129f = null;
        }
        if (this.f115128e != null) {
            this.f115128e = null;
        }
        this.f115130g = null;
    }

    /* access modifiers changed from: package-private */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private l f115135a;

        /* renamed from: b  reason: collision with root package name */
        private volatile int f115136b = 300;

        /* renamed from: c  reason: collision with root package name */
        private AbstractC2947a f115137c;

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.player.sdk.a.h$a$a  reason: collision with other inner class name */
        public interface AbstractC2947a {
            static {
                Covode.recordClassIndex(73998);
            }

            void a();
        }

        static {
            Covode.recordClassIndex(73997);
        }

        public final void a(int i2) {
            if (i2 > 0) {
                this.f115136b = i2;
            }
        }

        public final void handleMessage(Message message) {
            if (this.f115135a != null) {
                switch (message.what) {
                    case 1:
                        this.f115135a.a((p) message.obj);
                        return;
                    case 2:
                    case 15:
                    default:
                        return;
                    case 3:
                        this.f115135a.d();
                        return;
                    case 4:
                        if (message.obj == null) {
                            this.f115135a.h();
                            return;
                        } else {
                            this.f115135a.a((String) message.obj);
                            return;
                        }
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        this.f115135a.f();
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        this.f115135a.e();
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        this.f115135a.g();
                        return;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        this.f115135a.c();
                        return;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        Pair pair = (Pair) message.obj;
                        if (pair != null) {
                            this.f115135a.a(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                            return;
                        }
                        return;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        removeMessages(12);
                        Looper looper = getLooper();
                        if (!(looper == null || looper == Looper.getMainLooper())) {
                            looper.quit();
                        }
                        AbstractC2947a aVar = this.f115137c;
                        if (aVar != null) {
                            aVar.a();
                            return;
                        }
                        return;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        this.f115135a.a(((Float) message.obj).floatValue());
                        return;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        this.f115135a.s();
                        if (com.ss.android.ugc.playerkit.exp.b.o()) {
                            removeMessages(12);
                        }
                        sendEmptyMessageDelayed(12, (long) this.f115136b);
                        return;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        Pair pair2 = (Pair) message.obj;
                        if (pair2 != null) {
                            this.f115135a.a(((Integer) pair2.first).intValue(), ((Integer) pair2.second).intValue());
                            return;
                        }
                        return;
                    case ABRConfig.ABR_SELECT_SCENE:
                        this.f115135a.a((SurfaceHolder) message.obj);
                        return;
                    case 16:
                        this.f115135a.b();
                        return;
                    case 17:
                        g gVar = (g) message.obj;
                        if (gVar != null) {
                            this.f115135a.a(gVar);
                            return;
                        }
                        return;
                }
            }
        }

        public a(AbstractC2947a aVar, Looper looper, l lVar) {
            super(looper);
            this.f115135a = lVar;
            this.f115137c = aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final float a(int i2) {
        return this.f115127d.a(i2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void b(float f2) {
        this.f115127d.b(f2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void c(int i2) {
        l lVar = this.f115127d;
        if (lVar != null) {
            lVar.c(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void d(int i2) {
        l lVar = this.f115127d;
        if (lVar != null) {
            lVar.d(i2);
        }
    }

    public h(l lVar) {
        this.f115127d = lVar;
        B();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(float f2) {
        a aVar = this.f115129f;
        if (aVar != null) {
            aVar.obtainMessage(11, Float.valueOf(f2)).sendToTarget();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void b(int i2) {
        a aVar = this.f115129f;
        if (aVar != null) {
            aVar.a(i2);
            this.f115129f.sendEmptyMessage(12);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void b(Surface surface) {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyAsyncPlayer", "setSurfaceDirectly(), surface = " + surface + ", mSimplifyPlayer = " + this.f115127d + ", " + this.f115130g);
        }
        this.f115127d.b(surface);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void b(String str) {
        this.f115127d.b(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean b(OnUIPlayListener onUIPlayListener) {
        OnUIPlayListener onUIPlayListener2 = this.f115124a;
        if (onUIPlayListener2 == null || onUIPlayListener2.getWrapperedListener() == null || !this.f115124a.getWrapperedListener().equals(onUIPlayListener)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(Surface surface) {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyAsyncPlayer", "setSurface(), surface = " + surface + ", mSimplifyPlayer = " + this.f115127d + ", " + this.f115130g);
        }
        this.f115127d.a(surface);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(SurfaceHolder surfaceHolder) {
        a aVar = this.f115129f;
        if (aVar != null) {
            aVar.obtainMessage(14, surfaceHolder).sendToTarget();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(OnUIPlayListener onUIPlayListener) {
        this.f115124a = onUIPlayListener;
        this.f115127d.a(onUIPlayListener);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(float f2, float f3) {
        a aVar = this.f115129f;
        if (aVar != null) {
            aVar.obtainMessage(9, new Pair(Float.valueOf(f2), Float.valueOf(f3))).sendToTarget();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(int i2, int i3) {
        a aVar = this.f115129f;
        if (aVar != null) {
            aVar.obtainMessage(13, new Pair(Integer.valueOf(i2), Integer.valueOf(i3))).sendToTarget();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(int i2, Bundle bundle) {
        l lVar = this.f115127d;
        if (lVar != null) {
            lVar.a(i2, bundle);
        }
    }
}
