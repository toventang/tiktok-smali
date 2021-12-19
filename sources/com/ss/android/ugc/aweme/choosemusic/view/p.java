package com.ss.android.ugc.aweme.choosemusic.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.viewholder.s;
import h.f.b.l;
import java.util.Objects;

public final class p extends b {
    static {
        Covode.recordClassIndex(43653);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.view.b
    public final void a() {
        float b2 = n.b(this.f70801b, 16.0f);
        this.f70803d.setPadding(0, 0, 0, 0);
        this.f70803d.setBackgroundColor(0);
        LinearLayout linearLayout = this.f70803d;
        l.b(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
        this.f70803d.requestLayout();
        View view = this.f70807h;
        l.b(view, "");
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) b2;
        View view2 = this.f70807h;
        l.b(view2, "");
        view2.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.view.b
    public final void a(s sVar) {
        sVar.b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(View view, int i2) {
        super(view, i2);
        l.d(view, "");
    }
}
