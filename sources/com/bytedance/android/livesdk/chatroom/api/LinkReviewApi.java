package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.ab;

public interface LinkReviewApi {
    static {
        Covode.recordClassIndex(8276);
    }

    @h(a = "/webcast/review/get_latest_ban_record/")
    ab<d<g>> bannedInfo(@z(a = "ban_type") int i2);
}
