package com.ss.android.ugc.aweme.tools.beauty.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.StyleTextView;
import com.ss.android.ugc.tools.view.style.b;
import com.ss.android.ugc.tools.view.style.g;
import com.ss.android.ugc.tools.view.widget.c.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class b extends com.ss.android.ugc.tools.view.widget.c.a {

    /* renamed from: b  reason: collision with root package name */
    public static final C3677b f139254b = new C3677b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ImageView f139255a;

    /* renamed from: d  reason: collision with root package name */
    private c f139256d;

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f139260a;

        /* renamed from: b  reason: collision with root package name */
        public int f139261b;

        /* renamed from: c  reason: collision with root package name */
        public int f139262c;

        /* renamed from: d  reason: collision with root package name */
        public int f139263d;

        /* renamed from: e  reason: collision with root package name */
        public int f139264e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f139265f = true;

        /* renamed from: g  reason: collision with root package name */
        public int f139266g = 4;

        /* renamed from: h  reason: collision with root package name */
        public int f139267h = 4;

        /* renamed from: i  reason: collision with root package name */
        public int f139268i = R.color.tf;

        /* renamed from: j  reason: collision with root package name */
        public boolean f139269j = true;

        /* renamed from: k  reason: collision with root package name */
        public boolean f139270k = true;

        /* renamed from: l  reason: collision with root package name */
        public int f139271l = 2;

        /* renamed from: m  reason: collision with root package name */
        public int f139272m = R.color.tf;
        public int n = R.color.a2r;
        public int o = 2;
        public int p = 8;
        public int q = R.color.a2r;
        public int r = R.color.a2r;

        static {
            Covode.recordClassIndex(91050);
        }
    }

    static {
        Covode.recordClassIndex(91047);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.b$b  reason: collision with other inner class name */
    public static final class C3677b {
        static {
            Covode.recordClassIndex(91049);
        }

        private C3677b() {
        }

        public /* synthetic */ C3677b(byte b2) {
            this();
        }

        public static b a(Context context, h.f.a.b<? super a, z> bVar) {
            l.d(context, "");
            l.d(bVar, "");
            a aVar = new a(context);
            bVar.invoke(aVar);
            b a2 = aVar.b();
            TextView textView = a2.getTextView();
            if (textView != null) {
                if (com.ss.android.ugc.tools.a.f149054l.f149061f) {
                    textView.setTextSize(12.0f);
                    g.a(textView);
                } else {
                    textView.setTextSize(11.0f);
                    textView.setTypeface(Typeface.defaultFromStyle(0));
                }
            }
            return a2;
        }
    }

    public final c getConfig() {
        return this.f139256d;
    }

    public static final class a extends a.C4052a {

        /* renamed from: a  reason: collision with root package name */
        public int f139257a = R.color.a2r;

        /* renamed from: b  reason: collision with root package name */
        public int f139258b = R.color.a2r;

        /* renamed from: c  reason: collision with root package name */
        private int f139259c = 8;

        static {
            Covode.recordClassIndex(91048);
        }

        /* renamed from: a */
        public final b b() {
            c cVar = new c();
            cVar.f139260a = this.f150394d;
            cVar.f139261b = this.f150395e;
            cVar.f139262c = this.f150397g;
            cVar.f139263d = this.f150398h;
            cVar.f139264e = this.f150399i;
            cVar.f139265f = this.f150400j;
            cVar.f139266g = this.f150401k;
            cVar.f139267h = this.f150402l;
            cVar.f139268i = this.f150403m;
            cVar.f139269j = this.n;
            cVar.f139270k = this.o;
            cVar.f139271l = this.q;
            cVar.f139272m = this.r;
            cVar.n = this.s;
            cVar.o = this.t;
            cVar.p = this.f139259c;
            cVar.q = this.f139257a;
            cVar.r = this.f139258b;
            return new b(this.v, cVar);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context);
            l.d(context, "");
        }
    }

    public final void setConfig(c cVar) {
        l.d(cVar, "");
        this.f139256d = cVar;
    }

    public final void setEnableUI(boolean z) {
        a(z, false);
    }

    private final void setIconEnableUi(boolean z) {
        if (z) {
            getImageView().clearColorFilter();
        } else {
            getImageView().setColorFilter(R.color.d9, PorterDuff.Mode.DST_IN);
        }
    }

    @Override // com.ss.android.ugc.tools.view.widget.c.a
    public final View a(Context context) {
        l.d(context, "");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.ss.android.ugc.aweme.dependence.beauty.a.a.a(context), -2);
        StyleTextView styleTextView = new StyleTextView(context);
        styleTextView.setLayoutParams(layoutParams);
        styleTextView.setGravity(17);
        return styleTextView;
    }

    public final void setTextEnableUi(boolean z) {
        Resources resources;
        int i2;
        if (z) {
            resources = getResources();
            i2 = this.f139256d.r;
        } else {
            resources = getResources();
            i2 = R.color.d9;
        }
        int color = resources.getColor(i2);
        TextView textView = getTextView();
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    @Override // com.ss.android.ugc.tools.view.widget.c.a
    public final void a(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        if (z) {
            View dotView = getDotView();
            if (dotView != null) {
                layoutParams = dotView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = 81;
            Context context = getContext();
            l.b(context, "");
            layoutParams2.topMargin = (int) r.a(context, (float) this.f139256d.p);
            View dotView2 = getDotView();
            if (dotView2 != null) {
                dotView2.setLayoutParams(layoutParams2);
            }
        }
        super.a(z);
    }

    @Override // com.ss.android.ugc.tools.view.widget.c.a
    public final View b(Context context) {
        MethodCollector.i(12081);
        l.d(context, "");
        int a2 = (int) r.a(context, 4.0f);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(a2, a2);
        View view = new View(context);
        view.setLayoutParams(layoutParams);
        MethodCollector.o(12081);
        return view;
    }

    @Override // com.ss.android.ugc.tools.view.widget.c.a
    public final void setCustomSelected(boolean z) {
        Resources resources;
        int i2;
        super.setCustomSelected(z);
        if (z) {
            resources = getResources();
            i2 = this.f139256d.f139268i;
        } else {
            resources = getResources();
            i2 = this.f139256d.r;
        }
        int color = resources.getColor(i2);
        TextView textView = getTextView();
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public final void a(boolean z, boolean z2) {
        setIconEnableUi(z);
        b(z2, z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, c cVar) {
        super(context, cVar.f139260a, cVar.f139261b, cVar.f139262c, cVar.f139263d, cVar.f139264e, cVar.f139265f, cVar.f139266g, cVar.f139267h, cVar.f139268i, cVar.f139269j, cVar.f139270k, cVar.f139271l, cVar.f139272m, cVar.n, cVar.o);
        l.d(context, "");
        l.d(cVar, "");
        this.f139256d = cVar;
        View findViewById = findViewById(R.id.bwi);
        l.b(findViewById, "");
        this.f139255a = (ImageView) findViewById;
    }

    private final void b(boolean z, boolean z2) {
        int color;
        if (z) {
            if (z2) {
                color = getResources().getColor(this.f139256d.q);
            }
            color = getResources().getColor(R.color.d9);
        } else {
            if (z2) {
                color = getResources().getColor(this.f139256d.n);
            }
            color = getResources().getColor(R.color.d9);
        }
        View dotView = getDotView();
        if (dotView != null) {
            com.ss.android.ugc.tools.view.style.b b2 = b.a.a().a(1).b(color);
            Context context = getContext();
            l.b(context, "");
            dotView.setBackground(b2.a(color, (int) r.a(context, (float) this.f139256d.o)).a());
        }
    }
}
