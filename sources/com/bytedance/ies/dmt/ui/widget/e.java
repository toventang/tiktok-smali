package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.core.widget.h;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.common.d;
import com.bytedance.ies.dmt.ui.f.b;
import com.zhiliaoapp.musically.R;

public final class e extends ScrollView implements d, g, h {
    private int A;
    private boolean B;

    /* renamed from: a  reason: collision with root package name */
    private d f33650a;

    /* renamed from: b  reason: collision with root package name */
    private int f33651b;

    /* renamed from: c  reason: collision with root package name */
    private int f33652c;

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f33653d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f33654e;

    /* renamed from: f  reason: collision with root package name */
    private DmtTextView f33655f;

    /* renamed from: g  reason: collision with root package name */
    private DmtTextView f33656g;

    /* renamed from: h  reason: collision with root package name */
    private View f33657h;

    /* renamed from: i  reason: collision with root package name */
    private DmtTextView f33658i;

    /* renamed from: j  reason: collision with root package name */
    private int f33659j;

    /* renamed from: k  reason: collision with root package name */
    private int f33660k;

    /* renamed from: l  reason: collision with root package name */
    private int f33661l;

    /* renamed from: m  reason: collision with root package name */
    private int f33662m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private View.OnClickListener w;
    private int x;
    private boolean y;
    private int z;

    static {
        Covode.recordClassIndex(20030);
    }

