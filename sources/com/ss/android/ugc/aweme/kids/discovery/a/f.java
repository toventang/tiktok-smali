package com.ss.android.ugc.aweme.kids.discovery.a;

import android.content.Context;
import android.content.res.Resources;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class f extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    a f106410a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f106411b = true;

    /* renamed from: c  reason: collision with root package name */
    private int f106412c = 3;

    /* renamed from: d  reason: collision with root package name */
    private int f106413d;

    /* renamed from: e  reason: collision with root package name */
    private int f106414e;

    /* renamed from: f  reason: collision with root package name */
    private int f106415f = -1;

    public interface a {
        static {
            Covode.recordClassIndex(68001);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(68000);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2) {
        l.d(recyclerView, "");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        int i4;
        l.d(recyclerView, "");
        if (this.f106411b && i3 >= 0 && i2 >= 0) {
            if (this.f106414e == 0) {
                Context context = recyclerView.getContext();
                l.b(context, "");
                Resources resources = context.getResources();
                l.b(resources, "");
                this.f106414e = (int) (resources.getDisplayMetrics().density * 40.0f);
            }
            int i5 = this.f106413d + i3;
            this.f106413d = i5;
            if (i5 > this.f106414e) {
                RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    l.b(layoutManager, "");
                    int i6 = Integer.MAX_VALUE;
                    int A = layoutManager.A() - 1;
                    if (layoutManager instanceof GridLayoutManager) {
                        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                        int i7 = this.f106412c * gridLayoutManager.f3760b;
                        int i8 = A - 1;
                        int i9 = 0;
                        while (true) {
                            if (i8 < 0) {
                                break;
                            }
                            i9 += gridLayoutManager.f3765g.a(i8);
                            if (i9 >= i7) {
                                i6 = i8;
                                break;
                            }
                            i8--;
                        }
                        i4 = gridLayoutManager.m();
                    } else if (layoutManager instanceof LinearLayoutManager) {
                        i6 = (A - 1) - (this.f106412c * 1);
                        i4 = ((LinearLayoutManager) layoutManager).m();
                    } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                        int i10 = staggeredGridLayoutManager.f3896a;
                        int[] iArr = new int[i10];
                        staggeredGridLayoutManager.b(iArr);
                        i4 = iArr[0];
                        for (int i11 = 0; i11 < i10; i11++) {
                            int i12 = iArr[i11];
                            if (i12 > i4) {
                                i4 = i12;
                            }
                        }
                        i6 = A - (staggeredGridLayoutManager.f3896a * this.f106412c);
                    }
                    if (layoutManager.s() > 0 && i4 >= i6 && this.f106415f != i6) {
                        this.f106415f = i6;
                        a aVar = this.f106410a;
                        if (aVar != null) {
                            aVar.a();
                        }
                    }
                }
                this.f106413d = 0;
            }
        }
    }
}
