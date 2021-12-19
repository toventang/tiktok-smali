package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a;
import com.ss.ugc.effectplatform.a.b.b;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import com.ss.ugc.effectplatform.util.i;
import com.ss.ugc.effectplatform.util.j;
import com.ss.ugc.effectplatform.util.p;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class q extends a<FetchFavoriteListResponse, FetchFavoriteListResponse> {

    /* renamed from: c  reason: collision with root package name */
    private final a f153886c;

    /* renamed from: d  reason: collision with root package name */
    private final String f153887d;

    /* renamed from: f  reason: collision with root package name */
    private final String f153888f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, String> f153889g = null;

    static {
        Covode.recordClassIndex(102638);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final int d() {
        return this.f153886c.n;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final e c() {
        HashMap<String, String> a2 = i.a(this.f153886c, true);
        String str = this.f153887d;
        if (str != null) {
            a2.put("panel", str);
        }
        Map<String, String> map = this.f153889g;
        if (map != null) {
            a2.putAll(map);
        }
        return new e(p.a(a2, this.f153886c.A + this.f153886c.f153401a + "/v3/effect/my"), c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ FetchFavoriteListResponse a(b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        return (FetchFavoriteListResponse) bVar.f153430a.convertJsonToObj(str, FetchFavoriteListResponse.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(a aVar, String str, String str2) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str2);
        l.c(aVar, "");
        l.c(str2, "");
        this.f153886c = aVar;
        this.f153887d = str;
        this.f153888f = str2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ void a(long j2, long j3, long j4, FetchFavoriteListResponse fetchFavoriteListResponse) {
        FetchFavoriteListResponse fetchFavoriteListResponse2 = fetchFavoriteListResponse;
        l.c(fetchFavoriteListResponse2, "");
        j.a(this.f153886c.f153409i, fetchFavoriteListResponse2.getEffect_list());
        j.a(this.f153886c.f153409i, fetchFavoriteListResponse2.getCollection_effects());
        super.a(j2, j3, j4, fetchFavoriteListResponse2);
    }
}
