package com.ss.android.ugc.aweme.ecommerce.gallery.transfer;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    float f85980a;

    /* renamed from: b  reason: collision with root package name */
    float f85981b;

    /* renamed from: c  reason: collision with root package name */
    int f85982c;

    /* renamed from: d  reason: collision with root package name */
    private e f85983d;

    /* renamed from: e  reason: collision with root package name */
    private float f85984e;

    /* renamed from: f  reason: collision with root package name */
    private AbstractC2065a f85985f = null;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.transfer.a$a  reason: collision with other inner class name */
    public interface AbstractC2065a {
        static {
            Covode.recordClassIndex(53837);
        }
    }

    static {
        Covode.recordClassIndex(53836);
    }

    public a(e eVar) {
        this.f85983d = eVar;
        this.f85982c = ViewConfiguration.get(eVar.getContext()).getScaledEdgeSlop();
    }

    /* access modifiers changed from: package-private */
    public final void a(MotionEvent motionEvent) {
        float f2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f85980a = motionEvent.getRawX();
            this.f85981b = motionEvent.getRawY();
        } else if (action == 1) {
            if (this.f85983d.f86022b.getTranslationY() > 150.0f) {
                e eVar = this.f85983d;
                eVar.a(eVar.getCurrentPosition());
            } else {
                BounceBackViewPager bounceBackViewPager = this.f85983d.f86022b;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bounceBackViewPager, "scaleX", bounceBackViewPager.getScaleX(), 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bounceBackViewPager, "scaleY", bounceBackViewPager.getScaleX(), 1.0f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(bounceBackViewPager, "translationX", bounceBackViewPager.getTranslationX(), 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(bounceBackViewPager, "translationY", bounceBackViewPager.getTranslationY(), 0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                animatorSet.start();
            }
            this.f85980a = 0.0f;
            this.f85981b = 0.0f;
        } else if (action == 2) {
            float rawX = motionEvent.getRawX() - this.f85980a;
            float rawY = motionEvent.getRawY() - this.f85981b;
            float abs = Math.abs(rawY);
            float max = Math.max(1.0f - ((abs / ((float) this.f85983d.getHeight())) * 1.2f), 0.6f);
            this.f85984e = max;
            float height = (1.0f - max) * (1.0f - max) * ((float) this.f85983d.getHeight()) * 0.5f;
            e eVar2 = this.f85983d;
            eVar2.f86027g = 255.0f - (Math.min((abs / ((float) eVar2.getHeight())) * 2.4f, 0.8f) * 255.0f);
            e eVar3 = this.f85983d;
            if (eVar3.f86027g < 0.0f) {
                f2 = 0.0f;
            } else {
                f2 = this.f85983d.f86027g;
            }
            eVar3.f86027g = f2;
            BounceBackViewPager bounceBackViewPager2 = this.f85983d.f86022b;
            if (bounceBackViewPager2.getTranslationY() >= 0.0f) {
                e eVar4 = this.f85983d;
                eVar4.setBackgroundColor(eVar4.a(eVar4.f86027g));
                this.f85983d.getTransferConfig().f86007m.a(Math.round(this.f85983d.f86027g));
                bounceBackViewPager2.setTranslationX(rawX);
                bounceBackViewPager2.setTranslationY(rawY - height);
                bounceBackViewPager2.setScaleX(this.f85984e);
                bounceBackViewPager2.setScaleY(this.f85984e);
                return;
            }
            e eVar5 = this.f85983d;
            eVar5.setBackgroundColor(eVar5.getTransConfig().f85997c);
            this.f85983d.getTransferConfig().f86007m.a(255);
            bounceBackViewPager2.setTranslationX(rawX);
            bounceBackViewPager2.setTranslationY(rawY);
        }
    }
}
