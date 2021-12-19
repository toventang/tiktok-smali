package com.bytedance.ies.dmt.ui.tooltip;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.tooltip.b;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ToolTipPopupWindow extends PopupWindow implements a, au {

    /* renamed from: a  reason: collision with root package name */
    public boolean f33532a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f33533b;

    /* renamed from: c  reason: collision with root package name */
    private c f33534c;

    /* renamed from: d  reason: collision with root package name */
    private View f33535d;

    /* renamed from: e  reason: collision with root package name */
    private final d f33536e;

    /* renamed from: f  reason: collision with root package name */
    private final int f33537f;

    /* renamed from: g  reason: collision with root package name */
    private int f33538g;

    static {
        Covode.recordClassIndex(19997);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        super.dismiss();
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ToolTipPopupWindow f33540a;

        static {
            Covode.recordClassIndex(19999);
        }

        b(ToolTipPopupWindow toolTipPopupWindow) {
            this.f33540a = toolTipPopupWindow;
        }

        public final void run() {
            this.f33540a.dismiss();
        }
    }

    static final class c implements PopupWindow.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0734b f33541a;

        static {
            Covode.recordClassIndex(20000);
        }

        c(b.AbstractC0734b bVar) {
            this.f33541a = bVar;
        }

        public final void onDismiss() {
            this.f33541a.a();
        }
    }

    @Override // com.bytedance.ies.dmt.ui.tooltip.a
    public final boolean isShowing() {
        return super.isShowing();
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ToolTipPopupWindow f33539a;

        static {
            Covode.recordClassIndex(19998);
        }

        a(ToolTipPopupWindow toolTipPopupWindow) {
            this.f33539a = toolTipPopupWindow;
        }

        public final void run() {
            ToolTipPopupWindow.super.dismiss();
            this.f33539a.f33532a = false;
        }
    }

    @Override // com.bytedance.ies.dmt.ui.tooltip.a
    public final void dismiss() {
        if (!this.f33534c.o) {
            super.dismiss();
        } else if (!this.f33532a) {
            d dVar = this.f33536e;
            dVar.a(dVar.f33562c, false);
            this.f33532a = true;
            new Handler().postDelayed(new a(this), this.f33534c.n);
        }
    }

    private final void b() {
        Context context = this.f33533b;
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            if (this.f33534c.f33550e == null) {
                Window window = ((Activity) this.f33533b).getWindow();
                l.b(window, "");
                showAtLocation(window.getDecorView(), 0, this.f33536e.f33562c.f33571a, this.f33536e.f33562c.f33572b);
            } else {
                showAtLocation(this.f33534c.f33550e, 0, this.f33536e.f33562c.f33571a, this.f33536e.f33562c.f33572b);
            }
            d dVar = this.f33536e;
            dVar.a(dVar.f33562c, true);
            if (this.f33534c.f33556k != -1001) {
                new Handler().postDelayed(new b(this), this.f33534c.f33556k);
            }
        }
    }

    @Override // com.bytedance.ies.dmt.ui.tooltip.a
    public final void a() {
        if (this.f33534c.f33550e != null || (this.f33534c.s >= 0 && this.f33534c.t >= 0)) {
            d dVar = this.f33536e;
            if (!dVar.a(dVar.f33562c)) {
                int i2 = this.f33534c.f33552g;
                if (i2 == 48) {
                    this.f33534c.f33552g = 80;
                } else if (i2 == 80) {
                    this.f33534c.f33552g = 48;
                } else if (i2 == 8388611) {
                    this.f33534c.f33552g = 8388613;
                } else if (i2 == 8388613) {
                    this.f33534c.f33552g = 8388611;
                }
                d();
                c();
                d dVar2 = this.f33536e;
                if (dVar2.a(dVar2.f33562c) || this.f33534c.f33558m) {
                    b();
                    return;
                }
                return;
            }
            b();
        }
    }

    private final void d() {
        setOutsideTouchable(this.f33534c.v);
        a(this.f33534c.x, this.f33534c.w);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        this.f33538g = this.f33534c.f33557l;
        if (this.f33537f > this.f33534c.f33557l) {
            this.f33538g = this.f33537f;
        }
        d dVar = this.f33536e;
        if (dVar != null) {
            dVar.f33564e = this.f33538g - this.f33537f;
        }
        if (this.f33534c.f33552g == 3) {
            this.f33534c.f33552g = 8388611;
        } else if (this.f33534c.f33552g == 5) {
            this.f33534c.f33552g = 8388613;
        }
        if (gb.a(this.f33533b)) {
            if (this.f33534c.f33552g == 8388611) {
                this.f33534c.f33552g = 8388613;
            } else if (this.f33534c.f33552g == 8388613) {
                this.f33534c.f33552g = 8388611;
            }
        }
        if (this.f33534c.f33556k < 0 && this.f33534c.f33556k != -1001) {
            this.f33534c.f33556k = 3000;
        }
        if (this.f33534c.n < 0) {
            this.f33534c.n = 300;
        }
        if (this.f33534c.q == null) {
            this.f33534c.q = new com.bytedance.ies.dmt.ui.c.b();
        }
        if (this.f33534c.r == null) {
            this.f33534c.r = new com.bytedance.ies.dmt.ui.c.c();
        }
    }

    private final void c() {
        MethodCollector.i(479);
        if (gb.a(this.f33533b)) {
            int i2 = Build.VERSION.SDK_INT;
            RelativeLayout relativeLayout = (RelativeLayout) this.f33535d.findViewById(R.id.adh);
            l.b(relativeLayout, "");
            relativeLayout.setLayoutDirection(1);
        }
        if (Build.VERSION.SDK_INT < 21) {
            ImageView imageView = (ImageView) this.f33535d.findViewById(R.id.m3);
            l.b(imageView, "");
            imageView.setVisibility(8);
            ImageView imageView2 = (ImageView) this.f33535d.findViewById(R.id.lo);
            l.b(imageView2, "");
            imageView2.setVisibility(8);
            ImageView imageView3 = (ImageView) this.f33535d.findViewById(R.id.m0);
            l.b(imageView3, "");
            imageView3.setVisibility(8);
            ImageView imageView4 = (ImageView) this.f33535d.findViewById(R.id.lr);
            l.b(imageView4, "");
            imageView4.setVisibility(8);
        }
        if (this.f33534c.u != null) {
            ((RelativeLayout) this.f33535d.findViewById(R.id.adh)).removeAllViews();
            ((RelativeLayout) this.f33535d.findViewById(R.id.adh)).addView(this.f33534c.u);
        } else {
            DmtTextView dmtTextView = (DmtTextView) this.f33535d.findViewById(R.id.aee);
            l.b(dmtTextView, "");
            dmtTextView.setText(this.f33534c.f33546a);
            if (this.f33534c.B >= 0) {
                DmtTextView dmtTextView2 = (DmtTextView) this.f33535d.findViewById(R.id.aee);
                l.b(dmtTextView2, "");
                dmtTextView2.setMaxWidth(this.f33534c.B);
            }
            if (this.f33534c.f33547b > 0) {
                ImageView imageView5 = (ImageView) this.f33535d.findViewById(R.id.ae4);
                l.b(imageView5, "");
                imageView5.setVisibility(0);
                ((ImageView) this.f33535d.findViewById(R.id.ae4)).setImageResource(this.f33534c.f33547b);
            } else {
                ImageView imageView6 = (ImageView) this.f33535d.findViewById(R.id.ae4);
                l.b(imageView6, "");
                imageView6.setVisibility(8);
            }
        }
        if (this.f33534c.A) {
            FrameLayout frameLayout = (FrameLayout) this.f33535d.findViewById(R.id.ae6);
            l.b(frameLayout, "");
            frameLayout.setBackground(null);
        } else {
            FrameLayout frameLayout2 = (FrameLayout) this.f33535d.findViewById(R.id.ae6);
            l.b(frameLayout2, "");
            frameLayout2.setBackground(androidx.core.content.b.a(this.f33533b, (int) R.drawable.cbv));
        }
        if (this.f33534c.f33549d != 0) {
            Drawable e2 = androidx.core.graphics.drawable.a.e(this.f33533b.getResources().getDrawable(R.drawable.cbv));
            androidx.core.graphics.drawable.a.a(e2, this.f33534c.f33549d);
            FrameLayout frameLayout3 = (FrameLayout) this.f33535d.findViewById(R.id.ae6);
            l.b(frameLayout3, "");
            frameLayout3.setBackground(e2);
        }
        if (this.f33534c.f33548c != 0) {
            ((DmtTextView) this.f33535d.findViewById(R.id.aee)).setTextColor(this.f33534c.f33548c);
        }
        if (this.f33534c.p) {
            int i3 = this.f33534c.f33552g;
            if (i3 != 48) {
                if (i3 == 80) {
                    RelativeLayout relativeLayout2 = (RelativeLayout) this.f33535d.findViewById(R.id.ly);
                    l.b(relativeLayout2, "");
                    relativeLayout2.setVisibility(8);
                    RelativeLayout relativeLayout3 = (RelativeLayout) this.f33535d.findViewById(R.id.lp);
                    l.b(relativeLayout3, "");
                    relativeLayout3.setVisibility(8);
                    RelativeLayout relativeLayout4 = (RelativeLayout) this.f33535d.findViewById(R.id.lm);
                    l.b(relativeLayout4, "");
                    relativeLayout4.setVisibility(8);
                    RelativeLayout relativeLayout5 = (RelativeLayout) this.f33535d.findViewById(R.id.m1);
                    l.b(relativeLayout5, "");
                    relativeLayout5.setVisibility(0);
                    if (this.f33534c.f33549d != 0) {
                        Drawable a2 = androidx.core.content.b.a(this.f33533b, 2131234989);
                        if (a2 == null) {
                            l.b();
                        }
                        Drawable e3 = androidx.core.graphics.drawable.a.e(a2);
                        androidx.core.graphics.drawable.a.a(e3, this.f33534c.f33549d);
                        ((ImageView) this.f33535d.findViewById(R.id.m2)).setImageDrawable(e3);
                    }
                } else if (i3 == 8388611) {
                    RelativeLayout relativeLayout6 = (RelativeLayout) this.f33535d.findViewById(R.id.m1);
                    l.b(relativeLayout6, "");
                    relativeLayout6.setVisibility(8);
                    RelativeLayout relativeLayout7 = (RelativeLayout) this.f33535d.findViewById(R.id.ly);
                    l.b(relativeLayout7, "");
                    relativeLayout7.setVisibility(8);
                    RelativeLayout relativeLayout8 = (RelativeLayout) this.f33535d.findViewById(R.id.lm);
                    l.b(relativeLayout8, "");
                    relativeLayout8.setVisibility(8);
                    RelativeLayout relativeLayout9 = (RelativeLayout) this.f33535d.findViewById(R.id.lp);
                    l.b(relativeLayout9, "");
                    relativeLayout9.setVisibility(0);
                    if (this.f33534c.f33549d != 0) {
                        Drawable a3 = androidx.core.content.b.a(this.f33533b, 2131234990);
                        if (a3 == null) {
                            l.b();
                        }
                        Drawable e4 = androidx.core.graphics.drawable.a.e(a3);
                        androidx.core.graphics.drawable.a.a(e4, this.f33534c.f33549d);
                        ((ImageView) this.f33535d.findViewById(R.id.lq)).setImageDrawable(e4);
                        MethodCollector.o(479);
                        return;
                    }
                } else if (i3 == 8388613) {
                    RelativeLayout relativeLayout10 = (RelativeLayout) this.f33535d.findViewById(R.id.m1);
                    l.b(relativeLayout10, "");
                    relativeLayout10.setVisibility(8);
                    RelativeLayout relativeLayout11 = (RelativeLayout) this.f33535d.findViewById(R.id.lp);
                    l.b(relativeLayout11, "");
                    relativeLayout11.setVisibility(8);
                    RelativeLayout relativeLayout12 = (RelativeLayout) this.f33535d.findViewById(R.id.lm);
                    l.b(relativeLayout12, "");
                    relativeLayout12.setVisibility(8);
                    RelativeLayout relativeLayout13 = (RelativeLayout) this.f33535d.findViewById(R.id.ly);
                    l.b(relativeLayout13, "");
                    relativeLayout13.setVisibility(0);
                    if (this.f33534c.f33549d != 0) {
                        Drawable a4 = androidx.core.content.b.a(this.f33533b, 2131234990);
                        if (a4 == null) {
                            l.b();
                        }
                        Drawable e5 = androidx.core.graphics.drawable.a.e(a4);
                        androidx.core.graphics.drawable.a.a(e5, this.f33534c.f33549d);
                        ((ImageView) this.f33535d.findViewById(R.id.lz)).setImageDrawable(e5);
                        MethodCollector.o(479);
                        return;
                    }
                }
                MethodCollector.o(479);
                return;
            }
            RelativeLayout relativeLayout14 = (RelativeLayout) this.f33535d.findViewById(R.id.m1);
            l.b(relativeLayout14, "");
            relativeLayout14.setVisibility(8);
            RelativeLayout relativeLayout15 = (RelativeLayout) this.f33535d.findViewById(R.id.ly);
            l.b(relativeLayout15, "");
            relativeLayout15.setVisibility(8);
            RelativeLayout relativeLayout16 = (RelativeLayout) this.f33535d.findViewById(R.id.lp);
            l.b(relativeLayout16, "");
            relativeLayout16.setVisibility(8);
            RelativeLayout relativeLayout17 = (RelativeLayout) this.f33535d.findViewById(R.id.lm);
            l.b(relativeLayout17, "");
            relativeLayout17.setVisibility(0);
            if (this.f33534c.f33549d != 0) {
                Drawable a5 = androidx.core.content.b.a(this.f33533b, 2131234989);
                if (a5 == null) {
                    l.b();
                }
                Drawable e6 = androidx.core.graphics.drawable.a.e(a5);
                androidx.core.graphics.drawable.a.a(e6, this.f33534c.f33549d);
                ((ImageView) this.f33535d.findViewById(R.id.ln)).setImageDrawable(e6);
                MethodCollector.o(479);
                return;
            }
        } else {
            RelativeLayout relativeLayout18 = (RelativeLayout) this.f33535d.findViewById(R.id.m1);
            l.b(relativeLayout18, "");
            relativeLayout18.setVisibility(8);
            RelativeLayout relativeLayout19 = (RelativeLayout) this.f33535d.findViewById(R.id.ly);
            l.b(relativeLayout19, "");
            relativeLayout19.setVisibility(8);
            RelativeLayout relativeLayout20 = (RelativeLayout) this.f33535d.findViewById(R.id.lp);
            l.b(relativeLayout20, "");
            relativeLayout20.setVisibility(8);
            RelativeLayout relativeLayout21 = (RelativeLayout) this.f33535d.findViewById(R.id.lm);
            l.b(relativeLayout21, "");
            relativeLayout21.setVisibility(8);
        }
        MethodCollector.o(479);
    }

    @Override // com.bytedance.ies.dmt.ui.tooltip.a
    public final void a(b.c cVar) {
        l.d(cVar, "");
        this.f33534c.z = cVar;
    }

    @Override // com.bytedance.ies.dmt.ui.tooltip.a
    public final void a(b.AbstractC0734b bVar) {
        l.d(bVar, "");
        this.f33534c.y = bVar;
        setOnDismissListener(new c(bVar));
    }

    private void a(boolean z, View.OnClickListener onClickListener) {
        this.f33534c.w = onClickListener;
        if (z) {
            setTouchable(true);
            ((RelativeLayout) this.f33535d.findViewById(R.id.adh)).setOnClickListener(onClickListener);
            return;
        }
        setTouchable(false);
    }

    public ToolTipPopupWindow(Context context, c cVar) {
        l.d(context, "");
        l.d(cVar, "");
        MethodCollector.i(489);
        this.f33533b = context;
        this.f33534c = cVar;
        int a2 = h.g.a.a(n.b(context, 4.0f));
        this.f33537f = a2;
        if (context instanceof m) {
            ((m) context).getLifecycle().a(this);
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.bi6, (ViewGroup) null);
        l.b(inflate, "");
        this.f33535d = inflate;
        setContentView(inflate);
        d();
        c();
        d dVar = new d(context, this.f33534c, this.f33535d, true);
        this.f33536e = dVar;
        dVar.f33564e = this.f33538g - a2;
        MethodCollector.o(489);
    }
}
