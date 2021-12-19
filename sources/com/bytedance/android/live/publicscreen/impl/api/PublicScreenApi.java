package com.bytedance.android.live.publicscreen.impl.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.publicscreen.impl.api.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;

public interface PublicScreenApi {
    static {
        Covode.recordClassIndex(6727);
    }

    @t(a = "/webcast/room/comment_translate/")
    @g
    f.a.t<d<a>> translateComment(@e(a = "comment_content") String str, @e(a = "anchor_id") long j2);
}
