package com.ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final IFetchEffectChannelListener f95623a = new a();

    public static final class a implements IFetchEffectChannelListener {
        static {
            Covode.recordClassIndex(60596);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* bridge */ /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
        }

        a() {
        }
    }

    static {
        Covode.recordClassIndex(60595);
    }
}
