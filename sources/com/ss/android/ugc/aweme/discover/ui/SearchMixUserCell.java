package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.discover.adapter.al;
import com.ss.android.ugc.aweme.discover.adapter.p;
import com.ss.android.ugc.aweme.discover.mob.o;
import com.ss.android.ugc.aweme.discover.model.SearchMixUserData;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.ui.bb;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.metrics.q;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.search.model.d;
import com.ss.android.ugc.aweme.search.survey.SurveyViewModel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.EventBus;

public class SearchMixUserCell extends bb<SearchMixUserData> implements l {

    /* renamed from: j  reason: collision with root package name */
    public d f82162j;

    /* renamed from: k  reason: collision with root package name */
    RecyclerView f82163k = new RecyclerView(this.f82410a);

    /* renamed from: l  reason: collision with root package name */
    SearchMixUserData f82164l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f82165m;
    public int n;
    private final a o;
    private al p;
    private View q;
    private View r;
    private SearchKeywordPresenter s;

    static {
        Covode.recordClassIndex(51128);
    }

    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        EventBus.a().b(this);
    }

    class a implements com.ss.android.ugc.aweme.following.ui.adapter.d {
        static {
            Covode.recordClassIndex(51129);
        }

        private a() {
        }

        /* synthetic */ a(SearchMixUserCell searchMixUserCell, byte b2) {
            this();
        }

        @Override // com.ss.android.ugc.aweme.following.ui.adapter.d
        public final void a(View view, User user, int i2, String str, String str2) {
            boolean z;
            String keyword;
            String a2;
            SearchMixUserCell searchMixUserCell = SearchMixUserCell.this;
            if (searchMixUserCell.f82164l.users != null) {
                Iterator<SearchUser> it = searchMixUserCell.f82164l.users.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SearchUser next = it.next();
                    if (next.isAladdin() && next.user.getUid().contains(user.getUid())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (SearchMixUserCell.this.f82162j == null) {
                keyword = "";
            } else {
                keyword = SearchMixUserCell.this.f82162j.getKeyword();
            }
            HashMap hashMap = new HashMap();
            if (SearchMixUserCell.this.f82416g != null) {
                hashMap.put("token_type", SearchMixUserCell.this.f82416g.A);
                hashMap.put("search_result_id", SearchMixUserCell.this.f82416g.B);
                hashMap.put("list_item_id", user.getUid());
            }
            String requestId = user.getRequestId();
            String uid = user.getUid();
            String str3 = "aladdin_card";
            if (z) {
                a2 = str3;
            } else {
                a2 = o.a(keyword);
            }
            int i3 = SearchMixUserCell.this.n;
            HashMap hashMap2 = new HashMap();
            if (TextUtils.equals(a2, str3)) {
                hashMap2.put("list_item_id", uid);
            }
            com.ss.android.ugc.aweme.discover.mob.d.a(view, uid, i3, hashMap2);
            q o = ((q) new q().b()).o(o.a(3));
            o.r = requestId;
            q qVar = (q) o.c().b(String.valueOf(i3));
            qVar.q = uid;
            qVar.ac = str;
            qVar.a(hashMap);
            o.a(i2, keyword, requestId, qVar, 3, a2);
            o.a(3, requestId, uid);
            SmartRoute buildRoute = SmartRouter.buildRoute(SearchMixUserCell.this.f82410a, "aweme://user/profile/");
            SmartRoute withParam = buildRoute.withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "general_search").withParam("previous_page", "general_search").withParam("extra_from_pre_page", "general_search").withParam("extra_from_event_enter_from", "general_search").withParam("enter_from_request_id", user.getRequestId()).withParam("extra_previous_page_position", "main_head");
            if (!z) {
                str3 = o.a(keyword);
            }
            withParam.withParam("enter_method", str3).withParam("general_search_card_type", SearchMixUserCell.this.a(user.getUid())).withParam("search_request_id", user.getRequestId());
            if (!TextUtils.isEmpty(str2)) {
                buildRoute.withParam("from_scene", str2);
            }
            buildRoute.open();
            if (SearchMixUserCell.this.f82410a instanceof e) {
                ((SurveyViewModel) ae.a((e) SearchMixUserCell.this.f82410a, (ad.b) null).a(SurveyViewModel.class)).f121648c.postValue(true);
            }
        }
    }

    public final int a(String str) {
        SearchMixUserData searchMixUserData = this.f82164l;
        if (!(searchMixUserData == null || searchMixUserData.users == null)) {
            for (SearchUser searchUser : this.f82164l.users) {
                if (TextUtils.equals(searchUser.user.getUid(), str)) {
                    return searchUser.cardType();
                }
            }
        }
        return 0;
    }

    public SearchMixUserCell(View view, Context context, bb.a aVar) {
        super(view, context, aVar);
        MethodCollector.i(2204);
        this.f82412c.setText(context.getString(R.string.h8g));
        this.q = view.findViewById(R.id.bst);
        this.r = view.findViewById(R.id.fu);
        a aVar2 = new a(this, (byte) 0);
        this.o = aVar2;
        SearchUserLinearLayoutManager searchUserLinearLayoutManager = new SearchUserLinearLayoutManager(this.f82410a);
        searchUserLinearLayoutManager.b(1);
        this.f82163k.setLayoutManager(searchUserLinearLayoutManager);
        if (this.f82163k.getItemAnimator() != null) {
            this.f82163k.getItemAnimator().f3833l = 0;
        }
        this.f82163k.setNestedScrollingEnabled(false);
        this.f82415f.addView(this.f82163k);
        this.s = new SearchKeywordPresenter((e) context);
        al alVar = new al(this.s, aVar2);
        this.p = alVar;
        this.f82163k.setAdapter(alVar);
        MethodCollector.o(2204);
    }

    public final void a(SearchMixUserData searchMixUserData, d dVar, boolean z) {
        String str;
        this.f82164l = searchMixUserData;
        if (!b.a((Collection) searchMixUserData.users)) {
            this.f82162j = dVar;
            ((p) this.p).f80577d = dVar;
            this.p.f80394g = this.f82416g;
            int i2 = 0;
            this.p.d(false);
            if (!TextUtils.isEmpty(searchMixUserData.cardTitle)) {
                this.f82412c.setText(searchMixUserData.cardTitle);
            }
            if (searchMixUserData.hasTopUser) {
                SearchUser searchUser = searchMixUserData.users.get(0);
                if (!(searchUser == null || searchUser.user == null)) {
                    r rVar = this.f82416g;
                    String uid = searchUser.user.getUid();
                    h.f.b.l.d(uid, "");
                    rVar.q = uid;
                    r rVar2 = this.f82416g;
                    User user = searchUser.user;
                    if (user != null) {
                        str = com.ss.android.ugc.aweme.discover.mixfeed.a.e.a(user);
                    } else {
                        str = null;
                    }
                    rVar2.r = str;
                }
                this.p.b_(Collections.singletonList(searchUser));
                this.f82414e.setVisibility(8);
                return;
            }
            r rVar3 = this.f82416g;
            List<SearchUser> list = searchMixUserData.users;
            StringBuilder sb = new StringBuilder();
            if (list != null) {
                for (T t : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        n.a();
                    }
                    T t2 = t;
                    if (i2 != list.size() - 1) {
                        User user2 = t2.user;
                        h.f.b.l.b(user2, "");
                        sb.append(user2.getUid());
                        sb.append(",");
                    } else {
                        User user3 = t2.user;
                        h.f.b.l.b(user3, "");
                        sb.append(user3.getUid());
                    }
                    i2 = i3;
                }
            }
            String sb2 = sb.toString();
            h.f.b.l.b(sb2, "");
            rVar3.q = sb2;
            this.p.b_(searchMixUserData.users);
            a(z);
        }
    }
}
