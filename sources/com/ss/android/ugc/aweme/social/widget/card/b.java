package com.ss.android.ugc.aweme.social.widget.card;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.w;

public final class b implements RecyclerView.k {

    /* renamed from: a  reason: collision with root package name */
    public final int f133765a;

    static {
        Covode.recordClassIndex(87499);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void b(View view) {
        l.d(view, "");
    }

    public b(int i2) {
        this.f133765a = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void a(View view) {
        l.d(view, "");
        if (view.getLayoutParams().height != this.f133765a) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = this.f133765a;
                view.setLayoutParams(layoutParams);
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }
}
