package com.ss.android.ugc.aweme.music.ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.challenge.a.c;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class v extends c {
    static {
        Covode.recordClassIndex(72002);
    }

    @Override // com.ss.android.ugc.aweme.challenge.a.c
    public final boolean d() {
        return true;
    }

    public v(View view, String str, d dVar) {
        super(view, str, dVar);
    }

    @Override // com.ss.android.ugc.aweme.challenge.a.c
    public final void b(Aweme aweme, int i2, boolean z) {
        super.b(aweme, i2, z);
        if (aweme.getMusicStarter() != null) {
            this.f69881f.setVisibility(0);
            if (!TextUtils.isEmpty(aweme.getLabelMusicStarterText())) {
                this.f69881f.setText(aweme.getLabelMusicStarterText());
            }
        }
        if (aweme.isPgcShow()) {
            if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                this.f69879d.setVisibility(0);
                this.f69878c.setVisibility(8);
                a(this.f69879d, aweme.getTextTopLabels().get(0));
            }
        } else if (aweme.getMusicStarter() != null || aweme.getOriginAuthor() != null || !TextUtils.equals(this.f69877b, "challenge") || aweme.getIsTop() != 1) {
        } else {
            if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                this.f69879d.setVisibility(8);
                this.f69878c.setVisibility(0);
                e.a(this.f69878c, aweme.getLabelTop(), (int) n.b(this.f69876a, 6.0f), (int) n.b(this.f69876a, 6.0f));
                return;
            }
            this.f69879d.setVisibility(0);
            this.f69878c.setVisibility(8);
            a(this.f69879d, aweme.getTextTopLabels().get(0));
        }
    }
}
