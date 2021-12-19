package com.ss.android.ugc.aweme.kids.discovery.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class DiscoveryRecyclerView extends RecyclerView {
    private double O;
    private double P;

    static {
        Covode.recordClassIndex(68047);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
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
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            l.b(viewConfiguration, "");
            if (abs > ((double) viewConfiguration.getScaledTouchSlop()) && abs > abs2) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiscoveryRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
    }
}
