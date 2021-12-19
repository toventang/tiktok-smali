package com.ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.f.b;
import java.util.concurrent.TimeUnit;

public final class l implements IFetchEffectListener {

    /* renamed from: a  reason: collision with root package name */
    public final String f89055a;

    /* renamed from: b  reason: collision with root package name */
    public final IFetchEffectListener f89056b;

    /* renamed from: c  reason: collision with root package name */
    private final o f89057c = o.a();

    static {
        Covode.recordClassIndex(56006);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        IFetchEffectListener iFetchEffectListener = this.f89056b;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onStart(effect);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(Effect effect) {
        String str;
        Effect effect2 = effect;
        long a2 = this.f89057c.a(TimeUnit.MILLISECONDS);
        IFetchEffectListener iFetchEffectListener = this.f89056b;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onSuccess(effect2);
        }
        b a3 = new b().a("resource_type", m.a(this.f89055a)).a("duration", a2).a("status", 0);
        if (effect2 != null) {
            str = effect2.getEffectId();
        } else {
            str = null;
        }
        d.a("tool_performance_resource_download", a3.a("resource_id", str).f149193a);
    }

    public l(String str, IFetchEffectListener iFetchEffectListener) {
        this.f89055a = str;
        this.f89056b = iFetchEffectListener;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        String str;
        h.f.b.l.d(exceptionResult, "");
        long a2 = this.f89057c.a(TimeUnit.MILLISECONDS);
        IFetchEffectListener iFetchEffectListener = this.f89056b;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onFail(effect, exceptionResult);
        }
        b a3 = new b().a("resource_type", m.a(this.f89055a)).a("duration", a2).a("status", 1);
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        b a4 = a3.a("resource_id", str).a("error_domain", EffectPlatformFactory.a().getHosts().get(0)).a("error_code", exceptionResult.getErrorCode());
        String msg = exceptionResult.getMsg();
        if (msg == null) {
            msg = "empty_error_msg";
        }
        d.a("tool_performance_resource_download", a4.a("error_msg", msg).f149193a);
    }
}