    private void b() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.height >= 0) {
                this.f33651b = layoutParams.height;
            }
            if (layoutParams.height == -2) {
                throw new IllegalArgumentException("DmtDefaultView doesn't support layout_height set to WRAP_CONTENT!");
            }
        }
    }

    private void d() {
        if (v.e(this) == 1) {
            int i2 = Build.VERSION.SDK_INT;
            setLayoutDirection(0);
            this.f33653d.setLayoutDirection(1);
        }
    }

    public final String getDescString() {
        DmtTextView dmtTextView = this.f33656g;
        if (dmtTextView == null || dmtTextView.getText() == null) {
            return "";
        }
        return this.f33656g.getText().toString();
    }

    private void e() {
        this.f33655f = (DmtTextView) findViewById(R.id.f9l);
        if (this.f33650a.o) {
            this.f33655f.setText(this.f33650a.f33639e);
        }
        if (this.f33650a.r) {
            h.a(this.f33655f, (int) R.style.wa);
        }
        if (this.f33650a.s) {
            this.f33657h = a(this.f33650a, this.f33653d);
        }
        f();
    }

    private void f() {
        this.f33656g = (DmtTextView) findViewById(R.id.eyc);
        if (this.f33650a.p) {
            this.f33656g.setText(this.f33650a.f33640f);
            if (this.f33650a.q) {
                this.f33656g.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    public final String getButtonString() {
        CharSequence text;
        View view = this.f33657h;
        if (view != null) {
            if (view instanceof f) {
                return ((f) view).getTextString();
            }
            if (!(view instanceof DmtTextView) || (text = ((DmtTextView) view).getText()) == null) {
                return "";
            }
            return text.toString();
        }
        return "";
    }

    private void g() {
        b();
        this.u = false;
        if (this.y) {
            this.f33651b = b.c(getContext()) - this.A;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            this.z = iArr[1];
        }
        d dVar = this.f33650a;
        if (dVar == null || this.f33651b < this.f33659j) {
            this.u = true;
            return;
        }
        if (dVar.n) {
            int i2 = (int) ((((float) this.f33651b) * 0.2f) + 0.5f);
            if (this.y) {
                i2 -= this.z;
            }
            a(this.f33654e, i2);
            if (this.f33650a.s) {
                if (this.f33650a.u) {
                    a(this.f33657h, this.q);
                } else {
                    int a2 = (((((((this.f33651b - i2) - this.s) - this.f33660k) - a(this.f33655f)) - this.f33661l) - a(this.f33656g)) - this.n) - this.f33662m;
                    if (this.y) {
                        a2 -= this.z;
                    }
                    setButtonMargin(a2);
                }
            }
        } else if (this.f33650a.o) {
            int i3 = (int) ((((float) this.f33651b) * 0.3f) + 0.5f);
            if (this.y) {
                i3 -= this.z;
            }
            a(this.f33655f, i3);
            if (this.f33650a.s) {
                int a3 = (((((this.f33651b - i3) - a(this.f33655f)) - this.f33661l) - a(this.f33656g)) - this.n) - this.f33662m;
                if (this.y) {
                    a3 -= this.z;
                }
                setButtonMargin(a3);
            }
        } else {
            int i4 = (int) ((((float) this.f33651b) * 0.3f) + 0.5f);
            if (this.y) {
                i4 -= this.z;
            }
            a(this.f33656g, i4);
        }
        this.f33656g.requestLayout();
        if (this.z != 0 && this.B) {
            this.f33653d.setVisibility(0);
        }
        this.u = true;
    }

    private void h() {
        int i2;
        int color;
        int color2;
        int i3;
        int color3;
        int color4;
        int color5;
        if (this.f33653d != null && this.f33650a != null) {
            Resources resources = getResources();
            if (this.f33655f != null) {
                if (this.f33650a.r) {
                    DmtTextView dmtTextView = this.f33655f;
                    if (this.x == 0) {
                        color5 = resources.getColor(R.color.c4);
                    } else {
                        color5 = resources.getColor(R.color.aa);
                    }
                    dmtTextView.setTextColor(color5);
                } else {
                    DmtTextView dmtTextView2 = this.f33655f;
                    if (this.x == 0) {
                        color4 = resources.getColor(R.color.bx);
                    } else {
                        color4 = resources.getColor(R.color.a_);
                    }
                    dmtTextView2.setTextColor(color4);
                }
            }
            DmtTextView dmtTextView3 = this.f33656g;
            if (dmtTextView3 != null) {
                if (this.x == 0) {
                    color3 = resources.getColor(R.color.c4);
                } else {
                    color3 = resources.getColor(R.color.aa);
                }
                dmtTextView3.setTextColor(color3);
            }
            View view = this.f33657h;
            if (view == null) {
                return;
            }
            if (view instanceof f) {
                ((f) view).a(this.x);
                return;
            }
            DmtTextView dmtTextView4 = (DmtTextView) view;
            if (this.f33650a.f33641g == a.SOLID) {
                if (this.x == 0) {
                    i3 = R.drawable.cbm;
                } else {
                    i3 = R.drawable.cbl;
                }
                dmtTextView4.setBackgroundResource(i3);
            } else {
                if (this.x == 0) {
                    i2 = R.drawable.cbk;
                } else {
                    i2 = R.drawable.cbi;
                }
                dmtTextView4.setBackgroundResource(i2);
            }
            if (this.f33650a.v) {
                color = androidx.core.content.b.c(getContext(), this.f33650a.f33647m);
            } else if (this.f33650a.f33641g == a.SOLID) {
                if (this.x == 0) {
                    color2 = resources.getColor(R.color.a9);
                } else {
                    color2 = resources.getColor(R.color.f159928l);
                }
                dmtTextView4.setTextColor(color2);
                return;
            } else if (this.x == 0) {
                color = resources.getColor(R.color.bx);
            } else {
                color = resources.getColor(R.color.a_);
            }
            dmtTextView4.setTextColor(color);
        }
    }

    private void c() {
        ViewGroup.LayoutParams layoutParams;
        b();
        removeAllViews();
        setScrollY(0);
        if (this.y) {
            this.f33651b = b.c(getContext()) - this.A;
        }
        d dVar = this.f33650a;
        if (dVar == null || this.f33651b < this.f33659j) {
            this.u = false;
            return;
        }
        if (dVar.n) {
            a.a(LayoutInflater.from(getContext()), R.layout.aew, this, true);
            this.f33653d = (LinearLayout) findViewById(R.id.c6u);
            ImageView imageView = (ImageView) findViewById(R.id.bwo);
            this.f33654e = imageView;
            imageView.setImageDrawable(androidx.core.content.b.a(getContext(), this.f33650a.f33635a));
            e();
            if (this.f33650a.u) {
                this.f33658i = b(this.f33650a, this.f33653d);
            }
            a(this.f33653d);
            if (this.f33650a.f33637c > 0 && this.f33650a.f33638d > 0 && (layoutParams = this.f33654e.getLayoutParams()) != null) {
                layoutParams.height = this.f33650a.f33638d;
                layoutParams.width = this.f33650a.f33637c;
                this.f33654e.setLayoutParams(layoutParams);
            }
        } else if (this.f33650a.o) {
            a.a(LayoutInflater.from(getContext()), R.layout.aev, this, true);
            this.f33653d = (LinearLayout) findViewById(R.id.c6u);
            e();
            a(this.f33653d);
        } else {
            a.a(LayoutInflater.from(getContext()), R.layout.aeu, this, true);
            this.f33653d = (LinearLayout) findViewById(R.id.c6u);
            f();
            a(this.f33653d);
        }
        View.OnClickListener onClickListener = this.w;
        if (onClickListener != null) {
            this.f33653d.setOnClickListener(onClickListener);
        }
        this.t = true;
        h();
        if (this.B) {
            this.f33653d.setVisibility(4);
        }
        a(Boolean.valueOf(this.v));
        d();
        g();
    }

    public final void a() {
        if (this.f33650a == null) {
            return;
        }
        if (this.t) {
            g();
        } else {
            c();
        }
    }

    public final void setSupportDelayVisible(boolean z2) {
        this.B = z2;
    }

    public e(Context context) {
        this(context, (byte) 0);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.w = onClickListener;
        LinearLayout linearLayout = this.f33653d;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(onClickListener);
        }
    }

    @Override // com.bytedance.ies.dmt.ui.widget.h
    public final void setUseScreenHeight(int i2) {
        this.y = true;
        this.A = i2;
        a();
    }

    private int a(TextView textView) {
        textView.measure(View.MeasureSpec.makeMeasureSpec(this.f33652c - (this.r * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textView.getMeasuredHeight();
    }

    private DmtTextView a(d dVar) {
        if (!dVar.s) {
            return null;
        }
        if (dVar.f33641g == a.SOLID) {
            return new DmtTextView(new ContextThemeWrapper(getContext(), (int) R.style.w_));
        }
        return new DmtTextView(new ContextThemeWrapper(getContext(), (int) R.style.w9));
    }

    private void setButtonMargin(int i2) {
        int i3 = this.f33662m;
        if (i2 >= i3) {
            int i4 = (int) ((((float) this.f33651b) * 0.2f) + 0.5f);
            if (i4 < i3) {
                a(this.f33657h, i2);
                return;
            }
            int i5 = i2 - (i4 - i3);
            if (i5 > i3) {
                a(this.f33657h, i5);
                return;
            }
        }
        a(this.f33657h, i3);
    }

    private void a(LinearLayout linearLayout) {
        MethodCollector.i(10384);
        linearLayout.addView(new Space(getContext()), new LinearLayout.LayoutParams(-1, this.f33662m));
        MethodCollector.o(10384);
    }

    @Override // com.bytedance.ies.dmt.ui.widget.g
    public final void setStatus(d dVar) {
        if (dVar != null) {
            this.f33650a = dVar;
            if (!dVar.s || (this.f33650a.o && this.f33650a.p)) {
                if (this.f33650a.u) {
                    if (TextUtils.isEmpty(this.f33650a.f33645k)) {
                        throw new IllegalArgumentException("extra text should not be empty String!");
                    } else if (!this.f33650a.n || !this.f33650a.o || !this.f33650a.p || !this.f33650a.s) {
                        throw new IllegalArgumentException("extra text must with all elements!");
                    }
                }
                if (this.f33650a.o) {
                    if (TextUtils.isEmpty(this.f33650a.f33639e)) {
                        throw new IllegalArgumentException("title text should not be empty String!");
                    }
                } else if (this.f33650a.p) {
                    if (TextUtils.isEmpty(this.f33650a.f33640f)) {
                        throw new IllegalArgumentException("desc text should not be empty String!");
                    } else if (this.f33650a.n) {
                        throw new IllegalArgumentException("desc text should only have itself!");
                    }
                }
                this.t = false;
                this.u = false;
                if (this.f33651b > 0) {
                    c();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("button must with title and description!");
        }
    }

    @Override // com.bytedance.ies.dmt.ui.common.d
    public final void a(int i2) {
        if (this.x != i2) {
            this.x = i2;
            h();
        }
    }

    public final void a(Boolean bool) {
        this.v = bool.booleanValue();
        if (bool.booleanValue()) {
            DmtTextView dmtTextView = this.f33655f;
            if (dmtTextView != null) {
                dmtTextView.setTextColor(androidx.core.content.b.c(getContext(), R.color.a_));
            }
            DmtTextView dmtTextView2 = this.f33656g;
            if (dmtTextView2 != null) {
                dmtTextView2.setTextColor(androidx.core.content.b.c(getContext(), R.color.ac));
            }
            View view = this.f33657h;
            if (view != null && (view instanceof DmtTextView)) {
                if (this.f33650a.f33641g == a.SOLID) {
                    this.f33657h.setBackground(androidx.core.content.b.a(getContext(), (int) R.drawable.cbl));
                } else {
                    this.f33657h.setBackground(androidx.core.content.b.a(getContext(), (int) R.drawable.cbj));
                }
                if (!this.f33650a.v) {
                    ((DmtTextView) this.f33657h).setTextColor(androidx.core.content.b.c(getContext(), R.color.a_));
                }
            }
        }
    }

    private e(Context context, byte b2) {
        this(context, (char) 0);
    }

    private static void a(View view, int i2) {
        ((LinearLayout.LayoutParams) view.getLayoutParams()).topMargin = i2;
    }

    private DmtTextView b(d dVar, LinearLayout linearLayout) {
        MethodCollector.i(10383);
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), (int) R.style.wb));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = this.p;
        linearLayout.addView(dmtTextView, layoutParams);
        dmtTextView.setText(dVar.f33645k);
        dmtTextView.setOnClickListener(this.f33650a.f33646l);
        MethodCollector.o(10383);
        return dmtTextView;
    }

    private e(Context context, char c2) {
        super(context, null, 0);
        MethodCollector.i(10227);
        this.x = b.a.f33348a.f33347a;
        b();
        Resources resources = getContext().getResources();
        this.f33659j = resources.getDimensionPixelSize(R.dimen.h2);
        this.f33660k = resources.getDimensionPixelSize(R.dimen.h5);
        this.f33661l = resources.getDimensionPixelSize(R.dimen.gu);
        this.f33662m = resources.getDimensionPixelSize(R.dimen.h3);
        this.o = resources.getDimensionPixelSize(R.dimen.gs);
        this.n = resources.getDimensionPixelSize(R.dimen.gq);
        this.p = resources.getDimensionPixelSize(R.dimen.gv);
        this.q = resources.getDimensionPixelSize(R.dimen.gr);
        this.r = resources.getDimensionPixelSize(R.dimen.jl);
        this.s = resources.getDimensionPixelSize(R.dimen.gx);
        MethodCollector.o(10227);
    }

    private View a(d dVar, LinearLayout linearLayout) {
        MethodCollector.i(10381);
        if (dVar.t) {
            f fVar = new f(getContext());
            fVar.a(dVar.f33641g, dVar.f33642h, dVar.f33643i);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.o, this.n);
            layoutParams.gravity = 1;
            linearLayout.addView(fVar, layoutParams);
            fVar.setFontType(com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
            fVar.setOnClickListener(this.f33650a.f33644j);
            MethodCollector.o(10381);
            return fVar;
        }
        DmtTextView a2 = a(dVar);
        if (a2 != null) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.o, this.n);
            layoutParams2.gravity = 1;
            linearLayout.addView(a2, layoutParams2);
            a2.setText(dVar.f33643i);
            a2.setFontType(com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
            a2.setOnClickListener(dVar.f33644j);
            MethodCollector.o(10381);
            return a2;
        }
        MethodCollector.o(10381);
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.f33651b != i3 || this.f33652c != i2) {
            this.f33652c = i2;
            this.f33651b = i3;
            LinearLayout linearLayout = this.f33653d;
            if (linearLayout == null) {
                a();
            } else {
                linearLayout.post(new Runnable() {
                    /* class com.bytedance.ies.dmt.ui.widget.e.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(20031);
                    }

                    public final void run() {
                        e.this.a();
                    }
                });
            }
        }
    }
}
