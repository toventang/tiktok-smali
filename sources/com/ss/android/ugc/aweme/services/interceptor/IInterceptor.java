package com.ss.android.ugc.aweme.services.interceptor;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import java.util.Map;

public interface IInterceptor {
    static {
        Covode.recordClassIndex(79726);
    }

    Map<String, String> tryToIntercept(String str, Request request, String str2, int i2, Map<String, String> map);
}
