package com.ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;

public enum l {
    FilterTimelineAll,
    FilterLike,
    FilterComment,
    FilterMention,
    FilterFollow,
    FilterFromTiktok,
    FilterTypeQA,
    FilterTypeShop,
    FilterTypeAllExceptFollow,
    FilterTypeFollowAndFollowRequest;

    static {
        Covode.recordClassIndex(72427);
    }
}
