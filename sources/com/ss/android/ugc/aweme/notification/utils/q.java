package com.ss.android.ugc.aweme.notification.utils;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class q {
    static {
        Covode.recordClassIndex(73246);
    }

    public static final class a extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView f113907a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SwipeRefreshLayout f113908b;

        static {
            Covode.recordClassIndex(73247);
        }

        a(RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
            this.f113907a = recyclerView;
            this.f113908b = swipeRefreshLayout;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            boolean z;
            Boolean valueOf;
            int a2;
            boolean z2;
            boolean z3;
            l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            RecyclerView.i layoutManager = this.f113907a.getLayoutManager();
            if (layoutManager != null) {
                l.b(layoutManager, "");
                if (layoutManager instanceof LinearLayoutManager) {
                    if (((LinearLayoutManager) layoutManager).l() <= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    valueOf = Boolean.valueOf(z3);
                } else if (layoutManager instanceof GridLayoutManager) {
                    if (((LinearLayoutManager) layoutManager).l() <= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    valueOf = Boolean.valueOf(z2);
                } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    int i4 = staggeredGridLayoutManager.f3896a;
                    int[] iArr = new int[i4];
                    for (int i5 = 0; i5 < staggeredGridLayoutManager.f3896a; i5++) {
                        StaggeredGridLayoutManager.c cVar = staggeredGridLayoutManager.f3897b[i5];
                        if (StaggeredGridLayoutManager.this.f3901f) {
                            a2 = cVar.a(cVar.f3935a.size() - 1, -1, true);
                        } else {
                            a2 = cVar.a(0, cVar.f3935a.size(), true);
                        }
                        iArr[i5] = a2;
                    }
                    l.b(iArr, "");
                    int i6 = 0;
                    for (int i7 = 0; i7 < i4; i7++) {
                        if (iArr[i7] <= 0) {
                            i6++;
                        }
                    }
                    if (i6 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    valueOf = Boolean.valueOf(z);
                } else {
                    return;
                }
                if (valueOf != null && (this.f113908b.isEnabled() ^ valueOf.booleanValue())) {
                    if (valueOf.booleanValue()) {
                        this.f113908b.setEnabled(true);
                    } else if (!this.f113908b.mRefreshing) {
                        this.f113908b.setEnabled(false);
                    }
                }
            }
        }
    }

    public static final void a(RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        if (recyclerView != null && swipeRefreshLayout != null) {
            recyclerView.setOverScrollMode(0);
            recyclerView.a(new a(recyclerView, swipeRefreshLayout));
        }
    }
}
