package com.bytedance.bdturing.ttnet;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.a;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ae;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

public interface INetworkApi {
    static {
        Covode.recordClassIndex(15591);
    }

    @h
    b<TypedInput> doGet(@a boolean z, @ag String str, @aa Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list);

    @t
    @ae
    b<TypedInput> doPost(@ag String str, @aa Map<String, String> map, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @l List<com.bytedance.retrofit2.client.b> list);
}
