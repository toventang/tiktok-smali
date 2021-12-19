package com.bytedance.android.livesdk.client;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.m;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.u;
import f.a.t;
import java.util.Map;

public interface IMessageApi {
    static {
        Covode.recordClassIndex(9256);
    }

    @h
    t<u<TypedInput>> doGetAsync(@ag String str, @m Map<String, String> map, @aa Map<String, String> map2);

    @com.bytedance.retrofit2.b.t
    @g
    b<TypedInput> doPost(@ag String str, @m Map<String, String> map, @aa Map<String, String> map2, @f Map<String, String> map3);

    @com.bytedance.retrofit2.b.t
    t<u<TypedInput>> doPostAsync(@ag String str, @m Map<String, String> map, @aa Map<String, String> map2, @com.bytedance.retrofit2.b.b TypedOutput typedOutput);
}
