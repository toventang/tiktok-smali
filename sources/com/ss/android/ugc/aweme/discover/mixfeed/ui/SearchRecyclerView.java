package com.ss.android.ugc.aweme.discover.mixfeed.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.ss.android.ugc.aweme.search.l.b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SearchRecyclerView extends NestedScrollingRecyclerView {
    public boolean O = true;
    public boolean P;
    public final Lock Q = new ReentrantLock();
    public final b<a> R = new b<>();

    public interface a {
        static {
            Covode.recordClassIndex(50833);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(50832);
    }

    public final void q() {
        this.O = true;
        invalidate();
        r();
    }

    private void r() {
        b.a<a> b2 = this.R.b();
        try {
            int i2 = b2.f121382b;
            for (int i3 = 0; i3 < i2; i3++) {
                b2.a(i3).a();
            }
        } finally {
            this.R.c();
        }
    }

    public final void a(a aVar) {
        if (!this.P || this.O) {
            this.R.a().add(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void draw(Canvas canvas) {
        if (this.O) {
            super.draw(canvas);
            return;
        }
        try {
            if (this.Q.tryLock(1000, TimeUnit.MILLISECONDS)) {
                this.Q.unlock();
            }
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    public SearchRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
