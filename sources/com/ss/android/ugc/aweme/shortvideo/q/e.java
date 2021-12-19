package com.ss.android.ugc.aweme.shortvideo.q;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cz.a.j;
import com.ss.android.ugc.aweme.cz.a.k;
import com.ss.android.ugc.aweme.cz.a.l;
import com.ss.android.ugc.aweme.da.e;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class e implements View.OnClickListener {
    public static final a x = new a((byte) 0);
    private AVDmtTextView A;
    private View B;
    private com.ss.android.ugc.aweme.filter.a C;
    private int D;
    private FrameLayout E;
    private final h.f.a.a<String> F;

    /* renamed from: a  reason: collision with root package name */
    public androidx.appcompat.app.d f129943a;

    /* renamed from: b  reason: collision with root package name */
    public FrameLayout f129944b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.tools.view.a.c f129945c;

    /* renamed from: d  reason: collision with root package name */
    public List<String> f129946d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.cz.a.g f129947e;

    /* renamed from: f  reason: collision with root package name */
    public aa.d f129948f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f129949g;

    /* renamed from: h  reason: collision with root package name */
    public l f129950h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f129951i;

    /* renamed from: j  reason: collision with root package name */
    public b f129952j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f129953k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f129954l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f129955m;
    public FrameLayout n;
    public View o;
    public com.ss.android.ugc.aweme.da.e p;
    public ViewGroup q;
    public k r;
    public j s;
    public com.ss.android.ugc.asve.editor.g t;
    public com.ss.android.ugc.aweme.shortvideo.c u;
    public int v;
    public f w;
    private final com.ss.android.ugc.tools.view.a.a y;
    private AVDmtTextView z;

    public interface b {
        static {
            Covode.recordClassIndex(85283);
        }

        void a();

        void a(String str, com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z);

        void a(boolean z, com.ss.android.ugc.aweme.shortvideo.c cVar);

        void b();

        void d();

        void e();

        void f();
    }

    static {
        Covode.recordClassIndex(85280);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85282);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.q.e$e  reason: collision with other inner class name */
    public static final class C3385e implements com.ss.android.ugc.aweme.cz.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f129959a;

        static {
            Covode.recordClassIndex(85286);
        }

        @Override // com.ss.android.ugc.aweme.cz.a.a
        public final void a() {
            this.f129959a.d();
        }

        @Override // com.ss.android.ugc.aweme.cz.a.a
        public final boolean b() {
            return this.f129959a.f129951i;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3385e(e eVar) {
            this.f129959a = eVar;
        }
    }

    public /* synthetic */ e() {
        this(AnonymousClass1.f129956a);
    }

    public final void b() {
        aa.d dVar = this.f129948f;
        if (dVar != null) {
            dVar.c();
        }
    }

    public static final class c extends e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f129957a;

        static {
            Covode.recordClassIndex(85284);
        }

        @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
        public final void a() {
            this.f129957a.f129953k = true;
            com.ss.android.ugc.aweme.da.e eVar = this.f129957a.p;
            if (eVar != null) {
                eVar.a();
            }
        }

        @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
        public final void b() {
            aa.d dVar = this.f129957a.f129948f;
            if (dVar != null) {
                dVar.d();
            }
            com.ss.android.ugc.aweme.da.e eVar = this.f129957a.p;
            if (eVar != null) {
                eVar.b();
            }
        }

        @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
        public final void c() {
            com.ss.android.ugc.aweme.da.e eVar = this.f129957a.p;
            if (eVar != null) {
                eVar.c();
            }
            aa.d dVar = this.f129957a.f129948f;
            if (dVar != null) {
                dVar.a();
            }
            this.f129957a.f129954l = true;
        }

        @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
        public final void d() {
            this.f129957a.f129953k = false;
            com.ss.android.ugc.aweme.da.e eVar = this.f129957a.p;
            if (eVar != null) {
                eVar.d();
            }
            this.f129957a.f129954l = false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(e eVar) {
            this.f129957a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
        public final void b(float f2, int i2, int i3) {
            com.ss.android.ugc.aweme.da.e eVar = this.f129957a.p;
            if (eVar != null) {
                eVar.b(f2, i2, i3);
            }
        }

        @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
        public final void a(float f2, int i2, int i3) {
            com.ss.android.ugc.aweme.da.e eVar = this.f129957a.p;
            if (eVar != null) {
                eVar.a(f2, i2, i3);
            }
        }
    }

    public static final class f implements com.ss.android.ugc.aweme.cz.a.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f129960a;

        static {
            Covode.recordClassIndex(85287);
        }

        @Override // com.ss.android.ugc.aweme.cz.a.h
        public final void a() {
            b bVar = this.f129960a.f129952j;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // com.ss.android.ugc.aweme.cz.a.h
        public final void b() {
            b bVar = this.f129960a.f129952j;
            if (bVar != null) {
                bVar.e();
            }
        }

        @Override // com.ss.android.ugc.aweme.cz.a.h
        public final void c() {
            b bVar = this.f129960a.f129952j;
            if (bVar != null) {
                bVar.f();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(e eVar) {
            this.f129960a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.cz.a.h
        public final void a(boolean z, com.ss.android.ugc.aweme.shortvideo.c cVar) {
            b bVar = this.f129960a.f129952j;
            if (bVar != null) {
                bVar.a(z, cVar);
            }
        }

        @Override // com.ss.android.ugc.aweme.cz.a.h
        public final void a(String str, com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z) {
            b bVar = this.f129960a.f129952j;
            if (bVar != null) {
                bVar.a(str, cVar, z);
            }
        }
    }

    public static final class h extends com.ss.android.ugc.aweme.da.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f129962a;

        static {
            Covode.recordClassIndex(85289);
        }

        @Override // com.ss.android.ugc.aweme.da.c, com.ss.android.ugc.aweme.da.b
        public final void a() {
            View view = this.f129962a.o;
            if (view != null) {
                view.setVisibility(0);
            }
            super.a();
        }

        h(e eVar) {
            this.f129962a = eVar;
        }
    }

    public final int e() {
        aa.d dVar = this.f129948f;
        if (dVar != null) {
            return dVar.e();
        }
        return 0;
    }

    public static int a() {
        Integer b2 = com.ss.android.ugc.aweme.port.in.l.f115658a.b().k().a().b();
        if (b2 != null) {
            return b2.intValue();
        }
        return 0;
    }

    public final void d() {
        com.ss.android.ugc.aweme.filter.a aVar;
        if (!this.f129954l && (aVar = this.C) != null) {
            aVar.b(new com.ss.android.ugc.aweme.da.b());
        }
        com.ss.android.ugc.tools.view.a.c cVar = this.f129945c;
        if (cVar != null) {
            cVar.c(this.y);
        }
        f fVar = this.w;
        if (fVar != null) {
            fVar.a(false);
        }
    }

    public final void c() {
        MethodCollector.i(3404);
        FrameLayout frameLayout = this.f129944b;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            androidx.appcompat.app.d dVar = this.f129943a;
            if (dVar == null) {
                h.f.b.l.a("mActivity");
            }
            if (this.o == null) {
                View a2 = com.a.a(LayoutInflater.from(dVar), R.layout.e0, frameLayout, false);
                this.o = a2;
                if (a2 == null) {
                    h.f.b.l.b();
                }
                this.B = a2.findViewById(R.id.cpv);
                View view = this.o;
                if (view == null) {
                    h.f.b.l.b();
                }
                view.findViewById(R.id.cre).setOnClickListener(new d(this));
                View view2 = this.o;
                if (view2 == null) {
                    h.f.b.l.b();
                }
                this.n = (FrameLayout) view2.findViewById(R.id.b5e);
                View view3 = this.o;
                if (view3 == null) {
                    h.f.b.l.b();
                }
                this.A = (AVDmtTextView) view3.findViewById(R.id.fa3);
                View view4 = this.o;
                if (view4 == null) {
                    h.f.b.l.b();
                }
                this.z = (AVDmtTextView) view4.findViewById(R.id.fa5);
                View view5 = this.o;
                if (view5 == null) {
                    h.f.b.l.b();
                }
                this.q = (ViewGroup) view5.findViewById(R.id.cen);
                View view6 = this.o;
                if (view6 == null) {
                    h.f.b.l.b();
                }
                this.E = (FrameLayout) view6.findViewById(R.id.dph);
                AVDmtTextView aVDmtTextView = this.z;
                if (aVDmtTextView == null) {
                    h.f.b.l.b();
                }
                aVDmtTextView.setOnClickListener(this);
                AVDmtTextView aVDmtTextView2 = this.A;
                if (aVDmtTextView2 == null) {
                    h.f.b.l.b();
                }
                aVDmtTextView2.setOnClickListener(this);
                aa b2 = com.ss.android.ugc.aweme.port.in.l.f115658a.b();
                androidx.appcompat.app.d dVar2 = this.f129943a;
                if (dVar2 == null) {
                    h.f.b.l.a("mActivity");
                }
                aa.d a3 = b2.a(dVar2, this.t, new C3385e(this), this.f129949g, this.v, this.F);
                this.f129948f = a3;
                if (a3 != null) {
                    a3.a(this.f129946d);
                }
                aa.d dVar3 = this.f129948f;
                if (dVar3 != null) {
                    dVar3.a(this.f129947e);
                }
                aa.d dVar4 = this.f129948f;
                if (dVar4 != null) {
                    dVar4.a(this.f129950h);
                }
                aa.d dVar5 = this.f129948f;
                if (dVar5 != null) {
                    dVar5.a(this.r);
                }
                aa.d dVar6 = this.f129948f;
                if (dVar6 != null) {
                    dVar6.a(this.s);
                }
                aa.d dVar7 = this.f129948f;
                if (dVar7 != null) {
                    dVar7.a(new f(this));
                }
                aa.d dVar8 = this.f129948f;
                if (dVar8 != null) {
                    androidx.appcompat.app.d dVar9 = this.f129943a;
                    if (dVar9 == null) {
                        h.f.b.l.a("mActivity");
                    }
                    dVar8.a(dVar9, this.E);
                }
                View view7 = this.o;
                if (view7 == null) {
                    h.f.b.l.b();
                }
                View view8 = this.B;
                if (view8 == null) {
                    h.f.b.l.b();
                }
                com.ss.android.ugc.aweme.filter.a aVar = new com.ss.android.ugc.aweme.filter.a(frameLayout, view7, view8);
                this.C = aVar;
                aVar.f95467a = new c(this);
                a(1, false);
            } else {
                aa.d dVar10 = this.f129948f;
                if (dVar10 != null) {
                    androidx.appcompat.app.d dVar11 = this.f129943a;
                    if (dVar11 == null) {
                        h.f.b.l.a("mActivity");
                    }
                    dVar10.a(dVar11, this.E);
                }
            }
            View view9 = this.o;
            if (view9 != null) {
                view9.setVisibility(4);
            }
            com.ss.android.ugc.aweme.filter.a aVar2 = this.C;
            if (aVar2 != null) {
                aVar2.a(new h(this));
            }
            com.ss.android.ugc.tools.view.a.c cVar = this.f129945c;
            if (cVar != null) {
                cVar.b(this.y);
            }
        }
        f fVar = this.w;
        if (fVar != null) {
            fVar.a(true);
            MethodCollector.o(3404);
            return;
        }
        MethodCollector.o(3404);
    }

    public final void a(androidx.appcompat.app.d dVar) {
        h.f.b.l.d(dVar, "");
        this.f129943a = dVar;
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f129958a;

        static {
            Covode.recordClassIndex(85285);
        }

        d(e eVar) {
            this.f129958a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f129958a.d();
        }
    }

    public final void a(com.ss.android.ugc.aweme.da.e eVar) {
        h.f.b.l.d(eVar, "");
        this.p = eVar;
    }

    public e(h.f.a.a<String> aVar) {
        h.f.b.l.d(aVar, "");
        this.F = aVar;
        this.y = new g(this);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        h.f.b.l.d(view, "");
        int id = view.getId();
        if (id == R.id.fa3) {
            a(1, true);
        } else if (id == R.id.fa5) {
            a(2, true);
        }
    }

    public final com.ss.android.ugc.aweme.shortvideo.c a(int i2) {
        if (e() == 1) {
            aa.d dVar = this.f129948f;
            if (dVar != null) {
                return dVar.a(i2);
            }
            return null;
        }
        aa.d dVar2 = this.f129948f;
        if (dVar2 != null) {
            return dVar2.b(i2);
        }
        return null;
    }

    static final class g implements com.ss.android.ugc.tools.view.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f129961a;

        static {
            Covode.recordClassIndex(85288);
        }

        g(e eVar) {
            this.f129961a = eVar;
        }

        @Override // com.ss.android.ugc.tools.view.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            if (i2 != 4) {
                return false;
            }
            this.f129961a.d();
            return true;
        }
    }

    public final void a(int i2, boolean z2) {
        if (this.o != null && i2 != this.D) {
            this.D = i2;
            if (i2 == 1) {
                AVDmtTextView aVDmtTextView = this.A;
                if (aVDmtTextView != null) {
                    aVDmtTextView.setSelected(true);
                }
                AVDmtTextView aVDmtTextView2 = this.z;
                if (aVDmtTextView2 != null) {
                    aVDmtTextView2.setSelected(false);
                }
                ViewGroup viewGroup = this.q;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                FrameLayout frameLayout = this.E;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                AVDmtTextView aVDmtTextView3 = this.A;
                if (aVDmtTextView3 != null) {
                    aVDmtTextView3.setSelected(false);
                }
                AVDmtTextView aVDmtTextView4 = this.z;
                if (aVDmtTextView4 != null) {
                    aVDmtTextView4.setSelected(true);
                }
                ViewGroup viewGroup2 = this.q;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                FrameLayout frameLayout2 = this.E;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
            }
            if (z2) {
                if (this.D == 2) {
                    b bVar = this.f129952j;
                    if (bVar != null) {
                        bVar.b();
                        return;
                    }
                    return;
                }
                b bVar2 = this.f129952j;
                if (bVar2 != null) {
                    bVar2.d();
                }
            }
        }
    }
}
