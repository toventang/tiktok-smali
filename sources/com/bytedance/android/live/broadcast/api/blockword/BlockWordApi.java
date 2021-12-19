package com.bytedance.android.live.broadcast.api.blockword;

import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordGetExtra;
import com.bytedance.android.live.broadcast.api.blockword.model.b;
import com.bytedance.android.live.broadcast.api.blockword.model.c;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface BlockWordApi {
    static {
        Covode.recordClassIndex(3674);
    }

    @h(a = "/webcast/room/add_sensitive_word/")
    t<d<b>> addBlockWord(@z(a = "word") String str, @z(a = "sec_anchor_id") String str2, @z(a = "room_id") long j2);

    @h(a = "/webcast/room/del_sensitive_word/")
    t<d<Object>> deleteBlockWord(@z(a = "word_id") int i2, @z(a = "sec_anchor_id") String str, @z(a = "room_id") long j2);

    @h(a = "/webcast/room/get_sensitive_word/")
    t<com.bytedance.android.live.network.response.b<c, BlockWordGetExtra>> getBlockWord(@z(a = "sec_anchor_id") String str, @z(a = "room_id") long j2);
}
