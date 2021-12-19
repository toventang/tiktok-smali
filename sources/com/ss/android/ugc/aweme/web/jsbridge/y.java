package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.h;
import com.kakao.usermgmt.StringSet;
import com.ss.android.sdk.webview.a.g;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class y extends g {
    static {
        Covode.recordClassIndex(94849);
    }

    public y(WeakReference<Context> weakReference) {
        super(weakReference);
    }

    @Override // com.ss.android.sdk.webview.a.g, com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        hVar.f35532c = "open";
        hVar.f35533d.put(StringSet.type, "publishVideo");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("video_id", hVar.f35533d.optString("review_video_id"));
        jSONObject2.put("video_url", hVar.f35533d.optString("video_url"));
        jSONObject2.put("music_id", hVar.f35533d.optString("music_id"));
        jSONObject2.put("challenge_id", hVar.f35533d.optString("challenge_id"));
        jSONObject2.put("need_duet", hVar.f35533d.optBoolean("need_duet", false));
        jSONObject2.put("widget_id", hVar.f35533d.optString("widget_id"));
        jSONObject2.put("cover_url", hVar.f35533d.optString("cover_url"));
        hVar.f35533d.put("args", jSONObject2);
        a(hVar.f35533d);
    }
}
