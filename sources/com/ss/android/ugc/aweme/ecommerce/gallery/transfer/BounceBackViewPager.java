package com.ss.android.ugc.aweme.ecommerce.gallery.transfer;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import dmt.viewpager.DmtRtlViewPager;
import h.f.b.l;

public final class BounceBackViewPager extends DmtRtlViewPager {

    /* renamed from: e  reason: collision with root package name */
    public static final a f85971e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ViewPager.e f85972a;

    /* renamed from: b  reason: collision with root package name */
    public int f85973b;

    /* renamed from: c  reason: collision with root package name */
    public float f85974c;

    /* renamed from: d  reason: collision with root package name */
    public int f85975d;

    /* renamed from: f  reason: collision with root package name */
    private final OverScrollEffect f85976f;

    /* renamed from: m  reason: collision with root package name */
    private final Camera f85977m;
    private float n;
    private int o;
    private final int p;
    private float q;
    private int r;

    static {
        Covode.recordClassIndex(53831);
    }

    final class OverScrollEffect {
        private Animator mAnimator;
        private float mOverscroll;

        static {
            Covode.recordClassIndex(53832);
        }

        public final float getMOverscroll() {
            return this.mOverscroll;
        }

        public final boolean isOverScrolling() {
            PagerAdapter adapter = BounceBackViewPager.this.getAdapter();
            if (adapter == null) {
                return false;
            }
            if (BounceBackViewPager.this.f85973b == 0 && this.mOverscroll < 0.0f) {
                return true;
            }
            if (adapter.getCount() - 1 != BounceBackViewPager.this.f85973b || this.mOverscroll <= 0.0f) {
                return false;
            }
            return true;
        }

        public final void onRelease() {
            Animator animator = this.mAnimator;
            if (animator == null || !animator.isRunning()) {
                startAnimation(0.0f);
                return;
            }
            Animator animator2 = this.mAnimator;
            if (animator2 != null) {
                animator2.addListener(new a(this));
            }
            Animator animator3 = this.mAnimator;
            if (animator3 != null) {
                animator3.cancel();
            }
        }

        public final void setMOverscroll(float f2) {
            this.mOverscroll = f2;
        }

        public static final class a implements Animator.AnimatorListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ OverScrollEffect f85978a;

            static {
                Covode.recordClassIndex(53833);
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

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(OverScrollEffect overScrollEffect) {
                this.f85978a = overScrollEffect;
            }

            public final void onAnimationEnd(Animator animator) {
                l.d(animator, "");
                this.f85978a.startAnimation(0.0f);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OverScrollEffect() {
        }

        public final void setPull(float f2) {
            this.mOverscroll = f2;
            BounceBackViewPager.this.a();
        }

        public final void startAnimation(float f2) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "pull", this.mOverscroll, f2);
            this.mAnimator = ofFloat;
            if (ofFloat != null) {
                ofFloat.setInterpolator(new DecelerateInterpolator());
            }
            float abs = Math.abs(f2 - this.mOverscroll);
            Animator animator = this.mAnimator;
            if (animator != null) {
                animator.setDuration((long) (((float) BounceBackViewPager.this.getOverScrollAnimationDuration()) * abs));
            }
            Animator animator2 = this.mAnimator;
            if (animator2 != null) {
                animator2.start();
            }
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53834);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getOverScrollAnimationDuration() {
        return this.r;
    }

    public final float getOverScrollTranslation() {
        return this.q;
    }

