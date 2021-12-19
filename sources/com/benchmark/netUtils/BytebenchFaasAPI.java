package com.benchmark.netUtils;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;
import okhttp3.RequestBody;

public interface BytebenchFaasAPI {
    static {
        Covode.recordClassIndex(3025);
    }

    @t(a = "/")
    b<TypedInput> reportResult(@aa Map<String, String> map, @com.bytedance.retrofit2.b.b RequestBody requestBody);
}
