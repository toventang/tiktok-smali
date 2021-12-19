package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.h.g;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.util.t;
import d.a.b.c.f;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class e extends b {

    /* renamed from: h  reason: collision with root package name */
    public static final a f153816h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final d.a.a.a<String> f153817a = new d.a.a.a<>(true);

    /* renamed from: b  reason: collision with root package name */
    public final d.a.a.a<Effect> f153818b = new d.a.a.a<>(true);

    /* renamed from: c  reason: collision with root package name */
    public final d.a.a.a<p<Effect, com.ss.ugc.effectplatform.model.e>> f153819c = new d.a.a.a<>(true);

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153820d;

    /* renamed from: f  reason: collision with root package name */
    public final List<Effect> f153821f;

    /* renamed from: g  reason: collision with root package name */
    public final String f153822g;

    /* renamed from: i  reason: collision with root package name */
    private final d.a.a.a<Effect> f153823i = new d.a.a.a<>(true);

    /* renamed from: j  reason: collision with root package name */
    private final d.a.a.a<Effect> f153824j = new d.a.a.a<>(true);

    /* renamed from: k  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.model.c f153825k;

    static {
        Covode.recordClassIndex(102588);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public final void b() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102589);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public final void a() {
        if (this.f153824j.isEmpty()) {
            a(new ArrayList());
        } else {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.ugc.effectplatform.model.e $e;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(102591);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar, com.ss.ugc.effectplatform.model.e eVar2) {
            super(0);
            this.this$0 = eVar;
            this.$e = eVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153820d.K.a(this.this$0.f153822g);
            if (a2 != null) {
                a2.onFail(this.this$0.f153821f, this.$e);
            }
            this.this$0.f153820d.K.b(this.this$0.f153822g);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ List $downloadedEffectList;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(102592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar, List list) {
            super(0);
            this.this$0 = eVar;
            this.$downloadedEffectList = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153820d.K.a(this.this$0.f153822g);
            if (a2 != null) {
                a2.onSuccess(this.$downloadedEffectList);
            }
            this.this$0.f153820d.K.b(this.this$0.f153822g);
            return z.f158842a;
        }
    }

    public final void c() {
        com.ss.ugc.effectplatform.model.e eVar;
        p<Effect, com.ss.ugc.effectplatform.model.e> pVar;
        Effect remove;
        if (!this.f153824j.isEmpty()) {
            if (this.f153817a.size() < 5) {
                int size = 5 - this.f153817a.size();
                int i2 = 0;
                while (i2 <= size && (!this.f153824j.isEmpty())) {
                    f fVar = f.f153827a;
                    fVar.f156552a.lock();
                    try {
                        d.a.a.a<Effect> aVar = this.f153824j;
                        if (!(!(!aVar.isEmpty()) || aVar == null || (remove = aVar.remove(0)) == null)) {
                            this.f153817a.add(remove.getId());
                            String a2 = t.a();
                            this.f153820d.K.a(a2, new b(this));
                            g gVar = new g(remove, this.f153820d, a2, this.f153825k);
                            al alVar = this.f153820d.z;
                            if (alVar != null) {
                                alVar.a(gVar);
                            }
                            Integer.valueOf(i2);
                            i2++;
                        }
                    } finally {
                        fVar.f156552a.unlock();
                    }
                }
            }
        } else if (this.f153818b.size() + this.f153819c.size() != this.f153823i.size()) {
        } else {
            if (this.f153818b.size() == this.f153823i.size()) {
                a(this.f153821f);
                return;
            }
            d.a.a.a<p<Effect, com.ss.ugc.effectplatform.model.e>> aVar2 = this.f153819c;
            ArrayList arrayList = new ArrayList(n.a((Iterable) aVar2, 10));
            Iterator<T> it = aVar2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getFirst());
            }
            ArrayList arrayList2 = arrayList;
            d.a.a.a<p<Effect, com.ss.ugc.effectplatform.model.e>> aVar3 = this.f153819c;
            if (!(!aVar3.isEmpty()) || aVar3 == null || (pVar = aVar3.get(0)) == null || (eVar = pVar.getSecond()) == null) {
                eVar = new com.ss.ugc.effectplatform.model.e(10002);
            }
            l.c(arrayList2, "");
            l.c(eVar, "");
            if (!arrayList2.isEmpty()) {
                a(new c(this, eVar));
            }
        }
    }

    public static final class b implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f153826a;

        static {
            Covode.recordClassIndex(102590);
        }

        @Override // com.ss.ugc.effectplatform.h.g
        public final void onProgress(Effect effect, int i2, long j2) {
        }

        @Override // com.ss.ugc.effectplatform.h.g
        public final void onStart(Effect effect) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(e eVar) {
            this.f153826a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            if (effect2 != null) {
                this.f153826a.f153817a.remove(effect2.getId());
                this.f153826a.f153818b.add(effect2);
            }
            this.f153826a.c();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onFail(Effect effect, com.ss.ugc.effectplatform.model.e eVar) {
            Effect effect2 = effect;
            l.c(eVar, "");
            if (effect2 != null) {
                this.f153826a.f153817a.remove(effect2.getId());
                this.f153826a.f153819c.add(new p<>(effect2, eVar));
            }
            this.f153826a.c();
        }
    }

    private void a(List<? extends Effect> list) {
        l.c(list, "");
        a(new d(this, list));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(com.ss.ugc.effectplatform.a aVar, List<? extends Effect> list, String str, com.ss.ugc.effectplatform.model.c cVar) {
        super(str, aVar.K);
        l.c(aVar, "");
        l.c(list, "");
        l.c(str, "");
        this.f153820d = aVar;
        this.f153821f = list;
        this.f153822g = str;
        this.f153825k = cVar;
        HashSet hashSet = new HashSet();
        for (Effect effect : list) {
            String a2 = com.ss.ugc.effectplatform.model.d.a(effect);
            if (!hashSet.contains(a2)) {
                this.f153823i.add(effect);
                hashSet.add(a2);
            }
        }
        this.f153824j.addAll(this.f153823i);
    }
}
