package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.b.b;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.b.f;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import com.ss.ugc.effectplatform.model.net.ProviderEffectListResponse;
import com.ss.ugc.effectplatform.util.g;
import com.ss.ugc.effectplatform.util.i;
import d.a.d.a.d;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class x extends a<ProviderEffectModel, ProviderEffectListResponse> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f153930c = new a((byte) 0);
    private static final String n = n;

    /* renamed from: d  reason: collision with root package name */
    private String f153931d;

    /* renamed from: f  reason: collision with root package name */
    private String f153932f;

    /* renamed from: g  reason: collision with root package name */
    private String f153933g;

    /* renamed from: h  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.a f153934h;

    /* renamed from: i  reason: collision with root package name */
    private final String f153935i;

    /* renamed from: j  reason: collision with root package name */
    private final int f153936j;

    /* renamed from: k  reason: collision with root package name */
    private final int f153937k;

    /* renamed from: l  reason: collision with root package name */
    private final String f153938l;

    /* renamed from: m  reason: collision with root package name */
    private final Map<String, String> f153939m = null;

    public static final class a {
        static {
            Covode.recordClassIndex(102658);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(102657);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final e c() {
        HashMap<String, String> a2 = i.a(this.f153934h, true);
        String str = this.f153935i;
        if (str != null) {
            a2.put("library", str);
        }
        a2.put("cursor", String.valueOf(this.f153936j));
        a2.put("count", String.valueOf(this.f153937k));
        String str2 = this.f153938l;
        if (str2 != null && !p.a((CharSequence) str2)) {
            a2.put("giphy_type", this.f153938l);
        }
        Map<String, String> map = this.f153939m;
        if (map != null) {
            a2.putAll(map);
        }
        return new e(com.ss.ugc.effectplatform.util.p.a(a2, this.f153934h.A + this.f153934h.f153401a + "/stickers/recommend"), c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ ProviderEffectListResponse a(b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        return (ProviderEffectListResponse) bVar.f153430a.convertJsonToObj(str, ProviderEffectListResponse.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final void a(String str, String str2, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        eVar.a(this.f153931d, this.f153932f, this.f153933g);
        super.a(str, str2, eVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ void a(long j2, long j3, long j4, ProviderEffectListResponse providerEffectListResponse) {
        String convertObjToJson;
        f fVar;
        List<ProviderEffect> sticker_list;
        ProviderEffectListResponse providerEffectListResponse2 = providerEffectListResponse;
        l.c(providerEffectListResponse2, "");
        ProviderEffectModel data = providerEffectListResponse2.getData();
        if (data != null) {
            if (!(data.getSticker_list() == null || (sticker_list = data.getSticker_list()) == null)) {
                for (ProviderEffect providerEffect : sticker_list) {
                    providerEffect.setPath(this.f153934h.f153409i + d.f156619a + providerEffect.getId() + ".gif");
                }
            }
            try {
                String a2 = g.a(this.f153934h.f153406f, this.f153935i);
                b bVar = this.f153934h.q;
                if (!(bVar == null || (convertObjToJson = bVar.f153430a.convertObjToJson(data)) == null || (fVar = (f) d.a.b.b.a(this.f153934h.w)) == null)) {
                    fVar.a(a2, convertObjToJson);
                }
            } catch (Exception e2) {
                d.a.e.b.a(n, String.valueOf(e2), null);
            }
            super.a(j2, j3, j4, providerEffectListResponse2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(com.ss.ugc.effectplatform.a aVar, String str, String str2, int i2, int i3, String str3) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str);
        l.c(aVar, "");
        l.c(str, "");
        this.f153934h = aVar;
        this.f153935i = str2;
        this.f153936j = i2;
        this.f153937k = i3;
        this.f153938l = str3;
    }
}
