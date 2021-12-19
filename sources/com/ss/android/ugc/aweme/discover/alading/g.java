package com.ss.android.ugc.aweme.discover.alading;

import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.discover.mixfeed.a.e;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.e.b;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.k.at;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.k.d;
import com.ss.android.ugc.aweme.search.k.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class g implements com.ss.android.ugc.aweme.e.a, b {

    /* renamed from: a  reason: collision with root package name */
    public SearchUser f80758a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.discover.mixfeed.b.a f80759b;

    /* renamed from: c  reason: collision with root package name */
    public r f80760c;

    /* renamed from: d  reason: collision with root package name */
    private View f80761d;

    /* renamed from: e  reason: collision with root package name */
    private RecyclerView f80762e;

    /* renamed from: f  reason: collision with root package name */
    private View f80763f;

    /* renamed from: g  reason: collision with root package name */
    private com.ss.android.ugc.aweme.discover.mixfeed.c.a f80764g;

    static {
        Covode.recordClassIndex(50224);
    }

    @Override // com.ss.android.ugc.aweme.e.b
    public final void aN_() {
        this.f80761d.setVisibility(8);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f80766a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f80767b;

        static {
            Covode.recordClassIndex(50226);
        }

        a(g gVar, User user) {
            this.f80766a = gVar;
            this.f80767b = user;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            r rVar = this.f80766a.f80760c;
            if (rVar == null) {
                rVar = r.a.a();
            }
            at b2 = com.ss.android.ugc.aweme.discover.mixfeed.b.b.b(rVar);
            User user = this.f80767b;
            Integer num = null;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            d dVar = (d) b2.g(str);
            User user2 = this.f80767b;
            if (user2 != null) {
                str2 = user2.getUniqueId();
            } else {
                str2 = null;
            }
            d dVar2 = (d) dVar.u(str2);
            User user3 = this.f80767b;
            if (user3 != null) {
                str3 = e.a(user3);
            } else {
                str3 = null;
            }
            d dVar3 = (d) ((d) ((d) dVar2.t(str3)).r("user")).d((Integer) 0);
            User user4 = this.f80767b;
            if (user4 != null) {
                str4 = user4.getUid();
            } else {
                str4 = null;
            }
            d dVar4 = (d) dVar3.v(str4);
            User user5 = this.f80767b;
            if (user5 != null) {
                str5 = user5.getSearchUserName();
            } else {
                str5 = null;
            }
            c s = dVar4.s(str5);
            r rVar2 = this.f80766a.f80760c;
            if (rVar2 != null) {
                str6 = rVar2.q;
            } else {
                str6 = null;
            }
            at B = ((at) ((d) s.l(str6)).x("musician").o("general_search")).B("click_all_song");
            r rVar3 = this.f80766a.f80760c;
            if (rVar3 != null) {
                num = Integer.valueOf(rVar3.f121278m);
            }
            B.a(num).f();
            return z.f158842a;
        }
    }

    public g(ViewStub viewStub) {
        l.d(viewStub, "");
        MethodCollector.i(1799);
        viewStub.setLayoutResource(R.layout.aww);
        View inflate = viewStub.inflate();
        l.b(inflate, "");
        this.f80761d = inflate;
        View findViewById = inflate.findViewById(R.id.cpo);
        l.b(findViewById, "");
        this.f80762e = (RecyclerView) findViewById;
        View findViewById2 = this.f80761d.findViewById(R.id.fi7);
        l.b(findViewById2, "");
        this.f80763f = findViewById2;
        RecyclerView recyclerView = this.f80762e;
        this.f80761d.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        com.ss.android.ugc.aweme.discover.mixfeed.c.a aVar = new com.ss.android.ugc.aweme.discover.mixfeed.c.a();
        this.f80764g = aVar;
        this.f80762e.setAdapter(aVar);
        this.f80763f.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.discover.alading.g.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f80765a;

            static {
                Covode.recordClassIndex(50225);
            }

            {
                this.f80765a = r1;
            }

            public final void onClick(View view) {
                SearchUser searchUser;
                User user;
                User user2;
                ClickAgent.onClick(view);
                if (view != null && !com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && (searchUser = this.f80765a.f80758a) != null && (user = searchUser.user) != null) {
                    SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "general_search").withParam("enter_from_request_id", user.getRequestId()).withParam("extra_previous_page_position", "main_head").withParam("enter_method", "click_search_result").withParam("general_search_card_type", 2).open();
                    g gVar = this.f80765a;
                    SearchUser searchUser2 = gVar.f80758a;
                    if (searchUser2 != null) {
                        user2 = searchUser2.user;
                    } else {
                        user2 = null;
                    }
                    i.b(new a(gVar, user2), com.ss.android.ugc.aweme.cw.g.c());
                }
            }
        });
        MethodCollector.o(1799);
    }

    @Override // com.ss.android.ugc.aweme.e.b
    public final void a(SearchUser searchUser) {
        this.f80758a = searchUser;
        if (searchUser != null) {
            List<Music> list = searchUser.musicCards;
            int i2 = 0;
            if (!(list == null || list.isEmpty())) {
                com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar = this.f80759b;
                if (aVar != null) {
                    aVar.setUser(searchUser.user);
                }
                this.f80764g.a(this.f80759b, this.f80760c);
                this.f80761d.setVisibility(0);
                ArrayList arrayList = new ArrayList();
                List<Music> list2 = searchUser.musicCards;
                l.b(list2, "");
                for (T t : list2) {
                    if (i2 >= 3) {
                        break;
                    }
                    l.b(t, "");
                    arrayList.add(t);
                    i2++;
                }
                com.ss.android.ugc.aweme.discover.mixfeed.c.a aVar2 = this.f80764g;
                aVar2.f81648a.clear();
                if (!arrayList.isEmpty()) {
                    aVar2.f81648a.addAll(arrayList);
                }
                aVar2.notifyDataSetChanged();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.e.a
    public final void a(com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar, r rVar) {
        this.f80759b = aVar;
        this.f80760c = rVar;
    }
}
