package com.bytedance.router.mapping;

import com.bytedance.covode.number.Covode;
import com.bytedance.router.IInterceptorInitializer;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.profile.ui.de;
import java.util.List;
import java.util.Map;

public class SmartRouterInterceptor implements IInterceptorInitializer {
    static {
        Covode.recordClassIndex(26187);
    }

    @Override // com.bytedance.router.IInterceptorInitializer
    public void initAssignInterceptors(Map<String, IInterceptor> map) {
        map.put("profile.UserProfileInterceptor", new de());
    }

    @Override // com.bytedance.router.IInterceptorInitializer
    public void initInterceptors(List<IInterceptor> list) {
    }

    public void initSafeInterceptors(List<IInterceptor> list) {
    }
}
