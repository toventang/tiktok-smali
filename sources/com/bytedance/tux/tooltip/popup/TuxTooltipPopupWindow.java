package com.bytedance.tux.tooltip.popup;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.tooltip.b;
import com.bytedance.tux.tooltip.c;
import com.bytedance.tux.tooltip.d;
import com.bytedance.tux.tooltip.e;
import com.bytedance.tux.tooltip.h;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class TuxTooltipPopupWindow extends PopupWindow implements com.bytedance.tux.tooltip.a, au {

    /* renamed from: a  reason: collision with root package name */
    public d f45567a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f45568b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f45569c;

    /* renamed from: d  reason: collision with root package name */
    private View f45570d;

    /* renamed from: e  reason: collision with root package name */
    private final e f45571e;

    static {
        Covode.recordClassIndex(27726);
    }

    @Override // com.bytedance.tux.tooltip.a
    public final void b(boolean z) {
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
        final /* synthetic */ TuxTooltipPopupWindow f45574a;

        static {
            Covode.recordClassIndex(27729);
        }

        b(TuxTooltipPopupWindow tuxTooltipPopupWindow) {
            this.f45574a = tuxTooltipPopupWindow;
        }

        public final void run() {
            this.f45574a.dismiss();
        }
    }

    @Override // com.bytedance.tux.tooltip.a
    public final d b() {
        return this.f45571e.f45548d;
    }

    @Override // com.bytedance.tux.tooltip.a
    public final boolean isShowing() {
        return super.isShowing();
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TuxTooltipPopupWindow f45573a;

        static {
            Covode.recordClassIndex(27728);
        }

        a(TuxTooltipPopupWindow tuxTooltipPopupWindow) {
            this.f45573a = tuxTooltipPopupWindow;
        }

        public final void run() {
            TuxTooltipPopupWindow.super.dismiss();
            this.f45573a.f45568b = false;
        }
    }

    @Override // com.bytedance.tux.tooltip.a
    public final void dismiss() {
        if (!this.f45567a.f45543m) {
            super.dismiss();
        } else if (!this.f45568b) {
            e eVar = this.f45571e;
            eVar.a(eVar.f45545a, false);
            this.f45568b = true;
            new Handler().postDelayed(new a(this), this.f45567a.f45542l);
        }
    }

    private final void c() {
        Context context = this.f45569c;
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            b.a aVar = this.f45567a.q;
            if (aVar != null) {
                aVar.a();
            }
            if (this.f45567a.f45533c == null) {
                Window window = ((Activity) this.f45569c).getWindow();
                l.a((Object) window, "");
                showAtLocation(window.getDecorView(), 0, this.f45571e.f45545a.f45562a, this.f45571e.f45545a.f45563b);
            } else {
                showAtLocation(this.f45567a.f45533c, 0, this.f45571e.f45545a.f45562a, this.f45571e.f45545a.f45563b);
            }
            c.AbstractC1121c cVar = this.f45567a.A;
            if (cVar != null) {
                cVar.onShow();
            }
            e eVar = this.f45571e;
            eVar.a(eVar.f45545a, true);
            if (this.f45567a.f45539i != -1001) {
                new Handler().postDelayed(new b(this), this.f45567a.f45539i);
            }
        }
    }

    @Override // com.bytedance.tux.tooltip.a
    public final void a() {
        if (this.f45567a.f45533c == null && (this.f45567a.r < 0 || this.f45567a.s < 0)) {
            return;
        }
        if (!this.f45571e.a()) {
            int i2 = a.f45575a[this.f45567a.f45535e.ordinal()];
            if (i2 == 1) {
                this.f45567a.a(h.END);
            } else if (i2 == 2) {
                this.f45567a.a(h.START);
            } else if (i2 == 3) {
                this.f45567a.a(h.TOP);
            } else if (i2 == 4) {
                this.f45567a.a(h.BOTTOM);
            }
            a(this.f45567a);
            if (this.f45571e.a() || this.f45567a.f45541k) {
                c();
                return;
            }
            return;
        }
        c();
    }

    @Override // com.bytedance.tux.tooltip.a
    public final void a(c.b bVar) {
        this.f45567a.z = bVar;
    }

    @Override // com.bytedance.tux.tooltip.a
    public final void a(c.AbstractC1121c cVar) {
        this.f45567a.A = cVar;
    }

    @Override // com.bytedance.tux.tooltip.a
    public final void a(d dVar) {
        l.c(dVar, "");
        this.f45571e.a(dVar);
        this.f45567a = dVar;
        this.f45571e.c();
        this.f45571e.d();
    }

    @Override // com.bytedance.tux.tooltip.a
    public final void a(boolean z) {
        setOutsideTouchable(z);
    }

    public TuxTooltipPopupWindow(Context context, d dVar) {
        l.c(context, "");
        l.c(dVar, "");
        MethodCollector.i(8824);
        this.f45569c = context;
        this.f45567a = dVar;
        if (context instanceof m) {
            ((m) context).getLifecycle().a(this);
        }
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        View inflate = LayoutInflater.from(context).inflate(R.layout.f159996e, (ViewGroup) null);
        l.a((Object) inflate, "");
        this.f45570d = inflate;
        setContentView(inflate);
        e eVar = new e(context, this.f45567a, this, this.f45570d, true);
        this.f45571e = eVar;
        setOnDismissListener(new PopupWindow.OnDismissListener(this) {
            /* class com.bytedance.tux.tooltip.popup.TuxTooltipPopupWindow.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TuxTooltipPopupWindow f45572a;

            static {
                Covode.recordClassIndex(27727);
            }

            {
                this.f45572a = r1;
            }

            public final void onDismiss() {
                c.b bVar = this.f45572a.f45567a.z;
                if (bVar != null) {
                    bVar.a();
                }
            }
        });
        eVar.b();
        a(this.f45567a);
        MethodCollector.o(8824);
    }

    @Override // com.bytedance.tux.tooltip.a
    public final void a(boolean z, View.OnClickListener onClickListener) {
        this.f45567a.x = onClickListener;
        if (z) {
            setTouchable(true);
            ((FrameLayout) this.f45570d.findViewById(R.id.adh)).setOnClickListener(onClickListener);
            return;
        }
        setTouchable(false);
    }
}
