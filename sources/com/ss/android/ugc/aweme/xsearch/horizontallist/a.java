package com.ss.android.ugc.aweme.xsearch.horizontallist;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.d.f;
import com.ss.android.ugc.aweme.dh.e;
import h.f.b.l;

public final class a extends f {

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f145161e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f145162f;

    /* renamed from: g  reason: collision with root package name */
    public final int f145163g;

    static {
        Covode.recordClassIndex(94922);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.f, com.ss.android.ugc.aweme.autoplay.d.e
    public final int a(View view, x xVar) {
        float f2;
        l.d(view, "");
        l.d(xVar, "");
        int a2 = super.a(view, xVar);
        int e2 = RecyclerView.e(view);
        if (e2 == -1 || e2 == 0) {
            return a2;
        }
        RecyclerView.h d2 = this.f145161e.d();
        l.b(d2, "");
        if (d2 instanceof e) {
            f2 = ((e) d2).f80114a;
        } else {
            f2 = 0.0f;
        }
        float f3 = ((float) a2) + f2;
        int i2 = (int) f3;
        if (((float) i2) - f3 > 0.0f) {
            return i2 - 1;
        }
        return i2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(RecyclerView recyclerView, boolean z, int i2) {
        super(z, i2);
        l.d(recyclerView, "");
        this.f145161e = recyclerView;
        this.f145162f = z;
        this.f145163g = i2;
    }
}
