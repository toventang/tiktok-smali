package com.bytedance.router.interceptor;

import com.bytedance.covode.number.Covode;
import java.util.List;

public interface IInterceptorProvider {
    static {
        Covode.recordClassIndex(26182);
    }

    List<IInterceptor> getInterceptors();
}
