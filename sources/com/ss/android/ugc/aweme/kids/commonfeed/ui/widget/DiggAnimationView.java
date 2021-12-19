package com.ss.android.ugc.aweme.kids.commonfeed.ui.widget;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.b;
import com.airbnb.lottie.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.lancet.k;
import com.zhiliaoapp.musically.R;

public class DiggAnimationView extends AnimationImageView {

    /* renamed from: e  reason: collision with root package name */
    private a f106270e;

    /* renamed from: f  reason: collision with root package name */
    private a f106271f;

    static {
        Covode.recordClassIndex(67942);
    }

    @Override // com.airbnb.lottie.LottieAnimationView, com.ss.android.ugc.aweme.base.ui.AnimationImageView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public final void g() {
        if (!isSelected()) {
            i();
        } else {
            j();
        }
    }

    private void i() {
        setAnimation("icon_home_like_new.json");
        if (this.f106270e == null) {
            this.f106270e = new a();
        }
        b(this.f106270e);
        a(this.f106270e);
        a();
    }

    private void j() {
        setAnimation("icon_home_dislike_new.json");
        if (this.f106271f == null) {
            this.f106271f = new a();
        }
        b(this.f106271f);
        a(this.f106271f);
        a();
    }

    public final void h() {
        setImageAlpha(254);
        setImageDrawable(b.a(getContext(), (int) R.drawable.ax5));
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void setComposition(e eVar) {
        super.setComposition(eVar);
    }

    /* access modifiers changed from: package-private */
    public class a implements Animator.AnimatorListener {
        static {
            Covode.recordClassIndex(67943);
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

    public DiggAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
