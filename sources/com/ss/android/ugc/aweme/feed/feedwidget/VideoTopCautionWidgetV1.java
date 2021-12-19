package com.ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ui.ew;
import com.ss.android.ugc.aweme.feed.ui.g;

public final class VideoTopCautionWidgetV1 extends AbsFeedWidget {
    static {
        Covode.recordClassIndex(59076);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget
    public final g b(View view) {
        return new ew(view);
    }
}
