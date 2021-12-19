package com.bytedance.android.livesdk.rank.impl.d;

import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f20659a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(12216);
    }

    public static final void a(long j2, long j3, long j4, int i2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", j2);
        jSONObject.put("user_id", j3);
        jSONObject.put("anchor_id", j4);
        jSONObject.put("room_auth_hourly_rank_state", i2);
        com.bytedance.android.live.core.c.a.a(3, "ttlive_hourly_rank_entrance", jSONObject.toString());
    }

    public static final void a(int i2, long j2, long j3, long j4, String str, String str2, String str3) {
        String str4;
        if (i2 == j.HOURLY_RANK.getType()) {
            str4 = j.HOURLY_RANK.getRankName();
        } else if (i2 == j.WEEKLY_RANK.getType()) {
            str4 = j.WEEKLY_RANK.getRankName();
        } else {
            str4 = "unknown";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rank_name", str4);
        jSONObject.put("room_id", j2);
        jSONObject.put("user_id", j3);
        jSONObject.put("anchor_id", j4);
        jSONObject.put("rank_entrance_current_state", str);
        jSONObject.put("message_id", str2);
        jSONObject.put("rank_entrance_hide_reason", str3);
        com.bytedance.android.live.core.c.a.a(3, "ttlive_rank_entrance", jSONObject.toString());
    }
}
