package com.bytedance.android.live.broadcast.d;

import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.broadcast.api.c.d;
import com.bytedance.android.live.broadcast.api.d.c;
import com.bytedance.android.livesdk.j.du;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;

public final class b {
    static {
        Covode.recordClassIndex(3878);
    }

    public static final void b(int i2, long j2, long j3, boolean z) {
        a(i2, 0, 0, "", j2, j3, z);
    }

    public static final void a(int i2, long j2, long j3, boolean z) {
        if (i2 == 30001) {
            a(10005, 30001, 0, "", j2, j3, z);
        } else if (i2 == 50002) {
            a(10006, 50002, 0, "", j2, j3, z);
        } else {
            a(10007, i2, 0, "", j2, j3, z);
        }
    }

    public static final void a(int i2, int i3, String str, long j2, long j3, boolean z) {
        l.d(str, "");
        a(i2, 0, i3, str, j2, j3, z);
    }

    private static final void a(int i2, int i3, int i4, String str, long j2, long j3, boolean z) {
        if (TextUtils.isEmpty(str)) {
            str = c.b(i2);
        }
        DataChannelGlobal.f34575d.a(du.class, Integer.valueOf(i2));
        d.b(c.a.b("ttlive_video_stream_end_all").b("error_code", Integer.valueOf(i2)).b("error_msg", str).b("isFirstPushStream", Boolean.valueOf(z)).b("api_error_code", Integer.valueOf(i3)).b("liveCore_error_code", Integer.valueOf(i4)).b("user_id", Long.valueOf(j2)).b("room_id", Long.valueOf(j3))).a();
    }
}
