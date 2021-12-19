package com.ss.android.ugc.aweme.emoji.emojiPageV2;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.utils.gb;
import h.f.b.l;

public final class b extends RecyclerView.h {

    /* renamed from: a  reason: collision with root package name */
    public final int f89138a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final int f89139b;

    /* renamed from: c  reason: collision with root package name */
    public int f89140c;

    /* renamed from: d  reason: collision with root package name */
    public int f89141d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f89142e;

    static {
        Covode.recordClassIndex(56060);
    }

    public b(int i2, int i3, int i4) {
        this.f89139b = i2;
        this.f89140c = i3;
        this.f89141d = i4;
        this.f89142e = gb.a(d.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        int i2;
        l.d(rect, "");
        l.d(view, "");
        l.d(recyclerView, "");
        l.d(sVar, "");
        int d2 = RecyclerView.d(view);
        int i3 = this.f89139b;
        if (d2 >= 0 && i3 > d2) {
            rect.top = (int) n.b(view.getContext(), 16.0f);
        }
        if (d2 >= this.f89139b) {
            rect.top = this.f89141d;
        }
        int i4 = this.f89139b;
        int i5 = d2 % i4;
        int i6 = this.f89140c;
        int i7 = (i5 * i6) / i4;
        int i8 = i6 - (((i5 + 1) * i6) / i4);
        if (this.f89142e) {
            i2 = i8;
        } else {
            i2 = i7;
        }
        rect.left = i2;
        if (!this.f89142e) {
            i7 = i8;
        }
        rect.right = i7;
        RecyclerView.a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            l.b(adapter, "");
            int itemCount = adapter.getItemCount() % this.f89139b;
            if (itemCount == 0) {
                if (d2 >= (adapter.getItemCount() - 1) - this.f89139b) {
                    rect.bottom = (int) n.b(view.getContext(), 10.0f);
                }
            } else if (d2 >= adapter.getItemCount() - itemCount) {
                rect.bottom = (int) n.b(view.getContext(), 10.0f);
            }
        }
    }
}
