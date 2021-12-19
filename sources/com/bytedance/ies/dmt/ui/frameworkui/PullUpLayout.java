package com.bytedance.ies.dmt.ui.frameworkui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class PullUpLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    protected Context f33489a;

    /* renamed from: b  reason: collision with root package name */
    protected float f33490b;

    /* renamed from: c  reason: collision with root package name */
    protected View f33491c;

    /* renamed from: d  reason: collision with root package name */
    public a f33492d;

    /* renamed from: e  reason: collision with root package name */
    public a f33493e;

    /* renamed from: f  reason: collision with root package name */
    private VelocityTracker f33494f;

    /* renamed from: g  reason: collision with root package name */
    private ObjectAnimator f33495g;

    /* renamed from: h  reason: collision with root package name */
    private b f33496h;

    public interface a {
        static {
            Covode.recordClassIndex(19979);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(19980);
        }

        void a(MotionEvent motionEvent);
    }

    static {
        Covode.recordClassIndex(19977);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33494f = VelocityTracker.obtain();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.f33494f;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.f33494f.recycle();
            this.f33494f = null;
        }
    }

    public final void a() {
        float translationY = this.f33491c.getTranslationY();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f33491c, "translationY", translationY, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public final void a(View view) {
        this.f33491c = view;
    }

    public void setAnimationListener(a aVar) {
        this.f33493e = aVar;
    }

    public void setInternalTouchEventListener(b bVar) {
        this.f33496h = bVar;
    }

    public void setPullUpListener(a aVar) {
        this.f33492d = aVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b bVar = this.f33496h;
        if (bVar != null) {
            bVar.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean a(MotionEvent motionEvent) {
        View view = this.f33491c;
        if ((view == null || view.getTranslationY() <= 0.0f) && !onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f33490b = motionEvent.getY();
        } else if (motionEvent.getAction() != 2 || this.f33490b - motionEvent.getY() <= ((float) ViewConfiguration.get(this.f33489a).getScaledTouchSlop())) {
            return false;
        } else {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f33494f.addMovement(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f33490b = motionEvent.getY();
        }
        boolean z = false;
        if (motionEvent.getAction() == 2) {
            if (!a(motionEvent)) {
                return false;
            }
            this.f33491c.setTranslationY((float) ((int) Math.min(0.0f, motionEvent.getY() - this.f33490b)));
        } else if (motionEvent.getAction() == 1) {
            float translationY = this.f33491c.getTranslationY();
            if (Math.abs(this.f33491c.getTranslationY() / ((float) this.f33491c.getHeight())) > 0.3f) {
                z = true;
            }
            a(translationY, z);
        }
        return true;
    }

    public PullUpLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void a(float f2, final boolean z) {
        long j2;
        if (this.f33491c != null) {
            this.f33494f.computeCurrentVelocity(2);
            long j3 = 300;
            if (z) {
                if (this.f33494f.getYVelocity() != 0.0f) {
                    j2 = (long) ((((float) this.f33491c.getHeight()) + f2) / Math.abs(this.f33494f.getYVelocity()));
                } else {
                    j2 = 300;
                }
                View view = this.f33491c;
                this.f33495g = ObjectAnimator.ofFloat(view, "translationY", f2, (float) (-view.getHeight()));
            } else {
                if (this.f33494f.getYVelocity() != 0.0f) {
                    j2 = (long) (f2 / Math.abs(this.f33494f.getYVelocity()));
                } else {
                    j2 = 300;
                }
                this.f33495g = ObjectAnimator.ofFloat(this.f33491c, "translationY", f2, 0.0f);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (Math.abs(j2) <= 300) {
                j3 = Math.abs(j2);
            }
            animatorSet.setDuration(j3);
            animatorSet.play(this.f33495g);
            animatorSet.addListener(new Animator.AnimatorListener() {
                /* class com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(19978);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PullUpLayout.this.f33492d == null) {
                        return;
                    }
                    if (z) {
                        PullUpLayout.this.f33492d.a();
                    } else {
                        PullUpLayout.this.f33492d.b();
                    }
                }
            });
            animatorSet.start();
        }
    }

    private PullUpLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(10057);
        this.f33489a = context;
        this.f33494f = VelocityTracker.obtain();
        MethodCollector.o(10057);
    }
}
