package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.web.a.h;
import com.kakao.usermgmt.StringSet;
import com.ss.android.sdk.webview.a.g;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class aa extends g {

    /* renamed from: b  reason: collision with root package name */
    private a f145015b;

    static {
        Covode.recordClassIndex(94815);
    }

    public aa(WeakReference<Context> weakReference, a aVar) {
        super(weakReference);
        this.f145015b = aVar;
    }

    @Override // com.ss.android.sdk.webview.a.g, com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        String string = hVar.f35533d.getString(StringSet.type);
        if (!TextUtils.equals("goods_order_share", string)) {
            hVar.f35532c = "open";
            hVar.f35533d.put(StringSet.type, "openRecord");
            if (hVar.f35533d.has("args")) {
                JSONObject jSONObject2 = hVar.f35533d.getJSONObject("args");
                jSONObject2.put("recordOrigin", "jsBridge");
                if ("challenge".equals(string)) {
                    jSONObject2.put("id", jSONObject2.get("challenge_id"));
                    jSONObject2.put("recordParam", "challenge");
                } else if ("music".equals(string)) {
                    jSONObject2.put("id", jSONObject2.get("music_id"));
                    jSONObject2.put("recordParam", "music");
                } else if ("effect".equals(string)) {
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
                } else if ("donation".equals(string)) {
                    jSONObject2.put("id", jSONObject2.get("charity_id"));
                    jSONObject2.put("recordParam", "donation");
                } else if ("tcm".equals(string)) {
                    jSONObject2.put("recordParam", "tcm");
                    jSONObject2.put("star_atlas_object", hVar.f35533d.getJSONObject("args").toString());
                }
                jSONObject2.put("group", "1");
            }
            a(hVar.f35533d);
        }
    }
}
