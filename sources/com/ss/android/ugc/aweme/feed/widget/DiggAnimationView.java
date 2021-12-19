package com.ss.android.ugc.aweme.feed.widget;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.b;
import com.airbnb.lottie.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.cp.d;
import com.ss.android.ugc.aweme.feed.x.s;
import com.ss.android.ugc.aweme.lancet.k;
import com.zhiliaoapp.musically.R;

public class DiggAnimationView extends AnimationImageView {

    /* renamed from: e  reason: collision with root package name */
    private a f95167e;

    /* renamed from: f  reason: collision with root package name */
    private a f95168f;

    /* renamed from: g  reason: collision with root package name */
    private d f95169g;

    static {
        Covode.recordClassIndex(60312);
    }

    @Override // com.airbnb.lottie.LottieAnimationView, com.ss.android.ugc.aweme.base.ui.AnimationImageView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    private d getDiggViewScaleHelper() {
        if (this.f95169g == null) {
            this.f95169g = new d();
        }
        return this.f95169g;
    }

    public final void g() {
        setAnimation("icon_home_like_new.json");
        if (this.f95167e == null) {
            this.f95167e = new a();
        }
        b(this.f95167e);
        a(this.f95167e);
        a();
    }

    public final void h() {
        setImageAlpha(254);
        getDiggViewScaleHelper();
        Drawable d2 = d.d();
        if (com.ss.android.ugc.aweme.aq.a.a.a()) {
            if (d2 == null) {
                d2 = b.a(getContext(), (int) R.drawable.azy);
            }
        } else if (d2 == null) {
            d2 = b.a(getContext(), (int) R.drawable.azy);
        }
        setImageDrawable(d2);
    }

    public DiggAnimationView(Context context) {
        super(context);
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void setComposition(e eVar) {
        super.setComposition(eVar);
    }

    /* access modifiers changed from: package-private */
    public class a implements Animator.AnimatorListener {
        static {
            Covode.recordClassIndex(60313);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        a() {
        }

        public final void onAnimationCancel(Animator animator) {
            DiggAnimationView.this.h();
            DiggAnimationView.this.b(this);
        }

        public final void onAnimationEnd(Animator animator) {
            DiggAnimationView.this.h();
            DiggAnimationView.this.b(this);
        }
    }

    public final void a(View view) {
        Boolean bool = (Boolean) getTag(com.ss.android.ugc.aweme.aq.a.a.f66964a);
        if (bool != null && bool.booleanValue()) {
            s.a(view);
        } else if (!isSelected()) {
            g();
        } else {
            setAnimation("icon_home_dislike_new.json");
            if (this.f95168f == null) {
                this.f95168f = new a();
            }
            b(this.f95168f);
            a(this.f95168f);
            a();
        }
    }

    public DiggAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
