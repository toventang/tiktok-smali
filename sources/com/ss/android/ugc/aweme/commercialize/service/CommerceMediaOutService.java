package com.ss.android.ugc.aweme.commercialize.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.depend.n;
import com.ss.android.ugc.aweme.commercialize.media.api.a.a;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaOutService;

public final class CommerceMediaOutService implements ICommerceMediaOutService {
    static {
        Covode.recordClassIndex(46453);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaOutService
    public final a a() {
        return new n();
    }
}
