package com.ss.android.ugc.aweme.search.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Scroller;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout;

public class SearchDoubleBallSwipeRefreshLayout extends DoubleBallSwipeRefreshLayout {
    static {
        Covode.recordClassIndex(79295);
    }

    public SearchDoubleBallSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout
    public final void a(Scroller scroller, int i2, int i3) {
        scroller.startScroll(0, i2, 0, i3 - i2);
    }
}
