package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a;
import com.ss.ugc.effectplatform.a.b.b;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponseV2;
import com.ss.ugc.effectplatform.util.i;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import java.util.Map;

public final class ah extends a<SearchEffectResponseV2, SearchEffectResponseV2> {

    /* renamed from: c  reason: collision with root package name */
    private final a f153759c;

    /* renamed from: d  reason: collision with root package name */
    private final String f153760d;

    /* renamed from: f  reason: collision with root package name */
    private final String f153761f;

    /* renamed from: g  reason: collision with root package name */
    private final int f153762g;

    /* renamed from: h  reason: collision with root package name */
    private final int f153763h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, String> f153764i;

    /* renamed from: j  reason: collision with root package name */
    private final String f153765j;

    static {
        Covode.recordClassIndex(102559);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final int e() {
        return 10014;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final e c() {
        String str;
        HashMap<String, String> a2 = i.a(this.f153759c, true);
        String str2 = this.f153760d;
        if (str2 != null) {
            a2.put("search_id", str2);
        }
        a2.put("keyword", this.f153761f);
        a2.put("cursor", String.valueOf(this.f153763h));
        a2.put("count", String.valueOf(this.f153762g));
        Map<String, String> map = this.f153764i;
        if (map != null) {
            a2.putAll(map);
        }
        String str3 = this.f153765j;
        if (str3 == null || p.a((CharSequence) str3)) {
            str = this.f153759c.A + this.f153759c.f153401a + "/search/effects";
        } else {
            str = this.f153765j + "/aweme/v1/search/effect/";
        }
        return new e(com.ss.ugc.effectplatform.util.p.a(a2, str), c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ SearchEffectResponseV2 a(b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        return (SearchEffectResponseV2) bVar.f153430a.convertJsonToObj(str, SearchEffectResponseV2.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ah(a aVar, String str, String str2, int i2, int i3, Map<String, String> map, String str3, String str4) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str3);
        l.c(aVar, "");
        l.c(str2, "");
        l.c(str3, "");
        this.f153759c = aVar;
        this.f153760d = str;
        this.f153761f = str2;
        this.f153762g = i2;
        this.f153763h = i3;
        this.f153764i = map;
        this.f153765j = str4;
    }
}
