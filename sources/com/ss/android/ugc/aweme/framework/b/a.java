package com.ss.android.ugc.aweme.framework.b;

import android.content.Context;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.e.k;

public class a extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    private int f96675a;

    static {
        Covode.recordClassIndex(61339);
    }

    public a(Context context) {
        this.f96675a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void a(RecyclerView recyclerView, int i2) {
        super.a(recyclerView, i2);
        if (i2 == 0) {
            k.a().e().f47840e.b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void a(RecyclerView recyclerView, int i2, int i3) {
        super.a(recyclerView, i2, i3);
        int abs = Math.abs(i3);
        if (recyclerView.getScrollState() == 1 && abs < this.f96675a) {
            k.a().e().f47840e.b();
        } else if (recyclerView.getScrollState() == 1 && abs >= this.f96675a) {
            k.a().e().f47840e.a();
        } else if (recyclerView.getScrollState() == 2) {
            k.a().e().f47840e.a();
        }
    }
}
