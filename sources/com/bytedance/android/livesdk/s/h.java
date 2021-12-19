package com.bytedance.android.livesdk.s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.s.j;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;

public final class h extends b {

    /* renamed from: a  reason: collision with root package name */
    public g f21115a;

    /* renamed from: b  reason: collision with root package name */
    public j.a f21116b;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f21117c;

    /* renamed from: d  reason: collision with root package name */
    public ValueAnimator f21118d;

    /* renamed from: e  reason: collision with root package name */
    public float f21119e;

    /* renamed from: f  reason: collision with root package name */
    public float f21120f;

    /* renamed from: g  reason: collision with root package name */
    public float f21121g;

    /* renamed from: h  reason: collision with root package name */
    public float f21122h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f21123i;

    /* renamed from: j  reason: collision with root package name */
    public int f21124j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f21125k;

    /* renamed from: l  reason: collision with root package name */
    public int f21126l;

    /* renamed from: m  reason: collision with root package name */
    public int f21127m;
    public boolean n = true;
    private d o;
    private TimeInterpolator p;
    private boolean q = true;

    static {
        Covode.recordClassIndex(12469);
    }

    private h() {
    }

    @Override // com.bytedance.android.livesdk.s.b
    public final void a() {
        j.a(this.f21116b.r);
        this.f21115a.f();
        this.f21125k = false;
    }

    public final View e() {
        this.f21124j = ViewConfiguration.get(this.f21116b.f21145a).getScaledTouchSlop();
        return this.f21116b.f21146b;
    }

