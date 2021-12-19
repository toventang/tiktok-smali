package com.ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ui.bo;
import com.ss.android.ugc.aweme.feed.ui.g;

public final class VPAInfoBarWidget extends AbsFeedWidget {
    static {
        Covode.recordClassIndex(59056);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget
    public final /* synthetic */ g b(View view) {
        return new bo(view);
    }
}
