package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.b.b;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.model.h;
import com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse;
import com.ss.ugc.effectplatform.util.i;
import com.ss.ugc.effectplatform.util.j;
import com.ss.ugc.effectplatform.util.p;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.HashMap;
import java.util.Map;

public final class r extends a<FetchHotEffectResponse, FetchHotEffectResponse> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f153890c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.a f153891d;

    /* renamed from: f  reason: collision with root package name */
    private final int f153892f;

    /* renamed from: g  reason: collision with root package name */
    private final int f153893g;

    /* renamed from: h  reason: collision with root package name */
    private final String f153894h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, String> f153895i;

    static {
        Covode.recordClassIndex(102639);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102640);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final FetchHotEffectResponse g() {
        String b2;
        V v = this.f153891d.w.f156544a;
        if (v == null || (b2 = v.b("effectgalleryhot")) == null) {
            return null;
        }
        try {
            b bVar = this.f153891d.q;
            if (bVar != null) {
                return (FetchHotEffectResponse) bVar.f153430a.convertJsonToObj(b2, FetchHotEffectResponse.class);
            }
            return null;
        } catch (Exception e2) {
            d.a.e.b.a("FetchHotEffectListTask", "Json Exception: ".concat(String.valueOf(e2)), null);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final e c() {
        HashMap<String, String> a2 = i.a(this.f153891d, true);
        a2.put("cursor", String.valueOf(this.f153893g));
        a2.put("count", String.valueOf(this.f153892f));
        a2.put("panel", "default");
        Map<String, String> map = this.f153895i;
        if (map != null) {
            a2.putAll(map);
        }
        return new e(p.a(a2, this.f153891d.A + this.f153891d.f153401a + "/hoteffects"), null, null, null, false, 62);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00c0 A[ADDED_TO_REGION, EDGE_INSN: B:89:0x00c0->B:64:0x00c0 ?: BREAK  , SYNTHETIC] */
    @Override // com.ss.ugc.effectplatform.task.a, com.ss.ugc.effectplatform.task.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.task.r.a():void");
    }

    private final long a(FetchHotEffectResponse fetchHotEffectResponse) {
        String convertObjToJson;
        long j2;
        if (fetchHotEffectResponse == null) {
            return 0;
        }
        try {
            b bVar = this.f153891d.q;
            if (!(bVar == null || (convertObjToJson = bVar.f153430a.convertObjToJson(fetchHotEffectResponse)) == null)) {
                V v = this.f153891d.w.f156544a;
                if (v != null) {
                    j2 = v.a("effectgalleryhot", convertObjToJson);
                } else {
                    j2 = 0;
                }
                return j2 / ((long) com.ss.ugc.effectplatform.c.a.f153563a);
            }
        } catch (Exception e2) {
            d.a.e.b.a("FetchHotEffectListTask", "saveHotEffectList: ".concat(String.valueOf(e2)), null);
        }
        return 0;
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ FetchHotEffectResponse a(b bVar, String str) {
        return b(bVar, str);
    }

    private static FetchHotEffectResponse b(b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        return (FetchHotEffectResponse) bVar.f153430a.convertJsonToObj(str, FetchHotEffectResponse.class);
    }

    /* access modifiers changed from: private */
    public void a(long j2, long j3, long j4, FetchHotEffectResponse fetchHotEffectResponse) {
        l.c(fetchHotEffectResponse, "");
        long currentTimeMillis = System.currentTimeMillis();
        j.a(this.f153891d.f153409i, fetchHotEffectResponse.getEffect_list());
        j.a(this.f153891d.f153409i, fetchHotEffectResponse.getCollection_list());
        j.a(fetchHotEffectResponse.getUrlPrefix(), fetchHotEffectResponse.getEffect_list());
        j.a(fetchHotEffectResponse.getUrlPrefix(), fetchHotEffectResponse.getCollection_list());
        j.b(fetchHotEffectResponse.getRecId(), fetchHotEffectResponse.getEffect_list());
        j.b(fetchHotEffectResponse.getRecId(), fetchHotEffectResponse.getCollection_list());
        V v = this.f153891d.s.f156544a;
        if (v != null) {
            com.ss.ugc.effectplatform.i.b.a(v, this.f153891d, ag.a(v.a("duration", Long.valueOf(currentTimeMillis - j2)), v.a("network_time", Long.valueOf(j3 - j2))));
        }
        super.a(j2, j3, j4, (h) fetchHotEffectResponse);
        a(fetchHotEffectResponse);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(com.ss.ugc.effectplatform.a aVar, int i2, int i3, String str, Map<String, String> map) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str);
        l.c(aVar, "");
        l.c(str, "");
        this.f153891d = aVar;
        this.f153892f = i2;
        this.f153893g = i3;
        this.f153894h = str;
        this.f153895i = map;
    }
}
