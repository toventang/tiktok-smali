package com.ss.android.ugc.aweme.find.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.ui.ae;
import com.ss.android.ugc.aweme.discover.ui.af;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.k.ad;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.utils.gh;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;
import java.util.List;
import java.util.Objects;

public final class FriendsSearchResultView extends FrameLayout implements com.ss.android.ugc.aweme.common.e.c<SearchUser> {

    /* renamed from: a  reason: collision with root package name */
    public SearchKeywordPresenter f96057a;

    /* renamed from: b  reason: collision with root package name */
    public af f96058b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.ies.foundation.activity.a f96059c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f96060d;

    /* renamed from: e  reason: collision with root package name */
    private ae f96061e;

    /* renamed from: f  reason: collision with root package name */
    private a f96062f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f96063g;

    public interface a {
        static {
            Covode.recordClassIndex(60851);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(60850);
    }

    public FriendsSearchResultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private View a(int i2) {
        if (this.f96063g == null) {
            this.f96063g = new SparseArray();
        }
        View view = (View) this.f96063g.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f96063g.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<SearchUser> list, boolean z) {
    }

    static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ FriendsSearchResultView this$0;

        static {
            Covode.recordClassIndex(60856);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(FriendsSearchResultView friendsSearchResultView) {
            super(0);
            this.this$0 = friendsSearchResultView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (!TextUtils.isEmpty(FriendsSearchResultView.a(this.this$0).a().f105233a)) {
                this.this$0.c();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        com.bytedance.ies.foundation.activity.a aVar = this.f96059c;
        if (aVar == null) {
            l.a("host");
        }
        if (!aVar.isDestroyed()) {
            ae aeVar = this.f96061e;
            if (aeVar == null) {
                l.a("searchUserAdapter");
            }
            aeVar.ag_();
        }
    }

    static final class c implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FriendsSearchResultView f96066a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchKeywordPresenter f96067b;

        static {
            Covode.recordClassIndex(60853);
        }

        c(FriendsSearchResultView friendsSearchResultView, SearchKeywordPresenter searchKeywordPresenter) {
            this.f96066a = friendsSearchResultView;
            this.f96067b = searchKeywordPresenter;
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.a
        public final void l() {
            af afVar = this.f96066a.f96058b;
            if (afVar == null) {
                l.a("searchUserPresenter");
            }
            afVar.a(4, this.f96067b.a().f105233a, 1);
        }
    }

    static final class e extends m implements h.f.a.a<com.ss.android.ugc.aweme.search.n.d> {
        final /* synthetic */ List $list$inlined;
        final /* synthetic */ z.e $searchId;
        final /* synthetic */ com.ss.android.ugc.aweme.search.n.d $this_apply;
        final /* synthetic */ FriendsSearchResultView this$0;

        static {
            Covode.recordClassIndex(60855);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.ss.android.ugc.aweme.search.n.d dVar, z.e eVar, FriendsSearchResultView friendsSearchResultView, List list) {
            super(0);
            this.$this_apply = dVar;
            this.$searchId = eVar;
            this.this$0 = friendsSearchResultView;
            this.$list$inlined = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.search.n.d invoke() {
            return com.ss.android.ugc.aweme.search.n.d.copy$default(this.$this_apply, null, new com.ss.android.ugc.aweme.search.n.h(0, null, this.$searchId.element, FriendsSearchResultView.a(this.this$0).a().f105233a, null, 19, null), 1, null);
        }
    }

    public final void a() {
        if (this.f96060d) {
            ae aeVar = this.f96061e;
            if (aeVar == null) {
                l.a("searchUserAdapter");
            }
            aeVar.f();
            TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.dvp);
            l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
        com.bytedance.ies.foundation.activity.a aVar = this.f96059c;
        if (aVar == null) {
            l.a("host");
        }
        if (!aVar.isDestroyed()) {
            TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.dvp);
            l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            ((TuxStatusView) a(R.id.dvp)).a();
        }
    }

    public final void c() {
        if (this.f96060d) {
            af afVar = this.f96058b;
            if (afVar == null) {
                l.a("searchUserPresenter");
            }
            Object[] objArr = new Object[3];
            objArr[0] = 1;
            SearchKeywordPresenter searchKeywordPresenter = this.f96057a;
            if (searchKeywordPresenter == null) {
                l.a("keywordPresenter");
            }
            objArr[1] = searchKeywordPresenter.a().f105233a;
            objArr[2] = 1;
            afVar.a(objArr);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        com.bytedance.ies.foundation.activity.a aVar = this.f96059c;
        if (aVar == null) {
            l.a("host");
        }
        if (!aVar.isDestroyed()) {
            TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.dvp);
            l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            ((TuxStatusView) a(R.id.dvp)).setStatus(com.ss.android.ugc.aweme.tux.a.g.a.b(new TuxStatusView.c()));
        }
    }

    public static final class d extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f96068a;

        static {
            Covode.recordClassIndex(60854);
        }

        d(a aVar) {
            this.f96068a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2);
            if (i2 != 0) {
                this.f96068a.a();
            }
        }
    }

