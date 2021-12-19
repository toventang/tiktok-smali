package com.bytedance.services.apm.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.IService;

public interface ILaunchTrace extends IService {
    static {
        Covode.recordClassIndex(26954);
    }

    void cancelTrace();

    void endSpan(String str, String str2);

    void endTrace(int i2, String str, long j2);

    void startSpan(String str, String str2);

    void startTrace();
}
