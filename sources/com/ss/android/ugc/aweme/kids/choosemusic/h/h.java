package com.ss.android.ugc.aweme.kids.choosemusic.h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.choosemusic.i.o;
import h.f.b.l;
import java.util.Objects;

public final class h extends b {
    static {
        Covode.recordClassIndex(67688);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.h.b
    public final void a() {
        float b2 = n.b(this.f105671b, 16.0f);
        this.f105673d.setPadding(0, 0, 0, 0);
        this.f105673d.setBackgroundColor(0);
        LinearLayout linearLayout = this.f105673d;
        l.b(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
        this.f105673d.requestLayout();
        TextView textView = this.f105674e;
        l.b(textView, "");
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i2 = (int) b2;
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin += i2;
        View view = this.f105676g;
        l.b(view, "");
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = i2;
        View view2 = this.f105676g;
        l.b(view2, "");
        view2.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.choosemusic.h.b
    public final void a(o oVar) {
        oVar.b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(View view, int i2) {
        super(view, i2);
        l.d(view, "");
    }
}
