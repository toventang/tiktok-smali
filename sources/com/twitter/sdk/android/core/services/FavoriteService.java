package com.twitter.sdk.android.core.services;

import com.bytedance.covode.number.Covode;
import java.util.List;
import l.b;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;
import l.b.t;

public interface FavoriteService {
    static {
        Covode.recordClassIndex(103731);
    }

    @o(a = "/1.1/favorites/create.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    @e
    b<Object> create(@c(a = "id") Long l2, @c(a = "include_entities") Boolean bool);

    @o(a = "/1.1/favorites/destroy.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    @e
    b<Object> destroy(@c(a = "id") Long l2, @c(a = "include_entities") Boolean bool);

    @f(a = "/1.1/favorites/list.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    b<List<Object>> list(@t(a = "user_id") Long l2, @t(a = "screen_name") String str, @t(a = "count") Integer num, @t(a = "since_id") String str2, @t(a = "max_id") String str3, @t(a = "include_entities") Boolean bool);
}
