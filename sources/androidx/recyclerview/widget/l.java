package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.h.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class l extends RecyclerView.h implements RecyclerView.m {
    private static final int[] t = {16842919};
    private static final int[] u = new int[0];
    private int A;
    private final int[] B = new int[2];
    private final int[] C = new int[2];
    private final Runnable D;
    private final RecyclerView.n E;

    /* renamed from: a  reason: collision with root package name */
    final int f4118a;

    /* renamed from: b  reason: collision with root package name */
    public final StateListDrawable f4119b;

    /* renamed from: c  reason: collision with root package name */
    public final Drawable f4120c;

    /* renamed from: d  reason: collision with root package name */
    public final StateListDrawable f4121d;

    /* renamed from: e  reason: collision with root package name */
    public final Drawable f4122e;

    /* renamed from: f  reason: collision with root package name */
    int f4123f;

    /* renamed from: g  reason: collision with root package name */
    int f4124g;

    /* renamed from: h  reason: collision with root package name */
    float f4125h;

    /* renamed from: i  reason: collision with root package name */
    int f4126i;

    /* renamed from: j  reason: collision with root package name */
    int f4127j;

    /* renamed from: k  reason: collision with root package name */
    float f4128k;

    /* renamed from: l  reason: collision with root package name */
    int f4129l;

    /* renamed from: m  reason: collision with root package name */
    int f4130m;
    RecyclerView n;
    boolean o;
    boolean p;
    int q;
    final ValueAnimator r;
    int s;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void a(boolean z2) {
    }

    private void c() {
        this.n.removeCallbacks(this.D);
    }

    private boolean a() {
        if (v.e(this.n) == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(1594);
    }

    private void b() {
        int i2 = this.s;
        if (i2 != 0) {
            if (i2 == 3) {
                this.r.cancel();
            } else {
                return;
            }
        }
        this.s = 1;
        ValueAnimator valueAnimator = this.r;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.r.setDuration(500L);
        this.r.setStartDelay(0);
        this.r.start();
    }

    class a extends AnimatorListenerAdapter {

        /* renamed from: b  reason: collision with root package name */
        private boolean f4134b;

        static {
            Covode.recordClassIndex(1597);
        }

        public final void onAnimationCancel(Animator animator) {
            this.f4134b = true;
        }

        a() {
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f4134b) {
                this.f4134b = false;
            } else if (((Float) l.this.r.getAnimatedValue()).floatValue() == 0.0f) {
                l.this.s = 0;
                l.this.a(0);
            } else {
                l.this.s = 2;
                l.this.n.invalidate();
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        static {
            Covode.recordClassIndex(1598);
        }

        b() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            l.this.f4119b.setAlpha(floatValue);
            l.this.f4120c.setAlpha(floatValue);
            l.this.n.invalidate();
        }
    }

    private void b(int i2) {
        c();
        this.n.postDelayed(this.D, (long) i2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r4) {
        /*
            r3 = this;
            r2 = 2
            if (r4 != r2) goto L_0x0032
            int r0 = r3.q
            if (r0 == r2) goto L_0x0011
            android.graphics.drawable.StateListDrawable r1 = r3.f4119b
            int[] r0 = androidx.recyclerview.widget.l.t
            r1.setState(r0)
            r3.c()
        L_0x0011:
            r3.b()
        L_0x0014:
            int r0 = r3.q
            if (r0 != r2) goto L_0x0029
            if (r4 == r2) goto L_0x0026
            android.graphics.drawable.StateListDrawable r1 = r3.f4119b
            int[] r0 = androidx.recyclerview.widget.l.u
            r1.setState(r0)
            r0 = 1200(0x4b0, float:1.682E-42)
            r3.b(r0)
        L_0x0026:
            r3.q = r4
            return
        L_0x0029:
            r0 = 1
            if (r4 != r0) goto L_0x0026
            r0 = 1500(0x5dc, float:2.102E-42)
            r3.b(r0)
            goto L_0x0026
        L_0x0032:
            if (r4 != 0) goto L_0x0011
            androidx.recyclerview.widget.RecyclerView r0 = r3.n
            r0.invalidate()
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l.a(int):void");
    }

    private boolean a(float f2, float f3) {
        if (a()) {
            if (f2 > ((float) this.w)) {
                return false;
            }
        } else if (f2 < ((float) (this.f4129l - this.w))) {
            return false;
        }
        int i2 = this.f4124g;
        int i3 = this.f4123f;
        if (f3 < ((float) (i2 - (i3 / 2))) || f3 > ((float) (i2 + (i3 / 2)))) {
            return false;
        }
        return true;
    }

    private boolean b(float f2, float f3) {
        if (f3 < ((float) (this.f4130m - this.y))) {
            return false;
        }
        int i2 = this.f4127j;
        int i3 = this.f4126i;
        if (f2 < ((float) (i2 - (i3 / 2))) || f2 > ((float) (i2 + (i3 / 2)))) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.q;
        if (i2 == 1) {
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            boolean b2 = b(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!a2) {
                if (!b2) {
                    return false;
                }
            } else if (!b2) {
                if (a2) {
                    this.A = 2;
                    this.f4125h = (float) ((int) motionEvent.getY());
                }
                a(2);
            }
            this.A = 1;
            this.f4128k = (float) ((int) motionEvent.getX());
            a(2);
        } else if (i2 == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.q != 0) {
            if (motionEvent.getAction() == 0) {
                boolean a2 = a(motionEvent.getX(), motionEvent.getY());
                boolean b2 = b(motionEvent.getX(), motionEvent.getY());
                if (!a2) {
                    if (!b2) {
                        return;
                    }
                } else if (!b2) {
                    if (a2) {
                        this.A = 2;
                        this.f4125h = (float) ((int) motionEvent.getY());
                    }
                    a(2);
                }
                this.A = 1;
                this.f4128k = (float) ((int) motionEvent.getX());
                a(2);
            } else if (motionEvent.getAction() == 1 && this.q == 2) {
                this.f4125h = 0.0f;
                this.f4128k = 0.0f;
                a(1);
                this.A = 0;
            } else if (motionEvent.getAction() == 2 && this.q == 2) {
                b();
                if (this.A == 1) {
                    float x2 = motionEvent.getX();
                    int[] iArr = this.C;
                    int i2 = this.v;
                    iArr[0] = i2;
                    iArr[1] = this.f4129l - i2;
                    float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x2));
                    if (Math.abs(((float) this.f4127j) - max) >= 2.0f) {
                        int a3 = a(this.f4128k, max, iArr, this.n.computeHorizontalScrollRange(), this.n.computeHorizontalScrollOffset(), this.f4129l);
                        if (a3 != 0) {
                            this.n.scrollBy(a3, 0);
                        }
                        this.f4128k = max;
                    }
                }
                if (this.A == 2) {
                    float y2 = motionEvent.getY();
                    int[] iArr2 = this.B;
                    int i3 = this.v;
                    iArr2[0] = i3;
                    iArr2[1] = this.f4130m - i3;
                    float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y2));
                    if (Math.abs(((float) this.f4124g) - max2) >= 2.0f) {
                        int a4 = a(this.f4125h, max2, iArr2, this.n.computeVerticalScrollRange(), this.n.computeVerticalScrollOffset(), this.f4130m);
                        if (a4 != 0) {
                            this.n.scrollBy(0, a4);
                        }
                        this.f4125h = max2;
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        if (this.f4129l != this.n.getWidth() || this.f4130m != this.n.getHeight()) {
            this.f4129l = this.n.getWidth();
            this.f4130m = this.n.getHeight();
            a(0);
        } else if (this.s != 0) {
            if (this.o) {
                int i2 = this.f4129l;
                int i3 = this.w;
                int i4 = i2 - i3;
                int i5 = this.f4124g;
                int i6 = this.f4123f;
                int i7 = i5 - (i6 / 2);
                this.f4119b.setBounds(0, 0, i3, i6);
                this.f4120c.setBounds(0, 0, this.x, this.f4130m);
                if (a()) {
                    this.f4120c.draw(canvas);
                    canvas.translate((float) this.w, (float) i7);
                    canvas.scale(-1.0f, 1.0f);
                    this.f4119b.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-this.w), (float) (-i7));
                } else {
                    canvas.translate((float) i4, 0.0f);
                    this.f4120c.draw(canvas);
                    canvas.translate(0.0f, (float) i7);
                    this.f4119b.draw(canvas);
                    canvas.translate((float) (-i4), (float) (-i7));
                }
            }
            if (this.p) {
                int i8 = this.f4130m;
                int i9 = this.y;
                int i10 = i8 - i9;
                int i11 = this.f4127j;
                int i12 = this.f4126i;
                int i13 = i11 - (i12 / 2);
                this.f4121d.setBounds(0, 0, i12, i9);
                this.f4122e.setBounds(0, 0, this.f4129l, this.z);
                canvas.translate(0.0f, (float) i10);
                this.f4122e.draw(canvas);
                canvas.translate((float) i13, 0.0f);
                this.f4121d.draw(canvas);
                canvas.translate((float) (-i13), (float) (-i10));
            }
        }
    }

    private static int a(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / ((float) i5)) * ((float) i6));
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.r = ofFloat;
        this.s = 0;
        this.D = new Runnable() {
            /* class androidx.recyclerview.widget.l.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1595);
            }

            public final void run() {
                l lVar = l.this;
                int i2 = lVar.s;
                if (i2 == 1) {
                    lVar.r.cancel();
                } else if (i2 != 2) {
                    return;
                }
                lVar.s = 3;
                lVar.r.setFloatValues(((Float) lVar.r.getAnimatedValue()).floatValue(), 0.0f);
                lVar.r.setDuration(500L);
                lVar.r.start();
            }
        };
        AnonymousClass2 r1 = new RecyclerView.n() {
            /* class androidx.recyclerview.widget.l.AnonymousClass2 */

            static {
                Covode.recordClassIndex(1596);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2, int i3) {
                boolean z;
                boolean z2;
                l lVar = l.this;
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int computeVerticalScrollRange = lVar.n.computeVerticalScrollRange();
                int i4 = lVar.f4130m;
                if (computeVerticalScrollRange - i4 <= 0 || lVar.f4130m < lVar.f4118a) {
                    z = false;
                } else {
                    z = true;
                }
                lVar.o = z;
                int computeHorizontalScrollRange = lVar.n.computeHorizontalScrollRange();
                int i5 = lVar.f4129l;
                if (computeHorizontalScrollRange - i5 <= 0 || lVar.f4129l < lVar.f4118a) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                lVar.p = z2;
                if (lVar.o || lVar.p) {
                    if (lVar.o) {
                        float f2 = (float) i4;
                        lVar.f4124g = (int) ((f2 * (((float) computeVerticalScrollOffset) + (f2 / 2.0f))) / ((float) computeVerticalScrollRange));
                        lVar.f4123f = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
                    }
                    if (lVar.p) {
                        float f3 = (float) i5;
                        lVar.f4127j = (int) ((f3 * (((float) computeHorizontalScrollOffset) + (f3 / 2.0f))) / ((float) computeHorizontalScrollRange));
                        lVar.f4126i = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
                    }
                    if (lVar.q == 0 || lVar.q == 1) {
                        lVar.a(1);
                    }
                } else if (lVar.q != 0) {
                    lVar.a(0);
                }
            }
        };
        this.E = r1;
        this.f4119b = stateListDrawable;
        this.f4120c = drawable;
        this.f4121d = stateListDrawable2;
        this.f4122e = drawable2;
        this.w = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.x = Math.max(i2, drawable.getIntrinsicWidth());
        this.y = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.z = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f4118a = i3;
        this.v = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new a());
        ofFloat.addUpdateListener(new b());
        RecyclerView recyclerView2 = this.n;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.c(this);
                this.n.b((RecyclerView.m) this);
                this.n.b(r1);
                c();
            }
            this.n = recyclerView;
            if (recyclerView != null) {
                recyclerView.a((RecyclerView.h) this);
                this.n.a((RecyclerView.m) this);
                this.n.a(r1);
            }
        }
    }
}
