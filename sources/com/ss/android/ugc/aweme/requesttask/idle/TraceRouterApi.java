package com.ss.android.ugc.aweme.requesttask.idle;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.a;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.m;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

public interface TraceRouterApi {
    static {
        Covode.recordClassIndex(78627);
    }

    @t
    b<String> doPost(@ag String str, @aa Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @f Map<String, String> map2, @a boolean z);

    @t
    b<String> doRegionPost(@ag String str, @aa Map<String, String> map, @m Map<String, String> map2, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @a boolean z);
}
