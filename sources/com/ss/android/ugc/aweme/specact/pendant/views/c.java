package com.ss.android.ugc.aweme.specact.pendant.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.utils.gb;
import h.f.b.l;
import java.util.Objects;

public class c extends FrameLayout implements View.OnTouchListener {
    public static final a o = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private float f134392a;

    /* renamed from: b  reason: collision with root package name */
    private float f134393b;

    /* renamed from: c  reason: collision with root package name */
    private int f134394c;

    /* renamed from: d  reason: collision with root package name */
    private float f134395d;

    /* renamed from: e  reason: collision with root package name */
    private float f134396e;

    /* renamed from: f  reason: collision with root package name */
    private float f134397f;

    /* renamed from: g  reason: collision with root package name */
    private float f134398g;

    /* renamed from: h  reason: collision with root package name */
    private float f134399h;

    /* renamed from: i  reason: collision with root package name */
    private float f134400i;

    /* renamed from: j  reason: collision with root package name */
    private float f134401j;

    /* renamed from: k  reason: collision with root package name */
    private float f134402k;

    /* renamed from: l  reason: collision with root package name */
    private float f134403l;

    /* renamed from: m  reason: collision with root package name */
    private float f134404m;
    public boolean n = true;
    private long p;

    static {
        Covode.recordClassIndex(87873);
    }

    private final float getMaxDragX() {
        return 2.14748365E9f;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87874);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean getCanDrag() {
        return this.n;
    }

    public final void setCanDrag(boolean z) {
        this.n = z;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent == null || !this.n) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.p = System.currentTimeMillis();
            this.f134401j = motionEvent.getRawX();
            this.f134402k = motionEvent.getRawY();
            this.f134399h = getX() - motionEvent.getRawX();
            this.f134400i = getY() - motionEvent.getRawY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            motionEvent.getRawX();
            motionEvent.getRawY();
            motionEvent.getRawX();
            motionEvent.getRawY();
            float rawX = motionEvent.getRawX() - this.f134401j;
            float rawY = motionEvent.getRawY() - this.f134402k;
            if (Math.abs(rawX) < ((float) this.f134394c) && Math.abs(rawY) < ((float) this.f134394c) && System.currentTimeMillis() - this.p < 250 && performClick()) {
                return true;
            }
            if (view == null) {
                l.b();
            }
            ViewParent parent = view.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            view.getX();
            float y = view.getY();
            if (!gb.a()) {
                this.f134403l = (float) view2.getLeft();
                this.f134403l = Math.min(((float) view2.getWidth()) - ((float) view.getWidth()), this.f134403l) + this.f134395d;
            } else {
                this.f134403l = (float) view2.getRight();
                this.f134403l = Math.min(((float) view2.getWidth()) - ((float) view.getWidth()), this.f134403l) + this.f134397f;
            }
            this.f134404m = y;
            if (view.getY() + ((float) view2.getTop()) < this.f134396e) {
                this.f134404m = ((float) view2.getTop()) + this.f134396e;
            }
            float f2 = this.f134404m;
            float f3 = this.f134392a;
            if (f2 < f3) {
                this.f134404m = f3;
            }
            if ((((float) view2.getBottom()) - view.getY()) - ((float) view.getHeight()) < this.f134398g) {
                this.f134404m = ((float) (view2.getBottom() - view.getHeight())) - this.f134398g;
            }
            if (this.f134404m > ((float) view2.getBottom()) - this.f134393b) {
                this.f134404m = ((float) view2.getBottom()) - this.f134393b;
            }
            view.animate().x(this.f134403l).y(this.f134404m).setInterpolator(new DecelerateInterpolator()).setDuration(200).start();
            return false;
        } else if (actionMasked != 2) {
            return super.onTouchEvent(motionEvent);
        } else {
            if (view == null) {
                l.b();
            }
            ViewParent parent2 = view.getParent();
            Objects.requireNonNull(parent2, "null cannot be cast to non-null type android.view.View");
            View view3 = (View) parent2;
            int width = view3.getWidth();
            int height = view3.getHeight();
            float min = Math.min(Math.max(0.0f, Math.max(motionEvent.getRawX() + this.f134399h, this.f134395d)), ((float) (width - view.getWidth())) - this.f134397f);
            if (min <= getMaxDragX()) {
                setX(min);
            }
            setY(Math.min(Math.max(0.0f, Math.max(motionEvent.getRawY() + this.f134400i, this.f134396e)), ((float) (height - view.getHeight())) - this.f134398g));
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet, int i2) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(10397);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        l.b(viewConfiguration, "");
        this.f134394c = viewConfiguration.getScaledTouchSlop();
        this.f134392a = ((float) i.a(context)) * 0.11f;
        this.f134393b = ((float) i.a(context)) * 0.4f;
        this.f134395d = 0.0f;
        this.f134397f = n.b(context, 8.0f);
        setOnTouchListener(this);
        MethodCollector.o(10397);
    }
}
