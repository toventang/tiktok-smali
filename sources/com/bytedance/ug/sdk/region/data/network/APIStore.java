package com.bytedance.ug.sdk.region.data.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.a;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.t;
import java.util.List;
import java.util.Map;
import okhttp3.RequestBody;

public interface APIStore {
    static {
        Covode.recordClassIndex(27905);
    }

    @t
    b<String> doPost(@ag String str, @aa Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @com.bytedance.retrofit2.b.b RequestBody requestBody, @a boolean z);
}
