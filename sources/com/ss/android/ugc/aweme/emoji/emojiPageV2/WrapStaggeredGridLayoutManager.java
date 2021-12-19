package com.ss.android.ugc.aweme.emoji.emojiPageV2;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;

public class WrapStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    static {
        Covode.recordClassIndex(56055);
    }

    public WrapStaggeredGridLayoutManager(int i2) {
        super(i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i, androidx.recyclerview.widget.StaggeredGridLayoutManager
    public final void c(RecyclerView.o oVar, RecyclerView.s sVar) {
        try {
            super.c(oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i, androidx.recyclerview.widget.StaggeredGridLayoutManager
    public final int b(int i2, RecyclerView.o oVar, RecyclerView.s sVar) {
        try {
            return super.b(i2, oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public WrapStaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
