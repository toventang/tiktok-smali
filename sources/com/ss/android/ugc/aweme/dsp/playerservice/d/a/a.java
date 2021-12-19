package com.ss.android.ugc.aweme.dsp.playerservice.d.a;

import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.a.j;
import com.ss.android.ugc.aweme.dsp.playerservice.b.g;
import com.ss.android.ugc.aweme.dsp.playerservice.b.k;
import com.ss.android.ugc.aweme.dsp.playerservice.c.f;
import com.ss.android.ugc.aweme.dsp.playerservice.d.a.e;
import com.ss.android.ugc.aweme.video.config.IPlayerExperiment;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.ttvideoengine.bb;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a implements com.ss.android.ugc.aweme.dsp.playerservice.a.b {

    /* renamed from: d  reason: collision with root package name */
    public static final String f83431d = a.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    public static final b f83432e = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public volatile com.ss.android.ugc.aweme.dsp.playerservice.b.c f83433a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f83434b;

    /* renamed from: c  reason: collision with root package name */
    public final j f83435c;

    /* renamed from: f  reason: collision with root package name */
    private final h f83436f = i.a((h.f.a.a) new c(this));

    /* renamed from: g  reason: collision with root package name */
    private volatile Surface f83437g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f83438h;

    private final e p() {
        return (e) this.f83436f.getValue();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bb_() {
    }

    public static final class b {
        static {
            Covode.recordClassIndex(52057);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    private final boolean q() {
        if (this.f83433a != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.b
    public final g n() {
        return p().f83457f;
    }

    public final void o() {
        this.f83434b = 0;
        this.f83438h = false;
    }

    static final class c extends m implements h.f.a.a<e> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return new e(new C1965a());
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.b
    public final void f() {
        if (q()) {
            p().c();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.b
    public final boolean m() {
        if (q()) {
            return p().f83454c;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(52055);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.b
    public final void a() {
        if (q()) {
            if (!this.f83438h) {
                this.f83438h = true;
                this.f83435c.a(f.PLAYBACK_STATE_START);
            }
            p().b();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.b
    public final f g() {
        if (q()) {
            return p().d();
        }
        return f.PLAYBACK_STATE_STOPPED;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.b
    public final long h() {
        if (q()) {
            return p().e();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.b
    public final long i() {
        if (q()) {
            return p().f();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.b
    public final int j() {
        if (q()) {
            e p = p();
            if (p.f83452a) {
                return p.a().w();
            }
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.b
    public final int k() {
        if (q()) {
            e p = p();
            if (p.f83452a) {
                return p.a().u();
            }
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.b
    public final int l() {
        if (q()) {
            e p = p();
            if (p.f83452a) {
                return p.a().v();
            }
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.b
    public final void b() {
        if (q()) {
            e p = p();
            String.valueOf(p + "  -> pause");
            p.a().l();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bc_() {
        e p = p();
        String.valueOf(p + "  -> release");
        p.g();
        if (p.f83452a) {
            p.a().a((bb) null);
            p.a().n();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.b
    public final void e() {
        if (q()) {
            e p = p();
            String.valueOf(p + "  -> resume");
            p.b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.d.a.a$a  reason: collision with other inner class name */
    final class C1965a implements e.c {
        static {
            Covode.recordClassIndex(52056);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C1965a() {
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.d.a.e.c
        public final void a(e eVar) {
            l.d(eVar, "");
            a.this.f83435c.bd_();
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.d.a.e.c
        public final void b(e eVar) {
            l.d(eVar, "");
            a.this.f83435c.be_();
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.d.a.e.c
        public final void c(e eVar) {
            l.d(eVar, "");
            a.this.f83435c.c();
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.d.a.e.c
        public final void d(e eVar) {
            l.d(eVar, "");
            a.this.f83435c.d();
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.d.a.e.c
        public final void e(e eVar) {
            l.d(eVar, "");
            l.d(eVar, "");
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.d.a.e.c
        public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.a aVar) {
            l.d(aVar, "");
            String.valueOf("Playable: " + a.this.f83433a + ", occurred an error " + aVar.f83408b);
            a.this.f83435c.a(aVar);
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.d.a.e.c
        public final void b(e eVar, long j2) {
            l.d(eVar, "");
            a.this.f83435c.b(j2);
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.d.a.e.c
        public final void a(e eVar, int i2) {
            l.d(eVar, "");
            a.this.f83434b = i2;
            if (a.this.f83434b >= 97) {
                a.this.f83434b = 100;
            }
            a.this.f83435c.a(((float) a.this.f83434b) / 100.0f);
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.d.a.e.c
        public final void a(e eVar, long j2) {
            l.d(eVar, "");
            a.this.f83435c.a(j2);
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.d.a.e.c
        public final void a(e eVar, com.ss.android.ugc.aweme.dsp.playerservice.c.b bVar) {
            l.d(eVar, "");
            l.d(bVar, "");
            a.this.f83435c.a(bVar);
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.d.a.e.c
        public final void a(e eVar, f fVar) {
            l.d(eVar, "");
            l.d(fVar, "");
            if (fVar == f.PLAYBACK_STATE_STOPPED) {
                a.this.o();
            }
            a.this.f83435c.a(fVar);
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.d.a.e.c
        public final void a(e eVar, int i2, int i3) {
            l.d(eVar, "");
            a.this.f83435c.a(i2, i3);
        }
    }

    public static final class d implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83440a;

        static {
            Covode.recordClassIndex(52059);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(a aVar) {
            this.f83440a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.d.a.e.b
        public final void a(boolean z) {
            com.ss.android.ugc.aweme.dsp.playerservice.c.g gVar;
            j jVar = this.f83440a.f83435c;
            if (z) {
                gVar = com.ss.android.ugc.aweme.dsp.playerservice.c.g.SEEK_SUCCESS;
            } else {
                gVar = com.ss.android.ugc.aweme.dsp.playerservice.c.g.SEEK_FAILED;
            }
            jVar.a(gVar);
        }
    }

    public a(j jVar) {
        l.d(jVar, "");
        this.f83435c = jVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.b
    public final void a(Surface surface) {
        if (!l.a(this.f83437g, surface)) {
            e p = p();
            String.valueOf(p + "  -> setSurface: -> " + surface);
            p.a().a(surface);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.b
    public final void a(long j2) {
        if (!q()) {
            return;
        }
        if (p().d() != f.PLAYBACK_STATE_STOPPED) {
            this.f83435c.a(com.ss.android.ugc.aweme.dsp.playerservice.c.g.SEEKING);
            p().a(j2, new d(this));
            return;
        }
        e p = p();
        String.valueOf(p + "  -> setStartPlayTime(): -> " + j2);
        p.f83456e = j2;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.b
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        o();
        com.ss.android.ugc.aweme.dsp.playerservice.b.e eVar = null;
        this.f83437g = null;
        this.f83433a = null;
        if (g() != f.PLAYBACK_STATE_STOPPED) {
            f();
        }
        this.f83435c.a(cVar);
        if (cVar != null) {
            eVar = cVar.o();
        }
        if (eVar instanceof k) {
            e p = p();
            k kVar = (k) eVar;
            String str = kVar.f83396a;
            String str2 = kVar.f83397b;
            Double d2 = kVar.f83400e;
            Double d3 = kVar.f83401f;
            String.valueOf(p + "  -> setDirectUrlUseDataLoader(): -> " + str);
            p.g();
            if (d2 == null || d3 == null) {
                p.a().f(329, 0);
                String.valueOf(p + "  -> setVolumeBalance: -> Turn Off");
            } else {
                IPlayerExperiment b2 = a.C3820a.f143369a.b();
                l.b(b2, "");
                float volLoudUnity = b2.getVolLoudUnity();
                p.a().f(329, 1);
                p.a().f(343, 1);
                p.a().a(344, volLoudUnity);
                p.a().a(345, (float) d2.doubleValue());
                p.a().a(346, (float) d3.doubleValue());
                p.a().f(347, 1);
                String.valueOf(p + "  -> setVolumeBalance: -> loudness:" + d2 + ", peak:" + d3 + ", targetLoudness:" + volLoudUnity);
            }
            p.a().b(str, str2);
            p.a().j();
        } else {
            this.f83435c.a(com.ss.android.ugc.aweme.dsp.playerservice.c.a.f83404e);
        }
        this.f83433a = cVar;
    }
}
