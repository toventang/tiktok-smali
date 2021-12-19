package com.ss.android.ugc.aweme.duet.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends com.ss.android.ugc.aweme.challenge.a.c {
    private final String q;

    static {
        Covode.recordClassIndex(52460);
    }

    @Override // com.ss.android.ugc.aweme.challenge.a.c
    public final void b(Aweme aweme, int i2, boolean z) {
        if (aweme != null) {
            super.b(aweme, i2, z);
            if (TextUtils.equals(this.q, aweme.getAid())) {
                TextView textView = this.f69881f;
                l.b(textView, "");
                textView.setVisibility(0);
                this.f69881f.setText(R.string.cup);
            }
            if (aweme.isPgcShow()) {
                if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                    TextView textView2 = this.f69879d;
                    l.b(textView2, "");
                    textView2.setVisibility(0);
                    RemoteImageView remoteImageView = this.f69878c;
                    l.b(remoteImageView, "");
                    remoteImageView.setVisibility(8);
                    a(this.f69879d, aweme.getTextTopLabels().get(0));
                }
            } else if (aweme.getOriginAuthor() != null) {
                TextView textView3 = this.f69880e;
                l.b(textView3, "");
                textView3.setVisibility(0);
                if (!TextUtils.isEmpty(aweme.getLabelOriginAuthorText())) {
                    TextView textView4 = this.f69880e;
                    l.b(textView4, "");
                    textView4.setText(aweme.getLabelOriginAuthorText());
                }
                RemoteImageView remoteImageView2 = this.f69878c;
                l.b(remoteImageView2, "");
                remoteImageView2.setVisibility(4);
            } else if (aweme.getMusicStarter() != null || aweme.getOriginAuthor() != null || !TextUtils.equals(this.f69877b, "challenge") || aweme.getIsTop() != 1) {
            } else {
                if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                    TextView textView5 = this.f69879d;
                    l.b(textView5, "");
                    textView5.setVisibility(8);
                    RemoteImageView remoteImageView3 = this.f69878c;
                    l.b(remoteImageView3, "");
                    remoteImageView3.setVisibility(0);
                    UrlModel labelTop = aweme.getLabelTop();
                    l.b(labelTop, "");
                    e.a(this.f69878c, labelTop, (int) n.b(this.f69876a, 6.0f), (int) n.b(this.f69876a, 6.0f));
                    return;
                }
                TextView textView6 = this.f69879d;
                l.b(textView6, "");
                textView6.setVisibility(0);
                RemoteImageView remoteImageView4 = this.f69878c;
                l.b(remoteImageView4, "");
                remoteImageView4.setVisibility(8);
                a(this.f69879d, aweme.getTextTopLabels().get(0));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str, View view, String str2, d dVar) {
        super(view, str2, dVar);
        l.d(str, "");
        l.d(view, "");
        this.q = str;
    }
}
