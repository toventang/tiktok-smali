package com.ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class j implements IFetchEffectChannelListener {

    /* renamed from: a  reason: collision with root package name */
    public final String f89052a;

    /* renamed from: b  reason: collision with root package name */
    public final IFetchEffectChannelListener f89053b;

    /* renamed from: c  reason: collision with root package name */
    private final o f89054c = o.a();

    static {
        Covode.recordClassIndex(56004);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
        long a2 = this.f89054c.a(TimeUnit.MILLISECONDS);
        IFetchEffectChannelListener iFetchEffectChannelListener = this.f89053b;
        if (iFetchEffectChannelListener != null) {
            iFetchEffectChannelListener.onSuccess(effectChannelResponse);
        }
        d.a("tool_performance_api", new b().a("api_type", k.a(this.f89052a)).a("duration", a2).a("status", 0).f149193a);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        Integer num;
        long a2 = this.f89054c.a(TimeUnit.MILLISECONDS);
        IFetchEffectChannelListener iFetchEffectChannelListener = this.f89053b;
        if (iFetchEffectChannelListener != null) {
            iFetchEffectChannelListener.onFail(exceptionResult);
        }
        b a3 = new b().a("api_type", k.a(this.f89052a)).a("duration", a2).a("status", 1).a("error_domain", EffectPlatformFactory.a().getHosts().get(0));
        if (exceptionResult != null) {
            num = Integer.valueOf(exceptionResult.getErrorCode());
        } else {
            num = null;
        }
        d.a("tool_performance_api", a3.a("error_code", num).f149193a);
    }

    public j(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        l.d(str, "");
        this.f89052a = str;
        this.f89053b = iFetchEffectChannelListener;
    }
}
