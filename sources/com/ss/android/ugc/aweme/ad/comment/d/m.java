package com.ss.android.ugc.aweme.ad.comment.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.PopupWindow;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.e.a.b;
import com.ss.android.ugc.aweme.dh.a;
import com.zhiliaoapp.musically.R;

public final class m extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public static int f65659a;

    /* renamed from: b  reason: collision with root package name */
    public a f65660b;

    /* renamed from: c  reason: collision with root package name */
    public int f65661c;

    /* renamed from: d  reason: collision with root package name */
    public int f65662d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f65663e;

    /* renamed from: f  reason: collision with root package name */
    public int f65664f;

    /* renamed from: g  reason: collision with root package name */
    public int f65665g;

    /* renamed from: h  reason: collision with root package name */
    public int f65666h;

    /* renamed from: i  reason: collision with root package name */
    public int f65667i;

    /* renamed from: j  reason: collision with root package name */
    public int f65668j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f65669k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f65670l;

    /* renamed from: m  reason: collision with root package name */
    public long f65671m;
    public AnimatorSet n;
    public long o;
    public long p;
    public b<Point> q;
    private Activity r;
    private TuxTextView s;
    private boolean t;
    private boolean u;
    private Runnable v;

    static {
        Covode.recordClassIndex(40408);
    }

    public final void a() {
        if (!this.t) {
            this.f65660b.setVisibility(8);
            b();
            getContentView().removeCallbacks(this.v);
            this.f65664f = 0;
            this.f65665g = 0;
        }
    }

    public final void dismiss() {
        if (!this.t) {
            a(false, this.f65666h);
            getContentView().removeCallbacks(this.v);
            this.f65664f = 0;
            this.f65665g = 0;
        }
    }

    public final void b() {
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.n.cancel();
            this.n = null;
        }
        if (!this.r.isFinishing() && isShowing()) {
            try {
                super.dismiss();
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            }
        }
    }

    public final void a(View view) {
        a aVar = new a(this.r);
        this.f65660b = aVar;
        aVar.setBackgroundColor(0);
        this.f65660b.addView(view);
        this.f65660b.setGravity(17);
        this.f65660b.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        this.f65660b.setVisibility(8);
        int i2 = this.f65668j;
        if (i2 != 0) {
            this.f65660b.setBgColor(i2);
        }
        this.f65660b.setNeedPath(this.u);
        this.f65660b.setNeedPressFade(this.f65669k);
        this.f65660b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.ad.comment.d.m.AnonymousClass2 */

            static {
                Covode.recordClassIndex(40410);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                m.this.dismiss();
            }
        });
        setContentView(this.f65660b);
    }

    private m(Activity activity) {
        super(activity);
        this.u = true;
        this.f65671m = 7000;
        this.v = new Runnable() {
            /* class com.ss.android.ugc.aweme.ad.comment.d.m.AnonymousClass1 */

            static {
                Covode.recordClassIndex(40409);
            }

            public final void run() {
                m mVar = m.this;
                mVar.a(false, mVar.f65666h);
            }
        };
        this.o = 800;
        this.p = 200;
        this.r = activity;
        f65659a = (int) ((activity.getResources().getDisplayMetrics().density * 3.0f) + 0.5f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        TuxTextView tuxTextView = new TuxTextView(this.r);
        this.s = tuxTextView;
        tuxTextView.setTextColor(androidx.core.content.b.c(this.r, R.color.bx));
        this.s.setTuxFont(61);
        this.s.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.s.setMaxLines(2);
        this.s.setGravity(17);
        a(this.s);
        this.f65663e = true;
        getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final void b(View view) {
        if (!this.r.isFinishing() && view != null && view.getWindowToken() != null) {
            getContentView().removeCallbacks(this.v);
            this.f65666h = 80;
            if (!isShowing()) {
                int i2 = this.f65661c;
                if (i2 == 0 || this.f65662d == 0) {
                    getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
                } else {
                    getContentView().measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f65662d, 1073741824));
                }
                this.f65660b.a(0, ((float) (getContentView().getMeasuredWidth() / 2)) + ((float) this.f65667i));
                int[] iArr = new int[2];
                b<Point> bVar = this.q;
                if (bVar != null) {
                    Point a2 = bVar.a();
                    iArr[0] = a2.x;
                    iArr[1] = a2.y;
                } else {
                    view.getLocationOnScreen(iArr);
                }
                if (this.f65663e) {
                    int i3 = Build.VERSION.SDK_INT;
                    int i4 = Build.VERSION.SDK_INT;
                    getContentView().setSystemUiVisibility(4102);
                }
                showAsDropDown(view, this.f65664f + ((view.getMeasuredWidth() - getContentView().getMeasuredWidth()) / 2), f65659a + this.f65665g);
                a(true, 80);
                this.t = false;
                if (this.f65671m > 0) {
                    getContentView().postDelayed(this.v, this.f65671m);
                    return;
                }
                return;
            }
            super.dismiss();
        }
    }

    public m(Activity activity, byte b2) {
        this(activity);
    }

    public final void a(final boolean z, final int i2) {
        final a aVar = this.f65660b;
        if (!z) {
            this.t = true;
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet == null) {
            this.n = new AnimatorSet();
        } else {
            animatorSet.removeAllListeners();
            this.n.cancel();
        }
        aVar.post(new Runnable() {
            /* class com.ss.android.ugc.aweme.ad.comment.d.m.AnonymousClass3 */

            static {
                Covode.recordClassIndex(40411);
            }

            public final void run() {
                int i2;
                float f2;
                int i3;
                float f3;
                float f4;
                float f5;
                float f6;
                float f7;
                long j2;
                if (m.this.n != null) {
                    int i4 = i2;
                    if (i4 != 3) {
                        if (i4 == 5) {
                            i2 = (int) aVar.getX();
                            f3 = aVar.getY();
                            f4 = m.this.f65660b.getBubbleOffset();
                        } else if (i4 == 48) {
                            i2 = (int) (aVar.getX() + m.this.f65660b.getBubbleOffset());
                            f3 = aVar.getY();
                            f4 = (float) aVar.getMeasuredHeight();
                        } else if (i4 != 80) {
                            i2 = 0;
                            i3 = 0;
                        } else {
                            i2 = (int) (aVar.getX() + m.this.f65660b.getBubbleOffset());
                            f2 = aVar.getY();
                            i3 = (int) f2;
                        }
                        f2 = f3 + f4;
                        i3 = (int) f2;
                    } else {
                        i2 = (int) (aVar.getX() + ((float) aVar.getMeasuredWidth()));
                        f3 = aVar.getY();
                        f4 = m.this.f65660b.getBubbleOffset();
                        f2 = f3 + f4;
                        i3 = (int) f2;
                    }
                    aVar.setPivotY((float) i3);
                    aVar.setPivotX((float) i2);
                    View view = aVar;
                    float[] fArr = new float[2];
                    boolean z = z;
                    float f8 = 0.0f;
                    if (z) {
                        f5 = 0.0f;
                    } else {
                        f5 = 1.0f;
                    }
                    fArr[0] = f5;
                    if (z) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    fArr[1] = f6;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", fArr);
                    View view2 = aVar;
                    float[] fArr2 = new float[2];
                    boolean z2 = z;
                    if (z2) {
                        f7 = 0.0f;
                    } else {
                        f7 = 1.0f;
                    }
                    fArr2[0] = f7;
                    if (z2) {
                        f8 = 1.0f;
                    }
                    fArr2[1] = f8;
                    m.this.n.play(ofFloat).with(ObjectAnimator.ofFloat(view2, "scaleY", fArr2));
                    AnimatorSet animatorSet = m.this.n;
                    if (z) {
                        j2 = m.this.o;
                    } else {
                        j2 = m.this.p;
                    }
                    animatorSet.setDuration(j2);
                    if (m.this.f65670l) {
                        m.this.n.setInterpolator(new OvershootInterpolator(1.0f));
                    }
                    m.this.n.addListener(new AnimatorListenerAdapter() {
                        /* class com.ss.android.ugc.aweme.ad.comment.d.m.AnonymousClass3.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(40412);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (!z) {
                                aVar.setVisibility(8);
                                m.this.b();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            super.onAnimationStart(animator);
                            if (z) {
                                aVar.setVisibility(0);
                            }
                        }
                    });
                    m.this.n.start();
                }
            }
        });
    }

    public final void showAtLocation(View view, int i2, int i3, int i4) {
        try {
            super.showAtLocation(view, i2, i3, i4);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
        }
    }
}
