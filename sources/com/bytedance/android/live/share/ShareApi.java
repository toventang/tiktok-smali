package com.bytedance.android.live.share;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.share.response.BatchShareUsersResult;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;
import java.util.HashMap;

public interface ShareApi {
    static {
        Covode.recordClassIndex(7023);
    }

    @h(a = "/webcast/interaction/share/list/")
    t<d<BatchShareUsersResult>> getBatchShareUsers(@z(a = "room_id") long j2);

    @com.bytedance.retrofit2.b.t(a = "/webcast/room/share/")
    @g
    t<d<ShareReportResult>> sendShare(@e(a = "room_id") long j2, @f HashMap<String, String> hashMap);

    @com.bytedance.retrofit2.b.t(a = "/webcast/interaction/share/submit/")
    @g
    t<d<Void>> submitShare(@e(a = "room_id") long j2, @e(a = "to_user_ids") String str);
}
