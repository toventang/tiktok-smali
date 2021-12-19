package com.ss.android.ugc.aweme.autoplay.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.d.c;
import com.ss.android.ugc.aweme.autoplay.d.n;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.autoplay.player.live.d;
import com.ss.android.ugc.aweme.autoplay.player.live.j;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final d f67244a;

    /* renamed from: b  reason: collision with root package name */
    private final h f67245b = i.a((h.f.a.a) new C1515b(this));

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.autoplay.player.video.c f67246c;

    /* renamed from: d  reason: collision with root package name */
    private final h f67247d = i.a((h.f.a.a) new a(this));

    /* renamed from: e  reason: collision with root package name */
    private b.a f67248e;

    static {
        Covode.recordClassIndex(41412);
    }

    public final j a() {
        return (j) this.f67245b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.c
    public final n c() {
        return (n) this.f67247d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void i() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.c
    public final com.ss.android.ugc.aweme.autoplay.player.video.c b() {
        return this.f67246c;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.c
    public final b.a d() {
        return this.f67248e;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void e() {
        a().e();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void f() {
        a().f();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void g() {
        a().g();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.b$b  reason: collision with other inner class name */
    static final class C1515b extends m implements h.f.a.a<j> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(41414);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1515b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            return new j(this.this$0.f67244a);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final boolean h() {
        return a().h();
    }

    static final class a extends m implements h.f.a.a<n> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(41413);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ n invoke() {
            return new n(this.this$0.f67244a, this.this$0.a(), (byte) 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.c
    public final void a(b.a aVar) {
        this.f67248e = aVar;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void a(long j2) {
        a().a(j2);
    }

    public b(d dVar) {
        l.d(dVar, "");
        this.f67244a = dVar;
    }
}
