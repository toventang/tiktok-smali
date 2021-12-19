package com.ss.android.ugc.aweme.im.sdk.chat.ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
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
import androidx.core.h.h;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ChatDiggLayout extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    private static Drawable f101228f;

    /* renamed from: a  reason: collision with root package name */
    Queue<ImageView> f101229a;

    /* renamed from: b  reason: collision with root package name */
    int f101230b;

    /* renamed from: c  reason: collision with root package name */
    int f101231c;

    /* renamed from: d  reason: collision with root package name */
    Random f101232d;

    /* renamed from: e  reason: collision with root package name */
    private Context f101233e;

    static {
        Covode.recordClassIndex(64757);
    }

    private void a(final ImageView imageView) {
        float nextInt = (float) (this.f101232d.nextInt(20) - 10);
        imageView.setRotation(nextInt);
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
        float nextInt2 = (((float) this.f101232d.nextInt(10)) + 20.0f) / 10.0f;
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.6f, nextInt2, 1.6f, nextInt2, 1, 0.5f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        int b2 = (int) n.b(this.f101233e, 50.0f);
        float f2 = (float) (-(this.f101232d.nextInt(b2) + b2));
        double d2 = (double) f2;
        double d3 = (double) nextInt;
        Double.isNaN(d3);
        double tan = Math.tan((d3 * 3.141592653589793d) / 360.0d);
        Double.isNaN(d2);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) (d2 * tan), 0.0f, f2);
        animationSet2.addAnimation(scaleAnimation2);
        animationSet2.addAnimation(alphaAnimation);
        animationSet2.addAnimation(translateAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(animationSet2);
        imageView.startAnimation(animationSet);
        animationSet.setAnimationListener(new Animation.AnimationListener() {
            /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatDiggLayout.AnonymousClass1 */

            static {
                Covode.recordClassIndex(64758);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                ChatDiggLayout.this.post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatDiggLayout.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(64759);
                    }

                    public final void run() {
                        if (ChatDiggLayout.this.f101229a.size() < 3) {
                            ChatDiggLayout.this.f101229a.add(imageView);
                        }
                        imageView.setImageDrawable(null);
                        imageView.clearAnimation();
                        ChatDiggLayout.this.removeView(imageView);
                    }
                });
            }
        });
    }

    public ChatDiggLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void a(float f2, float f3) {
        ImageView poll;
        MethodCollector.i(3923);
        if (this.f101229a.isEmpty()) {
            poll = new ImageView(this.f101233e);
            if (f101228f == null) {
                f101228f = b.a(this.f101233e, 2131232782);
            }
        } else {
            poll = this.f101229a.poll();
        }
        poll.setImageDrawable(f101228f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f101231c, this.f101230b);
        layoutParams.setMargins(0, (int) (f3 - ((float) this.f101230b)), 0, 0);
        h.a(layoutParams, (int) (f2 - ((float) (this.f101231c / 2))));
        poll.setLayoutParams(layoutParams);
        if (poll.getParent() == null) {
            addView(poll);
        }
        a(poll);
        MethodCollector.o(3923);
    }

    private ChatDiggLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(3919);
        this.f101229a = new LinkedList();
        this.f101230b = -1;
        this.f101231c = -1;
        this.f101233e = context;
        this.f101232d = new Random();
        this.f101231c = (int) n.b(context, 72.0f);
        this.f101230b = (int) n.b(context, 79.0f);
        MethodCollector.o(3919);
    }
}
