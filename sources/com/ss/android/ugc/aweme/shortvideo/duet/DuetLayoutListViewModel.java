package com.ss.android.ugc.aweme.shortvideo.duet;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import h.f.b.l;

public final class DuetLayoutListViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public t<com.ss.android.ugc.aweme.bw.b.a<EffectChannelResponse>> f126490a;

    static {
        Covode.recordClassIndex(82973);
    }

    public static final class a implements IFetchEffectChannelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DuetLayoutListViewModel f126491a;

        static {
            Covode.recordClassIndex(82974);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(DuetLayoutListViewModel duetLayoutListViewModel) {
            this.f126491a = duetLayoutListViewModel;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            Exception exc;
            t<com.ss.android.ugc.aweme.bw.b.a<EffectChannelResponse>> tVar = this.f126491a.f126490a;
            if (tVar != null) {
                if (exceptionResult != null) {
                    exc = exceptionResult.getException();
                } else {
                    exc = null;
                }
                tVar.setValue(com.ss.android.ugc.aweme.bw.b.a.a((Throwable) exc));
            }
            this.f126491a.f126490a = null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            l.d(effectChannelResponse, "");
            t<com.ss.android.ugc.aweme.bw.b.a<EffectChannelResponse>> tVar = this.f126491a.f126490a;
            if (tVar != null) {
                tVar.setValue(com.ss.android.ugc.aweme.bw.b.a.a(effectChannelResponse));
            }
        }
    }

    public final t<com.ss.android.ugc.aweme.bw.b.a<EffectChannelResponse>> a(f fVar, String str) {
        l.d(fVar, "");
        l.d(str, "");
        t<com.ss.android.ugc.aweme.bw.b.a<EffectChannelResponse>> tVar = this.f126490a;
        if (tVar != null) {
            return tVar;
        }
        t<com.ss.android.ugc.aweme.bw.b.a<EffectChannelResponse>> tVar2 = new t<>();
        this.f126490a = tVar2;
        tVar2.setValue(com.ss.android.ugc.aweme.bw.b.a.a());
        fVar.a(str, false, (IFetchEffectChannelListener) new a(this));
        t<com.ss.android.ugc.aweme.bw.b.a<EffectChannelResponse>> tVar3 = this.f126490a;
        if (tVar3 == null) {
            l.b();
        }
        return tVar3;
    }
}
