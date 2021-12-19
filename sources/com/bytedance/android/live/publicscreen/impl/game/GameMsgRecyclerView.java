package com.bytedance.android.live.publicscreen.impl.game;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.analytics.a.f;
import com.bytedance.android.livesdk.chatroom.widget.LiveMessageRecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class GameMsgRecyclerView extends LiveMessageRecyclerView {
    private int O;

    static {
        Covode.recordClassIndex(6800);
    }

    public GameMsgRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getMaxHeight() {
        return this.O;
    }

    public final void setMaxHeight(int i2) {
        this.O = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onMeasure(int i2, int i3) {
        int i4 = this.O;
        if (i4 > 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
    }

    private /* synthetic */ GameMsgRecyclerView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private GameMsgRecyclerView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        addOnAttachStateChangeListener(new f());
    }
}
