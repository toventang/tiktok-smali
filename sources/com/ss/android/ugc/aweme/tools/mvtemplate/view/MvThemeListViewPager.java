package com.ss.android.ugc.aweme.tools.mvtemplate.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.NoScrollViewPager;
import com.ss.android.ugc.aweme.tools.mvtemplate.g;
import com.ss.android.ugc.d.a.c;

public class MvThemeListViewPager extends NoScrollViewPager {

    /* renamed from: a  reason: collision with root package name */
    public boolean f140923a;

    /* renamed from: b  reason: collision with root package name */
    public a f140924b;

    /* renamed from: c  reason: collision with root package name */
    private float f140925c;

    /* renamed from: d  reason: collision with root package name */
    private float f140926d;

    /* renamed from: e  reason: collision with root package name */
    private int f140927e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f140928f;

    /* renamed from: g  reason: collision with root package name */
    private float f140929g;

    /* renamed from: h  reason: collision with root package name */
    private float f140930h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f140931i = true;

    public interface a {
        static {
            Covode.recordClassIndex(92026);
        }

        void a();

        void a(float f2);
    }

    static {
        Covode.recordClassIndex(92024);
    }

    public void setBounceScrollListener(a aVar) {
        this.f140924b = aVar;
    }

    public void setHandleClickChange(boolean z) {
        this.f140931i = z;
    }

    private boolean a(MotionEvent motionEvent) {
        if ((this.f140927e != 0 || motionEvent.getX() <= this.f140929g) && (getAdapter() == null || this.f140927e != getAdapter().getCount() - 1 || motionEvent.getX() >= this.f140929g)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.effect.NoScrollViewPager, androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f140929g = motionEvent.getX();
            this.f140927e = getCurrentItem();
            this.f140930h = getTranslationX();
        } else if (action == 2 && a(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.ss.android.ugc.aweme.effect.NoScrollViewPager, androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f140923a || getAdapter() == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            if (getTranslationX() != this.f140930h && this.f140928f) {
                ValueAnimator duration = ValueAnimator.ofFloat(getTranslationX(), this.f140930h).setDuration(200L);
                duration.addUpdateListener(new a(this));
                duration.addListener(new AnimatorListenerAdapter() {
                    /* class com.ss.android.ugc.aweme.tools.mvtemplate.view.MvThemeListViewPager.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(92025);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        MvThemeListViewPager.this.f140923a = false;
                        if (MvThemeListViewPager.this.f140924b != null) {
                            MvThemeListViewPager.this.f140924b.a();
                        }
                    }
                });
                duration.start();
                this.f140923a = true;
            }
            this.f140928f = false;
        } else if (action == 2 && a(motionEvent)) {
            float x = motionEvent.getX();
            float f2 = x - this.f140929g;
            if (Math.abs(f2) > 4.0f) {
                this.f140928f = true;
                float translationX = getTranslationX() + (f2 * 0.45f);
                a aVar = this.f140924b;
                if (aVar != null) {
                    aVar.a(translationX);
                }
                setTranslationX(translationX);
                this.f140929g = x;
            }
        }
        if (this.f140928f || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        double d2;
        double d3;
        int width;
        float rawX;
        MvThemeListViewPager mvThemeListViewPager = this;
        char c2 = 0;
        if (motionEvent.getAction() == 0) {
            mvThemeListViewPager.f140925c = motionEvent.getX();
            mvThemeListViewPager.f140926d = motionEvent.getY();
            c.a(new g(g.b.START, g.a.MAIN_TEMPLATE, (byte) 0));
        } else {
            char c3 = 1;
            if (motionEvent.getAction() == 1 && mvThemeListViewPager.f140931i) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - mvThemeListViewPager.f140925c) > 60.0f || Math.abs(y - mvThemeListViewPager.f140926d) > 60.0f) {
                    super.dispatchTouchEvent(motionEvent);
                } else {
                    int childCount = getChildCount();
                    int currentItem = getCurrentItem();
                    int[] iArr = new int[2];
                    int i2 = 0;
                    while (true) {
                        if (i2 >= childCount) {
                            break;
                        }
                        View childAt = mvThemeListViewPager.getChildAt(i2);
                        int intValue = ((Integer) childAt.getTag()).intValue();
                        childAt.getLocationOnScreen(iArr);
                        int i3 = iArr[c2];
                        int i4 = iArr[c3];
                        int width2 = iArr[c2] + childAt.getWidth();
                        int height = iArr[c3] + childAt.getHeight();
                        if (intValue < currentItem) {
                            double d4 = (double) width2;
                            double width3 = (double) (((float) childAt.getWidth()) * 0.100000024f);
                            Double.isNaN(width3);
                            double width4 = (double) (((float) childAt.getWidth()) * Math.abs(0.0f));
                            Double.isNaN(width4);
                            Double.isNaN(d4);
                            width2 = (int) (d4 - ((width3 * 0.5d) + (width4 * 0.5d)));
                            d2 = (double) i3;
                            double width5 = (double) (((float) childAt.getWidth()) * 0.100000024f);
                            Double.isNaN(width5);
                            double width6 = (double) (((float) childAt.getWidth()) * Math.abs(0.0f));
                            Double.isNaN(width6);
                            d3 = (width5 * 0.5d) + (width6 * 0.5d);
                            Double.isNaN(d2);
                        } else if (intValue == currentItem) {
                            width = (int) (((float) i3) + (((float) childAt.getWidth()) * Math.abs(0.0f)));
                            rawX = motionEvent.getRawX();
                            float rawY = motionEvent.getRawY();
                            if (rawX > ((float) width) || rawX >= ((float) width2) || rawY <= ((float) i4) || rawY >= ((float) height)) {
                                i2++;
                                c2 = 0;
                                c3 = 1;
                                mvThemeListViewPager = this;
                            } else {
                                int intValue2 = ((Integer) childAt.getTag()).intValue();
                                if (getCurrentItem() != intValue2) {
                                    setCurrentItem(intValue2, true);
                                }
                            }
                        } else {
                            double d5 = (double) width2;
                            double width7 = (double) (((float) childAt.getWidth()) * Math.abs(0.0f));
                            Double.isNaN(width7);
                            Double.isNaN(d5);
                            width2 = (int) (d5 - (width7 * 0.5d));
                            d2 = (double) i3;
                            double width8 = (double) (((float) childAt.getWidth()) * Math.abs(0.0f));
                            Double.isNaN(width8);
                            d3 = width8 * 0.5d;
                            Double.isNaN(d2);
                        }
                        width = (int) (d2 - d3);
                        rawX = motionEvent.getRawX();
                        float rawY2 = motionEvent.getRawY();
                        if (rawX > ((float) width)) {
                        }
                        i2++;
                        c2 = 0;
                        c3 = 1;
                        mvThemeListViewPager = this;
                    }
                    super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public MvThemeListViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
