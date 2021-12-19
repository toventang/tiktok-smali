package com.ss.android.ugc.aweme.editSticker.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.a.i;
import com.ss.android.ugc.aweme.editSticker.d;
import com.ss.android.ugc.aweme.editSticker.h;
import com.ss.android.ugc.tools.utils.r;
import h.f.b.l;

public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f88049a;

    /* renamed from: b  reason: collision with root package name */
    public final h f88050b = null;

    /* renamed from: c  reason: collision with root package name */
    private AnimatorSet f88051c;

    /* renamed from: d  reason: collision with root package name */
    private ObjectAnimator f88052d;

    /* renamed from: e  reason: collision with root package name */
    private ObjectAnimator f88053e;

    /* renamed from: f  reason: collision with root package name */
    private float f88054f;

    /* renamed from: g  reason: collision with root package name */
    private final long f88055g = 200;

    /* renamed from: h  reason: collision with root package name */
    private final long f88056h = 200;

    static {
        Covode.recordClassIndex(55349);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.a.a$a  reason: collision with other inner class name */
    public static final class C2135a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f88057a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f88058b = true;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f88059c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i.a f88060d;

        static {
            Covode.recordClassIndex(55350);
        }

        public final void onAnimationStart(Animator animator) {
            l.d(animator, "");
            super.onAnimationStart(animator);
            if (this.f88058b) {
                this.f88059c.setVisibility(0);
            }
            i.a aVar = this.f88060d;
            if (aVar != null) {
                aVar.a();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            h hVar;
            l.d(animator, "");
            if (!this.f88058b) {
                this.f88059c.setVisibility(8);
                try {
                    if (!(this.f88057a.f88049a instanceof e)) {
                        h hVar2 = this.f88057a.f88050b;
                        if (hVar2 != null) {
                            hVar2.dismiss();
                        }
                    } else if (!((e) this.f88057a.f88049a).isFinishing() && (hVar = this.f88057a.f88050b) != null) {
                        hVar.dismiss();
                    }
                } catch (IllegalArgumentException e2) {
                    h d2 = d.d();
                    if (d2 != null) {
                        d2.a("AlphaPopAnimManager: dismiss pop failed :" + e2.getMessage());
                    }
                } catch (Exception unused) {
                }
            }
            i.a aVar = this.f88060d;
            if (aVar != null) {
                aVar.b();
            }
        }

        C2135a(a aVar, View view, i.a aVar2) {
            this.f88057a = aVar;
            this.f88059c = view;
            this.f88060d = aVar2;
        }
    }

    public a(Context context) {
        l.d(context, "");
        this.f88049a = context;
        this.f88054f = r.a(context, 15.0f);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.a.i
    public final void a(View view, i.a aVar) {
        AnimatorSet.Builder play;
        l.d(view, "");
        AnimatorSet animatorSet = this.f88051c;
        if (animatorSet == null) {
            this.f88051c = new AnimatorSet();
        } else {
            animatorSet.removeAllListeners();
            AnimatorSet animatorSet2 = this.f88051c;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
        }
        this.f88052d = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        float a2 = r.a(this.f88049a, 15.0f);
        this.f88054f = a2;
        this.f88053e = ObjectAnimator.ofFloat(view, "translationY", a2, 0.0f);
        AnimatorSet animatorSet3 = this.f88051c;
        if (!(animatorSet3 == null || (play = animatorSet3.play(this.f88052d)) == null)) {
            play.with(this.f88053e);
        }
        AnimatorSet animatorSet4 = this.f88051c;
        if (animatorSet4 != null) {
            animatorSet4.setDuration(this.f88055g);
        }
        AnimatorSet animatorSet5 = this.f88051c;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new C2135a(this, view, aVar));
        }
        AnimatorSet animatorSet6 = this.f88051c;
        if (animatorSet6 != null) {
            animatorSet6.start();
        }
    }
}