    public static final /* synthetic */ SearchKeywordPresenter a(FriendsSearchResultView friendsSearchResultView) {
        SearchKeywordPresenter searchKeywordPresenter = friendsSearchResultView.f96057a;
        if (searchKeywordPresenter == null) {
            l.a("keywordPresenter");
        }
        return searchKeywordPresenter;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        com.bytedance.ies.foundation.activity.a aVar = this.f96059c;
        if (aVar == null) {
            l.a("host");
        }
        if (!aVar.isDestroyed()) {
            ae aeVar = this.f96061e;
            if (aeVar == null) {
                l.a("searchUserAdapter");
            }
            aeVar.i();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        com.bytedance.ies.foundation.activity.a aVar = this.f96059c;
        if (aVar == null) {
            l.a("host");
        }
        if (!aVar.isDestroyed()) {
            TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.dvp);
            l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            ((TuxStatusView) a(R.id.dvp)).setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new f(this)));
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.following.ui.adapter.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FriendsSearchResultView f96064a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchKeywordPresenter f96065b;

        static {
            Covode.recordClassIndex(60852);
        }

        b(FriendsSearchResultView friendsSearchResultView, SearchKeywordPresenter searchKeywordPresenter) {
            this.f96064a = friendsSearchResultView;
            this.f96065b = searchKeywordPresenter;
        }

        @Override // com.ss.android.ugc.aweme.following.ui.adapter.d
        public final void a(View view, User user, int i2, String str, String str2) {
            l.d(view, "");
            l.d(user, "");
            l.d(str, "");
            com.ss.android.ugc.aweme.search.h hVar = com.ss.android.ugc.aweme.search.h.f121133a;
            String str3 = this.f96065b.a().f105233a;
            String requestId = user.getRequestId();
            String uid = user.getUid();
            l.b(uid, "");
            hVar.a(i2, str3, 0, requestId, uid, this.f96065b.a().f105233a);
            com.bytedance.ies.foundation.activity.a aVar = this.f96064a.f96059c;
            if (aVar == null) {
                l.a("host");
            }
            SmartRouter.buildRoute(aVar, "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "find_friends").withParam("extra_previous_page_position", "main_head").withParam("profile_enterprise_type", com.ss.android.ugc.aweme.profile.ae.f115954a.a(user)).open();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<SearchUser> list, boolean z) {
        com.bytedance.ies.foundation.activity.a aVar = this.f96059c;
        if (aVar == null) {
            l.a("host");
        }
        if (!aVar.isDestroyed()) {
            af afVar = this.f96058b;
            if (afVar == null) {
                l.a("searchUserPresenter");
            }
            if (!afVar.d()) {
                ae aeVar = this.f96061e;
                if (aeVar == null) {
                    l.a("searchUserAdapter");
                }
                aeVar.ah_();
            } else {
                ae aeVar2 = this.f96061e;
                if (aeVar2 == null) {
                    l.a("searchUserAdapter");
                }
                aeVar2.ai_();
            }
            ae aeVar3 = this.f96061e;
            if (aeVar3 == null) {
                l.a("searchUserAdapter");
            }
            aeVar3.b(list);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<SearchUser> list, boolean z) {
        int i2;
        T t;
        SearchUser searchUser;
        LogPbBean logPbBean;
        String str;
        SearchUser searchUser2;
        LogPbBean logPbBean2;
        com.bytedance.ies.foundation.activity.a aVar = this.f96059c;
        if (aVar == null) {
            l.a("host");
        }
        if (!aVar.isDestroyed()) {
            SearchKeywordPresenter searchKeywordPresenter = this.f96057a;
            if (searchKeywordPresenter == null) {
                l.a("keywordPresenter");
            }
            if (!TextUtils.isEmpty(searchKeywordPresenter.a().f105233a)) {
                com.bytedance.ies.foundation.activity.a aVar2 = this.f96059c;
                if (aVar2 == null) {
                    l.a("host");
                }
                q a2 = am.a(aVar2.hashCode());
                if (a2 == null) {
                    a2 = new com.ss.android.ugc.aweme.search.k.ae();
                    com.bytedance.ies.foundation.activity.a aVar3 = this.f96059c;
                    if (aVar3 == null) {
                        l.a("host");
                    }
                    am.a(aVar3.hashCode(), a2);
                }
                ad adVar = new ad();
                if (list != null) {
                    i2 = list.size();
                } else {
                    i2 = 0;
                }
                if (i2 > 0) {
                    if (list == null || (searchUser2 = list.get(0)) == null || (logPbBean2 = searchUser2.logPb) == null || (str = logPbBean2.getImprId()) == null) {
                        str = "";
                    }
                    adVar.a(str);
                }
                SearchKeywordPresenter searchKeywordPresenter2 = this.f96057a;
                if (searchKeywordPresenter2 == null) {
                    l.a("keywordPresenter");
                }
                adVar.b(searchKeywordPresenter2.a().f105233a);
                a2.a(0, adVar);
                if (d.a.a() == null) {
                    com.bytedance.ies.foundation.activity.a aVar4 = this.f96059c;
                    if (aVar4 == null) {
                        l.a("host");
                    }
                    com.bytedance.track.c.a(aVar4).f44410c.a().a("tracker_key", new com.ss.android.ugc.aweme.search.n.d(null, null, 3, null), com.ss.android.ugc.aweme.search.n.d.class);
                }
                com.bytedance.ies.foundation.activity.a aVar5 = this.f96059c;
                if (aVar5 == null) {
                    l.a("host");
                }
                com.ss.android.ugc.aweme.search.n.d a3 = d.a.a(aVar5);
                if (a3 != null) {
                    z.e eVar = new z.e();
                    eVar.element = "";
                    if (list != null && list.size() > 0) {
                        if (list == null || (searchUser = list.get(0)) == null || (logPbBean = searchUser.logPb) == null || (t = (T) logPbBean.getImprId()) == null) {
                            t = "";
                        }
                        eVar.element = t;
                    }
                    a3.update(new e(a3, eVar, this, list));
                }
                ae aeVar = this.f96061e;
                if (aeVar == null) {
                    l.a("searchUserAdapter");
                }
                aeVar.d(true);
                if (!z) {
                    ae aeVar2 = this.f96061e;
                    if (aeVar2 == null) {
                        l.a("searchUserAdapter");
                    }
                    aeVar2.ah_();
                } else {
                    ae aeVar3 = this.f96061e;
                    if (aeVar3 == null) {
                        l.a("searchUserAdapter");
                    }
                    aeVar3.ai_();
                }
                TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.dvp);
                l.b(tuxStatusView, "");
                tuxStatusView.setVisibility(8);
                ae aeVar4 = this.f96061e;
                if (aeVar4 == null) {
                    l.a("searchUserAdapter");
                }
                aeVar4.b_(list);
                af afVar = this.f96058b;
                if (afVar == null) {
                    l.a("searchUserPresenter");
                }
                com.ss.android.ugc.aweme.common.e.a e2 = afVar.e();
                l.b(e2, "");
                T t2 = e2.mData;
                Objects.requireNonNull(t2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.SearchApiResult");
                T t3 = t2;
                com.ss.android.ugc.aweme.app.f.d a4 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "find_friends");
                SearchKeywordPresenter searchKeywordPresenter3 = this.f96057a;
                if (searchKeywordPresenter3 == null) {
                    l.a("keywordPresenter");
                }
                r.a("search_user", ac.a(a4.a("search_keyword", searchKeywordPresenter3.a().f105233a).a("log_pb", new com.google.gson.f().b(t3.logPb)).f66730a));
            }
        }
    }

    private /* synthetic */ FriendsSearchResultView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FriendsSearchResultView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(10568);
        LayoutInflater.from(context).inflate(R.layout.a2v, this);
        MethodCollector.o(10568);
    }

