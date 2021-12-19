package com.ss.ugc.effectplatform.task.a;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.algorithm.f;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.e;
import com.ss.ugc.effectplatform.task.aa;
import com.ss.ugc.effectplatform.task.aj;
import com.ss.ugc.effectplatform.task.ak;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.v;
import java.util.List;

public final class a extends aj<com.ss.ugc.effectplatform.task.c.a> {

    /* renamed from: e  reason: collision with root package name */
    public static final C4093a f153697e = new C4093a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final aa f153698a;

    /* renamed from: b  reason: collision with root package name */
    public final f f153699b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.b.a f153700c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153701d;

    /* renamed from: g  reason: collision with root package name */
    private final aj<com.ss.ugc.effectplatform.task.c.a> f153702g;

    /* renamed from: h  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.a.b f153703h;

    static {
        Covode.recordClassIndex(102537);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.a.a$a  reason: collision with other inner class name */
    public static final class C4093a {
        static {
            Covode.recordClassIndex(102538);
        }

        private C4093a() {
        }

        public /* synthetic */ C4093a(byte b2) {
            this();
        }
    }

    @Override // com.ss.ugc.effectplatform.task.aj
    public final void a() {
        try {
            a(this);
            com.ss.ugc.effectplatform.a.b bVar = this.f153703h;
            if (bVar != null) {
                a(bVar);
            }
            aj<com.ss.ugc.effectplatform.task.c.a> ajVar = this.f153702g;
            if (ajVar != null) {
                ajVar.a();
            }
        } catch (Exception e2) {
            a((aj) this, new e(e2));
            b(this);
        } catch (Throwable th) {
            b(this);
            throw th;
        }
    }

    public static final class b implements ak<com.ss.ugc.effectplatform.task.c.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f153704a;

        static {
            Covode.recordClassIndex(102539);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f153704a = aVar;
        }

        @Override // com.ss.ugc.effectplatform.task.ak
        public final void a(aj<com.ss.ugc.effectplatform.task.c.a> ajVar) {
            l.c(ajVar, "");
            this.f153704a.a(ajVar);
        }

        @Override // com.ss.ugc.effectplatform.task.ak
        public final void b(aj<com.ss.ugc.effectplatform.task.c.a> ajVar) {
            l.c(ajVar, "");
            this.f153704a.b(ajVar);
        }

        @Override // com.ss.ugc.effectplatform.task.ak
        public final void a(aj<com.ss.ugc.effectplatform.task.c.a> ajVar, e eVar) {
            l.c(ajVar, "");
            l.c(eVar, "");
            this.f153704a.a((aj) ajVar, eVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.effectplatform.task.aj, java.lang.Object] */
        @Override // com.ss.ugc.effectplatform.task.ak
        public final /* synthetic */ void a(aj<com.ss.ugc.effectplatform.task.c.a> ajVar, com.ss.ugc.effectplatform.task.c.a aVar) {
            l.c(ajVar, "");
            l.c(aVar, "");
            this.f153704a.a(ajVar, aVar);
        }

        @Override // com.ss.ugc.effectplatform.task.ak
        public final void a(aj<com.ss.ugc.effectplatform.task.c.a> ajVar, int i2, long j2) {
            l.c(ajVar, "");
            this.f153704a.a(ajVar, i2, j2);
        }
    }

    public final void a(com.ss.ugc.effectplatform.a.b bVar) {
        List list;
        Effect effect = bVar.f153427a;
        try {
            if (com.ss.ugc.effectplatform.util.a.a(effect)) {
                StringBuilder append = new StringBuilder("Effect Requirements Decrypt Failed, effect: ").append(effect.getEffect_id()).append(", name: ").append(effect.getName()).append(", toDownloadRequirements: ");
                List<String> requirements_sec = effect.getRequirements_sec();
                if (requirements_sec != null) {
                    list = n.k(requirements_sec);
                } else {
                    list = null;
                }
                throw new IllegalArgumentException(append.append(list).toString());
            }
            new c(this.f153701d, this.f153698a, this.f153699b, this.f153700c, com.ss.ugc.effectplatform.util.a.a(bVar.f153427a, this.f153701d.q), 0, 64).run();
        } catch (Exception e2) {
            V v = this.f153701d.s.f156544a;
            if (v != null) {
                com.ss.ugc.effectplatform.i.b.c(v, false, this.f153701d, effect.getEffect_id(), ag.a(v.a("error_code", 10018)), "download effect failed because of model fetcher failed! detail: " + e2.getMessage());
            }
            throw e2;
        }
    }

    public a(aj<com.ss.ugc.effectplatform.task.c.a> ajVar, com.ss.ugc.effectplatform.a.b bVar, aa aaVar, f fVar, com.ss.ugc.effectplatform.b.a aVar, com.ss.ugc.effectplatform.a aVar2) {
        l.c(fVar, "");
        l.c(aVar, "");
        l.c(aVar2, "");
        this.f153702g = ajVar;
        this.f153703h = bVar;
        this.f153698a = aaVar;
        this.f153699b = fVar;
        this.f153700c = aVar;
        this.f153701d = aVar2;
        if (ajVar != null) {
            ajVar.a(new b(this));
        }
    }
}
