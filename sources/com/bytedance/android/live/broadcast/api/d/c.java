package com.bytedance.android.live.broadcast.api.d;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.a.n;
import h.v;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Integer> f7534a = n.b(0, 4);

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Integer, String> f7535b = ag.a(v.a(0, "normal"), v.a(1, "status_exception"), v.a(2, "video_capture_fail"), v.a(3, "audio_capture_fail"), v.a(4, "retry_max_times"), v.a(5, "video_encoder_fail"), v.a(6, "audio_encoder_fail"), v.a(7, "adm_recoder_fail"), v.a(8, "adm_play_fail"), v.a(10001, "click"), v.a(10002, "kick_out"), v.a(10003, "banned"), v.a(10004, "force_or_illegal"), v.a(10005, "room_not_exist"), v.a(10006, "user_not_in_room"), v.a(10007, "room_live_finish"), v.a(10008, "background_time_out"), v.a(10009, "back_main"));

    public static final boolean a(int i2) {
        return i2 > 0 && 8 >= i2;
    }

    static {
        Covode.recordClassIndex(3712);
    }

    public static final String b(int i2) {
        String str = f7535b.get(Integer.valueOf(i2));
        if (str == null) {
            return "unknown";
        }
        return str;
    }
}
