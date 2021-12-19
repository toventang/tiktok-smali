package com.ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.h.e;
import com.google.c.a.q;
import com.ss.android.ugc.aweme.filter.repository.a.c;
import com.ss.android.ugc.aweme.filter.repository.internal.h;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.tools.b.a.d;
import f.a.t;
import f.a.x;
import h.a.n;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class k extends e<com.ss.android.ugc.aweme.filter.repository.internal.a> implements h {

    /* renamed from: a  reason: collision with root package name */
    final q<d> f95725a;

    /* renamed from: b  reason: collision with root package name */
    final q<String> f95726b;

    static {
        Covode.recordClassIndex(60653);
    }

    @Override // com.bytedance.jedi.a.h.a
    public final t<com.ss.android.ugc.aweme.filter.repository.internal.a> b() {
        t<com.ss.android.ugc.aweme.filter.repository.internal.a> a2 = t.a(new a(this));
        l.b(a2, "");
        return a2;
    }

    static final class a<V> implements Callable<x<? extends com.ss.android.ugc.aweme.filter.repository.internal.a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f95727a;

        static {
            Covode.recordClassIndex(60654);
        }

        a(k kVar) {
            this.f95727a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ x<? extends com.ss.android.ugc.aweme.filter.repository.internal.a> call() {
            k kVar = this.f95727a;
            f.a.l.b bVar = new f.a.l.b();
            l.b(bVar, "");
            d b2 = kVar.f95725a.b();
            l.b(b2, "");
            String b3 = kVar.f95726b.b();
            l.b(b3, "");
            com.ss.android.ugc.tools.b.a.a.a.a(b2, b3, new b(bVar));
            t c2 = bVar.c();
            l.b(c2, "");
            return c2;
        }
    }

    public static final class b implements IFetchEffectChannelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f.a.l.b f95728a;

        static {
            Covode.recordClassIndex(60655);
        }

        b(f.a.l.b bVar) {
            this.f95728a = bVar;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            Exception exc;
            Exception exception;
            if (!(exceptionResult == null || (exception = exceptionResult.getException()) == null)) {
                exception.printStackTrace();
            }
            f.a.l.b bVar = this.f95728a;
            if (exceptionResult == null || (exc = exceptionResult.getException()) == null) {
                exc = new RuntimeException("failed on fetch remote filters, msg : " + exceptionResult + "?.msg, code : " + exceptionResult + "?.errorCode");
            }
            bVar.onError(exc);
            this.f95728a.onComplete();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            List<EffectCategoryResponse> categoryResponseList;
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            ArrayList<p> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (!(effectChannelResponse2 == null || (categoryResponseList = effectChannelResponse2.getCategoryResponseList()) == null)) {
                ArrayList arrayList3 = new ArrayList(n.a((Iterable) categoryResponseList, 10));
                for (T t : categoryResponseList) {
                    List<Effect> totalEffects = t.getTotalEffects();
                    ArrayList arrayList4 = new ArrayList(n.a((Iterable) totalEffects, 10));
                    Iterator<T> it = totalEffects.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(com.ss.android.ugc.aweme.filter.repository.internal.utils.b.a((Effect) it.next()));
                    }
                    arrayList3.add(v.a(t, arrayList4));
                }
                arrayList.addAll(arrayList3);
                ArrayList arrayList5 = new ArrayList();
                for (p pVar : arrayList) {
                    n.a((Collection) arrayList5, (Iterable) ((List) pVar.getSecond()));
                }
                arrayList2.addAll(arrayList5);
            }
            this.f95728a.onNext(new com.ss.android.ugc.aweme.filter.repository.internal.a(new c(arrayList2, arrayList)));
            this.f95728a.onComplete();
        }
    }

    public k(q<d> qVar, q<String> qVar2) {
        l.d(qVar, "");
        l.d(qVar2, "");
        this.f95725a = qVar;
        this.f95726b = qVar2;
    }
}
