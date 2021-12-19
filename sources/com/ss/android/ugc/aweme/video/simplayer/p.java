package com.ss.android.ugc.aweme.video.simplayer;

import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.api.b;
import com.ss.android.ugc.aweme.player.sdk.api.h;
import com.ss.android.ugc.aweme.player.sdk.api.l;
import com.ss.android.ugc.aweme.player.sdk.b.c;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.android.ugc.aweme.video.m;
import com.ss.android.ugc.aweme.video.n;
import com.ss.android.ugc.aweme.video.simplayer.f;
import com.ss.android.ugc.aweme.video.x;
import com.ss.android.ugc.playerkit.model.d;
import com.ss.android.ugc.playerkit.model.j;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import java.util.HashMap;
import org.json.JSONObject;

public abstract class p implements f {

    /* renamed from: a  reason: collision with root package name */
    protected l f143919a;

    /* renamed from: b  reason: collision with root package name */
    protected i f143920b;

    /* renamed from: c  reason: collision with root package name */
    d f143921c;

    /* renamed from: d  reason: collision with root package name */
    public c f143922d;

    /* renamed from: e  reason: collision with root package name */
    public g f143923e;

    /* renamed from: f  reason: collision with root package name */
    com.ss.android.ugc.playerkit.model.p f143924f;

    /* renamed from: g  reason: collision with root package name */
    protected f.d f143925g;

    /* renamed from: h  reason: collision with root package name */
    protected a f143926h;

    /* renamed from: i  reason: collision with root package name */
    protected h f143927i = new h();

    /* renamed from: j  reason: collision with root package name */
    private boolean f143928j = true;

    /* renamed from: k  reason: collision with root package name */
    private Session f143929k;

    /* renamed from: l  reason: collision with root package name */
    private Session f143930l;

    /* renamed from: m  reason: collision with root package name */
    private c f143931m;
    private f.c n;
    private boolean o;
    private h p;
    private i q;
    private j r;
    private b s;

    static {
        Covode.recordClassIndex(94163);
    }

    /* access modifiers changed from: protected */
    public abstract m a(boolean z);

    /* access modifiers changed from: protected */
    public abstract g a(com.ss.android.ugc.playerkit.simapicommon.a.h hVar);

