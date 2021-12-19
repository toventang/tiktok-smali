package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.covode.number.Covode;

public class MVLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public float f126101a = 5.0f;

    static {
        Covode.recordClassIndex(82809);
    }

    public MVLinearLayoutManager() {
        super(0, false);
    }

    class a extends r {
        static {
            Covode.recordClassIndex(82810);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final PointF c(int i2) {
            return MVLinearLayoutManager.this.d(i2);
        }

        @Override // androidx.recyclerview.widget.r
        public final float a(DisplayMetrics displayMetrics) {
            return MVLinearLayoutManager.this.f126101a / ((float) displayMetrics.densityDpi);
        }

        public a(Context context) {
            super(context);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
        a aVar = new a(recyclerView.getContext());
        aVar.f3862g = i2;
        a(aVar);
    }

    public MVLinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
