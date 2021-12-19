package com.ss.android.ugc.aweme.story.feed.common.a;

import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.common.b;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends b {
    static {
        Covode.recordClassIndex(90055);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.b
    public final void a(Aweme aweme, int i2) {
        l.d(aweme, "");
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.b
    public final void b(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.b
    public final void g() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* bridge */ /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.b
    public final void a(int i2) {
        Aweme c2 = a().c(i2);
        if (c2 == null) {
            return;
        }
        if (com.ss.android.ugc.aweme.story.c.b.b() || !com.ss.android.ugc.aweme.story.d.a.f(c2)) {
            LinearLayout linearLayout = (LinearLayout) f().findViewById(R.id.ch2);
            l.b(linearLayout, "");
            linearLayout.setVisibility(8);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) f().findViewById(R.id.ch2);
        l.b(linearLayout2, "");
        linearLayout2.setVisibility(0);
        TuxTextView tuxTextView = (TuxTextView) f().findViewById(R.id.f_d);
        l.b(tuxTextView, "");
        tuxTextView.setText("@" + in.b(c2.getAuthor()));
        TuxTextView tuxTextView2 = (TuxTextView) f().findViewById(R.id.f54);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(" · " + e().getString(R.string.cqe));
    }
}
