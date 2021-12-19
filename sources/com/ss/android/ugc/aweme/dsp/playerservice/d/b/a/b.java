package com.ss.android.ugc.aweme.dsp.playerservice.d.b.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.a.d;
import com.ss.android.ugc.aweme.dsp.playerservice.a.h;
import com.ss.android.ugc.aweme.dsp.playerservice.a.j;
import com.ss.android.ugc.aweme.dsp.playerservice.a.m;
import com.ss.android.ugc.aweme.dsp.playerservice.a.q;
import com.ss.android.ugc.aweme.dsp.playerservice.b.c;
import com.ss.android.ugc.aweme.dsp.playerservice.b.e;
import com.ss.android.ugc.aweme.dsp.playerservice.b.f;
import com.ss.android.ugc.aweme.dsp.playerservice.b.k;
import com.ss.android.ugc.aweme.dsp.playerservice.c.g;
import com.ss.android.ugc.aweme.dsp.playerservice.d.b.a.a;
import com.ss.ttvideoengine.d;
import com.ss.ttvideoengine.r;
import h.f.b.l;
import h.i;
import java.io.File;
import java.util.List;

public final class b implements h, j, m, q {

    /* renamed from: b  reason: collision with root package name */
    public static final a f83487b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public d f83488a;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f83489c = i.a((h.f.a.a) C1971b.f83490a);

    static {
        Covode.recordClassIndex(52100);
    }

    private final a e() {
        return (a) this.f83489c.getValue();
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

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean a(f fVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean a_(long j2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void b(long j2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean b(f fVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void bd_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void be_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean c(f fVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void d() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean d(f fVar) {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52101);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(g gVar) {
        l.d(gVar, "");
        l.d(gVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.d.b.a.b$b  reason: collision with other inner class name */
    static final class C1971b extends h.f.b.m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1971b f83490a = new C1971b();

        static {
            Covode.recordClassIndex(52102);
        }

        C1971b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final d v() {
        d dVar = this.f83488a;
        if (dVar == null) {
            l.a("mMediaPlayerService");
        }
        return dVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bb_() {
        v().a((q) this);
        v().a((j) this);
        v().a((h) this);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bc_() {
        v().b((q) this);
        v().b((j) this);
        v().b((h) this);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void c() {
        List<c> d2 = v().d((c) null);
        int i2 = 3;
        if (3 > d2.size()) {
            i2 = d2.size();
        }
        List<c> subList = d2.subList(0, i2);
        if (!subList.isEmpty()) {
            String.valueOf("preload start " + subList.size());
            for (T t : subList) {
                e();
                String a2 = a.C1970a.a((c) t);
                String e2 = t.e();
                l.d(a2, "");
                l.d(e2, "");
                String.valueOf("key:" + a2 + " start");
                d.b f2 = d.h.f152465a.f(a2);
                if (f2 == null || f2.f152389b <= 0) {
                    r rVar = new r(a2, null, 819200, new String[]{e2});
                    rVar.f153215j = new a.b(a2);
                    String.valueOf("preload, url:" + e2 + ", key:" + a2 + ", size:819200");
                    d.h.f152465a.a(rVar);
                } else {
                    String.valueOf("The key(" + a2 + ") already preloaded. preloadSize:" + a.C1970a.a(Long.valueOf(f2.f152389b)) + ", mediaSize:" + a.C1970a.a(Long.valueOf(f2.f152388a)) + ", filePath:" + f2.f152390c);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void b(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
        l.d(dVar, "");
        l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.a.d dVar) {
        l.d(dVar, "");
        this.f83488a = dVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void b(c cVar) {
        l.d(cVar, "");
        e();
        com.ss.ttvideoengine.s.j.b("TTVideoEngine", "<preload> cancel all preload task outside");
        d.h.f152465a.h();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
        l.d(dVar, "");
        l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final c a_(c cVar) {
        boolean z;
        com.ss.android.ugc.aweme.dsp.playerservice.d.b.a.a.a aVar;
        c n = v().n();
        if (n == null) {
            return cVar;
        }
        e eVar = null;
        if (cVar != null) {
            eVar = cVar.o();
        }
        if (eVar instanceof k) {
            String a2 = a.C1970a.a(n);
            e();
            l.d(a2, "");
            d.b f2 = d.h.f152465a.f(a2);
            if (f2 != null) {
                if (f2.f152388a <= 0 || f2.f152389b != f2.f152388a) {
                    z = false;
                } else {
                    z = true;
                }
                String.valueOf("Find preloaded resource associated with special key(" + a2 + "), detail is {" + f2.f152390c + ", " + f2.f152388a + ", " + f2.f152389b + ", isComplete: " + z + '}');
                String str = f2.f152390c;
                l.b(str, "");
                if (z) {
                    aVar = com.ss.android.ugc.aweme.dsp.playerservice.d.b.a.a.a.FULL_PRELOADED;
                } else {
                    aVar = com.ss.android.ugc.aweme.dsp.playerservice.d.b.a.a.a.FRAGMENT_PRELOADED;
                }
                com.ss.android.ugc.aweme.dsp.playerservice.d.b.a.a.b bVar = new com.ss.android.ugc.aweme.dsp.playerservice.d.b.a.a.b(a2, str, aVar);
                if (bVar.f83483b.length() > 0 && new File(bVar.f83483b).exists() && new File(bVar.f83483b).length() > 0) {
                    k kVar = (k) eVar;
                    cVar.a(new com.ss.android.ugc.aweme.dsp.playerservice.b.a(kVar.f83396a, a2, kVar.f83400e, kVar.f83401f));
                }
            }
        }
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.b bVar) {
        l.d(bVar, "");
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.c cVar) {
        l.d(cVar, "");
        l.d(cVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.f fVar) {
        l.d(fVar, "");
        l.d(fVar, "");
    }
}
