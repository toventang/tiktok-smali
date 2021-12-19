package com.bytedance.android.livesdk.aj;

import android.os.Build;
import com.bytedance.android.live.core.d.a;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class s {
    static {
        Covode.recordClassIndex(7715);
    }

    public static void a(JSONObject jSONObject, String str, String str2, String str3, String str4, String str5) {
        a.a(jSONObject, "device_name", Build.MODEL);
        a.a(jSONObject, "last_cdn_play_url", str);
        a.a(jSONObject, "url", str2);
        a.a(jSONObject, "pull_stream_data", str3);
        a.a(jSONObject, "default_resolution", str4);
        a.a(jSONObject, "sdk_params", str5);
        a.a(jSONObject, "uid", u.a().b().c());
        c.b("ttlive_audience_enter_room_stream_switch", 0, jSONObject);
    }
}
