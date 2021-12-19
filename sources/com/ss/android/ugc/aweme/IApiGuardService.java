package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.b.f;
import com.bytedance.ies.ugc.network.partner.b.g;
import com.bytedance.news.common.service.manager.IService;
import java.util.Map;

public interface IApiGuardService extends IService {
    static {
        Covode.recordClassIndex(38368);
    }

    Map<String, String> appendHeaders(f fVar);

    void initializeApiGuard();

    boolean isEnabled();

    void parseHeaders(g<?> gVar);
}