    private void f() {
        if (this.f21116b.w == null) {
            if (this.p == null) {
                this.p = new DecelerateInterpolator();
            }
            this.f21116b.w = this.p;
        }
        this.f21118d.setInterpolator(this.f21116b.w);
        this.f21118d.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.android.livesdk.s.h.AnonymousClass7 */

            static {
                Covode.recordClassIndex(12476);
            }

            public final void onAnimationEnd(Animator animator) {
                h.this.f21118d.removeAllUpdateListeners();
                h.this.f21118d.removeAllListeners();
                h.this.f21118d = null;
            }
        });
        this.f21118d.setDuration(this.f21116b.v).start();
    }

    public final void d() {
        if (!this.q && this.f21125k) {
            e().setVisibility(4);
            this.f21125k = false;
            if (this.f21116b.t != null) {
                this.f21116b.t.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.f21116b.q == null) {
            if (this.p == null) {
                this.p = new DecelerateInterpolator();
            }
            this.f21116b.q = this.p;
        }
        this.f21117c.setInterpolator(this.f21116b.q);
        this.f21117c.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.android.livesdk.s.h.AnonymousClass6 */

            static {
                Covode.recordClassIndex(12475);
            }

            public final void onAnimationEnd(Animator animator) {
                h.this.f21117c.removeAllUpdateListeners();
                h.this.f21117c.removeAllListeners();
                h.this.f21117c = null;
                if (h.this.f21116b.t != null) {
                    h.this.f21116b.t.d();
                }
            }
        });
        this.f21117c.setDuration(this.f21116b.p).start();
        if (this.f21116b.t != null) {
            this.f21116b.t.c();
        }
    }

    public final void c() {
        int i2;
        if (this.q) {
            this.f21115a.e();
            this.q = false;
            this.f21125k = true;
        } else if (!this.f21125k) {
            e().setVisibility(0);
            this.f21125k = true;
        } else {
            return;
        }
        if (this.f21116b.t != null) {
            this.f21116b.t.a();
        }
        if (this.f21116b.v > 0) {
            if ((this.f21115a.f21113g * 2) + this.f21116b.f21148d > y.c()) {
                i2 = y.c();
            } else {
                i2 = -this.f21116b.f21148d;
            }
            ValueAnimator ofInt = ObjectAnimator.ofInt(i2, this.f21115a.f21113g);
            this.f21118d = ofInt;
            ofInt.addUpdateListener(new i(this));
            f();
        }
    }

    h(j.a aVar) {
        this.f21116b = aVar;
        this.f21115a = new g(aVar.f21145a);
        e().setOnTouchListener(new View.OnTouchListener() {
            /* class com.bytedance.android.livesdk.s.h.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            float f21129a;

            /* renamed from: b  reason: collision with root package name */
            float f21130b;

            /* renamed from: c  reason: collision with root package name */
            float f21131c;

            /* renamed from: d  reason: collision with root package name */
            float f21132d;

            /* renamed from: e  reason: collision with root package name */
            int f21133e;

            /* renamed from: f  reason: collision with root package name */
            int f21134f;

            /* renamed from: g  reason: collision with root package name */
            Point f21135g = new Point();

            static {
                Covode.recordClassIndex(12471);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z;
                int i2;
                int action = motionEvent.getAction();
                if (action == 0) {
                    h.this.f21119e = motionEvent.getRawX();
                    h.this.f21120f = motionEvent.getRawY();
                    this.f21129a = motionEvent.getRawX();
                    this.f21130b = motionEvent.getRawY();
                    h hVar = h.this;
                    if (hVar.f21117c != null && hVar.f21117c.isRunning()) {
                        hVar.f21117c.cancel();
                    }
                    WindowManager windowManager = h.this.f21115a.f21111e;
                    if (windowManager != null) {
                        windowManager.getDefaultDisplay().getSize(this.f21135g);
                        h.this.f21126l = this.f21135g.x;
                        h.this.f21127m = this.f21135g.y;
                    } else {
                        h hVar2 = h.this;
                        hVar2.f21127m = n.b(hVar2.f21116b.f21145a);
                        h hVar3 = h.this;
                        hVar3.f21126l = n.a(hVar3.f21116b.f21145a);
                    }
                    h.this.n = true;
                } else if (action == 1) {
                    h.this.f21121g = motionEvent.getRawX();
                    h.this.f21122h = motionEvent.getRawY();
                    h hVar4 = h.this;
                    if (Math.abs(hVar4.f21121g - h.this.f21119e) > ((float) h.this.f21124j) || Math.abs(h.this.f21122h - h.this.f21120f) > ((float) h.this.f21124j)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hVar4.f21123i = z;
                    h hVar5 = h.this;
                    int i3 = hVar5.f21116b.f21155k;
                    if (i3 != 3) {
                        if (i3 == 4) {
                            hVar5.f21117c = ObjectAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofInt("x", hVar5.f21115a.f21113g, hVar5.f21116b.f21151g), PropertyValuesHolder.ofInt("y", hVar5.f21115a.f21114h, hVar5.f21116b.f21152h));
                            hVar5.f21117c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                /* class com.bytedance.android.livesdk.s.h.AnonymousClass3 */

                                static {
                                    Covode.recordClassIndex(12472);
                                }

                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int intValue = ((Integer) valueAnimator.getAnimatedValue("x")).intValue();
                                    int intValue2 = ((Integer) valueAnimator.getAnimatedValue("y")).intValue();
                                    h.this.f21115a.a(intValue, intValue2);
                                    if (h.this.f21116b.t != null) {
                                        h.this.f21116b.t.a(intValue, intValue2);
                                    }
                                }
                            });
                            hVar5.b();
                        }
                    } else if (hVar5.f21123i) {
                        int i4 = hVar5.f21115a.f21113g;
                        if ((i4 * 2) + view.getWidth() > n.a(hVar5.f21116b.f21145a)) {
                            i2 = (n.a(hVar5.f21116b.f21145a) - view.getWidth()) - hVar5.f21116b.f21157m;
                        } else {
                            i2 = hVar5.f21116b.f21156l;
                        }
                        int i5 = hVar5.f21115a.f21114h;
                        int i6 = hVar5.f21115a.f21114h;
                        if (i6 < hVar5.f21116b.n) {
                            i6 = hVar5.f21116b.n;
                        } else if (i6 > y.b() - hVar5.f21116b.o) {
                            i6 = y.b() - hVar5.f21116b.o;
                        }
                        if ((hVar5.f21116b.o == 0 && hVar5.f21116b.n == 0) || i5 == i6) {
                            hVar5.f21117c = ObjectAnimator.ofInt(i4, i2);
                            hVar5.f21117c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                /* class com.bytedance.android.livesdk.s.h.AnonymousClass5 */

                                static {
                                    Covode.recordClassIndex(12474);
                                }

                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                    h.this.f21115a.a(intValue);
                                    if (h.this.f21116b.t != null) {
                                        h.this.f21116b.t.a(intValue, h.this.f21115a.f21114h);
                                    }
                                }
                            });
                        } else {
                            hVar5.f21117c = ObjectAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofInt("x", i4, i2), PropertyValuesHolder.ofInt("y", i5, i6));
                            hVar5.f21117c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                /* class com.bytedance.android.livesdk.s.h.AnonymousClass4 */

                                static {
                                    Covode.recordClassIndex(12473);
                                }

                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int intValue = ((Integer) valueAnimator.getAnimatedValue("x")).intValue();
                                    int intValue2 = ((Integer) valueAnimator.getAnimatedValue("y")).intValue();
                                    h.this.f21115a.a(intValue, intValue2);
                                    if (h.this.f21116b.t != null) {
                                        h.this.f21116b.t.a(intValue, intValue2);
                                    }
                                }
                            });
                        }
                        hVar5.b();
                    }
                    if (!hVar5.f21123i && hVar5.f21116b.t != null) {
                        hVar5.f21116b.t.e();
                    }
                    if (hVar5.f21123i && hVar5.f21116b.t != null) {
                        hVar5.f21116b.t.d();
                    }
                } else if (action == 2) {
                    this.f21131c = motionEvent.getRawX() - this.f21129a;
                    this.f21132d = motionEvent.getRawY() - this.f21130b;
                    if (Math.abs(this.f21131c) > 0.0f || Math.abs(this.f21132d) > 0.0f) {
                        this.f21133e = (int) (((float) h.this.f21115a.f21113g) + this.f21131c);
                        this.f21134f = (int) (((float) h.this.f21115a.f21114h) + this.f21132d);
                        if (h.this.f21116b.u) {
                            if (this.f21133e < h.this.f21116b.f21156l) {
                                this.f21133e = h.this.f21116b.f21156l;
                            }
                            if (this.f21133e > (h.this.f21126l - view.getWidth()) - h.this.f21116b.f21157m) {
                                this.f21133e = (h.this.f21126l - h.this.f21116b.f21157m) - view.getWidth();
                            }
                            if (this.f21134f < h.this.f21116b.n) {
                                this.f21134f = h.this.f21116b.n;
                            }
                            if (this.f21134f > (h.this.f21127m - view.getHeight()) - h.this.f21116b.o) {
                                this.f21134f = (h.this.f21127m - h.this.f21116b.o) - view.getHeight();
                            }
                        }
                        if (h.this.f21116b.f21155k != 5) {
                            h.this.f21115a.a(this.f21133e, this.f21134f);
                            if (h.this.f21116b.t != null) {
                                if (h.this.n) {
                                    h.this.f21116b.t.c();
                                    h.this.n = false;
                                }
                                h.this.f21116b.t.a(this.f21133e, this.f21134f);
                            }
                        }
                    }
                    this.f21129a = motionEvent.getRawX();
                    this.f21130b = motionEvent.getRawY();
                }
                return h.this.f21123i;
            }
        });
        this.f21115a.b(aVar.f21148d, aVar.f21149e);
        this.f21115a.a(aVar.f21150f, aVar.f21151g, aVar.f21152h);
        this.f21115a.f21112f = aVar.f21146b;
        this.o = new d(this.f21116b.f21145a, this.f21116b.f21153i, this.f21116b.f21154j, new e() {
            /* class com.bytedance.android.livesdk.s.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(12470);
            }

            @Override // com.bytedance.android.livesdk.s.e
            public final void a() {
                if (!h.this.f21116b.s) {
                    h.this.d();
                }
            }
        });
    }
}
