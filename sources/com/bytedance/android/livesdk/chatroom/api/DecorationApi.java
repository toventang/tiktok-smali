package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.m;
import com.bytedance.android.livesdk.chatroom.model.o;
import com.bytedance.android.livesdkapi.depend.model.live.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import java.util.HashMap;
import java.util.Map;

public interface DecorationApi {
    static {
        Covode.recordClassIndex(8267);
    }

    @t(a = "/webcast/room/token_create/")
    @g
    f.a.t<d<c>> createDonateToken(@f Map<String, Object> map);

    @h(a = "/webcast/room/stickers/")
    f.a.t<d<o>> fetchStickerList();

    @h(a = "/webcast/ranklist/donation/")
    f.a.t<d<m>> getRoomDonationInfo(@aa Map<String, Object> map);

    @t(a = "/webcast/room/decoration/set/")
    @g
    f.a.t<d<Object>> setDecoration(@e(a = "room_id") long j2, @e(a = "type") int i2, @f HashMap<String, String> hashMap);
}
