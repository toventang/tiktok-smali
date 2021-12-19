package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.b.b;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import com.ss.ugc.effectplatform.model.net.ProviderEffectListResponse;
import com.ss.ugc.effectplatform.util.i;
import d.a.d.a.d;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import java.util.List;

public final class ai extends a<ProviderEffectModel, ProviderEffectListResponse> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f153766c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.a f153767d;

    /* renamed from: f  reason: collision with root package name */
    private final String f153768f;

    /* renamed from: g  reason: collision with root package name */
    private final String f153769g;

    /* renamed from: h  reason: collision with root package name */
    private final int f153770h;

    /* renamed from: i  reason: collision with root package name */
    private final int f153771i;

    /* renamed from: j  reason: collision with root package name */
    private final String f153772j;

    static {
        Covode.recordClassIndex(102560);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102561);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final e c() {
        HashMap<String, String> a2 = i.a(this.f153767d, true);
        String str = this.f153769g;
        if (str != null) {
            a2.put("library", str);
        }
        String str2 = this.f153768f;
        if (str2 != null) {
            a2.put("word", str2);
        }
        a2.put("cursor", String.valueOf(this.f153770h));
        a2.put("count", String.valueOf(this.f153771i));
        String str3 = this.f153772j;
        if (str3 != null && !p.a((CharSequence) str3)) {
            a2.put("giphy_type", this.f153772j);
        }
        return new e(com.ss.ugc.effectplatform.util.p.a(a2, this.f153767d.A + this.f153767d.f153401a + "/stickers/search"), c.GET, null, null, false, 60);
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
        eVar.a(str, this.f153767d.A, str2);
        super.a(str, str2, eVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ void a(long j2, long j3, long j4, ProviderEffectListResponse providerEffectListResponse) {
        List<ProviderEffect> sticker_list;
        ProviderEffectListResponse providerEffectListResponse2 = providerEffectListResponse;
        l.c(providerEffectListResponse2, "");
        ProviderEffectModel data = providerEffectListResponse2.getData();
        if (!(data == null || (sticker_list = data.getSticker_list()) == null)) {
            for (ProviderEffect providerEffect : sticker_list) {
                providerEffect.setPath(this.f153767d.f153409i + d.f156619a + providerEffect.getId() + ".gif");
            }
            super.a(j2, j3, j4, providerEffectListResponse2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ai(com.ss.ugc.effectplatform.a aVar, String str, String str2, String str3, int i2, int i3, String str4) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str);
        l.c(aVar, "");
        l.c(str, "");
        this.f153767d = aVar;
        this.f153768f = str2;
        this.f153769g = str3;
        this.f153770h = i2;
        this.f153771i = i3;
        this.f153772j = str4;
    }
}
