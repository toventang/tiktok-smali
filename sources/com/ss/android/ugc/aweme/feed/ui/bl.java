package com.ss.android.ugc.aweme.feed.ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.base.widget.b;
import h.f.b.l;
import java.util.Objects;

public final class bl extends b {

    /* renamed from: a  reason: collision with root package name */
    public int f94386a = 1;

    static {
        Covode.recordClassIndex(59951);
    }

    public bl() {
        super(2, 1);
    }

    @Override // com.ss.android.ugc.aweme.base.widget.b, androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        int d2 = RecyclerView.d(view);
        RecyclerView.a adapter = recyclerView.getAdapter();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        if (((GridLayoutManager.b) layoutParams).f3768a % 2 == 0) {
            rect.left = n.a((double) this.f94386a);
            double d3 = (double) this.f94386a;
            Double.isNaN(d3);
            rect.right = n.a(d3 / 2.0d);
        } else {
            double d4 = (double) this.f94386a;
            Double.isNaN(d4);
            rect.left = n.a(d4 / 2.0d);
            rect.right = n.a((double) this.f94386a);
        }
        if (com.bytedance.ies.abmock.b.a().a(true, "video_search_show_style", 0) == 5) {
            double d5 = (double) this.f94386a;
            Double.isNaN(d5);
            rect.bottom = n.a(d5 - 3.0d);
            if ((adapter == null || adapter.getItemViewType(0) != 0) && d2 == 1) {
                rect.top = n.a(3.0d);
                return;
            }
            return;
        }
        rect.bottom = n.a((double) this.f94386a);
    }
}
