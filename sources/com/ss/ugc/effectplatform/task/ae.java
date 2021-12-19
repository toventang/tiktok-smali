package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a;
import com.ss.ugc.effectplatform.a.b.b;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import com.ss.ugc.effectplatform.util.i;
import com.ss.ugc.effectplatform.util.p;
import h.f.b.l;

public final class ae extends a<RecommendSearchWordsResponse, RecommendSearchWordsResponse> {

    /* renamed from: c  reason: collision with root package name */
    private final a f153743c;

    static {
        Covode.recordClassIndex(102556);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final int e() {
        return 10003;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final e c() {
        return new e(p.a(i.a(this.f153743c, true), this.f153743c.A + this.f153743c.f153401a + "/search/recommend"), c.GET, null, null, false, 60);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ae(a aVar, String str) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str);
        l.c(aVar, "");
        l.c(str, "");
        this.f153743c = aVar;
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ RecommendSearchWordsResponse a(b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        return (RecommendSearchWordsResponse) bVar.f153430a.convertJsonToObj(str, RecommendSearchWordsResponse.class);
    }
}
