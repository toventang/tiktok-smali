package com.toutiao.proxyserver.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ae;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.d;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.i;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import java.util.Map;

public interface INetApi {
    static {
        Covode.recordClassIndex(103166);
    }

    @h
    @ae
    b<TypedInput> get(@ag String str, @aa Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj);

    @i
    b<Void> head(@ag String str, @aa Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj);
}
