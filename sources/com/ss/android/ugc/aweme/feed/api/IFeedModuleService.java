package com.ss.android.ugc.aweme.feed.api;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.dj;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.p.b.a.b;

public interface IFeedModuleService {
    static {
        Covode.recordClassIndex(57883);
    }

    dj a(Context context);

    by b(Context context);

    boolean canResumePlay();

    boolean fullscreenShowLive();

    Integer getInsertIndex(int i2, Aweme aweme);

    void maybeMonitorTimeSpend(Aweme aweme, Long l2);

    b newTopNoticeFeedManager(Activity activity, View view);
}
