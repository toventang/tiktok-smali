package com.ss.android.ugc.aweme.discover.j;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.android.material.appbar.AppBarLayout;
import com.ss.android.ugc.aweme.base.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.lynx.delegate.i;
import com.ss.android.ugc.aweme.discover.lynx.e.a;
import com.ss.android.ugc.aweme.discover.mob.c;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.discover.model.SearchObserver;
import com.ss.android.ugc.aweme.discover.model.SearchStateListener;
import com.ss.android.ugc.aweme.discover.model.SearchStateListener$$CC;
import com.ss.android.ugc.aweme.discover.ui.ac;
import com.ss.android.ugc.aweme.discover.ui.bh;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.n.o;
import com.ss.android.ugc.aweme.feed.n.q;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.k.ad;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.search.n.e;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public class k extends bh<Aweme> implements o, q, com.ss.android.ugc.aweme.search.d.c {

    /* renamed from: l  reason: collision with root package name */
    private static final a f81257l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.discover.i.c f81258a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.discover.b.g f81259b;

    /* renamed from: d  reason: collision with root package name */
    private d f81260d;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f81261e;

    /* renamed from: j  reason: collision with root package name */
    private com.ss.android.ugc.aweme.discover.lynx.e.a f81262j;

    /* renamed from: k  reason: collision with root package name */
    private final h f81263k;

    /* renamed from: m  reason: collision with root package name */
    private SparseArray f81264m;

    static {
        Covode.recordClassIndex(50495);
    }

    private final b.AnonymousClass1 p() {
        return (b.AnonymousClass1) this.f81263k.getValue();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.bh, com.ss.android.ugc.aweme.discover.ui.am, com.ss.android.ugc.aweme.discover.ui.av
    public final View a(int i2) {
        if (this.f81264m == null) {
            this.f81264m = new SparseArray();
        }
        View view = (View) this.f81264m.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f81264m.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.bh, com.ss.android.ugc.aweme.discover.ui.am, com.ss.android.ugc.aweme.discover.ui.av
    public final void aT_() {
        SparseArray sparseArray = this.f81264m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final String c() {
        return "video";
    }

    @Override // com.ss.android.ugc.aweme.feed.n.q
    public final void d() {
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.am
    public final boolean r() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final boolean s() {
        return false;
    }

    static final class a {
        static {
            Covode.recordClassIndex(50496);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class g implements com.ss.android.ugc.aweme.discover.lynx.e.c {
        static {
            Covode.recordClassIndex(50503);
        }

        g() {
        }

        @Override // com.ss.android.ugc.aweme.discover.lynx.e.c
        public final List<com.ss.android.ugc.aweme.discover.lynx.delegate.b> a(com.ss.android.ugc.aweme.discover.lynx.a.b bVar) {
            l.d(bVar, "");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.h(bVar));
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.e(bVar));
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.g(bVar));
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.f(bVar));
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.c(bVar));
            arrayList.add(new i(bVar));
            return arrayList;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void aS_() {
        l();
    }

    static final class b extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(50497);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new com.ss.android.ugc.aweme.flowfeed.a.a(this) {
                /* class com.ss.android.ugc.aweme.discover.j.k.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f81265a;

                static {
                    Covode.recordClassIndex(50498);
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final com.ss.android.ugc.playerkit.videoview.k h() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final Fragment g() {
                    return this.f81265a.this$0;
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final boolean c() {
                    return this.f81265a.this$0.ab_();
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final boolean e() {
                    return this.f81265a.this$0.getUserVisibleHint();
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final Context f() {
                    return this.f81265a.this$0.getContext();
                }

                @Override // com.ss.android.ugc.aweme.flowfeed.a.a
                public final String d() {
                    Integer num;
                    StringBuilder sb = new StringBuilder("SearchFeedFragment_");
                    androidx.fragment.app.e activity = this.f81265a.this$0.getActivity();
                    if (activity != null) {
                        num = Integer.valueOf(activity.hashCode());
                    } else {
                        num = null;
                    }
                    return sb.append(num).toString();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f81265a = r1;
                }
            };
        }
    }

    private final void Q() {
        d dVar = this.f81260d;
        if (dVar != null) {
            dVar.a(d.f81231c);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.d.c
    public final void a() {
        f fVar = (f) n().f76396h;
        Objects.requireNonNull(fVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.common.presenter.BaseListModel<*, *>");
        ae.f95300e = fVar;
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f81269a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f81270b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f81271c;

        static {
            Covode.recordClassIndex(50502);
        }

        f(k kVar, List list, boolean z) {
            this.f81269a = kVar;
            this.f81270b = list;
            this.f81271c = z;
        }

        public final void run() {
            this.f81269a.f81258a.a(this.f81270b, this.f81271c);
            this.f81269a.N();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.b.a.a.a
    public final SparseArray<com.ss.android.ugc.b.a.a.c> G() {
        SparseArray<com.ss.android.ugc.b.a.a.c> G = super.G();
        l.b(G, "");
        G.append(d.a.f68099b, this.f81258a);
        return G;
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final boolean bi_() {
        f fVar = (f) n().f76396h;
        Objects.requireNonNull(fVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.common.presenter.BaseListModel<*, *>");
        return fVar.isHasMore();
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final boolean o() {
        View view;
        List<View> a2 = B().a();
        com.ss.android.ugc.aweme.discover.lynx.e.a aVar = this.f81262j;
        if (aVar != null) {
            view = aVar.itemView;
        } else {
            view = null;
        }
        return n.a((Iterable) a2, (Object) view);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.discover.ui.bh, com.ss.android.ugc.aweme.discover.ui.am, com.ss.android.ugc.aweme.discover.ui.av
    public void onDestroyView() {
        super.onDestroyView();
        n().cd_();
        this.f81258a.r();
        aT_();
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.discover.ui.av
    public void onPause() {
        super.onPause();
        com.ss.android.ugc.aweme.discover.b.g gVar = this.f81259b;
        if (gVar != null) {
            gVar.f80849h = true;
        }
        com.ss.android.ugc.aweme.discover.b.g gVar2 = this.f81259b;
        if (gVar2 != null) {
            gVar2.f();
        }
    }

    public k() {
        if (this.f81258a == null) {
            this.f81258a = new com.ss.android.ugc.aweme.discover.i.c("search_result", this, this);
        }
        com.ss.android.ugc.aweme.discover.i.c cVar = this.f81258a;
        if (cVar == null) {
            l.b();
        }
        this.f81258a = cVar;
        this.f81263k = h.i.a((h.f.a.a) new b(this));
        this.t = j.f121156d;
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void i() {
        a(new e());
        n().a_((com.ss.android.ugc.aweme.common.e.c) this);
        n().a((ac) this);
        n().a((com.ss.android.ugc.aweme.common.e.d) this.f81258a);
        this.f81260d = new d();
        g<?> n = n();
        Objects.requireNonNull(n, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchAwemePresenter");
        n.a((Object) this.f81260d);
        Q();
        if (getActivity() != null) {
            t<Integer> tVar = C().searchState;
            if (tVar != null) {
                tVar.observe(this, new SearchObserver().setListener(new c(this)));
            }
            t<Boolean> tVar2 = C().isRefreshingData;
            if (tVar2 != null) {
                tVar2.observe(this, new d(this));
            }
            t<Boolean> tVar3 = C().isShowingFilters;
            if (tVar3 != null) {
                tVar3.observe(this, new e(this));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void m() {
        com.ss.android.ugc.aweme.discover.adapter.q d2 = this.f81258a.d();
        l.b(d2, "");
        a(d2);
        com.ss.android.ugc.aweme.discover.c.a aVar = this.f81258a.f81217g;
        l.b(aVar, "");
        a(aVar);
        com.ss.android.ugc.aweme.common.a.f A = A();
        com.ss.android.ugc.aweme.discover.adapter.q qVar = null;
        if (!(A instanceof com.ss.android.ugc.aweme.discover.adapter.q)) {
            A = null;
        }
        com.ss.android.ugc.aweme.discover.adapter.q qVar2 = (com.ss.android.ugc.aweme.discover.adapter.q) A;
        if (qVar2 != null) {
            qVar2.f80581e = p();
        }
        if (com.ss.android.ugc.aweme.discover.b.h.b()) {
            this.f81259b = new com.ss.android.ugc.aweme.discover.b.g(w(), y());
            com.ss.android.ugc.aweme.common.a.f A2 = A();
            if (A2 instanceof com.ss.android.ugc.aweme.discover.adapter.q) {
                qVar = A2;
            }
            com.ss.android.ugc.aweme.discover.adapter.q qVar3 = qVar;
            if (qVar3 != null) {
                com.ss.android.ugc.aweme.discover.b.g gVar = this.f81259b;
                if (gVar == null) {
                    l.b();
                }
                qVar3.f80580d = gVar;
            }
            this.f81258a.p = this.f81259b;
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.discover.ui.av
    public void onResume() {
        com.ss.android.ugc.aweme.discover.b.g gVar;
        super.onResume();
        com.ss.android.ugc.aweme.discover.b.g gVar2 = this.f81259b;
        if (gVar2 != null) {
            gVar2.f80849h = false;
        }
        if (getUserVisibleHint()) {
            t<Boolean> tVar = C().isShowingFilters;
            l.b(tVar, "");
            if (!l.a((Object) tVar.getValue(), (Object) true)) {
                t<Boolean> tVar2 = C().isRefreshingData;
                l.b(tVar2, "");
                if ((!l.a((Object) tVar2.getValue(), (Object) true)) && (gVar = this.f81259b) != null) {
                    gVar.d();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void a(boolean z) {
        this.f81258a.a(z);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void b(com.ss.android.ugc.aweme.search.model.d dVar) {
        l.d(dVar, "");
        super.b(dVar);
        com.ss.android.ugc.aweme.discover.i.c cVar = this.f81258a;
        if (cVar != null) {
            cVar.a(dVar);
        }
        Q();
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f81267a;

        static {
            Covode.recordClassIndex(50500);
        }

        d(k kVar) {
            this.f81267a = kVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.discover.b.g gVar;
            Boolean bool = (Boolean) obj;
            com.ss.android.ugc.aweme.discover.b.g gVar2 = this.f81267a.f81259b;
            if (gVar2 != null) {
                l.b(bool, "");
                gVar2.f80851j = bool.booleanValue();
            }
            l.b(bool, "");
            if (bool.booleanValue() && (gVar = this.f81267a.f81259b) != null) {
                gVar.f();
            }
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f81268a;

        static {
            Covode.recordClassIndex(50501);
        }

        e(k kVar) {
            this.f81268a = kVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                com.ss.android.ugc.aweme.discover.b.g gVar = this.f81268a.f81259b;
                if (gVar != null) {
                    gVar.f();
                    return;
                }
                return;
            }
            com.ss.android.ugc.aweme.discover.b.g gVar2 = this.f81268a.f81259b;
            if (gVar2 != null) {
                gVar2.d();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.bh
    public final void b(int i2) {
        n().a(1, u(), Integer.valueOf(i2), Integer.valueOf(this.C), this.D);
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.discover.ui.av
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.f81258a.e(z);
        com.ss.android.ugc.aweme.discover.b.g gVar = this.f81259b;
        if (gVar != null) {
            gVar.f80850i = z;
        }
        if (!z) {
            com.ss.android.ugc.aweme.discover.b.g gVar2 = this.f81259b;
            if (gVar2 != null) {
                gVar2.f();
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.discover.b.g gVar3 = this.f81259b;
        if (gVar3 != null) {
            gVar3.d();
        }
        this.f81258a.k();
    }

    static final class c implements SearchStateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f81266a;

        static {
            Covode.recordClassIndex(50499);
        }

        c(k kVar) {
            this.f81266a = kVar;
        }

        @Override // com.ss.android.ugc.aweme.discover.model.SearchStateListener
        public final void onPageHidden() {
            SearchStateListener$$CC.onPageHidden(this);
        }

        @Override // com.ss.android.ugc.aweme.discover.model.SearchStateListener
        public final void onPageResume() {
            SearchStateListener$$CC.onPageResume(this);
        }

        @Override // com.ss.android.ugc.aweme.discover.model.SearchStateListener
        public final void onContentVisible(boolean z) {
            boolean z2;
            t<Boolean> tVar = this.f81266a.C().isShowingSuicide;
            l.b(tVar, "");
            tVar.getValue();
            com.ss.android.ugc.aweme.discover.b.g gVar = this.f81266a.f81259b;
            if (gVar != null) {
                t<Boolean> tVar2 = this.f81266a.C().isShowingSuicide;
                l.b(tVar2, "");
                boolean a2 = l.a((Object) tVar2.getValue(), (Object) true);
                if (!z || a2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                gVar.f80850i = z2;
                if (z) {
                    t<Boolean> tVar3 = this.f81266a.C().isRefreshingData;
                    l.b(tVar3, "");
                    if (!l.a((Object) tVar3.getValue(), (Object) true)) {
                        t<Boolean> tVar4 = this.f81266a.C().isShowingFilters;
                        l.b(tVar4, "");
                        if (!l.a((Object) tVar4.getValue(), (Object) true)) {
                            gVar.d();
                            return;
                        }
                    }
                }
                gVar.f();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac, com.ss.android.ugc.aweme.discover.ui.bh
    public final void a(com.ss.android.ugc.aweme.discover.mixfeed.d dVar) {
        View view;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Map<String, String> searchTrackMap;
        ad c2;
        ad c3;
        View view2;
        View view3;
        View view4 = null;
        if (dVar == null) {
            com.ss.android.ugc.aweme.discover.c.a B = B();
            com.ss.android.ugc.aweme.discover.lynx.e.a aVar = this.f81262j;
            if (aVar != null) {
                view2 = aVar.itemView;
            } else {
                view2 = null;
            }
            B.b(view2);
            com.ss.android.ugc.aweme.discover.lynx.e.a aVar2 = this.f81262j;
            if (!(aVar2 == null || (view3 = aVar2.itemView) == null)) {
                view3.setVisibility(8);
            }
            this.f81262j = null;
            return;
        }
        com.ss.android.ugc.aweme.discover.c.a B2 = B();
        com.ss.android.ugc.aweme.discover.lynx.e.a aVar3 = this.f81262j;
        if (aVar3 != null) {
            view = aVar3.itemView;
        } else {
            view = null;
        }
        B2.b(view);
        if (!com.bytedance.x.c.c.a(dVar.getSchema())) {
            this.f81262j = a.C1902a.a(w(), new g());
            com.ss.android.ugc.aweme.search.theme.dark.b.a(Integer.valueOf(hashCode()), this.f81262j);
            com.ss.android.ugc.aweme.search.k.q a2 = am.a();
            if (a2 == null || (c3 = a2.c()) == null) {
                str = null;
            } else {
                str = c3.f121172a;
            }
            String a3 = j.a(this.B);
            com.ss.android.ugc.aweme.search.k.q a4 = am.a();
            if (a4 == null || (c2 = a4.c()) == null) {
                str2 = null;
            } else {
                str2 = c2.f121175d;
            }
            p[] pVarArr = new p[3];
            String str6 = "";
            if (str == null) {
                str3 = str6;
            } else {
                str3 = str;
            }
            pVarArr[0] = v.a("search_id", str3);
            pVarArr[1] = v.a("search_type", a3);
            if (str2 != null) {
                str6 = str2;
            }
            pVarArr[2] = v.a("use_scenario", str6);
            Map a5 = ag.a(pVarArr);
            com.ss.android.ugc.aweme.search.n.h b2 = d.a.b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("search_id", str);
            jSONObject.put("use_scenario", str2);
            if (b2 != null) {
                str4 = b2.getSearchId();
            } else {
                str4 = null;
            }
            jSONObject.put("search_id_x", str4);
            if (b2 == null || (searchTrackMap = b2.getSearchTrackMap()) == null) {
                str5 = null;
            } else {
                str5 = searchTrackMap.get("use_scenario");
            }
            jSONObject.put("use_scenario_x", str5);
            r.a("ref_search_feed_set_dynamic_header", jSONObject);
            com.ss.android.ugc.aweme.discover.lynx.e.a aVar4 = this.f81262j;
            if (aVar4 != null) {
                com.ss.android.ugc.aweme.discover.lynx.e.a.a(aVar4, dVar, a5, 24);
            }
            com.ss.android.ugc.aweme.discover.c.a B3 = B();
            com.ss.android.ugc.aweme.discover.lynx.e.a aVar5 = this.f81262j;
            if (aVar5 != null) {
                view4 = aVar5.itemView;
            }
            B3.a(0, view4);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void a(FollowStatus followStatus) {
        l.d(followStatus, "");
        if (ab_()) {
            com.ss.android.ugc.aweme.common.a.f A = A();
            Objects.requireNonNull(A, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchCellFeedAdapter");
            ((com.ss.android.ugc.aweme.common.a.d) A).a(followStatus);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.d.c
    public final void a(com.ss.android.ugc.aweme.search.d.a aVar) {
        com.ss.android.ugc.aweme.search.k.r rVar;
        String str;
        androidx.core.app.b bVar;
        Bundle bundle;
        int i2;
        ad c2;
        Integer valueOf;
        ad c3;
        l.d(aVar, "");
        Aweme aweme = aVar.f120991b;
        View view = aVar.f120990a;
        String str2 = aVar.f120992c;
        com.ss.android.ugc.aweme.search.ecom.a.a aVar2 = aVar.f120994e;
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            String str3 = null;
            if (view != null) {
                rVar = j.a.a(view);
            } else {
                rVar = null;
            }
            if (aweme != null && getActivity() != null) {
                f fVar = (f) n().f76396h;
                Objects.requireNonNull(fVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.common.presenter.BaseListModel<*, *>");
                ae.f95296a = fVar;
                com.ss.android.ugc.aweme.search.k.q a2 = am.a();
                if (a2 == null || (c3 = a2.c()) == null) {
                    str = null;
                } else {
                    str = c3.f121172a;
                }
                String a3 = c.b.a.a(4);
                Bundle bundle2 = new Bundle();
                bundle2.putString("id", aweme.getAid());
                bundle2.putString("refer", str2);
                bundle2.putString("video_from", "from_search");
                bundle2.putInt("profile_enterprise_type", aweme.getEnterpriseType());
                bundle2.putInt("page_type", 9);
                bundle2.putString("search_keyword", u());
                bundle2.putString("search_id", str);
                bundle2.putString("playlist_search_id", str);
                bundle2.putInt("is_from_video", 1);
                bundle2.putString("key_search_type", a3);
                bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65280);
                if (aVar2 != null) {
                    bundle2.putSerializable("feed_anchor_custom_data", new AnchorCustomData(true, com.ss.android.ugc.aweme.search.ecom.b.c.a(com.ss.android.ugc.aweme.search.ecom.b.c.a(aweme, aVar2, rVar))));
                }
                if (view != null) {
                    bVar = androidx.core.app.b.b(view, view.getWidth(), view.getHeight());
                } else {
                    bVar = null;
                }
                SmartRoute withParam = SmartRouter.buildRoute(getActivity(), "//aweme/detail").withParam(bundle2);
                if (bVar != null) {
                    bundle = bVar.a();
                } else {
                    bundle = null;
                }
                withParam.withBundleAnimation(bundle).withParam("activity_has_activity_options", true).open();
                com.ss.android.ugc.aweme.feed.d.b.a(aweme);
                if (w().getLayoutManager() == null || view == null || (valueOf = Integer.valueOf(RecyclerView.i.e(view))) == null) {
                    i2 = -1;
                } else {
                    i2 = valueOf.intValue();
                }
                com.ss.android.ugc.aweme.search.k.q a4 = am.a();
                if (!(a4 == null || (c2 = a4.c()) == null)) {
                    str3 = c2.f121173b;
                }
                c.a.a("ref_search_feed_click", str, str3);
                com.ss.android.ugc.aweme.discover.mob.o.a(view, "search_result", aweme, str3, i2);
                e.a.a(ag.a(v.a("search_result_id", aweme.getAid()), v.a("is_from_video", "1")));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.discover.ui.av
    public final void b(List<? extends Aweme> list, boolean z) {
        this.f81258a.b(list, z);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.discover.ui.av
    public final void c(List<? extends Aweme> list, boolean z) {
        l.d(list, "");
        this.f81258a.b(list, z);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ac, com.ss.android.ugc.aweme.discover.ui.bh
    public final void a(com.ss.android.ugc.aweme.discover.mixfeed.d dVar, String str) {
        com.ss.android.ugc.aweme.search.i.b.a(new com.ss.android.ugc.aweme.search.i.a(getActivity(), dVar, str, this.B, getView()));
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.av
    public final void a(View view, Bundle bundle) {
        l.d(view, "");
        I();
        this.f81258a.a(view, bundle);
        m();
        A().g(androidx.core.content.b.c(view.getContext(), R.color.c5));
        this.f81258a.f81227m = 9;
        this.f81258a.a(this);
        this.f81258a.f81224j = this;
        this.f81258a.a("");
        this.f81258a.o = p();
        w().setClipToPadding(false);
        AppBarLayout z = z();
        if (z != null) {
            z.setBackground(null);
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.dva);
        this.f81261e = viewGroup;
        if (viewGroup != null) {
            viewGroup.setBackground(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.discover.ui.av
    public final void a(List<? extends Aweme> list, boolean z) {
        l.d(list, "");
        if (ab_()) {
            w().post(new f(this, list, z));
            C().setIsRefreshingData(false);
            x().d();
            com.ss.android.ugc.aweme.discover.b.g gVar = this.f81259b;
            if (gVar != null) {
                gVar.a(false, (AppBarLayout) null);
            }
            com.ss.android.ugc.aweme.search.ecom.video.b.a(hashCode());
            b_(true);
        }
    }
}
