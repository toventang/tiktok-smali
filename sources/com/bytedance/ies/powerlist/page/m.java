package com.bytedance.ies.powerlist.page;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class m extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    private final PowerList f34417a;

    /* renamed from: b  reason: collision with root package name */
    private final b<Integer, z> f34418b;

    static {
        Covode.recordClassIndex(20560);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public m(PowerList powerList, b<? super Integer, z> bVar) {
        l.c(powerList, "");
        l.c(bVar, "");
        this.f34417a = powerList;
        this.f34418b = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        Integer valueOf;
        l.c(recyclerView, "");
        super.a(recyclerView, i2, i3);
        RecyclerView.i layoutManager = this.f34417a.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            valueOf = Integer.valueOf(((LinearLayoutManager) layoutManager).m());
        } else if (layoutManager instanceof LinearLayoutManager) {
            valueOf = Integer.valueOf(((LinearLayoutManager) layoutManager).m());
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int i4 = staggeredGridLayoutManager.f3896a;
            int[] iArr = new int[i4];
            staggeredGridLayoutManager.b(iArr);
            int i5 = iArr[0];
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = iArr[i6];
                if (i7 > i5) {
                    i5 = i7;
                }
            }
            valueOf = Integer.valueOf(i5);
        } else {
            return;
        }
        if (valueOf != null && valueOf.intValue() >= 0) {
            int intValue = valueOf.intValue();
            if (layoutManager == null) {
                l.a();
            }
            if ((layoutManager.g() && !this.f34417a.canScrollVertically(1)) || (layoutManager.f() && !this.f34417a.canScrollHorizontally(1))) {
                this.f34418b.invoke(Integer.valueOf(intValue));
            }
        }
    }
}
