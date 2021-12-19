package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.h.c;
import com.ss.ugc.effectplatform.h.d;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.GifProviderEffectModel;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import com.ss.ugc.effectplatform.model.net.GifProviderEffectListResponse;
import com.ss.ugc.effectplatform.util.i;
import com.ss.ugc.effectplatform.util.t;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class w extends a<GifProviderEffectModel, GifProviderEffectListResponse> {

    /* renamed from: c  reason: collision with root package name */
    private String f153914c;

    /* renamed from: d  reason: collision with root package name */
    private String f153915d;

    /* renamed from: f  reason: collision with root package name */
    private String f153916f;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.a f153917g;

    /* renamed from: h  reason: collision with root package name */
    private final String f153918h;

    /* renamed from: i  reason: collision with root package name */
    private final String f153919i;

    /* renamed from: j  reason: collision with root package name */
    private final String f153920j;

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, String> f153921k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f153922l;

    static {
        Covode.recordClassIndex(102654);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ e $listener;
        final /* synthetic */ GifProviderEffectListResponse $result;

        static {
            Covode.recordClassIndex(102655);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, GifProviderEffectListResponse gifProviderEffectListResponse) {
            super(0);
            this.$listener = eVar;
            this.$result = gifProviderEffectListResponse;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$listener.onSuccess(this.$result);
            return z.f158842a;
        }
    }

    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        public final List<ProviderEffect> f153923a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final List<ProviderEffect> f153924b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final com.ss.ugc.effectplatform.model.e f153925c;

        /* renamed from: d  reason: collision with root package name */
        public int f153926d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ w f153927e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ GifProviderEffectListResponse f153928f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List f153929g;

        static {
            Covode.recordClassIndex(102656);
        }

        @Override // com.ss.ugc.effectplatform.h.d
        public final void onProgress(ProviderEffect providerEffect, int i2, long j2) {
        }

        private final boolean a() {
            if (this.f153923a.size() + this.f153924b.size() == this.f153926d) {
                return true;
            }
            return false;
        }

        private final void b() {
            if (this.f153924b.size() > 0) {
                w wVar = this.f153927e;
                GifProviderEffectListResponse gifProviderEffectListResponse = this.f153928f;
                com.ss.ugc.effectplatform.model.e eVar = this.f153925c;
                if (eVar == null) {
                    eVar = new com.ss.ugc.effectplatform.model.e(1);
                }
                wVar.a(gifProviderEffectListResponse, eVar);
                return;
            }
            this.f153927e.a(this.f153928f, this.f153929g);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onSuccess(ProviderEffect providerEffect) {
            l.c(providerEffect, "");
            this.f153923a.add(providerEffect);
            if (a()) {
                b();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onFail(ProviderEffect providerEffect, com.ss.ugc.effectplatform.model.e eVar) {
            l.c(eVar, "");
            this.f153924b.add(providerEffect);
            if (a()) {
                b();
            }
        }

        b(w wVar, GifProviderEffectListResponse gifProviderEffectListResponse, List list) {
            this.f153927e = wVar;
            this.f153928f = gifProviderEffectListResponse;
            this.f153929g = list;
            this.f153926d = list.size();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final com.ss.ugc.effectplatform.a.c.e c() {
        HashMap<String, String> a2 = i.a(this.f153917g, true);
        a2.put("gif_id", this.f153919i);
        String str = this.f153920j;
        if (str != null && !p.a((CharSequence) str)) {
            a2.put("giphy_type", this.f153920j);
        }
        Map<String, String> map = this.f153921k;
        if (map != null) {
            a2.putAll(map);
        }
        return new com.ss.ugc.effectplatform.a.c.e(com.ss.ugc.effectplatform.util.p.a(a2, this.f153917g.A + this.f153917g.f153401a + "/stickers/list"), null, null, null, false, 62);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ GifProviderEffectListResponse a(com.ss.ugc.effectplatform.a.b.b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        return (GifProviderEffectListResponse) bVar.f153430a.convertJsonToObj(str, GifProviderEffectListResponse.class);
    }

    public final void a(GifProviderEffectListResponse gifProviderEffectListResponse, com.ss.ugc.effectplatform.model.e eVar) {
        e a2 = this.f153917g.K.a(this.f153918h);
        if (a2 instanceof c) {
            ((c) a2).a(eVar);
        } else if (a2 != null) {
            a2.onFail(gifProviderEffectListResponse, eVar);
        }
        this.f153917g.K.b(this.f153918h);
    }

    public final void a(GifProviderEffectListResponse gifProviderEffectListResponse, List<? extends ProviderEffect> list) {
        e a2 = this.f153917g.K.a(this.f153918h);
        if (a2 instanceof c) {
            ((c) a2).a(list);
        } else if (a2 != null) {
            a2.onSuccess(gifProviderEffectListResponse);
        }
        this.f153917g.K.b(this.f153918h);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final void a(String str, String str2, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        eVar.a(this.f153914c, this.f153915d, this.f153916f);
        super.a(str, str2, eVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ void a(long j2, long j3, long j4, GifProviderEffectListResponse gifProviderEffectListResponse) {
        List<ProviderEffect> list;
        ProviderEffectModel gifs;
        GifProviderEffectListResponse gifProviderEffectListResponse2 = gifProviderEffectListResponse;
        l.c(gifProviderEffectListResponse2, "");
        GifProviderEffectModel data = gifProviderEffectListResponse2.getData();
        if (data == null || (gifs = data.getGifs()) == null) {
            list = null;
        } else {
            list = gifs.getSticker_list();
        }
        if (list != null && !list.isEmpty()) {
            for (ProviderEffect providerEffect : list) {
                providerEffect.setPath(this.f153917g.f153409i + d.a.d.a.d.f156619a + providerEffect.getId() + ".gif");
            }
        }
        if (!this.f153922l || list == null || list.isEmpty()) {
            super.a(j2, j3, j4, gifProviderEffectListResponse2);
            return;
        }
        e a2 = this.f153917g.K.a(this.f153918h);
        if (a2 instanceof c) {
            a(new a(a2, gifProviderEffectListResponse2));
        }
        b bVar = new b(this, gifProviderEffectListResponse2, list);
        for (ProviderEffect providerEffect2 : list) {
            String a3 = t.a();
            this.f153917g.K.a(a3, bVar);
            al alVar = this.f153917g.z;
            if (alVar != null) {
                alVar.a(new i(this.f153917g, providerEffect2, a3));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(com.ss.ugc.effectplatform.a aVar, String str, String str2, String str3, Map<String, String> map, boolean z) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str);
        l.c(aVar, "");
        l.c(str, "");
        l.c(str2, "");
        this.f153917g = aVar;
        this.f153918h = str;
        this.f153919i = str2;
        this.f153920j = str3;
        this.f153921k = map;
        this.f153922l = z;
    }
}
