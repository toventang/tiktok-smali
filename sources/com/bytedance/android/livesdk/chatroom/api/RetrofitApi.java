package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import java.util.HashMap;

public interface RetrofitApi {
    static {
        Covode.recordClassIndex(8280);
    }

    @t(a = "/webcast/room/share/")
    @g
    f.a.t<d<ShareReportResult>> sendShare(@e(a = "room_id") long j2, @f HashMap<String, String> hashMap);
}
