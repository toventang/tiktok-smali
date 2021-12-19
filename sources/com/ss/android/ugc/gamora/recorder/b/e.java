package com.ss.android.ugc.gamora.recorder.b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.tux.tooltip.h;
import com.ss.android.ugc.aweme.experiment.ef;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.record.f;
import com.ss.android.ugc.aweme.shortvideo.util.bh;
import com.ss.android.ugc.aweme.shortvideo.widget.ScrollableLinearLayout;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.aweme.shortvideo.widget.n;
import com.ss.android.ugc.gamora.recorder.b.l;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class e {

    /* renamed from: g  reason: collision with root package name */
    public static final a f147381g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<f> f147382a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public k<c> f147383b;

    /* renamed from: c  reason: collision with root package name */
    public k<String> f147384c;

    /* renamed from: d  reason: collision with root package name */
    public TabHost f147385d;

    /* renamed from: e  reason: collision with root package name */
    public TabHost.a f147386e;

    /* renamed from: f  reason: collision with root package name */
    public TabHost.b f147387f;

    /* renamed from: h  reason: collision with root package name */
    private f f147388h;

    /* renamed from: i  reason: collision with root package name */
    private ShortVideoContext f147389i;

    static {
        Covode.recordClassIndex(97120);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97121);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void b() {
        f fVar = this.f147388h;
        if (fVar == null) {
            l.a("tabConfig");
        }
        com.bytedance.tux.tooltip.a aVar = fVar.f130101c;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public final void c() {
        f fVar = this.f147388h;
        if (fVar == null) {
            l.a("tabConfig");
        }
        bh.a(fVar.f130106h, fVar.f130103e, fVar.f130105g);
    }

    private final void g() {
        TabHost tabHost = this.f147385d;
        if (tabHost == null) {
            l.a("bottomTabHost");
        }
        tabHost.setOnIndexChangedListener(new b(this));
        TabHost tabHost2 = this.f147385d;
        if (tabHost2 == null) {
            l.a("bottomTabHost");
        }
        tabHost2.setSharedARTabChangeListener(new c(this));
    }

    private final void h() {
        if (this.f147389i == null) {
            l.a("shortVideoContext");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f147382a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f147393b.f147378d);
        }
        String arrayList2 = arrayList.toString();
        l.b(arrayList2, "");
        l.d(arrayList2, "");
    }

    public final String d() {
        if (this.f147385d == null) {
            return "";
        }
        TabHost tabHost = this.f147385d;
        if (tabHost == null) {
            l.a("bottomTabHost");
        }
        TabHost tabHost2 = this.f147385d;
        if (tabHost2 == null) {
            l.a("bottomTabHost");
        }
        Object a2 = tabHost.a(tabHost2.getCurrentIndex());
        if (!(a2 instanceof String)) {
            a2 = null;
        }
        String str = (String) a2;
        if (str == null) {
            return "";
        }
        return str;
    }

    private final f f() {
        TabHost tabHost = this.f147385d;
        if (tabHost == null) {
            l.a("bottomTabHost");
        }
        ShortVideoContext shortVideoContext = this.f147389i;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        f fVar = new f(tabHost, shortVideoContext);
        List<f> list = this.f147382a;
        ArrayList<f> arrayList = new ArrayList();
        for (T t : list) {
            if (t.f147393b.f147376b.length() > 0) {
                arrayList.add(t);
            }
        }
        for (f fVar2 : arrayList) {
            fVar.a(-1, fVar2.f147393b.f147376b, fVar2.f147393b.f147375a, fVar2.f147393b.f147377c);
        }
        return fVar;
    }

    public final void e() {
        q.a("BottomTabPresenter dispatchEvent BottomTabIndexChangeEvent");
        String string = com.ss.android.ugc.aweme.port.in.c.f115622a.getString(R.string.f_2);
        l.b(string, "");
        for (T t : this.f147382a) {
            if (t.f147393b.f147379e) {
                string = t.f147393b.f147377c;
            }
        }
        c cVar = new c(null, string, 0, false, false, 24);
        cVar.f147369a = true;
        a(cVar);
        k<c> kVar = this.f147383b;
        if (kVar == null) {
            l.a("bottomTabIndexChangeEvent");
        }
        kVar.a(cVar);
    }

    public final void a() {
        n nVar;
        f fVar = this.f147388h;
        if (fVar == null) {
            l.a("tabConfig");
        }
        if (!fVar.f130100b.a() && fVar.f130100b.b() && fVar.f130102d != null && fVar.f130101c == null && ef.b() && (nVar = fVar.f130102d) != null) {
            fVar.f130100b.f147803a.storeBoolean("has_live_tab_pop_up_show".concat(String.valueOf(com.ss.android.ugc.aweme.port.in.c.u.c())), true);
            Context context = nVar.getContext();
            l.b(context, "");
            fVar.f130101c = new com.bytedance.tux.tooltip.a.b.a(context).e(R.string.cyi).a(3000L).b(nVar).a(h.TOP).d();
            n nVar2 = fVar.f130102d;
            if (nVar2 == null) {
                l.b();
            }
            nVar2.postDelayed(new f.a(fVar), 100);
        }
    }

    public final void a(boolean z) {
        TabHost tabHost = this.f147385d;
        if (tabHost == null) {
            l.a("bottomTabHost");
        }
        tabHost.setUISwitchEnabled(z);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements TabHost.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147391a;

        static {
            Covode.recordClassIndex(97123);
        }

        c(e eVar) {
            this.f147391a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.TabHost.b
        public final void a(String str) {
            if (!l.a((Object) str, (Object) "")) {
                k<String> kVar = this.f147391a.f147384c;
                if (kVar == null) {
                    l.a("sharedARTabIndexChangeEvent");
                }
                kVar.a(str);
                TabHost.b bVar = this.f147391a.f147387f;
                if (bVar != null) {
                    bVar.a(str);
                }
            }
        }
    }

    public final void a(c cVar) {
        l.d(cVar, "");
        l.a aVar = new l.a(cVar.f147369a);
        Object obj = cVar.f147371c;
        if (!(obj instanceof String)) {
            obj = null;
        }
        aVar.f147484e = (String) obj;
        aVar.f147483d = cVar.f147374f;
        for (f fVar : this.f147382a) {
            d dVar = fVar.f147393b;
            if (TextUtils.equals((CharSequence) cVar.f147370b, dVar.f147377c)) {
                fVar.f147392a.setValue(false);
                if (dVar.f147380f != null) {
                    dVar.f147380f.onTabUnselected(dVar, aVar);
                }
            }
            Object obj2 = cVar.f147371c;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
            if (TextUtils.equals((CharSequence) obj2, dVar.f147377c)) {
                fVar.f147392a.setValue(true);
                if (dVar.f147380f != null) {
                    if (h.f.b.l.a((Object) dVar.f147377c, (Object) "record_mode_mv")) {
                        aVar.f147481b = false;
                    }
                    aVar.f147483d = cVar.f147374f;
                    dVar.f147380f.onTabSelected(dVar, aVar);
                }
            }
        }
    }

    public final void a(Set<String> set) {
        Set b2;
        f fVar = this.f147388h;
        if (fVar == null) {
            h.f.b.l.a("tabConfig");
        }
        TabHost tabHost = fVar.f130106h;
        ScrollableLinearLayout scrollableLinearLayout = fVar.f130099a;
        h.f.b.l.b(scrollableLinearLayout, "");
        bh.a(set, tabHost, scrollableLinearLayout, fVar.f130103e, fVar.f130105g);
        if (set != null && (b2 = h.a.n.b((Iterable) set, (Iterable) fVar.f130103e)) != null && b2.size() >= 2 && !fVar.f130104f.a()) {
            ScrollableLinearLayout scrollableLinearLayout2 = fVar.f130099a;
            h.f.b.l.b(scrollableLinearLayout2, "");
            View a2 = bh.a(scrollableLinearLayout2, b2);
            ScrollableLinearLayout scrollableLinearLayout3 = fVar.f130099a;
            h.f.b.l.b(scrollableLinearLayout3, "");
            Context context = scrollableLinearLayout3.getContext();
            h.f.b.l.b(context, "");
            Activity a3 = com.ss.android.ugc.aweme.scene.a.a(context);
            if (a3 != null && !a3.isFinishing() && a2 != null) {
                ScrollableLinearLayout scrollableLinearLayout4 = fVar.f130099a;
                h.f.b.l.b(scrollableLinearLayout4, "");
                Context context2 = scrollableLinearLayout4.getContext();
                h.f.b.l.b(context2, "");
                Activity a4 = com.ss.android.ugc.aweme.scene.a.a(context2);
                if (a4 == null) {
                    h.f.b.l.b();
                }
                ((com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(a4).b(a2).a(h.TOP)).e(R.string.aaw).a(5000L).d().a();
                fVar.f130104f.b();
            }
        }
    }

    public final void a(ShortVideoContext shortVideoContext, TabHost tabHost) {
        h.f.b.l.d(shortVideoContext, "");
        h.f.b.l.d(tabHost, "");
        this.f147389i = shortVideoContext;
        this.f147385d = tabHost;
        this.f147388h = f();
        g();
        h();
    }

    public final void a(String str, boolean z) {
        h.f.b.l.d(str, "");
        f fVar = this.f147388h;
        if (fVar == null) {
            h.f.b.l.a("tabConfig");
        }
        h.f.b.l.d(str, "");
        ScrollableLinearLayout scrollableLinearLayout = fVar.f130099a;
        h.f.b.l.b(scrollableLinearLayout, "");
        int i2 = 0;
        if (scrollableLinearLayout.getChildCount() > 0) {
            ScrollableLinearLayout scrollableLinearLayout2 = fVar.f130099a;
            h.f.b.l.b(scrollableLinearLayout2, "");
            int childCount = scrollableLinearLayout2.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = fVar.f130099a.getChildAt(i3);
                h.f.b.l.b(childAt, "");
                if (h.f.b.l.a((Object) str, childAt.getTag())) {
                    i2 = i3;
                    if (i2 < 0) {
                        return;
                    }
                } else {
                    i3++;
                }
            }
            TabHost tabHost = this.f147385d;
            if (tabHost == null) {
                h.f.b.l.a("bottomTabHost");
            }
            tabHost.a(i2, true, z);
        }
    }

    public final f a(com.ss.android.ugc.gamora.a.a aVar, int i2, a aVar2) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(aVar2, "");
        aVar2.initialize(aVar);
        f fVar = new f(aVar2.createBottomTabItem(aVar), aVar2.provideScene());
        this.f147382a.add(i2, fVar);
        String str = fVar.f147393b.f147376b;
        String str2 = fVar.f147393b.f147377c;
        f fVar2 = this.f147388h;
        if (fVar2 == null) {
            h.f.b.l.a("tabConfig");
        }
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        fVar2.a(i2, str, 0, str2);
        TabHost tabHost = this.f147385d;
        if (tabHost == null) {
            h.f.b.l.a("bottomTabHost");
        }
        tabHost.requestLayout();
        return fVar;
    }

    public static void a(boolean z, String str, boolean z2, d dVar) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(dVar, "");
        if (z2 && dVar.b()) {
            com.ss.android.ugc.aweme.cn.a.d d2 = dVar.d();
            if (z) {
                d2.a(str, null);
            } else {
                d2.b(str, null);
            }
        }
    }

    public final void a(com.ss.android.ugc.gamora.a.a aVar, List<? extends a> list, k<c> kVar, k<String> kVar2) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(list, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        this.f147383b = kVar;
        this.f147384c = kVar2;
        for (T t : list) {
            t.initialize(aVar);
            this.f147382a.add(new f(t.createBottomTabItem(aVar), t.provideScene()));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements TabHost.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147390a;

        static {
            Covode.recordClassIndex(97122);
        }

        b(e eVar) {
            this.f147390a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.TabHost.a
        public final void a(Object obj, int i2, int i3, boolean z, boolean z2) {
            TabHost tabHost = this.f147390a.f147385d;
            if (tabHost == null) {
                h.f.b.l.a("bottomTabHost");
            }
            Object a2 = tabHost.a(i2);
            if (a2 == null) {
                a2 = "";
            }
            h.f.b.l.b(a2, "");
            c cVar = new c(obj, a2, i3, false, z2, 8);
            this.f147390a.a(cVar);
            if (!h.f.b.l.a(a2, (Object) "")) {
                k<c> kVar = this.f147390a.f147383b;
                if (kVar == null) {
                    h.f.b.l.a("bottomTabIndexChangeEvent");
                }
                kVar.a(cVar);
                TabHost.a aVar = this.f147390a.f147386e;
                if (aVar != null) {
                    aVar.a(obj, i2, i3, z, z2);
                }
            }
        }
    }
}
