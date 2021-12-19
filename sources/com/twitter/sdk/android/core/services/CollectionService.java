package com.twitter.sdk.android.core.services;

import com.bytedance.covode.number.Covode;
import l.b;
import l.b.f;
import l.b.t;

public interface CollectionService {
    static {
        Covode.recordClassIndex(103729);
    }

    @f(a = "/1.1/collections/entries.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    b<Object> collection(@t(a = "id") String str, @t(a = "count") Integer num, @t(a = "max_position") Long l2, @t(a = "min_position") Long l3);
}
