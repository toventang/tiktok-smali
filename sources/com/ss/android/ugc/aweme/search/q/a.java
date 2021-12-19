package com.ss.android.ugc.aweme.search.q;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.mix.api.g;
import com.ss.android.ugc.aweme.mix.api.h;
import com.ss.android.ugc.aweme.mix.model.d;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.k.at;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.search.n.e;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public r f121556a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.discover.mixfeed.b.a f121557b;

    /* renamed from: c  reason: collision with root package name */
    public View f121558c;

    /* renamed from: d  reason: collision with root package name */
    private List<d> f121559d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private SearchUser f121560e;

    /* renamed from: f  reason: collision with root package name */
    private h f121561f;

    /* renamed from: g  reason: collision with root package name */
    private final C3141a f121562g = new C3141a(this);

    /* renamed from: h  reason: collision with root package name */
    private final ViewGroup f121563h;

    static {
        Covode.recordClassIndex(79179);
    }

    public final View a() {
        RecyclerView.ViewHolder viewHolder;
        View view = this.f121558c;
        if (view != null) {
            return view;
        }
        RecyclerView.ViewHolder a2 = MixFeedService.k().a(this.f121563h, false, true, "general_search", (g) this.f121562g);
        if (!(a2 instanceof h)) {
            viewHolder = null;
        } else {
            viewHolder = a2;
        }
        h hVar = (h) viewHolder;
        if (hVar != null) {
            this.f121561f = hVar;
            View view2 = a2.itemView;
            this.f121558c = view2;
            l.b(view2, "");
            return view2;
        }
        throw new IllegalStateException("Unknown playlist view holder");
    }

    /* renamed from: com.ss.android.ugc.aweme.search.q.a$a  reason: collision with other inner class name */
    public static final class C3141a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f121564a;

        static {
            Covode.recordClassIndex(79180);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3141a(a aVar) {
            this.f121564a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.mix.api.g
        public final void a(String str, String str2, Integer num) {
            String searchResultId;
            String str3;
            String str4;
            r rVar = this.f121564a.f121556a;
            if (rVar != null) {
                a aVar = this.f121564a;
                String str5 = rVar.f121275j;
                String str6 = rVar.f121274i;
                String str7 = rVar.f121271f;
                String str8 = rVar.f121272g;
                int i2 = rVar.f121278m;
                c a2 = new at(rVar).d(str5).a(str6);
                com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar2 = aVar.f121557b;
                String str9 = null;
                if (aVar2 != null) {
                    str3 = aVar2.getSearchResultId();
                } else {
                    str3 = null;
                }
                com.ss.android.ugc.aweme.search.k.d dVar = (com.ss.android.ugc.aweme.search.k.d) a2.g(str3).b(str7).a(Integer.valueOf(i2)).o(str8);
                com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar3 = aVar.f121557b;
                if (aVar3 == null || !aVar3.isAladdin()) {
                    str4 = "0";
                } else {
                    str4 = "1";
                }
                com.ss.android.ugc.aweme.search.k.d dVar2 = (com.ss.android.ugc.aweme.search.k.d) dVar.w(str4);
                com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar4 = aVar.f121557b;
                if (aVar4 != null) {
                    str9 = aVar4.getTokenType();
                }
                ((at) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) ((com.ss.android.ugc.aweme.search.k.d) dVar2.x(str9)).r("playlist")).v(str)).s(str2)).d(num)).B("click_playlist").f();
            }
            p[] pVarArr = new p[3];
            pVarArr[0] = v.a("is_from_video", "0");
            String str10 = "";
            if (str == null) {
                str = str10;
            }
            pVarArr[1] = v.a("list_item_id", str);
            com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar5 = this.f121564a.f121557b;
            if (!(aVar5 == null || (searchResultId = aVar5.getSearchResultId()) == null)) {
                str10 = searchResultId;
            }
            pVarArr[2] = v.a("search_result_id", str10);
            e.a.a(ag.a(pVarArr));
        }
    }

    public a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        this.f121563h = viewGroup;
    }

    public final void a(SearchUser searchUser) {
        long j2;
        boolean z;
        String str;
        User user;
        User user2;
        Boolean bool;
        Long l2;
        if (!(searchUser == null || searchUser.playlists == null)) {
            this.f121559d.clear();
            this.f121560e = searchUser;
            for (d dVar : searchUser.playlists) {
                if (dVar != null) {
                    this.f121559d.add(dVar);
                }
            }
            com.ss.android.ugc.aweme.mix.model.a aVar = new com.ss.android.ugc.aweme.mix.model.a();
            aVar.setMixList(this.f121559d);
            SearchUser searchUser2 = this.f121560e;
            if (searchUser2 == null || (l2 = searchUser2.mixCursor) == null) {
                j2 = 0;
            } else {
                j2 = l2.longValue();
            }
            aVar.setCursor(j2);
            SearchUser searchUser3 = this.f121560e;
            if (searchUser3 == null || (bool = searchUser3.mixHasMore) == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            aVar.setHasMore(z);
            com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar2 = this.f121557b;
            String str2 = null;
            aVar.setKeyWord(aVar2 != null ? aVar2.getSearchKeyWord() : null);
            r rVar = this.f121556a;
            aVar.setSearchId(rVar != null ? rVar.f121274i : null);
            com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar3 = this.f121557b;
            aVar.setSearchResultId(aVar3 != null ? aVar3.getSearchResultId() : null);
            r rVar2 = this.f121556a;
            aVar.setSearchType(rVar2 != null ? rVar2.f121269d : null);
            h hVar = this.f121561f;
            if (hVar != null) {
                SearchUser searchUser4 = this.f121560e;
                if (searchUser4 == null || (user2 = searchUser4.user) == null || (str = user2.getUid()) == null) {
                    str = "";
                }
                SearchUser searchUser5 = this.f121560e;
                if (!(searchUser5 == null || (user = searchUser5.user) == null)) {
                    str2 = user.getSecUid();
                }
                hVar.a(str, str2, aVar);
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar, r rVar) {
        this.f121557b = aVar;
        this.f121556a = rVar;
    }
}
