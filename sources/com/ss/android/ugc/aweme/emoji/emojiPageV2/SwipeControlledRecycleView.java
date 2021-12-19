package com.ss.android.ugc.aweme.emoji.emojiPageV2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class SwipeControlledRecycleView extends RecyclerView {
    private boolean O = true;

    static {
        Covode.recordClassIndex(56054);
    }

    public final boolean getMSwipeEnabled() {
        return this.O;
    }

    public final void setMSwipeEnabled(boolean z) {
        this.O = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (this.O) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (this.O) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeControlledRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
    }
}
