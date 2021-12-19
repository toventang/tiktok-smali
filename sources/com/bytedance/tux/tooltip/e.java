package com.bytedance.tux.tooltip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.c.f;
import com.bytedance.tux.h.d;
import com.bytedance.tux.h.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.n;
import h.z;

public final class e {

    /* renamed from: f  reason: collision with root package name */
    public static final a f45544f = new a((byte) 0);
    private static final int n = Color.parseColor("#FF00C6E9");

    /* renamed from: a  reason: collision with root package name */
    public final g f45545a = new g();

    /* renamed from: b  reason: collision with root package name */
    public int f45546b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f45547c;

    /* renamed from: d  reason: collision with root package name */
    public d f45548d;

    /* renamed from: e  reason: collision with root package name */
    public final a f45549e;

    /* renamed from: g  reason: collision with root package name */
    private int f45550g;

    /* renamed from: h  reason: collision with root package name */
    private int f45551h;

    /* renamed from: i  reason: collision with root package name */
    private int f45552i;

    /* renamed from: j  reason: collision with root package name */
    private int f45553j;

    /* renamed from: k  reason: collision with root package name */
    private final int f45554k;

    /* renamed from: l  reason: collision with root package name */
    private final View f45555l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f45556m;

    public static final class a {
        static {
            Covode.recordClassIndex(27721);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(27720);
    }

    private final int e() {
        if (!this.f45556m) {
            return this.f45546b;
        }
        int i2 = this.f45546b;
        Context context = this.f45547c;
        int i3 = 0;
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i3 = context.getResources().getDimensionPixelSize(identifier);
        }
        return i2 + i3;
    }

    private final int f() {
        int i2;
        Resources resources = this.f45547c.getResources();
        l.a((Object) resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i3 = 0;
        if (displayMetrics != null) {
            i2 = displayMetrics.heightPixels;
        } else {
            i2 = 0;
        }
        Context context = this.f45547c;
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i3 = context.getResources().getDimensionPixelSize(identifier);
        }
        return i2 + i3;
    }

    public final boolean a() {
        this.f45555l.measure(0, 0);
        this.f45552i = this.f45555l.getMeasuredWidth();
        this.f45553j = this.f45555l.getMeasuredHeight();
        if (this.f45548d.f45533c == null) {
            return a(this.f45548d.f45535e, this.f45545a, 0, 0, this.f45548d.r, this.f45548d.s);
        }
        View view = this.f45548d.f45533c;
        if (view == null) {
            l.a();
        }
        int width = view.getWidth();
        View view2 = this.f45548d.f45533c;
        if (view2 == null) {
            l.a();
        }
        int height = view2.getHeight();
        int[] iArr = new int[2];
        View view3 = this.f45548d.f45533c;
        if (view3 == null) {
            l.a();
        }
        view3.getLocationInWindow(iArr);
        return a(this.f45548d.f45535e, this.f45545a, width, height, iArr[0], iArr[1]);
    }

    public final void b() {
        if (i.a(this.f45547c)) {
            if (this.f45548d.f45535e == h.START) {
                this.f45548d.a(h.END);
            } else if (this.f45548d.f45535e == h.END) {
                this.f45548d.a(h.START);
            }
            if (this.f45548d.f45535e == h.TOP || this.f45548d.f45535e == h.BOTTOM) {
                d dVar = this.f45548d;
                dVar.f45538h = -dVar.f45538h;
            }
            d dVar2 = this.f45548d;
            dVar2.f45536f = -dVar2.f45536f;
            int i2 = Build.VERSION.SDK_INT;
            FrameLayout frameLayout = (FrameLayout) this.f45555l.findViewById(R.id.adh);
            l.a((Object) frameLayout, "");
            frameLayout.setLayoutDirection(1);
        }
    }

