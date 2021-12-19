package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.util.j;
import d.a.b.c.f;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class g extends b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f153828d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Effect f153829a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153830b;

    /* renamed from: c  reason: collision with root package name */
    public final String f153831c;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f153832f;

    /* renamed from: g  reason: collision with root package name */
    private final d.a.b.a<aj<com.ss.ugc.effectplatform.task.c.a>> f153833g;

    /* renamed from: h  reason: collision with root package name */
    private final d.a.b.c.a f153834h;

    /* renamed from: i  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.model.c f153835i;

    static {
        Covode.recordClassIndex(102594);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102595);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(102602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f153830b.K.b(this.this$0.f153831c);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public final void b() {
        a(new d(this));
    }

    @Override // com.ss.ugc.effectplatform.task.b, d.a.f.d
    public final void cancel() {
        V v = this.f153833g.f156544a;
        if (v != null) {
            v.f153774f = true;
        }
        super.cancel();
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(102596);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.model.e eVar = new com.ss.ugc.effectplatform.model.e(10017);
            com.ss.ugc.effectplatform.j.b.a(this.this$0.f153829a, eVar);
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153830b.K.a(this.this$0.f153831c);
            if (!(a2 instanceof com.ss.ugc.effectplatform.h.g)) {
                a2 = null;
            }
            com.ss.ugc.effectplatform.h.g gVar = (com.ss.ugc.effectplatform.h.g) a2;
            if (gVar != null) {
                gVar.onFail(this.this$0.f153829a, eVar);
            }
            this.this$0.f153830b.K.b(this.this$0.f153831c);
            return z.f158842a;
        }
    }

    public static final class c implements ak<com.ss.ugc.effectplatform.task.c.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f153836a;

        static {
            Covode.recordClassIndex(102597);
        }

        @Override // com.ss.ugc.effectplatform.task.ak
        public final void b(aj<com.ss.ugc.effectplatform.task.c.a> ajVar) {
            l.c(ajVar, "");
        }

        static final class a extends m implements h.f.a.a<z> {
            final /* synthetic */ com.ss.ugc.effectplatform.model.e $e;
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(102598);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar, com.ss.ugc.effectplatform.model.e eVar) {
                super(0);
                this.this$0 = cVar;
                this.$e = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                com.ss.ugc.effectplatform.j.b.a(this.this$0.f153836a.f153829a, this.$e);
                com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153836a.f153830b.K.a(this.this$0.f153836a.f153831c);
                if (!(a2 instanceof com.ss.ugc.effectplatform.h.g)) {
                    a2 = null;
                }
                com.ss.ugc.effectplatform.h.g gVar = (com.ss.ugc.effectplatform.h.g) a2;
                if (gVar != null) {
                    gVar.onFail(this.this$0.f153836a.f153829a, this.$e);
                }
                this.this$0.f153836a.f153830b.K.b(this.this$0.f153836a.f153831c);
                return z.f158842a;
            }
        }

        static final class b extends m implements h.f.a.a<z> {
            final /* synthetic */ int $progress;
            final /* synthetic */ long $totalSize;
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(102599);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(c cVar, int i2, long j2) {
                super(0);
                this.this$0 = cVar;
                this.$progress = i2;
                this.$totalSize = j2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                String a2;
                d.a.a.c<com.ss.ugc.effectplatform.h.g> cVar;
                Effect effect = this.this$0.f153836a.f153829a;
                int i2 = this.$progress;
                long j2 = this.$totalSize;
                if (!(effect == null || (a2 = com.ss.ugc.effectplatform.model.d.a(effect)) == null || (cVar = com.ss.ugc.effectplatform.j.b.f153621b.get(a2)) == null)) {
                    Iterator<T> it = cVar.iterator();
                    while (it.hasNext()) {
                        it.next().onProgress(effect, i2, j2);
                    }
                }
                com.ss.ugc.effectplatform.h.e a3 = this.this$0.f153836a.f153830b.K.a(this.this$0.f153836a.f153831c);
                if (!(a3 instanceof com.ss.ugc.effectplatform.h.g)) {
                    a3 = null;
                }
                com.ss.ugc.effectplatform.h.g gVar = (com.ss.ugc.effectplatform.h.g) a3;
                if (gVar != null) {
                    gVar.onProgress(this.this$0.f153836a.f153829a, this.$progress, this.$totalSize);
                }
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.ugc.effectplatform.task.g$c$c  reason: collision with other inner class name */
        static final class C4096c extends m implements h.f.a.a<z> {
            final /* synthetic */ com.ss.ugc.effectplatform.task.c.a $response;
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(102600);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4096c(c cVar, com.ss.ugc.effectplatform.task.c.a aVar) {
                super(0);
                this.this$0 = cVar;
                this.$response = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                String a2;
                Effect effect = this.this$0.f153836a.f153829a;
                if (!(effect == null || (a2 = com.ss.ugc.effectplatform.model.d.a(effect)) == null)) {
                    d.a.a.c<com.ss.ugc.effectplatform.h.g> cVar = com.ss.ugc.effectplatform.j.b.f153621b.get(a2);
                    if (cVar != null) {
                        Iterator<T> it = cVar.iterator();
                        while (it.hasNext()) {
                            it.next().onSuccess(effect);
                        }
                    }
                    com.ss.ugc.effectplatform.j.b.f153621b.remove(a2);
                    com.ss.ugc.effectplatform.j.b.f153620a.remove(a2);
                }
                com.ss.ugc.effectplatform.h.e a3 = this.this$0.f153836a.f153830b.K.a(this.this$0.f153836a.f153831c);
                if (!(a3 instanceof com.ss.ugc.effectplatform.h.g)) {
                    a3 = null;
                }
                com.ss.ugc.effectplatform.h.g gVar = (com.ss.ugc.effectplatform.h.g) a3;
                if (gVar != null) {
                    gVar.onSuccess(this.$response.f153811c);
                }
                this.this$0.f153836a.f153830b.K.b(this.this$0.f153836a.f153831c);
                return z.f158842a;
            }
        }

        static final class d extends m implements h.f.a.a<z> {
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(102601);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                String a2;
                d.a.a.c<com.ss.ugc.effectplatform.h.g> cVar;
                Effect effect = this.this$0.f153836a.f153829a;
                if (!(effect == null || (a2 = com.ss.ugc.effectplatform.model.d.a(effect)) == null || (cVar = com.ss.ugc.effectplatform.j.b.f153621b.get(a2)) == null)) {
                    Iterator<T> it = cVar.iterator();
                    while (it.hasNext()) {
                        it.next().onStart(effect);
                    }
                }
                com.ss.ugc.effectplatform.h.e a3 = this.this$0.f153836a.f153830b.K.a(this.this$0.f153836a.f153831c);
                if (!(a3 instanceof com.ss.ugc.effectplatform.h.g)) {
                    a3 = null;
                }
                com.ss.ugc.effectplatform.h.g gVar = (com.ss.ugc.effectplatform.h.g) a3;
                if (gVar != null) {
                    gVar.onStart(this.this$0.f153836a.f153829a);
                }
                return z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(g gVar) {
            this.f153836a = gVar;
        }

        @Override // com.ss.ugc.effectplatform.task.ak
        public final void a(aj<com.ss.ugc.effectplatform.task.c.a> ajVar) {
            l.c(ajVar, "");
            g.a(new d(this));
        }

        @Override // com.ss.ugc.effectplatform.task.ak
        public final void a(aj<com.ss.ugc.effectplatform.task.c.a> ajVar, com.ss.ugc.effectplatform.model.e eVar) {
            l.c(ajVar, "");
            l.c(eVar, "");
            this.f153836a.a(false, eVar);
            d.a.e.b.a("DownloadEffectTask", "fetchEffect: " + this.f153836a.f153829a.getName() + " onFailed");
            g.a(new a(this, eVar));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.effectplatform.task.aj, java.lang.Object] */
        @Override // com.ss.ugc.effectplatform.task.ak
        public final /* synthetic */ void a(aj<com.ss.ugc.effectplatform.task.c.a> ajVar, com.ss.ugc.effectplatform.task.c.a aVar) {
            com.ss.ugc.effectplatform.task.c.a aVar2 = aVar;
            l.c(ajVar, "");
            l.c(aVar2, "");
            this.f153836a.a(true, null);
            d.a.e.b.a("DownloadEffectTask", "fetchEffect: " + this.f153836a.f153829a.getName() + " onSuccess");
            g.a(new C4096c(this, aVar2));
        }

        @Override // com.ss.ugc.effectplatform.task.ak
        public final void a(aj<com.ss.ugc.effectplatform.task.c.a> ajVar, int i2, long j2) {
            l.c(ajVar, "");
            g.a(new b(this, i2, j2));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public final void a() {
        if (this.f153834h.a()) {
            com.ss.ugc.effectplatform.a.b bVar = new com.ss.ugc.effectplatform.a.b(this.f153829a, this.f153832f, this.f153830b.f153409i);
            if (d.a.b.b.a(this.f153830b.v) == null) {
                a(new b(this));
                return;
            }
            d.a.b.a<aj<com.ss.ugc.effectplatform.task.c.a>> aVar = this.f153833g;
            V v = this.f153830b.v.f156544a;
            aVar.f156544a = v != null ? (V) v.a(bVar) : null;
            com.ss.ugc.effectplatform.task.c.a aVar2 = new com.ss.ugc.effectplatform.task.c.a(this.f153829a);
            aVar2.f153809a = 0;
            aVar2.f153810b = 0L;
            V v2 = this.f153833g.f156544a;
            if (v2 != null) {
                v2.a(new c(this));
            }
            V v3 = this.f153833g.f156544a;
            if (v3 != null) {
                v3.a();
            }
        }
    }

    @Override // com.ss.ugc.effectplatform.task.b
    public final void f() {
        String a2;
        f fVar = h.f153839a;
        fVar.f156552a.lock();
        try {
            if (com.ss.ugc.effectplatform.j.b.a(com.ss.ugc.effectplatform.model.d.a(this.f153829a))) {
                d.a.e.b.a("DownloadEffectTask", "effect: " + this.f153829a.getEffect_id() + ", name: " + this.f153829a.getName() + ", " + com.ss.ugc.effectplatform.model.d.a(this.f153829a) + " is now downloading, add in listener");
                com.ss.ugc.effectplatform.h.e a3 = this.f153830b.K.a(this.f153831c);
                if (!(a3 instanceof com.ss.ugc.effectplatform.h.g)) {
                    a3 = null;
                }
                com.ss.ugc.effectplatform.h.g gVar = (com.ss.ugc.effectplatform.h.g) a3;
                if (gVar != null) {
                    gVar.onStart(this.f153829a);
                    com.ss.ugc.effectplatform.j.b.a(this.f153829a, new e(gVar, this));
                }
                this.f153834h.a(false);
            } else {
                this.f153834h.a(true);
                Effect effect = this.f153829a;
                if (!(effect == null || (a2 = com.ss.ugc.effectplatform.model.d.a(effect)) == null)) {
                    com.ss.ugc.effectplatform.j.b.f153620a.put(a2, effect);
                }
                d.a.e.b.a("DownloadEffectTask", "effect: " + this.f153829a.getEffect_id() + ", name: " + this.f153829a.getName() + ", " + com.ss.ugc.effectplatform.model.d.a(this.f153829a) + " added in download list!");
            }
        } finally {
            fVar.f156552a.unlock();
        }
    }

    public static final class e implements com.ss.ugc.effectplatform.h.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.effectplatform.h.g f153837a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f153838b;

        static {
            Covode.recordClassIndex(102603);
        }

        @Override // com.ss.ugc.effectplatform.h.g
        public final void onStart(Effect effect) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onSuccess(Effect effect) {
            this.f153837a.onSuccess(effect);
            this.f153838b.f153830b.K.b(this.f153838b.f153831c);
        }

        e(com.ss.ugc.effectplatform.h.g gVar, g gVar2) {
            this.f153837a = gVar;
            this.f153838b = gVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onFail(Effect effect, com.ss.ugc.effectplatform.model.e eVar) {
            l.c(eVar, "");
            this.f153837a.onFail(effect, eVar);
            this.f153838b.f153830b.K.b(this.f153838b.f153831c);
        }

        @Override // com.ss.ugc.effectplatform.h.g
        public final void onProgress(Effect effect, int i2, long j2) {
            this.f153837a.onProgress(effect, i2, j2);
        }
    }

    public final void a(boolean z, com.ss.ugc.effectplatform.model.e eVar) {
        com.ss.ugc.effectplatform.model.c cVar;
        String sb;
        String str;
        if (!(this.f153830b.s.f156544a == null || (cVar = this.f153835i) == null)) {
            if (l.a((Object) "beautify", (Object) cVar.getPanel()) || l.a((Object) "beautifynew", (Object) this.f153835i.getPanel())) {
                int i2 = !z ? 1 : 0;
                StringBuilder sb2 = new StringBuilder();
                List<String> list = this.f153832f;
                if (list != null) {
                    for (String str2 : list) {
                        sb2.append(str2);
                        sb2.append(",");
                    }
                }
                V v = this.f153830b.s.f156544a;
                if (v != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("effect_id", this.f153829a.getEffect_id());
                    hashMap.put("effect_name", this.f153829a.getName());
                    String str3 = this.f153830b.f153411k;
                    String str4 = "";
                    if (str3 == null) {
                        str3 = str4;
                    }
                    hashMap.put("app_id", str3);
                    String str5 = this.f153830b.f153402b;
                    if (str5 == null) {
                        str5 = str4;
                    }
                    hashMap.put("access_key", str5);
                    hashMap.put("download_urls", sb2.toString());
                    String panel = this.f153835i.getPanel();
                    if (panel == null) {
                        panel = str4;
                    }
                    hashMap.put("panel", panel);
                    if (eVar == null) {
                        sb = str4;
                    } else {
                        sb = new StringBuilder().append(eVar.f153651a).toString();
                    }
                    hashMap.put("error_code", sb);
                    if (!(eVar == null || (str = eVar.f153652b) == null)) {
                        str4 = str;
                    }
                    hashMap.put("error_msg", str4);
                    hashMap.put("effect_platform_type", 1);
                    v.monitorStatusRate("effect_resource_download_success_rate", i2, hashMap);
                }
            }
        }
    }

    public /* synthetic */ g(Effect effect, com.ss.ugc.effectplatform.a aVar, String str) {
        this(effect, aVar, str, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Effect effect, com.ss.ugc.effectplatform.a aVar, String str, com.ss.ugc.effectplatform.model.c cVar) {
        super(str);
        l.c(effect, "");
        l.c(aVar, "");
        l.c(str, "");
        this.f153829a = effect;
        this.f153830b = aVar;
        this.f153831c = str;
        this.f153835i = cVar;
        this.f153832f = j.b(effect.getFile_url());
        this.f153833g = new d.a.b.a<>(null);
        this.f153834h = new d.a.b.c.a(true);
    }
}
