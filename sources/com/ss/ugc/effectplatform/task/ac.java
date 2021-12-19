package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.b.b;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import com.ss.ugc.effectplatform.util.i;
import com.ss.ugc.effectplatform.util.j;
import com.ss.ugc.effectplatform.util.p;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ac extends a<List<? extends Effect>, EffectListResponse> {

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153738c;

    /* renamed from: d  reason: collision with root package name */
    public final String f153739d;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f153740f;

    static {
        Covode.recordClassIndex(102550);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final int e() {
        return 10003;
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ EffectListResponse $result;
        final /* synthetic */ ac this$0;

        static {
            Covode.recordClassIndex(102551);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ac acVar, EffectListResponse effectListResponse) {
            super(0);
            this.this$0 = acVar;
            this.$result = effectListResponse;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            e a2 = this.this$0.f153738c.K.a(this.this$0.f153739d);
            if (a2 != null) {
                a2.onSuccess(this.$result);
            }
            this.this$0.f153738c.K.b(this.this$0.f153739d);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final com.ss.ugc.effectplatform.a.c.e c() {
        HashMap<String, String> a2 = i.a(this.f153738c, true);
        Map<String, String> map = this.f153740f;
        if (map != null && (true ^ map.isEmpty())) {
            a2.putAll(this.f153740f);
        }
        return new com.ss.ugc.effectplatform.a.c.e(p.a(a2, this.f153738c.A + this.f153738c.f153401a + "/user/usedSticker"), c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ EffectListResponse a(b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        return (EffectListResponse) bVar.f153430a.convertJsonToObj(str, EffectListResponse.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ac(com.ss.ugc.effectplatform.a aVar, Map<String, String> map, String str) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str);
        l.c(aVar, "");
        l.c(str, "");
        this.f153738c = aVar;
        this.f153740f = map;
        this.f153739d = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ void a(long j2, long j3, long j4, EffectListResponse effectListResponse) {
        EffectListResponse effectListResponse2 = effectListResponse;
        l.c(effectListResponse2, "");
        String str = this.f153738c.f153409i;
        j.a(str, effectListResponse2.getEffect_list());
        j.a(str, effectListResponse2.getCollection_list());
        a(new a(this, effectListResponse2));
    }
}
