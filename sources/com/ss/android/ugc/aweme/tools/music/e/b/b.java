package com.ss.android.ugc.aweme.tools.music.e.b;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f140498a = new b();

    public static final class a extends RecyclerView.n {
        static {
            Covode.recordClassIndex(91766);
        }

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            if (!recyclerView.canScrollVertically(1)) {
                recyclerView.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(91765);
    }

    public static void a(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        recyclerView.a(new a());
    }
}
