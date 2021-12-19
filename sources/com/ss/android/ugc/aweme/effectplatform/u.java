package com.ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.effectplatform.o;
import com.ss.android.ugc.aweme.port.in.ap;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import h.f.b.l;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class u implements IFetchPanelInfoListener {

    /* renamed from: d  reason: collision with root package name */
    public static final a f89086d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Map<String, ? extends Object> f89087a;

    /* renamed from: b  reason: collision with root package name */
    public final String f89088b;

    /* renamed from: c  reason: collision with root package name */
    public final IFetchPanelInfoListener f89089c;

    /* renamed from: e  reason: collision with root package name */
    private final o f89090e;

    static {
        Covode.recordClassIndex(56021);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(56022);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static u a(String str, IFetchPanelInfoListener iFetchPanelInfoListener) {
            l.d(str, "");
            l.d(iFetchPanelInfoListener, "");
            return new u(str, o.a.a(str, iFetchPanelInfoListener), (byte) 0);
        }
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

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
    public final void onFail(ExceptionResult exceptionResult) {
        int errorCode;
        String msg;
        Object obj;
        int i2;
        if (exceptionResult == null) {
            errorCode = -2;
            msg = "unknown error";
        } else {
            errorCode = exceptionResult.getErrorCode();
            msg = exceptionResult.getMsg();
            l.b(msg, "");
        }
        ap I = g.a().I();
        ar a2 = new ar().a("errorCode", Integer.valueOf(errorCode)).a("errorDesc", msg).a("panel", this.f89088b);
        Map<String, ? extends Object> map = this.f89087a;
        if (map != null) {
            obj = map.get("is_story");
        } else {
            obj = null;
        }
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        I.a("sticker_list_error_rate", 1, a2.a("is_story", Integer.valueOf(i2)).a());
        JSONObject a3 = new ar().a("error_code", Integer.valueOf(errorCode)).a("error_msg", msg).a("panel_type", this.f89088b).a();
        g.a().I().a("ttlive_load_sticker_list_all", 1, null, a(a3));
        g.a().I().a("ttlive_load_sticker_list_error", 1, a3);
        IFetchPanelInfoListener iFetchPanelInfoListener = this.f89089c;
        if (iFetchPanelInfoListener != null) {
            iFetchPanelInfoListener.onFail(exceptionResult);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(PanelInfoModel panelInfoModel) {
        Object obj;
        int i2;
        long a2 = this.f89090e.a(TimeUnit.MILLISECONDS);
        IFetchPanelInfoListener iFetchPanelInfoListener = this.f89089c;
        if (iFetchPanelInfoListener != null) {
            iFetchPanelInfoListener.onSuccess(panelInfoModel);
        }
        ar a3 = new ar().a("duration", Long.valueOf(a2)).a("abParam", (Integer) 2).a("panel", this.f89088b);
        Map<String, ? extends Object> map = this.f89087a;
        Integer num = null;
        if (map != null) {
            obj = map.get("is_story");
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            num = obj;
        }
        Integer num2 = num;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        JSONObject a4 = a3.a("is_story", Integer.valueOf(i2)).a();
        g.a().I().a("sticker_list_error_rate", 0, a4);
        g.a().I().a("ttlive_load_sticker_list_all", 0, a4, a(new ar().a("panel_type", this.f89088b).a()));
    }

    private u(String str, IFetchPanelInfoListener iFetchPanelInfoListener) {
        this.f89088b = str;
        this.f89089c = iFetchPanelInfoListener;
        com.google.c.a.o a2 = com.google.c.a.o.a();
        l.b(a2, "");
        this.f89090e = a2;
    }

    public /* synthetic */ u(String str, IFetchPanelInfoListener iFetchPanelInfoListener, byte b2) {
        this(str, iFetchPanelInfoListener);
    }
}
