package com.ss.android.ugc.gamora.recorder.m;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.als.h;
import com.bytedance.als.k;
import com.bytedance.als.l;
import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.ae;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.util.bh;
import com.ss.android.ugc.aweme.shortvideo.widget.ScrollableLinearLayout;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.aweme.shortvideo.widget.n;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class e extends com.bytedance.scene.group.b implements com.bytedance.o.a {

    /* renamed from: j  reason: collision with root package name */
    public static final a f148078j = new a((byte) 0);
    private final String A;
    private final boolean B;
    private final com.bytedance.als.d<Integer> C;

    /* renamed from: b  reason: collision with root package name */
    public TabHost f148079b;

    /* renamed from: c  reason: collision with root package name */
    public ScrollableLinearLayout f148080c;

    /* renamed from: d  reason: collision with root package name */
    public View f148081d;

    /* renamed from: e  reason: collision with root package name */
    public int f148082e = en.a(40.0d, i.f115645a);

    /* renamed from: f  reason: collision with root package name */
    final Set<String> f148083f = new LinkedHashSet();

    /* renamed from: g  reason: collision with root package name */
    final com.ss.android.ugc.gamora.recorder.h.a f148084g = new com.ss.android.ugc.gamora.recorder.h.a();

    /* renamed from: h  reason: collision with root package name */
    final Map<Integer, View> f148085h = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    public final k<com.ss.android.ugc.gamora.recorder.b.c> f148086i;

    /* renamed from: k  reason: collision with root package name */
    private final int f148087k;

    /* renamed from: l  reason: collision with root package name */
    private final int f148088l;
    private final int t;
    private final int u;
    private final com.bytedance.o.f v;
    private final l<Integer> w;
    private final h<Boolean> x;
    private final h<z> y;
    private final com.bytedance.als.g<f> z;

    static {
        Covode.recordClassIndex(97612);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97613);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.v;
    }

    public final TabHost E() {
        TabHost tabHost = this.f148079b;
        if (tabHost == null) {
            h.f.b.l.a("tabHost");
        }
        return tabHost;
    }

    static final class b implements TabHost.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f148089a;

        static {
            Covode.recordClassIndex(97614);
        }

        b(e eVar) {
            this.f148089a = eVar;
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TextView f148090a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f148091b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f148092c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f148093d;

            static {
                Covode.recordClassIndex(97615);
            }

            a(TextView textView, b bVar, int i2, int i3) {
                this.f148090a = textView;
                this.f148091b = bVar;
                this.f148092c = i2;
                this.f148093d = i3;
            }

            public final void run() {
                ViewGroup.LayoutParams layoutParams = e.c(this.f148091b.f148089a).getLayoutParams();
                layoutParams.width = this.f148090a.getWidth();
                e.c(this.f148091b.f148089a).setLayoutParams(layoutParams);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.TabHost.a
        public final void a(Object obj, int i2, int i3, boolean z, boolean z2) {
            TextView textView;
            Object a2 = e.a(this.f148089a).a(i2);
            if (a2 == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.gamora.recorder.b.c cVar = new com.ss.android.ugc.gamora.recorder.b.c(obj, a2, i3, false, z2, 8);
            cVar.f147369a = z;
            this.f148089a.f148086i.a(cVar);
            int childCount = e.b(this.f148089a).getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = e.b(this.f148089a).getChildAt(i4);
                if (!(childAt instanceof n)) {
                    childAt = null;
                }
                n nVar = (n) childAt;
                if (!(nVar == null || (textView = nVar.getTextView()) == null)) {
                    if (i4 == i2) {
                        textView.setShadowLayer(8.0f, 0.0f, 1.0f, Color.parseColor("#80000000"));
                        textView.post(new a(textView, this, i4, i2));
                    } else {
                        textView.setShadowLayer(8.0f, 0.0f, 1.0f, Color.parseColor("#40000000"));
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.e$e  reason: collision with other inner class name */
    static final class C3993e<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f148096a;

        static {
            Covode.recordClassIndex(97618);
        }

        C3993e(e eVar) {
            this.f148096a = eVar;
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.m.e$e$a */
        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TextView f148097a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C3993e f148098b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f148099c;

            static {
                Covode.recordClassIndex(97619);
            }

            a(TextView textView, C3993e eVar, int i2) {
                this.f148097a = textView;
                this.f148098b = eVar;
                this.f148099c = i2;
            }

            public final void run() {
                ViewGroup.LayoutParams layoutParams = e.c(this.f148098b.f148096a).getLayoutParams();
                layoutParams.width = this.f148097a.getWidth();
                e.c(this.f148098b.f148096a).setLayoutParams(layoutParams);
            }
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            TextView textView;
            String str;
            int childCount = e.b(this.f148096a).getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = e.b(this.f148096a).getChildAt(i2);
                if (!(childAt instanceof n)) {
                    childAt = null;
                }
                n nVar = (n) childAt;
                if (!(nVar == null || (textView = nVar.getTextView()) == null)) {
                    if (e.a(this.f148096a).getCurrentIndex() == i2) {
                        str = "#80000000";
                    } else {
                        str = "#40000000";
                    }
                    d.a(textView, Color.parseColor("#00000000"), Color.parseColor(str));
                    if (e.a(this.f148096a).getCurrentIndex() == i2) {
                        textView.post(new a(textView, this, i2));
                    }
                }
            }
        }
    }

    private final n F() {
        ScrollableLinearLayout scrollableLinearLayout = this.f148080c;
        if (scrollableLinearLayout == null) {
            h.f.b.l.a("tabContainer");
        }
        n nVar = new n(scrollableLinearLayout.getContext());
        nVar.b();
        return nVar;
    }

    public static final /* synthetic */ TabHost a(e eVar) {
        TabHost tabHost = eVar.f148079b;
        if (tabHost == null) {
            h.f.b.l.a("tabHost");
        }
        return tabHost;
    }

    public static final /* synthetic */ ScrollableLinearLayout b(e eVar) {
        ScrollableLinearLayout scrollableLinearLayout = eVar.f148080c;
        if (scrollableLinearLayout == null) {
            h.f.b.l.a("tabContainer");
        }
        return scrollableLinearLayout;
    }

    public static final /* synthetic */ View c(e eVar) {
        View view = eVar.f148081d;
        if (view == null) {
            h.f.b.l.a("selectedBg");
        }
        return view;
    }

    static final class c<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f148094a;

        static {
            Covode.recordClassIndex(97616);
        }

        c(e eVar) {
            this.f148094a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            TabHost a2 = e.a(this.f148094a);
            h.f.b.l.b(num, "");
            a2.setVisibility(num.intValue());
        }
    }

    static final class g<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f148101a;

        static {
            Covode.recordClassIndex(97621);
        }

        g(e eVar) {
            this.f148101a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            e eVar = this.f148101a;
            h.f.b.l.b(num, "");
            int intValue = num.intValue();
            View view = eVar.n;
            if (view != null) {
                view.setTranslationY((float) intValue);
            }
        }
    }

    static final class d<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f148095a;

        static {
            Covode.recordClassIndex(97617);
        }

        d(e eVar) {
            this.f148095a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = en.a(33.0d, i.f115645a) + this.f148095a.f148082e;
            } else {
                i2 = this.f148095a.f148082e;
            }
            ViewGroup.LayoutParams layoutParams = e.a(this.f148095a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i2 + ((int) com.bytedance.common.utility.n.b(this.f148095a.f42913m, 100.0f)) + ((int) com.bytedance.common.utility.n.b(this.f148095a.f42913m, -12.5f));
            e.a(this.f148095a).setLayoutParams(layoutParams2);
        }
    }

    static final class f<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f148100a;

        static {
            Covode.recordClassIndex(97620);
        }

        f(e eVar) {
            this.f148100a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Set b2;
            f fVar = (f) obj;
            if (fVar.f148102a) {
                e eVar = this.f148100a;
                TabHost tabHost = eVar.f148079b;
                if (tabHost == null) {
                    h.f.b.l.a("tabHost");
                }
                bh.a(tabHost, eVar.f148083f, eVar.f148085h);
                return;
            }
            e eVar2 = this.f148100a;
            Set<String> set = fVar.f148103b;
            TabHost tabHost2 = eVar2.f148079b;
            if (tabHost2 == null) {
                h.f.b.l.a("tabHost");
            }
            ScrollableLinearLayout scrollableLinearLayout = eVar2.f148080c;
            if (scrollableLinearLayout == null) {
                h.f.b.l.a("tabContainer");
            }
            bh.a(set, tabHost2, scrollableLinearLayout, eVar2.f148083f, eVar2.f148085h);
            e eVar3 = this.f148100a;
            Set<String> set2 = fVar.f148103b;
            if (set2 != null && (b2 = h.a.n.b((Iterable) set2, (Iterable) eVar3.f148083f)) != null && b2.size() >= 2 && !eVar3.f148084g.a()) {
                ScrollableLinearLayout scrollableLinearLayout2 = eVar3.f148080c;
                if (scrollableLinearLayout2 == null) {
                    h.f.b.l.a("tabContainer");
                }
                View a2 = bh.a(scrollableLinearLayout2, b2);
                Activity activity = eVar3.f42913m;
                if (activity != null && !activity.isFinishing() && a2 != null) {
                    ScrollableLinearLayout scrollableLinearLayout3 = eVar3.f148080c;
                    if (scrollableLinearLayout3 == null) {
                        h.f.b.l.a("tabContainer");
                    }
                    Context context = scrollableLinearLayout3.getContext();
                    h.f.b.l.b(context, "");
                    Activity a3 = com.ss.android.ugc.aweme.scene.a.a(context);
                    if (a3 == null) {
                        h.f.b.l.b();
                    }
                    ((com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(a3).b(a2).a(com.bytedance.tux.tooltip.h.TOP)).e(R.string.aaw).a(5000L).d().a();
                    eVar3.f148084g.b();
                }
            }
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i2;
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.ahw, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a2;
        View findViewById = viewGroup2.findViewById(R.id.e8m);
        h.f.b.l.b(findViewById, "");
        TabHost tabHost = (TabHost) findViewById;
        this.f148079b = tabHost;
        if (tabHost == null) {
            h.f.b.l.a("tabHost");
        }
        View findViewById2 = tabHost.findViewById(R.id.ad7);
        h.f.b.l.b(findViewById2, "");
        this.f148080c = (ScrollableLinearLayout) findViewById2;
        TabHost tabHost2 = this.f148079b;
        if (tabHost2 == null) {
            h.f.b.l.a("tabHost");
        }
        View findViewById3 = tabHost2.findViewById(R.id.e8l);
        h.f.b.l.b(findViewById3, "");
        this.f148081d = findViewById3;
        int i3 = this.f148087k;
        if (i3 >= 0) {
            String string = i.f115645a.getString(R.string.gff);
            h.f.b.l.b(string, "");
            a(i3, string, ae.f124885c);
        }
        int i4 = this.f148088l;
        String string2 = i.f115645a.getString(R.string.f9r);
        h.f.b.l.b(string2, "");
        a(i4, string2, ae.f124884b);
        int i5 = this.t;
        String string3 = i.f115645a.getString(R.string.f9q);
        h.f.b.l.b(string3, "");
        a(i5, string3, ae.f124883a);
        int i6 = this.u;
        if (i6 >= 0) {
            String string4 = i.f115645a.getString(R.string.g91);
            h.f.b.l.b(string4, "");
            a(i6, string4, "RecordCombinePhoto");
        }
        TabHost tabHost3 = this.f148079b;
        if (tabHost3 == null) {
            h.f.b.l.a("tabHost");
        }
        tabHost3.setOnIndexChangedListener(new b(this));
        String str = this.A;
        if (h.f.b.l.a((Object) str, (Object) ae.f124885c)) {
            i2 = this.f148087k;
            if (i2 < 0) {
                i2 = this.t;
            }
        } else if (h.f.b.l.a((Object) str, (Object) ae.f124884b)) {
            i2 = this.f148088l;
        } else {
            i2 = this.t;
        }
        TabHost tabHost4 = this.f148079b;
        if (tabHost4 == null) {
            h.f.b.l.a("tabHost");
        }
        tabHost4.a(i2, true, true);
        this.w.a(this, new c(this));
        h<Boolean> hVar = this.x;
        if (hVar != null) {
            hVar.a(this, new d(this));
        }
        h<z> hVar2 = this.y;
        if (hVar2 != null) {
            hVar2.a(this, new C3993e(this));
        }
        com.bytedance.als.g<f> gVar = this.z;
        if (gVar != null) {
            gVar.a(this, new f(this));
        }
        this.C.a(this, new g(this));
        return viewGroup2;
    }

    private final void a(int i2, String str, String str2) {
        n F = F();
        F.setText(str);
        F.setTag(str2);
        F.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        ScrollableLinearLayout scrollableLinearLayout = this.f148080c;
        if (scrollableLinearLayout == null) {
            h.f.b.l.a("tabContainer");
        }
        scrollableLinearLayout.addView(F, i2);
        this.f148083f.add(str2);
    }

    public e(com.bytedance.o.f fVar, k<com.ss.android.ugc.gamora.recorder.b.c> kVar, l<Integer> lVar, h<Boolean> hVar, h<z> hVar2, com.bytedance.als.g<f> gVar, String str, boolean z2, boolean z3, com.bytedance.als.d<Integer> dVar) {
        int i2;
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(dVar, "");
        this.v = fVar;
        this.f148086i = kVar;
        this.w = lVar;
        this.x = hVar;
        this.y = hVar2;
        this.z = gVar;
        this.A = str;
        this.B = z2;
        this.C = dVar;
        int i3 = -1;
        if (z2) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        this.f148087k = i2;
        this.f148088l = i2 + 1;
        int i4 = i2 + 2;
        this.t = i4;
        this.u = z3 ? i4 + 1 : i3;
    }
}
