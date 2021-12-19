package com.ss.android.ugc.aweme.effect.b;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.port.in.ap;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class b implements IFetchEffectListener {

    /* renamed from: a  reason: collision with root package name */
    public static final a f88857a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private long f88858b;

    /* renamed from: c  reason: collision with root package name */
    private final String f88859c;

    /* renamed from: d  reason: collision with root package name */
    private final IFetchEffectListener f88860d;

    static {
        Covode.recordClassIndex(55894);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55895);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static IFetchEffectListener a(String str, String str2, IFetchEffectListener iFetchEffectListener) {
            l.d(str, "");
            l.d(iFetchEffectListener, "");
            return new b(str, new com.ss.android.ugc.aweme.effectplatform.l(str2, iFetchEffectListener), (byte) 0);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.f88858b = System.currentTimeMillis();
        IFetchEffectListener iFetchEffectListener = this.f88860d;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onStart(effect);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(Effect effect) {
        UrlModel urlModel;
        String str;
        String name;
        Effect effect2 = effect;
        long currentTimeMillis = System.currentTimeMillis() - this.f88858b;
        ap I = g.a().I();
        String str2 = this.f88859c;
        ar arVar = new ar();
        f G = g.a().G();
        Integer num = null;
        if (effect2 != null) {
            urlModel = effect2.getFileUrl();
        } else {
            urlModel = null;
        }
        String b2 = G.b(urlModel);
        String str3 = "";
        if (b2 == null) {
            b2 = str3;
        }
        ar a2 = arVar.a("url", b2).a("duration", String.valueOf(currentTimeMillis));
        if (effect2 == null || (str = effect2.getEffectId()) == null) {
            str = str3;
        }
        ar a3 = a2.a("effect_id", str);
        if (!(effect2 == null || (name = effect2.getName()) == null)) {
            str3 = name;
        }
        ar a4 = a3.a("effect_name", str3);
        if (effect2 != null) {
            num = Integer.valueOf(effect2.getEffectType());
        }
        I.a(str2, 0, a4.a("effect_type", num).a());
        IFetchEffectListener iFetchEffectListener = this.f88860d;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onSuccess(effect2);
        }
    }

    private b(String str, IFetchEffectListener iFetchEffectListener) {
        this.f88859c = str;
        this.f88860d = iFetchEffectListener;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        String str;
        String str2;
        int i2;
        UrlModel urlModel;
        String str3 = "";
        l.d(exceptionResult, str3);
        ap I = g.a().I();
        String str4 = this.f88859c;
        ar arVar = new ar();
        if (effect == null || (str = effect.getEffectId()) == null) {
            str = str3;
        }
        ar a2 = arVar.a("effect_id", str);
        if (effect == null || (str2 = effect.getName()) == null) {
            str2 = str3;
        }
        ar a3 = a2.a("effect_name", str2);
        if (effect != null) {
            i2 = effect.getEffectType();
        } else {
            i2 = -1;
        }
        ar a4 = a3.a("effect_type", Integer.valueOf(i2));
        f G = g.a().G();
        if (effect != null) {
            urlModel = effect.getFileUrl();
        } else {
            urlModel = null;
        }
        String b2 = G.b(urlModel);
        if (b2 != null) {
            str3 = b2;
        }
        I.a(str4, 1, a4.a("url", str3).a("exception", Log.getStackTraceString(exceptionResult.getException())).a("errorCode", Integer.valueOf(exceptionResult.getErrorCode())).a("errorMsg", exceptionResult.getMsg()).a());
        IFetchEffectListener iFetchEffectListener = this.f88860d;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onFail(effect, exceptionResult);
        }
    }

    public /* synthetic */ b(String str, IFetchEffectListener iFetchEffectListener, byte b2) {
        this(str, iFetchEffectListener);
    }
}
