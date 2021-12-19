package com.ss.android.ugc.aweme.challenge.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.common.a.g;
import com.ss.android.ugc.aweme.setting.o;

public class z extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    private int f70229a;

    /* renamed from: b  reason: collision with root package name */
    private int f70230b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f70231c = new int[2];

    /* renamed from: d  reason: collision with root package name */
    private int f70232d = ViewConfiguration.get(d.a()).getScaledTouchSlop();

    /* renamed from: e  reason: collision with root package name */
    private a f70233e;

    static {
        Covode.recordClassIndex(43318);
    }

    class a {

        /* renamed from: a  reason: collision with root package name */
        public int f70234a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f70235b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f70236c = -1;

        static {
            Covode.recordClassIndex(43319);
        }

        a() {
        }
    }

    private void a(Context context) {
        if (this.f70230b == 0) {
            this.f70230b = n.a(context);
        }
    }

    private void b(Context context) {
        if (this.f70229a == 0) {
            this.f70229a = n.b(context);
        }
    }

    private static boolean a(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.getItemViewType() == 0) {
            return true;
        }
        return false;
    }

    public static void a(RecyclerView recyclerView) {
        g gVar;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView.ViewHolder a2 = recyclerView.a(recyclerView.getChildAt(i2));
                if ((a2 instanceof g) && (gVar = (g) a2) != null) {
                    gVar.ak_();
                }
            }
        }
    }

    private static boolean b(RecyclerView recyclerView) {
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).f3778j == 1) {
                return true;
            }
            return false;
        } else if (!(layoutManager instanceof StaggeredGridLayoutManager) || ((StaggeredGridLayoutManager) layoutManager).f3900e != 1) {
            return false;
        } else {
            return true;
        }
    }

    private void c(RecyclerView recyclerView, boolean z) {
        int i2;
        b(recyclerView.getContext());
        recyclerView.getLocationOnScreen(this.f70231c);
        recyclerView.getLayoutManager();
        int childCount = recyclerView.getChildCount();
        int i3 = this.f70231c[1];
        int min = Math.min(this.f70229a, recyclerView.getHeight() + i3);
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            RecyclerView.ViewHolder a2 = recyclerView.a(childAt);
            if (a(a2)) {
                g gVar = (g) a2;
                if (!gVar.aZ_()) {
                    if (z) {
                        gVar.c();
                    }
                }
                int p = RecyclerView.i.p(childAt);
                int r = RecyclerView.i.r(childAt);
                int height = childAt.getHeight();
                if (p >= 0) {
                    int i5 = r + i3;
                    if (i5 > min) {
                        i2 = height - (i5 - min);
                    } else {
                        i2 = height;
                    }
                } else if (r <= min) {
                    i2 = p + height;
                }
                if (i2 * 4 > height * 3) {
                    gVar.a(true);
                    gVar.am_();
                } else {
                    gVar.a(false);
                    gVar.ak_();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void a(RecyclerView recyclerView, int i2) {
        super.a(recyclerView, i2);
        if (i2 == 0) {
            a(recyclerView, false);
        }
    }

    private void b(RecyclerView recyclerView, boolean z) {
        boolean z2;
        int i2;
        a(recyclerView.getContext());
        b(recyclerView.getContext());
        recyclerView.getLocationOnScreen(this.f70231c);
        recyclerView.getLayoutManager();
        int childCount = recyclerView.getChildCount();
        int i3 = this.f70231c[0];
        int min = Math.min(this.f70230b, recyclerView.getWidth() + i3);
        int height = recyclerView.getHeight();
        int[] iArr = this.f70231c;
        if (iArr[1] + (height >> 2) <= 0 || this.f70229a - iArr[1] <= (height >> 1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            RecyclerView.ViewHolder a2 = recyclerView.a(childAt);
            if (a(a2)) {
                g gVar = (g) a2;
                if (!gVar.aZ_()) {
                    if (z) {
                        gVar.c();
                    }
                }
                if (!z2) {
                    int o = RecyclerView.i.o(childAt);
                    int q = RecyclerView.i.q(childAt);
                    int width = childAt.getWidth();
                    if (o >= 0) {
                        int i5 = q + i3;
                        if (i5 > min) {
                            i2 = width - (i5 - min);
                        } else {
                            i2 = width;
                        }
                    } else if (q <= min) {
                        i2 = o + width;
                    }
                    if (i2 * 4 > width * 3) {
                        gVar.a(true);
                        gVar.am_();
                    }
                }
                gVar.a(false);
                gVar.ak_();
            }
        }
    }

    public final void a(RecyclerView recyclerView, boolean z) {
        if (b(recyclerView)) {
            c(recyclerView, z);
        } else {
            b(recyclerView, z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        int scrollState = recyclerView.getScrollState();
        if (this.f70233e == null) {
            this.f70233e = new a();
        }
        if (scrollState != 0) {
            return;
        }
        if (this.f70233e.f70234a != scrollState || this.f70233e.f70235b != i2 || this.f70233e.f70236c != i3) {
            this.f70233e.f70234a = scrollState;
            this.f70233e.f70235b = i2;
            this.f70233e.f70236c = i3;
            d.a();
            if (o.a()) {
                if (b(recyclerView)) {
                    i2 = i3;
                }
                if (Math.abs(i2) <= this.f70232d) {
                    a(recyclerView, false);
                }
            }
        }
    }
}
