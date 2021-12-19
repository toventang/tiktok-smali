package com.ss.android.ugc.aweme.ttep.ttepcomponent.b;

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

public final class b extends com.bytedance.scene.group.b implements com.bytedance.o.a {

    /* renamed from: j  reason: collision with root package name */
    public static final a f141413j = new a((byte) 0);
    private final boolean A;
    private final com.bytedance.als.d<Integer> B;

    /* renamed from: b  reason: collision with root package name */
    public TabHost f141414b;

    /* renamed from: c  reason: collision with root package name */
    public ScrollableLinearLayout f141415c;

    /* renamed from: d  reason: collision with root package name */
    public View f141416d;

    /* renamed from: e  reason: collision with root package name */
    public int f141417e = en.a(40.0d, i.f115645a);

    /* renamed from: f  reason: collision with root package name */
    final Set<String> f141418f = new LinkedHashSet();

    /* renamed from: g  reason: collision with root package name */
    final com.ss.android.ugc.gamora.recorder.h.a f141419g = new com.ss.android.ugc.gamora.recorder.h.a();

    /* renamed from: h  reason: collision with root package name */
    final Map<Integer, View> f141420h = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    public final k<com.ss.android.ugc.gamora.recorder.b.c> f141421i;

    /* renamed from: k  reason: collision with root package name */
    private final int f141422k;

    /* renamed from: l  reason: collision with root package name */
    private final int f141423l;
    private final int t;
    private final com.bytedance.o.f u;
    private final l<Integer> v;
    private final h<Boolean> w;
    private final h<z> x;
    private final com.bytedance.als.g<c> y;
    private final String z;

    static {
        Covode.recordClassIndex(92359);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92360);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.u;
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.b.b$b  reason: collision with other inner class name */
    static final class C3750b implements TabHost.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f141424a;

        static {
            Covode.recordClassIndex(92361);
        }

        C3750b(b bVar) {
            this.f141424a = bVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.b.b$b$a */
        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TextView f141425a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C3750b f141426b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f141427c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f141428d;

            static {
                Covode.recordClassIndex(92362);
            }

            a(TextView textView, C3750b bVar, int i2, int i3) {
                this.f141425a = textView;
                this.f141426b = bVar;
                this.f141427c = i2;
                this.f141428d = i3;
            }

            public final void run() {
                ViewGroup.LayoutParams layoutParams = b.c(this.f141426b.f141424a).getLayoutParams();
                layoutParams.width = this.f141425a.getWidth();
                b.c(this.f141426b.f141424a).setLayoutParams(layoutParams);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.TabHost.a
        public final void a(Object obj, int i2, int i3, boolean z, boolean z2) {
            TextView textView;
            Object a2 = b.a(this.f141424a).a(i2);
            if (a2 == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.gamora.recorder.b.c cVar = new com.ss.android.ugc.gamora.recorder.b.c(obj, a2, i3, z2, false, 16);
            cVar.f147369a = z;
            this.f141424a.f141421i.a(cVar);
            int childCount = b.b(this.f141424a).getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = b.b(this.f141424a).getChildAt(i4);
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

    static final class e<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f141431a;

        static {
            Covode.recordClassIndex(92365);
        }

        e(b bVar) {
            this.f141431a = bVar;
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TextView f141432a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f141433b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f141434c;

            static {
                Covode.recordClassIndex(92366);
            }

            a(TextView textView, e eVar, int i2) {
                this.f141432a = textView;
                this.f141433b = eVar;
                this.f141434c = i2;
            }

            public final void run() {
                ViewGroup.LayoutParams layoutParams = b.c(this.f141433b.f141431a).getLayoutParams();
                layoutParams.width = this.f141432a.getWidth();
                b.c(this.f141433b.f141431a).setLayoutParams(layoutParams);
            }
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            TextView textView;
            String str;
            int childCount = b.b(this.f141431a).getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = b.b(this.f141431a).getChildAt(i2);
                if (!(childAt instanceof n)) {
                    childAt = null;
                }
                n nVar = (n) childAt;
                if (!(nVar == null || (textView = nVar.getTextView()) == null)) {
                    if (b.a(this.f141431a).getCurrentIndex() == i2) {
                        str = "#80000000";
                    } else {
                        str = "#40000000";
                    }
                    com.ss.android.ugc.gamora.recorder.m.d.a(textView, Color.parseColor("#00000000"), Color.parseColor(str));
                    if (b.a(this.f141431a).getCurrentIndex() == i2) {
                        textView.post(new a(textView, this, i2));
                    }
                }
            }
        }
    }

    private final n E() {
        ScrollableLinearLayout scrollableLinearLayout = this.f141415c;
        if (scrollableLinearLayout == null) {
            h.f.b.l.a("tabContainer");
        }
        n nVar = new n(scrollableLinearLayout.getContext());
        nVar.b();
        return nVar;
    }

    public static final /* synthetic */ TabHost a(b bVar) {
        TabHost tabHost = bVar.f141414b;
        if (tabHost == null) {
            h.f.b.l.a("tabHost");
        }
        return tabHost;
    }

    public static final /* synthetic */ ScrollableLinearLayout b(b bVar) {
        ScrollableLinearLayout scrollableLinearLayout = bVar.f141415c;
        if (scrollableLinearLayout == null) {
            h.f.b.l.a("tabContainer");
        }
        return scrollableLinearLayout;
    }

    public static final /* synthetic */ View c(b bVar) {
        View view = bVar.f141416d;
        if (view == null) {
            h.f.b.l.a("selectedBg");
        }
        return view;
    }

    static final class c<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f141429a;

        static {
            Covode.recordClassIndex(92363);
        }

        c(b bVar) {
            this.f141429a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            TabHost a2 = b.a(this.f141429a);
            h.f.b.l.b(num, "");
            a2.setVisibility(num.intValue());
        }
    }

    static final class g<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f141436a;

        static {
            Covode.recordClassIndex(92368);
        }

        g(b bVar) {
            this.f141436a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            b bVar = this.f141436a;
            h.f.b.l.b(num, "");
            int intValue = num.intValue();
            View view = bVar.n;
            if (view != null) {
                view.setTranslationY((float) intValue);
            }
        }
    }

