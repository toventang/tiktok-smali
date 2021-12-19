package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.feed.bc;
import com.ss.android.ugc.aweme.commercialize.utils.ar;

public class CommerceDataServiceImpl implements bc {
    static {
        Covode.recordClassIndex(79440);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bc
    public int getDelayTimeAfterInteraction() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bc
    public boolean isShowCommerceAfterInteraction() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bc
    public boolean shouldShowCard() {
        return ar.a();
    }
}
