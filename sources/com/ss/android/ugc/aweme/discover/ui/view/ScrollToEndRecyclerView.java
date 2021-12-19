package com.ss.android.ugc.aweme.discover.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.ui.bk;

public class ScrollToEndRecyclerView extends RecyclerView {
    public boolean O;

    static {
        Covode.recordClassIndex(51564);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.O) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1) {
            bk.f82459a = false;
        } else if (action == 2) {
            bk.f82459a = this.O;
            if (this.O) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public ScrollToEndRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(new a() {
            /* class com.ss.android.ugc.aweme.discover.ui.view.ScrollToEndRecyclerView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(51565);
            }

            @Override // com.ss.android.ugc.aweme.discover.ui.view.a
            public final void a(boolean z) {
                super.a(z);
                ScrollToEndRecyclerView.this.O = z;
            }
        });
    }
}
