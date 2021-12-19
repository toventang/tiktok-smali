package com.ss.android.ugc.aweme.ad.feed.mask;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.model.ae;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;

public final class l extends d {
    static {
        Covode.recordClassIndex(40592);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.d
    public final void c() {
        ae nativeCardInfo;
        AwemeRawAd awemeRawAd = this.f65977b.getAwemeRawAd();
        if (awemeRawAd != null && (nativeCardInfo = awemeRawAd.getNativeCardInfo()) != null) {
            View findViewById = a(this.f65980e, R.layout.afm).findViewById(R.id.gz);
            h.f.b.l.b(findViewById, "");
            RemoteImageView remoteImageView = (RemoteImageView) findViewById;
            remoteImageView.setVisibility(0);
            e.a(remoteImageView, nativeCardInfo.image);
            remoteImageView.setOnClickListener(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.ad.feed.mask.d
    public final void a(View view) {
        Integer valueOf;
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null && valueOf.intValue() == R.id.gz) {
            this.f65978c.a(19);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(LinearLayout linearLayout, c cVar) {
        super(linearLayout, cVar);
        h.f.b.l.d(linearLayout, "");
        h.f.b.l.d(cVar, "");
    }
}
