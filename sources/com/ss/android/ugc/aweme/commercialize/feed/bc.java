package com.ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;

public interface bc {
    static {
        Covode.recordClassIndex(45775);
    }

    int getDelayTimeAfterInteraction();

    boolean isShowCommerceAfterInteraction();

    boolean shouldShowCard();
}
