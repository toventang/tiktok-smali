package com.ss.android.ugc.aweme.account.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.o;
import com.bytedance.retrofit2.b.t;
import java.util.List;
import java.util.Map;

public interface IAccountNetworkApi {
    static {
        Covode.recordClassIndex(40082);
    }

    @h
    b<String> getResponse(@ag String str, @o int i2, @l List<com.bytedance.retrofit2.client.b> list);

    @t
    @g
    b<String> getResponse(@ag String str, @f Map<String, String> map, @o int i2, @l List<com.bytedance.retrofit2.client.b> list);
}
