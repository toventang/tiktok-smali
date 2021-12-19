package com.ss.android.ugc.aweme.filter.view.internal.main;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.filter.repository.a.q;
import com.ss.android.ugc.aweme.filter.view.internal.d;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import h.f.b.l;
import java.util.Map;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.tools.b.a.d f95839a;

    /* renamed from: b  reason: collision with root package name */
    private final o f95840b;

    static final class a implements IUpdateTagListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f95841a = new a();

        static {
            Covode.recordClassIndex(60730);
        }

        a() {
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener
        public final void onFinally() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.b$b  reason: collision with other inner class name */
    static final class C2314b implements IUpdateTagListener {

        /* renamed from: a  reason: collision with root package name */
        public static final C2314b f95842a = new C2314b();

        static {
            Covode.recordClassIndex(60731);
        }

        C2314b() {
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener
        public final void onFinally() {
        }
    }

    static {
        Covode.recordClassIndex(60729);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.d
    public final void a(EffectCategoryResponse effectCategoryResponse) {
        l.d(effectCategoryResponse, "");
        this.f95839a.a(effectCategoryResponse.getId(), effectCategoryResponse.getTagsUpdateTime(), C2314b.f95842a);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.d
    public final void a(FilterBean filterBean) {
        Map<String, Effect> value;
        l.d(filterBean, "");
        q f2 = this.f95840b.f();
        l.d(f2, "");
        if (filterBean != null && (value = f2.d().getValue()) != null) {
            Effect effect = value.get(filterBean.getName());
            if (effect != null || (effect = value.get(filterBean.getEnName())) != null) {
                this.f95839a.a(effect.getId(), effect.getTagsUpdatedAt(), a.f95841a);
            }
        }
    }

    public b(com.ss.android.ugc.tools.b.a.d dVar, o oVar) {
        l.d(dVar, "");
        l.d(oVar, "");
        this.f95839a = dVar;
        this.f95840b = oVar;
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.d
    public final void a(EffectCategoryResponse effectCategoryResponse, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        l.d(effectCategoryResponse, "");
        l.d(iIsTagNeedUpdatedListener, "");
        this.f95839a.a(effectCategoryResponse.getId(), effectCategoryResponse.getTags(), effectCategoryResponse.getTagsUpdateTime(), iIsTagNeedUpdatedListener);
    }
}
