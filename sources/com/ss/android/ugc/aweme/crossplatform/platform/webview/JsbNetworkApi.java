package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.a;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.d;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.o;
import com.bytedance.retrofit2.b.t;
import java.util.List;
import java.util.Map;

public interface JsbNetworkApi {
    static {
        Covode.recordClassIndex(48922);
    }

    @t
    @g
    b<String> doPost(@o int i2, @ag String str, @aa Map<String, String> map, @f(a = true) Map<String, String> map2, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj, @a boolean z);
}
