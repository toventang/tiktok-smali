package com.ss.android.ugc.aweme.commercialize.profile;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.challenge.ui.z;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.n.o;
import com.ss.android.ugc.aweme.feed.n.p;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class e extends com.ss.android.ugc.aweme.base.f.a implements com.ss.android.ugc.aweme.challenge.d, com.ss.android.ugc.aweme.common.e.c<Aweme>, a.AbstractC1744a, o {

    /* renamed from: e  reason: collision with root package name */
    public static final a f75157e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f75158a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView.i f75159b;

    /* renamed from: c  reason: collision with root package name */
    public AwemeRawAd f75160c;

    /* renamed from: d  reason: collision with root package name */
    public long f75161d;

    /* renamed from: j  reason: collision with root package name */
    private DmtStatusView f75162j;

    /* renamed from: k  reason: collision with root package name */
    private b f75163k;

    /* renamed from: l  reason: collision with root package name */
    private String f75164l = "";

    /* renamed from: m  reason: collision with root package name */
    private String f75165m = "";
    private String n = "";
    private String o = "";
    private boolean p;
    private a q;
    private final List<String> r = new ArrayList();
    private final Map<String, Boolean> s = new HashMap();
    private HashMap t;

    static {
        Covode.recordClassIndex(46357);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<Aweme> list, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void a(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<Aweme> list, boolean z) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46358);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void aS_() {
        a();
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final boolean bi_() {
        return this.p;
    }

    private final boolean c() {
        a aVar = this.q;
        if (aVar == null || aVar.getItemCount() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.t;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
        if (c()) {
            DmtStatusView dmtStatusView = this.f75162j;
            if (dmtStatusView == null) {
                l.a("mStatusView");
            }
            dmtStatusView.f();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        if (ab_()) {
            DmtStatusView dmtStatusView = this.f75162j;
            if (dmtStatusView == null) {
                l.a("mStatusView");
            }
            dmtStatusView.h();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.AbstractC1744a
    public final View m() {
        if (!ab_()) {
            return null;
        }
        RecyclerView recyclerView = this.f75158a;
        if (recyclerView == null) {
            l.a("mListView");
        }
        return recyclerView;
    }

    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f75166a;

        static {
            Covode.recordClassIndex(46359);
        }

        public final void onGlobalLayout() {
            RecyclerView.i iVar = this.f75166a.f75159b;
            if (iVar == null) {
                l.a("mLayoutManager");
            }
            if (!(iVar instanceof WrapGridLayoutManager)) {
                iVar = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) iVar;
            if (linearLayoutManager == null || linearLayoutManager.k() != -1) {
                this.f75166a.b(true);
                RecyclerView recyclerView = this.f75166a.f75158a;
                if (recyclerView == null) {
                    l.a("mListView");
                }
                recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(e eVar) {
            this.f75166a = eVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        if (ab_()) {
            if (c()) {
                DmtStatusView dmtStatusView = this.f75162j;
                if (dmtStatusView == null) {
                    l.a("mStatusView");
                }
                dmtStatusView.f();
            }
            a aVar = this.q;
            if (aVar != null) {
                aVar.ag_();
            }
        }
    }

    public final void a() {
        a aVar = this.q;
        if (aVar != null) {
            b bVar = this.f75163k;
            if (bVar == null) {
                l.a("mPresenter");
            }
            Object[] objArr = new Object[8];
            objArr[0] = this.f75165m;
            int i2 = 1;
            objArr[1] = this.n;
            objArr[2] = Long.valueOf(this.f75161d);
            objArr[3] = 0L;
            objArr[4] = 6;
            List list = ((com.ss.android.ugc.aweme.common.a.d) aVar).f76354l;
            if (!(list == null || list.size() == 0)) {
                i2 = 4;
            }
            objArr[5] = Integer.valueOf(i2);
            objArr[6] = this.o;
            objArr[7] = this.f75164l;
            bVar.a(objArr);
        }
    }

    public static final class c extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f75167a;

        static {
            Covode.recordClassIndex(46360);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(e eVar) {
            this.f75167a = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2);
            if (i2 == 0) {
                this.f75167a.b(false);
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f75168a;

        static {
            Covode.recordClassIndex(46361);
        }

        d(e eVar) {
            this.f75168a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f75168a.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        a aVar;
        List list;
        super.setUserVisibleHint(z);
        if (z) {
            a aVar2 = this.q;
            if (aVar2 == null || ((com.ss.android.ugc.aweme.common.a.d) aVar2).f76354l == null || !((aVar = this.q) == null || (list = ((com.ss.android.ugc.aweme.common.a.d) aVar).f76354l) == null || list.size() != 0)) {
                a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        List list;
        a aVar;
        if (ab_()) {
            DmtStatusView dmtStatusView = this.f75162j;
            if (dmtStatusView == null) {
                l.a("mStatusView");
            }
            dmtStatusView.h();
            a aVar2 = this.q;
            if (aVar2 != null) {
                list = aVar2.e();
            } else {
                list = null;
            }
            if (!com.bytedance.common.utility.collection.b.a((Collection) list) && (aVar = this.q) != null) {
                aVar.f();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        if (ab_()) {
            a aVar = this.q;
            if (aVar != null && aVar.getItemCount() == 0) {
                DmtStatusView dmtStatusView = this.f75162j;
                if (dmtStatusView == null) {
                    l.a("mStatusView");
                }
                dmtStatusView.d();
            }
            a aVar2 = this.q;
            if (aVar2 != null) {
                aVar2.j();
            }
        }
    }

    public final void b(boolean z) {
        int i2;
        a aVar;
        List list;
        Aweme aweme;
        List list2;
        RecyclerView.i iVar = this.f75159b;
        if (iVar == null) {
            l.a("mLayoutManager");
        }
        if (!(iVar instanceof WrapGridLayoutManager)) {
            iVar = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) iVar;
        if (linearLayoutManager != null) {
            int m2 = linearLayoutManager.m();
            this.r.clear();
            if (z && m2 >= 5) {
                m2 = 5;
            }
            int i3 = m2 + 1;
            for (int k2 = linearLayoutManager.k(); k2 < i3; k2++) {
                a aVar2 = this.q;
                if (aVar2 == null || (list2 = ((com.ss.android.ugc.aweme.common.a.d) aVar2).f76354l) == null) {
                    i2 = 0;
                } else {
                    i2 = list2.size();
                }
                if (k2 < i2 && (aVar = this.q) != null && (list = ((com.ss.android.ugc.aweme.common.a.d) aVar).f76354l) != null && (aweme = (Aweme) list.get(k2)) != null) {
                    String aid = aweme.getAid();
                    Boolean bool = this.s.get(aid);
                    if (bool == null || !bool.booleanValue()) {
                        com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "othershow", this.f75160c).b("refer", "video_cover").a("item_id", aweme.getAid()).b();
                    }
                    Map<String, Boolean> map = this.s;
                    l.b(aid, "");
                    map.put(aid, true);
                    this.r.add(aid);
                } else {
                    return;
                }
            }
            for (String str : this.s.keySet()) {
                if (!this.r.contains(str)) {
                    this.s.put(str, false);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<Aweme> list, boolean z) {
        if (ab_()) {
            a aVar = this.q;
            if (aVar != null) {
                aVar.ai_();
            }
            b bVar = this.f75163k;
            if (bVar == null) {
                l.a("mPresenter");
            }
            n nVar = (n) bVar.f76396h;
            Objects.requireNonNull(nVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.profile.FakeUserAwemeModel");
            nVar.a();
            a aVar2 = this.q;
            if (aVar2 != null) {
                aVar2.b_(list);
            }
            this.p = z;
            a aVar3 = this.q;
            if (aVar3 != null && aVar3.c() == 0 && !z) {
                DmtStatusView dmtStatusView = this.f75162j;
                if (dmtStatusView == null) {
                    l.a("mStatusView");
                }
                if (dmtStatusView.j()) {
                    DmtStatusView dmtStatusView2 = this.f75162j;
                    if (dmtStatusView2 == null) {
                        l.a("mStatusView");
                    }
                    dmtStatusView2.g();
                    return;
                }
            }
            if (com.bytedance.common.utility.collection.b.a((Collection) list) && z) {
                a();
            } else if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                DmtStatusView dmtStatusView3 = this.f75162j;
                if (dmtStatusView3 == null) {
                    l.a("mStatusView");
                }
                dmtStatusView3.a(true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.azl);
        l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f75158a = recyclerView;
        if (recyclerView == null) {
            l.a("mListView");
        }
        RecyclerView recyclerView2 = this.f75158a;
        if (recyclerView2 == null) {
            l.a("mListView");
        }
        recyclerView.setOnFlingListener(new p(recyclerView2, this));
        View findViewById2 = view.findViewById(R.id.azv);
        l.b(findViewById2, "");
        this.f75162j = (DmtStatusView) findViewById2;
        Context context = getContext();
        if (context != null) {
            l.b(context, "");
            TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
            tuxTextView.setTuxFont(51);
            tuxTextView.setGravity(17);
            tuxTextView.setTextColor(androidx.core.content.b.c(context, R.color.c4));
            tuxTextView.setText(R.string.cyv);
            tuxTextView.setOnClickListener(new d(this));
            DmtStatusView dmtStatusView = this.f75162j;
            if (dmtStatusView == null) {
                l.a("mStatusView");
            }
            dmtStatusView.setBuilder(DmtStatusView.a.a(getContext()).c(tuxTextView));
        }
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("user_id")) == null) {
            str = "";
        }
        this.f75165m = str;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str2 = arguments2.getString("sec_user_id")) == null) {
            str2 = "";
        }
        this.n = str2;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str3 = arguments3.getString("aweme_id")) == null) {
            str3 = "";
        }
        this.f75164l = str3;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str4 = arguments4.getString("adv_id")) == null) {
            str4 = "";
        }
        this.o = str4;
        RecyclerView recyclerView3 = this.f75158a;
        if (recyclerView3 == null) {
            l.a("mListView");
        }
        recyclerView3.setOverScrollMode(2);
        getActivity();
        this.f75159b = new WrapGridLayoutManager(2, 1);
        RecyclerView recyclerView4 = this.f75158a;
        if (recyclerView4 == null) {
            l.a("mListView");
        }
        RecyclerView.i iVar = this.f75159b;
        if (iVar == null) {
            l.a("mLayoutManager");
        }
        recyclerView4.setLayoutManager(iVar);
        RecyclerView recyclerView5 = this.f75158a;
        if (recyclerView5 == null) {
            l.a("mListView");
        }
        recyclerView5.a(new com.ss.android.ugc.aweme.base.widget.b(2, (int) n.b(getContext(), 1.0f)));
        RecyclerView recyclerView6 = this.f75158a;
        if (recyclerView6 == null) {
            l.a("mListView");
        }
        recyclerView6.a(new z());
        a aVar = new a(this);
        this.q = aVar;
        String str5 = this.f75164l;
        l.d(str5, "");
        aVar.f75136d = str5;
        RecyclerView recyclerView7 = this.f75158a;
        if (recyclerView7 == null) {
            l.a("mListView");
        }
        recyclerView7.setAdapter(this.q);
        RecyclerView recyclerView8 = this.f75158a;
        if (recyclerView8 == null) {
            l.a("mListView");
        }
        recyclerView8.getViewTreeObserver().addOnGlobalLayoutListener(new b(this));
        b bVar = new b();
        this.f75163k = bVar;
        bVar.a_(this);
        n nVar = new n();
        b bVar2 = this.f75163k;
        if (bVar2 == null) {
            l.a("mPresenter");
        }
        bVar2.a((com.ss.android.ugc.aweme.common.b) nVar);
        c cVar = new c(this);
        RecyclerView recyclerView9 = this.f75158a;
        if (recyclerView9 == null) {
            l.a("mListView");
        }
        recyclerView9.a(cVar);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.any, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.challenge.d
    public final void a(View view, Aweme aweme, String str) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && aweme != null && getActivity() != null) {
            b bVar = this.f75163k;
            if (bVar == null) {
                l.a("mPresenter");
            }
            ae.f95296a = (com.ss.android.ugc.aweme.common.e.a) bVar.f76396h;
            Bundle bundle = new Bundle();
            bundle.putString("id", aweme.getAid());
            bundle.putString("userid", this.f75165m);
            bundle.putString("sec_userid", this.n);
            bundle.putString("refer", "new_ad_fake_user");
            bundle.putString("video_from", "from_ad_new_fake_user");
            bundle.putString("feed_ad_aweme_id", this.f75164l);
            bundle.putString("feed_adv_id", this.o);
            bundle.putLong("max_cursor", this.f75161d);
            SmartRouter.buildRoute(getActivity(), "aweme://aweme/detail/").withParam(bundle).open();
            com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "otherclick", this.f75160c).b("refer", "video_cover").a("item_id", aweme.getAid()).b();
        }
    }
}
