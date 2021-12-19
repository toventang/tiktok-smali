package com.ss.android.ugc.aweme.share.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout;
import com.ss.android.ugc.aweme.experiment.gk;
import h.f.b.l;

public final class SharePublishLayout extends PullUpLayout {

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.ies.dmt.ui.frameworkui.a f124373f;

    static {
        Covode.recordClassIndex(81666);
    }

    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SharePublishLayout f124374a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f124375b;

        static {
            Covode.recordClassIndex(81667);
        }

        public final void onAnimationCancel(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            if (this.f124375b) {
                com.bytedance.ies.dmt.ui.frameworkui.a aVar = this.f124374a.f124373f;
                if (aVar != null) {
                    aVar.b();
                    return;
                }
                return;
            }
            com.bytedance.ies.dmt.ui.frameworkui.a aVar2 = this.f124374a.f124373f;
            if (aVar2 != null) {
                aVar2.a();
            }
        }

        a(SharePublishLayout sharePublishLayout, boolean z) {
            this.f124374a = sharePublishLayout;
            this.f124375b = z;
        }
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout
    public final void setPullUpListener(com.bytedance.ies.dmt.ui.frameworkui.a aVar) {
        l.d(aVar, "");
        if (gk.b()) {
            this.f124373f = aVar;
        } else {
            super.setPullUpListener(aVar);
        }
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (motionEvent.getAction() != 2) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (!gk.b()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        float y = motionEvent.getY() - this.f33490b;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(this.f33489a);
        l.b(viewConfiguration, "");
        if (y > ((float) viewConfiguration.getScaledTouchSlop())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (motionEvent.getAction() != 2) {
            return super.onTouchEvent(motionEvent);
        }
        if (!gk.b()) {
            return super.onTouchEvent(motionEvent);
        }
        if (!a(motionEvent)) {
            return false;
        }
        int max = (int) Math.max(0.0f, motionEvent.getY() - this.f33490b);
        View view = this.f33491c;
        if (view == null) {
            return true;
        }
        view.setTranslationY((float) max);
        return true;
    }

    public SharePublishLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout
    public final void a(float f2, boolean z) {
        ObjectAnimator ofFloat;
        if (gk.b()) {
            if (z) {
                View view = this.f33491c;
                View view2 = this.f33491c;
                l.b(view2, "");
                ofFloat = ObjectAnimator.ofFloat(view, "translationY", f2, (float) view2.getHeight());
                l.b(ofFloat, "");
            } else {
                ofFloat = ObjectAnimator.ofFloat(this.f33491c, "translationY", f2, 0.0f);
                l.b(ofFloat, "");
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(300L);
            animatorSet.play(ofFloat);
            animatorSet.addListener(new a(this, z));
            animatorSet.start();
            return;
        }
        super.a(f2, z);
    }
}
