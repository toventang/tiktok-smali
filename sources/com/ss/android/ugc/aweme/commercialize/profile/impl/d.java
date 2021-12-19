package com.ss.android.ugc.aweme.commercialize.profile.impl;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BottomBanner;
import com.ss.android.ugc.aweme.feed.model.NativeAuthorInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class d extends a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f75195f = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f75196e;

    /* renamed from: g  reason: collision with root package name */
    private final h f75197g = i.a((h.f.a.a) new c(this));

    /* renamed from: h  reason: collision with root package name */
    private final h f75198h = i.a((h.f.a.a) new b(this));

    /* renamed from: i  reason: collision with root package name */
    private final h f75199i = i.a((h.f.a.a) new C1715d(this));

    /* renamed from: j  reason: collision with root package name */
    private Runnable f75200j;

    static {
        Covode.recordClassIndex(46393);
    }

    private final TextView c() {
        return (TextView) this.f75197g.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46394);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<SmartAvatarImageView> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(46395);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartAvatarImageView invoke() {
            return this.this$0.f75196e.findViewById(R.id.d6v);
        }
    }

    static final class c extends m implements h.f.a.a<TextView> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(46396);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.f75196e.findViewById(R.id.d6u);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.d$d  reason: collision with other inner class name */
    static final class C1715d extends m implements h.f.a.a<TextView> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(46397);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1715d(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.f75196e.findViewById(R.id.d6w);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.a, com.ss.android.ugc.aweme.commercialize.profile.impl.a
    public final void a() {
        this.f75196e.setOnClickListener(this);
        b().setOnClickListener(this);
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f75201a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GradientDrawable f75202b;

        static {
            Covode.recordClassIndex(46398);
        }

        e(d dVar, GradientDrawable gradientDrawable) {
            this.f75201a = dVar;
            this.f75202b = gradientDrawable;
        }

        public final void run() {
            d dVar = this.f75201a;
            TextView b2 = dVar.b();
            GradientDrawable gradientDrawable = this.f75202b;
            int color = this.f75201a.b().getResources().getColor(R.color.b3);
            int color2 = this.f75201a.b().getResources().getColor(R.color.bh);
            if (color != color2 && gradientDrawable != null) {
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(color2));
                Drawable mutate = androidx.core.graphics.drawable.a.e(gradientDrawable).mutate();
                l.b(mutate, "");
                if (mutate instanceof GradientDrawable) {
                    ((GradientDrawable) mutate).setColor(color2);
                }
                ofObject.addUpdateListener(new f(dVar, b2, mutate));
                l.b(ofObject, "");
                ofObject.setDuration(300L);
                ofObject.start();
            }
        }
    }

    static final class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f75203a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f75204b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Drawable f75205c;

        static {
            Covode.recordClassIndex(46399);
        }

        f(d dVar, View view, Drawable drawable) {
            this.f75203a = dVar;
            this.f75204b = view;
            this.f75205c = drawable;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            View view = this.f75204b;
            if (view != null) {
                Drawable drawable = this.f75205c;
                if (drawable instanceof GradientDrawable) {
                    ((GradientDrawable) drawable).setColor(intValue);
                }
                view.setBackground(drawable);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(LinearLayout linearLayout) {
        super(linearLayout);
        l.d(linearLayout, "");
        this.f75196e = linearLayout;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.impl.a
    public final void onClick(View view) {
        com.ss.android.ugc.aweme.commercialize.profile.api.d dVar;
        if (view != null) {
            int id = view.getId();
            if ((id == R.id.d6w || id == R.id.d6u || id == R.id.d6v || id == R.id.dj || id == R.id.di) && (dVar = this.f75188c) != null) {
                dVar.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.a, com.ss.android.ugc.aweme.commercialize.profile.impl.a
    public final void a(int i2) {
        ViewGroup.LayoutParams layoutParams = this.f75196e.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i3 = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
        if (i3 >= 0) {
            LinearLayout linearLayout = this.f75196e;
            ValueAnimator a2 = com.ss.android.ugc.aweme.commercialize.uikit.a.a.a(linearLayout, i3, (linearLayout.getMeasuredHeight() + 1) * -1, i2);
            l.b(a2, "");
            a2.start();
        }
        if (i2 > 0) {
            b().setBackgroundResource(R.drawable.b61);
        } else {
            b().setBackgroundResource(R.drawable.b60);
        }
        b().removeCallbacks(this.f75200j);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.a, com.ss.android.ugc.aweme.commercialize.profile.impl.a
    public final void a(com.ss.android.ugc.aweme.commercialize.profile.api.e eVar) {
        String str;
        String str2;
        String str3;
        AwemeRawAd awemeRawAd;
        NativeAuthorInfo nativeAuthorInfo;
        BottomBanner bottomBanner;
        User author;
        UrlModel avatarLarger;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        AwemeRawAd awemeRawAd5;
        l.d(eVar, "");
        this.f75187b = eVar.f75141b;
        this.f75186a = eVar.f75140a;
        this.f75188c = eVar.f75143d;
        b().setText(com.ss.android.ugc.aweme.commercialize.util.a.a(this.f75186a, this.f75187b, false));
        b().setBackgroundResource(R.drawable.b60);
        TextView textView = (TextView) this.f75199i.getValue();
        l.b(textView, "");
        Aweme aweme = this.f75187b;
        String str4 = null;
        if (aweme == null || (awemeRawAd5 = aweme.getAwemeRawAd()) == null) {
            str = null;
        } else {
            str = awemeRawAd5.getHomepageBottomTextual();
        }
        textView.setText(str);
        Aweme aweme2 = this.f75187b;
        if (aweme2 == null || (awemeRawAd4 = aweme2.getAwemeRawAd()) == null) {
            str2 = null;
        } else {
            str2 = awemeRawAd4.getType();
        }
        if (TextUtils.equals(str2, "app")) {
            Aweme aweme3 = this.f75187b;
            if (!(aweme3 == null || (awemeRawAd3 = aweme3.getAwemeRawAd()) == null)) {
                str3 = awemeRawAd3.getAppName();
            }
            str3 = null;
        } else {
            Aweme aweme4 = this.f75187b;
            if (!(aweme4 == null || (awemeRawAd = aweme4.getAwemeRawAd()) == null || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || (bottomBanner = nativeAuthorInfo.getBottomBanner()) == null)) {
                str3 = bottomBanner.getRecommendText();
            }
            str3 = null;
        }
        TextView c2 = c();
        l.b(c2, "");
        TextView c3 = c();
        l.b(c3, "");
        c2.setText(a(str3, c3, ((float) n.a(this.f75186a)) - n.b(this.f75186a, 176.0f)));
        TextView b2 = b();
        Aweme aweme5 = this.f75187b;
        if (!(aweme5 == null || (awemeRawAd2 = aweme5.getAwemeRawAd()) == null)) {
            str4 = awemeRawAd2.getButtonText();
        }
        b2.setText(a(str4, b(), n.b(this.f75186a, 66.0f)));
        Aweme aweme6 = this.f75187b;
        if (aweme6 != null && (author = aweme6.getAuthor()) != null) {
            if (author.getAvatarMedium() != null) {
                avatarLarger = author.getAvatarMedium();
            } else if (author.getAvatarThumb() != null) {
                avatarLarger = author.getAvatarThumb();
            } else if (author.getAvatarLarger() != null) {
                avatarLarger = author.getAvatarLarger();
            } else {
                return;
            }
            if (avatarLarger != null) {
                v a2 = r.a(new com.bytedance.lighten.a.a.a(avatarLarger.getUrlList()));
                a2.E = (SmartAvatarImageView) this.f75198h.getValue();
                a2.c();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.a, com.ss.android.ugc.aweme.commercialize.profile.impl.a
    public final void a(boolean z) {
        int i2;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        NativeAuthorInfo nativeAuthorInfo;
        BottomBanner bottomBanner;
        ViewGroup.LayoutParams layoutParams = this.f75196e.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i3 = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
        if (i3 < 0) {
            ValueAnimator a2 = com.ss.android.ugc.aweme.commercialize.uikit.a.a.a(this.f75196e, i3, 0, 300);
            l.b(a2, "");
            a2.start();
        }
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(n.b(b().getContext(), 2.0f));
            gradientDrawable.setColor(b().getResources().getColor(R.color.b3));
            Aweme aweme = this.f75187b;
            if (aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || (nativeAuthorInfo = awemeRawAd2.getNativeAuthorInfo()) == null || (bottomBanner = nativeAuthorInfo.getBottomBanner()) == null) {
                i2 = 3;
            } else {
                i2 = bottomBanner.getShowButtonColorSeconds();
            }
            if (this.f75200j == null) {
                this.f75200j = new e(this, gradientDrawable);
            }
            b().postDelayed(this.f75200j, TimeUnit.SECONDS.toMillis((long) i2) + 300);
            Aweme aweme2 = this.f75187b;
            AwemeRawAd awemeRawAd3 = null;
            if (aweme2 != null) {
                awemeRawAd = aweme2.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            com.ss.android.ugc.aweme.commercialize.profile.impl.a.b.a(awemeRawAd);
            Aweme aweme3 = this.f75187b;
            if (aweme3 != null) {
                awemeRawAd3 = aweme3.getAwemeRawAd();
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "button_show", awemeRawAd3).c();
        }
    }

    private static String a(String str, TextView textView, float f2) {
        TextPaint paint = textView.getPaint();
        if (paint.measureText(str) <= f2) {
            return str;
        }
        textView.setText(str);
        CharSequence text = textView.getText();
        String str2 = text + "...";
        while (paint.measureText(str2) > f2) {
            l.b(text, "");
            if (text.length() <= 0) {
                break;
            }
            text = text.subSequence(0, text.length() - 1);
            str2 = text + "...";
        }
        return str2;
    }
}
