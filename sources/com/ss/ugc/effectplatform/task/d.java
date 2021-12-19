package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a;
import com.ss.ugc.effectplatform.a.b.b;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import com.ss.ugc.effectplatform.util.i;
import com.ss.ugc.effectplatform.util.j;
import com.ss.ugc.effectplatform.util.p;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d extends a<List<? extends Effect>, EffectListResponse> {

    /* renamed from: c  reason: collision with root package name */
    private final a f153813c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f153814d;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f153815f;

    static {
        Covode.recordClassIndex(102587);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final e c() {
        b bVar;
        String convertObjToJson;
        HashMap<String, String> a2 = i.a(this.f153813c, true);
        Map<String, String> map = this.f153815f;
        if (map != null) {
            a2.putAll(map);
        }
        List<String> list = this.f153814d;
        if (!(list == null || (bVar = this.f153813c.q) == null || (convertObjToJson = bVar.f153430a.convertObjToJson(list)) == null)) {
            a2.put("effect_ids", convertObjToJson);
        }
        return new e(p.a(a2, this.f153813c.A + this.f153813c.f153401a + "/v3/effect/list"), c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ EffectListResponse a(b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        return (EffectListResponse) bVar.f153430a.convertJsonToObj(str, EffectListResponse.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(a aVar, List<String> list, String str, Map<String, String> map) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str);
        l.c(aVar, "");
        l.c(str, "");
        this.f153813c = aVar;
        this.f153814d = list;
        this.f153815f = map;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ void a(long j2, long j3, long j4, EffectListResponse effectListResponse) {
        EffectListResponse effectListResponse2 = effectListResponse;
        l.c(effectListResponse2, "");
        j.a(this.f153813c.f153409i, effectListResponse2.getEffect_list());
        super.a(j2, j3, j4, effectListResponse2);
    }
}
