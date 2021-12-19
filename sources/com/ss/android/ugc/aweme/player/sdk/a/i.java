package com.ss.android.ugc.aweme.player.sdk.a;

import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.api.e;
import com.ss.android.ugc.aweme.player.sdk.api.h;
import com.ss.android.ugc.aweme.player.sdk.api.j;
import com.ss.android.ugc.aweme.player.sdk.api.k;
import com.ss.android.ugc.aweme.player.sdk.api.l;
import com.ss.android.ugc.aweme.player.sdk.api.n;
import com.ss.android.ugc.aweme.player.sdk.b.e;
import com.ss.android.ugc.aweme.player.sdk.util.c;
import com.ss.android.ugc.aweme.player.sdk.util.d;
import com.ss.android.ugc.playerkit.model.NativeBitrateSelectConfig;
import com.ss.android.ugc.playerkit.model.g;
import com.ss.android.ugc.playerkit.model.m;
import com.ss.android.ugc.playerkit.model.p;
import com.ss.android.ugc.playerkit.model.t;
import com.ss.android.ugc.playerkit.model.u;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class i implements l {
    private static int N;
    public boolean A;
    public boolean B;
    public final a C;
    public com.ss.android.ugc.aweme.player.sdk.api.b D;
    private boolean E;
    private boolean F;
    private com.ss.android.ugc.playerkit.a.b G;
    private k H;
    private h I;
    private String J;
    private SurfaceHolder K;
    private boolean L;
    private boolean M = false;

    /* renamed from: a  reason: collision with root package name */
    public final k f115138a = new k();

    /* renamed from: b  reason: collision with root package name */
    public j f115139b;

    /* renamed from: c  reason: collision with root package name */
    public AtomicReference<j> f115140c;

    /* renamed from: d  reason: collision with root package name */
    public m.e f115141d;

    /* renamed from: e  reason: collision with root package name */
    public p f115142e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Surface f115143f;

    /* renamed from: g  reason: collision with root package name */
    public String f115144g = "";

    /* renamed from: h  reason: collision with root package name */
    public String f115145h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f115146i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f115147j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f115148k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f115149l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f115150m;
    public int n;
    public int o;
    public int p;
    public long q;
    public long r = -1;
    public j.c s;
    public e t;
    public c u = new c(Looper.getMainLooper());
    public OnUIPlayListener v;
    public OnPreRenderListener w;
    public com.ss.android.ugc.aweme.player.sdk.api.i x;
    com.ss.android.ugc.playerkit.model.i y;
    public long z;

    static {
        Covode.recordClassIndex(73999);
    }

    public static boolean f(int i2) {
        return i2 == 0 || i2 == 1;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(p pVar, com.ss.android.ugc.aweme.player.sdk.api.b bVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void b(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void b(k kVar) {
    }

    public void b(boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void c(k kVar) {
    }

    public void e(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void q() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void r() {
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f115253a;

        /* renamed from: b  reason: collision with root package name */
        public int f115254b;

        static {
            Covode.recordClassIndex(74026);
        }

        private a() {
        }

        public final void a() {
            this.f115253a = 0;
            this.f115254b = 0;
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final int a() {
        return this.p;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final int o() {
        return this.n;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final m.e t() {
        return this.f115141d;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(p pVar) {
        if (pVar != null) {
            this.y = pVar.f148805l;
            this.f115145h = pVar.x;
            this.o = 0;
            a(pVar, pVar.f148803j, pVar.f148804k);
        }
    }

    public final void a(p pVar, String str, boolean z2) {
        a(pVar, str, z2, 0, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r1.f148705a.b() == null) goto L_0x05ee;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00d5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x05d6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c8 A[Catch:{ all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.playerkit.model.p r20, java.lang.String r21, boolean r22, long r23, boolean r25, boolean r26) {
        /*
        // Method dump skipped, instructions count: 1534
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.a.i.a(com.ss.android.ugc.playerkit.model.p, java.lang.String, boolean, long, boolean, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(Surface surface) {
        boolean z2 = false;
        if (!this.L || surface == null) {
            if (this.f115143f != surface) {
                z2 = true;
            }
            this.E = z2;
        } else {
            this.E = false;
            this.L = false;
        }
        this.f115143f = surface;
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyPlayerImpl, setSurface(), surface = " + this.f115143f + ", mPlayer = " + this.f115139b + " mStatus = " + this.p);
        }
        if (this.M && com.ss.android.ugc.playerkit.exp.b.s().booleanValue()) {
            d();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(SurfaceHolder surfaceHolder) {
        j jVar = this.f115139b;
        if (jVar != null) {
            jVar.a(surfaceHolder);
        } else {
            this.K = surfaceHolder;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(String str) {
        if (!TextUtils.isEmpty(str) && str.equals(this.f115144g)) {
            h();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(OnUIPlayListener onUIPlayListener) {
        this.v = onUIPlayListener;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(k kVar) {
        this.H = kVar;
        j jVar = this.f115139b;
        if (jVar != null) {
            jVar.a(kVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(h hVar) {
        this.I = hVar;
        j jVar = this.f115139b;
        if (jVar != null) {
            jVar.a(hVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(com.ss.android.ugc.playerkit.a.b bVar) {
        this.G = bVar;
        j jVar = this.f115139b;
        if (jVar != null) {
            jVar.a(bVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(e eVar) {
        this.t = eVar;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(com.ss.android.ugc.aweme.player.sdk.api.i iVar) {
        this.x = iVar;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean a(String str, String str2) {
        String str3;
        String str4 = this.f115144g;
        return str4 != null && str4.equals(str) && (str3 = this.J) != null && str3.equals(str2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(g gVar) {
        j jVar = this.f115139b;
        if (jVar != null) {
            jVar.a(gVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(boolean z2) {
        j jVar = this.f115139b;
        if (jVar != null) {
            jVar.d(z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(com.ss.android.ugc.aweme.player.sdk.api.m mVar) {
        j jVar = this.f115139b;
        if (jVar != null) {
            jVar.a(mVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(com.ss.android.ugc.aweme.player.sdk.api.a aVar) {
        j jVar = this.f115139b;
        if (jVar != null) {
            jVar.a(aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(j.e eVar) {
        j jVar = this.f115139b;
        if (jVar != null) {
            jVar.a(eVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(boolean z2, Bundle bundle) {
        j jVar = this.f115139b;
        if (jVar != null) {
            jVar.a(z2, bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(com.ss.android.ugc.aweme.player.sdk.api.b bVar) {
        NativeBitrateSelectConfig f2 = com.ss.android.ugc.playerkit.exp.b.f();
        if (bVar != null && f2 != null && f2.useCallback) {
            this.D = bVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void A() {
        j jVar = this.f115139b;
        if (jVar != null) {
            jVar.A();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean i() {
        j jVar = this.f115139b;
        if (jVar != null) {
            return jVar.l();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final long j() {
        j jVar;
        if (this.F || (jVar = this.f115139b) == null) {
            return -1;
        }
        return jVar.q();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final long k() {
        j jVar;
        if (this.F || (jVar = this.f115139b) == null) {
            return -1;
        }
        return jVar.r();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean l() {
        j jVar = this.f115139b;
        if (jVar != null) {
            return jVar.m();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final String n() {
        j jVar = this.f115139b;
        if (jVar != null) {
            return jVar.s();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public static class b implements n {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<i> f115255a;

        static {
            Covode.recordClassIndex(74027);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.n
        public final void a() {
            i iVar = this.f115255a.get();
            if (iVar != null) {
                final String str = iVar.f115144g;
                final OnUIPlayListener onUIPlayListener = iVar.v;
                iVar.u.a(new Runnable() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.i.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(74028);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onDecoderBuffering(true);
                            onUIPlayListener.onDecoderBuffering(str, true);
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.n
        public final void b() {
            i iVar = this.f115255a.get();
            if (iVar != null) {
                final String str = iVar.f115144g;
                final OnUIPlayListener onUIPlayListener = iVar.v;
                iVar.u.a(new Runnable() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.i.b.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(74029);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onDecoderBuffering(false);
                            onUIPlayListener.onDecoderBuffering(str, false);
                        }
                    }
                });
            }
        }

        private b(i iVar) {
            this.f115255a = new WeakReference<>(iVar);
        }

        /* synthetic */ b(i iVar, byte b2) {
            this(iVar);
        }
    }

    private void C() {
        this.f115146i = false;
        this.f115148k = false;
        this.f115149l = false;
        this.f115150m = false;
        this.n = 0;
        this.E = false;
        this.F = false;
        this.B = false;
        this.M = false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void b() {
        if (this.f115139b == null) {
            D();
            j jVar = this.f115139b;
            if (jVar != null) {
                jVar.a();
            }
            this.L = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final j.g u() {
        j jVar = this.f115140c.get();
        if (jVar != null) {
            return jVar.v();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final j.f v() {
        j jVar = this.f115140c.get();
        if (jVar != null) {
            return jVar.w();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final String w() {
        j jVar = this.f115140c.get();
        if (jVar != null) {
            return jVar.t();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean x() {
        j jVar = this.f115140c.get();
        if (jVar == null || !jVar.u()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean y() {
        j jVar = this.f115140c.get();
        if (jVar == null || !jVar.p()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean z() {
        j jVar = this.f115140c.get();
        if (jVar == null || !jVar.x()) {
            return false;
        }
        return true;
    }

    private void D() {
        com.ss.android.ugc.aweme.player.sdk.api.i iVar = this.x;
        if (iVar != null) {
            j a2 = iVar.a(this.f115141d);
            this.f115139b = a2;
            this.f115140c.set(a2);
        }
        this.f115139b.a(this.G);
        this.f115139b.a(this.H);
        this.f115139b.a(this.I);
        this.f115139b.a(new b(this, (byte) 0));
        AnonymousClass3 r1 = new j.c() {
            /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3 */

            static {
                Covode.recordClassIndex(74002);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.j.c
            public final void a(boolean z) {
                final String str = i.this.f115144g;
                if (!z) {
                    i.this.f115150m = false;
                    final OnUIPlayListener onUIPlayListener = i.this.v;
                    i.this.u.a(new Runnable() {
                        /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.AnonymousClass17 */

                        static {
                            Covode.recordClassIndex(74011);
                        }

                        public final void run() {
                            OnUIPlayListener onUIPlayListener = onUIPlayListener;
                            if (onUIPlayListener != null) {
                                onUIPlayListener.onBuffering(false);
                                onUIPlayListener.onBuffering(str, false);
                            }
                        }
                    });
                } else if (i.this.v == null) {
                } else {
                    if ((i.this.f115139b != null && i.this.f115139b.q() != 0) || i.this.f115150m) {
                        final OnUIPlayListener onUIPlayListener2 = i.this.v;
                        i.this.u.a(new Runnable() {
                            /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.AnonymousClass16 */

                            static {
                                Covode.recordClassIndex(74010);
                            }

                            public final void run() {
                                OnUIPlayListener onUIPlayListener = onUIPlayListener2;
                                if (onUIPlayListener != null) {
                                    onUIPlayListener.onBuffering(true);
                                    onUIPlayListener2.onBuffering(str, true);
                                }
                            }
                        });
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.j.c
            public final void g() {
                final String str = i.this.f115144g;
                final OnUIPlayListener onUIPlayListener = i.this.v;
                i.this.u.a(new Runnable() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(74018);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onCompleteLoaded(str, i.this.f115147j);
                        }
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.j.c
            public final void h() {
                final String str = i.this.f115144g;
                final OnUIPlayListener onUIPlayListener = i.this.v;
                i.this.u.a(new Runnable() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.AnonymousClass7 */

                    static {
                        Covode.recordClassIndex(74020);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onPlaying(str);
                        }
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.j.c
            public final void i() {
                final String str = i.this.f115144g;
                final OnUIPlayListener onUIPlayListener = i.this.v;
                i.this.u.a(new Runnable() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.AnonymousClass8 */

                    static {
                        Covode.recordClassIndex(74021);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onPlayPause(str);
                        }
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.j.c
            public final void j() {
                final String str = i.this.f115144g;
                final OnUIPlayListener onUIPlayListener = i.this.v;
                final JSONObject B = i.this.B();
                i.this.u.a(new Runnable() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.AnonymousClass9 */

                    static {
                        Covode.recordClassIndex(74022);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener;
                        if (!com.ss.android.ugc.playerkit.model.j.a(i.this.f115142e) && (onUIPlayListener = onUIPlayListener) != null) {
                            onUIPlayListener.onPlayStop(str);
                            onUIPlayListener.onPlayStop(str, i.this.z());
                            onUIPlayListener.onPlayStop(str, B);
                        }
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.j.c
            public final void d() {
                if (i.this.v != null) {
                    final String str = i.this.f115144g;
                    final OnUIPlayListener onUIPlayListener = i.this.v;
                    if (i.this.n == 0) {
                        i.this.u.a(new Runnable() {
                            /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.AnonymousClass20 */

                            static {
                                Covode.recordClassIndex(74015);
                            }

                            public final void run() {
                                OnUIPlayListener onUIPlayListener = onUIPlayListener;
                                if (onUIPlayListener != null) {
                                    onUIPlayListener.onPlayCompletedFirstTime(str);
                                }
                            }
                        });
                    }
                    i.this.n++;
                    i.this.u.a(new Runnable() {
                        /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(74014);
                        }

                        public final void run() {
                            OnUIPlayListener onUIPlayListener = onUIPlayListener;
                            if (onUIPlayListener != null) {
                                onUIPlayListener.onPlayCompleted(str);
                                onUIPlayListener.onPlayCompleted(str, i.this.n);
                            }
                        }
                    });
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.j.c
            public final void f() {
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyPlayerImpl, onRenderFromResume mUIPlayListener:" + i.this.v);
                }
                if (i.this.v != null) {
                    final OnUIPlayListener onUIPlayListener = i.this.v;
                    i.this.u.a(new Runnable() {
                        /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.AnonymousClass14 */

                        static {
                            Covode.recordClassIndex(74008);
                        }

                        public final void run() {
                            OnUIPlayListener onUIPlayListener = onUIPlayListener;
                            if (onUIPlayListener != null) {
                                onUIPlayListener.onRenderFirstFrameFromResume(i.this.f115144g);
                            }
                        }
                    });
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.j.c
            public final void b() {
                com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyPlayerImpl, onReadyForDisplay, sourceId:" + i.this.f115144g);
                if (i.this.A) {
                    i.this.B = true;
                }
                final String str = i.this.f115144g;
                final OnPreRenderListener onPreRenderListener = i.this.w;
                i.this.w = null;
                if (i.this.f115142e != null) {
                    i.this.f115142e.f148794a = null;
                }
                i.this.u.a(new Runnable() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.AnonymousClass11 */

                    static {
                        Covode.recordClassIndex(74005);
                    }

                    public final void run() {
                        OnPreRenderListener onPreRenderListener = onPreRenderListener;
                        if (onPreRenderListener != null) {
                            onPreRenderListener.onPreRenderReady(str);
                        }
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.j.c
            public final void e() {
                if (i.this.f115139b != null && i.this.f115142e.ar) {
                    i.this.f115142e.at = t.a(i.this.f115142e.c());
                    i.this.f115139b.a(i.this.f115142e.as, i.this.f115142e.at);
                    i.this.f115139b.d(true);
                }
                final String str = i.this.f115144g;
                final OnUIPlayListener onUIPlayListener = i.this.v;
                i.this.u.a(new Runnable() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(74003);
                    }

                    public final void run() {
                        if (onUIPlayListener != null && !com.ss.android.ugc.playerkit.model.j.a(i.this.f115142e)) {
                            onUIPlayListener.onPlayPrepare(str);
                        }
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.j.c
            public final void a() {
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyPlayerImpl, onPrepared(), surface = " + i.this.f115143f + ", mPlayer = " + i.this.f115139b + " mStatus = " + i.this.p + ", mPrepareOnly:" + i.this.A);
                }
                i.this.f115148k = false;
                if (i.this.p == 1) {
                    if (!(i.this.x == null || i.this.f115139b == null || !i.this.f115142e.ar)) {
                        i.this.f115142e.at = t.a(i.this.f115142e.c());
                        i.this.f115139b.a(i.this.f115142e.as, i.this.f115142e.at);
                        i.this.f115139b.d(true);
                    }
                    i.this.p = 2;
                    i.this.f115150m = true;
                    if (i.this.f115149l) {
                        i.this.r = System.currentTimeMillis();
                        if (!i.this.A) {
                            i.this.d();
                        }
                    }
                } else if (i.this.p == 5) {
                    i.this.f();
                }
            }

            /* JADX WARN: Type inference failed for: r13v2, types: [int, boolean] */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // com.ss.android.ugc.aweme.player.sdk.api.j.c
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void c() {
                /*
                // Method dump skipped, instructions count: 382
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.c():void");
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.j.c
            public final void b(final boolean z) {
                final String str = i.this.f115144g;
                final OnUIPlayListener onUIPlayListener = i.this.v;
                i.this.u.a(new Runnable() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.AnonymousClass12 */

                    static {
                        Covode.recordClassIndex(74006);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onSeekEnd(str, z);
                        }
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.j.c
            public final void a(final long j2) {
                final String str = i.this.f115144g;
                final OnUIPlayListener onUIPlayListener = i.this.v;
                i.this.u.a(new Runnable() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(74016);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onBufferedTimeMs(str, j2);
                        }
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.j.c
            public final void a(final int i2, final float f2) {
                final String str = i.this.f115144g;
                final OnUIPlayListener onUIPlayListener = i.this.v;
                i.this.u.a(new Runnable() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.AnonymousClass10 */

                    static {
                        Covode.recordClassIndex(74004);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onSeekStart(str, i2, f2);
                        }
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.j.c
            public final void a(final int i2, final JSONObject jSONObject) {
                final OnUIPlayListener onUIPlayListener = i.this.v;
                final String str = i.this.f115144g;
                i.this.u.a(new Runnable() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.AnonymousClass13 */

                    static {
                        Covode.recordClassIndex(74007);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onPlayerInternalEvent(str, i2, jSONObject);
                        }
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.j.c
            public final void a(final long j2, final int i2) {
                final String str = i.this.f115144g;
                final OnUIPlayListener onUIPlayListener = i.this.v;
                i.this.u.a(new Runnable() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(74017);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onBufferedPercent(str, j2, i2);
                        }
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.j.c
            public final void a(final com.ss.android.ugc.aweme.player.sdk.b.b bVar, final int i2) {
                final String str = i.this.f115144g;
                final OnUIPlayListener onUIPlayListener = i.this.v;
                i.this.u.a(new Runnable() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(74019);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onVideoBitrateChanged(str, bVar, i2);
                        }
                    }
                });
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
                if (r1.f115139b.k() != false) goto L_0x0033;
             */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x00f4  */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x0113  */
            /* JADX WARNING: Removed duplicated region for block: B:36:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            @Override // com.ss.android.ugc.aweme.player.sdk.api.j.c
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(int r18, int r19, java.lang.Object r20) {
                /*
                // Method dump skipped, instructions count: 277
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass3.a(int, int, java.lang.Object):void");
            }
        };
        this.s = r1;
        this.f115139b.a(r1);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void p() {
        this.p = 0;
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyPlayerImpl, clearStatus, mStatus:" + this.p + ", prepareOnly:" + this.A);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void s() {
        final float f2;
        final long j2 = j();
        final long k2 = k();
        if (k2 == 0) {
            f2 = 0.0f;
        } else {
            f2 = (((float) j2) * 100.0f) / ((float) k2);
        }
        final String str = this.f115144g;
        final OnUIPlayListener onUIPlayListener = this.v;
        this.u.a(new Runnable() {
            /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass6 */

            static {
                Covode.recordClassIndex(74025);
            }

            public final void run() {
                OnUIPlayListener onUIPlayListener = onUIPlayListener;
                if (onUIPlayListener != null) {
                    onUIPlayListener.onPlayProgressChange(f2);
                    onUIPlayListener.onPlayProgressChange(str, j2, k2);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void e() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyPlayerImpl, stop(), surface = " + this.f115143f + ", mPlayer = " + this.f115139b + " mStatus = " + this.p);
        }
        this.M = false;
        if (this.p != 6 && this.f115139b != null) {
            f();
            this.f115139b.e();
            this.p = 6;
            this.w = null;
            p pVar = this.f115142e;
            if (pVar != null) {
                pVar.f148794a = null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void f() {
        int i2;
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyPlayerImpl, pause(), surface = " + this.f115143f + ", mPlayer = " + this.f115139b + " mStatus = " + this.p);
        }
        this.M = false;
        if (this.f115139b != null && (i2 = this.p) <= 5 && i2 != 0) {
            if (!(this.f115141d == m.e.Ijk || this.f115141d == m.e.IjkHardware) || this.f115139b.m()) {
                this.f115139b.d();
                final OnUIPlayListener onUIPlayListener = this.v;
                if (onUIPlayListener != null && this.p <= 5) {
                    final String str = this.f115144g;
                    this.u.a(new Runnable() {
                        /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(74023);
                        }

                        public final void run() {
                            OnUIPlayListener onUIPlayListener = onUIPlayListener;
                            if (onUIPlayListener != null) {
                                onUIPlayListener.onPausePlay(str);
                            }
                        }
                    });
                }
            }
            if (this.p == 1 && !this.L) {
                this.f115148k = true;
            }
            this.p = 5;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void g() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyPlayerImpl, release(), surface = " + this.f115143f + ", mPlayer = " + this.f115139b + " mStatus = " + this.p);
        }
        e();
        j jVar = this.f115139b;
        if (jVar != null) {
            this.F = true;
            jVar.f();
            this.F = false;
            this.f115139b = null;
            this.f115140c.set(null);
            this.p = 7;
            this.B = false;
            this.w = null;
            p pVar = this.f115142e;
            if (pVar != null) {
                pVar.f148794a = null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void m() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyPlayerImpl, sleep(), surface = " + this.f115143f + ", mPlayer = " + this.f115139b + " mStatus = " + this.p);
        }
        this.M = false;
        j jVar = this.f115139b;
        if (jVar != null) {
            String str = this.f115144g;
            long q2 = jVar.q();
            if (str != null) {
                com.ss.android.ugc.playerkit.model.j.f148737b.put(str, Long.valueOf(q2));
            }
            f();
            this.f115139b.o();
            this.p = 6;
            this.w = null;
            p pVar = this.f115142e;
            if (pVar != null) {
                pVar.f148794a = null;
            }
        }
    }

    public final JSONObject B() {
        j.f fVar;
        long j2;
        String str;
        int i2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_super_resolution", z());
            j jVar = this.f115139b;
            if (jVar == null) {
                fVar = null;
            } else {
                fVar = jVar.w();
            }
            if (fVar != null) {
                j2 = a(this.f115139b, fVar).f115316g;
            } else {
                j2 = 0;
            }
            jSONObject.put("play_bitrate", j2);
            jSONObject.put("sr_fail_reason", (int) a(11));
            jSONObject.put("sr_algorithm_type", (double) a(12));
            jSONObject.put("audio_codec_format", (double) a(13));
            jSONObject.put("audio_bitrate", (double) a(14));
            if (N < ((Number) com.ss.android.ugc.playerkit.exp.b.n.getValue()).intValue()) {
                N++;
                JSONObject jSONObject2 = new JSONObject();
                if (d.f115450b == null) {
                    d.f115450b = d.a("video/avc");
                }
                String str2 = "";
                if (d.f115450b != null) {
                    str = d.f115450b.f115457a;
                } else {
                    str = str2;
                }
                jSONObject2.put("264_decoder_name", str);
                if (d.f115450b == null) {
                    d.f115450b = d.a("video/avc");
                }
                int i3 = -1;
                if (d.f115450b != null) {
                    i2 = d.f115450b.f115458b;
                } else {
                    i2 = -1;
                }
                jSONObject2.put("264_width_limit", i2);
                jSONObject2.put("264_height_limit", d.b());
                if (d.f115451c == null) {
                    d.f115451c = d.a("video/hevc");
                }
                if (d.f115451c != null) {
                    str2 = d.f115451c.f115457a;
                }
                jSONObject2.put("bytevc1_decoder_name", str2);
                if (d.f115451c == null) {
                    d.f115451c = d.a("video/hevc");
                }
                if (d.f115451c != null) {
                    i3 = d.f115451c.f115458b;
                }
                jSONObject2.put("bytevc1_width_limit", i3);
                jSONObject2.put("bytevc1_height_limit", d.c());
                jSONObject.put("hw_codec_info", jSONObject2);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void c() {
        int i2;
        boolean z2;
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            StringBuilder append = new StringBuilder("SimplifyPlayerImpl, render(), surface = ").append(this.f115143f).append(", mPlayer = ").append(this.f115139b).append(" mStatus = ").append(this.p).append(", mPrepareOnly:").append(this.A).append("isRenderPrepareEnabled:");
            j jVar = this.f115139b;
            if (jVar == null || !jVar.n()) {
                z2 = false;
            } else {
                z2 = true;
            }
            com.ss.android.ugc.aweme.player.sdk.a.a(append.append(z2).toString());
        }
        if (!this.A) {
            this.f115149l = true;
            j jVar2 = this.f115139b;
            if (jVar2 != null && jVar2.n() && (i2 = this.p) != 1 && i2 != 2 && i2 != 5 && i2 != 6 && i2 != 3) {
                a(this.f115142e, this.f115144g, true);
            } else if (this.p == 2) {
                d();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void d() {
        p pVar;
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyPlayerImpl, start(), surface = " + this.f115143f + ", mPlayer = " + this.f115139b + " mStatus = " + this.p + ", mPrepareOnly:" + this.A);
        }
        if (this.A || this.f115139b == null || this.p != 2) {
            return;
        }
        if ((this.f115143f == null || !this.f115143f.isValid()) && ((pVar = this.f115142e) == null || pVar.p)) {
            this.M = true;
            return;
        }
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyPlayerImpl, start surface = " + this.f115143f + ", mSimplifyPlayer = " + this.f115139b);
        }
        this.f115138a.a(this.f115143f);
        this.f115139b.a(this.f115143f);
        this.f115139b.c();
        this.p = 3;
        this.M = false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void h() {
        j jVar;
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyPlayerImpl, resume(), surface = " + this.f115143f + ", mPlayer = " + this.f115139b + " mStatus = " + this.p + ", isPrepare2Pause =" + this.f115148k + " mSurfaceChanged = " + this.E + ", mPrepareOnly:" + this.A);
        }
        if (!this.A) {
            int i2 = this.p;
            boolean z2 = false;
            if (i2 < 2 || i2 > 5 || this.f115148k) {
                a(this.f115142e, this.f115144g);
                this.f115148k = false;
            } else {
                p pVar = this.f115142e;
                if (pVar != null && pVar.N) {
                    z2 = true;
                }
                if (!this.E || (jVar = this.f115139b) == null || !jVar.j() || z2) {
                    this.p = 2;
                    a(com.ss.android.ugc.playerkit.model.c.f148702a.getVideoEffectInfo());
                    d();
                } else {
                    this.f115142e.O = true;
                    a(this.f115142e, this.f115144g, true, this.f115139b.q(), true);
                }
            }
            final String str = this.f115144g;
            final OnUIPlayListener onUIPlayListener = this.v;
            this.u.a(new Runnable() {
                /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(74024);
                }

                public final void run() {
                    OnUIPlayListener onUIPlayListener = onUIPlayListener;
                    if (onUIPlayListener != null) {
                        onUIPlayListener.onResumePlay(str);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(float f2) {
        j jVar = this.f115139b;
        if (jVar != null) {
            jVar.a(f2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void c(int i2) {
        j jVar = this.f115139b;
        if (jVar != null) {
            jVar.b(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void d(int i2) {
        j jVar = this.f115139b;
        if (jVar != null) {
            jVar.c(i2);
        }
    }

    private static boolean b(p pVar) {
        if (pVar == null || !pVar.M || !com.ss.android.ugc.playerkit.exp.b.h()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final float a(int i2) {
        j jVar = this.f115140c.get();
        if (this.F || jVar == null) {
            return -1.0f;
        }
        return jVar.a(i2);
    }

    public i(m.e eVar) {
        this.f115141d = eVar;
        this.f115140c = new AtomicReference<>(null);
        this.C = new a((byte) 0);
    }

    private void c(boolean z2) {
        this.F = true;
        j jVar = this.f115139b;
        if (jVar != null) {
            jVar.b(z2);
        }
        this.F = false;
        this.p = 0;
        this.B = false;
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyPlayerImpl, resetPlayer()");
        }
        if (this.f115142e != null && com.ss.android.ugc.playerkit.exp.b.k()) {
            this.f115142e.e();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void b(float f2) {
        j jVar = this.f115140c.get();
        if (jVar != null) {
            jVar.b(f2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void b(Surface surface) {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyPlayerImpl, setSurfaceDirectly(), surface = " + this.f115143f + ", mPlayer = " + this.f115139b + " mStatus = " + this.p);
        }
        j jVar = this.f115139b;
        if (jVar != null) {
            jVar.a(surface);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void b(String str) {
        j jVar = this.f115140c.get();
        if (jVar != null) {
            jVar.b(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final boolean b(OnUIPlayListener onUIPlayListener) {
        OnUIPlayListener onUIPlayListener2 = this.v;
        if (onUIPlayListener2 == null || !onUIPlayListener2.equals(onUIPlayListener)) {
            return false;
        }
        return true;
    }

    public static j.f a(j jVar, j.f fVar) {
        if (com.ss.android.ugc.playerkit.exp.b.q()) {
            return fVar;
        }
        if (jVar == null) {
            return null;
        }
        return jVar.w();
    }

    private void a(p pVar, String str) {
        if (com.ss.android.ugc.playerkit.model.c.f148702a.isCallbackCompletionFix() && pVar != null && pVar.B && this.v != null) {
            this.u.a(new j(this, pVar));
        }
        a(pVar, str, true, 0, false);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(float f2, float f3) {
        if (this.f115139b != null) {
            float adjustedVolume = com.ss.android.ugc.playerkit.model.c.f148702a.getAdjustedVolume();
            if (f2 == 1.0f && f3 == 1.0f && adjustedVolume > 0.0f) {
                this.f115139b.a(adjustedVolume, adjustedVolume);
            } else {
                this.f115139b.a(f2, f3);
            }
        }
    }

    private void a(p pVar, boolean z2) {
        boolean z3;
        this.C.a();
        this.z = Thread.currentThread().getId();
        C();
        this.f115142e = pVar;
        this.q = System.currentTimeMillis();
        this.f115146i = pVar.n;
        if (pVar.R == null && com.ss.android.ugc.playerkit.exp.b.n().a().booleanValue()) {
            this.f115146i = pVar.a().f148827d;
            com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyPlayerImpl, adjust bytevc1 : " + pVar.n + " -> " + this.f115146i);
        }
        if (pVar.R != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f115147j = z3;
        if (this.f115139b == null) {
            D();
        } else if (pVar.I) {
            this.f115139b.d();
            this.f115139b.e();
            this.f115139b.f();
            this.f115139b = null;
            this.f115140c.set(null);
            D();
        } else if (!pVar.L) {
            c(pVar.O);
            if (z2) {
                this.f115139b.i();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.l
    public final void a(int i2, Bundle bundle) {
        j jVar = this.f115139b;
        if (jVar != null) {
            jVar.a(i2, bundle);
        }
    }

    private void a(final p pVar, final String str, final boolean z2, final long j2, final boolean z3) {
        p pVar2;
        if (pVar != null) {
            if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyPlayerImpl, prepare, mStatus:" + this.p + ", prepareOnly:" + pVar.t);
            }
            SystemClock.elapsedRealtime();
            boolean z4 = false;
            this.M = false;
            this.w = pVar.f148794a;
            int i2 = this.p;
            if (i2 <= 0 || i2 >= 6 || (pVar2 = this.f115142e) == null || !pVar2.t || !TextUtils.equals(pVar.f148803j, this.f115142e.f148803j)) {
                pVar.az = 0;
                this.A = pVar.t;
                if (b(pVar)) {
                    a(pVar, str, z2, j2, z3, true);
                    return;
                }
                NativeBitrateSelectConfig f2 = com.ss.android.ugc.playerkit.exp.b.f();
                if (f2 != null && f2.useCallback) {
                    a(pVar, z3);
                }
                if (pVar.f148799f == null) {
                    a(pVar, str, z2, j2, z3, true);
                } else if (f2 == null || !f2.useCallback) {
                    a(pVar, str, z2, j2, z3, true);
                } else {
                    com.ss.android.ugc.aweme.player.sdk.b.e eVar = pVar.f148798e;
                    if (!com.ss.android.ugc.playerkit.exp.b.f().useNative || !this.f115139b.b()) {
                        if (this.D != null) {
                            SystemClock.elapsedRealtime();
                            this.D.a(1, 1, eVar);
                            SystemClock.elapsedRealtime();
                        }
                        if (pVar.f148799f != null) {
                            pVar.f148799f.run();
                        }
                        if (this.D != null) {
                            SystemClock.elapsedRealtime();
                            this.D.b(1, 1, eVar);
                            SystemClock.elapsedRealtime();
                            this.D.a(1, 1, eVar.f115343i);
                            SystemClock.elapsedRealtime();
                            e.a aVar = eVar.f115343i;
                            if (aVar != null) {
                                pVar.C = new u();
                                pVar.C.f148828e = new com.ss.android.ugc.playerkit.model.a(aVar.f115348a, aVar.f115349b, aVar.f115350c, aVar.f115351d, aVar.f115352e, aVar.f115353f, aVar.f115354g, aVar.f115355h);
                                pVar.C.f148824a = aVar.w;
                                pVar.C.f148825b = aVar.f115360m;
                                u uVar = pVar.C;
                                if (aVar.f115351d == 1) {
                                    z4 = true;
                                }
                                uVar.f148827d = z4;
                                pVar.C.f148829f = aVar.f115352e;
                                pVar.C.f148830g = aVar.f115354g;
                                pVar.C.f148831h = aVar.u;
                                pVar.C.f148832i = aVar.t;
                                if (pVar.R != null) {
                                    pVar.R.f148712h = aVar.v;
                                }
                                a(pVar, str, z2, j2, z3, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    this.f115139b.a(pVar.f148798e, new com.ss.android.ugc.aweme.player.sdk.api.b() {
                        /* class com.ss.android.ugc.aweme.player.sdk.a.i.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(74000);
                        }

                        @Override // com.ss.android.ugc.aweme.player.sdk.api.b
                        public final boolean a(int i2, int i3, com.ss.android.ugc.aweme.player.sdk.b.e eVar) {
                            if (i.this.D == null) {
                                return false;
                            }
                            SystemClock.elapsedRealtime();
                            i.this.D.a(i2, i3, eVar);
                            SystemClock.elapsedRealtime();
                            return false;
                        }

                        @Override // com.ss.android.ugc.aweme.player.sdk.api.b
                        public final boolean b(int i2, int i3, com.ss.android.ugc.aweme.player.sdk.b.e eVar) {
                            if (i.this.D == null) {
                                return false;
                            }
                            SystemClock.elapsedRealtime();
                            i.this.D.b(i2, i3, eVar);
                            SystemClock.elapsedRealtime();
                            return false;
                        }

                        @Override // com.ss.android.ugc.aweme.player.sdk.api.c
                        public final void a(int i2, int i3, e.a aVar) {
                            if (i.this.D != null) {
                                SystemClock.elapsedRealtime();
                                i.this.D.a(i2, i3, aVar);
                                SystemClock.elapsedRealtime();
                            }
                            if (aVar != null) {
                                boolean z = true;
                                if (i3 == 1) {
                                    pVar.C = new u();
                                    pVar.C.f148828e = new com.ss.android.ugc.playerkit.model.a(aVar.f115348a, aVar.f115349b, aVar.f115350c, aVar.f115351d, aVar.f115352e, aVar.f115353f, aVar.f115354g, aVar.f115355h);
                                    pVar.C.f148824a = aVar.w;
                                    pVar.C.f148825b = aVar.f115360m;
                                    u uVar = pVar.C;
                                    if (aVar.f115351d != 1) {
                                        z = false;
                                    }
                                    uVar.f148827d = z;
                                    pVar.C.f148829f = aVar.f115352e;
                                    pVar.C.f148830g = aVar.f115354g;
                                    pVar.C.f148831h = aVar.u;
                                    pVar.C.f148832i = aVar.t;
                                    if (pVar.R != null) {
                                        pVar.R.f148712h = aVar.v;
                                    }
                                    i.this.a(pVar, str, z2, j2, z3, false);
                                }
                            }
                        }
                    });
                }
            } else {
                if (this.f115142e.C != null) {
                    pVar.C = this.f115142e.C;
                }
                pVar.N = this.f115142e.N;
                if (this.f115142e.az != 0) {
                    pVar.az = this.f115142e.az;
                }
                this.C.f115254b = Thread.currentThread().getPriority();
                this.f115142e = pVar;
                this.A = pVar.t;
                if (com.ss.android.ugc.playerkit.model.c.f148702a.isPrerenderSurfaceSlowSetFix() || pVar.K) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("SimplifyPlayerImpl", "fix prerender surface slow : setSurface before start");
                    if (this.f115142e.u != null) {
                        a(this.f115142e.u);
                    }
                }
                if (this.p > 1 && !this.A) {
                    this.p = 2;
                    a(com.ss.android.ugc.playerkit.model.c.f148702a.getVideoEffectInfo());
                    d();
                }
                SystemClock.elapsedRealtime();
            }
        }
    }
}
