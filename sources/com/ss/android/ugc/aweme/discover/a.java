package com.ss.android.ugc.aweme.discover;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.discover.model.TrendingTopic;

public final class a {
    static {
        Covode.recordClassIndex(49869);
    }

    public static void a(Context context, TrendingTopic trendingTopic) {
        g.a().a(context, trendingTopic.getCreativeId(), trendingTopic.getLogExtra(), trendingTopic.getClickTrackUrlList());
    }

    public static void b(Context context, TrendingTopic trendingTopic) {
        g.a().b(context, trendingTopic.getCreativeId(), trendingTopic.getLogExtra(), trendingTopic.getClickTrackUrlList());
    }

    public static void c(Context context, TrendingTopic trendingTopic) {
        g.a().c(context, trendingTopic.getCreativeId(), trendingTopic.getLogExtra(), trendingTopic.getTrackUrlList());
    }
}
