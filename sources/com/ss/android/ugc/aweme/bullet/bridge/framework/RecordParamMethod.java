package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.kakao.usermgmt.StringSet;
import com.ss.android.common.util.g;
import com.ss.android.sdk.webview.di.IMainServiceForJsb;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import h.m.p;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONObject;

public final class RecordParamMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69136b = new a((byte) 0);

    static {
        Covode.recordClassIndex(42634);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return "openRecord";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42635);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecordParamMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    private static Activity a(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private final void a(JSONObject jSONObject, g gVar) {
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    gVar.a(next, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    gVar.a(next, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    gVar.a(next, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    gVar.a(next, (String) obj);
                } else if (obj instanceof Boolean) {
                    gVar.a(next, obj.toString());
                } else if (obj instanceof JSONObject) {
                    a((JSONObject) obj, gVar);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        Activity activity;
        l.d(jSONObject, "");
        l.d(aVar, "");
        String string = jSONObject.getString(StringSet.type);
        l.b(string, "");
        if (TextUtils.equals("goods_order_share", string)) {
            new WeakReference(e());
            return;
        }
        new JSONObject();
        jSONObject.put(StringSet.type, "openRecord");
        if (jSONObject.has("args")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            l.b(jSONObject2, "");
            jSONObject2.put("recordOrigin", "jsBridge");
            if (l.a((Object) "challenge", (Object) string)) {
                jSONObject2.put("id", jSONObject2.get("challenge_id"));
                jSONObject2.put("recordParam", "challenge");
            } else if (l.a((Object) "music", (Object) string)) {
                jSONObject2.put("id", jSONObject2.get("music_id"));
                jSONObject2.put("recordParam", "music");
            } else if (l.a((Object) "effect", (Object) string)) {
                if (jSONObject2.has("effect_id")) {
                    jSONObject2.put("id", jSONObject2.get("effect_id"));
                }
                jSONObject2.put("recordParam", "sticker");
                if (jSONObject2.has("effect_meta_info")) {
                    jSONObject2.put("effect_meta_info", jSONObject2.getJSONObject("effect_meta_info").toString());
                }
                if (jSONObject2.has("effect_image")) {
                    jSONObject2.put("effect_image", jSONObject2.getJSONObject("effect_image").toString());
                }
            } else if (l.a((Object) "donation", (Object) string)) {
                jSONObject2.put("id", jSONObject2.get("charity_id"));
                jSONObject2.put("recordParam", "donation");
            } else if (l.a((Object) "star_atlas", (Object) string)) {
                jSONObject2.put("id", jSONObject2.get("star_atlas_id"));
                jSONObject2.put("recordParam", "star_atlas");
                jSONObject2.put("star_atlas_object", jSONObject.getJSONObject("args").toString());
            } else if (l.a((Object) "tcm", (Object) string)) {
                jSONObject2.put("recordParam", "tcm");
                jSONObject2.put("star_atlas_object", jSONObject.getJSONObject("args").toString());
            }
            jSONObject2.put("group", "1");
        }
        try {
            Context e2 = e();
            if ((((e2 instanceof Activity) && (activity = (Activity) e2) != null) || (activity = a(e2)) != null) && com.ss.android.ugc.aweme.activity.a.a(activity, true)) {
                String optString = jSONObject.optString(StringSet.type);
                if (!com.bytedance.common.utility.m.a(optString)) {
                    l.b(optString, "");
                    if (p.a((CharSequence) optString, ':', 0, false, 6) < 0) {
                        StringBuilder sb = new StringBuilder();
                        IMainServiceForJsb iMainServiceForJsb = com.ss.android.sdk.webview.di.a.a().f60182a;
                        l.b(iMainServiceForJsb, "");
                        g gVar = new g(sb.append(iMainServiceForJsb.getSSLocalScheme()).append("://").append(optString).toString());
                        a(jSONObject.optJSONObject("args"), gVar);
                        com.ss.android.sdk.webview.di.a.a().f60182a.startAdsAppActivity(activity, gVar.a());
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