    public final void c() {
        this.f45549e.a(this.f45548d.z);
        this.f45549e.a(this.f45548d.A);
        this.f45546b = this.f45548d.f45540j;
        if (this.f45554k > this.f45548d.f45540j) {
            this.f45546b = this.f45554k;
        }
        this.f45546b -= this.f45554k;
        if (this.f45548d.f45539i < 0 && this.f45548d.f45539i != -1001) {
            this.f45548d.f45539i = 5000;
        }
        if (this.f45548d.f45542l < 0) {
            this.f45548d.f45542l = 300;
        }
        this.f45549e.a(this.f45548d.v);
        this.f45549e.b(this.f45548d.w);
        this.f45549e.a(this.f45548d.y, this.f45548d.x);
    }

    public final void d() {
        int i2;
        MethodCollector.i(6653);
        if (Build.VERSION.SDK_INT < 21) {
            ImageView imageView = (ImageView) this.f45555l.findViewById(R.id.m3);
            l.a((Object) imageView, "");
            imageView.setVisibility(8);
            ImageView imageView2 = (ImageView) this.f45555l.findViewById(R.id.lo);
            l.a((Object) imageView2, "");
            imageView2.setVisibility(8);
            ImageView imageView3 = (ImageView) this.f45555l.findViewById(R.id.m0);
            l.a((Object) imageView3, "");
            imageView3.setVisibility(8);
            ImageView imageView4 = (ImageView) this.f45555l.findViewById(R.id.lr);
            l.a((Object) imageView4, "");
            imageView4.setVisibility(8);
        }
        if (this.f45548d.t != null) {
            ((FrameLayout) this.f45555l.findViewById(R.id.ae6)).removeAllViews();
            ((FrameLayout) this.f45555l.findViewById(R.id.ae6)).addView(this.f45548d.t);
            FrameLayout frameLayout = (FrameLayout) this.f45555l.findViewById(R.id.ae6);
            l.a((Object) frameLayout, "");
            frameLayout.setBackground(null);
            this.f45548d.n = false;
        } else {
            if (this.f45548d.u != null) {
                ((FrameLayout) this.f45555l.findViewById(R.id.adh)).removeAllViews();
                ((FrameLayout) this.f45555l.findViewById(R.id.adh)).addView(this.f45548d.u);
            }
            if (this.f45548d.f45532b == null) {
                d dVar = this.f45548d;
                Context context = this.f45547c;
                int[] iArr = {R.attr.go, R.attr.gp, R.attr.gq, R.attr.gr, R.attr.gs, R.attr.gt, R.attr.gu, R.attr.gv, R.attr.gw};
                l.a((Object) iArr, "");
                Integer a2 = d.a(context, iArr, 0);
                if (a2 != null) {
                    i2 = a2.intValue();
                } else {
                    i2 = n;
                }
                dVar.f45532b = Integer.valueOf(i2);
            }
            Integer num = this.f45548d.f45532b;
            if (num != null) {
                Drawable a3 = f.a(new b(num.intValue())).a(this.f45547c);
                FrameLayout frameLayout2 = (FrameLayout) this.f45555l.findViewById(R.id.ae6);
                l.a((Object) frameLayout2, "");
                frameLayout2.setBackground(a3);
            }
        }
        RelativeLayout relativeLayout = (RelativeLayout) this.f45555l.findViewById(R.id.m1);
        l.a((Object) relativeLayout, "");
        relativeLayout.setVisibility(8);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f45555l.findViewById(R.id.ly);
        l.a((Object) relativeLayout2, "");
        relativeLayout2.setVisibility(8);
        RelativeLayout relativeLayout3 = (RelativeLayout) this.f45555l.findViewById(R.id.lp);
        l.a((Object) relativeLayout3, "");
        relativeLayout3.setVisibility(8);
        RelativeLayout relativeLayout4 = (RelativeLayout) this.f45555l.findViewById(R.id.lm);
        l.a((Object) relativeLayout4, "");
        relativeLayout4.setVisibility(8);
        if (this.f45548d.n) {
            int i3 = f.f45561e[this.f45548d.f45535e.ordinal()];
            if (i3 == 1) {
                RelativeLayout relativeLayout5 = (RelativeLayout) this.f45555l.findViewById(R.id.lm);
                l.a((Object) relativeLayout5, "");
                relativeLayout5.setVisibility(0);
                Integer num2 = this.f45548d.f45532b;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    Drawable a4 = androidx.core.content.b.a(this.f45547c, 2131230735);
                    if (a4 == null) {
                        l.a();
                    }
                    Drawable e2 = androidx.core.graphics.drawable.a.e(a4);
                    androidx.core.graphics.drawable.a.a(e2, intValue);
                    ((ImageView) this.f45555l.findViewById(R.id.ln)).setImageDrawable(e2);
                    MethodCollector.o(6653);
                    return;
                }
                MethodCollector.o(6653);
                return;
            } else if (i3 == 2) {
                RelativeLayout relativeLayout6 = (RelativeLayout) this.f45555l.findViewById(R.id.lp);
                l.a((Object) relativeLayout6, "");
                relativeLayout6.setVisibility(0);
                Integer num3 = this.f45548d.f45532b;
                if (num3 != null) {
                    int intValue2 = num3.intValue();
                    Drawable a5 = androidx.core.content.b.a(this.f45547c, 2131230740);
                    if (a5 == null) {
                        l.a();
                    }
                    Drawable e3 = androidx.core.graphics.drawable.a.e(a5);
                    androidx.core.graphics.drawable.a.a(e3, intValue2);
                    ((ImageView) this.f45555l.findViewById(R.id.lq)).setImageDrawable(e3);
                    MethodCollector.o(6653);
                    return;
                }
                MethodCollector.o(6653);
                return;
            } else if (i3 == 3) {
                RelativeLayout relativeLayout7 = (RelativeLayout) this.f45555l.findViewById(R.id.ly);
                l.a((Object) relativeLayout7, "");
                relativeLayout7.setVisibility(0);
                Integer num4 = this.f45548d.f45532b;
                if (num4 != null) {
                    int intValue3 = num4.intValue();
                    Drawable a6 = androidx.core.content.b.a(this.f45547c, 2131230740);
                    if (a6 == null) {
                        l.a();
                    }
                    Drawable e4 = androidx.core.graphics.drawable.a.e(a6);
                    androidx.core.graphics.drawable.a.a(e4, intValue3);
                    ((ImageView) this.f45555l.findViewById(R.id.lz)).setImageDrawable(e4);
                    MethodCollector.o(6653);
                    return;
                }
                MethodCollector.o(6653);
                return;
            } else if (i3 == 4) {
                RelativeLayout relativeLayout8 = (RelativeLayout) this.f45555l.findViewById(R.id.m1);
                l.a((Object) relativeLayout8, "");
                relativeLayout8.setVisibility(0);
                Integer num5 = this.f45548d.f45532b;
                if (num5 != null) {
                    int intValue4 = num5.intValue();
                    Drawable a7 = androidx.core.content.b.a(this.f45547c, 2131230735);
                    if (a7 == null) {
                        l.a();
                    }
                    Drawable e5 = androidx.core.graphics.drawable.a.e(a7);
                    androidx.core.graphics.drawable.a.a(e5, intValue4);
                    ((ImageView) this.f45555l.findViewById(R.id.m2)).setImageDrawable(e5);
                    MethodCollector.o(6653);
                    return;
                }
            }
        }
        MethodCollector.o(6653);
    }

    public final void a(d dVar) {
        l.c(dVar, "");
        this.f45548d = dVar;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<com.bytedance.tux.c.e, z> {
        final /* synthetic */ int $it;

        static {
            Covode.recordClassIndex(27722);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i2) {
            super(1);
            this.$it = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.e eVar) {
            com.bytedance.tux.c.e eVar2 = eVar;
            l.c(eVar2, "");
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
            eVar2.f44775a = Integer.valueOf(this.$it);
            return z.f158842a;
        }
    }

    private final void a(h hVar, g gVar) {
        int i2;
        int i3 = f.f45560d[hVar.ordinal()];
        if (i3 == 1 || i3 == 2) {
            int i4 = this.f45550g;
            float f2 = ((float) gVar.f45564c) - (((float) i4) / 2.0f);
            int i5 = this.f45546b;
            int i6 = this.f45554k;
            if (f2 < ((float) (i5 + i6))) {
                f2 = ((float) i5) + ((float) i6);
            } else {
                float f3 = ((float) i4) + f2 + ((float) i6);
                Resources resources = this.f45547c.getResources();
                l.a((Object) resources, "");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                int i7 = 0;
                if (displayMetrics != null) {
                    i2 = displayMetrics.widthPixels;
                } else {
                    i2 = 0;
                }
                if (f3 > ((float) (i2 - this.f45546b))) {
                    Resources resources2 = this.f45547c.getResources();
                    l.a((Object) resources2, "");
                    DisplayMetrics displayMetrics2 = resources2.getDisplayMetrics();
                    if (displayMetrics2 != null) {
                        i7 = displayMetrics2.widthPixels;
                    }
                    f2 = ((float) ((i7 - this.f45546b) - this.f45550g)) - ((float) this.f45554k);
                }
            }
            int i8 = gVar.f45562a;
            int i9 = this.f45554k;
            if (f2 < ((float) (i8 + i9))) {
                gVar.f45562a = h.g.a.a(f2) - this.f45554k;
            } else if (((float) this.f45550g) + f2 + ((float) i9) > ((float) (gVar.f45562a + this.f45552i))) {
                gVar.f45562a = ((h.g.a.a(f2) + this.f45550g) + this.f45554k) - this.f45552i;
            }
            gVar.f45564c = h.g.a.a((((float) this.f45550g) / 2.0f) + f2);
            float f4 = (f2 - ((float) gVar.f45562a)) - ((float) this.f45554k);
            if (hVar == h.TOP) {
                RelativeLayout relativeLayout = (RelativeLayout) this.f45555l.findViewById(R.id.lm);
                l.a((Object) relativeLayout, "");
                relativeLayout.setX(f4);
                return;
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) this.f45555l.findViewById(R.id.m1);
            l.a((Object) relativeLayout2, "");
            relativeLayout2.setX(f4);
        } else if (i3 == 3 || i3 == 4) {
            float f5 = ((float) gVar.f45565d) - (((float) this.f45550g) / 2.0f);
            int e2 = e();
            int i10 = this.f45554k;
            if (f5 < ((float) (e2 + i10))) {
                f5 = ((float) e()) + ((float) this.f45554k);
            } else if (((float) this.f45550g) + f5 + ((float) i10) > ((float) (f() - this.f45546b))) {
                f5 = ((float) ((f() - this.f45546b) - this.f45550g)) - ((float) this.f45554k);
            }
            int i11 = gVar.f45563b;
            int i12 = this.f45554k;
            if (f5 < ((float) (i11 + i12))) {
                gVar.f45563b = ((int) f5) - i12;
            } else {
                float f6 = ((float) this.f45550g) + f5 + ((float) i12);
                int i13 = gVar.f45563b;
                int i14 = this.f45553j;
                if (f6 > ((float) (i13 + i14))) {
                    gVar.f45563b = ((((int) f5) + this.f45550g) + this.f45554k) - i14;
                }
            }
            gVar.f45565d = h.g.a.a((((float) this.f45550g) / 2.0f) + f5);
            float f7 = (f5 - ((float) gVar.f45563b)) - ((float) this.f45554k);
            if (hVar == h.START) {
                RelativeLayout relativeLayout3 = (RelativeLayout) this.f45555l.findViewById(R.id.lp);
                l.a((Object) relativeLayout3, "");
                relativeLayout3.setY(f7);
                return;
            }
            RelativeLayout relativeLayout4 = (RelativeLayout) this.f45555l.findViewById(R.id.ly);
            l.a((Object) relativeLayout4, "");
            relativeLayout4.setY(f7);
        }
    }

    public final void a(g gVar, boolean z) {
        AnimatorSet animatorSet;
        l.c(gVar, "");
        if (this.f45548d.f45543m) {
            if (this.f45548d.B != null) {
                h.f.a.m<? super View, ? super Boolean, AnimatorSet> mVar = this.f45548d.B;
                if (mVar == null) {
                    l.a();
                }
                animatorSet = mVar.invoke(this.f45555l, Boolean.valueOf(z));
            } else {
                float f2 = 1.0f;
                float f3 = 0.0f;
                if (z) {
                    f2 = 0.0f;
                    f3 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f45555l, "scaleX", f2, f3);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f45555l, "scaleY", f2, f3);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f45555l, "alpha", f2, f3);
                animatorSet = new AnimatorSet();
                animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
                if (z) {
                    animatorSet.setInterpolator(this.f45548d.o);
                } else {
                    animatorSet.setInterpolator(this.f45548d.p);
                }
            }
            animatorSet.setDuration(this.f45548d.f45542l);
            this.f45555l.setPivotX((float) (gVar.f45564c - gVar.f45562a));
            this.f45555l.setPivotY((float) (gVar.f45565d - gVar.f45563b));
            animatorSet.start();
        }
    }

    private final boolean a(h hVar, g gVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (i2 == 0) {
            int i7 = f.f45558b[hVar.ordinal()];
            if (i7 == 1 || i7 == 2) {
                if (gVar.f45563b < e()) {
                    gVar.f45563b = e();
                    return false;
                } else if (gVar.f45563b + this.f45553j <= f() - this.f45546b) {
                    return true;
                } else {
                    gVar.f45563b = (f() - this.f45546b) - this.f45553j;
                    return false;
                }
            } else if (i7 == 3 || i7 == 4) {
                if (gVar.f45563b < e()) {
                    gVar.f45563b = e();
                } else if (gVar.f45563b + this.f45553j > f() - this.f45546b) {
                    gVar.f45563b = (f() - this.f45553j) - this.f45546b;
                }
            }
        } else {
            int i8 = f.f45559c[hVar.ordinal()];
            if (i8 == 1 || i8 == 2) {
                int i9 = gVar.f45562a;
                int i10 = this.f45546b;
                if (i9 < i10) {
                    gVar.f45562a = i10;
                } else {
                    int i11 = gVar.f45562a + this.f45552i;
                    Resources resources = this.f45547c.getResources();
                    l.a((Object) resources, "");
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    if (displayMetrics != null) {
                        i3 = displayMetrics.widthPixels;
                    } else {
                        i3 = 0;
                    }
                    if (i11 > i3 - this.f45546b) {
                        Resources resources2 = this.f45547c.getResources();
                        l.a((Object) resources2, "");
                        DisplayMetrics displayMetrics2 = resources2.getDisplayMetrics();
                        if (displayMetrics2 != null) {
                            i6 = displayMetrics2.widthPixels;
                        }
                        gVar.f45562a = (i6 - this.f45552i) - this.f45546b;
                    }
                }
            } else if (i8 == 3 || i8 == 4) {
                int i12 = gVar.f45562a;
                int i13 = this.f45546b;
                if (i12 < i13) {
                    gVar.f45562a = i13;
                    return false;
                }
                int i14 = gVar.f45562a + this.f45552i;
                Resources resources3 = this.f45547c.getResources();
                l.a((Object) resources3, "");
                DisplayMetrics displayMetrics3 = resources3.getDisplayMetrics();
                if (displayMetrics3 != null) {
                    i4 = displayMetrics3.widthPixels;
                } else {
                    i4 = 0;
                }
                if (i14 <= i4 - this.f45546b) {
                    return true;
                }
                Resources resources4 = this.f45547c.getResources();
                l.a((Object) resources4, "");
                DisplayMetrics displayMetrics4 = resources4.getDisplayMetrics();
                if (displayMetrics4 != null) {
                    i5 = displayMetrics4.widthPixels;
                } else {
                    i5 = 0;
                }
                gVar.f45562a = (i5 - this.f45552i) - this.f45546b;
                return false;
            }
        }
        return true;
    }

    public e(Context context, d dVar, a aVar, View view, boolean z) {
        l.c(context, "");
        l.c(dVar, "");
        l.c(aVar, "");
        l.c(view, "");
        this.f45547c = context;
        this.f45548d = dVar;
        this.f45549e = aVar;
        this.f45555l = view;
        this.f45556m = z;
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        this.f45550g = h.g.a.a(TypedValue.applyDimension(1, 36.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        this.f45551h = h.g.a.a(TypedValue.applyDimension(1, 1.0f, system2.getDisplayMetrics()));
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        int a2 = h.g.a.a(TypedValue.applyDimension(1, 4.0f, system3.getDisplayMetrics()));
        this.f45554k = a2;
        this.f45546b = a2;
    }

    private final boolean a(h hVar, g gVar, int i2, int i3, int i4, int i5) {
        int i6 = f.f45557a[hVar.ordinal()];
        if (i6 == 1) {
            int i7 = ((i4 + i4) + i2) / 2;
            gVar.f45562a = (i7 - (this.f45552i / 2)) + this.f45548d.f45536f;
            gVar.f45563b = ((i5 - this.f45553j) + this.f45548d.f45537g) - this.f45551h;
            a(hVar, gVar, 1);
            gVar.f45564c = i7 + this.f45548d.f45538h;
            gVar.f45565d = (i5 + this.f45548d.f45537g) - this.f45551h;
            a(hVar, gVar);
            return a(hVar, gVar, 0);
        } else if (i6 == 2) {
            gVar.f45562a = ((i4 - this.f45552i) + this.f45548d.f45536f) - this.f45551h;
            int i8 = ((i5 + i5) + i3) / 2;
            gVar.f45563b = (i8 - (this.f45553j / 2)) + this.f45548d.f45537g;
            a(hVar, gVar, 0);
            gVar.f45564c = (i4 + this.f45548d.f45536f) - this.f45551h;
            gVar.f45565d = i8 + this.f45548d.f45538h;
            a(hVar, gVar);
            return a(hVar, gVar, 1);
        } else if (i6 == 3) {
            gVar.f45562a = i4 + i2 + this.f45548d.f45536f + this.f45551h;
            int i9 = ((i5 + i5) + i3) / 2;
            gVar.f45563b = (i9 - (this.f45553j / 2)) + this.f45548d.f45537g;
            a(hVar, gVar, 0);
            gVar.f45564c = gVar.f45562a + this.f45548d.f45536f;
            gVar.f45565d = i9 + this.f45548d.f45538h;
            a(hVar, gVar);
            return a(hVar, gVar, 1);
        } else if (i6 == 4) {
            int i10 = ((i4 + i4) + i2) / 2;
            gVar.f45562a = (i10 - (this.f45552i / 2)) + this.f45548d.f45536f;
            int i11 = i5 + i3;
            gVar.f45563b = this.f45548d.f45537g + i11 + this.f45551h;
            a(hVar, gVar, 1);
            gVar.f45564c = i10 + this.f45548d.f45538h;
            gVar.f45565d = i11 + this.f45548d.f45537g + this.f45551h;
            a(hVar, gVar);
            return a(this.f45548d.f45535e, gVar, 0);
        } else {
            throw new n();
        }
    }
}
