package com.bytedance.android.livesdk.aj;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class h {
    static {
        Covode.recordClassIndex(7695);
    }

    public static void a(String str, long j2, long j3, long j4, long j5, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", str);
        hashMap.put("error_code", String.valueOf(j2));
        hashMap.put("detail_error_code", String.valueOf(j3));
        if (j2 == 208) {
            hashMap.put("pull_stream_time", String.valueOf(j4));
            hashMap.put("start_room_time", String.valueOf(j5));
            hashMap.put("player_error", str2);
        }
        b.a.a("livesdk_live_play_fail").a((Map<String, String>) hashMap).a().b();
    }
}
