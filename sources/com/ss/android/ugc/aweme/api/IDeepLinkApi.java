package com.ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.d;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.bytedance.retrofit2.mime.TypedInput;
import f.a.t;

public interface IDeepLinkApi {
    static {
        Covode.recordClassIndex(40833);
    }

    @h
    b<TypedInput> fetchLongUrl(@ag String str, @d Object obj);

    @h(a = "/tiktok/linker/target/get/v1/")
    t<e> transUrl(@z(a = "url") String str);
}
