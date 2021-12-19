package com.ss.android.ugc.aweme.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.core.g.e;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;

public final class gh {
    static {
        Covode.recordClassIndex(93589);
    }

    private static int a(int[] iArr) {
        int i2 = iArr[0];
        for (int i3 : iArr) {
            if (i3 > i2) {
                i2 = i3;
            }
        }
        return i2;
    }

    private static int b(int[] iArr) {
        int i2 = iArr[0];
        for (int i3 : iArr) {
            if (i3 < i2) {
                i2 = i3;
            }
        }
        return i2;
    }

    public static Rect a(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder == null || viewHolder.itemView == null) {
            return null;
        }
        View view = viewHolder.itemView;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    public static e<Integer, Integer> a(RecyclerView recyclerView) {
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            return new e<>(Integer.valueOf(linearLayoutManager.k()), Integer.valueOf(linearLayoutManager.m()));
        } else if (layoutManager instanceof GridLayoutManager) {
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) layoutManager;
            return new e<>(Integer.valueOf(linearLayoutManager2.k()), Integer.valueOf(linearLayoutManager2.m()));
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.f3896a];
            staggeredGridLayoutManager.b(iArr);
            int a2 = a(iArr);
            staggeredGridLayoutManager.a(iArr);
            return new e<>(Integer.valueOf(b(iArr)), Integer.valueOf(a2));
        } else {
            throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager, StaggeredGridLayoutManager");
        }
    }

    public static void a(RecyclerView recyclerView, int i2) {
        if (recyclerView != null) {
            recyclerView.setPadding(0, (int) n.b(recyclerView.getContext(), (float) i2), 0, 0);
            recyclerView.setClipToPadding(false);
        }
    }
}
