package com.ss.android.ugc.aweme.commercialize.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.depend.z;
import com.ss.android.ugc.aweme.tcm.api.a.a;
import com.ss.android.ugc.aweme.tcm.api.service.ITcmOutService;

public final class TcmOutService implements ITcmOutService {
    static {
        Covode.recordClassIndex(46459);
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.ITcmOutService
    public final a a() {
        return new z();
    }
}
