package com.bytedance.android.livesdk.live.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import java.util.Map;

public interface LIveTaskApi {
    static {
        Covode.recordClassIndex(10447);
    }

    @t
    @g
    f.a.t<d<com.bytedance.android.live.base.model.live.d>> report(@ag String str, @f Map<String, String> map);
}
