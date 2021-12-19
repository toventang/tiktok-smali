package com.ss.android.ugc.aweme.fe.method;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.a;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.d;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.o;
import com.bytedance.retrofit2.b.t;
import java.util.List;
import java.util.Map;

interface SendAnalyticsEventApi {
    static {
        Covode.recordClassIndex(57368);
    }

    @t
    b<String> doPost(@a boolean z, @o int i2, @ag String str, @aa Map<String, String> map, @com.bytedance.retrofit2.b.b com.google.gson.o oVar, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj);
}
