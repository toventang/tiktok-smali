package com.ss.android.ad.splash.core.g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.f.e;
import com.ss.android.ad.splash.f.o;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f58558a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ad.splash.core.e.b f58559b;

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f58560c;

    /* renamed from: d  reason: collision with root package name */
    public LinearLayout f58561d;

    /* renamed from: e  reason: collision with root package name */
    public final a f58562e;

    /* renamed from: f  reason: collision with root package name */
    public final PointF f58563f = new PointF();

    /* renamed from: g  reason: collision with root package name */
    public final int f58564g;

    public interface a {
        static {
            Covode.recordClassIndex(36321);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(36315);
    }

    private boolean b() {
        if (this.f58559b.U == 6) {
            return true;
        }
        return false;
    }

    private boolean c() {
        if (this.f58559b.U == 7) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        if (c() || b()) {
            return true;
        }
        return false;
    }

    public b(Context context, com.ss.android.ad.splash.core.e.b bVar, RelativeLayout relativeLayout, a aVar) {
        final ObjectAnimator objectAnimator;
        MethodCollector.i(1830);
        this.f58558a = context;
        this.f58559b = bVar;
        this.f58560c = relativeLayout;
        this.f58562e = aVar;
        this.f58564g = ViewConfiguration.get(context).getScaledTouchSlop();
        if (a()) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.f58561d = linearLayout;
            linearLayout.setOrientation(1);
            this.f58561d.setBackgroundResource(R.drawable.bjx);
            this.f58561d.setGravity(81);
            if (b()) {
                final ImageView imageView = new ImageView(context);
                imageView.setImageResource(2131233859);
                imageView.setClickable(true);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.bottomMargin = (int) o.a(context, 4.0f);
                this.f58561d.addView(imageView, layoutParams);
                imageView.post(new Runnable() {
                    /* class com.ss.android.ad.splash.core.g.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(36316);
                    }

                    public final void run() {
                        int a2 = (int) o.a(b.this.f58558a, 8.0f);
                        b.this.f58561d.setTouchDelegate(new e(new Rect(imageView.getLeft() - a2, imageView.getTop() - a2, imageView.getRight() + a2, imageView.getBottom() + a2), imageView));
                    }
                });
            }
            TextView textView = new TextView(context);
            textView.setText(bVar.V);
            textView.setTextColor(ColorStateList.valueOf(-1));
            textView.setTextSize(1, 15.0f);
            float a2 = (float) ((int) o.a(context, 1.0f));
            textView.setShadowLayer(a2, 0.0f, a2, Color.argb(31, 0, 0, 0));
            textView.setClickable(true);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.bottomMargin = (int) o.a(context, 54.0f);
            this.f58561d.addView(textView, layoutParams2);
            if (bVar.W > 0) {
                this.f58561d.setVisibility(8);
                relativeLayout.postDelayed(new Runnable() {
                    /* class com.ss.android.ad.splash.core.g.b.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(36317);
                    }

                    public final void run() {
                        b.this.f58561d.setAlpha(0.0f);
                        b.this.f58561d.setVisibility(0);
                        ObjectAnimator.ofFloat(b.this.f58561d, "alpha", 0.0f, 1.0f).setDuration(300L).start();
                    }
                }, bVar.W);
            }
            if (c()) {
                objectAnimator = ObjectAnimator.ofFloat(textView, "translationY", 0.0f, -o.a(context, 8.0f), 0.0f);
                objectAnimator.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                objectAnimator.addListener(new AnimatorListenerAdapter() {
                    /* class com.ss.android.ad.splash.core.g.b.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(36320);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        animator.setStartDelay(1000);
                        animator.start();
                    }
                });
            } else {
                objectAnimator = null;
            }
            this.f58561d.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                /* class com.ss.android.ad.splash.core.g.b.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(36318);
                }

                public final void onViewDetachedFromWindow(View view) {
                    Animator animator = objectAnimator;
                    if (animator != null) {
                        animator.removeAllListeners();
                        objectAnimator.cancel();
                    }
                }

                public final void onViewAttachedToWindow(View view) {
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("refer", "tips");
                    com.ss.android.ad.splash.core.c.b.a();
                    com.ss.android.ad.splash.core.c.b.a(b.this.f58559b, 0, "othershow", hashMap, null);
                    if (objectAnimator != null) {
                        b.this.f58560c.postDelayed(new Runnable() {
                            /* class com.ss.android.ad.splash.core.g.b.AnonymousClass3.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(36319);
                            }

                            public final void run() {
                                objectAnimator.start();
                            }
                        }, b.this.f58559b.W);
                    }
                }
            });
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) o.a(context, 114.0f));
            layoutParams3.addRule(12);
            relativeLayout.addView(this.f58561d, layoutParams3);
        }
        MethodCollector.o(1830);
    }
}
