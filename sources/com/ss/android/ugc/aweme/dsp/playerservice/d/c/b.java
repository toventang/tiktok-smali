package com.ss.android.ugc.aweme.dsp.playerservice.d.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.a.f;
import com.ss.android.ugc.aweme.dsp.playerservice.a.o;
import com.ss.android.ugc.aweme.dsp.playerservice.a.p;
import com.ss.android.ugc.aweme.dsp.playerservice.a.q;
import com.ss.android.ugc.aweme.dsp.playerservice.a.r;
import com.ss.android.ugc.aweme.dsp.playerservice.b.d;
import com.ss.android.ugc.aweme.dsp.playerservice.c.c;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final r f83510a;

    /* renamed from: b  reason: collision with root package name */
    private final h f83511b;

    /* renamed from: c  reason: collision with root package name */
    private final p f83512c;

    static {
        Covode.recordClassIndex(52110);
    }

    private final a a() {
        return (a) this.f83511b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.p
    public final void a(o oVar) {
        l.d(oVar, "");
        this.f83512c.a(oVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.r
    public final void a(q qVar) {
        l.d(qVar, "");
        this.f83510a.a(qVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void a(d dVar) {
        l.d(dVar, "");
        this.f83510a.a(dVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void a(c cVar) {
        l.d(cVar, "");
        this.f83510a.a(cVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.p
    public final void b(o oVar) {
        l.d(oVar, "");
        this.f83512c.b(oVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.r
    public final void b(q qVar) {
        l.d(qVar, "");
        this.f83510a.b(qVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void b(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        l.d(cVar, "");
        this.f83510a.b(cVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void b(d dVar) {
        l.d(dVar, "");
        this.f83510a.b(dVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.o
    public final boolean c(c cVar) {
        l.d(cVar, "");
        return this.f83512c.c(cVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.o
    public final boolean d(d dVar) {
        l.d(dVar, "");
        return this.f83512c.d(dVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.o
    public final boolean f(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        l.d(cVar, "");
        return this.f83512c.f(cVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final d m() {
        return a().f83504a;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final void s() {
        a().s();
    }

    static final class a extends m implements h.f.a.a<a> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(52111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(this.this$0.f83510a);
        }
    }

    public /* synthetic */ b() {
        this(new d(), new c());
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bb_() {
        this.f83510a.bb_();
        this.f83512c.bb_();
        a();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final com.ss.android.ugc.aweme.dsp.playerservice.b.c n() {
        return a().n();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final com.ss.android.ugc.aweme.dsp.playerservice.b.c o() {
        return a().o();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final com.ss.android.ugc.aweme.dsp.playerservice.b.c p() {
        return a().p();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final boolean q() {
        return a().q();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final boolean r() {
        return a().r();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bc_() {
        this.f83510a.bc_();
        this.f83512c.bc_();
        a().bc_();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final List<com.ss.android.ugc.aweme.dsp.playerservice.b.c> d(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        return a().d(cVar);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final void c(d dVar) {
        l.d(dVar, "");
        if (!this.f83512c.d(dVar)) {
            a().c(dVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final void e(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        l.d(cVar, "");
        if (!this.f83512c.f(cVar)) {
            a().e(cVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final void b(c cVar) {
        l.d(cVar, "");
        if (!this.f83512c.c(cVar)) {
            a().b(cVar);
        }
    }

    private b(r rVar, p pVar) {
        l.d(rVar, "");
        l.d(pVar, "");
        this.f83510a = rVar;
        this.f83512c = pVar;
        this.f83511b = i.a((h.f.a.a) new a(this));
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.e
    public final void a(List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c> list, Integer num) {
        l.d(list, "");
        a().a(list, num);
    }
}
