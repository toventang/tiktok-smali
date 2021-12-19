package com.ss.android.ugc.aweme.ad.feed.mask;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.a;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.model.ae;
import com.ss.android.ugc.aweme.commercialize.uikit.AdRatingView;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class k extends d {
    static {
        Covode.recordClassIndex(40591);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.mask.d
    public final void c() {
        ae nativeCardInfo;
        AwemeRawAd awemeRawAd = this.f65977b.getAwemeRawAd();
        if (awemeRawAd != null && (nativeCardInfo = awemeRawAd.getNativeCardInfo()) != null) {
            View a2 = a(this.f65980e, R.layout.afl);
            View findViewById = a2.findViewById(R.id.eq);
            l.b(findViewById, "");
            RemoteImageView remoteImageView = (RemoteImageView) findViewById;
            if (TextUtils.isEmpty(nativeCardInfo.imageUrl)) {
                ((a) remoteImageView.getHierarchy()).a(q.b.f47440f);
                e.a(remoteImageView, com.ss.android.ugc.aweme.base.model.a.a(2131232430));
            } else {
                ((a) remoteImageView.getHierarchy()).a(q.b.f47436b);
                e.b(remoteImageView, nativeCardInfo.imageUrl, -1, -1);
            }
            remoteImageView.setOnClickListener(this);
            View findViewById2 = a2.findViewById(R.id.gr);
            l.b(findViewById2, "");
            TextView textView = (TextView) findViewById2;
            if (TextUtils.isEmpty(nativeCardInfo.title)) {
                textView.setVisibility(8);
            } else {
                textView.setText(nativeCardInfo.title);
            }
            View findViewById3 = a2.findViewById(R.id.ez);
            l.b(findViewById3, "");
            TextView textView2 = (TextView) findViewById3;
            if (TextUtils.isEmpty(nativeCardInfo.featureLabel)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(nativeCardInfo.featureLabel);
            }
            ((LinearLayout) a2.findViewById(R.id.gs)).setOnClickListener(this);
            View findViewById4 = a2.findViewById(R.id.fe);
            l.b(findViewById4, "");
            LinearLayout linearLayout = (LinearLayout) findViewById4;
            View findViewById5 = a2.findViewById(R.id.g9);
            l.b(findViewById5, "");
            AdRatingView adRatingView = (AdRatingView) findViewById5;
            View findViewById6 = a2.findViewById(R.id.d5);
            l.b(findViewById6, "");
            TextView textView3 = (TextView) findViewById6;
            if (nativeCardInfo.feedbackRate < 80) {
                linearLayout.setVisibility(8);
            } else if (nativeCardInfo.feedbackRate < 90) {
                adRatingView.setRatingProgress(4.0f);
                textView3.setText(String.valueOf(nativeCardInfo.feedbackRate) + this.f65976a.getString(R.string.c5j));
            } else if (nativeCardInfo.feedbackRate <= 100) {
                adRatingView.setRatingProgress(5.0f);
                textView3.setText(String.valueOf(nativeCardInfo.feedbackRate) + this.f65976a.getString(R.string.c5j));
            } else {
                adRatingView.setRatingProgress(5.0f);
                textView3.setText("100" + this.f65976a.getString(R.string.c5j));
            }
            linearLayout.setOnClickListener(this);
            View findViewById7 = a2.findViewById(R.id.g4);
            l.b(findViewById7, "");
            View findViewById8 = a2.findViewById(R.id.gb);
            l.b(findViewById8, "");
            ((TextView) findViewById7).setText(nativeCardInfo.originPrice);
            ((TextView) findViewById8).setText(nativeCardInfo.service);
            ((LinearLayout) a2.findViewById(R.id.g5)).setOnClickListener(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.ad.feed.mask.d
    public final void a(View view) {
        Integer valueOf;
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.eq) {
                this.f65978c.a(19);
            } else if (valueOf.intValue() == R.id.gs) {
                this.f65978c.a(20);
            } else if (valueOf.intValue() == R.id.fe) {
                this.f65978c.a(13);
            } else if (valueOf.intValue() == R.id.g5) {
                this.f65978c.a(21);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(LinearLayout linearLayout, c cVar) {
        super(linearLayout, cVar);
        l.d(linearLayout, "");
        l.d(cVar, "");
    }
}
