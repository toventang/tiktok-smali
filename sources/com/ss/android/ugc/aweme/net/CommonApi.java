package com.ss.android.ugc.aweme.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.c;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.o;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.u;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

public interface CommonApi {
    static {
        Covode.recordClassIndex(72110);
    }

    @c
    b<String> doDelete(@ag String str);

    @c
    b<String> doDelete(@ag String str, @o int i2, @l List<com.bytedance.retrofit2.client.b> list);

    @c
    b<String> doDelete(@ag String str, @l List<com.bytedance.retrofit2.client.b> list);

    @c
    b<String> doDelete(@ag String str, @aa Map<String, String> map);

    @h
    b<String> doGet(@ag String str);

    @h
    b<String> doGet(@ag String str, @o int i2);

    @h
    b<String> doGet(@ag String str, @o int i2, @aa Map<String, String> map);

    @h
    b<String> doGet(@ag String str, @aa Map<String, String> map);

    @h
    b<String> doGet(@ag String str, @aa Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list);

    @t
    @g
    b<String> doPost(@ag String str, @o int i2, @f Map<String, String> map);

    @t
    @g
    b<String> doPost(@ag String str, @o int i2, @f Map<String, String> map, @aa Map<String, String> map2);

    @t
    @g
    b<String> doPost(@ag String str, @f Map<String, String> map);

    @t
    @g
    b<String> doPost(@ag String str, @f Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list);

    @t
    b<String> postBody(@ag String str, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @l List<com.bytedance.retrofit2.client.b> list);

    @u
    b<String> putBody(@ag String str, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @l List<com.bytedance.retrofit2.client.b> list);
}
