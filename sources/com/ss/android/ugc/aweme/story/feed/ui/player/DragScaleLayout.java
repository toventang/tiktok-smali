package com.ss.android.ugc.aweme.story.feed.ui.player;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.a.a;
import h.f.b.l;
import h.z;

public final class DragScaleLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private float f137694a;

    /* renamed from: b  reason: collision with root package name */
    private float f137695b;

    /* renamed from: c  reason: collision with root package name */
    private int f137696c;

    /* renamed from: d  reason: collision with root package name */
    private float f137697d;

    /* renamed from: e  reason: collision with root package name */
    private float f137698e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f137699f;

    /* renamed from: g  reason: collision with root package name */
    private a<z> f137700g;

    static {
        Covode.recordClassIndex(90114);
    }

    public DragScaleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final a<z> getReleaseListener() {
        return this.f137700g;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
    }

    private final void a() {
        this.f137694a = 0.0f;
        this.f137695b = 0.0f;
        this.f137697d = 0.0f;
        this.f137698e = 0.0f;
        this.f137699f = true;
        if (getScaleX() < 0.9f || getScaleY() < 0.9f) {
            a<z> aVar = this.f137700g;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        setScaleX(1.0f);
        setScaleY(1.0f);
    }

    public final void setReleaseListener(a<z> aVar) {
        this.f137700g = aVar;
    }

    public final void a(boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleX", getScaleX(), 1.0f);
            ofFloat.setDuration(300L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", getScaleY(), 1.0f);
            ofFloat2.setDuration(300L);
            animatorSet.setInterpolator(com.bytedance.tux.a.a.a.b());
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.start();
            return;
        }
        setScaleX(1.0f);
        setScaleY(1.0f);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f137694a = motionEvent.getX();
            this.f137695b = motionEvent.getY();
            this.f137699f = true;
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.f137694a - x <= Math.abs(y - this.f137695b) || this.f137694a - x <= ((float) this.f137696c)) {
                this.f137695b = y;
                this.f137694a = x;
            } else {
                this.f137695b = y;
                this.f137694a = x;
                requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f137694a = motionEvent.getX();
            this.f137695b = motionEvent.getY();
            this.f137697d = motionEvent.getX();
            this.f137698e = motionEvent.getY();
            this.f137699f = true;
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            String.valueOf(motionEvent.getX());
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.f137699f && this.f137694a - x > Math.abs(y - this.f137695b) && this.f137694a - x > ((float) this.f137696c)) {
                this.f137697d = motionEvent.getX();
                this.f137698e = motionEvent.getY();
                this.f137699f = false;
            }
            this.f137695b = y;
            this.f137694a = x;
            if (!this.f137699f) {
                float f2 = this.f137697d;
                if (f2 > x && f2 - x <= 1000.0f) {
                    float f3 = 1.0f - ((f2 - x) / 1000.0f);
                    String.valueOf(f3);
                    if (f3 >= 0.8f && f3 <= 1.0f) {
                        setScaleX(f3);
                        setScaleY(f3);
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    private /* synthetic */ DragScaleLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DragScaleLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(2539);
        this.f137696c = 10;
        this.f137699f = true;
        MethodCollector.o(2539);
    }
}
