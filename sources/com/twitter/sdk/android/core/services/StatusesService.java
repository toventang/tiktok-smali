package com.twitter.sdk.android.core.services;

import com.bytedance.covode.number.Covode;
import java.util.List;
import l.b;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;
import l.b.s;
import l.b.t;

public interface StatusesService {
    static {
        Covode.recordClassIndex(103735);
    }

    @o(a = "/1.1/statuses/destroy/{id}.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    @e
    b<Object> destroy(@s(a = "id") Long l2, @c(a = "trim_user") Boolean bool);

    @f(a = "/1.1/statuses/home_timeline.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    b<List<Object>> homeTimeline(@t(a = "count") Integer num, @t(a = "since_id") Long l2, @t(a = "max_id") Long l3, @t(a = "trim_user") Boolean bool, @t(a = "exclude_replies") Boolean bool2, @t(a = "contributor_details") Boolean bool3, @t(a = "include_entities") Boolean bool4);

    @f(a = "/1.1/statuses/lookup.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    b<List<Object>> lookup(@t(a = "id") String str, @t(a = "include_entities") Boolean bool, @t(a = "trim_user") Boolean bool2, @t(a = "map") Boolean bool3);

    @f(a = "/1.1/statuses/mentions_timeline.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    b<List<Object>> mentionsTimeline(@t(a = "count") Integer num, @t(a = "since_id") Long l2, @t(a = "max_id") Long l3, @t(a = "trim_user") Boolean bool, @t(a = "contributor_details") Boolean bool2, @t(a = "include_entities") Boolean bool3);

    @o(a = "/1.1/statuses/retweet/{id}.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    @e
    b<Object> retweet(@s(a = "id") Long l2, @c(a = "trim_user") Boolean bool);

    @f(a = "/1.1/statuses/retweets_of_me.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    b<List<Object>> retweetsOfMe(@t(a = "count") Integer num, @t(a = "since_id") Long l2, @t(a = "max_id") Long l3, @t(a = "trim_user") Boolean bool, @t(a = "include_entities") Boolean bool2, @t(a = "include_user_entities") Boolean bool3);

    @f(a = "/1.1/statuses/show.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    b<Object> show(@t(a = "id") Long l2, @t(a = "trim_user") Boolean bool, @t(a = "include_my_retweet") Boolean bool2, @t(a = "include_entities") Boolean bool3);

    @o(a = "/1.1/statuses/unretweet/{id}.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    @e
    b<Object> unretweet(@s(a = "id") Long l2, @c(a = "trim_user") Boolean bool);

    @o(a = "/1.1/statuses/update.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    @e
    b<Object> update(@c(a = "status") String str, @c(a = "in_reply_to_status_id") Long l2, @c(a = "possibly_sensitive") Boolean bool, @c(a = "lat") Double d2, @c(a = "long") Double d3, @c(a = "place_id") String str2, @c(a = "display_coordinates") Boolean bool2, @c(a = "trim_user") Boolean bool3, @c(a = "media_ids") String str3);

    @f(a = "/1.1/statuses/user_timeline.json?tweet_mode=extended&include_cards=true&cards_platform=TwitterKit-13")
    b<List<Object>> userTimeline(@t(a = "user_id") Long l2, @t(a = "screen_name") String str, @t(a = "count") Integer num, @t(a = "since_id") Long l3, @t(a = "max_id") Long l4, @t(a = "trim_user") Boolean bool, @t(a = "exclude_replies") Boolean bool2, @t(a = "contributor_details") Boolean bool3, @t(a = "include_rts") Boolean bool4);
}
