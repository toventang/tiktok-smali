package com.ss.android.ugc.aweme.feed.k;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.background.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.feed.x.ah;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(59260);
    }

    public static void a(String str, String str2, String str3, JSONObject jSONObject, Aweme aweme) {
        i.b(new b(jSONObject, aweme, s.b(), s.f93858b.name(), str, str2, str3), r.a());
    }

    static final /* synthetic */ Object a(JSONObject jSONObject, Aweme aweme, String str, String str2, String str3, String str4, String str5) {
        JSONObject jSONObject2;
        int i2;
        if (jSONObject == null) {
            try {
                jSONObject2 = new JSONObject();
            } catch (JSONException unused) {
                return null;
            }
        } else {
            jSONObject2 = jSONObject;
        }
        jSONObject2.put("has_tts", ah.i(aweme));
        jSONObject2.put("has_cla", ah.h(aweme));
        jSONObject2.put("top_activity", str);
        jSONObject2.put("feed_tab", str2);
        jSONObject2.put("err_code", str3);
        jSONObject2.put("err_msg", str4);
        if (c.a()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        jSONObject2.put("is_audio_mode", String.valueOf(i2));
        r.onEvent(MobClick.obtain().setEventName("video_play_failed").setValue(str5).setJsonObject(jSONObject));
        return null;
    }
}
