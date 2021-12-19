package com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom;

import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ar;
import com.zhiliaoapp.musically.R;

public final class c extends m {
    static {
        Covode.recordClassIndex(63501);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.m
    public final void a() {
        boolean z = this.f99623j;
        boolean z2 = this.f99624k;
        if (z) {
            r();
            s();
            this.f99621h.setTuxFont(93);
            this.f99616c.setImageDrawable(this.f99622i.a(2131232125, getContext()));
            this.f99621h.setTextColor(b.c(getContext(), R.color.a9));
            this.f99616c.setAlpha(1.0f);
            if (this.f99617d != null) {
                this.f99617d.setAlpha(0.0f);
                return;
            }
            return;
        }
        t();
        s();
        this.f99621h.setTuxFont(92);
        if (z2) {
            this.f99621h.setTextColor(b.c(getContext(), R.color.c5));
            this.f99617d.setImageDrawable(this.f99622i.a(2131232126, getContext()));
        } else {
            this.f99621h.setTextColor(b.c(getContext(), R.color.aa));
            this.f99617d.setImageDrawable(this.f99622i.a(2131232127, getContext()));
        }
        if (this.f99616c != null) {
            this.f99616c.setAlpha(0.0f);
        }
        this.f99617d.setAlpha(1.0f);
    }

    public c(ar arVar) {
        super(arVar);
    }
}
