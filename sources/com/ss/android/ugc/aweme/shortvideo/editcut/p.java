package com.ss.android.ugc.aweme.shortvideo.editcut;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.j;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.m;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class p implements l.b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f128391a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.c f128392b;

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f128393c;

    /* renamed from: d  reason: collision with root package name */
    public long f128394d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.fragment.app.e f128395e;

    /* renamed from: f  reason: collision with root package name */
    public final q f128396f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f128397g = h.i.a((h.f.a.a) e.f128406a);

    /* renamed from: h  reason: collision with root package name */
    private final h.h f128398h = h.i.a((h.f.a.a) h.f128410a);

    static {
        Covode.recordClassIndex(84191);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l.b
    public final void a(long j2) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l.b
    public final boolean a() {
        return true;
    }

    public final l c() {
        return (l) this.f128397g.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e d() {
        return (com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e) this.f128398h.getValue();
    }

    static final class e extends m implements h.f.a.a<l> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f128406a = new e();

        static {
            Covode.recordClassIndex(84197);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l invoke() {
            return new l();
        }
    }

    static final class h extends m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f128410a = new h();

        static {
            Covode.recordClassIndex(84201);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l.b
    public final List<VideoSegment> b() {
        return this.f128396f.b();
    }

    public static final class c implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f128401a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f128402b;

        static {
            Covode.recordClassIndex(84194);
        }

        public static final class a implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f128403a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.c f128404b;

            static {
                Covode.recordClassIndex(84195);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
            public final void a() {
                this.f128403a.f128401a.f128396f.d(false);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
            public final void a(int i2) {
                this.f128403a.f128401a.a(this.f128404b);
                this.f128403a.f128401a.f128396f.a(i2);
                this.f128403a.f128401a.f128396f.d(true);
            }

            a(c cVar, com.ss.android.ugc.aweme.shortvideo.c cVar2) {
                this.f128403a = cVar;
                this.f128404b = cVar2;
            }
        }

        c(p pVar, int i2) {
            this.f128401a = pVar;
            this.f128402b = i2;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b
        public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z) {
            if (!z) {
                this.f128401a.f128396f.d(false);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b
        public final void b(com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z) {
            if (!z) {
                this.f128401a.f128396f.d(false);
            } else {
                this.f128401a.c().b(cVar, this.f128402b, 2, new a(this, cVar));
            }
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f128400a;

        static {
            Covode.recordClassIndex(84193);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a() {
            this.f128400a.f128396f.d(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(p pVar) {
            this.f128400a = pVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a(int i2) {
            this.f128400a.f128396f.d(true);
        }
    }

    public static final class d implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f128405a;

        static {
            Covode.recordClassIndex(84196);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e.b
        public final void a() {
            this.f128405a.f128394d = System.currentTimeMillis();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(p pVar) {
            this.f128405a = pVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e.b
        public final void a(boolean z, boolean z2, boolean z3) {
            if (z) {
                this.f128405a.f128391a = true;
                this.f128405a.c().f();
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f128405a.f128395e).a(R.string.g7r).a();
            }
            if (z3) {
                com.ss.android.ugc.aweme.video.e.c(new File(com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125943b).getPath());
            }
            if (z2) {
                this.f128405a.f128396f.a(this.f128405a.b());
            }
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i.a(z, z2, System.currentTimeMillis() - this.f128405a.f128394d);
        }
    }

    private final void f() {
        a((com.ss.android.ugc.aweme.shortvideo.c) null);
        c().d();
        c().g();
        this.f128391a = false;
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.c $music;
        final /* synthetic */ int $musicStart;
        final /* synthetic */ boolean $updateAlgorithm;
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(84198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(p pVar, com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z, int i2) {
            super(0);
            this.this$0 = pVar;
            this.$music = cVar;
            this.$updateAlgorithm = z;
            this.$musicStart = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            p pVar = this.this$0;
            if (!pVar.f128393c) {
                q.a("initBingoAlgorithm when force apply music sync");
                pVar.f128393c = true;
                com.ss.android.ugc.asve.editor.g gVar = pVar.c().f125973a;
                if (gVar != null) {
                    gVar.q();
                }
            }
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.a(this.$music);
            if (this.$updateAlgorithm) {
                this.this$0.c().a((com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f) new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.editcut.p.f.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ f f128407a;

                    static {
                        Covode.recordClassIndex(84199);
                    }

                    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
                    public final void a() {
                        this.f128407a.this$0.f128396f.d(false);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f128407a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
                    public final void a(int i2) {
                        if (i2 < 0) {
                            this.f128407a.this$0.f128396f.d(false);
                        } else {
                            this.f128407a.this$0.a(this.f128407a.$music, this.f128407a.$musicStart);
                        }
                    }
                }, false);
            } else {
                this.this$0.a(this.$music, this.$musicStart);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public final List<VideoSegment> e() {
        List<VideoSegment> b2 = b();
        if (k.a(b2)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (T t : b2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            T t2 = t;
            if (!t2.f125485i && !t2.p && !d().a((VideoSegment) t2) && !com.ss.android.ugc.tools.utils.h.a(t2.a(false), true)) {
                arrayList.add(t2);
            }
            i2 = i3;
        }
        return arrayList;
    }

    public static final class a implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f128399a;

        static {
            Covode.recordClassIndex(84192);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(p pVar) {
            this.f128399a = pVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a(int i2) {
            this.f128399a.f128396f.d(true);
        }
    }

    public static final class g implements IFoundationAVService.IFetchResourcesListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f128408a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f128409b;

        static {
            Covode.recordClassIndex(84200);
        }

        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onSuccess(String[] strArr) {
            this.f128409b.invoke();
        }

        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onFailed(Exception exc) {
            q.a("downloadResourceFinderModelFile failed when start music sync");
            this.f128408a.f128396f.d(false);
        }

        g(p pVar, h.f.a.a aVar) {
            this.f128408a = pVar;
            this.f128409b = aVar;
        }
    }

    public static final class i implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f128411a;

        static {
            Covode.recordClassIndex(84202);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(p pVar) {
            this.f128411a = pVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a(int i2) {
            this.f128411a.f128396f.d(true);
        }
    }

    private final void a(h.f.a.a<z> aVar) {
        this.f128396f.w();
        if (com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125944c) {
            aVar.invoke();
        } else {
            j.a().a(new g(this, aVar));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l.b
    public final void a(int i2) {
        c();
        if (!l.a(i2)) {
            this.f128396f.c(b());
        }
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
        this.f128392b = cVar;
        c().f125975c = cVar;
    }

    public p(androidx.fragment.app.e eVar, q qVar) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(qVar, "");
        this.f128395e = eVar;
        this.f128396f = qVar;
    }

    public final void a(int i2, int i3) {
        if (this.f128392b != null) {
            this.f128396f.w();
            c().a(this.f128392b, i2, i3, new b(this));
        }
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar, int i2) {
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a.a(this.f128395e, cVar, new c(this, i2));
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar, int i2, boolean z) {
        if (cVar == null) {
            f();
        } else {
            a(new f(this, cVar, z, i2));
        }
    }

    public static /* synthetic */ void a(p pVar, com.ss.android.ugc.aweme.shortvideo.c cVar, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = true;
        }
        pVar.a(cVar, i2, z);
    }
}