    public final void a() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).invalidate();
        }
    }

    @Override // dmt.viewpager.DmtViewPager, dmt.viewpager.DmtRtlViewPager
    public final void setOnPageChangeListener(ViewPager.e eVar) {
        this.f85972a = eVar;
    }

    public final void setOverScrollAnimationDuration(int i2) {
        this.r = i2;
    }

    public final void setOverScrollTranslation(int i2) {
        this.q = (float) i2;
    }

    final class b implements ViewPager.e {
        static {
            Covode.recordClassIndex(53835);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            ViewPager.e eVar = BounceBackViewPager.this.f85972a;
            if (eVar != null) {
                eVar.onPageSelected(i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            ViewPager.e eVar = BounceBackViewPager.this.f85972a;
            if (eVar != null) {
                eVar.onPageScrollStateChanged(i2);
            }
            if (i2 == 0) {
                BounceBackViewPager.this.f85974c = 0.0f;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
            ViewPager.e eVar = BounceBackViewPager.this.f85972a;
            if (eVar != null) {
                eVar.onPageScrolled(i2, f2, i3);
            }
            BounceBackViewPager.this.f85973b = i2;
            BounceBackViewPager.this.f85974c = f2;
            BounceBackViewPager.this.f85975d = i2;
            BounceBackViewPager.this.a();
        }
    }

    @Override // dmt.viewpager.DmtViewPager
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        try {
            z = super.dispatchTouchEvent(motionEvent);
            return z;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return z;
        } catch (ArrayIndexOutOfBoundsException e3) {
            e3.printStackTrace();
            return z;
        }
    }

    @Override // dmt.viewpager.DmtViewPager, dmt.viewpager.DmtRtlViewPager
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        try {
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.n = motionEvent.getX();
                this.o = motionEvent.getPointerId(0);
            } else if (action == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.n = motionEvent.getX(actionIndex);
                this.o = motionEvent.getPointerId(actionIndex);
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        } catch (ArrayIndexOutOfBoundsException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BounceBackViewPager(Context context) {
        super(context, null);
        if (context == null) {
            l.b();
        }
        this.f85976f = new OverScrollEffect();
        this.f85977m = new Camera();
        setStaticTransformationsEnabled(true);
        this.p = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        super.setOnPageChangeListener(new b());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.pc, R.attr.pd});
        l.b(obtainStyledAttributes, "");
        this.q = obtainStyledAttributes.getDimension(1, 400.0f);
        this.r = obtainStyledAttributes.getInt(0, 400);
        obtainStyledAttributes.recycle();
    }

    @Override // dmt.viewpager.DmtViewPager, dmt.viewpager.DmtRtlViewPager
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i2 = 0;
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int i3 = this.o;
                    if (i3 != -1) {
                        float x = motionEvent.getX(motionEvent.findPointerIndex(i3));
                        float f2 = this.n - x;
                        getScrollX();
                        int width = getWidth();
                        int pageMargin = getPageMargin() + width;
                        PagerAdapter adapter = getAdapter();
                        if (adapter == null) {
                            l.b();
                        }
                        int count = adapter.getCount() - 1;
                        int currentItem = getCurrentItem();
                        float max = (float) Math.max(0, (currentItem - 1) * pageMargin);
                        float f3 = (float) pageMargin;
                        float min = ((float) Math.min(currentItem + 1, count)) * f3;
                        if (this.f85974c != 0.0f) {
                            this.n = x;
                        } else if (currentItem == 0) {
                            if (max == 0.0f) {
                                this.f85976f.setPull((f2 + ((float) this.p)) / ((float) width));
                            }
                        } else if (count == currentItem && min == ((float) count) * f3) {
                            this.f85976f.setPull((f2 - ((float) this.p)) / ((float) width));
                        }
                    } else {
                        this.f85976f.onRelease();
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.n = motionEvent.getX(actionIndex);
                        this.o = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        int action2 = (motionEvent.getAction() & 65280) >> 8;
                        if (motionEvent.getPointerId(action2) == this.o) {
                            if (action2 == 0) {
                                i2 = 1;
                            }
                            this.n = motionEvent.getX(i2);
                            this.o = motionEvent.getPointerId(i2);
                        }
                    }
                    i2 = 1;
                }
            }
            this.o = -1;
            this.f85976f.onRelease();
            i2 = 1;
        } else {
            this.n = motionEvent.getX();
            this.o = motionEvent.getPointerId(0);
            i2 = 1;
        }
        if (!this.f85976f.isOverScrolling() || i2 != 0) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean getChildStaticTransformation(View view, Transformation transformation) {
        boolean z;
        float max;
        l.d(view, "");
        l.d(transformation, "");
        if (view.getWidth() == 0) {
            return false;
        }
        int i2 = this.f85973b;
        if (i2 != 0) {
            PagerAdapter adapter = getAdapter();
            if (adapter == null) {
                l.b();
            }
            if (i2 != adapter.getCount() - 1) {
                z = false;
                if (this.f85976f.isOverScrolling() || !z) {
                    return false;
                }
                float width = ((float) getWidth()) / 2.0f;
                int height = getHeight() / 2;
                transformation.getMatrix().reset();
                float f2 = this.q;
                if (this.f85976f.getMOverscroll() > 0.0f) {
                    max = Math.min(this.f85976f.getMOverscroll(), 1.0f);
                } else {
                    max = Math.max(this.f85976f.getMOverscroll(), -1.0f);
                }
                this.f85977m.save();
                this.f85977m.translate(-(f2 * max), 0.0f, 0.0f);
                this.f85977m.getMatrix(transformation.getMatrix());
                this.f85977m.restore();
                float f3 = (float) height;
                transformation.getMatrix().preTranslate(-width, -f3);
                transformation.getMatrix().postTranslate(width, f3);
                if (getChildCount() == 1) {
                    invalidate();
                } else {
                    view.invalidate();
                }
                return true;
            }
        }
        z = true;
        if (this.f85976f.isOverScrolling()) {
        }
        return false;
    }
}
