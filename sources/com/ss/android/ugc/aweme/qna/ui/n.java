package com.ss.android.ugc.aweme.qna.ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.qna.model.f;
import com.ss.android.ugc.aweme.qna.model.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class n extends g {
    static {
        Covode.recordClassIndex(77711);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(View view) {
        super(view);
        l.d(view, "");
    }

    @Override // com.ss.android.ugc.aweme.qna.ui.g
    public final void a(f fVar) {
        l.d(fVar, "");
        String str = ((h) fVar).f119514j;
        if (str != null) {
            View findViewById = this.f119574c.findViewById(R.id.de5);
            l.b(findViewById, "");
            ((TuxTextView) findViewById).setText(str);
        }
    }
}
