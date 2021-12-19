package com.ss.ugc.effectplatform.algorithm;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ugc.effectplatform.algorithm.g;
import com.ss.ugc.effectplatform.b.d;
import com.ss.ugc.effectplatform.b.f;
import com.ss.ugc.effectplatform.j.a;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.task.aa;
import com.ss.ugc.effectplatform.task.b;
import h.f.b.l;
import java.util.List;

public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static e f153456c;

    /* renamed from: d  reason: collision with root package name */
    public static g f153457d = g.a.f153468a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f153458e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.j.a f153459a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153460b;

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.b.a f153461f;

    /* renamed from: g  reason: collision with root package name */
    private f f153462g;

    /* renamed from: h  reason: collision with root package name */
    private AlgorithmModelResourceFinder f153463h;

    /* renamed from: i  reason: collision with root package name */
    private a f153464i;

    public static final synchronized void a(com.ss.ugc.effectplatform.a aVar) {
        synchronized (e.class) {
            MethodCollector.i(9570);
            f153458e.a(aVar);
            MethodCollector.o(9570);
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102326);
        }

        private a() {
        }

        public static boolean b() {
            if (e.f153456c != null) {
                return true;
            }
            return false;
        }

        public static e a() {
            e eVar = e.f153456c;
            if (eVar != null) {
                return eVar;
            }
            throw new IllegalStateException("AlgorithmManager has not initialized,call AlgorithmManager#initialize first!");
        }

        /* renamed from: com.ss.ugc.effectplatform.algorithm.e$a$a  reason: collision with other inner class name */
        public static final class C4083a extends b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f153465a = 0;

            static {
                Covode.recordClassIndex(102327);
            }

            @Override // com.ss.ugc.effectplatform.task.b
            public final void b() {
            }

            @Override // com.ss.ugc.effectplatform.task.b
            public final void a() {
                try {
                    aa.a.a(a.a().f153460b).a(this.f153465a, false);
                } catch (Exception unused) {
                }
            }

            public C4083a(String str) {
                super(str);
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final synchronized void a(com.ss.ugc.effectplatform.a aVar) {
            MethodCollector.i(9201);
            l.c(aVar, "");
            if (e.f153456c == null) {
                e.f153456c = new e(aVar, (byte) 0);
                MethodCollector.o(9201);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Duplicate initialization");
                MethodCollector.o(9201);
                throw illegalStateException;
            }
        }
    }

    static {
        Covode.recordClassIndex(102325);
    }

    public final a b() {
        a aVar = this.f153464i;
        if (aVar != null) {
            return aVar;
        }
        com.ss.ugc.effectplatform.a aVar2 = this.f153460b;
        a aVar3 = new a(aVar2, aa.a.a(aVar2), this.f153462g, this.f153461f);
        this.f153464i = aVar3;
        return aVar3;
    }

    public final AlgorithmModelResourceFinder a() {
        AlgorithmModelResourceFinder algorithmModelResourceFinder = this.f153463h;
        if (algorithmModelResourceFinder != null) {
            return algorithmModelResourceFinder;
        }
        AlgorithmModelResourceFinder algorithmModelResourceFinder2 = new AlgorithmModelResourceFinder(this.f153461f, this.f153462g, this.f153460b.G, this.f153460b);
        this.f153463h = algorithmModelResourceFinder2;
        return algorithmModelResourceFinder2;
    }

    private e(com.ss.ugc.effectplatform.a aVar) {
        int i2;
        this.f153460b = aVar;
        this.f153462g = new f(aVar.C, aVar.E);
        f a2 = d.a(aVar.H);
        if (a2 == null || !(a2 instanceof com.ss.ugc.effectplatform.b.a)) {
            String str = aVar.H;
            String str2 = aVar.f153403c;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            com.ss.ugc.effectplatform.b.a aVar2 = new com.ss.ugc.effectplatform.b.a(str, i2, this.f153462g);
            this.f153461f = aVar2;
            d.a(aVar.H, aVar2);
        } else {
            this.f153461f = (com.ss.ugc.effectplatform.b.a) a2;
        }
        if (!a.C4089a.b()) {
            a.C4089a.a(aVar);
        }
        this.f153459a = a.C4089a.a();
    }

    public final boolean a(Effect effect) {
        l.c(effect, "");
        return this.f153459a.a(effect);
    }

    public /* synthetic */ e(com.ss.ugc.effectplatform.a aVar, byte b2) {
        this(aVar);
    }

    public final void a(List<String> list, com.ss.ugc.effectplatform.h.e<String[]> eVar) {
        l.c(list, "");
        this.f153459a.a(list, eVar);
    }
}
