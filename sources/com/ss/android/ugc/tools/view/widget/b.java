package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
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
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.tools.view.d.a;
import com.zhiliaoapp.musically.R;

public final class b extends ScrollView implements a, l {
    private boolean A;

    /* renamed from: a  reason: collision with root package name */
    private a f150356a;

    /* renamed from: b  reason: collision with root package name */
    private int f150357b;

    /* renamed from: c  reason: collision with root package name */
    private int f150358c;

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f150359d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f150360e;

    /* renamed from: f  reason: collision with root package name */
    private AVTextView f150361f;

    /* renamed from: g  reason: collision with root package name */
    private AVTextView f150362g;

    /* renamed from: h  reason: collision with root package name */
    private View f150363h;

    /* renamed from: i  reason: collision with root package name */
    private AVTextView f150364i;

    /* renamed from: j  reason: collision with root package name */
    private int f150365j;

    /* renamed from: k  reason: collision with root package name */
    private int f150366k;

    /* renamed from: l  reason: collision with root package name */
    private int f150367l;

    /* renamed from: m  reason: collision with root package name */
    private int f150368m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private View.OnClickListener v;
    private int w;
    private boolean x;
    private int y;
    private int z;

    static {
        Covode.recordClassIndex(98900);
    }

    private void b() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.height >= 0) {
                this.f150357b = layoutParams.height;
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
            this.f150359d.setLayoutDirection(1);
        }
    }

    private void f() {
        this.f150362g = (AVTextView) findViewById(R.id.eyc);
        if (this.f150356a.f150334l) {
            this.f150362g.setText(this.f150356a.f150325c);
        }
    }

    private void e() {
        this.f150361f = (AVTextView) findViewById(R.id.f9l);
        if (this.f150356a.f150333k) {
            this.f150361f.setText(this.f150356a.f150324b);
        }
        if (this.f150356a.f150335m) {
            this.f150363h = a(this.f150356a, this.f150359d);
        }
        f();
    }

    private void c() {
        b();
        removeAllViews();
        setScrollY(0);
        if (this.x) {
            this.f150357b = dh.a(getContext()) - this.z;
        }
        a aVar = this.f150356a;
        if (aVar == null || this.f150357b < this.f150365j) {
            this.u = false;
            return;
        }
        if (aVar.f150332j) {
            com.a.a(LayoutInflater.from(getContext()), R.layout.b4_, this, true);
            this.f150359d = (LinearLayout) findViewById(R.id.c6u);
            ImageView imageView = (ImageView) findViewById(R.id.bwo);
            this.f150360e = imageView;
            imageView.setImageDrawable(this.f150356a.f150323a);
            e();
            if (this.f150356a.o) {
                this.f150364i = b(this.f150356a, this.f150359d);
            }
            a(this.f150359d);
        } else if (this.f150356a.f150333k) {
            com.a.a(LayoutInflater.from(getContext()), R.layout.b49, this, true);
            this.f150359d = (LinearLayout) findViewById(R.id.c6u);
            e();
            a(this.f150359d);
        } else {
            com.a.a(LayoutInflater.from(getContext()), R.layout.b46, this, true);
            this.f150359d = (LinearLayout) findViewById(R.id.c6u);
            f();
            a(this.f150359d);
        }
        View.OnClickListener onClickListener = this.v;
        if (onClickListener != null) {
            this.f150359d.setOnClickListener(onClickListener);
        }
        this.t = true;
        h();
        if (this.A) {
            this.f150359d.setVisibility(4);
        }
        d();
        g();
    }

    private void g() {
        b();
        this.u = false;
        if (this.x) {
            this.f150357b = dh.a(getContext()) - this.z;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            this.y = iArr[1];
        }
        a aVar = this.f150356a;
        if (aVar == null || this.f150357b < this.f150365j) {
            this.u = true;
            return;
        }
        if (aVar.f150332j) {
            int i2 = (int) ((((float) this.f150357b) * 0.2f) + 0.5f);
            if (this.x) {
                i2 -= this.y;
            }
            a(this.f150360e, i2);
            if (this.f150356a.f150335m) {
                if (this.f150356a.o) {
                    a(this.f150363h, this.q);
                } else {
                    int a2 = (((((((this.f150357b - i2) - this.s) - this.f150366k) - a(this.f150361f)) - this.f150367l) - a(this.f150362g)) - this.n) - this.f150368m;
                    if (this.x) {
                        a2 -= this.y;
                    }
                    setButtonMargin(a2);
                }
            }
        } else if (this.f150356a.f150333k) {
            int i3 = (int) ((((float) this.f150357b) * 0.3f) + 0.5f);
            if (this.x) {
                i3 -= this.y;
            }
            a(this.f150361f, i3);
            if (this.f150356a.f150335m) {
                int a3 = (((((this.f150357b - i3) - a(this.f150361f)) - this.f150367l) - a(this.f150362g)) - this.n) - this.f150368m;
                if (this.x) {
                    a3 -= this.y;
                }
                setButtonMargin(a3);
            }
        } else {
            int i4 = (int) ((((float) this.f150357b) * 0.3f) + 0.5f);
            if (this.x) {
                i4 -= this.y;
            }
            a(this.f150362g, i4);
        }
        this.f150362g.requestLayout();
        if (this.y != 0 && this.A) {
            this.f150359d.setVisibility(0);
        }
        this.u = true;
    }

    private void h() {
        int i2;
        int color;
        int i3;
        int i4;
        int color2;
        if (this.f150359d != null && this.f150356a != null) {
            Resources resources = getResources();
            AVTextView aVTextView = this.f150361f;
            if (aVTextView != null) {
                if (this.w == 0) {
                    color2 = resources.getColor(R.color.bx);
                } else {
                    color2 = resources.getColor(R.color.a_);
                }
                aVTextView.setTextColor(color2);
            }
            AVTextView aVTextView2 = this.f150362g;
            if (aVTextView2 != null) {
                if (this.w == 0) {
                    i4 = R.color.c4;
                } else {
                    i4 = R.color.aa;
                }
                aVTextView2.setTextColor(resources.getColor(i4));
            }
            View view = this.f150363h;
            if (view == null) {
                return;
            }
            if (view instanceof c) {
                ((c) view).a(this.w);
                return;
            }
            AVTextView aVTextView3 = (AVTextView) view;
            if (this.f150356a.f150326d == h.SOLID) {
                if (this.w == 0) {
                    i3 = R.drawable.bmi;
                } else {
                    i3 = R.drawable.bmh;
                }
                aVTextView3.setBackgroundResource(i3);
                aVTextView3.setTextColor(resources.getColor(R.color.a9));
                return;
            }
            if (this.w == 0) {
                i2 = R.drawable.bmj;
            } else {
                i2 = R.drawable.bmf;
            }
            aVTextView3.setBackgroundResource(i2);
            if (this.w == 0) {
                color = resources.getColor(R.color.bx);
            } else {
                color = resources.getColor(R.color.a_);
            }
            aVTextView3.setTextColor(color);
        }
    }

    public final void a() {
        if (this.f150356a == null) {
            return;
        }
        if (this.t) {
            g();
        } else {
            c();
        }
    }

    public final void setSupportDelayVisible(boolean z2) {
        this.A = z2;
    }

    public b(Context context) {
        this(context, (byte) 0);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.v = onClickListener;
        LinearLayout linearLayout = this.f150359d;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(onClickListener);
        }
    }

    @Override // com.ss.android.ugc.tools.view.widget.l
    public final void setUseScreenHeight(int i2) {
        this.x = true;
        this.z = i2;
        a();
    }

    private int a(TextView textView) {
        textView.measure(View.MeasureSpec.makeMeasureSpec(this.f150358c - (this.r * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textView.getMeasuredHeight();
    }

    private AVTextView a(a aVar) {
        if (!aVar.f150335m) {
            return null;
        }
        if (aVar.f150326d == h.SOLID) {
            return new AVTextView(new ContextThemeWrapper(getContext(), (int) R.style.a1s));
        }
        return new AVTextView(new ContextThemeWrapper(getContext(), (int) R.style.a1r));
    }

    private void setButtonMargin(int i2) {
        int i3 = this.f150368m;
        if (i2 >= i3) {
            int i4 = (int) ((((float) this.f150357b) * 0.2f) + 0.5f);
            if (i4 < i3) {
                a(this.f150363h, i2);
                return;
            }
            int i5 = i2 - (i4 - i3);
            if (i5 > i3) {
                a(this.f150363h, i5);
                return;
            }
        }
        a(this.f150363h, i3);
    }

    private void a(LinearLayout linearLayout) {
        MethodCollector.i(10960);
        linearLayout.addView(new Space(getContext()), new LinearLayout.LayoutParams(-1, this.f150368m));
        MethodCollector.o(10960);
    }

    public final void setStatus(a aVar) {
        if (aVar != null) {
            this.f150356a = aVar;
            if (!aVar.f150335m || (this.f150356a.f150333k && this.f150356a.f150334l)) {
                if (this.f150356a.o) {
                    if (TextUtils.isEmpty(this.f150356a.f150330h)) {
                        throw new IllegalArgumentException("extra text should not be empty String!");
                    } else if (!this.f150356a.f150332j || !this.f150356a.f150333k || !this.f150356a.f150334l || !this.f150356a.f150335m) {
                        throw new IllegalArgumentException("extra text must with all elements!");
                    }
                }
                if (this.f150356a.f150333k) {
                    if (TextUtils.isEmpty(this.f150356a.f150324b)) {
                        throw new IllegalArgumentException("title text should not be empty String!");
                    } else if (!this.f150356a.f150334l) {
                        throw new IllegalArgumentException("title text must have a description!");
                    }
                } else if (this.f150356a.f150334l) {
                    if (TextUtils.isEmpty(this.f150356a.f150325c)) {
                        throw new IllegalArgumentException("desc text should not be empty String!");
                    } else if (this.f150356a.f150332j) {
                        throw new IllegalArgumentException("desc text should only have itself!");
                    }
                }
                this.t = false;
                this.u = false;
                if (this.f150357b > 0) {
                    c();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("button must with title and description!");
        }
    }

    @Override // com.ss.android.ugc.tools.view.d.a
    public final void a(int i2) {
        if (this.w != i2) {
            this.w = i2;
            h();
        }
    }

    private b(Context context, byte b2) {
        this(context, (char) 0);
    }

    private static void a(View view, int i2) {
        ((LinearLayout.LayoutParams) view.getLayoutParams()).topMargin = i2;
    }

    private AVTextView b(a aVar, LinearLayout linearLayout) {
        MethodCollector.i(10790);
        AVTextView aVTextView = new AVTextView(new ContextThemeWrapper(getContext(), (int) R.style.a1u));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = this.p;
        linearLayout.addView(aVTextView, layoutParams);
        aVTextView.setText(aVar.f150330h);
        aVTextView.setOnClickListener(this.f150356a.f150331i);
        MethodCollector.o(10790);
        return aVTextView;
    }

    private View a(a aVar, LinearLayout linearLayout) {
        MethodCollector.i(10639);
        if (aVar.n) {
            c cVar = new c(getContext());
            cVar.a(aVar.f150326d, aVar.f150327e, aVar.f150328f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.o, this.n);
            layoutParams.gravity = 1;
            linearLayout.addView(cVar, layoutParams);
            cVar.setOnClickListener(this.f150356a.f150329g);
            MethodCollector.o(10639);
            return cVar;
        }
        AVTextView a2 = a(aVar);
        if (a2 != null) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.o, this.n);
            layoutParams2.gravity = 1;
            linearLayout.addView(a2, layoutParams2);
            a2.setText(aVar.f150328f);
            a2.setOnClickListener(aVar.f150329g);
            MethodCollector.o(10639);
            return a2;
        }
        MethodCollector.o(10639);
        return null;
    }

    private b(Context context, char c2) {
        super(context, null, 0);
        MethodCollector.i(10631);
        this.w = g.a().E().a();
        b();
        Resources resources = getContext().getResources();
        this.f150365j = resources.getDimensionPixelSize(R.dimen.c_);
        this.f150366k = resources.getDimensionPixelSize(R.dimen.cc);
        this.f150367l = resources.getDimensionPixelSize(R.dimen.c6);
        this.f150368m = resources.getDimensionPixelSize(R.dimen.ca);
        this.o = resources.getDimensionPixelSize(R.dimen.c5);
        this.n = resources.getDimensionPixelSize(R.dimen.c3);
        this.p = resources.getDimensionPixelSize(R.dimen.c7);
        this.q = resources.getDimensionPixelSize(R.dimen.c4);
        this.r = resources.getDimensionPixelSize(R.dimen.cd);
        this.s = resources.getDimensionPixelSize(R.dimen.c8);
        MethodCollector.o(10631);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.f150357b != i3 || this.f150358c != i2) {
            this.f150358c = i2;
            this.f150357b = i3;
            LinearLayout linearLayout = this.f150359d;
            if (linearLayout == null) {
                a();
            } else {
                linearLayout.post(new Runnable() {
                    /* class com.ss.android.ugc.tools.view.widget.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(98901);
                    }

                    public final void run() {
                        b.this.a();
                    }
                });
            }
        }
    }
}
