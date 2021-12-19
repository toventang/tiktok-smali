package com.ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ui.eb;
import com.ss.android.ugc.aweme.feed.ui.g;

public class VideoReviewStatusWidget extends AbsFeedWidget {
    static {
        Covode.recordClassIndex(59073);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget
    public final g b(View view) {
        return new eb(view);
    }
}
