package com.bytedance.ies.dmt.ui.tooltip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.tooltip.b;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f33575a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f33576b;

    /* renamed from: c  reason: collision with root package name */
    private View f33577c;

    /* renamed from: d  reason: collision with root package name */
    private View f33578d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f33579e = true;

    /* renamed from: f  reason: collision with root package name */
    private b.AbstractC0734b f33580f;

    /* renamed from: g  reason: collision with root package name */
    private b.c f33581g;

    /* renamed from: h  reason: collision with root package name */
    private c f33582h;

    /* renamed from: i  reason: collision with root package name */
    private d f33583i;

    /* renamed from: j  reason: collision with root package name */
    private final int f33584j;

    /* renamed from: k  reason: collision with root package name */
    private int f33585k;

    static {
        Covode.recordClassIndex(20010);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f33587a;

        static {
            Covode.recordClassIndex(20012);
        }

        b(e eVar) {
            this.f33587a = eVar;
        }

        public final void run() {
            this.f33587a.dismiss();
        }
    }

    @Override // com.bytedance.ies.dmt.ui.tooltip.a
    public final boolean isShowing() {
        if (!this.f33579e) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f33586a;

        static {
            Covode.recordClassIndex(20011);
        }

        a(e eVar) {
            this.f33586a = eVar;
        }

        public final void run() {
            this.f33586a.b();
            this.f33586a.f33575a = false;
        }
    }

    public final void b() {
        MethodCollector.i(1723);
        this.f33577c.setVisibility(8);
        ViewGroup viewGroup = this.f33582h.f33551f;
        if (viewGroup != null) {
            viewGroup.removeView(this.f33577c);
        }
        this.f33579e = true;
        b.AbstractC0734b bVar = this.f33580f;
        if (bVar != null) {
            bVar.a();
            MethodCollector.o(1723);
            return;
        }
        MethodCollector.o(1723);
    }

    @Override // com.bytedance.ies.dmt.ui.tooltip.a
    public final void dismiss() {
        if (this.f33579e) {
            return;
        }
        if (!this.f33582h.o) {
            b();
        } else if (!this.f33575a) {
            d dVar = this.f33583i;
            dVar.a(dVar.f33562c, false);
            this.f33575a = true;
            new Handler().postDelayed(new a(this), this.f33582h.n);
        }
    }

    private final void c() {
        MethodCollector.i(1582);
        ViewGroup viewGroup = this.f33582h.f33551f;
        if (viewGroup != null) {
            viewGroup.addView(this.f33577c);
        }
        this.f33577c.setVisibility(0);
        this.f33579e = false;
        this.f33578d.setX((float) this.f33583i.f33562c.f33571a);
        this.f33578d.setY((float) this.f33583i.f33562c.f33572b);
        d dVar = this.f33583i;
        dVar.a(dVar.f33562c, true);
        b.c cVar = this.f33581g;
        if (cVar != null) {
            cVar.a();
        }
        if (this.f33582h.f33556k != -1001) {
            new Handler().postDelayed(new b(this), this.f33582h.f33556k);
        }
        MethodCollector.o(1582);
    }

    @Override // com.bytedance.ies.dmt.ui.tooltip.a
    public final void a() {
        if ((this.f33582h.f33550e != null || (this.f33582h.s >= 0 && this.f33582h.t >= 0)) && this.f33582h.f33551f != null && this.f33579e) {
            d dVar = this.f33583i;
            if (!dVar.a(dVar.f33562c)) {
                int i2 = this.f33582h.f33552g;
                if (i2 == 48) {
                    this.f33582h.f33552g = 80;
                } else if (i2 == 80) {
                    this.f33582h.f33552g = 48;
                } else if (i2 == 8388611) {
                    this.f33582h.f33552g = 8388613;
                } else if (i2 == 8388613) {
                    this.f33582h.f33552g = 8388611;
                }
                e();
                d();
                d dVar2 = this.f33583i;
                if (dVar2.a(dVar2.f33562c) || this.f33582h.f33558m) {
                    c();
                    return;
                }
                return;
            }
            c();
        }
    }

    private final void e() {
        if (this.f33582h.f33552g == 3) {
            this.f33582h.f33552g = 8388611;
        } else if (this.f33582h.f33552g == 5) {
            this.f33582h.f33552g = 8388613;
        }
        if (gb.a(this.f33576b)) {
            if (this.f33582h.f33552g == 8388611) {
                this.f33582h.f33552g = 8388613;
            } else if (this.f33582h.f33552g == 8388613) {
                this.f33582h.f33552g = 8388611;
            }
        }
        this.f33585k = this.f33582h.f33557l;
        if (this.f33584j > this.f33582h.f33557l) {
            this.f33585k = this.f33584j;
        }
        d dVar = this.f33583i;
        if (dVar != null) {
            dVar.f33564e = this.f33585k - this.f33584j;
        }
        if (this.f33582h.f33556k < 0 && this.f33582h.f33556k != -1001) {
            this.f33582h.f33556k = 3000;
        }
        if (this.f33582h.n < 0) {
            this.f33582h.n = 300;
        }
        if (this.f33582h.q == null) {
            this.f33582h.q = new com.bytedance.ies.dmt.ui.c.b();
        }
        if (this.f33582h.r == null) {
            this.f33582h.r = new com.bytedance.ies.dmt.ui.c.c();
        }
        a(this.f33582h.v);
        a(this.f33582h.x, this.f33582h.w);
    }

    private final void d() {
        MethodCollector.i(1711);
        if (gb.a(this.f33576b)) {
            int i2 = Build.VERSION.SDK_INT;
            RelativeLayout relativeLayout = (RelativeLayout) this.f33577c.findViewById(R.id.adh);
            l.b(relativeLayout, "");
            relativeLayout.setLayoutDirection(1);
        }
        if (Build.VERSION.SDK_INT < 21) {
            ImageView imageView = (ImageView) this.f33577c.findViewById(R.id.m3);
            l.b(imageView, "");
            imageView.setVisibility(8);
            ImageView imageView2 = (ImageView) this.f33577c.findViewById(R.id.lo);
            l.b(imageView2, "");
            imageView2.setVisibility(8);
            ImageView imageView3 = (ImageView) this.f33577c.findViewById(R.id.m0);
            l.b(imageView3, "");
            imageView3.setVisibility(8);
            ImageView imageView4 = (ImageView) this.f33577c.findViewById(R.id.lr);
            l.b(imageView4, "");
            imageView4.setVisibility(8);
        }
        if (this.f33582h.u != null) {
            ((RelativeLayout) this.f33577c.findViewById(R.id.adh)).removeAllViews();
            ((RelativeLayout) this.f33577c.findViewById(R.id.adh)).addView(this.f33582h.u);
        } else {
            DmtTextView dmtTextView = (DmtTextView) this.f33577c.findViewById(R.id.aee);
            l.b(dmtTextView, "");
            dmtTextView.setText(this.f33582h.f33546a);
            if (this.f33582h.B >= 0) {
                DmtTextView dmtTextView2 = (DmtTextView) this.f33577c.findViewById(R.id.aee);
                l.b(dmtTextView2, "");
                dmtTextView2.setMaxWidth(this.f33582h.B);
            }
            if (this.f33582h.f33547b > 0) {
                ImageView imageView5 = (ImageView) this.f33577c.findViewById(R.id.ae4);
                l.b(imageView5, "");
                imageView5.setVisibility(0);
                ((ImageView) this.f33577c.findViewById(R.id.ae4)).setImageResource(this.f33582h.f33547b);
            } else {
                ImageView imageView6 = (ImageView) this.f33577c.findViewById(R.id.ae4);
                l.b(imageView6, "");
                imageView6.setVisibility(8);
            }
        }
        if (this.f33582h.A) {
            FrameLayout frameLayout = (FrameLayout) this.f33577c.findViewById(R.id.ae6);
            l.b(frameLayout, "");
            frameLayout.setBackground(null);
        } else {
            FrameLayout frameLayout2 = (FrameLayout) this.f33577c.findViewById(R.id.ae6);
            l.b(frameLayout2, "");
            frameLayout2.setBackground(androidx.core.content.b.a(this.f33576b, (int) R.drawable.cbv));
        }
        if (this.f33582h.f33549d != 0) {
            Drawable e2 = androidx.core.graphics.drawable.a.e(this.f33576b.getResources().getDrawable(R.drawable.cbv));
            androidx.core.graphics.drawable.a.a(e2, this.f33582h.f33549d);
            FrameLayout frameLayout3 = (FrameLayout) this.f33577c.findViewById(R.id.ae6);
            l.b(frameLayout3, "");
            frameLayout3.setBackground(e2);
        }
        if (this.f33582h.f33548c != 0) {
            ((DmtTextView) this.f33577c.findViewById(R.id.aee)).setTextColor(this.f33582h.f33548c);
        }
        if (this.f33582h.p) {
            int i3 = this.f33582h.f33552g;
            if (i3 != 48) {
                if (i3 == 80) {
                    RelativeLayout relativeLayout2 = (RelativeLayout) this.f33577c.findViewById(R.id.ly);
                    l.b(relativeLayout2, "");
                    relativeLayout2.setVisibility(8);
                    RelativeLayout relativeLayout3 = (RelativeLayout) this.f33577c.findViewById(R.id.lp);
                    l.b(relativeLayout3, "");
                    relativeLayout3.setVisibility(8);
                    RelativeLayout relativeLayout4 = (RelativeLayout) this.f33577c.findViewById(R.id.lm);
                    l.b(relativeLayout4, "");
                    relativeLayout4.setVisibility(8);
                    RelativeLayout relativeLayout5 = (RelativeLayout) this.f33577c.findViewById(R.id.m1);
                    l.b(relativeLayout5, "");
                    relativeLayout5.setVisibility(0);
                    if (this.f33582h.f33549d != 0) {
                        Drawable a2 = androidx.core.content.b.a(this.f33576b, 2131234989);
                        if (a2 == null) {
                            l.b();
                        }
                        Drawable e3 = androidx.core.graphics.drawable.a.e(a2);
                        androidx.core.graphics.drawable.a.a(e3, this.f33582h.f33549d);
                        ((ImageView) this.f33577c.findViewById(R.id.m2)).setImageDrawable(e3);
                    }
                } else if (i3 == 8388611) {
                    RelativeLayout relativeLayout6 = (RelativeLayout) this.f33577c.findViewById(R.id.m1);
                    l.b(relativeLayout6, "");
                    relativeLayout6.setVisibility(8);
                    RelativeLayout relativeLayout7 = (RelativeLayout) this.f33577c.findViewById(R.id.ly);
                    l.b(relativeLayout7, "");
                    relativeLayout7.setVisibility(8);
                    RelativeLayout relativeLayout8 = (RelativeLayout) this.f33577c.findViewById(R.id.lm);
                    l.b(relativeLayout8, "");
                    relativeLayout8.setVisibility(8);
                    RelativeLayout relativeLayout9 = (RelativeLayout) this.f33577c.findViewById(R.id.lp);
                    l.b(relativeLayout9, "");
                    relativeLayout9.setVisibility(0);
                    if (this.f33582h.f33549d != 0) {
                        Drawable a3 = androidx.core.content.b.a(this.f33576b, 2131234990);
                        if (a3 == null) {
                            l.b();
                        }
                        Drawable e4 = androidx.core.graphics.drawable.a.e(a3);
                        androidx.core.graphics.drawable.a.a(e4, this.f33582h.f33549d);
                        ((ImageView) this.f33577c.findViewById(R.id.lq)).setImageDrawable(e4);
                        MethodCollector.o(1711);
                        return;
                    }
                } else if (i3 == 8388613) {
                    RelativeLayout relativeLayout10 = (RelativeLayout) this.f33577c.findViewById(R.id.m1);
                    l.b(relativeLayout10, "");
                    relativeLayout10.setVisibility(8);
                    RelativeLayout relativeLayout11 = (RelativeLayout) this.f33577c.findViewById(R.id.lp);
                    l.b(relativeLayout11, "");
                    relativeLayout11.setVisibility(8);
                    RelativeLayout relativeLayout12 = (RelativeLayout) this.f33577c.findViewById(R.id.lm);
                    l.b(relativeLayout12, "");
                    relativeLayout12.setVisibility(8);
                    RelativeLayout relativeLayout13 = (RelativeLayout) this.f33577c.findViewById(R.id.ly);
                    l.b(relativeLayout13, "");
                    relativeLayout13.setVisibility(0);
                    if (this.f33582h.f33549d != 0) {
                        Drawable a4 = androidx.core.content.b.a(this.f33576b, 2131234990);
                        if (a4 == null) {
                            l.b();
                        }
                        Drawable e5 = androidx.core.graphics.drawable.a.e(a4);
                        androidx.core.graphics.drawable.a.a(e5, this.f33582h.f33549d);
                        ((ImageView) this.f33577c.findViewById(R.id.lz)).setImageDrawable(e5);
                        MethodCollector.o(1711);
                        return;
                    }
                }
                MethodCollector.o(1711);
                return;
            }
            RelativeLayout relativeLayout14 = (RelativeLayout) this.f33577c.findViewById(R.id.m1);
            l.b(relativeLayout14, "");
            relativeLayout14.setVisibility(8);
            RelativeLayout relativeLayout15 = (RelativeLayout) this.f33577c.findViewById(R.id.ly);
            l.b(relativeLayout15, "");
            relativeLayout15.setVisibility(8);
            RelativeLayout relativeLayout16 = (RelativeLayout) this.f33577c.findViewById(R.id.lp);
            l.b(relativeLayout16, "");
            relativeLayout16.setVisibility(8);
            RelativeLayout relativeLayout17 = (RelativeLayout) this.f33577c.findViewById(R.id.lm);
            l.b(relativeLayout17, "");
            relativeLayout17.setVisibility(0);
            if (this.f33582h.f33549d != 0) {
                Drawable a5 = androidx.core.content.b.a(this.f33576b, 2131234989);
                if (a5 == null) {
                    l.b();
                }
                Drawable e6 = androidx.core.graphics.drawable.a.e(a5);
                androidx.core.graphics.drawable.a.a(e6, this.f33582h.f33549d);
                ((ImageView) this.f33577c.findViewById(R.id.ln)).setImageDrawable(e6);
                MethodCollector.o(1711);
                return;
            }
        } else {
            RelativeLayout relativeLayout18 = (RelativeLayout) this.f33577c.findViewById(R.id.m1);
            l.b(relativeLayout18, "");
            relativeLayout18.setVisibility(8);
            RelativeLayout relativeLayout19 = (RelativeLayout) this.f33577c.findViewById(R.id.ly);
            l.b(relativeLayout19, "");
            relativeLayout19.setVisibility(8);
            RelativeLayout relativeLayout20 = (RelativeLayout) this.f33577c.findViewById(R.id.lp);
            l.b(relativeLayout20, "");
            relativeLayout20.setVisibility(8);
            RelativeLayout relativeLayout21 = (RelativeLayout) this.f33577c.findViewById(R.id.lm);
            l.b(relativeLayout21, "");
            relativeLayout21.setVisibility(8);
        }
        MethodCollector.o(1711);
    }

    @Override // com.bytedance.ies.dmt.ui.tooltip.a
    public final void a(b.AbstractC0734b bVar) {
        l.d(bVar, "");
        this.f33580f = bVar;
    }

    private void a(boolean z) {
        this.f33582h.v = z;
        if (this.f33582h.v) {
            this.f33577c.setOnTouchListener(new c(this));
        } else {
            this.f33577c.setOnTouchListener(null);
        }
    }

    @Override // com.bytedance.ies.dmt.ui.tooltip.a
    public final void a(b.c cVar) {
        l.d(cVar, "");
        this.f33581g = cVar;
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f33588a;

        static {
            Covode.recordClassIndex(20013);
        }

        c(e eVar) {
            this.f33588a = eVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f33588a.dismiss();
            return false;
        }
    }

    private void a(boolean z, View.OnClickListener onClickListener) {
        this.f33582h.w = onClickListener;
        this.f33578d.setOnClickListener(onClickListener);
        this.f33578d.setClickable(z);
    }

    public e(Context context, c cVar) {
        l.d(context, "");
        l.d(cVar, "");
        MethodCollector.i(1739);
        this.f33576b = context;
        int a2 = h.g.a.a(n.b(context, 4.0f));
        this.f33584j = a2;
        View inflate = LayoutInflater.from(context).inflate(R.layout.bi5, (ViewGroup) null);
        l.b(inflate, "");
        this.f33577c = inflate;
        View findViewById = inflate.findViewById(R.id.aem);
        l.b(findViewById, "");
        this.f33578d = findViewById;
        this.f33582h = cVar;
        e();
        d();
        d dVar = new d(context, this.f33582h, this.f33578d, false);
        this.f33583i = dVar;
        dVar.f33564e = this.f33585k - a2;
        MethodCollector.o(1739);
    }
}
