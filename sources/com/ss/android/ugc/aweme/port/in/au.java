package com.ss.android.ugc.aweme.port.in;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.google.gson.f;
import java.util.List;

public interface au {
    static {
        Covode.recordClassIndex(74541);
    }

    <T> T createDefaultRetrofit(Class<T> cls);

    <T> T createRetrofit(String str, boolean z, Class<T> cls);

    <T> T createRetrofitWithInterceptors(String str, boolean z, Class<T> cls, List<? extends a> list);

    String getApiHost();

    f getRetrofitFactoryGson();

    <T> T retrofitCreate(String str, Class<T> cls);
}
