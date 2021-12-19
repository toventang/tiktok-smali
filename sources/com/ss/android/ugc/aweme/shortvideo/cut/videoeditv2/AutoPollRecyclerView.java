package com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.a.f;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Objects;

public final class AutoPollRecyclerView extends RecyclerView {
    public static final a P = new a((byte) 0);
    public boolean O;

    static {
        Covode.recordClassIndex(82852);
    }

    public AutoPollRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82853);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void q() {
        if (this.O) {
            this.O = false;
            i();
        }
    }

    public final void setRunning(boolean z) {
        this.O = z;
    }

    public final void g(int i2) {
        RecyclerView.a adapter = getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            this.O = true;
            if (i2 == -1) {
                d(0);
            } else {
                d(itemCount - 1);
            }
        }
    }

    public final void g(int i2, int i3) {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            RecyclerView.i layoutManager = getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).a(i2, i3);
            return;
        }
        throw new IllegalArgumentException("layoutManager must be a subclass of LinearLayoutManager");
    }

    private /* synthetic */ AutoPollRecyclerView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AutoPollRecyclerView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        addOnAttachStateChangeListener(new f());
    }
}
