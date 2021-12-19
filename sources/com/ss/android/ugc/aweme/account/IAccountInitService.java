package com.ss.android.ugc.aweme.account;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;

public interface IAccountInitService {
    static {
        Covode.recordClassIndex(38502);
    }

    <T> ServiceProvider<T> a(Class<T> cls);
}
