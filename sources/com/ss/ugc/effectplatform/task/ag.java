package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a;
import com.ss.ugc.effectplatform.a.b.b;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponse;
import com.ss.ugc.effectplatform.util.i;
import com.ss.ugc.effectplatform.util.j;
import com.ss.ugc.effectplatform.util.p;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class ag extends a<SearchEffectResponse, SearchEffectResponse> {

    /* renamed from: c  reason: collision with root package name */
    private final a f153753c;

    /* renamed from: d  reason: collision with root package name */
    private final String f153754d;

    /* renamed from: f  reason: collision with root package name */
    private final String f153755f;

    /* renamed from: g  reason: collision with root package name */
    private final int f153756g;

    /* renamed from: h  reason: collision with root package name */
    private final int f153757h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, String> f153758i;

    static {
        Covode.recordClassIndex(102558);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final int e() {
        return 10014;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final e c() {
        HashMap<String, String> a2 = i.a(this.f153753c, true);
        a2.put("panel", this.f153754d);
        a2.put("keyword", this.f153755f);
        a2.put("cursor", String.valueOf(this.f153757h));
        a2.put("count", String.valueOf(this.f153756g));
        Map<String, String> map = this.f153758i;
        if (map != null) {
            a2.putAll(map);
        }
        return new e(p.a(a2, this.f153753c.A + this.f153753c.f153401a + "/search"), c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ SearchEffectResponse a(b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        return (SearchEffectResponse) bVar.f153430a.convertJsonToObj(str, SearchEffectResponse.class);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ void a(long j2, long j3, long j4, SearchEffectResponse searchEffectResponse) {
        SearchEffectResponse searchEffectResponse2 = searchEffectResponse;
        l.c(searchEffectResponse2, "");
        j.a(this.f153753c.f153409i, this.f153754d, searchEffectResponse2.getEffect_list());
        j.a(this.f153753c.f153409i, this.f153754d, searchEffectResponse2.getCollection_list());
        j.a(this.f153753c.f153409i, this.f153754d, searchEffectResponse2.getBind_effects());
        super.a(j2, j3, j4, searchEffectResponse2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ag(a aVar, String str, String str2, int i2, int i3, Map<String, String> map, String str3) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str3);
        l.c(aVar, "");
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        this.f153753c = aVar;
        this.f153754d = str;
        this.f153755f = str2;
        this.f153756g = i2;
        this.f153757h = i3;
        this.f153758i = map;
    }
}
