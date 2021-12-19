package com.ss.android.ugc.aweme.dsp.ui;

import android.widget.ImageView;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ar;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.m;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends m {
    static {
        Covode.recordClassIndex(52365);
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.m
    public final void a() {
        boolean z = this.f99623j;
        boolean z2 = this.f99624k;
        if (z) {
            r();
            s();
            this.f99621h.setTuxFont(93);
            if (z2) {
                this.f99616c.setImageDrawable(this.f99622i.a(2131233252, getContext()));
                this.f99621h.setTextColor(b.c(getContext(), R.color.c5));
            } else {
                this.f99616c.setImageDrawable(this.f99622i.a(2131233255, getContext()));
                this.f99621h.setTextColor(b.c(getContext(), R.color.a9));
            }
            ImageView imageView = this.f99616c;
            l.b(imageView, "");
            imageView.setAlpha(1.0f);
            if (this.f99617d != null) {
                ImageView imageView2 = this.f99617d;
                l.b(imageView2, "");
                imageView2.setAlpha(0.0f);
                return;
            }
            return;
        }
        t();
        s();
        this.f99621h.setTuxFont(92);
        if (z2) {
            this.f99621h.setTextColor(b.c(getContext(), R.color.c5));
            this.f99617d.setImageDrawable(this.f99622i.a(2131233254, getContext()));
        } else {
            this.f99621h.setTextColor(b.c(getContext(), R.color.aa));
            this.f99617d.setImageDrawable(this.f99622i.a(2131233253, getContext()));
        }
        if (this.f99616c != null) {
            ImageView imageView3 = this.f99616c;
            l.b(imageView3, "");
            imageView3.setAlpha(0.0f);
        }
        ImageView imageView4 = this.f99617d;
        l.b(imageView4, "");
        imageView4.setAlpha(1.0f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ar arVar) {
        super(arVar);
        l.d(arVar, "");
    }
}
