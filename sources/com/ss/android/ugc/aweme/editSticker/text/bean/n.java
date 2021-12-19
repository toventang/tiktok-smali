package com.ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.tools.b.a.d;
import h.f.b.l;
import h.q;
import h.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.m;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final d f88433a;

    static {
        Covode.recordClassIndex(55663);
    }

    public static final class a implements IFetchEffectChannelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f88434a;

        static {
            Covode.recordClassIndex(55664);
        }

        public a(m mVar) {
            this.f88434a = mVar;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            Exception exception;
            if (this.f88434a.a()) {
                if (exceptionResult == null || (exception = exceptionResult.getException()) == null) {
                    this.f88434a.resumeWith(q.m223constructorimpl(r.a((Throwable) new Exception())));
                } else {
                    this.f88434a.resumeWith(q.m223constructorimpl(r.a((Throwable) exception)));
                }
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            ArrayList arrayList;
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            if (effectChannelResponse2 == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList();
                Iterator<T> it = effectChannelResponse2.getAllCategoryEffects().iterator();
                while (it.hasNext()) {
                    h a2 = b.a((Effect) it.next());
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
            if (this.f88434a.a()) {
                this.f88434a.resumeWith(q.m223constructorimpl(arrayList));
            }
        }
    }

    public static final class b implements IFetchEffectChannelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f88435a;

        static {
            Covode.recordClassIndex(55665);
        }

        public b(m mVar) {
            this.f88435a = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            List<a> a2 = b.a(effectChannelResponse);
            if (this.f88435a.a()) {
                this.f88435a.resumeWith(q.m223constructorimpl(a2));
            }
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            Exception exception;
            if (this.f88435a.a()) {
                if (exceptionResult == null || (exception = exceptionResult.getException()) == null) {
                    this.f88435a.resumeWith(q.m223constructorimpl(r.a((Throwable) new Exception())));
                } else {
                    this.f88435a.resumeWith(q.m223constructorimpl(r.a((Throwable) exception)));
                }
            }
        }
    }

    public n(d dVar) {
        l.d(dVar, "");
        this.f88433a = dVar;
    }
}
