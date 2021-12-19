package com.ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.views.FpsRecyclerView;

public class DiscoveryRecyclerView extends FpsRecyclerView {
    double O;
    double P;

    static {
        Covode.recordClassIndex(51616);
    }

    public DiscoveryRecyclerView(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.O = (double) motionEvent.getX();
            this.P = (double) motionEvent.getY();
        } else if (action == 2) {
            double x = (double) motionEvent.getX();
            double d2 = this.O;
            Double.isNaN(x);
            double abs = Math.abs(x - d2);
            double y = (double) motionEvent.getY();
            double d3 = this.P;
            Double.isNaN(y);
            double abs2 = Math.abs(y - d3);
            if (abs > ((double) ViewConfiguration.get(getContext()).getScaledTouchSlop()) && abs > abs2) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public DiscoveryRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
