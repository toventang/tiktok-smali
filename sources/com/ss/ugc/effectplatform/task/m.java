package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.b.f;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import com.ss.ugc.effectplatform.model.EffectChannelModel;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.e;
import com.ss.ugc.effectplatform.util.g;
import com.ss.ugc.effectplatform.util.u;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class m extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f153870c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153871a;

    /* renamed from: b  reason: collision with root package name */
    public final String f153872b;

    /* renamed from: d  reason: collision with root package name */
    private final String f153873d;

    static {
        Covode.recordClassIndex(102623);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102624);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(102625);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f153871a.K.b(this.this$0.f153872b);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public final void b() {
        a(new b(this));
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ e $exceptionResult;
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(102626);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(m mVar, e eVar) {
            super(0);
            this.this$0 = mVar;
            this.$exceptionResult = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153871a.K.a(this.this$0.f153872b);
            if (a2 != null) {
                a2.onFail(null, this.$exceptionResult);
            }
            this.this$0.f153871a.K.b(this.this$0.f153872b);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ EffectChannelResponse $response;
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(102627);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(m mVar, EffectChannelResponse effectChannelResponse) {
            super(0);
            this.this$0 = mVar;
            this.$response = effectChannelResponse;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.ugc.effectplatform.h.e a2 = this.this$0.f153871a.K.a(this.this$0.f153872b);
            if (a2 != null) {
                a2.onSuccess(this.$response);
            }
            this.this$0.f153871a.K.b(this.this$0.f153872b);
            return z.f158842a;
        }
    }

    private final EffectChannelModel c() {
        String b2;
        f fVar = (f) d.a.b.b.a(this.f153871a.w);
        if (fVar == null || (b2 = fVar.b(g.a(this.f153871a.f153406f, this.f153873d))) == null) {
            return null;
        }
        try {
            com.ss.ugc.effectplatform.a.b.b bVar = this.f153871a.q;
            if (bVar != null) {
                return (EffectChannelModel) bVar.f153430a.convertJsonToObj(b2, EffectChannelModel.class);
            }
            return null;
        } catch (Exception e2) {
            d.a.e.b.a("FetchDownloadedEffectListTask", "Json Parse Exception: ".concat(String.valueOf(e2)), null);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.b
    public final void a() {
        V v;
        if (u.a(this.f153873d)) {
            a(new e(10007));
            return;
        }
        EffectChannelResponse effectChannelResponse = new EffectChannelResponse(null, null, null, null, null, null, null, null, null, 511, null);
        EffectChannelModel c2 = c();
        if (c2 == null || !c2.checkValued()) {
            a(new e(10004));
            return;
        }
        List<Effect> effect_list = c2.getEffect_list();
        ArrayList arrayList = new ArrayList();
        if (!(effect_list == null || (v = this.f153871a.w.f156544a) == null)) {
            for (Effect effect : effect_list) {
                if (v.e(effect.getId())) {
                    arrayList.add(effect);
                }
            }
        }
        if (arrayList.isEmpty()) {
            a(new EffectChannelResponse(this.f153873d, null, null, null, null, null, null, null, null, 510, null));
            return;
        }
        effectChannelResponse.setAll_category_effects(arrayList);
        effectChannelResponse.setCategory_responses(a(c2, arrayList));
        effectChannelResponse.setPanel(this.f153873d);
        effectChannelResponse.setPanel_model(c2.getPanel_model());
        a(effectChannelResponse);
    }

    private final void a(EffectChannelResponse effectChannelResponse) {
        a(new d(this, effectChannelResponse));
    }

    private final void a(e eVar) {
        a(new c(this, eVar));
    }

    private static List<Effect> a(List<String> list, List<? extends Effect> list2) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (String str : list) {
            for (Effect effect : list2) {
                if (l.a((Object) str, (Object) effect.getEffect_id())) {
                    arrayList.add(effect);
                }
            }
        }
        return arrayList;
    }

    private static List<EffectCategoryResponse> a(EffectChannelModel effectChannelModel, List<? extends Effect> list) {
        List<EffectCategoryModel> category_list = effectChannelModel.getCategory_list();
        ArrayList arrayList = new ArrayList();
        for (EffectCategoryModel effectCategoryModel : category_list) {
            if (effectCategoryModel.checkValued()) {
                EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(effectCategoryModel.getId(), effectCategoryModel.getName(), effectCategoryModel.getKey(), null, null, null, null, a(effectCategoryModel.getEffects(), list), effectCategoryModel.getTags(), effectCategoryModel.getTags_updated_at(), null, false, null, 7288, null);
                effectCategoryResponse.setCollection_effect(effectChannelModel.getCollection_list());
                effectCategoryResponse.set_default(effectCategoryModel.is_default());
                effectCategoryResponse.setExtra(effectCategoryModel.getExtra());
                arrayList.add(effectCategoryResponse);
            }
        }
        return arrayList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(com.ss.ugc.effectplatform.a aVar, String str, String str2) {
        super(str2);
        l.c(aVar, "");
        l.c(str2, "");
        this.f153871a = aVar;
        this.f153873d = str;
        this.f153872b = str2;
    }
}
