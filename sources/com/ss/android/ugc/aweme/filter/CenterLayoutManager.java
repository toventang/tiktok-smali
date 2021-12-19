package com.ss.android.ugc.aweme.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.covode.number.Covode;

public class CenterLayoutManager extends LinearLayoutManager {
    static {
        Covode.recordClassIndex(60477);
    }

    static class a extends r {
        static {
            Covode.recordClassIndex(60478);
        }

        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.r
        public final float a(DisplayMetrics displayMetrics) {
            return 200.0f / ((float) displayMetrics.densityDpi);
        }

        @Override // androidx.recyclerview.widget.r
        public final int a(int i2, int i3, int i4, int i5, int i6) {
            return (i4 + ((i5 - i4) / 2)) - (i2 + ((i3 - i2) / 2));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
        a aVar = new a(recyclerView.getContext());
        aVar.f3862g = i2;
        a(aVar);
    }

    public CenterLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
