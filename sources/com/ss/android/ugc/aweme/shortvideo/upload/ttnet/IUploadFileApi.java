package com.ss.android.ugc.aweme.shortvideo.upload.ttnet;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.a;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ae;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.d;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.o;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.u;
import com.bytedance.retrofit2.b.x;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

public interface IUploadFileApi {
    static {
        Covode.recordClassIndex(86553);
    }

    @h
    b<String> doGet(@a boolean z, @o int i2, @ag String str, @aa(a = true) Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj);

    @u
    b<String> doPut(@o int i2, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @ag String str, @aa(a = true) Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj);

    @t
    b<String> postBody(@o int i2, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @ag String str, @aa(a = true) Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj);

    @t(a = "{relativePath}")
    @ae
    b<TypedInput> streamingPostCall(@com.bytedance.retrofit2.b.b TypedOutput typedOutput, @x(a = "relativePath") String str, @aa(a = true) Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj);
}
