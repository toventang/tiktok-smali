package com.ss.ugc.effectplatform;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.b.d;
import com.ss.ugc.effectplatform.b.e;
import com.ss.ugc.effectplatform.b.f;
import com.ss.ugc.effectplatform.j.a;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.UrlModel;
import com.ss.ugc.effectplatform.task.al;
import com.ss.ugc.effectplatform.util.q;
import com.ss.ugc.effectplatform.util.u;
import h.f.b.z;
import h.m.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f153472c = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    private static final String f153473i = f153473i;

    /* renamed from: a  reason: collision with root package name */
    public final h.h f153474a = h.i.a((h.f.a.a) new C4086b(this));

    /* renamed from: b  reason: collision with root package name */
    public final a f153475b;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f153476d = h.i.a((h.f.a.a) new f(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.h f153477e = h.i.a((h.f.a.a) new d(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.h f153478f = h.i.a((h.f.a.a) new m(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f153479g = h.i.a((h.f.a.a) new l(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h f153480h = h.i.a((h.f.a.a) e.f153537a);

    public final com.ss.ugc.effectplatform.j.e a() {
        return (com.ss.ugc.effectplatform.j.e) this.f153476d.getValue();
    }

    public final com.ss.ugc.effectplatform.j.c b() {
        return (com.ss.ugc.effectplatform.j.c) this.f153477e.getValue();
    }

    public final com.ss.ugc.effectplatform.j.g c() {
        return (com.ss.ugc.effectplatform.j.g) this.f153478f.getValue();
    }

    public final com.ss.ugc.effectplatform.j.d d() {
        return (com.ss.ugc.effectplatform.j.d) this.f153480h.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102335);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<com.ss.ugc.effectplatform.j.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f153537a = new e();

        static {
            Covode.recordClassIndex(102339);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.ugc.effectplatform.j.d invoke() {
            return new com.ss.ugc.effectplatform.j.d();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.ss.ugc.effectplatform.j.c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(102338);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.ugc.effectplatform.j.c invoke() {
            return new com.ss.ugc.effectplatform.j.c(this.this$0.f153475b);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<com.ss.ugc.effectplatform.j.e> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(102340);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.ugc.effectplatform.j.e invoke() {
            return new com.ss.ugc.effectplatform.j.e(this.this$0.f153475b);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<com.ss.ugc.effectplatform.j.f> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(102348);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.ugc.effectplatform.j.f invoke() {
            return new com.ss.ugc.effectplatform.j.f(this.this$0.f153475b);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<com.ss.ugc.effectplatform.j.g> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(102349);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.ugc.effectplatform.j.g invoke() {
            return new com.ss.ugc.effectplatform.j.g(this.this$0.f153475b);
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.b$b  reason: collision with other inner class name */
    static final class C4086b extends h.f.b.m implements h.f.a.a<com.ss.ugc.effectplatform.j.a> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(102336);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4086b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.ugc.effectplatform.j.a invoke() {
            if (!a.C4089a.b()) {
                a.C4089a.a(this.this$0.f153475b);
            }
            return a.C4089a.a();
        }
    }

    public static final class c extends com.ss.ugc.effectplatform.task.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f153525a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f153526b;

        static {
            Covode.recordClassIndex(102337);
        }

        @Override // com.ss.ugc.effectplatform.task.b
        public final void b() {
        }

        @Override // com.ss.ugc.effectplatform.task.b
        public final void a() {
            f fVar = (f) d.a.b.b.a(this.f153525a.f153475b.w);
            if (fVar != null) {
                fVar.e();
            }
            com.ss.ugc.effectplatform.algorithm.c.a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, String str, String str2) {
            super(str2);
            this.f153525a = bVar;
            this.f153526b = str;
        }
    }

    static {
        Covode.recordClassIndex(102333);
    }

    public static final class j implements com.ss.ugc.effectplatform.h.e<EffectChannelResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f153553a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f153554b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.effectplatform.h.e f153555c;

        static {
            Covode.recordClassIndex(102345);
        }

        public static final class a implements com.ss.ugc.effectplatform.h.f<List<? extends Effect>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f153556a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ EffectChannelResponse f153557b;

            /* renamed from: c  reason: collision with root package name */
            private final d.a.b.a<String> f153558c = new d.a.b.a<>(null);

            static {
                Covode.recordClassIndex(102346);
            }

            @Override // com.ss.ugc.effectplatform.h.f
            public final void b() {
                f fVar;
                V v = this.f153558c.f156544a;
                if (v != null && (fVar = (f) d.a.b.b.a(this.f153556a.f153553a.f153475b.w)) != null) {
                    fVar.a(com.ss.ugc.effectplatform.util.g.a(this.f153556a.f153553a.f153475b.f153406f, this.f153557b.getPanel()), (String) v);
                }
            }

            @Override // com.ss.ugc.effectplatform.h.f
            public final void a() {
                String str;
                String a2 = com.ss.ugc.effectplatform.util.g.a(this.f153556a.f153553a.f153475b.f153406f, this.f153557b.getPanel());
                f fVar = (f) d.a.b.b.a(this.f153556a.f153553a.f153475b.w);
                if (fVar != null) {
                    str = fVar.b(a2);
                } else {
                    str = null;
                }
                d.a.b.b.a(this.f153558c, str);
                f fVar2 = (f) d.a.b.b.a(this.f153556a.f153553a.f153475b.w);
                if (fVar2 != null) {
                    fVar2.d(a2);
                }
            }

            @Override // com.ss.ugc.effectplatform.h.e
            public final /* synthetic */ void onSuccess(Object obj) {
                List<? extends Effect> list = (List) obj;
                h.f.b.l.c(list, "");
                EffectChannelResponse effectChannelResponse = this.f153557b;
                effectChannelResponse.setAll_category_effects(list);
                for (EffectCategoryResponse effectCategoryResponse : effectChannelResponse.getCategory_responses()) {
                    ArrayList arrayList = new ArrayList();
                    List<Effect> total_effects = effectCategoryResponse.getTotal_effects();
                    if (total_effects != null) {
                        for (Effect effect : total_effects) {
                            if (list.contains(effect)) {
                                arrayList.add(effect);
                            }
                        }
                    }
                    effectCategoryResponse.setTotal_effects(arrayList);
                }
                com.ss.ugc.effectplatform.h.e eVar = this.f153556a.f153555c;
                if (eVar != null) {
                    eVar.onSuccess(effectChannelResponse);
                }
            }

            a(j jVar, EffectChannelResponse effectChannelResponse) {
                this.f153556a = jVar;
                this.f153557b = effectChannelResponse;
            }

            @Override // com.ss.ugc.effectplatform.h.e
            public final /* synthetic */ void onFail(Object obj, com.ss.ugc.effectplatform.model.e eVar) {
                h.f.b.l.c(eVar, "");
                com.ss.ugc.effectplatform.h.e eVar2 = this.f153556a.f153555c;
                if (eVar2 != null) {
                    eVar2.onFail(null, eVar);
                }
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            V v = (V) effectChannelResponse;
            h.f.b.l.c(v, "");
            this.f153553a.d().f153624a.f156544a = v;
            if (this.f153554b) {
                List<Effect> all_category_effects = v.getAll_category_effects();
                ArrayList arrayList = new ArrayList();
                for (Effect effect : all_category_effects) {
                    if (!com.ss.ugc.effectplatform.j.b.a(com.ss.ugc.effectplatform.model.d.a(effect))) {
                        arrayList.add(effect);
                    }
                }
                this.f153553a.a(arrayList, new a(this, v), null);
                return;
            }
            com.ss.ugc.effectplatform.h.e eVar = this.f153555c;
            if (eVar != null) {
                eVar.onSuccess(v);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onFail(EffectChannelResponse effectChannelResponse, com.ss.ugc.effectplatform.model.e eVar) {
            h.f.b.l.c(eVar, "");
            com.ss.ugc.effectplatform.h.e eVar2 = this.f153555c;
            if (eVar2 != null) {
                eVar2.onFail(effectChannelResponse, eVar);
            }
        }

        public j(b bVar, boolean z, com.ss.ugc.effectplatform.h.e eVar) {
            this.f153553a = bVar;
            this.f153554b = z;
            this.f153555c = eVar;
        }
    }

    public static final class h implements com.ss.ugc.effectplatform.h.e<Effect> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f153548a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.effectplatform.h.e f153549b;

        static {
            Covode.recordClassIndex(102342);
        }

        public static final class a implements com.ss.ugc.effectplatform.h.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f153550a;

            static {
                Covode.recordClassIndex(102343);
            }

            @Override // com.ss.ugc.effectplatform.h.g
            public final void onProgress(Effect effect, int i2, long j2) {
            }

            @Override // com.ss.ugc.effectplatform.h.g
            public final void onStart(Effect effect) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(h hVar) {
                this.f153550a = hVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.ugc.effectplatform.h.e
            public final /* bridge */ /* synthetic */ void onSuccess(Effect effect) {
                com.ss.ugc.effectplatform.h.e eVar;
                if (effect != null && (eVar = this.f153550a.f153549b) != null) {
                    eVar.onSuccess(effect);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
            @Override // com.ss.ugc.effectplatform.h.e
            public final /* synthetic */ void onFail(Effect effect, com.ss.ugc.effectplatform.model.e eVar) {
                h.f.b.l.c(eVar, "");
                com.ss.ugc.effectplatform.h.e eVar2 = this.f153550a.f153549b;
                if (eVar2 != null) {
                    eVar2.onFail(effect, eVar);
                }
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            h.f.b.l.c(effect2, "");
            this.f153548a.a(effect2, new a(this));
        }

        public h(b bVar, com.ss.ugc.effectplatform.h.e eVar) {
            this.f153548a = bVar;
            this.f153549b = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onFail(Effect effect, com.ss.ugc.effectplatform.model.e eVar) {
            h.f.b.l.c(eVar, "");
            com.ss.ugc.effectplatform.h.e eVar2 = this.f153549b;
            if (eVar2 != null) {
                eVar2.onFail(effect, eVar);
            }
        }
    }

    public static final class g implements com.ss.ugc.effectplatform.h.e<List<? extends Effect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.effectplatform.h.g f153547a;

        static {
            Covode.recordClassIndex(102341);
        }

        public g(com.ss.ugc.effectplatform.h.g gVar) {
            this.f153547a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onSuccess(List<? extends Effect> list) {
            List<? extends Effect> list2 = list;
            h.f.b.l.c(list2, "");
            if (!list2.isEmpty()) {
                com.ss.ugc.effectplatform.h.g gVar = this.f153547a;
                if (gVar != null) {
                    gVar.onSuccess(list2.get(0));
                    return;
                }
                return;
            }
            com.ss.ugc.effectplatform.h.g gVar2 = this.f153547a;
            if (gVar2 != null) {
                gVar2.onFail(null, new com.ss.ugc.effectplatform.model.e(1));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onFail(List<? extends Effect> list, com.ss.ugc.effectplatform.model.e eVar) {
            h.f.b.l.c(eVar, "");
            com.ss.ugc.effectplatform.h.g gVar = this.f153547a;
            if (gVar != null) {
                gVar.onFail(null, eVar);
            }
        }
    }

    public static final class i implements com.ss.ugc.effectplatform.h.e<List<? extends Effect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f153551a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.effectplatform.h.e f153552b;

        static {
            Covode.recordClassIndex(102344);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onSuccess(List<? extends Effect> list) {
            List<? extends Effect> list2 = list;
            h.f.b.l.c(list2, "");
            this.f153551a.a(list2, this.f153552b, null);
        }

        i(b bVar, com.ss.ugc.effectplatform.h.e eVar) {
            this.f153551a = bVar;
            this.f153552b = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onFail(List<? extends Effect> list, com.ss.ugc.effectplatform.model.e eVar) {
            h.f.b.l.c(eVar, "");
            com.ss.ugc.effectplatform.h.e eVar2 = this.f153552b;
            if (eVar2 != null) {
                eVar2.onFail(list, eVar);
            }
        }
    }

    public static final class k implements com.ss.ugc.effectplatform.h.e<EffectChannelResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f153559a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.effectplatform.h.e f153560b;

        static {
            Covode.recordClassIndex(102347);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.ugc.effectplatform.model.EffectChannelResponse */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            h.f.b.l.c(effectChannelResponse, "");
            this.f153559a.d().f153624a.f156544a = effectChannelResponse;
            com.ss.ugc.effectplatform.h.e eVar = this.f153560b;
            if (eVar != null) {
                eVar.onSuccess(effectChannelResponse);
            }
        }

        public k(b bVar, com.ss.ugc.effectplatform.h.e eVar) {
            this.f153559a = bVar;
            this.f153560b = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onFail(EffectChannelResponse effectChannelResponse, com.ss.ugc.effectplatform.model.e eVar) {
            h.f.b.l.c(eVar, "");
            com.ss.ugc.effectplatform.h.e eVar2 = this.f153560b;
            if (eVar2 != null) {
                eVar2.onFail(effectChannelResponse, eVar);
            }
        }
    }

    public final void a(String str) {
        h.f.b.l.c(str, "");
        f fVar = (f) d.a.b.b.a(this.f153475b.w);
        if (fVar != null) {
            fVar.d("effect_version".concat(String.valueOf(str)));
        }
    }

    public b(a aVar) {
        h.f.b.l.c(aVar, "");
        this.f153475b = aVar;
        if (aVar == null) {
            throw new IllegalArgumentException("EffectConfiguration Error! Not set configuration");
        } else if (aVar.A == null) {
            throw new IllegalArgumentException("EffectConfiguration Error! Not set host !!!");
        } else if (aVar.q == null) {
            throw new IllegalArgumentException("EffectConfiguration Error! Not set json convert");
        } else if (!u.a(aVar.f153409i)) {
            if (!d.a.d.a.d.f(aVar.f153409i)) {
                d.a.d.a.d.e(aVar.f153409i);
                if (!d.a.d.a.d.f(aVar.f153409i)) {
                    d.a.e.b.a(f153473i, "Cache directory error" + aVar.f153409i, null);
                }
            }
            if (!d.a.d.a.d.f(aVar.H)) {
                d.a.d.a.d.e(aVar.H);
            }
            if (aVar.z == null) {
                d.a.b.b.b bVar = aVar.u;
                aVar.z = new al.a().a(bVar == null ? new d.a.b.b.a() : bVar).a();
            }
            String str = aVar.f153409i;
            if (!d.a.d.a.d.f(aVar.f153409i)) {
                d.a.d.a.d.e(aVar.f153409i);
                if (!d.a.d.a.d.f(aVar.f153409i)) {
                    d.a.e.b.a(f153473i, "Cache directory error" + aVar.f153409i, null);
                }
            }
            if (aVar.w.f156544a == null) {
                if (d.a(str) == null) {
                    d.a(str, new e(aVar));
                }
                d.a.b.b.a(aVar.w, d.a(str));
            } else {
                d.a(str, (f) d.a.b.b.a(aVar.w));
            }
            q qVar = q.ANDROID;
            if (qVar == qVar) {
                com.ss.ugc.effectplatform.util.h.f153964b.f156544a = aVar.s.f156544a;
                c.f153561a = new f() {
                    /* class com.ss.ugc.effectplatform.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(102334);
                    }

                    @Override // com.ss.ugc.effectplatform.f
                    public final String decrypt(String str) {
                        return com.ss.ugc.effectplatform.util.h.a(com.ss.ugc.effectplatform.util.h.f153965c, str);
                    }

                    @Override // com.ss.ugc.effectplatform.f
                    public final String decrypt(String str, String str2) {
                        h.f.b.l.c(str2, "");
                        return com.ss.ugc.effectplatform.util.h.f153965c.a(str, str2);
                    }
                };
            }
        } else {
            throw new IllegalArgumentException("EffectConfiguration Error! Cache directory error");
        }
    }

    public final boolean a(Effect effect) {
        boolean z;
        h.f.b.l.c(effect, "");
        if (p.a((CharSequence) effect.getUnzipPath())) {
            return false;
        }
        z.a aVar = new z.a();
        aVar.element = com.ss.ugc.effectplatform.j.b.a(effect);
        if (aVar.element) {
            UrlModel trans_file_url = effect.getTrans_file_url();
            if (trans_file_url == null || trans_file_url.getUri() == null) {
                com.ss.ugc.effectplatform.l.a.a(effect);
            } else {
                if (!aVar.element || !com.ss.ugc.effectplatform.j.b.a(this.f153475b.f153409i, effect)) {
                    z = false;
                } else {
                    z = true;
                }
                aVar.element = z;
                if (aVar.element) {
                    com.ss.ugc.effectplatform.l.a.b(effect);
                }
            }
            a().a(effect, true, (com.ss.ugc.effectplatform.h.g) null);
        }
        if (!aVar.element || !com.ss.ugc.effectplatform.util.j.a(effect)) {
            return false;
        }
        return true;
    }

    public final void a(Effect effect, com.ss.ugc.effectplatform.h.g gVar) {
        h.f.b.l.c(effect, "");
        a().a(effect, false, gVar);
    }

    public final void a(List<? extends Effect> list, com.ss.ugc.effectplatform.h.e<List<Effect>> eVar, com.ss.ugc.effectplatform.model.c cVar) {
        h.f.b.l.c(list, "");
        a().a(list, cVar, eVar);
    }

    public final void a(String str, List<String> list, boolean z, com.ss.ugc.effectplatform.h.e<List<String>> eVar) {
        h.f.b.l.c(list, "");
        c().a(str, list, z, eVar);
    }

    public final void a(List<String> list, boolean z, Map<String, String> map, com.ss.ugc.effectplatform.h.e<List<Effect>> eVar) {
        h.f.b.l.c(list, "");
        if (z) {
            a().a(list, map, new i(this, eVar));
            return;
        }
        a().a(list, map, eVar);
    }
}
