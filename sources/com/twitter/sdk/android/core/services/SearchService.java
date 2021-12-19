package com.twitter.sdk.android.core.services;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.services.a.a;
import l.b;
import l.b.f;
import l.b.t;

public interface SearchService {
    static {
        Covode.recordClassIndex(103734);
    }

    @f(a = "/1.1/search/tweets.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    b<Object> tweets(@t(a = "q") String str, @t(a = "geocode", b = true) a aVar, @t(a = "lang") String str2, @t(a = "locale") String str3, @t(a = "result_type") String str4, @t(a = "count") Integer num, @t(a = "until") String str5, @t(a = "since_id") Long l2, @t(a = "max_id") Long l3, @t(a = "include_entities") Boolean bool);
}
