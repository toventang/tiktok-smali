package com.ss.android.ugc.aweme.ba;

import androidx.core.g.e;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;

public final class d {
    static {
        Covode.recordClassIndex(41776);
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
            int i2 = staggeredGridLayoutManager.f3896a;
            int[] iArr = new int[i2];
            staggeredGridLayoutManager.b(iArr);
            int i3 = iArr[0];
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = iArr[i4];
                if (i5 > i3) {
                    i3 = i5;
                }
            }
            staggeredGridLayoutManager.a(iArr);
            int i6 = iArr[0];
            for (int i7 = 0; i7 < i2; i7++) {
                int i8 = iArr[i7];
                if (i8 < i6) {
                    i6 = i8;
                }
            }
            return new e<>(Integer.valueOf(i6), Integer.valueOf(i3));
        } else {
            throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager, StaggeredGridLayoutManager");
        }
    }
}
