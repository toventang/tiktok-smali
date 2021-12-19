package com.ss.android.ugc.aweme.commercialize.profile.impl;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.profile.api.d;
import com.ss.android.ugc.aweme.commercialize.profile.api.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class f extends a {

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f75206e;

    /* renamed from: f  reason: collision with root package name */
    private final h f75207f = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(46401);
    }

    private final TextView c() {
        return (TextView) this.f75207f.getValue();
    }

    static final class a extends m implements h.f.a.a<TextView> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(46402);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.f75206e.findViewById(R.id.fag);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(LinearLayout linearLayout) {
        super(linearLayout);
        l.d(linearLayout, "");
        this.f75206e = linearLayout;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.a, com.ss.android.ugc.aweme.commercialize.profile.impl.a
    public final void a(int i2) {
        ViewGroup.LayoutParams layoutParams = this.f75206e.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i3 = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
        if (i3 >= 0) {
            LinearLayout linearLayout = this.f75206e;
            ValueAnimator a2 = com.ss.android.ugc.aweme.commercialize.uikit.a.a.a(linearLayout, i3, (linearLayout.getMeasuredHeight() + 1) * -1, i2);
            l.b(a2, "");
            a2.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.impl.a
    public final void onClick(View view) {
        Integer valueOf;
        d dVar;
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.dh) {
                d dVar2 = this.f75188c;
                if (dVar2 != null) {
                    dVar2.a();
                }
                a(300);
            } else if ((valueOf.intValue() == R.id.di || valueOf.intValue() == R.id.dj) && (dVar = this.f75188c) != null) {
                dVar.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.a, com.ss.android.ugc.aweme.commercialize.profile.impl.a
    public final void a(e eVar) {
        AwemeRawAd awemeRawAd;
        l.d(eVar, "");
        super.a(eVar);
        Aweme aweme = this.f75187b;
        AwemeRawAd awemeRawAd2 = null;
        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
            Aweme aweme2 = this.f75187b;
            if (aweme2 != null) {
                awemeRawAd = aweme2.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            if (!TextUtils.isEmpty(b.a(awemeRawAd))) {
                TextView c2 = c();
                l.b(c2, "");
                Aweme aweme3 = this.f75187b;
                if (aweme3 != null) {
                    awemeRawAd2 = aweme3.getAwemeRawAd();
                }
                c2.setText(b.a(awemeRawAd2));
            }
        }
        if (gb.a()) {
            TextView c3 = c();
            l.b(c3, "");
            c3.setGravity(21);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.a, com.ss.android.ugc.aweme.commercialize.profile.impl.a
    public final void a(boolean z) {
        AwemeRawAd awemeRawAd;
        ViewGroup.LayoutParams layoutParams = this.f75206e.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i2 = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
        if (i2 < 0) {
            ValueAnimator a2 = com.ss.android.ugc.aweme.commercialize.uikit.a.a.a(this.f75206e, i2, 0, 300);
            l.b(a2, "");
            a2.start();
        }
        if (z) {
            Aweme aweme = this.f75187b;
            AwemeRawAd awemeRawAd2 = null;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            com.ss.android.ugc.aweme.commercialize.profile.impl.a.b.a(awemeRawAd);
            Aweme aweme2 = this.f75187b;
            if (aweme2 != null) {
                awemeRawAd2 = aweme2.getAwemeRawAd();
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "button_show", awemeRawAd2).c();
        }
    }
}