    public final void a(com.bytedance.ies.foundation.activity.a aVar, SearchKeywordPresenter searchKeywordPresenter, a aVar2) {
        l.d(aVar, "");
        l.d(searchKeywordPresenter, "");
        l.d(aVar2, "");
        if (!this.f96060d) {
            this.f96060d = true;
            this.f96059c = aVar;
            this.f96062f = aVar2;
            this.f96057a = searchKeywordPresenter;
            af a2 = com.ss.android.ugc.aweme.search.h.f121133a.a(false);
            this.f96058b = a2;
            if (a2 == null) {
                l.a("searchUserPresenter");
            }
            a2.a(this);
            af afVar = this.f96058b;
            if (afVar == null) {
                l.a("searchUserPresenter");
            }
            afVar.a("find_friends_page");
            ae a3 = com.ss.android.ugc.aweme.search.h.f121133a.a(new com.ss.android.ugc.aweme.search.model.d(), searchKeywordPresenter, new b(this, searchKeywordPresenter), null, "find_friends");
            this.f96061e = a3;
            if (a3 == null) {
                l.a("searchUserAdapter");
            }
            a3.a(new c(this, searchKeywordPresenter));
            ae aeVar = this.f96061e;
            if (aeVar == null) {
                l.a("searchUserAdapter");
            }
            aeVar.g(getResources().getColor(R.color.c5));
            ae aeVar2 = this.f96061e;
            if (aeVar2 == null) {
                l.a("searchUserAdapter");
            }
            aeVar2.a(getResources().getString(R.string.fis));
            gh.a((RecyclerView) a(R.id.dv7), 6);
            RecyclerView recyclerView = (RecyclerView) a(R.id.dv7);
            l.b(recyclerView, "");
            getContext();
            recyclerView.setLayoutManager(new WrapLinearLayoutManager());
            RecyclerView recyclerView2 = (RecyclerView) a(R.id.dv7);
            l.b(recyclerView2, "");
            ae aeVar3 = this.f96061e;
            if (aeVar3 == null) {
                l.a("searchUserAdapter");
            }
            Objects.requireNonNull(aeVar3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
            recyclerView2.setAdapter((RecyclerView.a) aeVar3);
            ((RecyclerView) a(R.id.dv7)).a(new d(aVar2));
        }
    }
}
