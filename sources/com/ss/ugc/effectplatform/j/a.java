package com.ss.ugc.effectplatform.j;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.algorithm.f;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.task.aa;
import com.ss.ugc.effectplatform.task.al;
import com.ss.ugc.effectplatform.util.n;
import com.ss.ugc.effectplatform.util.t;
import h.a.i;
import h.f.b.l;
import h.f.b.m;
import h.w;
import h.z;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static a f153601e;

    /* renamed from: f  reason: collision with root package name */
    public static final C4089a f153602f = new C4089a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public aa f153603a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.b.a f153604b;

    /* renamed from: c  reason: collision with root package name */
    public f f153605c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153606d;

    /* renamed from: g  reason: collision with root package name */
    private com.ss.ugc.effectplatform.algorithm.a f153607g;

    /* renamed from: h  reason: collision with root package name */
    private com.ss.ugc.effectplatform.algorithm.d f153608h;

    static {
        Covode.recordClassIndex(102419);
    }

    /* renamed from: com.ss.ugc.effectplatform.j.a$a  reason: collision with other inner class name */
    public static final class C4089a {
        static {
            Covode.recordClassIndex(102420);
        }

        private C4089a() {
        }

        public static boolean b() {
            if (a.f153601e != null) {
                return true;
            }
            return false;
        }

        public static a a() {
            if (a.f153601e != null) {
                a aVar = a.f153601e;
                if (aVar == null) {
                    l.a();
                }
                return aVar;
            }
            throw new RuntimeException("Please initialize AlgorithmRepository first!");
        }

        public /* synthetic */ C4089a(byte b2) {
            this();
        }

        public static void a(com.ss.ugc.effectplatform.a aVar) {
            l.c(aVar, "");
            a.f153601e = new a(aVar, (byte) 0);
        }
    }

    public static final class d implements d.a.f.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.effectplatform.task.a.c f153616a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f153617b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String[] f153618c;

        static {
            Covode.recordClassIndex(102423);
        }

        @Override // d.a.f.d
        public final void cancel() {
        }

        @Override // d.a.f.d
        public final String getId() {
            return "";
        }

        public static final class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.f.a.a f153619a;

            static {
                Covode.recordClassIndex(102426);
            }

            public final void run() {
                this.f153619a.invoke();
            }

            c(h.f.a.a aVar) {
                this.f153619a = aVar;
            }
        }

        static final class b extends m implements h.f.a.a<z> {
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(102425);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(d dVar) {
                super(0);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                e eVar = this.this$0.f153617b;
                if (eVar != null) {
                    eVar.onSuccess(this.this$0.f153618c);
                }
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.ugc.effectplatform.j.a$d$a  reason: collision with other inner class name */
        static final class C4090a extends m implements h.f.a.a<z> {
            final /* synthetic */ Exception $e;
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(102424);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4090a(d dVar, Exception exc) {
                super(0);
                this.this$0 = dVar;
                this.$e = exc;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                e eVar = this.this$0.f153617b;
                if (eVar != null) {
                    eVar.onFail(this.this$0.f153618c, new com.ss.ugc.effectplatform.model.e(this.$e));
                }
                return z.f158842a;
            }
        }

        @Override // d.a.f.d
        public final void run() {
            try {
                this.f153616a.run();
                a(new b(this));
            } catch (Exception e2) {
                a(new C4090a(this, e2));
            }
        }

        private static void a(h.f.a.a<z> aVar) {
            d.a.g.f.a(new c(aVar));
        }

        public d(com.ss.ugc.effectplatform.task.a.c cVar, e eVar, String[] strArr) {
            this.f153616a = cVar;
            this.f153617b = eVar;
            this.f153618c = strArr;
        }
    }

    public final com.ss.ugc.effectplatform.algorithm.a a() {
        com.ss.ugc.effectplatform.algorithm.a aVar = this.f153607g;
        if (aVar != null) {
            return aVar;
        }
        com.ss.ugc.effectplatform.algorithm.a aVar2 = new com.ss.ugc.effectplatform.algorithm.a(this.f153606d, this.f153603a, this.f153605c, this.f153604b);
        this.f153607g = aVar2;
        return aVar2;
    }

    public final com.ss.ugc.effectplatform.algorithm.d b() {
        com.ss.ugc.effectplatform.algorithm.d dVar = this.f153608h;
        if (dVar != null) {
            return dVar;
        }
        com.ss.ugc.effectplatform.algorithm.d dVar2 = new com.ss.ugc.effectplatform.algorithm.d(this.f153604b, this.f153605c, this.f153606d.G);
        this.f153608h = dVar2;
        return dVar2;
    }

    public static final class b extends com.ss.ugc.effectplatform.task.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f153609a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String[] f153610b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f153611c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f153612d;

        static {
            Covode.recordClassIndex(102421);
        }

        @Override // com.ss.ugc.effectplatform.task.b
        public final void b() {
        }

        @Override // com.ss.ugc.effectplatform.task.b
        public final void a() {
            try {
                this.f153609a.a().a(i.j(this.f153610b), this.f153611c);
                e eVar = this.f153612d;
                if (eVar != null) {
                    eVar.onSuccess(Long.valueOf(this.f153609a.b().getEffectHandle()));
                }
            } catch (Exception e2) {
                e eVar2 = this.f153612d;
                if (eVar2 != null) {
                    eVar2.onFail(null, new com.ss.ugc.effectplatform.model.e(e2));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, String[] strArr, Map map, e eVar, String str) {
            super(str);
            this.f153609a = aVar;
            this.f153610b = strArr;
            this.f153611c = map;
            this.f153612d = eVar;
        }
    }

    public static final class c extends com.ss.ugc.effectplatform.task.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f153613a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f153614b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f153615c;

        static {
            Covode.recordClassIndex(102422);
        }

        @Override // com.ss.ugc.effectplatform.task.b
        public final void b() {
        }

        @Override // com.ss.ugc.effectplatform.task.b
        public final void a() {
            try {
                this.f153613a.a().a(this.f153614b, null);
                e eVar = this.f153615c;
                if (eVar != null) {
                    Object[] array = this.f153614b.toArray(new String[0]);
                    if (array != null) {
                        eVar.onSuccess(array);
                        return;
                    }
                    throw new w("null cannot be cast to non-null type");
                }
            } catch (Exception e2) {
                e eVar2 = this.f153615c;
                if (eVar2 != null) {
                    eVar2.onFail(null, new com.ss.ugc.effectplatform.model.e(e2));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, List list, e eVar, String str) {
            super(str);
            this.f153613a = aVar;
            this.f153614b = list;
            this.f153615c = eVar;
        }
    }

    private final boolean a(String str) {
        boolean isResourceAvailable = b().isResourceAvailable(str);
        try {
            Collection<ModelInfo> a2 = a().a(new String[]{str});
            if (a2 == null) {
                return isResourceAvailable;
            }
            if (a2.isEmpty()) {
                return isResourceAvailable;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    private a(com.ss.ugc.effectplatform.a aVar) {
        int i2;
        this.f153606d = aVar;
        this.f153605c = new f(aVar.C, aVar.E);
        this.f153603a = aa.a.a(aVar);
        com.ss.ugc.effectplatform.b.f a2 = com.ss.ugc.effectplatform.b.d.a(aVar.H);
        if (a2 == null || !(a2 instanceof com.ss.ugc.effectplatform.b.a)) {
            String str = aVar.H;
            String str2 = aVar.f153403c;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            com.ss.ugc.effectplatform.b.a aVar2 = new com.ss.ugc.effectplatform.b.a(str, i2, this.f153605c);
            this.f153604b = aVar2;
            com.ss.ugc.effectplatform.b.d.a(aVar.H, aVar2);
            return;
        }
        this.f153604b = (com.ss.ugc.effectplatform.b.a) a2;
    }

    public final boolean a(Effect effect) {
        l.c(effect, "");
        if (com.ss.ugc.effectplatform.util.a.a(effect)) {
            d.a.e.b.a("AlgorithmRepository", "decrypt error effect: " + effect.getEffect_id() + ", name: " + effect.getName() + ", requirements_sec: " + effect.getRequirements_sec(), null);
            return false;
        }
        String[] a2 = com.ss.ugc.effectplatform.util.a.a(effect, this.f153606d.q);
        if (a2 == null || a2.length == 0) {
            d.a.e.b.a("AlgorithmRepository", "effect: " + effect.getEffect_id() + ", name: " + effect.getName() + " returned empty resourceNameArrayOfEffect");
            return true;
        }
        this.f153604b.d();
        for (String str : a2) {
            if ((!com.ss.ugc.effectplatform.algorithm.c.f153454c.a() || !com.ss.ugc.effectplatform.algorithm.c.a(n.a(str))) && !a(str)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ a(com.ss.ugc.effectplatform.a aVar, byte b2) {
        this(aVar);
    }

    public final String a(int i2, String str) {
        l.c(str, "");
        return b().realFindResourceUri(i2, null, str);
    }

    public final void a(List<String> list, e<String[]> eVar) {
        l.c(list, "");
        al alVar = this.f153606d.z;
        if (alVar != null) {
            alVar.a(new c(this, list, eVar, t.a()));
        }
    }
}
