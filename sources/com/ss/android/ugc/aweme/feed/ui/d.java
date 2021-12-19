package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.a.a;
import com.ss.android.ugc.aweme.base.ui.a.c;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import f.a.d.f;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f94536a = d.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public boolean f94537b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f94538c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f94539d;

    /* renamed from: e  reason: collision with root package name */
    public User f94540e;

    /* renamed from: f  reason: collision with root package name */
    public View f94541f;

    /* renamed from: g  reason: collision with root package name */
    public LiveCircleView f94542g;

    /* renamed from: h  reason: collision with root package name */
    public ValueAnimator f94543h;

    /* renamed from: i  reason: collision with root package name */
    public ValueAnimator f94544i;

    /* renamed from: j  reason: collision with root package name */
    public f<com.ss.android.ugc.aweme.live.feedpage.d> f94545j;

    /* renamed from: k  reason: collision with root package name */
    Aweme f94546k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f94547l;

    /* renamed from: m  reason: collision with root package name */
    private View f94548m;
    private AnimatorSet n;
    private Class o;
    private View.OnAttachStateChangeListener p = new View.OnAttachStateChangeListener() {
        /* class com.ss.android.ugc.aweme.feed.ui.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(60019);
        }

        public final void onViewDetachedFromWindow(View view) {
            d.this.b();
        }

        public final void onViewAttachedToWindow(View view) {
            if (d.this.f94539d) {
                d.this.a();
            }
        }
    };
    private Handler q;
    private Runnable r;

    public void a() {
        a(0);
        c();
    }

    static {
        Covode.recordClassIndex(60018);
    }

    public d() {
    }

    public final void b() {
        d();
        a(8);
    }

    public final void d() {
        Runnable runnable;
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
            Handler handler = this.q;
            if (!(handler == null || (runnable = this.r) == null)) {
                handler.removeCallbacks(runnable);
            }
            this.f94538c = false;
            this.f94537b = false;
        }
    }

    public final void c() {
        boolean a2 = a(this.f94540e);
        this.f94539d = a2;
        if (!a2) {
            b();
            f<com.ss.android.ugc.aweme.live.feedpage.d> fVar = this.f94545j;
            if (fVar != null && this.f94540e != null) {
                try {
                    fVar.accept(new com.ss.android.ugc.aweme.live.feedpage.d(Long.parseLong(this.f94540e.getUid()), 0));
                } catch (Exception unused) {
                }
            }
        } else if (this.f94538c) {
            f<com.ss.android.ugc.aweme.live.feedpage.d> fVar2 = this.f94545j;
            if (fVar2 != null) {
                a(this.f94540e, fVar2, "tiktok_video_head");
            }
        } else if (!this.f94547l) {
            if (this.f94543h == null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 800);
                this.f94543h = ofInt;
                ofInt.setRepeatCount(-1);
                this.f94543h.setRepeatMode(1);
                this.f94543h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.ss.android.ugc.aweme.feed.ui.d.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(60020);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float f2;
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        if (animatedFraction <= 0.5f) {
                            f2 = 1.0f - ((animatedFraction / 0.5f) * 0.08f);
                        } else {
                            f2 = 0.92f + (((animatedFraction - 0.5f) / 0.5f) * 0.08f);
                        }
                        if (d.this.f94541f != null) {
                            d.this.f94541f.setScaleX(f2);
                            d.this.f94541f.setScaleY(f2);
                        }
                        if (intValue >= 730 && intValue < 740 && !d.this.f94537b) {
                            d.this.f94537b = true;
                            a.a(d.this.f94544i, c.f68347c);
                        }
                    }
                });
            }
            if (this.f94544i == null) {
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 800);
                this.f94544i = ofInt2;
                ofInt2.setRepeatCount(-1);
                this.f94544i.setRepeatMode(1);
                this.f94544i.setDuration(800L);
                this.f94544i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.ss.android.ugc.aweme.feed.ui.d.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(60021);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        if (intValue >= 0 && intValue <= 640) {
                            float f2 = (((float) intValue) * 1.0f) / 640.0f;
                            if (d.this.f94542g != null) {
                                d.this.f94542g.setFraction(f2);
                            }
                        }
                    }
                });
                this.f94544i.addListener(new AnimatorListenerAdapter("tiktok_video_head") {
                    /* class com.ss.android.ugc.aweme.feed.ui.d.AnonymousClass4 */

                    /* renamed from: c  reason: collision with root package name */
                    private int f94554c;

                    static {
                        Covode.recordClassIndex(60022);
                    }

                    public final void onAnimationRepeat(Animator animator) {
                        this.f94554c++;
                        if (d.this.f94545j != null && this.f94554c >= 10) {
                            this.f94554c = 0;
                            d dVar = d.this;
                            dVar.a(dVar.f94540e, d.this.f94545j, "tiktok_video_head");
                        }
                    }
                });
            }
            if (this.n == null) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.n = animatorSet;
                animatorSet.setDuration(800L);
                this.n.addListener(new AnimatorListenerAdapter() {
                    /* class com.ss.android.ugc.aweme.feed.ui.d.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(60023);
                    }

                    public final void onAnimationCancel(Animator animator) {
                        if (d.this.f94544i != null) {
                            d.this.f94544i.cancel();
                        }
                        if (d.this.f94543h != null) {
                            d.this.f94543h.cancel();
                        }
                        d.this.f94538c = false;
                        d.this.f94537b = false;
                    }
                });
            }
            this.n.play(this.f94543h);
            this.f94538c = true;
            a.a(this.n, c.f68347c);
            f<com.ss.android.ugc.aweme.live.feedpage.d> fVar3 = this.f94545j;
            if (fVar3 != null) {
                a(this.f94540e, fVar3, "tiktok_video_head");
            }
        }
    }

    private boolean a(User user) {
        LiveOuterService.s();
        if (user == null) {
            return this.f94539d;
        }
        if (b.y(this.f94546k)) {
            return true;
        }
        if (!user.isLive()) {
            return false;
        }
        if ((!user.isSecret() || in.f(user)) && com.ss.android.ugc.aweme.story.c.a() && !user.isBlock()) {
            return true;
        }
        return false;
    }

    public final void a(int i2) {
        if (i2 == 0) {
            LiveCircleView liveCircleView = this.f94542g;
            if (liveCircleView != null) {
                liveCircleView.setVisibility(0);
            }
            View view = this.f94541f;
            if (view != null) {
                view.setVisibility(0);
                View view2 = this.f94548m;
                if (view2 != null && this.f94541f != view2) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        LiveCircleView liveCircleView2 = this.f94542g;
        if (liveCircleView2 != null) {
            liveCircleView2.setVisibility(8);
        }
        View view3 = this.f94541f;
        if (!(view3 == null || view3 == this.f94548m)) {
            view3.setVisibility(8);
        }
        View view4 = this.f94548m;
        if (view4 != null) {
            view4.setVisibility(0);
        }
    }

    public final void a(User user, Class cls) {
        a(user, cls, null, null);
    }

    public d(View view, View view2, LiveCircleView liveCircleView) {
        this.f94541f = view;
        this.f94548m = view2;
        this.f94542g = liveCircleView;
        LiveOuterService.s();
        this.f94539d = true;
        liveCircleView.setVisibility(0);
        view.addOnAttachStateChangeListener(this.p);
    }

    public final void a(User user, f<com.ss.android.ugc.aweme.live.feedpage.d> fVar, String str) {
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            LiveOuterService.s().b().a(user, new e(this, Long.parseLong(user.getUid()), user, fVar), str);
        }
    }

    public d(boolean z, View view, View view2, LiveCircleView liveCircleView) {
        this.f94541f = view;
        this.f94548m = view2;
        this.f94542g = liveCircleView;
        LiveOuterService.s();
        this.f94539d = z;
        view.addOnAttachStateChangeListener(this.p);
    }

    public final void a(User user, Class cls, f<com.ss.android.ugc.aweme.live.feedpage.d> fVar, Aweme aweme) {
        this.f94546k = aweme;
        this.f94540e = user;
        this.f94545j = fVar;
        this.o = cls;
        this.f94539d = a(user);
        this.f94541f.removeOnAttachStateChangeListener(this.p);
        this.f94541f.addOnAttachStateChangeListener(this.p);
        if (user != null) {
            user.getNickname();
        }
        if (this.f94539d) {
            a();
        } else {
            b();
        }
    }
}
