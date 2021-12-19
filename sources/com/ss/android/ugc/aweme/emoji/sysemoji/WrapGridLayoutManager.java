package com.ss.android.ugc.aweme.emoji.sysemoji;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public class WrapGridLayoutManager extends GridLayoutManager {
    static {
        Covode.recordClassIndex(56149);
    }

    public WrapGridLayoutManager(int i2) {
        super(i2, 1, false);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void c(RecyclerView.o oVar, RecyclerView.s sVar) {
        try {
            super.c(oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public WrapGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
