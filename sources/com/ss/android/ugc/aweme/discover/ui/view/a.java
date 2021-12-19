package com.ss.android.ugc.aweme.discover.ui.view;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class a extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    private int[] f82782a;

    /* renamed from: b  reason: collision with root package name */
    private int f82783b;

    static {
        Covode.recordClassIndex(51566);
    }

    public void a(boolean z) {
    }

    private static int a(int[] iArr) {
        int i2 = iArr[0];
        int length = iArr.length;
        for (int i3 = 1; i3 < length; i3++) {
            if (iArr[i3] > i2) {
                i2 = iArr[i3];
            }
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        int a2;
        l.d(recyclerView, "");
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            if (this.f82782a == null) {
                this.f82782a = new int[staggeredGridLayoutManager.f3896a];
            }
            int[] iArr = this.f82782a;
            if (iArr == null) {
                iArr = new int[staggeredGridLayoutManager.f3896a];
            } else if (iArr.length < staggeredGridLayoutManager.f3896a) {
                throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + staggeredGridLayoutManager.f3896a + ", array size:" + iArr.length);
            }
            for (int i4 = 0; i4 < staggeredGridLayoutManager.f3896a; i4++) {
                StaggeredGridLayoutManager.c cVar = staggeredGridLayoutManager.f3897b[i4];
                if (StaggeredGridLayoutManager.this.f3901f) {
                    a2 = cVar.a(0, cVar.f3935a.size(), true);
                } else {
                    a2 = cVar.a(cVar.f3935a.size() - 1, -1, true);
                }
                iArr[i4] = a2;
            }
            int[] iArr2 = this.f82782a;
            if (iArr2 == null) {
                l.b();
            }
            this.f82783b = a(iArr2);
        } else if (layoutManager instanceof GridLayoutManager) {
            this.f82783b = ((LinearLayoutManager) layoutManager).n();
        } else if (layoutManager instanceof LinearLayoutManager) {
            this.f82783b = ((LinearLayoutManager) layoutManager).n();
        }
        l.d(recyclerView, "");
        RecyclerView.i layoutManager2 = recyclerView.getLayoutManager();
        if (layoutManager2 == null) {
            l.b();
        }
        int s = layoutManager2.s();
        int A = layoutManager2.A();
        if (s <= 0 || this.f82783b < A - 1) {
            a(false);
        } else {
            a(true);
        }
    }
}
