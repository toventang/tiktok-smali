package com.airbnb.epoxy;

import android.graphics.Rect;
import android.view.View;
import androidx.core.h.v;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public class r extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    public int f5066a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5067b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5068c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5069d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5070e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5071f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5072g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5073h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5074i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5075j;

    static {
        Covode.recordClassIndex(2146);
    }

    public r() {
        this((byte) 0);
    }

    private r(byte b2) {
        this.f5066a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i2;
        int i3;
        int i4;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        rect.setEmpty();
        int d2 = RecyclerView.d(view);
        if (d2 != -1) {
            RecyclerView.i layoutManager = recyclerView.getLayoutManager();
            int itemCount = recyclerView.getAdapter().getItemCount();
            boolean z12 = true;
            int i5 = 0;
            if (d2 == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f5069d = z;
            int i6 = itemCount - 1;
            if (d2 == i6) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f5070e = z2;
            this.f5068c = layoutManager.f();
            this.f5067b = layoutManager.g();
            boolean z13 = layoutManager instanceof GridLayoutManager;
            this.f5071f = z13;
            if (z13) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                GridLayoutManager.c cVar = gridLayoutManager.f3765g;
                int a2 = cVar.a(d2);
                int i7 = gridLayoutManager.f3760b;
                int a3 = cVar.a(d2, i7);
                if (a3 == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.f5072g = z8;
                if (a3 + a2 == i7) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f5073h = z9;
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    if (i8 > d2) {
                        z10 = true;
                        break;
                    }
                    i9 += cVar.a(i8);
                    if (i9 > i7) {
                        z10 = false;
                        break;
                    }
                    i8++;
                }
                this.f5074i = z10;
                if (!z10) {
                    int i10 = 0;
                    while (true) {
                        if (i6 < d2) {
                            z11 = true;
                            break;
                        }
                        i10 += cVar.a(i6);
                        if (i10 > i7) {
                            break;
                        }
                        i6--;
                    }
                }
                z11 = false;
                this.f5075j = z11;
            }
            boolean z14 = this.f5071f;
            if (!z14 ? !this.f5068c || this.f5069d : (!this.f5068c || this.f5074i) && (!this.f5067b || this.f5072g)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z14 ? !this.f5068c || this.f5070e : (!this.f5068c || this.f5075j) && (!this.f5067b || this.f5073h)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z14 ? !this.f5067b || this.f5069d : (!this.f5068c || this.f5072g) && (!this.f5067b || this.f5074i)) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z14 ? !this.f5067b || this.f5070e : (!this.f5068c || this.f5073h) && (!this.f5067b || this.f5075j)) {
                z6 = false;
            } else {
                z6 = true;
            }
            boolean z15 = this.f5068c;
            if (!(layoutManager instanceof LinearLayoutManager) || !((LinearLayoutManager) layoutManager).f3780l) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (v.e(layoutManager.w) != 1) {
                z12 = false;
            }
            if (z15 && z12) {
                z7 = !z7;
            }
            if (!z7) {
                z4 = z3;
                z3 = z4;
            } else if (!this.f5068c) {
                z5 = z6;
                z6 = z5;
                z4 = z3;
                z3 = z4;
            }
            int i11 = this.f5066a / 2;
            if (z3) {
                i2 = i11;
            } else {
                i2 = 0;
            }
            rect.right = i2;
            if (z4) {
                i3 = i11;
            } else {
                i3 = 0;
            }
            rect.left = i3;
            if (z5) {
                i4 = i11;
            } else {
                i4 = 0;
            }
            rect.top = i4;
            if (z6) {
                i5 = i11;
            }
            rect.bottom = i5;
        }
    }
}
