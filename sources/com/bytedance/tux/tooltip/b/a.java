package com.bytedance.tux.tooltip.b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.tooltip.b;
import com.bytedance.tux.tooltip.c;
import com.bytedance.tux.tooltip.e;
import com.bytedance.tux.tooltip.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a implements com.bytedance.tux.tooltip.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f45514a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f45515b;

    /* renamed from: c  reason: collision with root package name */
    private View f45516c;

    /* renamed from: d  reason: collision with root package name */
    private View f45517d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f45518e = true;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.tux.tooltip.d f45519f;

    /* renamed from: g  reason: collision with root package name */
    private e f45520g;

    /* renamed from: h  reason: collision with root package name */
    private final int f45521h;

    /* renamed from: i  reason: collision with root package name */
    private int f45522i;

    static {
        Covode.recordClassIndex(27709);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f45524a;

        static {
            Covode.recordClassIndex(27711);
        }

        b(a aVar) {
            this.f45524a = aVar;
        }

        public final void run() {
            this.f45524a.dismiss();
        }
    }

    @Override // com.bytedance.tux.tooltip.a
    public final com.bytedance.tux.tooltip.d b() {
        return this.f45520g.f45548d;
    }

    @Override // com.bytedance.tux.tooltip.a
    public final boolean isShowing() {
        if (!this.f45518e) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.tooltip.b.a$a  reason: collision with other inner class name */
    public static final class RunnableC1119a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f45523a;

        static {
            Covode.recordClassIndex(27710);
        }

        RunnableC1119a(a aVar) {
            this.f45523a = aVar;
        }

        public final void run() {
            this.f45523a.c();
            this.f45523a.f45514a = false;
        }
    }

    public final void c() {
        MethodCollector.i(8741);
        this.f45516c.setVisibility(8);
        ViewGroup viewGroup = this.f45519f.f45534d;
        if (viewGroup != null) {
            viewGroup.removeView(this.f45516c);
        }
        this.f45518e = true;
        c.b bVar = this.f45519f.z;
        if (bVar != null) {
            bVar.a();
            MethodCollector.o(8741);
            return;
        }
        MethodCollector.o(8741);
    }

    @Override // com.bytedance.tux.tooltip.a
    public final void dismiss() {
        if (this.f45518e) {
            return;
        }
        if (!this.f45519f.f45543m) {
            c();
        } else if (!this.f45514a) {
            e eVar = this.f45520g;
            eVar.a(eVar.f45545a, false);
            this.f45514a = true;
            new Handler().postDelayed(new RunnableC1119a(this), this.f45519f.f45542l);
        }
    }

    private final void d() {
        MethodCollector.i(8681);
        b.a aVar = this.f45519f.q;
        if (aVar != null) {
            aVar.a();
        }
        ViewGroup viewGroup = this.f45519f.f45534d;
        if (viewGroup != null) {
            viewGroup.addView(this.f45516c);
        }
        this.f45516c.setVisibility(0);
        this.f45518e = false;
        this.f45517d.setX((float) this.f45520g.f45545a.f45562a);
        this.f45517d.setY((float) this.f45520g.f45545a.f45563b);
        e eVar = this.f45520g;
        eVar.a(eVar.f45545a, true);
        c.AbstractC1121c cVar = this.f45519f.A;
        if (cVar != null) {
            cVar.onShow();
        }
        if (this.f45519f.f45539i != -1001) {
            new Handler().postDelayed(new b(this), this.f45519f.f45539i);
        }
        MethodCollector.o(8681);
    }

    @Override // com.bytedance.tux.tooltip.a
    public final void a() {
        if ((this.f45519f.f45533c == null && (this.f45519f.r < 0 || this.f45519f.s < 0)) || this.f45519f.f45534d == null || !this.f45518e) {
            return;
        }
        if (!this.f45520g.a()) {
            int i2 = b.f45528a[this.f45519f.f45535e.ordinal()];
            if (i2 == 1) {
                this.f45519f.a(h.END);
            } else if (i2 == 2) {
                this.f45519f.a(h.START);
            } else if (i2 == 3) {
                this.f45519f.a(h.TOP);
            } else if (i2 == 4) {
                this.f45519f.a(h.BOTTOM);
            }
            this.f45520g.c();
            this.f45520g.d();
            if (this.f45520g.a() || this.f45519f.f45541k) {
                d();
                return;
            }
            return;
        }
        d();
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f45525a;

        static {
            Covode.recordClassIndex(27712);
        }

        c(a aVar) {
            this.f45525a = aVar;
        }

        public final void onClick(View view) {
            this.f45525a.dismiss();
        }
    }

    @Override // com.bytedance.tux.tooltip.a
    public final void a(c.b bVar) {
        this.f45519f.z = bVar;
    }

    @Override // com.bytedance.tux.tooltip.a
    public final void a(c.AbstractC1121c cVar) {
        this.f45519f.A = cVar;
    }

    @Override // com.bytedance.tux.tooltip.a
    public final void a(com.bytedance.tux.tooltip.d dVar) {
        l.c(dVar, "");
        this.f45520g.a(dVar);
        this.f45519f = dVar;
        this.f45520g.c();
        this.f45520g.d();
    }

    @Override // com.bytedance.tux.tooltip.a
    public final void b(boolean z) {
        if (z) {
            this.f45516c.setOnClickListener(null);
            return;
        }
        a(true);
        this.f45516c.setOnClickListener(new c(this));
    }

    @Override // com.bytedance.tux.tooltip.a
    public final void a(boolean z) {
        this.f45519f.v = z;
        if (this.f45519f.v) {
            this.f45516c.setOnTouchListener(new d(this));
        } else {
            this.f45516c.setOnTouchListener(null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f45526a;

        static {
            Covode.recordClassIndex(27713);
        }

        d(a aVar) {
            this.f45526a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f45526a.dismiss();
            return false;
        }
    }

    public a(Context context, com.bytedance.tux.tooltip.d dVar) {
        l.c(context, "");
        l.c(dVar, "");
        MethodCollector.i(8760);
        this.f45515b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.f159997f, (ViewGroup) null);
        l.a((Object) inflate, "");
        this.f45516c = inflate;
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a2 = h.g.a.a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
        this.f45521h = a2;
        View findViewById = this.f45516c.findViewById(R.id.aem);
        l.a((Object) findViewById, "");
        this.f45517d = findViewById;
        e eVar = new e(context, dVar, this, this.f45517d, false);
        this.f45520g = eVar;
        this.f45519f = eVar.f45548d;
        this.f45520g.b();
        this.f45520g.c();
        this.f45520g.d();
        this.f45520g.f45546b = this.f45522i - a2;
        MethodCollector.o(8760);
    }

    @Override // com.bytedance.tux.tooltip.a
    public final void a(boolean z, View.OnClickListener onClickListener) {
        this.f45519f.x = onClickListener;
        this.f45517d.setOnClickListener(onClickListener);
        this.f45517d.setClickable(z);
    }
}
