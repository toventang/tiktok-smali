package com.ss.android.ugc.aweme.teens;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;

public interface TeensApi {
    static {
        Covode.recordClassIndex(90712);
    }

    @h(a = "/aweme/v1/teen/protector/vote/")
    t<Object> sendTeensGuardian(@z(a = "vote_id") String str, @z(a = "option_id") int i2, @z(a = "vote_option") int i3);
}
