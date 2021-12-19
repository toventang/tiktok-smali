package com.ss.android.ugc.aweme.challenge.ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.challenge.a.c;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

public final class i extends c {
    static {
        Covode.recordClassIndex(43257);
    }

    @Override // com.ss.android.ugc.aweme.challenge.a.c
    public final boolean d() {
        return true;
    }

    public i(View view, String str, d dVar) {
        super(view, str, dVar);
    }

    @Override // com.ss.android.ugc.aweme.challenge.a.c
    public final void b(Aweme aweme, int i2, boolean z) {
        super.b(aweme, i2, z);
        if (aweme.isPgcShow()) {
            if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                this.f69879d.setVisibility(0);
                this.f69878c.setVisibility(8);
                a(this.f69879d, aweme.getTextTopLabels().get(0));
            }
        } else if (aweme.getOriginAuthor() == null && aweme.getMusicStarter() == null && aweme.getOriginAuthor() == null && TextUtils.equals(this.f69877b, "challenge")) {
            if (aweme.getIsTop() == 1) {
                if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                    this.f69879d.setVisibility(8);
                    this.f69878c.setVisibility(0);
                    e.a(this.f69878c, aweme.getLabelTop(), (int) n.b(this.f69876a, 6.0f), (int) n.b(this.f69876a, 6.0f));
                } else {
                    this.f69879d.setVisibility(0);
                    this.f69878c.setVisibility(8);
                    a(this.f69879d, aweme.getTextTopLabels().get(0));
                }
            }
            if (i2 == 0) {
                int a2 = b.a().a(true, "[Discover] Hashtag - Instagram layout", 1);
                if (a2 == 4) {
                    this.f69881f.setText(R.string.erb);
                    this.f69881f.setVisibility(0);
                } else if (a2 == 5) {
                    this.f69881f.setText(R.string.f9p);
                    this.f69881f.setVisibility(0);
                }
            }
        }
    }
}
