package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ugc.effectplatform.algorithm.h;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import com.ss.ugc.effectplatform.model.f;
import com.ss.ugc.effectplatform.model.g;
import com.ss.ugc.effectplatform.model.i;
import com.ss.ugc.effectplatform.task.s;
import com.ss.ugc.effectplatform.util.t;
import h.f.b.l;
import h.q;
import h.r;
import h.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class aa {

    /* renamed from: d  reason: collision with root package name */
    public static final d.a.a.b<String, f> f153718d = new d.a.a.b<>(true);

    /* renamed from: e  reason: collision with root package name */
    public static final d.a.a.b<String, ModelInfo> f153719e = new d.a.a.b<>(true);

    /* renamed from: f  reason: collision with root package name */
    public static d.a.b.a<aa> f153720f = new d.a.b.a<>(null);

    /* renamed from: g  reason: collision with root package name */
    public static final a f153721g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final d.a.a.b<String, Exception> f153722a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a.a.b<String, s> f153723b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153724c;

    /* renamed from: h  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.algorithm.f f153725h;

    /* renamed from: i  reason: collision with root package name */
    private final d.a.a.b<String, Integer> f153726i;

    /* renamed from: j  reason: collision with root package name */
    private final d.a.a.b<String, com.ss.ugc.effectplatform.task.a.b> f153727j;

    public static final class a {
        static {
            Covode.recordClassIndex(102544);
        }

        private a() {
        }

        public static aa a() {
            if (aa.f153720f.f156544a != null) {
                V v = aa.f153720f.f156544a;
                if (v == null) {
                    l.a();
                }
                return v;
            }
            throw new RuntimeException("Please initialize AlgorithmRepository first!");
        }

        private static boolean b() {
            if (aa.f153720f.f156544a != null) {
                return true;
            }
            return false;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static void b(com.ss.ugc.effectplatform.a aVar) {
            l.c(aVar, "");
            aa.f153720f.f156544a = (V) new aa(aVar, (byte) 0);
        }

        public static aa a(com.ss.ugc.effectplatform.a aVar) {
            l.c(aVar, "");
            if (!b()) {
                b(aVar);
            }
            return a();
        }
    }

    public static final class e extends b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aa f153735a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f153736b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f153737c;

        static {
            Covode.recordClassIndex(102548);
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.ugc.effectplatform.task.b
        public final void b() {
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.ugc.effectplatform.task.b
        public final void a() {
            this.f153735a.a(this.f153736b, this.f153737c);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(aa aaVar, int i2, String str, String str2) {
            super(str2);
            this.f153735a = aaVar;
            this.f153736b = i2;
            this.f153737c = str;
        }
    }

    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aa f153733a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f153734b;

        static {
            Covode.recordClassIndex(102547);
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.ugc.effectplatform.task.b
        public final void b() {
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.ugc.effectplatform.task.b
        public final void a() {
            try {
                q.m223constructorimpl(this.f153733a.a(this.f153734b, false));
            } catch (Throwable th) {
                q.m223constructorimpl(r.a(th));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(aa aaVar, int i2, String str) {
            super(str);
            this.f153733a = aaVar;
            this.f153734b = i2;
        }
    }

    static {
        Covode.recordClassIndex(102543);
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f153731a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ aa f153732b;

        static {
            Covode.recordClassIndex(102546);
        }

        /* JADX INFO: finally extract failed */
        public final void run() {
            f fVar = this.f153731a;
            com.ss.ugc.effectplatform.b.f a2 = com.ss.ugc.effectplatform.b.d.a(this.f153732b.f153724c.H);
            if (a2 != null) {
                com.ss.ugc.effectplatform.b.a aVar = (com.ss.ugc.effectplatform.b.a) a2;
                l.c(fVar, "");
                l.c(aVar, "");
                if (com.ss.ugc.effectplatform.util.q.ANDROID != com.ss.ugc.effectplatform.util.q.PC) {
                    if (fVar.f153658b.isEmpty()) {
                        for (T t : fVar.f153657a.a()) {
                            fVar.f153658b.put(t.f153659a.getName(), t.f153659a);
                        }
                    }
                    d.a.a.b<String, ModelInfo> bVar = fVar.f153658b;
                    if (bVar == null || bVar.isEmpty()) {
                        com.ss.ugc.effectplatform.algorithm.c.f153454c.a(false);
                        return;
                    }
                    Map<String, g> b2 = aVar.b();
                    if (b2.isEmpty()) {
                        com.ss.ugc.effectplatform.algorithm.c.f153454c.a(false);
                        return;
                    }
                    d.a.b.c.f fVar2 = com.ss.ugc.effectplatform.algorithm.c.f153452a;
                    fVar2.f156552a.lock();
                    try {
                        for (Map.Entry<String, ModelInfo> entry : bVar.entrySet()) {
                            String key = entry.getKey();
                            g gVar = b2.get(key);
                            if (gVar != null) {
                                com.ss.ugc.effectplatform.algorithm.c.f153453b.put(key, new h(gVar, entry.getValue()));
                            }
                        }
                        fVar2.f156552a.unlock();
                        com.ss.ugc.effectplatform.algorithm.c.f153454c.a(true);
                    } catch (Throwable th) {
                        fVar2.f156552a.unlock();
                        throw th;
                    }
                }
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }

        c(f fVar, aa aaVar) {
            this.f153731a = fVar;
            this.f153732b = aaVar;
        }
    }

    public static final class b implements s.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aa f153728a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f153729b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f153730c;

        static {
            Covode.recordClassIndex(102545);
        }

        @Override // com.ss.ugc.effectplatform.task.s.a
        public final void a(Exception exc) {
            l.c(exc, "");
            this.f153728a.f153722a.put(this.f153730c, exc);
            d.a.e.b.a("FetchModelListTask", "fetch model list error happens!", exc);
            this.f153728a.f153723b.remove(this.f153730c);
        }

        @Override // com.ss.ugc.effectplatform.task.s.a
        public final void a(i iVar) {
            ModelInfo next;
            String name;
            l.c(iVar, "");
            d.a.a.b<String, f> bVar = aa.f153718d;
            String str = this.f153730c;
            f fVar = iVar.f153667a;
            if (fVar == null) {
                HashMap hashMap = new HashMap();
                Iterator<ModelInfo> it = iVar.f153668b.a().iterator();
                while (it.hasNext() && (name = (next = it.next()).getName()) != null) {
                    if (!hashMap.containsKey(name)) {
                        hashMap.put(name, next.getVersion());
                    } else if (!l.a(hashMap.get(name), (Object) next.getVersion())) {
                        throw new RuntimeException("model " + name + " has different versions in ServerTable,Please modify the file to the correct format ");
                    }
                }
                fVar = new f();
                d.a.g.b<String, f.a> bVar2 = new d.a.g.b<>();
                for (K k2 : iVar.f153668b.f156643a.keySet()) {
                    Collection<ModelInfo> collection = (d.a.a.a) iVar.f153668b.f156643a.get(k2);
                    if (collection == null) {
                        collection = new ArrayList();
                    }
                    for (ModelInfo modelInfo : collection) {
                        bVar2.a(k2, new f.a(modelInfo));
                    }
                }
                fVar.a(bVar2);
                iVar.f153667a = fVar;
            }
            bVar.put(str, fVar);
            this.f153728a.f153723b.remove(this.f153730c);
        }

        b(aa aaVar, int i2, String str) {
            this.f153728a = aaVar;
            this.f153729b = i2;
            this.f153730c = str;
        }
    }

    private aa(com.ss.ugc.effectplatform.a aVar) {
        this.f153724c = aVar;
        this.f153725h = new com.ss.ugc.effectplatform.algorithm.f(aVar.C, aVar.E);
        this.f153722a = new d.a.a.b<>(true);
        this.f153723b = new d.a.a.b<>(true);
        this.f153726i = new d.a.a.b<>(true);
        this.f153727j = new d.a.a.b<>(true);
    }

    public final f a(int i2) {
        al alVar;
        f fVar = f153718d.get(ab.a(i2));
        if (fVar == null && (alVar = this.f153724c.z) != null) {
            alVar.a(new d(this, i2, t.a()));
        }
        return fVar;
    }

    public /* synthetic */ aa(com.ss.ugc.effectplatform.a aVar, byte b2) {
        this(aVar);
    }

    public final synchronized ModelInfo a(int i2, String str) {
        MethodCollector.i(9205);
        ModelInfo modelInfo = null;
        if (str == null) {
            MethodCollector.o(9205);
            return null;
        }
        d.a.a.b<String, ModelInfo> bVar = f153719e;
        ModelInfo modelInfo2 = bVar.get(str);
        if (modelInfo2 == null) {
            String str2 = str + '_' + i2;
            d.a.a.b<String, com.ss.ugc.effectplatform.task.a.b> bVar2 = this.f153727j;
            com.ss.ugc.effectplatform.task.a.b bVar3 = bVar2.get(str2);
            if (bVar3 == null) {
                bVar3 = new com.ss.ugc.effectplatform.task.a.b(this.f153724c, str, i2);
                bVar2.put(str2, bVar3);
            }
            SingleAlgorithmModelResponse c2 = bVar3.c();
            if (!(c2 == null || (modelInfo = c2.getData()) == null)) {
                bVar.put(str, modelInfo);
            }
            this.f153727j.remove(str2);
            modelInfo2 = modelInfo;
        }
        MethodCollector.o(9205);
        return modelInfo2;
    }

    public final synchronized f a(int i2, boolean z) {
        f fVar;
        MethodCollector.i(8999);
        String a2 = ab.a(i2);
        d.a.a.b<String, f> bVar = f153718d;
        if (bVar.get(a2) == null) {
            d.a.a.b<String, Integer> bVar2 = this.f153726i;
            int i3 = bVar2.get(a2);
            if (i3 == null) {
                i3 = 0;
                bVar2.put(a2, 0);
            }
            int intValue = i3.intValue();
            if (z || intValue < this.f153724c.o) {
                d.a.a.b<String, s> bVar3 = this.f153723b;
                s sVar = bVar3.get(a2);
                if (sVar == null) {
                    sVar = new s(this.f153724c, this.f153725h, i2, new b(this, i2, a2));
                    bVar3.put(a2, sVar);
                }
                s sVar2 = sVar;
                this.f153726i.put(a2, Integer.valueOf(intValue + 1));
                d.a.b.c.f fVar2 = t.f153901a;
                fVar2.f156552a.lock();
                try {
                    if (!sVar2.f153896a.a()) {
                        sVar2.run();
                        sVar2.f153896a.a(true);
                    }
                    fVar2.f156552a.unlock();
                    f fVar3 = bVar.get(a2);
                    if (fVar3 != null) {
                        new d.a.b.b.a().execute(new c(fVar3, this));
                    }
                } catch (Throwable th) {
                    fVar2.f156552a.unlock();
                    MethodCollector.o(8999);
                    throw th;
                }
            }
            if (bVar.get(a2) == null) {
                Exception exc = this.f153722a.get(a2);
                if (exc != null) {
                    MethodCollector.o(8999);
                    throw exc;
                }
                RuntimeException runtimeException = new RuntimeException("error happens when requireDecidedConfig");
                MethodCollector.o(8999);
                throw runtimeException;
            }
        }
        fVar = bVar.get(a2);
        MethodCollector.o(8999);
        return fVar;
    }

    public final ModelInfo a(int i2, String str, boolean z) {
        al alVar;
        if (str == null) {
            return null;
        }
        ModelInfo modelInfo = f153719e.get(str);
        if (modelInfo == null && z && (alVar = this.f153724c.z) != null) {
            alVar.a(new e(this, i2, str, t.a()));
        }
        return modelInfo;
    }
}
