package com.benchmark.netUtils;

import com.benchmark.b.a;
import com.benchmark.b.e;
import com.benchmark.b.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.k;
import com.bytedance.retrofit2.b.m;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;
import okhttp3.RequestBody;

public interface BytebenchAPI {
    static {
        Covode.recordClassIndex(3024);
    }

    @h(a = "/bytebench/api/task/group")
    b<TypedInput> getDefaultBenchmark(@m Map<String, String> map, @aa Map<String, String> map2);

    @t(a = "/bytebench/api/sdk/device/info")
    b<e<Object>> getDeviceInfo(@k(a = "x-bytebench-signature") String str, @aa Map<String, String> map, @com.bytedance.retrofit2.b.b RequestBody requestBody);

    @t(a = "/bytebench/api/sdk/device/score")
    b<e<a>> getDeviceScore(@k(a = "x-bytebench-signature") String str, @aa Map<String, String> map, @com.bytedance.retrofit2.b.b RequestBody requestBody);

    @h(a = "/model/api/arithmetics")
    b<TypedInput> getModels(@aa Map<String, String> map);

    @t(a = "/bytebench/api/sdk/device/strategy/score")
    b<e<a>> getSceneScore(@k(a = "x-bytebench-signature") String str, @aa Map<String, String> map, @com.bytedance.retrofit2.b.b RequestBody requestBody);

    @t(a = "/bytebench/api/sdk/device/strategy/batch")
    b<e<f>> getStrategyComprise(@k(a = "x-bytebench-signature") String str, @aa Map<String, String> map, @com.bytedance.retrofit2.b.b RequestBody requestBody);

    @t(a = "/bytebench/api/sdk/device/strategy/result")
    b<e<com.benchmark.b.h>> getStrategyResult(@k(a = "x-bytebench-signature") String str, @aa Map<String, String> map, @com.bytedance.retrofit2.b.b RequestBody requestBody);

    @t(a = "/bytebench/api/sdk/device/task/result")
    b<e<Object>> getTaskResult(@k(a = "x-bytebench-signature") String str, @aa Map<String, String> map, @com.bytedance.retrofit2.b.b RequestBody requestBody);

    @t(a = "/bytebench/api/task/result")
    b<TypedInput> reportResult(@aa Map<String, String> map, @com.bytedance.retrofit2.b.b RequestBody requestBody);
}
