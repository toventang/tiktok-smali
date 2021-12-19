package com.bytedance.ttnet;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.a;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ae;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.d;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.o;
import com.bytedance.retrofit2.b.q;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.w;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

public interface INetworkApi {
    static {
        Covode.recordClassIndex(27214);
    }

    @h
    b<String> doGet(@a boolean z, @o int i2, @ag String str, @aa(a = true) Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj);

    @t
    @g
    b<String> doPost(@o int i2, @ag String str, @aa Map<String, String> map, @f(a = true) Map<String, String> map2, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj);

    @h
    @ae
    b<TypedInput> downloadFile(@a boolean z, @o int i2, @ag String str, @aa(a = true) Map<String, String> map);

    @h
    @ae
    b<TypedInput> downloadFile(@a boolean z, @o int i2, @ag String str, @aa(a = true) Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj);

    @t
    b<String> postBody(@o int i2, @ag String str, @aa(a = true) Map<String, String> map, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @l List<com.bytedance.retrofit2.client.b> list);

    @t
    @q
    b<String> postMultiPart(@o int i2, @ag String str, @aa(a = true) Map<String, String> map, @w Map<String, TypedOutput> map2, @l List<com.bytedance.retrofit2.client.b> list);
}
