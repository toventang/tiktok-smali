package com.ss.android.ugc.aweme.dsp.playerservice.f;

import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.a.d;
import com.ss.android.ugc.aweme.dsp.playerservice.a.h;
import com.ss.android.ugc.aweme.dsp.playerservice.a.j;
import com.ss.android.ugc.aweme.dsp.playerservice.a.m;
import com.ss.android.ugc.aweme.dsp.playerservice.a.o;
import com.ss.android.ugc.aweme.dsp.playerservice.a.q;
import com.ss.android.ugc.aweme.dsp.playerservice.c.b;
import com.ss.android.ugc.aweme.dsp.playerservice.c.f;
import com.ss.android.ugc.aweme.dsp.playerservice.c.g;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.c;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.e;
import h.a.n;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.dsp.playerservice.d.a f83565a;

    /* renamed from: b  reason: collision with root package name */
    public final c f83566b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.dsp.playerservice.d.b.a f83567c;

    /* renamed from: d  reason: collision with root package name */
    private e f83568d;

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.dsp.playerservice.plugin.a f83569e;

    static {
        Covode.recordClassIndex(52154);
    }

    public a() {
        this(null, null, null, null, 15);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(float f2) {
        this.f83565a.a(f2);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(int i2, int i3) {
        this.f83565a.a(i2, i3);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(long j2) {
        this.f83565a.a(j2);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.c
    public final void a(Surface surface) {
        this.f83565a.a(surface);
    }

    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.a.a aVar) {
        l.d(aVar, "");
        this.f83569e.a(aVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final void a(d dVar) {
        l.d(dVar, "");
        this.f83565a.a(dVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.i
    public final void a(h hVar) {
        l.d(hVar, "");
        this.f83565a.a(hVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.k
    public final void a(j jVar) {
        l.d(jVar, "");
        this.f83565a.a(jVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.n
    public final void a(m mVar) {
        l.d(mVar, "");
        this.f83565a.a(mVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.p
    public final void a(o oVar) {
        l.d(oVar, "");
        this.f83565a.a(oVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.r
    public final void a(q qVar) {
        l.d(qVar, "");
        this.f83565a.a(qVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        this.f83565a.a(cVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
        l.d(dVar, "");
        this.f83565a.a(dVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.a aVar) {
        l.d(aVar, "");
        this.f83565a.a(aVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(b bVar) {
        l.d(bVar, "");
        this.f83565a.a(bVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.c cVar) {
        l.d(cVar, "");
        this.f83565a.a(cVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(f fVar) {
        l.d(fVar, "");
        this.f83565a.a(fVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(g gVar) {
        l.d(gVar, "");
        this.f83565a.a(gVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final void a(List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c> list, Integer num) {
        l.d(list, "");
        this.f83565a.a(list, num);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean a(com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        return this.f83565a.a(fVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final com.ss.android.ugc.aweme.dsp.playerservice.b.c a_(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        return this.f83565a.a_(cVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean a_(long j2) {
        return this.f83565a.a_(j2);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void b(long j2) {
        this.f83565a.b(j2);
    }

    public final void b(com.ss.android.ugc.aweme.dsp.playerservice.a.a aVar) {
        l.d(aVar, "");
        this.f83569e.b(aVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.i
    public final void b(h hVar) {
        l.d(hVar, "");
        this.f83565a.b(hVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.k
    public final void b(j jVar) {
        l.d(jVar, "");
        this.f83565a.b(jVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.p
    public final void b(o oVar) {
        l.d(oVar, "");
        this.f83565a.b(oVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.r
    public final void b(q qVar) {
        l.d(qVar, "");
        this.f83565a.b(qVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void b(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        l.d(cVar, "");
        this.f83565a.b(cVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void b(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
        l.d(dVar, "");
        this.f83565a.b(dVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final void b(com.ss.android.ugc.aweme.dsp.playerservice.c.c cVar) {
        l.d(cVar, "");
        this.f83565a.b(cVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean b(com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        return this.f83565a.b(fVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void bd_() {
        this.f83565a.bd_();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void be_() {
        this.f83565a.be_();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void c() {
        this.f83565a.c();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.c
    public final void c(long j2) {
        this.f83565a.c(j2);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.c
    public final void c(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        this.f83565a.c(cVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final void c(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
        l.d(dVar, "");
        this.f83565a.c(dVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean c(com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        return this.f83565a.c(fVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.o
    public final boolean c(com.ss.android.ugc.aweme.dsp.playerservice.c.c cVar) {
        l.d(cVar, "");
        return this.f83565a.c(cVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final List<com.ss.android.ugc.aweme.dsp.playerservice.b.c> d(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        return this.f83565a.d(cVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void d() {
        this.f83565a.d();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.o
    public final boolean d(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
        l.d(dVar, "");
        return this.f83565a.d(dVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean d(com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        return this.f83565a.d(fVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.c
    public final f e() {
        return this.f83565a.e();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final void e(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        l.d(cVar, "");
        this.f83565a.e(cVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.c
    public final void e(com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        this.f83565a.e(fVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.c
    public final long f() {
        return this.f83565a.f();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.c
    public final void f(com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        this.f83565a.f(fVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.o
    public final boolean f(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        l.d(cVar, "");
        return this.f83565a.f(cVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.c
    public final long g() {
        return this.f83565a.g();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.c
    public final void g(com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        this.f83565a.g(fVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.c
    public final int h() {
        return this.f83565a.h();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.c
    public final void h(com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        this.f83565a.h(fVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.c
    public final int i() {
        return this.f83565a.i();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.l
    public final void i(com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        this.f83565a.i(fVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.c
    public final int j() {
        return this.f83565a.j();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.l
    public final void j(com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        this.f83565a.j(fVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.c
    public final boolean k() {
        return this.f83565a.k();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.c
    public final com.ss.android.ugc.aweme.dsp.playerservice.b.g l() {
        return this.f83565a.l();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final com.ss.android.ugc.aweme.dsp.playerservice.b.c n() {
        return this.f83565a.n();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final com.ss.android.ugc.aweme.dsp.playerservice.b.c o() {
        return this.f83565a.o();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final com.ss.android.ugc.aweme.dsp.playerservice.b.c p() {
        return this.f83565a.p();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final boolean q() {
        return this.f83565a.q();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final boolean r() {
        return this.f83565a.r();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final void s() {
        this.f83565a.s();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.g
    public final void u() {
        this.f83565a.u();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final d v() {
        return this.f83565a.v();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.g
    public final long t() {
        return this.f83565a.f83426a.f83494b;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bc_() {
        e eVar = this.f83568d;
        if (eVar != null) {
            b((com.ss.android.ugc.aweme.dsp.playerservice.a.a) eVar);
        }
        com.ss.android.ugc.aweme.dsp.playerservice.d.a aVar = this.f83565a;
        if (aVar != null) {
            aVar.bc_();
        }
    }

    /* renamed from: w */
    public final com.ss.android.ugc.aweme.dsp.playerservice.e.b m() {
        com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar;
        com.ss.android.ugc.aweme.dsp.playerservice.d.a aVar = this.f83565a;
        com.ss.android.ugc.aweme.dsp.playerservice.e.b bVar = null;
        if (aVar != null) {
            dVar = aVar.m();
        } else {
            dVar = null;
        }
        if (dVar instanceof com.ss.android.ugc.aweme.dsp.playerservice.e.b) {
            bVar = dVar;
        }
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bb_() {
        com.ss.android.ugc.aweme.dsp.playerservice.d.a aVar = this.f83565a;
        if (aVar != null) {
            aVar.bb_();
        }
        a(this.f83569e);
        a(this.f83567c);
        a(new com.ss.android.ugc.aweme.dsp.playerservice.plugin.b());
        a(new com.ss.android.ugc.aweme.dsp.playerservice.d.b.a.b());
        a(this.f83566b);
        e eVar = this.f83568d;
        if (eVar != null) {
            a((m) eVar);
            a((com.ss.android.ugc.aweme.dsp.playerservice.a.a) eVar);
        }
    }

    public final void d(long j2) {
        this.f83567c.f83476c = j2;
    }

    private com.ss.android.ugc.aweme.dsp.playerservice.b.c g(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar2;
        com.ss.android.ugc.aweme.dsp.playerservice.e.b w;
        CopyOnWriteArrayList<com.ss.android.ugc.aweme.dsp.playerservice.b.c> copyOnWriteArrayList;
        if (cVar == null) {
            cVar2 = this.f83565a.n();
        } else {
            cVar2 = cVar;
        }
        if (cVar2 == null && ((w = m()) == null || (copyOnWriteArrayList = w.f83535c) == null || (cVar2 = (com.ss.android.ugc.aweme.dsp.playerservice.b.c) n.h((List) copyOnWriteArrayList)) == null)) {
            return null;
        }
        if (!com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.a(cVar2.a())) {
            return cVar;
        }
        List<com.ss.android.ugc.aweme.dsp.playerservice.b.c> d2 = d(cVar2);
        int size = d2.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.a(d2.get(i2).a())) {
                return d2.get(i2);
            }
            if (l.a(d2.get(i2), this.f83565a.n())) {
                return d2.get(i2);
            }
        }
        return null;
    }

    public final com.ss.android.ugc.aweme.dsp.playerservice.b.j a(String str) {
        CopyOnWriteArrayList<com.ss.android.ugc.aweme.dsp.playerservice.b.c> copyOnWriteArrayList;
        T t;
        com.ss.android.ugc.aweme.dsp.playerservice.b.c n;
        com.ss.android.ugc.aweme.dsp.playerservice.e.b w = m();
        if (w == null || (copyOnWriteArrayList = w.f83535c) == null) {
            return new com.ss.android.ugc.aweme.dsp.playerservice.b.j(com.ss.android.ugc.aweme.dsp.playerservice.c.h.ERROR, null);
        }
        com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar = (com.ss.android.ugc.aweme.dsp.playerservice.b.c) n.h((List) copyOnWriteArrayList);
        if (cVar == null) {
            return new com.ss.android.ugc.aweme.dsp.playerservice.b.j(com.ss.android.ugc.aweme.dsp.playerservice.c.h.ERROR, null);
        }
        if (str != null) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (l.a((Object) t.a(), (Object) str)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                cVar = t2;
            }
        } else if (this.f83565a.e().isPlayingOrPause() && (n = this.f83565a.n()) != null) {
            cVar = n;
        }
        if (com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.b() && !com.ss.android.ugc.aweme.dsp.b.b.a(cVar.a(), this.f83565a.v())) {
            return new com.ss.android.ugc.aweme.dsp.playerservice.b.j(com.ss.android.ugc.aweme.dsp.playerservice.c.h.PLAYABLE_LIMITED_UPSELL_RESSO, cVar);
        }
        com.ss.android.ugc.aweme.dsp.playerservice.b.c n2 = this.f83565a.n();
        if (!l.a(n2, cVar) || !this.f83565a.e().isPlayingOrPause()) {
            com.ss.android.ugc.aweme.dsp.playerservice.b.c g2 = g(cVar);
            if (g2 == null) {
                return new com.ss.android.ugc.aweme.dsp.playerservice.b.j(com.ss.android.ugc.aweme.dsp.playerservice.c.h.ALL_PLAYABLE_EXPIRED, null);
            }
            e(g2);
            e((com.ss.android.ugc.aweme.dsp.playerservice.b.f) null);
            if (l.a(g2, cVar)) {
                return new com.ss.android.ugc.aweme.dsp.playerservice.b.j(com.ss.android.ugc.aweme.dsp.playerservice.c.h.PLAY_CLICKED_PLAYABLE, g2);
            }
            return new com.ss.android.ugc.aweme.dsp.playerservice.b.j(com.ss.android.ugc.aweme.dsp.playerservice.c.h.PLAY_UNEXPIRED_PLAYABLE, g2);
        }
        e((com.ss.android.ugc.aweme.dsp.playerservice.b.f) null);
        return new com.ss.android.ugc.aweme.dsp.playerservice.b.j(com.ss.android.ugc.aweme.dsp.playerservice.c.h.PLAY_CURRENT, n2);
    }

    private a(com.ss.android.ugc.aweme.dsp.playerservice.d.a aVar, c cVar, com.ss.android.ugc.aweme.dsp.playerservice.d.b.a aVar2, com.ss.android.ugc.aweme.dsp.playerservice.plugin.a aVar3) {
        e eVar;
        l.d(aVar, "");
        l.d(cVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        this.f83565a = aVar;
        this.f83566b = cVar;
        this.f83567c = aVar2;
        this.f83569e = aVar3;
        if (com.ss.android.ugc.aweme.dsp.experiment.a.a().getDspEnableBgPlay()) {
            eVar = new e();
        } else {
            eVar = null;
        }
        this.f83568d = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(com.ss.android.ugc.aweme.dsp.playerservice.d.a aVar, c cVar, com.ss.android.ugc.aweme.dsp.playerservice.d.b.a aVar2, com.ss.android.ugc.aweme.dsp.playerservice.plugin.a aVar3, int i2) {
        this((i2 & 1) != 0 ? new com.ss.android.ugc.aweme.dsp.playerservice.d.a() : aVar, (i2 & 2) != 0 ? new c() : cVar, (i2 & 4) != 0 ? new com.ss.android.ugc.aweme.dsp.playerservice.d.b.a() : aVar2, (i2 & 8) != 0 ? new com.ss.android.ugc.aweme.dsp.playerservice.plugin.a() : aVar3);
    }
}
