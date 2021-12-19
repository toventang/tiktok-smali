package com.ss.android.ugc.aweme.ad.a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.feed.button.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.a.i;
import h.f.b.l;

public abstract class a extends FrameLayout implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final C1463a f65569b = new C1463a((byte) 0);
    private static final String s = a.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public boolean f65570a;

    /* renamed from: c  reason: collision with root package name */
    private View f65571c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f65572d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f65573e;

    /* renamed from: f  reason: collision with root package name */
    private View f65574f;

    /* renamed from: g  reason: collision with root package name */
    private View f65575g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f65576h;

    /* renamed from: i  reason: collision with root package name */
    private ObjectAnimator f65577i;

    /* renamed from: j  reason: collision with root package name */
    private ObjectAnimator f65578j;

    /* renamed from: k  reason: collision with root package name */
    private Runnable f65579k;

    /* renamed from: l  reason: collision with root package name */
    private Runnable f65580l;

    /* renamed from: m  reason: collision with root package name */
    private b f65581m;
    private Aweme n;
    private AwemeRawAd o;
    private boolean p;
    private int q;
    private final Context r;

    public enum b {
        LINK,
        DOWNLOAD_IDLE,
        DOWNLOADING,
        INSTALL,
        INSTALLED;

        static {
            Covode.recordClassIndex(40350);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public abstract void a(int i2);

    public abstract int getLayoutId$c_feed_impl_tiktokI18nRelease();

    public abstract void setLabelVisibility$c_feed_impl_tiktokI18nRelease(int i2);

    /* renamed from: com.ss.android.ugc.aweme.ad.a.a$a  reason: collision with other inner class name */
    public static final class C1463a {
        static {
            Covode.recordClassIndex(40349);
        }

        private C1463a() {
        }

        public /* synthetic */ C1463a(byte b2) {
            this();
        }
    }

    public final ImageView getArrow$c_feed_impl_tiktokI18nRelease() {
        return this.f65576h;
    }

    public final b getCurrentStyle() {
        return this.f65581m;
    }

    public final int getDefaultBackgroundColor() {
        return this.q;
    }

    public final Aweme getMAweme$c_feed_impl_tiktokI18nRelease() {
        return this.n;
    }

    public final AwemeRawAd getMAwemeRawAd$c_feed_impl_tiktokI18nRelease() {
        return this.o;
    }

    static {
        Covode.recordClassIndex(40348);
    }

    private final long getShowSeconds() {
        int i2;
        if (getInDownloadMode()) {
            return 0;
        }
        AwemeRawAd awemeRawAd = this.o;
        if (awemeRawAd != null) {
            i2 = awemeRawAd.getShowButtonSeconds();
        } else {
            i2 = 0;
        }
        return ((long) i2) * 1000;
    }

    public final int getBackGroundColor() {
        int i2 = this.q;
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ((ColorDrawable) background).getColor();
        }
        return i2;
    }

    public final String getBgColor() {
        String learnMoreBgColor;
        AwemeRawAd awemeRawAd = this.o;
        if (awemeRawAd == null || (learnMoreBgColor = awemeRawAd.getLearnMoreBgColor()) == null || learnMoreBgColor.length() <= 0) {
            return getResources().getString(R.color.jq);
        }
        return learnMoreBgColor;
    }

    public final boolean getInDownloadMode() {
        return i.a(new b[]{b.DOWNLOADING, b.INSTALL, b.INSTALLED}, this.f65581m);
    }

    private final void b() {
        ObjectAnimator objectAnimator = this.f65577i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = this.f65574f;
        if (view != null) {
            view.clearAnimation();
        }
        ObjectAnimator objectAnimator2 = this.f65578j;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        View view2 = this.f65575g;
        if (view2 != null) {
            view2.clearAnimation();
        }
        View view3 = this.f65574f;
        if (view3 != null) {
            view3.setBackgroundDrawable(null);
        }
        View view4 = this.f65575g;
        if (view4 != null) {
            view4.setBackgroundDrawable(null);
        }
    }

    private final long getColorChangeSeconds() {
        int i2;
        AwemeRawAd awemeRawAd = this.o;
        if (awemeRawAd == null || awemeRawAd.getAnimationType() != 3) {
            return getShowSeconds();
        }
        long showSeconds = getShowSeconds();
        AwemeRawAd awemeRawAd2 = this.o;
        if (awemeRawAd2 != null) {
            i2 = awemeRawAd2.getShowButtonColorSeconds();
        } else {
            i2 = 0;
        }
        return Math.max(showSeconds, ((long) i2) * 1000);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        String str;
        AwemeRawAd awemeRawAd;
        String downloadUrl;
        b();
        this.f65570a = false;
        removeCallbacks(this.f65579k);
        removeCallbacks(this.f65580l);
        AwemeRawAd awemeRawAd2 = this.o;
        if (awemeRawAd2 != null) {
            str = awemeRawAd2.getType();
        } else {
            str = null;
        }
        if (!(!l.a((Object) str, (Object) "app") || (awemeRawAd = this.o) == null || (downloadUrl = awemeRawAd.getDownloadUrl()) == null)) {
            downloadUrl.length();
        }
        super.onDetachedFromWindow();
    }

    private void a() {
        View view;
        View view2;
        TextView textView;
        TextView textView2;
        if (!this.p) {
            View inflate = View.inflate(getContext(), getLayoutId$c_feed_impl_tiktokI18nRelease(), this);
            this.f65571c = inflate;
            ImageView imageView = null;
            if (inflate != null) {
                view = inflate.findViewById(R.id.ap2);
            } else {
                view = null;
            }
            this.f65574f = view;
            View view3 = this.f65571c;
            if (view3 != null) {
                view2 = view3.findViewById(R.id.ap3);
            } else {
                view2 = null;
            }
            this.f65575g = view2;
            View view4 = this.f65571c;
            if (view4 != null) {
                textView = (TextView) view4.findViewById(R.id.ci3);
            } else {
                textView = null;
            }
            this.f65572d = textView;
            View view5 = this.f65571c;
            if (view5 != null) {
                textView2 = (TextView) view5.findViewById(R.id.ci0);
            } else {
                textView2 = null;
            }
            this.f65573e = textView2;
            View view6 = this.f65571c;
            if (view6 != null) {
                imageView = (ImageView) view6.findViewById(R.id.ap1);
            }
            this.f65576h = imageView;
            com.ss.android.ugc.aweme.commercialize.uikit.a.a.a(this);
            this.p = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r3.equals("counsel") != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        if (r3.equals("web") != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        if (r3.equals("app") != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0087, code lost:
        r0 = getContext().getString(com.zhiliaoapp.musically.R.string.ou);
        h.f.b.l.b(r0, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getButtonText() {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.a.a.getButtonText():java.lang.String");
    }

    public final void setArrow$c_feed_impl_tiktokI18nRelease(ImageView imageView) {
        this.f65576h = imageView;
    }

    public final void setCurrentStyle(b bVar) {
        this.f65581m = bVar;
    }

    public final void setDefaultBackgroundColor$c_feed_impl_tiktokI18nRelease(int i2) {
        this.q = i2;
    }

    public final void setMAweme$c_feed_impl_tiktokI18nRelease(Aweme aweme) {
        this.n = aweme;
    }

    public final void setMAwemeRawAd$c_feed_impl_tiktokI18nRelease(AwemeRawAd awemeRawAd) {
        this.o = awemeRawAd;
    }

    public final void setDownloadIdleUI(String str) {
        l.d(str, "");
        a();
        b();
        this.f65581m = b.DOWNLOAD_IDLE;
        View view = this.f65574f;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f65575g;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        TextView textView = this.f65573e;
        if (textView != null) {
            textView.setTextColor(androidx.core.content.b.c(this.r, R.color.f159928l));
        }
        TextView textView2 = this.f65573e;
        if (textView2 != null) {
            textView2.setText(str);
        }
        TextView textView3 = this.f65572d;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        ImageView imageView = this.f65576h;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    public final void setDownloadPauseUI(String str) {
        l.d(str, "");
        a();
        this.f65581m = b.DOWNLOADING;
        a(this.q);
        View view = this.f65574f;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f65575g;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        TextView textView = this.f65573e;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.f65573e;
        if (textView2 != null) {
            textView2.setText(str);
        }
        TextView textView3 = this.f65573e;
        if (textView3 != null) {
            textView3.setTextColor(androidx.core.content.b.c(this.r, R.color.nr));
        }
        TextView textView4 = this.f65572d;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        ImageView imageView = this.f65576h;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    private /* synthetic */ a(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.r = context;
    }
}
