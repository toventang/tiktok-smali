package com.ss.android.ugc.aweme.dsp.playerservice.d.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.a.j;
import com.ss.android.ugc.aweme.dsp.playerservice.a.l;
import com.ss.android.ugc.aweme.dsp.playerservice.a.m;
import com.ss.android.ugc.aweme.dsp.playerservice.a.o;
import com.ss.android.ugc.aweme.dsp.playerservice.a.q;
import com.ss.android.ugc.aweme.dsp.playerservice.b.c;
import com.ss.android.ugc.aweme.dsp.playerservice.b.f;
import com.ss.android.ugc.aweme.dsp.playerservice.c.a;
import com.ss.android.ugc.aweme.dsp.playerservice.c.b;
import com.ss.android.ugc.aweme.dsp.playerservice.c.g;

public final class d implements j, l, m, o, q {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.playerservice.a.d f83500a;

    static {
        Covode.recordClassIndex(52106);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(float f2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(long j2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(c cVar) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void b(long j2) {
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

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void d() {
        j(new f("PLAY_FROM_AUTO_PLAY_NEXT"));
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final com.ss.android.ugc.aweme.dsp.playerservice.a.d v() {
        com.ss.android.ugc.aweme.dsp.playerservice.a.d dVar = this.f83500a;
        if (dVar == null) {
            h.f.b.l.a("mMediaPlayerService");
        }
        return dVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bb_() {
        v().a((q) this);
        v().a((o) this);
        v().a((j) this);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bc_() {
        v().b((q) this);
        v().b((o) this);
        v().b((j) this);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void b(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.o
    public final boolean c(com.ss.android.ugc.aweme.dsp.playerservice.c.c cVar) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(cVar, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.a.d dVar) {
        h.f.b.l.d(dVar, "");
        this.f83500a = dVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.l
    public final void i(f fVar) {
        c p = v().p();
        if (p != null) {
            v().e(p);
            v().e(fVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void b(c cVar) {
        String str;
        h.f.b.l.d(cVar, "");
        String a2 = cVar.a();
        c n = v().n();
        if (n != null) {
            str = n.a();
        } else {
            str = null;
        }
        if (h.f.b.l.a((Object) a2, (Object) str)) {
            v().c(cVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.o
    public final boolean d(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
        h.f.b.l.d(dVar, "");
        if (!v().e().startPlaying()) {
            return false;
        }
        v().h(new f("STOP_FROM_PLAYABLE_QUEUE_CHANGE"));
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.o
    public final boolean f(c cVar) {
        String str;
        h.f.b.l.d(cVar, "");
        c n = v().n();
        if (n != null) {
            str = n.a();
        } else {
            str = null;
        }
        if (h.f.b.l.a((Object) str, (Object) cVar.a())) {
            return true;
        }
        if (!v().e().startPlaying()) {
            return false;
        }
        v().h(new f("STOP_FROM_PLAYABLE_CHANGE"));
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.l
    public final void j(f fVar) {
        c o = v().o();
        if (o == null) {
            v().s();
            return;
        }
        v().e(o);
        v().e(fVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(a aVar) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(b bVar) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.c cVar) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(cVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.f fVar) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(fVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(g gVar) {
        h.f.b.l.d(gVar, "");
        h.f.b.l.d(gVar, "");
    }
}
