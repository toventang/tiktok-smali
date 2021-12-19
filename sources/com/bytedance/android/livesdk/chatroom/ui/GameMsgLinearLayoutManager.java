package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public class GameMsgLinearLayoutManager extends SmoothLinearLayoutManager {
    static {
        Covode.recordClassIndex(8717);
    }

    public GameMsgLinearLayoutManager() {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void c(RecyclerView.o oVar, RecyclerView.s sVar) {
        try {
            super.c(oVar, sVar);
        } catch (Throwable unused) {
        }
    }

    public GameMsgLinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
