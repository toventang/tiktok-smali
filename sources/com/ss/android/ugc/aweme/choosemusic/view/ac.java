package com.ss.android.ugc.aweme.choosemusic.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.viewholder.a;
import com.ss.android.ugc.aweme.choosemusic.viewholder.s;
import h.f.b.l;
import java.util.Objects;

public final class ac extends o {
    static {
        Covode.recordClassIndex(43630);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.view.o
    public final void a() {
        float b2 = n.b(this.f70855b, 16.0f);
        this.f70857d.setPadding(0, 0, 0, 0);
        this.f70857d.setBackgroundColor(0);
        LinearLayout linearLayout = this.f70857d;
        l.b(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
        this.f70857d.requestLayout();
        TextView textView = this.f70859f;
        l.b(textView, "");
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i2 = (int) b2;
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin += i2;
        View view = this.f70860g;
        l.b(view, "");
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = i2;
        View view2 = this.f70860g;
        l.b(view2, "");
        view2.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.view.o
    public final void a(s sVar) {
        ((a) sVar).itemView.setPadding(0, 0, 0, 0);
    }

    public ac(View view, int i2) {
        super(view, i2);
    }
}
