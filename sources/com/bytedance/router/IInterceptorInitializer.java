package com.bytedance.router;

import com.bytedance.covode.number.Covode;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.List;
import java.util.Map;

public interface IInterceptorInitializer {
    static {
        Covode.recordClassIndex(26103);
    }

    void initAssignInterceptors(Map<String, IInterceptor> map);

    void initInterceptors(List<IInterceptor> list);
}
