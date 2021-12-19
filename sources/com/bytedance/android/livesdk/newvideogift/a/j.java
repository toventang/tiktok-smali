package com.bytedance.android.livesdk.newvideogift.a;

import com.bytedance.android.live.core.d.c;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class j {
    static {
        Covode.recordClassIndex(11788);
    }

    public enum a {
        receive_message,
        consume_message,
        load_resource_success,
        consume_effect_message,
        playcontroller_receive,
        playcontroller_start,
        playcontroller_end;

        static {
            Covode.recordClassIndex(11789);
        }
    }

    public static void a(a aVar, long j2, long j3, long j4) {
        int i2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("event", aVar.name());
            e.a();
            if (e.b()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("player_state", i2);
            jSONObject.put("message_id", j2);
            jSONObject.put("gift_id", j3);
            jSONObject.put("effect_id", j4);
            c.a("ttlive_video_gift_show_link_all", 0, jSONObject);
        } catch (Exception unused) {
        }
    }
}
