package com.bytedance.tux.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.dialog.b.g;
import com.bytedance.tux.dialog.d.c;
import com.bytedance.tux.dialog.e.h;
import com.bytedance.tux.dialog.internal.area.AccessoryArea;
import com.bytedance.tux.dialog.internal.area.ActionArea;
import com.bytedance.tux.dialog.internal.area.CaptionArea;
import com.bytedance.tux.dialog.internal.area.ImageArea;
import com.bytedance.tux.dialog.internal.e;
import com.bytedance.tux.h.f;
import com.bytedance.tux.widget.VisualLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.w;

public final class a extends com.bytedance.tux.dialog.internal.a<b> {

    /* renamed from: d  reason: collision with root package name */
    public static final C1094a f44793d = new C1094a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ActionArea f44794a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f44795b;

    /* renamed from: c  reason: collision with root package name */
    public final Dialog f44796c;

    /* renamed from: k  reason: collision with root package name */
    private final View f44797k;

    /* renamed from: l  reason: collision with root package name */
    private final VisualLayout f44798l;

    /* renamed from: m  reason: collision with root package name */
    private final ImageView f44799m;
    private final ImageArea n;
    private final CaptionArea o;
    private final AccessoryArea p;
    private final com.bytedance.tux.dialog.c.a q;
    private int r;

    static {
        Covode.recordClassIndex(27353);
    }

    /* renamed from: com.bytedance.tux.dialog.a$a  reason: collision with other inner class name */
    public static final class C1094a {
        static {
            Covode.recordClassIndex(27355);
        }

        private C1094a() {
        }

        public /* synthetic */ C1094a(byte b2) {
            this();
        }

        public static b a(Context context) {
            l.c(context, "");
            return new b(context);
        }
    }

    @Override // com.bytedance.tux.dialog.internal.a
    public final Dialog b() {
        return this.f44796c;
    }

    public final void a() {
        this.f44795b = false;
        a(false);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f44804a;

        static {
            Covode.recordClassIndex(27356);
        }

        b(a aVar) {
            this.f44804a = aVar;
        }

        public final void onClick(View view) {
            this.f44804a.dismiss();
        }
    }

    private final void a(boolean z) {
        if (z) {
            this.f44797k.setOnClickListener(new b(this));
        } else {
            this.f44797k.setOnClickListener(null);
        }
        this.f44796c.setCancelable(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(bVar);
        int i2;
        int i3;
        int i4;
        l.c(bVar, "");
        MethodCollector.i(8724);
        View inflate = LayoutInflater.from(this.f44880f).inflate(R.layout.f159999h, (ViewGroup) null);
        l.a((Object) inflate, "");
        this.f44797k = inflate;
        View findViewById = inflate.findViewById(R.id.fki);
        l.a((Object) findViewById, "");
        VisualLayout visualLayout = (VisualLayout) findViewById;
        this.f44798l = visualLayout;
        View findViewById2 = inflate.findViewById(R.id.a7r);
        l.a((Object) findViewById2, "");
        ImageView imageView = (ImageView) findViewById2;
        this.f44799m = imageView;
        View findViewById3 = inflate.findViewById(R.id.eok);
        l.a((Object) findViewById3, "");
        ImageArea imageArea = (ImageArea) findViewById3;
        this.n = imageArea;
        View findViewById4 = inflate.findViewById(R.id.a2f);
        l.a((Object) findViewById4, "");
        CaptionArea captionArea = (CaptionArea) findViewById4;
        this.o = captionArea;
        View findViewById5 = inflate.findViewById(R.id.bl);
        l.a((Object) findViewById5, "");
        AccessoryArea accessoryArea = (AccessoryArea) findViewById5;
        this.p = accessoryArea;
        View findViewById6 = inflate.findViewById(R.id.bw);
        l.a((Object) findViewById6, "");
        ActionArea actionArea = (ActionArea) findViewById6;
        this.f44794a = actionArea;
        com.bytedance.tux.dialog.c.a aVar = bVar.f44814g;
        aVar = aVar == null ? new com.bytedance.tux.dialog.c.b() : aVar;
        this.q = aVar;
        this.r = -1;
        this.f44795b = bVar.n;
        this.f44796c = new e(this, inflate, aVar, visualLayout);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a2 = h.g.a.a(TypedValue.applyDimension(1, 480.0f, system.getDisplayMetrics()));
        Context context = this.f44880f;
        l.c(context, "");
        Resources resources = context.getResources();
        l.a((Object) resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            i2 = displayMetrics.heightPixels;
        } else {
            i2 = 0;
        }
        double d2 = (double) i2;
        Double.isNaN(d2);
        int min = Math.min((int) (d2 * 0.9d), a2);
        this.r = min;
        visualLayout.setMaxHeight(min);
        if (bVar.f44808a) {
            com.bytedance.tux.c.b bVar2 = new com.bytedance.tux.c.b(this.f44880f, this.f44879e.s);
            if (bVar.f44809b) {
                i4 = this.f44879e.p;
            } else {
                i4 = this.f44879e.o;
            }
            bVar2.c(i4);
            imageView.setImageDrawable(bVar2);
            imageView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.bytedance.tux.dialog.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f44800a;

                static {
                    Covode.recordClassIndex(27354);
                }

                {
                    this.f44800a = r1;
                }

                public final void onClick(View view) {
                    this.f44800a.a("button_close");
                }
            });
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        visualLayout.setBackgroundColor(this.f44879e.f44913k);
        visualLayout.setRadius((int) this.f44879e.f44909g);
        h hVar = bVar.f44810c;
        l.c(this, "");
        imageArea.f44891a = hVar;
        if (hVar == null) {
            imageArea.a();
        } else {
            imageArea.removeAllViews();
            hVar.a(this);
            imageArea.addView(hVar.a());
        }
        c cVar = bVar.f44811d;
        l.c(this, "");
        captionArea.removeAllViews();
        captionArea.f44890a = cVar;
        if (cVar != null) {
            cVar.a(this);
            captionArea.addView(cVar.a());
        }
        com.bytedance.tux.dialog.a.e eVar = bVar.f44812e;
        l.c(this, "");
        accessoryArea.removeAllViews();
        accessoryArea.f44888a = eVar;
        if (eVar == null) {
            accessoryArea.setVisibility(8);
        } else {
            accessoryArea.setVisibility(0);
            eVar.a(this);
            accessoryArea.addView(eVar.a());
        }
        g gVar = bVar.f44813f;
        l.c(this, "");
        actionArea.removeAllViews();
        actionArea.f44889a = gVar;
        if (gVar != null) {
            gVar.a(this);
            actionArea.addView(gVar.a());
        }
        c();
        Context context2 = visualLayout.getContext();
        l.a((Object) context2, "");
        double a3 = (double) f.a(context2);
        Double.isNaN(a3);
        int i5 = (int) (a3 * 0.08d);
        ViewGroup.LayoutParams layoutParams = visualLayout.getLayoutParams();
        if (layoutParams != null) {
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            int a4 = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i5, a4, i5, h.g.a.a(TypedValue.applyDimension(1, 20.0f, system3.getDisplayMetrics())));
            a(bVar.n);
            MethodCollector.o(8724);
            return;
        }
        w wVar = new w("null cannot be cast to non-null type");
        MethodCollector.o(8724);
        throw wVar;
    }
}
