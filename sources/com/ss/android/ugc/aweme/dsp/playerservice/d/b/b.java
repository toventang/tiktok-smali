package com.ss.android.ugc.aweme.dsp.playerservice.d.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.a.d;
import com.ss.android.ugc.aweme.dsp.playerservice.a.g;
import com.ss.android.ugc.aweme.dsp.playerservice.a.h;
import com.ss.android.ugc.aweme.dsp.playerservice.a.j;
import com.ss.android.ugc.aweme.dsp.playerservice.a.m;
import com.ss.android.ugc.aweme.dsp.playerservice.b.c;
import com.ss.android.ugc.aweme.dsp.playerservice.c.f;
import com.ss.ttvideoengine.s.e;
import h.f.b.l;

public final class b implements g, h, j, m {

    /* renamed from: c  reason: collision with root package name */
    public static final a f83491c = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    private static final String f83492h = e.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public d f83493a;

    /* renamed from: b  reason: collision with root package name */
    public long f83494b;

    /* renamed from: d  reason: collision with root package name */
    private c f83495d;

    /* renamed from: e  reason: collision with root package name */
    private f f83496e = f.PLAYBACK_STATE_STOPPED;

    /* renamed from: f  reason: collision with root package name */
    private long f83497f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f83498g;

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(float f2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean a(com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final c a_(c cVar) {
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void b(long j2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean b(com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void bd_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void be_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean c(com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void d() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean d(com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52104);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.g
    public final long t() {
        return this.f83494b;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.g
    public final void u() {
        this.f83494b = 0;
    }

    private final void e() {
        this.f83494b = 0;
        this.f83497f = 0;
        this.f83498g = false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final d v() {
        d dVar = this.f83493a;
        if (dVar == null) {
            l.a("mMediaPlayerService");
        }
        return dVar;
    }

    static {
        Covode.recordClassIndex(52103);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bb_() {
        d v = v();
        if (v != null) {
            v.a((j) this);
        }
        d v2 = v();
        if (v2 != null) {
            v2.a((h) this);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bc_() {
        d v = v();
        if (v != null) {
            v.b((j) this);
        }
        d v2 = v();
        if (v2 != null) {
            v2.b((h) this);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean a_(long j2) {
        this.f83497f = j2;
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(long j2) {
        this.f83494b += j2 - this.f83497f;
        this.f83497f = j2;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final void a(d dVar) {
        l.d(dVar, "");
        this.f83493a = dVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(c cVar) {
        this.f83495d = cVar;
        e();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.b bVar) {
        l.d(bVar, "");
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(f fVar) {
        l.d(fVar, "");
        int i2 = c.f83499a[fVar.ordinal()];
        if (i2 != 2) {
            if (i2 == 5) {
                e();
            }
        } else if (this.f83496e.isPauseState()) {
            this.f83494b = 0;
        }
        this.f83496e = fVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.g gVar) {
        l.d(gVar, "");
        l.d(gVar, "");
    }
}
