package com.ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class s implements IFetchEffectChannelListener {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f89079a;

    /* renamed from: b  reason: collision with root package name */
    private IFetchEffectChannelListener f89080b;

    /* renamed from: c  reason: collision with root package name */
    private o f89081c = o.a();

    /* renamed from: d  reason: collision with root package name */
    private String f89082d;

    static {
        Covode.recordClassIndex(56019);
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

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        int errorCode;
        String msg;
        if (exceptionResult == null) {
            errorCode = -2;
            msg = "unknow error";
        } else {
            errorCode = exceptionResult.getErrorCode();
            msg = exceptionResult.getMsg();
        }
        int i2 = 0;
        Map<String, Object> map = this.f89079a;
        if (map != null && map.containsKey("is_story")) {
            i2 = ((Integer) this.f89079a.get("is_story")).intValue();
        }
        g.a().I().a("sticker_list_error_rate", 1, new ar().a("errorCode", Integer.valueOf(errorCode)).a("errorDesc", msg).a("panel", this.f89082d).a("is_story", Integer.valueOf(i2)).a());
        JSONObject a2 = new ar().a("error_code", Integer.valueOf(errorCode)).a("error_msg", msg).a("panel_type", this.f89082d).a();
        g.a().I().a("ttlive_load_sticker_list_all", 1, null, a(a2));
        g.a().I().a("ttlive_load_sticker_list_error", 1, a2);
        IFetchEffectChannelListener iFetchEffectChannelListener = this.f89080b;
        if (iFetchEffectChannelListener != null) {
            iFetchEffectChannelListener.onFail(exceptionResult);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
        int i2;
        long a2 = this.f89081c.a(TimeUnit.MILLISECONDS);
        Map<String, Object> map = this.f89079a;
        if (map == null || !map.containsKey("is_story")) {
            i2 = 0;
        } else {
            i2 = ((Integer) this.f89079a.get("is_story")).intValue();
        }
        JSONObject a3 = new ar().a("duration", Long.valueOf(a2)).a("is_story", Integer.valueOf(i2)).a("panel", this.f89082d).a();
        Map<String, Object> map2 = this.f89079a;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                try {
                    a3.put(str, this.f89079a.get(str).toString());
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        g.a().I().a("sticker_list_error_rate", 0, a3);
        g.a().I().a("ttlive_load_sticker_list_all", 0, a3, a(new ar().a("panel_type", this.f89082d).a()));
        IFetchEffectChannelListener iFetchEffectChannelListener = this.f89080b;
        if (iFetchEffectChannelListener != null) {
            iFetchEffectChannelListener.onSuccess(effectChannelResponse);
        }
    }

    private s(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        this.f89080b = iFetchEffectChannelListener;
        this.f89082d = str;
    }

    public static s a(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        return new s(str, new j(str, iFetchEffectChannelListener));
    }
}
