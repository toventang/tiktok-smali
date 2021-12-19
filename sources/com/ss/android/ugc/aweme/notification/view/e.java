package com.ss.android.ugc.aweme.notification.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.ArrayList;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public LiveCircleView f113948a;

    /* renamed from: b  reason: collision with root package name */
    public AvatarImageView f113949b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f113950c;

    /* renamed from: d  reason: collision with root package name */
    public int f113951d;

    /* renamed from: e  reason: collision with root package name */
    public int f113952e;

    /* renamed from: f  reason: collision with root package name */
    public ValueAnimator f113953f;

    /* renamed from: g  reason: collision with root package name */
    public ValueAnimator f113954g;

    /* renamed from: h  reason: collision with root package name */
    public List<UrlModel> f113955h = new ArrayList();

    static {
        Covode.recordClassIndex(73265);
    }

    public final void a() {
        if (this.f113949b != null && this.f113948a != null && !this.f113950c) {
            ValueAnimator valueAnimator = this.f113953f;
            if (valueAnimator != null) {
                valueAnimator.start();
                return;
            }
            this.f113951d = 1;
            this.f113953f = ValueAnimator.ofInt(0, 800);
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 800);
            this.f113954g = ofInt;
            ofInt.setRepeatCount(-1);
            this.f113954g.setRepeatMode(1);
            this.f113954g.setDuration(800L);
            this.f113953f.setRepeatCount(-1);
            this.f113953f.setRepeatMode(1);
            this.f113953f.setDuration(800L);
            this.f113953f.start();
            this.f113954g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.ugc.aweme.notification.view.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(73266);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (intValue >= 0 && intValue <= 640) {
                        e.this.f113948a.setFraction((((float) intValue) * 1.0f) / 640.0f);
                    }
                }
            });
            this.f113953f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.ugc.aweme.notification.view.e.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(73267);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f2;
                    float f3;
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    if (e.this.f113951d % 5 == 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.08f;
                    }
                    if (e.this.f113951d % 5 == 0 && animatedFraction > 0.48f && animatedFraction < 0.52f && e.this.f113955h.size() != 0) {
                        com.ss.android.ugc.aweme.base.e.a(e.this.f113949b, e.this.f113955h.get(e.this.f113952e));
                        e eVar = e.this;
                        eVar.f113952e = (eVar.f113952e + 1) % e.this.f113955h.size();
                    }
                    if (animatedFraction <= 0.5f) {
                        f3 = 1.0f - (f2 * (animatedFraction / 0.5f));
                    } else {
                        f3 = (1.0f - f2) + (f2 * ((animatedFraction - 0.5f) / 0.5f));
                    }
                    e.this.f113949b.setScaleX(f3);
                    e.this.f113949b.setScaleY(f3);
                    if (intValue >= 730 && intValue < 740 && !e.this.f113950c) {
                        e.this.f113950c = true;
                        e.this.f113954g.start();
                    }
                }
            });
            this.f113953f.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.notification.view.e.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(73268);
                }

                public final void onAnimationCancel(Animator animator) {
                    e.this.f113954g.cancel();
                    e.this.f113950c = false;
                }

                public final void onAnimationRepeat(Animator animator) {
                    e eVar = e.this;
                    eVar.f113951d = (eVar.f113951d + 1) % 5;
                    LiveOuterService.s().d().a(3);
                }
            });
        }
    }

    public final void a(List<UrlModel> list) {
        if (list != null && list.size() != 0) {
            this.f113955h.addAll(list);
            com.ss.android.ugc.aweme.base.e.a(this.f113949b, this.f113955h.get(0));
        }
    }
}
