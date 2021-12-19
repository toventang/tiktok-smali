package com.ss.android.ugc.tools.view.widget.c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.f.e;
import com.ss.android.ugc.aweme.views.CircleDraweeView;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.StyleTextView;
import com.ss.android.ugc.tools.view.style.b;
import com.ss.android.ugc.tools.view.style.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class a extends FrameLayout {
    private final int A;
    private final boolean B;

    /* renamed from: a  reason: collision with root package name */
    private View f150381a;

    /* renamed from: b  reason: collision with root package name */
    private CircleDraweeView f150382b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f150383c;

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout f150384d;

    /* renamed from: e  reason: collision with root package name */
    private View f150385e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f150386f;

    /* renamed from: g  reason: collision with root package name */
    private View f150387g;

    /* renamed from: h  reason: collision with root package name */
    private View f150388h;

    /* renamed from: i  reason: collision with root package name */
    private ColorStateList f150389i;

    /* renamed from: j  reason: collision with root package name */
    private final ColorStateList f150390j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f150391k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f150392l;

    /* renamed from: m  reason: collision with root package name */
    private final int f150393m;
    private final int n;
    private final int o;
    private final int p;
    private final boolean q;
    private final int r;
    private final int s;
    private final int t;
    private final boolean u;
    private final boolean v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    static {
        Covode.recordClassIndex(98911);
    }

    /* access modifiers changed from: protected */
    public int a() {
        return R.layout.b4c;
    }

    /* access modifiers changed from: protected */
    public final View getDotView() {
        return this.f150388h;
    }

    public final TextView getTextView() {
        return this.f150386f;
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.c.a$a  reason: collision with other inner class name */
    public static class C4052a {

        /* renamed from: d  reason: collision with root package name */
        public boolean f150394d;

        /* renamed from: e  reason: collision with root package name */
        public int f150395e;

        /* renamed from: f  reason: collision with root package name */
        public int f150396f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f150397g;

        /* renamed from: h  reason: collision with root package name */
        public int f150398h;

        /* renamed from: i  reason: collision with root package name */
        public int f150399i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f150400j = true;

        /* renamed from: k  reason: collision with root package name */
        public int f150401k = 4;

        /* renamed from: l  reason: collision with root package name */
        public int f150402l;

        /* renamed from: m  reason: collision with root package name */
        public int f150403m = R.color.tf;
        public boolean n = true;
        public boolean o = true;
        public boolean p = true;
        public int q = 2;
        public int r = R.color.tf;
        public int s = R.color.t8;
        public int t = 2;
        public boolean u;
        public final Context v;

        static {
            Covode.recordClassIndex(98912);
        }

        public final int c() {
            int i2 = this.f150396f;
            if (i2 == -1) {
                return this.f150395e;
            }
            return i2;
        }

        public a b() {
            return new a(this.v, this.f150394d, this.f150395e, this.f150397g, this.f150398h, this.f150399i, this.f150400j, this.f150401k, this.f150402l, this.f150403m, this.n, this.o, this.q, this.r, this.s, this.t, c(), this.p, this.u);
        }

        public C4052a(Context context) {
            l.d(context, "");
            this.v = context;
        }
    }

    public final CircleDraweeView getImageView() {
        CircleDraweeView circleDraweeView = this.f150382b;
        if (circleDraweeView == null) {
            l.a("imageView");
        }
        return circleDraweeView;
    }

    private final View getBorderView() {
        GradientDrawable a2;
        MethodCollector.i(8455);
        if (this.v && this.f150387g == null) {
            Context context = getContext();
            l.b(context, "");
            l.d(context, "");
            int a3 = (int) r.a(context, (float) this.w);
            int i2 = a3 * 2;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(this.n + i2, i2 + this.o);
            View view = new View(context);
            view.setLayoutParams(layoutParams);
            int color = context.getResources().getColor(this.x);
            if (this.f150392l) {
                a2 = b.a.a().a(1).b(0).a(color, a3).a();
            } else {
                a2 = b.a.a().a(0).b(0).a(color, a3).a((float) this.f150393m).a();
            }
            view.setBackground(a2);
            FrameLayout frameLayout = this.f150384d;
            if (frameLayout == null) {
                l.a("imageLayoutContainer");
            }
            frameLayout.addView(view);
            this.f150387g = view;
        }
        View view2 = this.f150387g;
        MethodCollector.o(8455);
        return view2;
    }

    /* access modifiers changed from: protected */
    public final void setDotView(View view) {
        this.f150388h = view;
    }

    public void setCustomSelected(boolean z2) {
        a(z2, false);
    }

    public void a(boolean z2) {
        int i2;
        View view = this.f150388h;
        if (view != null) {
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    /* access modifiers changed from: protected */
    public View a(Context context) {
        l.d(context, "");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        StyleTextView styleTextView = new StyleTextView(context);
        styleTextView.setLayoutParams(layoutParams);
        styleTextView.setGravity(17);
        return styleTextView;
    }

    public void setText(CharSequence charSequence) {
        TextView textView;
        if (charSequence != null && charSequence.length() != 0 && (textView = this.f150386f) != null) {
            if (((int) textView.getPaint().measureText(charSequence, 0, charSequence.length())) <= this.n) {
                textView.setGravity(17);
            } else if (this.u) {
                textView.setGravity(8388611);
            } else {
                textView.setGravity(17);
            }
            textView.setText(charSequence);
        }
    }

    /* access modifiers changed from: protected */
    public View b(Context context) {
        MethodCollector.i(8670);
        l.d(context, "");
        int a2 = (int) r.a(context, 6.0f);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(a2, a2);
        View view = new View(context);
        view.setLayoutParams(layoutParams);
        int color = getResources().getColor(this.y);
        view.setBackground(b.a.a().a(1).b(color).a(color, (int) r.a(context, (float) this.z)).a());
        MethodCollector.o(8670);
        return view;
    }

    /* access modifiers changed from: protected */
    public View c(Context context) {
        int i2;
        FrameLayout.LayoutParams layoutParams;
        MethodCollector.i(8661);
        l.d(context, "");
        FrameLayout frameLayout = new FrameLayout(context);
        View a2 = com.a.a(LayoutInflater.from(context), a(), frameLayout, false);
        if (this.f150383c) {
            i2 = -2;
        } else {
            i2 = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, i2);
        l.b(a2, "");
        a2.setLayoutParams(layoutParams2);
        frameLayout.addView(a2);
        if (this.f150383c) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.n, this.o);
        }
        frameLayout.setLayoutParams(layoutParams);
        MethodCollector.o(8661);
        return frameLayout;
    }

    private void a(boolean z2, boolean z3) {
        View borderView;
        int i2;
        if (this.f150391k != z2 || z3) {
            this.f150391k = z2;
            TextView textView = this.f150386f;
            if (textView != null) {
                if (z2) {
                    this.f150389i = textView.getTextColors();
                    textView.setTextColor(this.f150390j);
                    if (this.u) {
                        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                    }
                } else {
                    ColorStateList colorStateList = this.f150389i;
                    if (colorStateList != null) {
                        textView.setTextColor(colorStateList);
                    }
                }
                textView.setEllipsize(null);
            }
            if ((this.f150387g != null || z2) && (borderView = getBorderView()) != null) {
                if (z2) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                borderView.setVisibility(i2);
            }
        }
    }

    public void a(LinearLayout linearLayout, boolean z2) {
        int i2;
        l.d(linearLayout, "");
        if (z2) {
            i2 = -1;
        } else {
            i2 = -2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, -2);
        layoutParams.gravity = 17;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
    }

    public void a(View view, FrameLayout frameLayout, int i2, int i3, boolean z2) {
        LinearLayout.LayoutParams layoutParams;
        l.d(view, "");
        l.d(frameLayout, "");
        if (z2) {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(i2, i3);
        }
        layoutParams.gravity = 1;
        frameLayout.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(view.getLayoutParams());
        layoutParams2.gravity = 17;
        view.setLayoutParams(layoutParams2);
    }

    public /* synthetic */ a(Context context, boolean z2, int i2, int i3, int i4, int i5, boolean z3, int i6, int i7, int i8, boolean z4, boolean z5, int i9, int i10, int i11, int i12) {
        this(context, z2, i2, i3, i4, i5, z3, i6, i7, i8, z4, z5, i9, i10, i11, i12, i2, true, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected a(Context context, boolean z2, int i2, int i3, int i4, int i5, boolean z3, int i6, int i7, int i8, boolean z4, boolean z5, int i9, int i10, int i11, int i12, int i13, boolean z6, boolean z7) {
        super(context);
        Drawable a2;
        int i14;
        ColorStateList colorStateList;
        int i15 = i3;
        l.d(context, "");
        MethodCollector.i(8676);
        this.f150392l = z2;
        this.f150393m = i2;
        this.n = i15;
        this.o = i4;
        this.p = i5;
        this.q = z3;
        this.r = i6;
        this.s = i7;
        this.t = i8;
        this.u = z4;
        this.v = z5;
        this.w = i9;
        this.x = i10;
        this.y = i11;
        this.z = i12;
        this.A = i13;
        this.B = z6;
        this.f150383c = z7;
        ColorStateList colorStateList2 = getResources().getColorStateList(i8);
        l.b(colorStateList2, "");
        this.f150390j = colorStateList2;
        this.f150381a = c(context);
        l.d(context, "");
        View view = this.f150381a;
        if (view == null) {
            l.a("imageViewContainer");
        }
        CircleDraweeView circleDraweeView = (CircleDraweeView) view.findViewById(R.id.au2);
        com.facebook.drawee.f.a a3 = new com.facebook.drawee.f.b(getResources()).a();
        l.b(a3, "");
        e eVar = new e();
        eVar.a(z2);
        if (!z2) {
            eVar.a((float) i13);
        }
        a3.a(eVar);
        int color = getResources().getColor(R.color.ua);
        if (i5 != 0) {
            a2 = g.a(getResources().getDrawable(i5), getResources().getColor(R.color.ub));
        } else if (z2) {
            a2 = b.a.a().a(1).b(color).a(color, 0).a();
        } else {
            a2 = b.a.a().a(0).b(color).a(color, 0).a((float) i2).a();
        }
        a3.b(a2);
        a3.c(a2);
        l.b(circleDraweeView, "");
        circleDraweeView.setHierarchy(a3);
        this.f150382b = circleDraweeView;
        if (z3) {
            this.f150385e = a(context);
            l.d(context, "");
            View view2 = this.f150385e;
            if (view2 != null) {
                TextView textView = (TextView) view2;
                if (z4) {
                    textView.setSingleLine();
                }
                this.f150386f = textView;
                if (textView != null) {
                    colorStateList = textView.getTextColors();
                } else {
                    colorStateList = null;
                }
                this.f150389i = colorStateList;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                MethodCollector.o(8676);
                throw nullPointerException;
            }
        }
        LinearLayout linearLayout = new LinearLayout(context);
        a(linearLayout, z7);
        addView(linearLayout);
        int a4 = (int) r.a(context, (float) i9);
        if (z5) {
            i15 += a4 * 2;
            i14 = (a4 * 2) + i4;
        } else {
            i14 = i4;
        }
        this.f150384d = new FrameLayout(context);
        View view3 = this.f150381a;
        if (view3 == null) {
            l.a("imageViewContainer");
        }
        FrameLayout frameLayout = this.f150384d;
        if (frameLayout == null) {
            l.a("imageLayoutContainer");
        }
        a(view3, frameLayout, i15, i14, z7);
        FrameLayout frameLayout2 = this.f150384d;
        if (frameLayout2 == null) {
            l.a("imageLayoutContainer");
        }
        View view4 = this.f150381a;
        if (view4 == null) {
            l.a("imageViewContainer");
        }
        frameLayout2.addView(view4);
        View view5 = this.f150384d;
        if (view5 == null) {
            l.a("imageLayoutContainer");
        }
        linearLayout.addView(view5);
        View view6 = this.f150385e;
        if (view6 != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(view6.getLayoutParams());
            layoutParams.gravity = 1;
            layoutParams.topMargin = (int) r.a(context, (float) i6);
            layoutParams.bottomMargin = (int) r.a(context, (float) i7);
            view6.setLayoutParams(layoutParams);
            linearLayout.addView(view6);
        }
        if (z6) {
            View b2 = b(context);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(b2.getLayoutParams());
            layoutParams2.gravity = 8388661;
            b2.setLayoutParams(layoutParams2);
            linearLayout.addView(b2);
            this.f150388h = b2;
        }
        a(false, true);
        a(false);
        MethodCollector.o(8676);
    }
}
