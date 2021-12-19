package com.ss.android.ugc.tools.h.b.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.tools.b.a.a.a;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.android.ugc.tools.h.a.a.f;
import com.ss.android.ugc.tools.h.a.n;
import com.ss.android.ugc.tools.h.b.b.b;
import f.a.d.g;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class h implements f<EffectCategoryResponse> {

    /* renamed from: a  reason: collision with root package name */
    private final h.f.a.a<d> f149322a;

    static {
        Covode.recordClassIndex(98332);
    }

    static final class c extends m implements h.f.a.a<String> {
        final /* synthetic */ n $listMeta;

        static {
            Covode.recordClassIndex(98336);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            this.$listMeta = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return this.$listMeta.f149216a;
        }
    }

    public static final class b extends b<EffectChannelResponse, EffectChannelResponse> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h f149324f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ n f149325g;

        static {
            Covode.recordClassIndex(98334);
        }

        public static final class a implements IFetchEffectChannelListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b.a f149326a;

            static {
                Covode.recordClassIndex(98335);
            }

            a(b.a aVar) {
                this.f149326a = aVar;
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                this.f149326a.a(exceptionResult);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                this.f149326a.a(effectChannelResponse);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.tools.h.b.b.b
        public final /* bridge */ /* synthetic */ EffectChannelResponse d(EffectChannelResponse effectChannelResponse) {
            if (effectChannelResponse == null) {
                return com.ss.android.ugc.tools.b.a.a.a.f149090a;
            }
            return effectChannelResponse;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.ugc.tools.h.b.b.b
        public final void a(h.f.a.a<? extends d> aVar, h.f.a.a<String> aVar2, b.a<EffectChannelResponse> aVar3) {
            l.d(aVar, "");
            l.d(aVar2, "");
            l.d(aVar3, "");
            d dVar = (d) aVar.invoke();
            String invoke = aVar2.invoke();
            a aVar4 = new a(aVar3);
            l.d(dVar, "");
            l.d(invoke, "");
            l.d(aVar4, "");
            com.ss.android.ugc.tools.b.a.a.a.a(dVar, invoke, new a.e(dVar, aVar4, invoke));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar, n nVar, h.f.a.a aVar, h.f.a.a aVar2) {
            super(aVar, aVar2);
            this.f149324f = hVar;
            this.f149325g = nVar;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public h(h.f.a.a<? extends d> aVar) {
        l.d(aVar, "");
        this.f149322a = aVar;
    }

    @Override // com.ss.android.ugc.tools.h.a.a.f
    public final t<com.ss.android.ugc.tools.h.a.a<EffectCategoryResponse, Effect>> a(n nVar) {
        l.d(nVar, "");
        t<com.ss.android.ugc.tools.h.a.a<EffectCategoryResponse, Effect>> d2 = new b(this, nVar, this.f149322a, new c(nVar)).c(z.f158842a).d(a.f149323a);
        l.b(d2, "");
        return d2;
    }

    static final class a<T, R> implements g<EffectChannelResponse, com.ss.android.ugc.tools.h.a.a<EffectCategoryResponse, Effect>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f149323a = new a();

        static {
            Covode.recordClassIndex(98333);
        }

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ com.ss.android.ugc.tools.h.a.a<EffectCategoryResponse, Effect> apply(EffectChannelResponse effectChannelResponse) {
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            l.d(effectChannelResponse2, "");
            List<EffectCategoryResponse> categoryResponseList = effectChannelResponse2.getCategoryResponseList();
            if (categoryResponseList == null || categoryResponseList.isEmpty()) {
                return new com.ss.android.ugc.tools.h.a.a(effectChannelResponse2.getAllCategoryEffects(), h.a.z.INSTANCE);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) categoryResponseList, 10));
            for (T t : categoryResponseList) {
                List<Effect> totalEffects = t.getTotalEffects();
                arrayList.addAll(totalEffects);
                arrayList2.add(v.a(t, totalEffects));
            }
            return new com.ss.android.ugc.tools.h.a.a(arrayList, arrayList2);
        }
    }
}
