package com.ss.android.ugc.aweme.discover.ui;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class s extends RecyclerView.RecycledViewPool {
    static {
        Covode.recordClassIndex(51462);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final RecyclerView.ViewHolder getRecycledView(int i2) {
        View view;
        MethodCollector.i(3042);
        RecyclerView.ViewHolder recycledView = super.getRecycledView(i2);
        if (!(recycledView == null || (view = recycledView.itemView) == null)) {
            l.b(view, "");
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        MethodCollector.o(3042);
        return recycledView;
    }
}
