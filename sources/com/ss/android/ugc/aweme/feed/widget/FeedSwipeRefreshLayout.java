package com.ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.common.widget.b;

public class FeedSwipeRefreshLayout extends SwipeRefreshLayout {
    private b n;
    private boolean o;
    private RecyclerView p;

    static {
        Covode.recordClassIndex(60314);
    }

    public void setCanTouch(boolean z) {
        this.o = z;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.p = recyclerView;
    }

    public void setViewPager(b bVar) {
        this.n = bVar;
    }

    public FeedSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.o || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.o) {
            return false;
        }
        b bVar = this.n;
        if (bVar != null && bVar.getAdapter() != null && this.n.getAdapter().getCount() != 0 && this.n.getCurrentItem() != 0) {
            return false;
        }
        RecyclerView recyclerView = this.p;
        if ((recyclerView == null || ((LinearLayoutManager) recyclerView.getLayoutManager()).l() == 0) && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public FeedSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = true;
    }
}
