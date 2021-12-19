package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.base.model.user.c;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.b;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedOutput;
import f.a.ab;

public interface UploadApi {
    static {
        Covode.recordClassIndex(8283);
    }

    @t(a = "/webcast/certification/submit_cert_data/")
    ab<d<c>> upload(@b TypedOutput typedOutput);

    @t(a = "/webcast/certification/submit_cert_data/")
    f.a.t<d<c>> upload2(@b TypedOutput typedOutput);
}
