package com.ss.android.ugc.aweme.miniapp.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.d.a.a.a.a.a;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ae;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.d;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.i;
import com.bytedance.retrofit2.b.j;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.o;
import com.bytedance.retrofit2.b.r;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.u;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

public interface IAppbrandNetworkApi {
    static {
        Covode.recordClassIndex(70188);
    }

    @j(a = a.f28514d, c = true)
    @ae
    b<TypedInput> delete(@o int i2, @ag String str, @aa(a = true) Map<String, String> map, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj, @com.bytedance.retrofit2.b.a boolean z);

    @h
    @ae
    b<TypedInput> getRaw(@com.bytedance.retrofit2.b.a boolean z, @o int i2, @ag String str, @aa(a = true) Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj, @com.bytedance.retrofit2.b.a boolean z2);

    @ae
    @i
    b<TypedInput> head(@o int i2, @ag String str, @aa(a = true) Map<String, String> map, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj, @com.bytedance.retrofit2.b.a boolean z);

    @r
    @ae
    b<TypedInput> options(@o int i2, @ag String str, @aa(a = true) Map<String, String> map, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj, @com.bytedance.retrofit2.b.a boolean z);

    @t
    @ae
    b<TypedInput> post(@o int i2, @ag String str, @aa(a = true) Map<String, String> map, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj, @com.bytedance.retrofit2.b.a boolean z);

    @t
    b<String> postBody(@o int i2, @ag String str, @aa(a = true) Map<String, String> map, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj);

    @ae
    @u
    b<TypedInput> put(@o int i2, @ag String str, @aa(a = true) Map<String, String> map, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj, @com.bytedance.retrofit2.b.a boolean z);
}
