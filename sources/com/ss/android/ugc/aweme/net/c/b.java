package com.ss.android.ugc.aweme.net.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.e;
import com.ss.android.common.applog.AppLog;

public final class b implements e.b<com.bytedance.ttnet.d.b> {
    static {
        Covode.recordClassIndex(72134);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.e.b
    public final String b(String str) {
        return str;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.e.b
    public final String a(String str) {
        if (str == null) {
            return str;
        }
        if (str.contains("/get_domains/") || str.contains("/ttnet_crash/")) {
            return AppLog.addCommonParams(str, true);
        }
        return str;
    }
}
