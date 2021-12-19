package com.ss.android.ugc.aweme.commercialize.profile.impl;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.commercialize.profile.api.d;
import com.ss.android.ugc.aweme.commercialize.profile.api.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CallToActionBarInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class c extends a {

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f75192e;

    /* renamed from: f  reason: collision with root package name */
    private final h f75193f = i.a((h.f.a.a) new b(this));

    /* renamed from: g  reason: collision with root package name */
    private final h f75194g = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(46390);
    }

    static final class a extends m implements h.f.a.a<AvatarImageView> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(46391);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AvatarImageView invoke() {
            return this.this$0.f75192e.findViewById(R.id.d7);
        }
    }

    static final class b extends m implements h.f.a.a<TextView> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(46392);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.f75192e.findViewById(R.id.fag);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(LinearLayout linearLayout) {
        super(linearLayout);
        l.d(linearLayout, "");
        this.f75192e = linearLayout;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.a, com.ss.android.ugc.aweme.commercialize.profile.impl.a
    public final void a(int i2) {
        ViewGroup.LayoutParams layoutParams = this.f75192e.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i3 = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
        if (i3 >= 0) {
            LinearLayout linearLayout = this.f75192e;
            ValueAnimator a2 = com.ss.android.ugc.aweme.commercialize.uikit.a.a.a(linearLayout, i3, (linearLayout.getMeasuredHeight() + 61) * -1, i2);
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
            } else if (valueOf.intValue() == R.id.dj && (dVar = this.f75188c) != null) {
                dVar.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.a, com.ss.android.ugc.aweme.commercialize.profile.impl.a
    public final void a(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f75192e.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i2 = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
        if (i2 < 0) {
            ValueAnimator a2 = com.ss.android.ugc.aweme.commercialize.uikit.a.a.a(this.f75192e, i2, 60, 300);
            l.b(a2, "");
            a2.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.a, com.ss.android.ugc.aweme.commercialize.profile.impl.a
    public final void a(e eVar) {
        String str;
        String str2;
        Drawable drawable;
        UrlModel urlModel;
        com.facebook.imagepipeline.o.b[] a2;
        User author;
        Resources resources;
        AwemeRawAd awemeRawAd;
        CallToActionBarInfo callToActionBarInfo;
        AwemeRawAd awemeRawAd2;
        CallToActionBarInfo callToActionBarInfo2;
        l.d(eVar, "");
        super.a(eVar);
        TextView textView = (TextView) this.f75193f.getValue();
        l.b(textView, "");
        Aweme aweme = this.f75187b;
        if (aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || (callToActionBarInfo2 = awemeRawAd2.getCallToActionBarInfo()) == null) {
            str = null;
        } else {
            str = callToActionBarInfo2.getText();
        }
        textView.setText(str);
        TextView b2 = b();
        Aweme aweme2 = this.f75187b;
        if (aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null || (callToActionBarInfo = awemeRawAd.getCallToActionBarInfo()) == null) {
            str2 = null;
        } else {
            str2 = callToActionBarInfo.getButtonText();
        }
        b2.setText(str2);
        TextView b3 = b();
        Context context = this.f75186a;
        if (context == null || (resources = context.getResources()) == null) {
            drawable = null;
        } else {
            drawable = resources.getDrawable(R.drawable.b52);
        }
        b3.setBackground(drawable);
        AvatarImageView avatarImageView = (AvatarImageView) this.f75194g.getValue();
        Aweme aweme3 = this.f75187b;
        if (aweme3 == null || (author = aweme3.getAuthor()) == null) {
            urlModel = null;
        } else {
            urlModel = author.getAvatarThumb();
        }
        if (avatarImageView != null && urlModel != null && avatarImageView.getContext() != null && (a2 = com.ss.android.ugc.aweme.base.e.a(urlModel, (com.facebook.imagepipeline.common.d) null, (com.facebook.imagepipeline.o.d) null)) != null && a2.length > 0) {
            avatarImageView.getContext();
            com.facebook.drawee.c.d<f> a3 = com.ss.android.ugc.aweme.base.e.a((com.facebook.drawee.c.d<f>) null);
            com.facebook.drawee.a.a.e b4 = com.facebook.drawee.a.a.c.b();
            b4.f47325m = avatarImageView.getController();
            com.facebook.drawee.c.b a4 = b4.a(a2);
            a4.f47319g = new com.ss.android.ugc.aweme.commercialize.g.c(a3, null);
            avatarImageView.setController(a4.e());
        }
    }
}
