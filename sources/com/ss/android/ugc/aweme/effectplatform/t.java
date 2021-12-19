package com.ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.port.in.ap;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONException;
import org.json.JSONObject;

public final class t implements IEffectDownloadProgressListener {

    /* renamed from: a  reason: collision with root package name */
    private final IFetchEffectListener f89083a;

    /* renamed from: b  reason: collision with root package name */
    private long f89084b;

    /* renamed from: c  reason: collision with root package name */
    private long f89085c;

    static {
        Covode.recordClassIndex(56020);
    }

    private static boolean b() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean a2 = a();
        j.f107226e = a2;
        return a2;
    }

    private static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private t(IFetchEffectListener iFetchEffectListener) {
        this.f89083a = iFetchEffectListener;
    }

    private static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject2;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.f89084b = System.currentTimeMillis();
        this.f89085c = 0;
        IFetchEffectListener iFetchEffectListener = this.f89083a;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onStart(effect);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ce  */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onSuccess(com.ss.android.ugc.effectmanager.effect.model.Effect r16) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effectplatform.t.onSuccess(java.lang.Object):void");
    }

    public static t a(IFetchEffectListener iFetchEffectListener, String str) {
        return new t(new n(str, iFetchEffectListener));
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        Object obj;
        String effectId;
        if (b()) {
            StringBuilder append = new StringBuilder().append(exceptionResult.getMsg());
            String str = "";
            if (exceptionResult.getErrorCode() == -1) {
                obj = exceptionResult.getException().getStackTrace();
            } else {
                obj = str;
            }
            String sb = append.append(obj).toString();
            ap I = g.a().I();
            ar arVar = new ar();
            if (effect == null) {
                effectId = str;
            } else {
                effectId = effect.getEffectId();
            }
            ar a2 = arVar.a("sticker_id", effectId).a("errorCode", String.valueOf(exceptionResult.getErrorCode())).a("errorMsg", sb).a("zip_model", (Integer) 0);
            if (effect != null) {
                str = g.a().G().b(effect.getFileUrl());
            }
            I.a("sticker_download_error_rate", 1, a2.a("url", str).a());
            JSONObject a3 = new ar().a("error_code", Integer.valueOf(exceptionResult.getErrorCode())).a("error_msg", sb).a();
            g.a().I().a("ttlive_download_sticker_all", 1, null, a(a3));
            g.a().I().a("ttlive_download_sticker_error", 1, a3);
        }
        b.a(effect, this.f89085c, System.currentTimeMillis() - this.f89084b, -1, exceptionResult);
        IFetchEffectListener iFetchEffectListener = this.f89083a;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onFail(effect, exceptionResult);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i2, long j2) {
        if (this.f89085c == 0) {
            this.f89085c = j2;
            b.a(effect, j2);
        }
        IFetchEffectListener iFetchEffectListener = this.f89083a;
        if (iFetchEffectListener instanceof IEffectDownloadProgressListener) {
            ((IEffectDownloadProgressListener) iFetchEffectListener).onProgress(effect, i2, j2);
        }
    }
}
