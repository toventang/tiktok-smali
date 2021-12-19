package com.bytedance.android.livesdk;

import com.bytedance.android.e.a.a.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.x;
import com.bytedance.retrofit2.b.z;
import java.util.Map;

public interface MessageApi {
    static {
        Covode.recordClassIndex(7377);
    }

    @t(a = "/webcast/im/fetch/")
    @g
    b<d.b> fetchMessagePbByteArraySource(@e(a = "room_id") long j2, @z(a = "keep_method") String str, @f Map<String, String> map, @e(a = "fetch_rule") int i2, @com.bytedance.retrofit2.b.d Object obj);

    @t(a = "/webcast/room/{room_id}/_fetch_message_polling/")
    @g
    b<d.b> fetchMessagePbByteArraySource(@x(a = "room_id") long j2, @z(a = "keep_method") String str, @f Map<String, String> map, @com.bytedance.retrofit2.b.d Object obj);
}
