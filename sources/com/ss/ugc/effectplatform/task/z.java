package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.ugc.effectplatform.a.b.b;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.net.ModfifyFavoriteResponse;
import com.ss.ugc.effectplatform.util.i;
import h.f.b.l;
import h.f.b.m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class z extends a<List<? extends String>, ModfifyFavoriteResponse> {

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153942c;

    /* renamed from: d  reason: collision with root package name */
    public final String f153943d;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f153944f;

    /* renamed from: g  reason: collision with root package name */
    private final String f153945g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f153946h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, String> f153947i = null;

    static {
        Covode.recordClassIndex(102660);
    }

    static final class a extends m implements h.f.a.a<h.z> {
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(102661);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(z zVar) {
            super(0);
            this.this$0 = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            e a2 = this.this$0.f153942c.K.a(this.this$0.f153943d);
            if (a2 != null) {
                a2.onSuccess(this.this$0.f153944f);
            }
            this.this$0.f153942c.K.b(this.this$0.f153943d);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final com.ss.ugc.effectplatform.a.c.e c() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(i.a(this.f153942c));
        String str = this.f153945g;
        if (str != null) {
            hashMap.put("panel", str);
        }
        hashMap.put("effect_ids", this.f153944f);
        hashMap.put(StringSet.type, Integer.valueOf(this.f153946h ? 1 : 0));
        Map<String, String> map = this.f153947i;
        if (map != null) {
            hashMap.putAll(map);
        }
        return new com.ss.ugc.effectplatform.a.c.e(this.f153942c.A + this.f153942c.f153401a + "/v3/effect/favorite", c.POST, hashMap, "application/json", false, 36);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ ModfifyFavoriteResponse a(b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        return (ModfifyFavoriteResponse) bVar.f153430a.convertJsonToObj(str, ModfifyFavoriteResponse.class);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ void a(long j2, long j3, long j4, ModfifyFavoriteResponse modfifyFavoriteResponse) {
        l.c(modfifyFavoriteResponse, "");
        a(new a(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(com.ss.ugc.effectplatform.a aVar, String str, String str2, List<String> list, boolean z, Map<String, String> map) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str2);
        l.c(aVar, "");
        l.c(str2, "");
        l.c(list, "");
        this.f153942c = aVar;
        this.f153945g = str;
        this.f153943d = str2;
        this.f153944f = list;
        this.f153946h = z;
    }
}
