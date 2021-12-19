package com.ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.b;
import androidx.core.h.v;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.aq.a.a;
import com.ss.android.ugc.aweme.base.utils.i;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class DiggLayout extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    private static Drawable f76514f;

    /* renamed from: a  reason: collision with root package name */
    Queue<ImageView> f76515a;

    /* renamed from: b  reason: collision with root package name */
    int f76516b;

    /* renamed from: c  reason: collision with root package name */
    int f76517c;

    /* renamed from: d  reason: collision with root package name */
    Random f76518d;

    /* renamed from: e  reason: collision with root package name */
    private Context f76519e;

    /* renamed from: g  reason: collision with root package name */
    private int f76520g;

    static {
        Covode.recordClassIndex(47246);
    }

    public DiggLayout(Context context) {
        this(context, null, (byte) 0);
    }

    public DiggLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void a(float f2, float f3) {
        final ImageView poll;
        float f4;
        MethodCollector.i(8937);
        if (this.f76515a.isEmpty()) {
            poll = new ImageView(this.f76519e);
            if (f76514f == null) {
                if (a.a()) {
                    f76514f = null;
                    f76514f = b.a(this.f76519e, 2131231545);
                } else {
                    f76514f = b.a(this.f76519e, 2131231545);
                }
            }
        } else {
            poll = this.f76515a.poll();
        }
        poll.setImageDrawable(f76514f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f76517c, this.f76516b);
        int i2 = Build.VERSION.SDK_INT;
        layoutParams.topMargin = (int) (f3 - ((float) (this.f76516b / 2)));
        if (v.e(this) == 1) {
            f4 = ((float) this.f76520g) - f2;
        } else {
            f4 = f2;
        }
        layoutParams.setMarginStart((int) (f4 - ((float) (this.f76517c / 2))));
        poll.setLayoutParams(layoutParams);
        if (poll.getParent() == null) {
            addView(poll);
        }
        float nextInt = (float) (this.f76518d.nextInt(40) - 20);
        poll.setRotation(nextInt);
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.6f, 1.0f, 1.6f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setInterpolator(new OvershootInterpolator());
        scaleAnimation.setFillBefore(true);
        scaleAnimation.setDuration(300);
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.setDuration(500);
        animationSet2.setStartOffset(500);
        animationSet2.setFillAfter(true);
        animationSet2.setInterpolator(new DecelerateInterpolator());
        float nextInt2 = (((float) this.f76518d.nextInt(10)) + 20.0f) / 10.0f;
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.6f, nextInt2, 1.6f, nextInt2, 1, 0.5f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        int b2 = (int) n.b(this.f76519e, 50.0f);
        float f5 = (float) (-(this.f76518d.nextInt(b2) + b2));
        double d2 = (double) f5;
        double d3 = (double) nextInt;
        Double.isNaN(d3);
        double tan = Math.tan((d3 * 3.141592653589793d) / 360.0d);
        Double.isNaN(d2);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) (d2 * tan), 0.0f, f5);
        animationSet2.addAnimation(scaleAnimation2);
        animationSet2.addAnimation(alphaAnimation);
        animationSet2.addAnimation(translateAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(animationSet2);
        poll.startAnimation(animationSet);
        animationSet.setAnimationListener(new Animation.AnimationListener() {
            /* class com.ss.android.ugc.aweme.common.widget.DiggLayout.AnonymousClass1 */

            static {
                Covode.recordClassIndex(47247);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                DiggLayout.this.post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.common.widget.DiggLayout.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(47248);
                    }

                    public final void run() {
                        if (DiggLayout.this.f76515a.size() < 3) {
                            DiggLayout.this.f76515a.add(poll);
                        }
                        poll.setImageDrawable(null);
                        poll.clearAnimation();
                        DiggLayout.this.removeView(poll);
                    }
                });
            }
        });
        MethodCollector.o(8937);
    }

    private DiggLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(8933);
        this.f76515a = new LinkedList();
        this.f76516b = -1;
        this.f76517c = -1;
        this.f76519e = context;
        this.f76518d = new Random();
        this.f76517c = (int) n.b(context, 72.0f);
        this.f76516b = (int) n.b(context, 79.0f);
        this.f76520g = i.b(context);
        MethodCollector.o(8933);
    }
}
