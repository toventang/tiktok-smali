package com.bytedance.sdk.bdlynx.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.bdlynx.c.a;
import com.bytedance.sdk.bdlynx.e.b.a.e;
import com.bytedance.sdk.bdlynx.e.b.a.f;
import com.lynx.tasm.LynxEnv;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c implements b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f43732d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final g f43733a = new g();

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.sdk.bdlynx.e.a.a f43734b = new com.bytedance.sdk.bdlynx.e.a.a();

    /* renamed from: c  reason: collision with root package name */
    d f43735c = new a();

    /* renamed from: e  reason: collision with root package name */
    private final LinkedList<e> f43736e = new LinkedList<>();

    static {
        Covode.recordClassIndex(26757);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(26758);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.bdlynx.e.c$c  reason: collision with other inner class name */
    public static final class RunnableC1060c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f43737a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f43738b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f43739c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f43740d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f43741e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.bytedance.sdk.bdlynx.c.b f43742f;

        static {
            Covode.recordClassIndex(26760);
        }

        RunnableC1060c(c cVar, String str, String str2, f fVar, e eVar, com.bytedance.sdk.bdlynx.c.b bVar) {
            this.f43737a = cVar;
            this.f43738b = str;
            this.f43739c = str2;
            this.f43740d = fVar;
            this.f43741e = eVar;
            this.f43742f = bVar;
        }

        public final void run() {
            boolean z;
            boolean z2;
            T t;
            c cVar = this.f43737a;
            String str = this.f43738b;
            String str2 = this.f43739c;
            f fVar = this.f43740d;
            AnonymousClass1 r11 = new e(this) {
                /* class com.bytedance.sdk.bdlynx.e.c.RunnableC1060c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                public boolean f43743a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ RunnableC1060c f43744b;

                static {
                    Covode.recordClassIndex(26761);
                }

                /* renamed from: com.bytedance.sdk.bdlynx.e.c$c$1$a */
                static final class a implements Runnable {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f43745a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ int f43746b;

                    static {
                        Covode.recordClassIndex(26762);
                    }

                    a(AnonymousClass1 r1, int i2) {
                        this.f43745a = r1;
                        this.f43746b = i2;
                    }

                    public final void run() {
                        this.f43745a.f43744b.f43741e.a(this.f43746b);
                    }
                }

                /* renamed from: com.bytedance.sdk.bdlynx.e.c$c$1$b */
                static final class b implements Runnable {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f43747a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ com.bytedance.sdk.bdlynx.e.b.a.a f43748b;

                    static {
                        Covode.recordClassIndex(26763);
                    }

                    b(AnonymousClass1 r1, com.bytedance.sdk.bdlynx.e.b.a.a aVar) {
                        this.f43747a = r1;
                        this.f43748b = aVar;
                    }

                    public final void run() {
                        this.f43747a.f43744b.f43741e.b_(this.f43748b);
                        com.bytedance.sdk.bdlynx.a.a.d.a("TemplateProvider", "getTemplate onLocalSuccess: groupId=" + this.f43747a.f43744b.f43738b + ", cardId=" + this.f43747a.f43744b.f43739c);
                    }
                }

                /* renamed from: com.bytedance.sdk.bdlynx.e.c$c$1$c  reason: collision with other inner class name */
                static final class RunnableC1061c implements Runnable {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f43749a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ com.bytedance.sdk.bdlynx.e.b.a.a f43750b;

                    static {
                        Covode.recordClassIndex(26764);
                    }

                    RunnableC1061c(AnonymousClass1 r1, com.bytedance.sdk.bdlynx.e.b.a.a aVar) {
                        this.f43749a = r1;
                        this.f43750b = aVar;
                    }

                    public final void run() {
                        com.bytedance.sdk.bdlynx.a.a.d.a("TemplateProvider", "getTemplate onMemSuccess: groupId=" + this.f43749a.f43744b.f43738b + ", cardId=" + this.f43749a.f43744b.f43739c);
                        this.f43749a.f43744b.f43741e.a_(this.f43750b);
                    }
                }

                /* renamed from: com.bytedance.sdk.bdlynx.e.c$c$1$d */
                static final class d implements Runnable {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f43751a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ com.bytedance.sdk.bdlynx.e.b.a.a f43752b;

                    static {
                        Covode.recordClassIndex(26765);
                    }

                    d(AnonymousClass1 r1, com.bytedance.sdk.bdlynx.e.b.a.a aVar) {
                        this.f43751a = r1;
                        this.f43752b = aVar;
                    }

                    public final void run() {
                        this.f43751a.f43744b.f43741e.c(this.f43752b);
                        com.bytedance.sdk.bdlynx.a.a.d.a("TemplateProvider", "getTemplate onRemoteSuccess: groupId=" + this.f43751a.f43744b.f43738b + ", cardId=" + this.f43751a.f43744b.f43739c);
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f43744b = r1;
                }

                @Override // com.bytedance.sdk.bdlynx.e.e
                public final void a_(com.bytedance.sdk.bdlynx.e.b.a.a aVar) {
                    l.c(aVar, "");
                    com.bytedance.sdk.bdlynx.a.a.f.a(new RunnableC1061c(this, aVar));
                    d(aVar);
                }

                @Override // com.bytedance.sdk.bdlynx.e.e
                public final void b_(com.bytedance.sdk.bdlynx.e.b.a.a aVar) {
                    l.c(aVar, "");
                    com.bytedance.sdk.bdlynx.a.a.f.a(new b(this, aVar));
                    d(aVar);
                }

                @Override // com.bytedance.sdk.bdlynx.e.e
                public final void c(com.bytedance.sdk.bdlynx.e.b.a.a aVar) {
                    l.c(aVar, "");
                    com.bytedance.sdk.bdlynx.a.a.f.a(new d(this, aVar));
                    d(aVar);
                }

                private final void d(com.bytedance.sdk.bdlynx.e.b.a.a aVar) {
                    if (!this.f43743a) {
                        this.f43744b.f43737a.f43733a.a("success");
                        this.f43744b.f43742f.a(this.f43744b.f43737a.f43733a);
                        aVar.f43704a = this.f43744b.f43742f;
                        this.f43743a = true;
                    }
                }

                @Override // com.bytedance.sdk.bdlynx.e.e
                public final void a(int i2) {
                    com.bytedance.sdk.bdlynx.a.a.f.a(new a(this, i2));
                    this.f43744b.f43737a.f43733a.a("fail");
                    this.f43744b.f43742f.a(this.f43744b.f43737a.f43733a);
                    com.bytedance.sdk.bdlynx.a.a.d.a("TemplateProvider", "getTemplate fail: groupId=" + this.f43744b.f43738b + ", cardId=" + this.f43744b.f43739c + ", errCode=" + i2);
                }
            };
            LynxEnv b2 = LynxEnv.b();
            l.a((Object) b2, "");
            if (!b2.f()) {
                r11.a(3);
                return;
            }
            z.e eVar = new z.e();
            if (fVar != null) {
                z = fVar.f43723c;
                z2 = fVar.f43724d;
            } else {
                z = true;
                z2 = true;
            }
            String a2 = cVar.f43735c.a(str, str2);
            List<String> list = null;
            if (z) {
                com.bytedance.sdk.bdlynx.e.a.a aVar = cVar.f43734b;
                l.c(a2, "");
                t = (T) aVar.f43702a.get(a2);
            } else {
                t = null;
            }
            eVar.element = t;
            if (eVar.element != null) {
                g gVar = cVar.f43733a;
                gVar.f43760b = true;
                T t2 = eVar.element;
                if (t2 == null) {
                    l.a();
                }
                gVar.f43762d = t2.f43708e.length;
                com.bytedance.sdk.bdlynx.a.a.d.a("TemplateProvider", "getTemplate: hit cache: key=".concat(String.valueOf(str)));
                r11.a_(eVar.element);
                return;
            }
            if (fVar != null) {
                list = fVar.f43722b;
            }
            List<e> a3 = cVar.a(true, list);
            z.a aVar2 = new z.a();
            aVar2.element = false;
            Iterator<e> it = a3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e next = it.next();
                eVar.element = (T) next.b();
                if (eVar.element != null) {
                    com.bytedance.sdk.bdlynx.a.a.d.a("TemplateProvider", "use preload template success, provider=" + next.a());
                    if (z2) {
                        cVar.f43734b.a(a2, eVar.element);
                    }
                    g gVar2 = cVar.f43733a;
                    gVar2.b(next.a());
                    gVar2.f43762d = eVar.element.f43708e.length;
                    aVar2.element = true;
                    r11.b_(eVar.element);
                    if (fVar != null && !fVar.f43725e) {
                        return;
                    }
                }
            }
            if (aVar2.element) {
                com.bytedance.sdk.bdlynx.a.a.d.a("TemplateProvider", "use preload template success, but still fetch");
            } else {
                com.bytedance.sdk.bdlynx.a.a.d.a("TemplateProvider", "use preload template fail, try runtime");
            }
            cVar.a(new LinkedList<>(a3), str, str2, fVar, new d(cVar, z2, a2, r11, aVar2));
        }
    }

    public static final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f43753a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f43754b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f43755c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f43756d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.a f43757e;

        static {
            Covode.recordClassIndex(26766);
        }

        @Override // com.bytedance.sdk.bdlynx.e.e
        public final void a(int i2) {
            if (!this.f43757e.element) {
                this.f43756d.a(i2);
            }
        }

        @Override // com.bytedance.sdk.bdlynx.e.e
        public final void a_(com.bytedance.sdk.bdlynx.e.b.a.a aVar) {
            l.c(aVar, "");
            throw new IllegalStateException();
        }

        @Override // com.bytedance.sdk.bdlynx.e.e
        public final void b_(com.bytedance.sdk.bdlynx.e.b.a.a aVar) {
            l.c(aVar, "");
            throw new IllegalStateException();
        }

        @Override // com.bytedance.sdk.bdlynx.e.e
        public final void c(com.bytedance.sdk.bdlynx.e.b.a.a aVar) {
            l.c(aVar, "");
            if (this.f43754b) {
                this.f43753a.f43734b.a(this.f43755c, aVar);
            }
            this.f43756d.c(aVar);
        }

        d(c cVar, boolean z, String str, e eVar, z.a aVar) {
            this.f43753a = cVar;
            this.f43754b = z;
            this.f43755c = str;
            this.f43756d = eVar;
            this.f43757e = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<com.bytedance.sdk.bdlynx.e.b.a.a, h.z> {
        final /* synthetic */ e $callback;
        final /* synthetic */ String $cardId;
        final /* synthetic */ LinkedList $currentList;
        final /* synthetic */ f $extras;
        final /* synthetic */ String $groupId;
        final /* synthetic */ e $provider;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(26759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, e eVar, e eVar2, LinkedList linkedList, String str, String str2, f fVar) {
            super(1);
            this.this$0 = cVar;
            this.$provider = eVar;
            this.$callback = eVar2;
            this.$currentList = linkedList;
            this.$groupId = str;
            this.$cardId = str2;
            this.$extras = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.sdk.bdlynx.e.b.a.a aVar) {
            com.bytedance.sdk.bdlynx.e.b.a.a aVar2 = aVar;
            if (aVar2 != null) {
                g gVar = this.this$0.f43733a;
                gVar.b(this.$provider.a());
                gVar.f43762d = aVar2.f43708e.length;
                com.bytedance.sdk.bdlynx.a.a.d.a("TemplateProvider", "load template success from provider: " + this.$provider.a());
                e eVar = this.$callback;
                if (eVar != null) {
                    eVar.c(aVar2);
                }
            } else {
                this.this$0.a(this.$currentList, this.$groupId, this.$cardId, this.$extras, this.$callback);
            }
            return h.z.f158842a;
        }
    }

    public final synchronized List<e> a(Boolean bool, List<String> list) {
        MethodCollector.i(2194);
        ArrayList arrayList = this.f43736e;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : arrayList) {
                if (list.contains(t.a())) {
                    arrayList2.add(t);
                }
            }
            arrayList = arrayList2;
        }
        if (l.a((Object) bool, (Object) false)) {
            List<e> h2 = n.h((Iterable) arrayList);
            MethodCollector.o(2194);
            return h2;
        }
        MethodCollector.o(2194);
        return arrayList;
    }

    @Override // com.bytedance.sdk.bdlynx.e.b
    public final void a(String str, String str2, f fVar, e eVar) {
        String str3;
        f fVar2 = fVar;
        l.c(str, "");
        l.c(str2, "");
        l.c(eVar, "");
        com.bytedance.sdk.bdlynx.a.c.a aVar = new com.bytedance.sdk.bdlynx.a.c.a(str, str2);
        if (fVar2 != null) {
            str3 = fVar2.f43727g;
        } else {
            str3 = null;
        }
        com.bytedance.sdk.bdlynx.c.b a2 = a.C1058a.a(aVar, str3);
        if (fVar2 == null) {
            fVar2 = new f();
        }
        fVar2.f43728h = a2;
        a2.a();
        com.bytedance.sdk.bdlynx.a.a.f.b(new RunnableC1060c(this, str, str2, fVar2, eVar, a2));
    }

    public final void a(LinkedList<e> linkedList, String str, String str2, f fVar, e eVar) {
        if (linkedList.isEmpty()) {
            com.bytedance.sdk.bdlynx.a.a.d.a("TemplateProvider", "load template from all provider failed");
            if (eVar != null) {
                eVar.a(5);
                return;
            }
            return;
        }
        LinkedList linkedList2 = new LinkedList(linkedList);
        new b(this, (e) linkedList2.removeFirst(), eVar, linkedList2, str, str2, fVar);
    }
}
