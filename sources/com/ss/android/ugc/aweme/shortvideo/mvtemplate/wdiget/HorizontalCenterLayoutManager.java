package com.ss.android.ugc.aweme.shortvideo.mvtemplate.wdiget;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class HorizontalCenterLayoutManager extends LinearLayoutManager {
    static {
        Covode.recordClassIndex(85005);
    }

    public static final class a extends r {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ RecyclerView f129511f;

        static {
            Covode.recordClassIndex(85006);
        }

        @Override // androidx.recyclerview.widget.r
        public final float a(DisplayMetrics displayMetrics) {
            l.d(displayMetrics, "");
            return 150.0f / ((float) displayMetrics.densityDpi);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(RecyclerView recyclerView, Context context) {
            super(context);
            this.f129511f = recyclerView;
        }

        @Override // androidx.recyclerview.widget.r
        public final int a(int i2, int i3, int i4, int i5, int i6) {
            return (i4 + ((i5 - i4) / 2)) - (i2 + ((i3 - i2) / 2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalCenterLayoutManager(Context context) {
        super(0, false);
        l.d(context, "");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
        l.d(recyclerView, "");
        super.a(recyclerView, sVar, i2);
        a aVar = new a(recyclerView, recyclerView.getContext());
        aVar.f3862g = i2;
        a(aVar);
    }
}
