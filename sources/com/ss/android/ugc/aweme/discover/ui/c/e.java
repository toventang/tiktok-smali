package com.ss.android.ugc.aweme.discover.ui.c;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.widget.g;
import com.ss.android.ugc.aweme.utils.gb;
import h.f.b.l;
import h.g.a;

public final class e extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f82522a;

    /* renamed from: b  reason: collision with root package name */
    private final int f82523b = 2;

    /* renamed from: c  reason: collision with root package name */
    private final int f82524c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f82525d;

    static {
        Covode.recordClassIndex(51375);
    }

    public e(int i2) {
        this.f82524c = i2;
        this.f82525d = true;
        this.f82522a = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        int i2;
        int a2;
        int a3;
        int i3;
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        int d2 = RecyclerView.d(view);
        RecyclerView.a adapter = recyclerView.getAdapter();
        if ((adapter instanceof g) && ((g) adapter).b() != null) {
            if (d2 != 0) {
                d2++;
            } else {
                return;
            }
        }
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            if (gridLayoutManager == null) {
                l.b();
            }
            GridLayoutManager.c cVar = gridLayoutManager.f3765g;
            int a4 = cVar.a(d2, this.f82523b);
            int a5 = cVar.a(d2);
            boolean a6 = gb.a();
            if (this.f82522a) {
                int i4 = this.f82523b;
                if (a5 == i4) {
                    return;
                }
                if (!a6) {
                    int i5 = this.f82524c;
                    rect.left = i5 - ((a4 * i5) / i4);
                    a2 = ((a4 + 1) * this.f82524c) / this.f82523b;
                } else {
                    int i6 = this.f82524c;
                    rect.right = i6 - ((a4 * i6) / i4);
                    rect.left = ((a4 + 1) * this.f82524c) / this.f82523b;
                    return;
                }
            } else if (a4 == 0) {
                if (!a6) {
                    a3 = this.f82524c * 2;
                } else {
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    a3 = (int) (((float) a.a(TypedValue.applyDimension(1, 7.0f, system.getDisplayMetrics()))) / 2.0f);
                }
                rect.left = a3;
                if (!a6) {
                    Resources system2 = Resources.getSystem();
                    l.a((Object) system2, "");
                    i3 = (int) (((float) a.a(TypedValue.applyDimension(1, 7.0f, system2.getDisplayMetrics()))) / 2.0f);
                } else {
                    i3 = this.f82524c * 2;
                }
                rect.right = i3;
                return;
            } else {
                if (!a6) {
                    Resources system3 = Resources.getSystem();
                    l.a((Object) system3, "");
                    i2 = (int) (((float) a.a(TypedValue.applyDimension(1, 7.0f, system3.getDisplayMetrics()))) / 2.0f);
                } else {
                    i2 = this.f82524c * 2;
                }
                rect.left = i2;
                if (!a6) {
                    a2 = this.f82524c * 2;
                } else {
                    Resources system4 = Resources.getSystem();
                    l.a((Object) system4, "");
                    a2 = (int) (((float) a.a(TypedValue.applyDimension(1, 7.0f, system4.getDisplayMetrics()))) / 2.0f);
                }
            }
            rect.right = a2;
        }
    }
}
