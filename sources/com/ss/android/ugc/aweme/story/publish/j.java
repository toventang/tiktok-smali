package com.ss.android.ugc.aweme.story.publish;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.x;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.concurrent.ExecutorService;

public final class j extends com.ss.android.ugc.aweme.shortvideo.v.a {

    /* renamed from: i  reason: collision with root package name */
    public static final h f138145i = i.a((h.f.a.a) b.f138151a);

    /* renamed from: j  reason: collision with root package name */
    public static final a f138146j = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    volatile boolean f138147h;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f138148k;

    /* renamed from: l  reason: collision with root package name */
    private volatile boolean f138149l;

    /* renamed from: m  reason: collision with root package name */
    private volatile com.ss.android.ugc.aweme.publish.f.h f138150m;
    private final h n = i.a((h.f.a.a) new c(this));

    private final b k() {
        return (b) this.n.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.a
    public final void d() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.a
    public final void f(com.ss.android.ugc.aweme.publish.f.h hVar) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90341);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.f, com.ss.android.ugc.aweme.shortvideo.v.a
    public final void i() {
        throw new com.ss.android.ugc.aweme.shortvideo.ui.a.b("Story not support parallel publish");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.f, com.ss.android.ugc.aweme.shortvideo.v.a
    public final void j() {
        throw new com.ss.android.ugc.aweme.shortvideo.ui.a.b("Story not support parallel publish");
    }

    static final class c extends m implements h.f.a.a<b> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(90343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b(new h.f.a.a<z>(this.this$0) {
                /* class com.ss.android.ugc.aweme.story.publish.j.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(90344);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    j jVar = (j) this.receiver;
                    jVar.f138147h = true;
                    jVar.a();
                    return z.f158842a;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.a
    public final void e() {
        ((ExecutorService) f138145i.getValue()).execute(k());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.a
    public final void f() {
        k().a();
        this.f138148k = true;
        b();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.a
    public final void g() {
        k().a();
        this.f138148k = false;
    }

    static final class b extends m implements h.f.a.a<ExecutorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f138151a = new b();

        static {
            Covode.recordClassIndex(90342);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ExecutorService invoke() {
            l.a a2 = l.a(o.SERIAL);
            a2.f79173b = "story_publisher_synthetic_executor";
            return g.a(a2.a());
        }
    }

    static {
        Covode.recordClassIndex(90340);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.a
    public final ar h() {
        ar a2 = new ar().a("is_story", (Integer) 1);
        h.f.b.l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.a
    public final void d(com.ss.android.ugc.aweme.publish.f.h hVar) {
        a(hVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.a
    public final void e(com.ss.android.ugc.aweme.publish.f.h hVar) {
        this.f138150m = hVar;
        this.f138149l = true;
        if (this.f138149l) {
            c(this.f138150m);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(com.ss.android.ugc.aweme.shortvideo.j jVar, int i2, int i3, int i4, String str, boolean z, x<ai> xVar) {
        super(jVar, i2, i3, i4, str, z, xVar);
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(xVar, "");
    }
}
