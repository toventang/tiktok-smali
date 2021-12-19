package com.ss.android.ugc.aweme.dh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.PopupWindow;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.e.a.b;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.utils.gb;

public final class d extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public int f80094a;

    /* renamed from: b  reason: collision with root package name */
    public a f80095b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f80096c;

    /* renamed from: d  reason: collision with root package name */
    public int f80097d;

    /* renamed from: e  reason: collision with root package name */
    public int f80098e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f80099f;

    /* renamed from: g  reason: collision with root package name */
    public int f80100g;

    /* renamed from: h  reason: collision with root package name */
    public int f80101h;

    /* renamed from: i  reason: collision with root package name */
    public int f80102i;

    /* renamed from: j  reason: collision with root package name */
    public int f80103j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f80104k = true;

    /* renamed from: l  reason: collision with root package name */
    public boolean f80105l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f80106m;
    public int n;
    public boolean o;
    public long p = 7000;
    public AnimatorSet q;
    public long r = 800;
    public long s = 200;
    public b<Point> t;
    public a u;
    private boolean v;
    private Runnable w = new Runnable() {
        /* class com.ss.android.ugc.aweme.dh.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(49853);
        }

        public final void run() {
            d dVar = d.this;
            dVar.a(false, dVar.f80102i);
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(49857);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(49852);
    }

    public final void dismiss() {
        if (!this.v) {
            a(false, this.f80102i);
            getContentView().removeCallbacks(this.w);
            this.f80100g = 0;
            this.f80101h = 0;
        }
    }

    public final void a() {
        if (!this.f80096c.isFinishing() && isShowing()) {
            AnimatorSet animatorSet = this.q;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.q.cancel();
                this.q = null;
            }
            try {
                super.dismiss();
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            }
        }
    }

    public final void b() {
        int i2 = this.f80097d;
        if (i2 == 0 || this.f80098e == 0) {
            getContentView().measure(View.MeasureSpec.makeMeasureSpec(i.b(getContentView().getContext()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i.a(getContentView().getContext()), Integer.MIN_VALUE));
            return;
        }
        getContentView().measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f80098e, 1073741824));
    }

    public d(Activity activity) {
        super(activity);
        this.f80096c = activity;
        this.f80094a = (int) ((activity.getResources().getDisplayMetrics().density * 3.0f) + 0.5f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
    }

    public final void a(View view) {
        if (!this.f80096c.isFinishing() && view != null && view.getWindowToken() != null) {
            float b2 = n.b(this.f80096c, 36.0f);
            float b3 = n.b(this.f80096c, 64.0f);
            float b4 = n.b(this.f80096c, 16.0f);
            getContentView().removeCallbacks(this.w);
            if (!isShowing()) {
                int i2 = 2;
                int[] iArr = new int[2];
                b<Point> bVar = this.t;
                if (bVar != null) {
                    Point a2 = bVar.a();
                    iArr[0] = a2.x;
                    iArr[1] = a2.y;
                } else {
                    view.getLocationOnScreen(iArr);
                }
                this.f80102i = 48;
                this.n = -((int) n.b(view.getContext(), 3.5f));
                if (((float) (iArr[1] - getContentView().getMeasuredHeight())) - b2 < b3) {
                    this.f80102i = 80;
                }
                if (((float) iArr[0]) - (((float) getContentView().getMeasuredWidth()) / 2.0f) < b4) {
                    this.f80100g = (int) (b4 - (((float) iArr[0]) - (((float) getContentView().getMeasuredWidth()) / 2.0f)));
                }
                if (((float) i.b(this.f80096c)) - (((float) iArr[0]) + (((float) getContentView().getMeasuredWidth()) / 2.0f)) < b4) {
                    this.f80100g = (int) ((((float) i.b(this.f80096c)) - (((float) iArr[0]) + (((float) getContentView().getMeasuredWidth()) / 2.0f))) - b4);
                }
                int i3 = this.f80102i;
                if (i3 != 3) {
                    if (i3 != 5) {
                        if (i3 == 48) {
                            i2 = 3;
                        } else if (i3 == 80) {
                            i2 = 0;
                        }
                    }
                    i2 = 1;
                }
                float measuredWidth = ((float) getContentView().getMeasuredWidth()) / 2.0f;
                this.f80095b.a(i2, (((float) this.n) + measuredWidth) - ((float) this.f80100g));
                if (this.f80099f) {
                    int i4 = Build.VERSION.SDK_INT;
                    int i5 = Build.VERSION.SDK_INT;
                    getContentView().setSystemUiVisibility(4102);
                }
                int i6 = this.f80102i;
                if (i6 == 48) {
                    showAtLocation(view, 0, (int) (((float) (iArr[0] + this.f80100g)) - measuredWidth), (int) ((((float) (iArr[1] + this.f80101h)) - b2) - ((float) getContentView().getMeasuredHeight())));
                    a(true, this.f80102i);
                } else if (i6 == 80) {
                    showAtLocation(view, 0, (int) (((float) (iArr[0] + this.f80100g)) - measuredWidth), (int) (((float) (iArr[1] + this.f80101h)) + b2));
                    a(true, this.f80102i);
                }
                this.v = false;
                if (this.p > 0) {
                    getContentView().postDelayed(this.w, this.p);
                    return;
                }
                return;
            }
            super.dismiss();
        }
    }

    public final void a(final boolean z, final int i2) {
        final a aVar = this.f80095b;
        if (!z) {
            this.v = true;
        }
        AnimatorSet animatorSet = this.q;
        if (animatorSet == null) {
            this.q = new AnimatorSet();
        } else {
            animatorSet.removeAllListeners();
            this.q.cancel();
        }
        aVar.post(new Runnable() {
            /* class com.ss.android.ugc.aweme.dh.d.AnonymousClass3 */

            static {
                Covode.recordClassIndex(49855);
            }

            public final void run() {
                boolean z;
                float f2;
                float f3;
                float f4;
                long j2;
                if (d.this.q != null) {
                    d dVar = d.this;
                    if (!dVar.o || !gb.a(dVar.f80096c)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        d dVar2 = d.this;
                        int i2 = i2;
                        View view = aVar;
                        Point point = new Point(0, 0);
                        if (i2 == 3) {
                            point.x = (int) view.getX();
                            point.y = (int) (view.getY() + dVar2.f80095b.getBubbleOffset());
                        } else if (i2 == 5) {
                            point.x = (int) (view.getX() + ((float) view.getMeasuredWidth()));
                            point.y = (int) (view.getY() + dVar2.f80095b.getBubbleOffset());
                        } else if (i2 == 48) {
                            point.x = (int) (view.getX() + dVar2.f80095b.getBubbleOffset());
                            point.y = (int) (view.getY() + ((float) view.getMeasuredHeight()));
                        } else if (i2 == 80) {
                            point.x = (int) (view.getX() + dVar2.f80095b.getBubbleOffset());
                            point.y = (int) view.getY();
                        }
                        view.setPivotY((float) point.y);
                        view.setPivotX((float) point.x);
                    } else {
                        d dVar3 = d.this;
                        int i3 = i2;
                        View view2 = aVar;
                        Point point2 = new Point(0, 0);
                        if (i3 == 3) {
                            point2.x = (int) (view2.getX() + ((float) view2.getMeasuredWidth()));
                            point2.y = (int) (view2.getY() + dVar3.f80095b.getBubbleOffset());
                        } else if (i3 == 5) {
                            point2.x = (int) view2.getX();
                            point2.y = (int) (view2.getY() + dVar3.f80095b.getBubbleOffset());
                        } else if (i3 == 48) {
                            point2.x = (int) (view2.getX() + dVar3.f80095b.getBubbleOffset());
                            point2.y = (int) (view2.getY() + ((float) view2.getMeasuredHeight()));
                        } else if (i3 == 80) {
                            point2.x = (int) (view2.getX() + dVar3.f80095b.getBubbleOffset());
                            point2.y = (int) view2.getY();
                        }
                        view2.setPivotY((float) point2.y);
                        view2.setPivotX((float) point2.x);
                    }
                    View view3 = aVar;
                    float[] fArr = new float[2];
                    boolean z2 = z;
                    float f5 = 0.0f;
                    if (z2) {
                        f2 = 0.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    fArr[0] = f2;
                    if (z2) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    fArr[1] = f3;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, "scaleX", fArr);
                    View view4 = aVar;
                    float[] fArr2 = new float[2];
                    boolean z3 = z;
                    if (z3) {
                        f4 = 0.0f;
                    } else {
                        f4 = 1.0f;
                    }
                    fArr2[0] = f4;
                    if (z3) {
                        f5 = 1.0f;
                    }
                    fArr2[1] = f5;
                    d.this.q.play(ofFloat).with(ObjectAnimator.ofFloat(view4, "scaleY", fArr2));
                    AnimatorSet animatorSet = d.this.q;
                    if (z) {
                        j2 = d.this.r;
                    } else {
                        j2 = d.this.s;
                    }
                    animatorSet.setDuration(j2);
                    if (d.this.f80106m) {
                        d.this.q.setInterpolator(new OvershootInterpolator(1.0f));
                    }
                    d.this.q.addListener(new AnimatorListenerAdapter() {
                        /* class com.ss.android.ugc.aweme.dh.d.AnonymousClass3.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(49856);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (!z) {
                                aVar.setVisibility(8);
                                d.this.a();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            super.onAnimationStart(animator);
                            if (z) {
                                aVar.setVisibility(0);
                            }
                        }
                    });
                    d.this.q.start();
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
