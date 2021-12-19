package com.ss.android.ugc.aweme.commercialize.depend;

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
import com.bytedance.retrofit2.b.i;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.o;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

public interface IBaseRuntimeTTNetApi {
    static {
        Covode.recordClassIndex(45403);
    }

    @h
    b<TypedInput> doGetForStream(@a boolean z, @o int i2, @ag String str, @aa(a = true) Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj);

    @h
    b<String> doGetForString(@a boolean z, @o int i2, @ag String str, @aa(a = true) Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj);

    @ae
    @i
    b<String> doHead(@a boolean z, @o int i2, @ag String str, @aa(a = true) Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj);

    @t
    b<TypedInput> doPostForStream(@a boolean z, @o int i2, @ag String str, @aa Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @d Object obj);

    @t
    @g
    b<TypedInput> doPostForStream(@a boolean z, @o int i2, @ag String str, @aa Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @f(a = true) Map<String, String> map2, @d Object obj);

    @t
    b<String> doPostForString(@a boolean z, @o int i2, @ag String str, @aa Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @d Object obj);

    @t
    @g
    b<String> doPostForString(@a boolean z, @o int i2, @ag String str, @aa Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @f(a = true) Map<String, String> map2, @d Object obj);

    @h
    @ae
    b<TypedInput> downloadFile(@a boolean z, @o int i2, @ag String str, @aa(a = true) Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj);
}
