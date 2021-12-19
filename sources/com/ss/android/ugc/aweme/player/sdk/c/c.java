package com.ss.android.ugc.aweme.player.sdk.c;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.api.e;
import com.ss.android.ugc.aweme.player.sdk.api.h;
import com.ss.android.ugc.aweme.player.sdk.api.i;
import com.ss.android.ugc.aweme.player.sdk.api.k;
import com.ss.android.ugc.aweme.player.sdk.c.b;
import com.ss.android.ugc.playerkit.model.j;
import com.ss.android.ugc.playerkit.model.m;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.p;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private m.e f115367a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f115368b;

    /* renamed from: c  reason: collision with root package name */
    public String f115369c;

    /* renamed from: d  reason: collision with root package name */
    public HandlerThread f115370d;

    /* renamed from: e  reason: collision with root package name */
    b f115371e;

    /* renamed from: f  reason: collision with root package name */
    i f115372f;

    /* renamed from: g  reason: collision with root package name */
    public Handler f115373g;

    /* renamed from: h  reason: collision with root package name */
    p f115374h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f115375i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f115376j;

    /* renamed from: k  reason: collision with root package name */
    public OnUIPlayListener f115377k;

    /* renamed from: l  reason: collision with root package name */
    public volatile int f115378l;

    /* renamed from: m  reason: collision with root package name */
    public volatile boolean f115379m = true;
    public int n;
    public int o;
    public boolean p;

    interface b {
        static {
            Covode.recordClassIndex(74095);
        }

        void a(c cVar, HandlerThread handlerThread);
    }

    static {
        Covode.recordClassIndex(74089);
    }

    public boolean b() {
        return false;
    }

    public final void a(p pVar) {
        p pVar2 = this.f115374h;
        final boolean z = pVar2 != null && pVar2.t && pVar != null && !pVar.t && TextUtils.equals(pVar.f148803j, this.f115374h.f148803j);
        this.f115374h = pVar;
        pVar.aC = this.f115368b;
        this.f115369c = pVar.f148803j;
        if (!this.p || !this.f115374h.o) {
            this.f115378l = this.f115374h.n ? 1 : 0;
            this.n = this.f115374h.S;
            this.o = this.f115374h.T;
        }
        SystemClock.elapsedRealtime();
        p pVar3 = this.f115374h;
        if (pVar3 != null && !this.f115375i && !this.f115376j) {
            int i2 = 2;
            if (!pVar3.t || !this.f115374h.aA) {
                a(1, 0, null);
            } else {
                a(2, 10, null);
            }
            this.f115371e.removeCallbacks(null);
            if (this.f115374h.B && !j.a(this.f115374h)) {
                if (this.f115374h.an) {
                    OnUIPlayListener onUIPlayListener = this.f115377k;
                    if (onUIPlayListener != null) {
                        onUIPlayListener.onPreparePlay(this.f115369c);
                        n nVar = new n(this.f115369c);
                        if (!z) {
                            i2 = 3;
                        }
                        nVar.f148793e = i2;
                        this.f115377k.onPreParePlay(this.f115369c, nVar);
                    }
                } else if (this.f115377k != null) {
                    this.f115373g.post(new Runnable() {
                        /* class com.ss.android.ugc.aweme.player.sdk.c.c.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(74093);
                        }

                        public final void run() {
                            int i2;
                            if (c.this.f115377k != null) {
                                c.this.f115377k.onPreparePlay(c.this.f115369c);
                                n nVar = new n(c.this.f115369c);
                                if (z) {
                                    i2 = 2;
                                } else {
                                    i2 = 3;
                                }
                                nVar.f148793e = i2;
                                c.this.f115377k.onPreParePlay(c.this.f115369c, nVar);
                            }
                        }
                    });
                }
            }
            this.f115371e.obtainMessage(1, this.f115374h).sendToTarget();
        }
    }

    public void a() {
        this.f115371e.sendEmptyMessage(16);
    }

    public final boolean c() {
        if (this.f115374h == null) {
            return true;
        }
        return false;
    }

    public final void d() {
        this.f115371e.sendEmptyMessage(20);
    }

    public final void e() {
        this.f115371e.removeMessages(12);
    }

    public final void f() {
        this.f115371e.sendEmptyMessage(6);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f115385a = -1;

        /* renamed from: b  reason: collision with root package name */
        int f115386b = -1;

        /* renamed from: c  reason: collision with root package name */
        int f115387c = -1;

        /* renamed from: d  reason: collision with root package name */
        long f115388d;

        /* renamed from: e  reason: collision with root package name */
        long f115389e;

        /* renamed from: f  reason: collision with root package name */
        long f115390f;

        /* renamed from: g  reason: collision with root package name */
        long f115391g;

        /* renamed from: h  reason: collision with root package name */
        String f115392h;

        /* renamed from: i  reason: collision with root package name */
        String f115393i;

        /* renamed from: j  reason: collision with root package name */
        String f115394j;

        /* renamed from: k  reason: collision with root package name */
        int f115395k = -1;

        static {
            Covode.recordClassIndex(74094);
        }

        a() {
        }

        public final String toString() {
            return "DebugInfo{path=" + this.f115385a + ", itc=" + this.f115386b + ", wtc=" + this.f115387c + ", it=" + this.f115388d + ", et=" + this.f115389e + ", rt=" + this.f115390f + ", qt=" + this.f115391g + ", qtd='" + this.f115392h + '\'' + ", srtd='" + this.f115393i + '\'' + ", rtd='" + this.f115394j + '\'' + ", qr='" + this.f115395k + '\'' + '}';
        }
    }

    public final void g() {
        f();
        e();
        this.f115371e.sendEmptyMessage(17);
    }

    public final void h() {
        Message obtainMessage = this.f115371e.obtainMessage(7);
        a(3, 10, obtainMessage);
        this.f115371e.removeCallbacksAndMessages(null);
        obtainMessage.sendToTarget();
        this.f115375i = true;
    }

    public String toString() {
        return com.a.a("PlaySession{this=%s, key=%s, mIsReleasing=%s, mIsReleased=%s}", new Object[]{super.toString(), this.f115369c, Boolean.valueOf(this.f115375i), Boolean.valueOf(this.f115376j)});
    }

    public final void a(OnUIPlayListener onUIPlayListener) {
        this.f115377k = onUIPlayListener;
        this.f115372f.v = onUIPlayListener;
    }

    public final void a(Surface surface) {
        if (((Boolean) com.ss.android.ugc.playerkit.exp.b.f148668b.getValue()).booleanValue()) {
            this.f115371e.obtainMessage(21, surface).sendToTarget();
        } else {
            this.f115372f.a(surface);
        }
    }

    public final void b(Surface surface) {
        this.f115372f.b(surface);
        this.f115371e.obtainMessage(15, surface).sendToTarget();
    }

    public final void a(com.ss.android.ugc.aweme.player.sdk.api.b bVar) {
        this.f115372f.a(bVar);
    }

    public final void a(e eVar) {
        this.f115372f.t = eVar;
    }

    public final void a(h hVar) {
        this.f115372f.a(hVar);
    }

    public final void a(k kVar) {
        this.f115372f.a(kVar);
    }

    public final void a(com.ss.android.ugc.playerkit.a.b bVar) {
        this.f115372f.a(bVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, Message message) {
        HandlerThread handlerThread = this.f115370d;
        if (handlerThread != null && handlerThread.getLooper() != null && this.f115370d.getLooper() != Looper.getMainLooper()) {
            int threadId = this.f115370d.getThreadId();
            if (this.f115368b && threadId > 0) {
                Process.setThreadPriority(threadId, i3);
                if ((i2 == 4 || i2 == 3) && message != null) {
                    message.obj = true;
                }
            }
        }
    }

    public c(m.e eVar, HandlerThread handlerThread, p pVar, final b bVar, i iVar, a aVar, boolean z) {
        Looper looper;
        this.f115367a = eVar;
        AnonymousClass1 r0 = new i(eVar) {
            /* class com.ss.android.ugc.aweme.player.sdk.c.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(74090);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.a.i
            public final void b(boolean z) {
                super.b(z);
                c.this.f115379m = z;
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.a.i
            public final void e(int i2) {
                super.e(i2);
                if (((Boolean) com.ss.android.ugc.playerkit.exp.b.f148678l.getValue()).booleanValue()) {
                    int i3 = c.this.f115378l;
                    c.this.f115378l = i2;
                }
            }
        };
        this.f115372f = r0;
        r0.x = iVar;
        this.f115370d = handlerThread;
        this.f115374h = pVar;
        this.f115368b = z;
        if (pVar != null) {
            this.f115369c = pVar.f148803j;
            this.f115378l = this.f115374h.n ? 1 : 0;
            this.n = pVar.S;
            this.o = pVar.T;
        }
        this.f115373g = new Handler(Looper.getMainLooper());
        if (handlerThread == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = handlerThread.getLooper();
        }
        if (handlerThread == null && com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("PlaySession", "PlaySession create play thread null, looper:" + looper + ", di:" + aVar);
        }
        if (looper == null && com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("PlaySession", "PlaySession create with looper null, playThread:" + handlerThread + ", di:" + aVar);
        }
        this.f115371e = new b(new b.a() {
            /* class com.ss.android.ugc.aweme.player.sdk.c.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(74091);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.c.b.a
            public final void a() {
                c.this.f115373g.post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.player.sdk.c.c.AnonymousClass2.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(74092);
                    }

                    public final void run() {
                        c.this.f115375i = false;
                        c.this.f115376j = true;
                        if (c.this.f115377k != null) {
                            c.this.f115377k.onPlayRelease(c.this.f115369c);
                        }
                        c.this.f115377k = null;
                        if (bVar != null) {
                            bVar.a(c.this, c.this.f115370d);
                        }
                    }
                });
            }
        }, looper, this.f115372f);
    }
}
