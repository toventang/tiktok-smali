package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.covode.number.Covode;

public class ScrollCenterLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView.r f150297a;

    /* renamed from: b  reason: collision with root package name */
    private Context f150298b;

    static {
        Covode.recordClassIndex(98873);
    }

    static class a extends r {
        static {
            Covode.recordClassIndex(98874);
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

    public ScrollCenterLayoutManager(Context context) {
        super(0, false);
        this.f150298b = context;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void e(int i2) {
        a(i2, (int) (((float) (this.J / 2)) - com.ss.android.ugc.tools.utils.r.a(this.f150298b, 45.0f)));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
        Context context = recyclerView.getContext();
        if (this.f150297a == null) {
            this.f150297a = new a(context);
        }
        RecyclerView.r rVar = this.f150297a;
        rVar.f3862g = i2;
        a(rVar);
    }

    public ScrollCenterLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f150298b = context;
    }
}
