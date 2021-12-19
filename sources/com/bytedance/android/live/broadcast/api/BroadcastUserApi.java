package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.base.model.user.a;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.b;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedOutput;
import f.a.ab;

public interface BroadcastUserApi {
    static {
        Covode.recordClassIndex(3659);
    }

    @t(a = "/webcast/room/upload/image/")
    ab<d<a>> uploadAvatar(@b TypedOutput typedOutput);
}
