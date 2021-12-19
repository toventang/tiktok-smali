package com.ss.android.ugc.aweme.discover.jedi.a;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.utils.ap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.widget.g;
import com.ss.android.ugc.aweme.utils.gb;

public final class b extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    private int f81313a = 2;

    /* renamed from: b  reason: collision with root package name */
    private int f81314b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f81315c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f81316d = true;

    static {
        Covode.recordClassIndex(50531);
    }

    public b(int i2, boolean z) {
        this.f81314b = i2;
        this.f81315c = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        int i2;
        int a2;
        int a3;
        int i3;
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
            GridLayoutManager.c cVar = ((GridLayoutManager) recyclerView.getLayoutManager()).f3765g;
            int a4 = cVar.a(d2, this.f81313a);
            int a5 = cVar.a(d2);
            boolean a6 = gb.a();
            if (this.f81315c) {
                int i4 = this.f81313a;
                if (a5 != i4) {
                    if (this.f81316d) {
                        if (!a6) {
                            int i5 = this.f81314b;
                            rect.left = i5 - ((a4 * i5) / i4);
                            a2 = ((a4 + 1) * this.f81314b) / this.f81313a;
                        } else {
                            int i6 = this.f81314b;
                            rect.right = i6 - ((a4 * i6) / i4);
                            rect.left = ((a4 + 1) * this.f81314b) / this.f81313a;
                            rect.top = this.f81314b;
                            return;
                        }
                    } else if (a4 == 0) {
                        if (!a6) {
                            a3 = this.f81314b * 2;
                        } else {
                            a3 = ((int) ap.a(view.getContext(), 7.0f)) / 2;
                        }
                        rect.left = a3;
                        if (!a6) {
                            i3 = ((int) ap.a(view.getContext(), 7.0f)) / 2;
                        } else {
                            i3 = this.f81314b * 2;
                        }
                        rect.right = i3;
                        rect.top = this.f81314b;
                        return;
                    } else {
                        if (!a6) {
                            i2 = ((int) ap.a(view.getContext(), 7.0f)) / 2;
                        } else {
                            i2 = this.f81314b * 2;
                        }
                        rect.left = i2;
                        if (!a6) {
                            a2 = this.f81314b * 2;
                        } else {
                            a2 = ((int) ap.a(view.getContext(), 7.0f)) / 2;
                        }
                    }
                    rect.right = a2;
                    rect.top = this.f81314b;
                    return;
                }
                return;
            }
            rect.left = (this.f81314b * a4) / this.f81313a;
            int i7 = this.f81314b;
            rect.right = i7 - (((a4 + 1) * i7) / this.f81313a);
            if (d2 >= this.f81313a) {
                rect.top = this.f81314b;
            }
        }
    }
}