    /* access modifiers changed from: protected */
    public abstract com.ss.android.ugc.playerkit.model.p a(n nVar);

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public void a(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public void a(com.ss.android.ugc.aweme.player.sdk.api.m mVar) {
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final void k() {
        this.f143928j = true;
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public void l() {
    }

    public abstract aa n();

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final f.d h() {
        return this.f143925g;
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final f.a i() {
        return this.f143931m;
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final f.c j() {
        return this.n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02e5, code lost:
        if (r14 == null) goto L_0x0339;
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02e3  */
    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.video.n r31) {
        /*
        // Method dump skipped, instructions count: 828
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.simplayer.p.a(com.ss.android.ugc.aweme.video.n):void");
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final void a(OnUIPlayListener onUIPlayListener) {
        j jVar = this.r;
        i iVar = this.q;
        if (onUIPlayListener != null && ((Boolean) iVar.f143883f.getValue()).booleanValue()) {
            if (!h.f.b.l.a(onUIPlayListener, iVar.f143880c)) {
                iVar.f143880c = onUIPlayListener;
                iVar.f143881d = iVar.a(onUIPlayListener);
            }
            if (iVar.f143881d == null) {
                iVar.f143881d = iVar.a(onUIPlayListener);
            }
            onUIPlayListener = iVar.f143881d;
        }
        jVar.f143887a = onUIPlayListener;
        this.f143919a.a(this.r);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final void a(com.ss.android.ugc.aweme.player.sdk.api.a aVar) {
        m().a().a(aVar);
    }

    public class a implements f.b {
        static {
            Covode.recordClassIndex(94164);
        }

        @Override // com.ss.android.ugc.aweme.video.simplayer.f.b
        public final l a() {
            return p.this.f143919a;
        }

        @Override // com.ss.android.ugc.aweme.video.simplayer.f.b
        public final i b() {
            return p.this.f143920b;
        }

        @Override // com.ss.android.ugc.aweme.video.simplayer.f.b
        public final d c() {
            return p.this.f143921c;
        }

        public a() {
        }
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final void b() {
        this.f143919a.f();
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final void f() {
        this.f143919a.g();
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final void g() {
        this.f143919a.b(1.0f);
        this.f143927i.f143877a = 1.0f;
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final f.b m() {
        if (this.f143926h == null) {
            this.f143926h = new a();
        }
        return this.f143926h;
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final void a() {
        this.f143919a.b((Surface) null);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final void e() {
        this.f143920b = null;
        this.f143921c = null;
        this.f143922d = null;
        this.f143923e = null;
        this.f143927i.f143877a = 1.0f;
        this.f143919a.p();
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final void c() {
        this.q.f143879b = true;
        if (!((Boolean) ((com.ss.android.ugc.playerkit.exp.a) com.ss.android.ugc.playerkit.exp.b.f148669c.getValue()).a()).booleanValue()) {
            j.f148736a = true;
        }
        this.f143919a.m();
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final void d() {
        String str;
        IALog d2 = com.ss.android.ugc.playerkit.simapicommon.a.d();
        StringBuilder sb = new StringBuilder("resumePlay aid:");
        i iVar = this.f143920b;
        if (iVar != null) {
            str = iVar.getSourceId();
        } else {
            str = "null";
        }
        d2.e("SimPlayer", sb.append(str).toString());
        d dVar = this.f143921c;
        if (dVar != null && !TextUtils.isEmpty(dVar.f148707c)) {
            this.f143919a.a(this.f143921c.f148707c);
        } else if (this.f143920b != null && !this.f143919a.b((OnUIPlayListener) null)) {
            this.f143919a.a(this.f143920b.getSourceId());
        } else if (this.f143924f != null) {
            this.f143919a.h();
        }
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final void b(int i2) {
        m().a().d(i2);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final com.ss.android.ugc.aweme.video.simplayer.c.a a(String str) {
        h hVar = this.p;
        if (hVar == null) {
            return new com.ss.android.ugc.aweme.video.simplayer.c.a();
        }
        JSONObject a2 = hVar.a(str);
        com.ss.android.ugc.aweme.video.simplayer.c.a aVar = new com.ss.android.ugc.aweme.video.simplayer.c.a();
        if (a2 != null) {
            aVar.f143857a = a2.optLong("format_open_input", 0);
            aVar.f143858b = a2.optLong("tran_connect", 0);
            aVar.f143859c = a2.optLong("http_response", 0);
            aVar.f143860d = a2.optLong("receive_first_video_frame", 0);
            aVar.f143861e = a2.optLong("decode_first_video_frame", 0);
            aVar.f143862f = a2.optLong("render_first_video_frame", 0);
            aVar.f143863g = a2.optLong("prepared", 0);
        }
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final com.ss.android.ugc.aweme.video.simplayer.c.b b(String str) {
        h hVar = this.p;
        if (hVar == null) {
            return new com.ss.android.ugc.aweme.video.simplayer.c.b();
        }
        HashMap<String, Object> b2 = hVar.b(str);
        com.ss.android.ugc.aweme.video.simplayer.c.b bVar = new com.ss.android.ugc.aweme.video.simplayer.c.b();
        if (b2 != null) {
            if (b2.get("out_sync_total_count") instanceof Integer) {
                bVar.f143864a = ((Integer) b2.get("out_sync_total_count")).intValue();
            }
            if (b2.get("min_out_sync_begin_pos") instanceof Integer) {
                bVar.f143865b = ((Integer) b2.get("min_out_sync_begin_pos")).intValue();
            }
            if (b2.get("min_out_sync_end_pos") instanceof Integer) {
                bVar.f143866c = ((Integer) b2.get("min_out_sync_end_pos")).intValue();
            }
            if (b2.get("out_sync_video_origin_fps") instanceof Float) {
                bVar.f143867d = (int) ((Float) b2.get("out_sync_video_origin_fps")).floatValue();
            }
            if (b2.get("out_sync_video_render_fps") instanceof Float) {
                bVar.f143868e = (int) ((Float) b2.get("out_sync_video_render_fps")).floatValue();
            }
            if (b2.get("out_sync_video_total_drop_count") instanceof Integer) {
                bVar.f143869f = ((Integer) b2.get("out_sync_video_total_drop_count")).intValue();
            }
            if (b2.get("out_sync_total_duration") instanceof Long) {
                bVar.f143870g = ((Long) b2.get("out_sync_total_duration")).longValue();
            }
            if (b2.get("out_sync_max_decode_time") instanceof Long) {
                bVar.f143872i = ((Long) b2.get("out_sync_max_decode_time")).longValue();
            }
            if (b2.get("out_sync_clock_diff") instanceof Long) {
                bVar.f143871h = ((Long) b2.get("out_sync_clock_diff")).longValue();
            }
        }
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public void a(float f2) {
        this.f143919a.a(f2);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final void b(n nVar) {
        x xVar;
        boolean z;
        n nVar2;
        com.ss.android.ugc.playerkit.model.p a2;
        boolean z2;
        if (nVar.f143482b != null) {
            if (nVar.r != null) {
                xVar = nVar.r;
            } else {
                xVar = x.Normal;
            }
            xVar.setLoop(nVar.f143493m);
            if (!TextUtils.isEmpty(nVar.f143482b.getVideoModelStr())) {
                n nVar3 = new n();
                nVar3.f143897a = nVar.f143482b;
                nVar3.f143898b = nVar.f143489i;
                nVar3.f143899c = true;
                nVar3.f143900d = nVar.f143490j;
                nVar3.f143901e = nVar.n;
                nVar3.f143902f = nVar.o;
                if (!this.f143928j || nVar.I) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                nVar3.f143903g = z2;
                nVar3.f143904h = xVar;
                nVar3.f143905i = nVar;
                a2 = a(nVar3);
                nVar2 = nVar;
            } else {
                i a3 = s.a(nVar.f143482b);
                boolean z3 = nVar.f143489i;
                boolean z4 = nVar.s;
                int i2 = nVar.f143490j;
                boolean z5 = nVar.f143487g;
                String str = nVar.n;
                String str2 = nVar.o;
                boolean z6 = nVar.f143492l;
                if (!this.f143928j || nVar.I) {
                    z = false;
                } else {
                    z = true;
                }
                nVar2 = nVar;
                a2 = s.a(a3, z3, true, false, false, z4, i2, z5, str, str2, z6, z, nVar.u, xVar, nVar2);
            }
            if (a2 != null) {
                a2.f148794a = nVar2.f143481a;
                a2.u = nVar2.f143491k;
                a2.t = true;
                Session session = this.f143930l;
                if (session == null || !TextUtils.equals(session.sourceId, a2.f148803j)) {
                    Session d2 = com.ss.android.ugc.playerkit.session.a.f148854a.d(a2.x);
                    this.f143930l = d2;
                    if (d2 != null) {
                        d2.sourceId = a2.f148803j;
                        this.f143930l.bytevc1 = a2.n;
                    }
                }
                a(nVar2, a2);
                a2.o = nVar2.Q;
                a(false, a2);
                this.f143919a.a(a2, this.s);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.f
    public final void a(Surface surface) {
        this.f143919a.a(surface);
    }

    private static void a(boolean z, com.ss.android.ugc.playerkit.model.p pVar) {
        com.ss.android.ugc.f.a.a.a.a.c e2;
        boolean z2;
        int m2 = com.ss.android.ugc.playerkit.exp.b.m();
        if (m2 > 0 && pVar != null && (e2 = com.ss.android.ugc.playerkit.session.a.f148854a.e(pVar.f148803j)) != null) {
            boolean z3 = false;
            if (z) {
                if (m2 == 1 || m2 == 2) {
                    if (e2.isBytevc1() == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    pVar.n = z2;
                }
            } else if (m2 == 1 || m2 == 3) {
                if (e2.isBytevc1() == 1) {
                    z3 = true;
                }
                pVar.n = z3;
            }
        }
    }

    /* JADX DEBUG: Type inference failed for r0v7. Raw type applied. Possible types: java.util.List<? extends android.view.Surface>, java.util.List<android.view.Surface> */
    private void a(n nVar, com.ss.android.ugc.playerkit.model.p pVar) {
        if (this.o) {
            if (nVar.x) {
                this.f143927i.f143877a = nVar.w;
            }
            pVar.Z = this.f143927i.f143877a;
        } else {
            pVar.Z = nVar.w;
        }
        pVar.ah = nVar.f143488h;
        pVar.aj = nVar.z;
        pVar.ak = Long.valueOf(nVar.A);
        pVar.aF = nVar.B;
        pVar.al = nVar.C;
        pVar.am = nVar.D;
        pVar.an = nVar.E;
        pVar.ao = nVar.F;
        if (nVar.f143482b != null) {
            pVar.S = nVar.f143482b.getWidth();
            pVar.T = nVar.f143482b.getHeight();
        }
        pVar.ai = nVar.S;
        pVar.aA = nVar.N;
        pVar.K = nVar.G;
        pVar.L = nVar.H;
        pVar.N = nVar.J;
        pVar.aB = nVar.O;
        pVar.ar = nVar.K;
        pVar.as = nVar.L;
        pVar.at = nVar.M;
        pVar.aD = nVar.f143484d;
        s.a(pVar, nVar.f143483c);
        if (nVar.f143482b != null) {
            s.a(pVar, nVar.f143482b.getClaInfo());
        }
    }

    public p(l lVar, boolean z, l lVar2) {
        boolean z2 = true;
        this.f143919a = lVar;
        lVar.a(new d());
        this.f143919a.a(q.f143933a);
        this.f143919a.a(a((lVar2 == null || !lVar2.f143893a) ? false : z2));
        e eVar = new e();
        this.p = eVar;
        this.f143919a.a(eVar);
        this.f143925g = n();
        this.f143931m = new c(this.f143919a);
        this.n = new k(this.f143919a);
        this.o = z;
        this.q = new i();
        this.r = new j(this.f143925g, this.f143931m);
        b bitrateSelectListener = a.C3820a.f143369a.a().getBitrateSelectListener();
        this.s = bitrateSelectListener;
        this.f143919a.a(bitrateSelectListener);
    }
}
