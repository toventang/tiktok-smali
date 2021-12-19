package com.ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class i implements IFetchCategoryEffectListener {

    /* renamed from: a  reason: collision with root package name */
    public final String f89049a;

    /* renamed from: b  reason: collision with root package name */
    public final IFetchCategoryEffectListener f89050b;

    /* renamed from: c  reason: collision with root package name */
    private final o f89051c;

    static {
        Covode.recordClassIndex(56003);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
        long a2 = this.f89051c.a(TimeUnit.MILLISECONDS);
        IFetchCategoryEffectListener iFetchCategoryEffectListener = this.f89050b;
        if (iFetchCategoryEffectListener != null) {
            iFetchCategoryEffectListener.onSuccess(categoryPageModel);
        }
        d.a("tool_performance_api", new b().a("api_type", k.a(this.f89049a)).a("duration", a2).a("status", 0).f149193a);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    public final void onFail(ExceptionResult exceptionResult) {
        Integer num;
        long a2 = this.f89051c.a(TimeUnit.MILLISECONDS);
        IFetchCategoryEffectListener iFetchCategoryEffectListener = this.f89050b;
        if (iFetchCategoryEffectListener != null) {
            iFetchCategoryEffectListener.onFail(exceptionResult);
        }
        b a3 = new b().a("api_type", k.a(this.f89049a)).a("duration", a2).a("status", 1).a("error_domain", EffectPlatformFactory.a().getHosts().get(0));
        if (exceptionResult != null) {
            num = Integer.valueOf(exceptionResult.getErrorCode());
        } else {
            num = null;
        }
        d.a("tool_performance_api", a3.a("error_code", num).f149193a);
    }

    public i(String str, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        l.d(str, "");
        this.f89049a = str;
        this.f89050b = iFetchCategoryEffectListener;
        o a2 = o.a();
        l.b(a2, "");
        this.f89051c = a2;
    }
}
