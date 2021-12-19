package com.ss.android.ugc.aweme.profile.survey;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cu.a;
import com.zhiliaoapp.musically.R;

public abstract class g implements View.OnClickListener {
    private static final boolean q = false;

    /* renamed from: a  reason: collision with root package name */
    public ViewStub f116645a;

    /* renamed from: b  reason: collision with root package name */
    public View f116646b;

    /* renamed from: c  reason: collision with root package name */
    public View f116647c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f116648d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f116649e;

    /* renamed from: f  reason: collision with root package name */
    public View f116650f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f116651g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f116652h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f116653i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f116654j;

    /* renamed from: k  reason: collision with root package name */
    public c f116655k;

    /* renamed from: l  reason: collision with root package name */
    public a f116656l;

    /* renamed from: m  reason: collision with root package name */
    Animator f116657m;
    public boolean n;
    public boolean o;
    public boolean p;
    private ValueAnimator r;

    static {
        Covode.recordClassIndex(75366);
    }

    public final void b() {
        View view = this.f116646b;
        if (view != null) {
            view.setVisibility(8);
        }
        d();
        this.n = false;
    }

    private void d() {
        Animator animator = this.f116657m;
        if (animator != null && this.r != null) {
            if (animator.isStarted() || this.f116657m.isRunning()) {
                this.f116657m.cancel();
            }
            if (this.r.isStarted() || this.r.isRunning()) {
                this.r.cancel();
            }
        }
    }

    public final void a() {
        View view = this.f116646b;
        view.setTranslationY((float) view.getHeight());
        ViewGroup.LayoutParams layoutParams = this.f116650f.getLayoutParams();
        layoutParams.height = this.f116646b.getHeight();
        this.f116650f.setLayoutParams(layoutParams);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f116646b, View.TRANSLATION_Y, (float) this.f116646b.getMeasuredHeight(), 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.profile.survey.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(75367);
            }

            public final void onAnimationEnd(Animator animator) {
                g.this.n = true;
                if (g.this.f116655k != null) {
                    g.this.f116655k.a(g.this.f116656l);
                }
            }

            public final void onAnimationStart(Animator animator) {
                g.this.f116646b.setVisibility(0);
                g.this.f116647c.setVisibility(0);
                g.this.f116647c.setAlpha(1.0f);
                g.this.f116650f.setVisibility(8);
            }
        });
        ofFloat.start();
    }

    public final void c() {
        if (this.r == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(-1.0f, 0.0f, 1.0f);
            this.r = ofFloat;
            ofFloat.addUpdateListener(new i(this));
            this.r.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.profile.survey.g.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(75368);
                }

                public final void onAnimationStart(Animator animator) {
                    g.this.f116650f.setAlpha(0.0f);
                    g.this.f116650f.setVisibility(0);
                }

                public final void onAnimationEnd(Animator animator) {
                    g gVar = g.this;
                    if (!gVar.o) {
                        if (gVar.f116657m == null) {
                            gVar.f116657m = ObjectAnimator.ofFloat(gVar.f116646b, View.TRANSLATION_Y, 0.0f, (float) gVar.f116646b.getHeight());
                            gVar.f116657m.setDuration(300);
                            gVar.f116657m.setInterpolator(new DecelerateInterpolator());
                            gVar.f116657m.setStartDelay(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                        }
                        if (!gVar.f116657m.isStarted() && !gVar.f116657m.isRunning()) {
                            gVar.f116657m.start();
                        }
                    }
                }
            });
            this.r.setDuration(600L);
        }
        if (!this.r.isStarted() && !this.r.isRunning()) {
            this.r.start();
        }
    }

    g(ViewStub viewStub) {
        this.f116645a = viewStub;
        if (viewStub.getLayoutResource() <= 0) {
            this.f116645a.setLayoutResource(R.layout.apc);
        }
    }

    public static boolean a(a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f79087c) || TextUtils.isEmpty(aVar.f79088d) || TextUtils.isEmpty(aVar.f79089e) || TextUtils.isEmpty(aVar.f79090f) || TextUtils.isEmpty(aVar.f79091g)) {
            return false;
        }
        return true;
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        ClickAgent.onClick(view);
        int id = view.getId();
        if (id == R.id.efw) {
            c cVar = this.f116655k;
            if (cVar != null) {
                cVar.a(this.f116656l, 3, "");
            }
        } else if (id == R.id.efy) {
            c cVar2 = this.f116655k;
            if (cVar2 == null) {
                return;
            }
            if (this.p) {
                a aVar = this.f116656l;
                if (!TextUtils.isEmpty(aVar.f79095k)) {
                    str4 = this.f116656l.f79095k;
                } else {
                    str4 = this.f116656l.f79089e;
                }
                cVar2.a(aVar, 2, str4);
                return;
            }
            a aVar2 = this.f116656l;
            if (!TextUtils.isEmpty(aVar2.f79094j)) {
                str3 = this.f116656l.f79094j;
            } else {
                str3 = this.f116656l.f79088d;
            }
            cVar2.a(aVar2, 1, str3);
        } else if (id == R.id.eg2) {
            c cVar3 = this.f116655k;
            if (cVar3 == null) {
                return;
            }
            if (this.p) {
                a aVar3 = this.f116656l;
                if (!TextUtils.isEmpty(aVar3.f79094j)) {
                    str2 = this.f116656l.f79094j;
                } else {
                    str2 = this.f116656l.f79088d;
                }
                cVar3.a(aVar3, 1, str2);
                return;
            }
            a aVar4 = this.f116656l;
            if (!TextUtils.isEmpty(aVar4.f79095k)) {
                str = this.f116656l.f79095k;
            } else {
                str = this.f116656l.f79089e;
            }
            cVar3.a(aVar4, 2, str);
        } else if (id == R.id.eg1) {
            this.o = true;
            d();
            c cVar4 = this.f116655k;
            if (cVar4 != null) {
                cVar4.a();
            }
        }
    }
}
