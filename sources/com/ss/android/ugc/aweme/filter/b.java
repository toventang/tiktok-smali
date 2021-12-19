package com.ss.android.ugc.aweme.filter;

import com.bytedance.covode.number.Covode;
import com.google.c.a.q;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.tools.b.a.d;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final q<d> f95486a;

    /* renamed from: b  reason: collision with root package name */
    private final q<String> f95487b;

    static {
        Covode.recordClassIndex(60496);
    }

    public static final class a implements IFetchEffectChannelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f95488a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f95489b;

        static {
            Covode.recordClassIndex(60497);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            this.f95489b.invoke(exceptionResult);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            List<EffectCategoryResponse> categoryResponseList;
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            ArrayList arrayList = new ArrayList();
            if (!(effectChannelResponse2 == null || (categoryResponseList = effectChannelResponse2.getCategoryResponseList()) == null)) {
                Iterator<T> it = categoryResponseList.iterator();
                while (it.hasNext()) {
                    arrayList.addAll(it.next().getTotalEffects());
                }
            }
            this.f95488a.invoke(arrayList);
        }

        a(h.f.a.b bVar, h.f.a.b bVar2) {
            this.f95488a = bVar;
            this.f95489b = bVar2;
        }
    }

    public b(q<d> qVar, q<String> qVar2) {
        l.d(qVar, "");
        l.d(qVar2, "");
        this.f95486a = qVar;
        this.f95487b = qVar2;
    }

    public final void a(h.f.a.b<? super List<? extends Effect>, z> bVar, h.f.a.b<? super ExceptionResult, z> bVar2) {
        l.d(bVar, "");
        l.d(bVar2, "");
        String b2 = this.f95487b.b();
        l.b(b2, "");
        this.f95486a.b().a(b2, true, false, (IFetchEffectChannelListener) new a(bVar, bVar2));
    }
}
