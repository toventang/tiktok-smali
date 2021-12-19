package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.e;
import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import com.ss.ugc.effectplatform.util.i;
import com.ss.ugc.effectplatform.util.j;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class p extends a<List<? extends Effect>, EffectListResponse> {

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153881c;

    /* renamed from: d  reason: collision with root package name */
    public final String f153882d;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f153883f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, String> f153884g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f153885h;

    static {
        Covode.recordClassIndex(102635);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final int e() {
        return 10014;
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ e $exceptionResult;
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(102636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar, e eVar) {
            super(0);
            this.this$0 = pVar;
            this.$exceptionResult = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153881c.K.a(this.this$0.f153882d);
            if (a2 != null) {
                a2.onFail(null, this.$exceptionResult);
            }
            this.this$0.f153881c.K.b(this.this$0.f153882d);
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ EffectListResponse $result;
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(102637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p pVar, EffectListResponse effectListResponse) {
            super(0);
            this.this$0 = pVar;
            this.$result = effectListResponse;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153881c.K.a(this.this$0.f153882d);
            if (a2 != null) {
                a2.onSuccess(this.$result);
            }
            this.this$0.f153881c.K.b(this.this$0.f153882d);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final com.ss.ugc.effectplatform.a.c.e c() {
        String str;
        com.ss.ugc.effectplatform.a.b.b bVar;
        String convertObjToJson;
        HashMap<String, String> a2 = i.a(this.f153881c, true);
        Map<String, String> map = this.f153884g;
        if (map != null) {
            a2.putAll(map);
        }
        List<String> list = this.f153883f;
        if (!(list == null || (bVar = this.f153881c.q) == null || (convertObjToJson = bVar.f153430a.convertObjToJson(list)) == null)) {
            if (this.f153885h) {
                a2.put("effect_ids", convertObjToJson);
            } else {
                a2.put("resource_ids", convertObjToJson);
            }
        }
        StringBuilder append = new StringBuilder().append(this.f153881c.A).append(this.f153881c.f153401a);
        if (this.f153885h) {
            str = "/v3/effect/list";
        } else {
            str = "/v3/effect/listByResourceId";
        }
        return new com.ss.ugc.effectplatform.a.c.e(com.ss.ugc.effectplatform.util.p.a(a2, append.append(str).toString()), c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ EffectListResponse a(com.ss.ugc.effectplatform.a.b.b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        return (EffectListResponse) bVar.f153430a.convertJsonToObj(str, EffectListResponse.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final void a(String str, String str2, e eVar) {
        l.c(eVar, "");
        a(new a(this, eVar));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ void a(long j2, long j3, long j4, EffectListResponse effectListResponse) {
        EffectListResponse effectListResponse2 = effectListResponse;
        l.c(effectListResponse2, "");
        j.a(this.f153881c.f153409i, effectListResponse2.getEffect_list());
        j.a(this.f153881c.f153409i, effectListResponse2.getCollection_list());
        a(new b(this, effectListResponse2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(com.ss.ugc.effectplatform.a aVar, List<String> list, String str, Map<String, String> map, boolean z) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str);
        l.c(aVar, "");
        l.c(str, "");
        this.f153881c = aVar;
        this.f153883f = list;
        this.f153882d = str;
        this.f153884g = map;
        this.f153885h = z;
    }
}
