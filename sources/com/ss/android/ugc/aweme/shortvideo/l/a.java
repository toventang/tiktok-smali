package com.ss.android.ugc.aweme.shortvideo.l;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public IFetchEffectListByIdsListener f128643a;

    static {
        Covode.recordClassIndex(84333);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.a$a  reason: collision with other inner class name */
    public static final class C3356a implements IFetchEffectListByIdsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f128644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IFetchEffectListByIdsListener f128645b;

        static {
            Covode.recordClassIndex(84334);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
            IFetchEffectListByIdsListener iFetchEffectListByIdsListener = this.f128644a.f128643a;
            if (iFetchEffectListByIdsListener != null) {
                iFetchEffectListByIdsListener.onFail(exceptionResult);
            }
            this.f128645b.onFail(exceptionResult);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* bridge */ /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            IFetchEffectListByIdsListener iFetchEffectListByIdsListener = this.f128644a.f128643a;
            if (iFetchEffectListByIdsListener != null) {
                iFetchEffectListByIdsListener.onSuccess(effectListResponse);
            }
            this.f128645b.onSuccess(effectListResponse);
        }

        public C3356a(a aVar, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
            this.f128644a = aVar;
            this.f128645b = iFetchEffectListByIdsListener;
        }
    }
}
