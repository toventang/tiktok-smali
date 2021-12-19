package com.ss.android.ugc.aweme.discover.alading;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.discover.alading.a.e;
import com.ss.android.ugc.aweme.discover.api.SearchContinuousLoadingApi;
import com.ss.android.ugc.aweme.discover.helper.x;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.k.at;
import com.ss.android.ugc.aweme.search.k.au;
import com.ss.android.ugc.aweme.search.k.d;
import com.ss.android.ugc.aweme.search.k.r;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class f extends e implements x.b, com.ss.android.ugc.aweme.e.b {

    /* renamed from: a  reason: collision with root package name */
    public SearchUser f80756a;

    /* renamed from: b  reason: collision with root package name */
    private final h f80757b = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(50221);
    }

    private final x f() {
        return (x) this.f80757b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.e.b
    public final void aN_() {
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final int c() {
        return 65458;
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final String d() {
        return "video";
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.x.b
    public final Object aJ_() {
        return this.f80756a;
    }

    static final class a extends m implements h.f.a.a<x> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(50222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ x invoke() {
            return x.a.a(this.this$0);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final String b() {
        List<Music> list;
        SearchUser searchUser = this.f80756a;
        if (searchUser == null || (list = searchUser.musicCards) == null || list.isEmpty()) {
            return "hot_user";
        }
        return "musician";
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final String e() {
        String str;
        User user;
        SearchUser searchUser = this.f80756a;
        if (searchUser == null || (user = searchUser.user) == null) {
            str = null;
        } else {
            str = user.getUid();
        }
        return String.valueOf(str);
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.x.b
    public final List<Aweme> aK_() {
        List<Aweme> list;
        SearchUser searchUser = this.f80756a;
        if (!(searchUser == null || (list = searchUser.awemeCards) == null)) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                l.b(t2, "");
                if (!t2.isLive()) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2 != null) {
                return n.g((Collection) arrayList2);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.x.b
    public final List<Aweme> aL_() {
        List<Aweme> list;
        SearchUser searchUser = this.f80756a;
        if (!(searchUser == null || (list = searchUser.awemeCards) == null)) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                l.b(t2, "");
                if (t2.isLive()) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2 != null) {
                return n.g((Collection) arrayList2);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.x.b
    public final int aM_() {
        int i2;
        List<Aweme> list;
        SearchUser searchUser = this.f80756a;
        if (!(searchUser == null || (list = searchUser.awemeCards) == null)) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                l.b(t2, "");
                if (t2.isLive()) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2 != null) {
                i2 = arrayList2.size();
                return 10 - i2;
            }
        }
        i2 = 0;
        return 10 - i2;
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final void a() {
        User user;
        SearchUser searchUser = this.f80756a;
        if (searchUser != null && (user = searchUser.user) != null) {
            View view = this.f80747j.itemView;
            l.b(view, "");
            SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "general_search").withParam("enter_from_request_id", user.getRequestId()).withParam("extra_previous_page_position", "main_head").withParam("enter_method", "click_search_result").withParam("general_search_card_type", 1).open();
            View view2 = this.f80747j.itemView;
            l.b(view2, "");
            ((at) ((d) ((d) ((d) ((d) ((d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.b(j.a.a(view2)).x(b()).l(this.f80746i.q)).r("user")).s(user.getSearchUserName())).v(user.getUid()).g(e())).t(com.ss.android.ugc.aweme.discover.mixfeed.a.e.a(user))).w("1")).B("click_see_all").u(user.getUniqueId()).f();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(d dVar) {
        super(dVar);
        l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.e.b
    public final void a(SearchUser searchUser) {
        l.d(searchUser, "");
        this.f80756a = searchUser;
        if (searchUser == null) {
            l.b();
        }
        List<Aweme> list = searchUser.awemeCards;
        if (list == null) {
            list = Collections.emptyList();
            l.b(list, "");
        }
        a(list);
    }

    @Override // com.ss.android.ugc.aweme.discover.helper.x.b
    public final boolean a(Aweme aweme) {
        l.d(aweme, "");
        List<Aweme> aK_ = aK_();
        if (aK_ == null) {
            return false;
        }
        Iterator<T> it = aK_.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().getAid(), aweme.getAid())) {
                return true;
            }
        }
        return false;
    }

    static final class b extends m implements h.f.a.m<Aweme, List<Aweme>, z> {
        final /* synthetic */ ag $event;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(50223);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, ag agVar) {
            super(2);
            this.this$0 = fVar;
            this.$event = agVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Aweme aweme, List<Aweme> list) {
            Aweme aweme2 = aweme;
            List<Aweme> list2 = list;
            l.d(aweme2, "");
            SearchUser searchUser = this.this$0.f80756a;
            if (searchUser != null) {
                if (list2 != null) {
                    searchUser.awemeCards = list2;
                    this.this$0.a(list2);
                }
                f.super.a((f) this.$event, (ag) aweme2);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final au a(Aweme aweme, Integer num) {
        String str;
        User user;
        User user2;
        au a2 = super.a(aweme, num);
        SearchUser searchUser = this.f80756a;
        String str2 = null;
        if (searchUser == null || (user2 = searchUser.user) == null) {
            str = null;
        } else {
            str = user2.getUniqueId();
        }
        d dVar = (d) a2.c("user_name", String.valueOf(str));
        SearchUser searchUser2 = this.f80756a;
        if (!(searchUser2 == null || (user = searchUser2.user) == null)) {
            str2 = com.ss.android.ugc.aweme.discover.mixfeed.a.e.a(user);
        }
        return (au) dVar.t(str2).l(this.f80746i.q);
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final void a(ag agVar, Aweme aweme) {
        l.d(agVar, "");
        l.d(aweme, "");
        x f2 = f();
        if (f2 != null) {
            f2.a(agVar, aweme, new b(this, agVar));
        } else {
            super.a(agVar, aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final at a(Aweme aweme, Integer num, String str) {
        String str2;
        User user;
        User user2;
        l.d(str, "");
        at a2 = super.a(aweme, num, str);
        SearchUser searchUser = this.f80756a;
        String str3 = null;
        if (searchUser == null || (user2 = searchUser.user) == null) {
            str2 = null;
        } else {
            str2 = user2.getUniqueId();
        }
        d dVar = (d) a2.c("user_name", String.valueOf(str2));
        SearchUser searchUser2 = this.f80756a;
        if (!(searchUser2 == null || (user = searchUser2.user) == null)) {
            str3 = com.ss.android.ugc.aweme.discover.mixfeed.a.e.a(user);
        }
        return (at) dVar.t(str3).l(this.f80746i.q);
    }

    @Override // com.ss.android.ugc.aweme.discover.alading.a.e
    public final void a(Aweme aweme, View view, List<? extends Aweme> list) {
        User user;
        l.d(aweme, "");
        l.d(view, "");
        l.d(list, "");
        x f2 = f();
        if (f2 != null) {
            r a2 = j.a.a(view);
            String str = null;
            com.ss.android.ugc.aweme.discover.mob.d.a(view, e(), a2.f121278m, null);
            Context context = view.getContext();
            l.b(context, "");
            Bundle b2 = b(aweme, view);
            SearchContinuousLoadingApi.b bVar = new SearchContinuousLoadingApi.b();
            bVar.f80793a = a2.f121271f;
            bVar.f80794b = 4;
            SearchUser searchUser = this.f80756a;
            if (!(searchUser == null || (user = searchUser.user) == null)) {
                str = user.getUid();
            }
            bVar.f80795c = str;
            f2.a(context, b2, bVar);
            return;
        }
        super.a(aweme, view, list);
    }
}
