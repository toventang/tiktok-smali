package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a;
import com.ss.ugc.effectplatform.a.b.b;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import com.ss.ugc.effectplatform.model.net.ResourceListResponse;
import com.ss.ugc.effectplatform.util.i;
import com.ss.ugc.effectplatform.util.p;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class y extends a<ResourceListModel, ResourceListResponse> {

    /* renamed from: c  reason: collision with root package name */
    private final a f153940c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f153941d;

    static {
        Covode.recordClassIndex(102659);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final e c() {
        HashMap<String, String> a2 = i.a(this.f153940c, true);
        Map<String, String> map = this.f153941d;
        if (map != null) {
            a2.putAll(map);
        }
        return new e(p.a(a2, this.f153940c.A + this.f153940c.f153401a + "/moji/resource"), c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ ResourceListResponse a(b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        return (ResourceListResponse) bVar.f153430a.convertJsonToObj(str, ResourceListResponse.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(a aVar, String str, Map<String, String> map) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str);
        l.c(aVar, "");
        l.c(str, "");
        this.f153940c = aVar;
        this.f153941d = map;
    }
}
