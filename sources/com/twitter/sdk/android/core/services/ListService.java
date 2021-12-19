package com.twitter.sdk.android.core.services;

import com.bytedance.covode.number.Covode;
import java.util.List;
import l.b;
import l.b.f;
import l.b.t;

public interface ListService {
    static {
        Covode.recordClassIndex(103732);
    }

    @f(a = "/1.1/lists/statuses.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    b<List<Object>> statuses(@t(a = "list_id") Long l2, @t(a = "slug") String str, @t(a = "owner_screen_name") String str2, @t(a = "owner_id") Long l3, @t(a = "since_id") Long l4, @t(a = "max_id") Long l5, @t(a = "count") Integer num, @t(a = "include_entities") Boolean bool, @t(a = "include_rts") Boolean bool2);
}