    static final class d<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f141430a;

        static {
            Covode.recordClassIndex(92364);
        }

        d(b bVar) {
            this.f141430a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = en.a(33.0d, i.f115645a) + this.f141430a.f141417e;
            } else {
                i2 = this.f141430a.f141417e;
            }
            ViewGroup.LayoutParams layoutParams = b.a(this.f141430a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i2 + ((int) com.bytedance.common.utility.n.b(this.f141430a.f42913m, 100.0f)) + ((int) com.bytedance.common.utility.n.b(this.f141430a.f42913m, -12.5f));
            b.a(this.f141430a).setLayoutParams(layoutParams2);
        }
    }

    static final class f<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f141435a;

        static {
            Covode.recordClassIndex(92367);
        }

        f(b bVar) {
            this.f141435a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Set b2;
            c cVar = (c) obj;
            if (cVar.f141437a) {
                b bVar = this.f141435a;
                TabHost tabHost = bVar.f141414b;
                if (tabHost == null) {
                    h.f.b.l.a("tabHost");
                }
                bh.a(tabHost, bVar.f141418f, bVar.f141420h);
                return;
            }
            b bVar2 = this.f141435a;
            Set<String> set = cVar.f141438b;
            TabHost tabHost2 = bVar2.f141414b;
            if (tabHost2 == null) {
                h.f.b.l.a("tabHost");
            }
            ScrollableLinearLayout scrollableLinearLayout = bVar2.f141415c;
            if (scrollableLinearLayout == null) {
                h.f.b.l.a("tabContainer");
            }
            bh.a(set, tabHost2, scrollableLinearLayout, bVar2.f141418f, bVar2.f141420h);
            b bVar3 = this.f141435a;
            Set<String> set2 = cVar.f141438b;
            if (set2 != null && (b2 = h.a.n.b((Iterable) set2, (Iterable) bVar3.f141418f)) != null && b2.size() >= 2 && !bVar3.f141419g.a()) {
                ScrollableLinearLayout scrollableLinearLayout2 = bVar3.f141415c;
                if (scrollableLinearLayout2 == null) {
                    h.f.b.l.a("tabContainer");
                }
                View a2 = bh.a(scrollableLinearLayout2, b2);
                Activity activity = bVar3.f42913m;
                if (activity != null && !activity.isFinishing() && a2 != null) {
                    ScrollableLinearLayout scrollableLinearLayout3 = bVar3.f141415c;
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
                    bVar3.f141419g.b();
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
        this.f141414b = tabHost;
        if (tabHost == null) {
            h.f.b.l.a("tabHost");
        }
        View findViewById2 = tabHost.findViewById(R.id.ad7);
        h.f.b.l.b(findViewById2, "");
        this.f141415c = (ScrollableLinearLayout) findViewById2;
        TabHost tabHost2 = this.f141414b;
        if (tabHost2 == null) {
            h.f.b.l.a("tabHost");
        }
        View findViewById3 = tabHost2.findViewById(R.id.e8l);
        h.f.b.l.b(findViewById3, "");
        this.f141416d = findViewById3;
        int i3 = this.f141422k;
        if (i3 >= 0) {
            String string = i.f115645a.getString(R.string.gff);
            h.f.b.l.b(string, "");
            a(i3, string, ae.f124885c);
        }
        int i4 = this.f141423l;
        String string2 = i.f115645a.getString(R.string.f9r);
        h.f.b.l.b(string2, "");
        a(i4, string2, ae.f124884b);
        int i5 = this.t;
        String string3 = i.f115645a.getString(R.string.f9q);
        h.f.b.l.b(string3, "");
        a(i5, string3, ae.f124883a);
        TabHost tabHost3 = this.f141414b;
        if (tabHost3 == null) {
            h.f.b.l.a("tabHost");
        }
        tabHost3.setOnIndexChangedListener(new C3750b(this));
        String str = this.z;
        if (h.f.b.l.a((Object) str, (Object) ae.f124885c)) {
            i2 = this.f141422k;
            if (i2 < 0) {
                i2 = this.t;
            }
        } else if (h.f.b.l.a((Object) str, (Object) ae.f124884b)) {
            i2 = this.f141423l;
        } else {
            i2 = this.t;
        }
        TabHost tabHost4 = this.f141414b;
        if (tabHost4 == null) {
            h.f.b.l.a("tabHost");
        }
        tabHost4.a(i2, true, true);
        this.v.a(this, new c(this));
        h<Boolean> hVar = this.w;
        if (hVar != null) {
            hVar.a(this, new d(this));
        }
        h<z> hVar2 = this.x;
        if (hVar2 != null) {
            hVar2.a(this, new e(this));
        }
        com.bytedance.als.g<c> gVar = this.y;
        if (gVar != null) {
            gVar.a(this, new f(this));
        }
        this.B.a(this, new g(this));
        return viewGroup2;
    }

    private final void a(int i2, String str, String str2) {
        n E = E();
        E.setText(str);
        E.setTag(str2);
        E.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        ScrollableLinearLayout scrollableLinearLayout = this.f141415c;
        if (scrollableLinearLayout == null) {
            h.f.b.l.a("tabContainer");
        }
        scrollableLinearLayout.addView(E, i2);
        this.f141418f.add(str2);
    }

    public b(com.bytedance.o.f fVar, k<com.ss.android.ugc.gamora.recorder.b.c> kVar, l<Integer> lVar, h<Boolean> hVar, h<z> hVar2, com.bytedance.als.g<c> gVar, String str, boolean z2, com.bytedance.als.d<Integer> dVar) {
        int i2;
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(dVar, "");
        this.u = fVar;
        this.f141421i = kVar;
        this.v = lVar;
        this.w = hVar;
        this.x = hVar2;
        this.y = gVar;
        this.z = str;
        this.A = z2;
        this.B = dVar;
        if (z2) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        this.f141422k = i2;
        this.f141423l = i2 + 1;
        this.t = i2 + 2;
    }
}
