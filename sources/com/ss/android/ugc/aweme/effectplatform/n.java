package com.ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class n implements IEffectDownloadProgressListener {

    /* renamed from: c  reason: collision with root package name */
    public static final a f89058c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f89059a;

    /* renamed from: b  reason: collision with root package name */
    public final IFetchEffectListener f89060b;

    /* renamed from: d  reason: collision with root package name */
    private final o f89061d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f89062e;

    static {
        Covode.recordClassIndex(56008);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(56009);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static IFetchEffectListener a(String str, IEffectDownloadProgressListener iEffectDownloadProgressListener) {
            return new n(str, iEffectDownloadProgressListener, (byte) 0);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        IFetchEffectListener iFetchEffectListener = this.f89060b;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onStart(effect);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(Effect effect) {
        String str;
        Effect effect2 = effect;
        long a2 = this.f89061d.a(TimeUnit.MILLISECONDS);
        IFetchEffectListener iFetchEffectListener = this.f89060b;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onSuccess(effect2);
        }
        b a3 = new b().a("resource_type", m.a(this.f89059a)).a("duration", a2).a("status", 0);
        if (effect2 != null) {
            str = effect2.getEffectId();
        } else {
            str = null;
        }
        d.a("tool_performance_resource_download", a3.a("resource_id", str).a("is_auto_download", this.f89062e).f149193a);
    }

    public n(String str, IFetchEffectListener iFetchEffectListener) {
        this.f89059a = str;
        this.f89060b = iFetchEffectListener;
        this.f89062e = false;
        o a2 = o.a();
        l.b(a2, "");
        this.f89061d = a2;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        String str;
        l.d(exceptionResult, "");
        long a2 = this.f89061d.a(TimeUnit.MILLISECONDS);
        IFetchEffectListener iFetchEffectListener = this.f89060b;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onFail(effect, exceptionResult);
        }
        b a3 = new b().a("resource_type", m.a(this.f89059a)).a("duration", a2).a("status", 1);
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
        d.a("tool_performance_resource_download", a4.a("error_msg", msg).a("is_auto_download", this.f89062e).f149193a);
    }

    public /* synthetic */ n(String str, IFetchEffectListener iFetchEffectListener, byte b2) {
        this(str, iFetchEffectListener);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i2, long j2) {
        IFetchEffectListener iFetchEffectListener = this.f89060b;
        if (iFetchEffectListener instanceof IEffectDownloadProgressListener) {
            ((IEffectDownloadProgressListener) iFetchEffectListener).onProgress(effect, i2, j2);
        }
    }
}
