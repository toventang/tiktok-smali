package com.ss.android.ugc.aweme.qna.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class QnaRecyclerView extends RecyclerView {
    private float O = -1.0f;
    private a P;

    public enum a {
        UP,
        DOWN;

        static {
            Covode.recordClassIndex(77673);
        }
    }

    static {
        Covode.recordClassIndex(77672);
    }

    public final a getPrevDragDir() {
        return this.P;
    }

    public final void setPrevDragDir(a aVar) {
        this.P = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.O = motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            if (motionEvent.getY() - this.O > 0.0f) {
                this.P = a.DOWN;
            } else {
                this.P = a.UP;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QnaRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
    }
}
