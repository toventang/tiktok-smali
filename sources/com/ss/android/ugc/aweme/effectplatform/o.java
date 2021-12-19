package com.ss.android.ugc.aweme.effectplatform;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class o implements IFetchPanelInfoListener {

    /* renamed from: c  reason: collision with root package name */
    public static final a f89063c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f89064a;

    /* renamed from: b  reason: collision with root package name */
    public final IFetchPanelInfoListener f89065b;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.c.a.o f89066d;

    static {
        Covode.recordClassIndex(56010);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(56011);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static IFetchPanelInfoListener a(String str, IFetchPanelInfoListener iFetchPanelInfoListener) {
            l.d(str, "");
            l.d(iFetchPanelInfoListener, "");
            return new o(str, iFetchPanelInfoListener, (byte) 0);
        }
    }

    private final String a() {
        if (TextUtils.equals(this.f89064a, "default")) {
            return "effect_panel_info";
        }
        return k.a(this.f89064a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(PanelInfoModel panelInfoModel) {
        long a2 = this.f89066d.a(TimeUnit.MILLISECONDS);
        IFetchPanelInfoListener iFetchPanelInfoListener = this.f89065b;
        if (iFetchPanelInfoListener != null) {
            iFetchPanelInfoListener.onSuccess(panelInfoModel);
        }
        d.a("tool_performance_api", new b().a("api_type", a()).a("duration", a2).a("status", 0).f149193a);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
    public final void onFail(ExceptionResult exceptionResult) {
        Integer num;
        long a2 = this.f89066d.a(TimeUnit.MILLISECONDS);
        IFetchPanelInfoListener iFetchPanelInfoListener = this.f89065b;
        if (iFetchPanelInfoListener != null) {
            iFetchPanelInfoListener.onFail(exceptionResult);
        }
        b a3 = new b().a("api_type", a()).a("duration", a2).a("status", 1).a("error_domain", EffectPlatformFactory.a().getHosts().get(0));
        if (exceptionResult != null) {
            num = Integer.valueOf(exceptionResult.getErrorCode());
        } else {
            num = null;
        }
        d.a("tool_performance_api", a3.a("error_code", num).f149193a);
    }

    private o(String str, IFetchPanelInfoListener iFetchPanelInfoListener) {
        this.f89064a = str;
        this.f89065b = iFetchPanelInfoListener;
        this.f89066d = com.google.c.a.o.a();
    }

    public /* synthetic */ o(String str, IFetchPanelInfoListener iFetchPanelInfoListener, byte b2) {
        this(str, iFetchPanelInfoListener);
    }
}
