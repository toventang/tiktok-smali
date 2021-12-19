package com.bytedance.analytics.a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public final class f implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private static a f6545a = new a((byte) 0);

    static class a extends RecyclerView.n {
        static {
            Covode.recordClassIndex(3147);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            super.a(recyclerView, i2);
            if (i2 == 0) {
                com.bytedance.analytics.b.f.a("**** RecyclerView IDLE ****");
                b.a();
            }
        }
    }

    static {
        Covode.recordClassIndex(3146);
    }

    public final void onViewAttachedToWindow(View view) {
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).a(f6545a);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).b(f6545a);
        }
    }
}
