package com.ss.android.ugc.aweme.comment;

import android.text.Editable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.CommentAtSummonFriendItem;
import com.ss.android.ugc.aweme.comment.model.CommentAtSummonFriendList;
import com.ss.android.ugc.aweme.comment.model.CommentAtUser;
import com.ss.android.ugc.aweme.comment.util.w;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.ss.android.ugc.aweme.friends.model.RecentFriendModel;
import com.ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.ss.android.ugc.aweme.search.service.SearchUserService;
import com.ss.android.ugc.aweme.utils.ai;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import f.a.t;
import f.a.z;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.m.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final C1607a f71254h = new C1607a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f71255a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.adapter.b f71256b;

    /* renamed from: c  reason: collision with root package name */
    public CommentAtSummonFriendList f71257c = new CommentAtSummonFriendList(new ArrayList(), 0, false, "");

    /* renamed from: d  reason: collision with root package name */
    final HashMap<String, CommentAtSummonFriendList> f71258d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public CommentAtSummonFriendList f71259e = new CommentAtSummonFriendList(new ArrayList(), 0, false, "");

    /* renamed from: f  reason: collision with root package name */
    public String f71260f = "";

    /* renamed from: g  reason: collision with root package name */
    public final w f71261g = new w();

    /* renamed from: i  reason: collision with root package name */
    private CommentAtSummonFriendList f71262i = new CommentAtSummonFriendList(new ArrayList(), 0, false, "");

    /* renamed from: j  reason: collision with root package name */
    private final h.h f71263j = i.a((h.f.a.a) h.f71288a);

    public interface b {
        static {
            Covode.recordClassIndex(43867);
        }

        void a();

        void a(boolean z);

        boolean a(String str);

        void b();

        void c();
    }

    static {
        Covode.recordClassIndex(43865);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a$a  reason: collision with other inner class name */
    public static final class C1607a {
        static {
            Covode.recordClassIndex(43866);
        }

        private C1607a() {
        }

        public /* synthetic */ C1607a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, CommentAtSummonFriendList commentAtSummonFriendList, int i2) {
        CommentAtSummonFriendList commentAtSummonFriendList2;
        List<CommentAtSummonFriendItem> list;
        if (i2 == 0) {
            this.f71258d.put(str, commentAtSummonFriendList);
            CommentAtSummonFriendList commentAtSummonFriendList3 = this.f71258d.get(str);
            if (commentAtSummonFriendList3 != null) {
                commentAtSummonFriendList3.keyword = str;
            }
        } else if (i2 == 1) {
            if (this.f71258d.get(str) == null || (commentAtSummonFriendList2 = this.f71258d.get(str)) == null || commentAtSummonFriendList2.items == null) {
                this.f71258d.put(str, commentAtSummonFriendList);
                CommentAtSummonFriendList commentAtSummonFriendList4 = this.f71258d.get(str);
                if (commentAtSummonFriendList4 != null) {
                    commentAtSummonFriendList4.keyword = str;
                    return;
                }
                return;
            }
            CommentAtSummonFriendList commentAtSummonFriendList5 = this.f71258d.get(str);
            if (!(commentAtSummonFriendList5 == null || (list = commentAtSummonFriendList5.items) == null)) {
                List<CommentAtSummonFriendItem> list2 = commentAtSummonFriendList.items;
                l.b(list2, "");
                list.addAll(list2);
            }
            CommentAtSummonFriendList commentAtSummonFriendList6 = this.f71258d.get(str);
            if (commentAtSummonFriendList6 != null) {
                commentAtSummonFriendList6.cursor = commentAtSummonFriendList.cursor;
            }
            CommentAtSummonFriendList commentAtSummonFriendList7 = this.f71258d.get(str);
            if (commentAtSummonFriendList7 != null) {
                commentAtSummonFriendList7.keyword = str;
            }
            CommentAtSummonFriendList commentAtSummonFriendList8 = this.f71258d.get(str);
            if (commentAtSummonFriendList8 != null) {
                commentAtSummonFriendList8.hasMore = commentAtSummonFriendList.hasMore;
            }
        }
    }

    static final class h extends m implements h.f.a.a<ISearchUserService> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f71288a = new h();

        static {
            Covode.recordClassIndex(43873);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ISearchUserService invoke() {
            return SearchUserService.b();
        }
    }

    public final b a() {
        b bVar = this.f71255a;
        if (bVar == null) {
            l.a("listener");
        }
        return bVar;
    }

    public final com.ss.android.ugc.aweme.comment.adapter.b b() {
        com.ss.android.ugc.aweme.comment.adapter.b bVar = this.f71256b;
        if (bVar == null) {
            l.a("adapter");
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        b bVar = this.f71255a;
        if (bVar == null) {
            l.a("listener");
        }
        bVar.a();
    }

    private final void d() {
        this.f71259e = new CommentAtSummonFriendList(new ArrayList(), 0, false, "");
        com.ss.android.ugc.aweme.comment.adapter.b bVar = this.f71256b;
        if (bVar == null) {
            l.a("adapter");
        }
        bVar.b_(this.f71259e.items);
        com.ss.android.ugc.aweme.comment.adapter.b bVar2 = this.f71256b;
        if (bVar2 == null) {
            l.a("adapter");
        }
        bVar2.notifyDataSetChanged();
    }

    public static final class c implements w.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f71269a;

        static {
            Covode.recordClassIndex(43868);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c(a aVar) {
            this.f71269a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.comment.util.w.a
        public final void a(String str) {
            l.d(str, "");
            this.f71269a.a(str, 0);
        }
    }

    public static final class e implements z<SummonFriendList> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f71277a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f71278b;

        static {
            Covode.recordClassIndex(43870);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(SummonFriendList summonFriendList) {
            SummonFriendList summonFriendList2 = summonFriendList;
            l.d(summonFriendList2, "");
            this.f71277a.b().ai_();
            a aVar = this.f71277a;
            CommentAtSummonFriendList commonAtSummonFriendList = CommentAtSummonFriendList.toCommonAtSummonFriendList(summonFriendList2);
            l.b(commonAtSummonFriendList, "");
            aVar.a(commonAtSummonFriendList, this.f71278b);
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            this.f71277a.b().ai_();
            this.f71277a.b().j();
            this.f71277a.a().a(true);
            if (this.f71278b == 0) {
                this.f71277a.a().c();
            }
        }

        e(a aVar, int i2) {
            this.f71277a = aVar;
            this.f71278b = i2;
        }
    }

    public static final class f implements z<RecentFriendModel> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f71279a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f71280b;

        static {
            Covode.recordClassIndex(43871);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            this.f71279a.b().ai_();
            this.f71279a.b().i();
            this.f71279a.a().a(true);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(RecentFriendModel recentFriendModel) {
            String str;
            RecentFriendModel recentFriendModel2 = recentFriendModel;
            l.d(recentFriendModel2, "");
            this.f71279a.b().ai_();
            SummonFriendList summonFriendList = new SummonFriendList(new ArrayList(), recentFriendModel2.cursor, recentFriendModel2.hasMore, "");
            ArrayList arrayList = new ArrayList();
            for (T t : recentFriendModel2.blockResults) {
                if (t.f68757b.get(0).f68759b == 1) {
                    arrayList.add(t.f68756a);
                }
            }
            for (T t2 : recentFriendModel2.users) {
                List<CommentAtSummonFriendItem> list = this.f71279a.f71257c.items;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        l.b(next, "");
                        CommentAtUser commentAtUser = next.mUser;
                        if (commentAtUser != null) {
                            str = commentAtUser.uid;
                        } else {
                            str = null;
                        }
                        if (l.a((Object) str, (Object) t2.getUid())) {
                            break;
                        }
                    }
                }
                SummonFriendItem summonFriendItem = new SummonFriendItem();
                summonFriendItem.mUser = t2;
                summonFriendItem.isMentionBlocked = arrayList.contains(t2.getUid());
                summonFriendList.items.add(summonFriendItem);
            }
            a aVar = this.f71279a;
            CommentAtSummonFriendList commonAtSummonFriendList = CommentAtSummonFriendList.toCommonAtSummonFriendList(summonFriendList);
            l.b(commonAtSummonFriendList, "");
            aVar.a(commonAtSummonFriendList, this.f71280b);
        }

        f(a aVar, int i2) {
            this.f71279a = aVar;
            this.f71280b = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f71282a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f71283b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f71284c;

        static {
            Covode.recordClassIndex(43872);
        }

        g(a aVar, String str, int i2) {
            this.f71282a = aVar;
            this.f71283b = str;
            this.f71284c = i2;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            Integer num;
            if (ai.a(iVar)) {
                l.b(iVar, "");
                Object d2 = iVar.d();
                l.b(d2, "");
                this.f71282a.b().ai_();
                a aVar = this.f71282a;
                String str = this.f71283b;
                CommentAtSummonFriendList fromSearchSug = CommentAtSummonFriendList.fromSearchSug((com.ss.android.ugc.aweme.search.model.h) d2, str);
                l.b(fromSearchSug, "");
                aVar.a(str, fromSearchSug, this.f71284c);
                b bVar = aVar.f71255a;
                if (bVar == null) {
                    l.a("listener");
                }
                if (bVar.a(str)) {
                    com.ss.android.ugc.aweme.comment.adapter.b bVar2 = aVar.f71256b;
                    if (bVar2 == null) {
                        l.a("adapter");
                    }
                    bVar2.f71341b = 1;
                    b bVar3 = aVar.f71255a;
                    if (bVar3 == null) {
                        l.a("listener");
                    }
                    bVar3.a(true);
                    com.ss.android.ugc.aweme.comment.adapter.b bVar4 = aVar.f71256b;
                    if (bVar4 == null) {
                        l.a("adapter");
                    }
                    bVar4.d(fromSearchSug.hasMore);
                    CommentAtSummonFriendList commentAtSummonFriendList = aVar.f71258d.get(str);
                    if (commentAtSummonFriendList != null) {
                        aVar.f71259e = commentAtSummonFriendList;
                        com.ss.android.ugc.aweme.comment.adapter.b bVar5 = aVar.f71256b;
                        if (bVar5 == null) {
                            l.a("adapter");
                        }
                        bVar5.b_(aVar.f71259e.items);
                        List<CommentAtSummonFriendItem> list = aVar.f71259e.items;
                        if (list == null || list.isEmpty()) {
                            aVar.c();
                        }
                        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("search_position", "comments").a("new_sug_session_id", com.ss.android.ugc.aweme.comment.m.e.f72111a).a("impr_id", fromSearchSug.requestId).a("raw_query", str);
                        com.ss.android.ugc.aweme.comment.adapter.b bVar6 = aVar.f71256b;
                        if (bVar6 == null) {
                            l.a("adapter");
                        }
                        List e2 = bVar6.e();
                        if (e2 != null) {
                            num = Integer.valueOf(e2.size());
                        } else {
                            num = null;
                        }
                        r.a("trending_show", a2.a("words_num", num).f66730a);
                    }
                }
            } else {
                this.f71282a.b().ai_();
                this.f71282a.b().i();
                this.f71282a.a().a(true);
                if (this.f71284c == 0) {
                    this.f71282a.a().c();
                }
            }
            return h.z.f158842a;
        }
    }

    public final void a(long j2, int i2) {
        if (i2 == 0) {
            t.a(SummonFriendApi.f96818a.queryRecentFriends4AtV2(3), SummonFriendApi.a(20, (int) j2), new d(this, new ArrayList())).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b((z) new e(this, i2));
            return;
        }
        SummonFriendApi.a(20, (int) j2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new f(this, i2));
    }

    /* access modifiers changed from: package-private */
    public static final class d<T1, T2, R> implements f.a.d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f71274a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f71275b;

        static {
            Covode.recordClassIndex(43869);
        }

        d(a aVar, List list) {
            this.f71274a = aVar;
            this.f71275b = list;
        }

        @Override // f.a.d.c
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            com.ss.android.ugc.aweme.bq.a.d dVar = (com.ss.android.ugc.aweme.bq.a.d) obj;
            RecentFriendModel recentFriendModel = (RecentFriendModel) obj2;
            l.d(dVar, "");
            l.d(recentFriendModel, "");
            SummonFriendList summonFriendList = new SummonFriendList(new ArrayList(), 0, false, "");
            this.f71274a.f71257c.items.clear();
            for (T t : dVar.f68762b) {
                if (t.f68757b.get(0).f68759b == 1) {
                    this.f71275b.add(t.f68756a);
                }
            }
            for (T t2 : recentFriendModel.blockResults) {
                if (t2.f68757b.get(0).f68759b == 1 && !this.f71275b.contains(t2.f68756a)) {
                    this.f71275b.add(t2.f68756a);
                }
            }
            for (T t3 : dVar.f68761a) {
                List<User> list = recentFriendModel.users;
                ArrayList<Object> arrayList = new ArrayList();
                for (T t4 : list) {
                    if (l.a((Object) t3.getUid(), (Object) t4.getUid())) {
                        arrayList.add(t4);
                    }
                }
                for (Object obj3 : arrayList) {
                    recentFriendModel.users.remove(obj3);
                }
                SummonFriendItem summonFriendItem = new SummonFriendItem();
                summonFriendItem.mUser = t3;
                summonFriendItem.type = 4;
                summonFriendItem.isMentionBlocked = this.f71275b.contains(t3.getUid());
                summonFriendList.items.add(summonFriendItem);
                this.f71274a.f71257c.items.add(CommentAtSummonFriendItem.toCommentAtSummonFriendItem(summonFriendItem));
            }
            for (T t5 : recentFriendModel.users) {
                SummonFriendItem summonFriendItem2 = new SummonFriendItem();
                summonFriendItem2.mUser = t5;
                summonFriendItem2.type = 3;
                summonFriendItem2.isMentionBlocked = this.f71275b.contains(t5.getUid());
                summonFriendList.items.add(summonFriendItem2);
            }
            summonFriendList.cursor = recentFriendModel.cursor;
            summonFriendList.hasMore = recentFriendModel.hasMore;
            return summonFriendList;
        }
    }

    public final void a(int i2, Editable editable) {
        List<CommentAtSummonFriendItem> list;
        boolean z;
        String a2 = a(i2, editable, true);
        if (a2 == null) {
            c();
            return;
        }
        b bVar = this.f71255a;
        if (bVar == null) {
            l.a("listener");
        }
        bVar.b();
        this.f71259e.keyword = a2;
        if (this.f71258d.containsKey(a2)) {
            CommentAtSummonFriendList commentAtSummonFriendList = this.f71258d.get(a2);
            if (commentAtSummonFriendList == null || (list = commentAtSummonFriendList.items) == null || list.isEmpty()) {
                c();
                return;
            }
            if (a2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                com.ss.android.ugc.aweme.comment.adapter.b bVar2 = this.f71256b;
                if (bVar2 == null) {
                    l.a("adapter");
                }
                bVar2.f71341b = 0;
            } else {
                com.ss.android.ugc.aweme.comment.adapter.b bVar3 = this.f71256b;
                if (bVar3 == null) {
                    l.a("adapter");
                }
                bVar3.f71341b = 1;
            }
            b bVar4 = this.f71255a;
            if (bVar4 == null) {
                l.a("listener");
            }
            bVar4.a(true);
            this.f71259e = commentAtSummonFriendList;
            commentAtSummonFriendList.keyword = a2;
            com.ss.android.ugc.aweme.comment.adapter.b bVar5 = this.f71256b;
            if (bVar5 == null) {
                l.a("adapter");
            }
            bVar5.b_(commentAtSummonFriendList.items);
            com.ss.android.ugc.aweme.comment.adapter.b bVar6 = this.f71256b;
            if (bVar6 == null) {
                l.a("adapter");
            }
            bVar6.d(commentAtSummonFriendList.hasMore);
        } else if (a2.length() == 0) {
            d();
            b bVar7 = this.f71255a;
            if (bVar7 == null) {
                l.a("listener");
            }
            bVar7.a(false);
            a(0, 0);
        } else {
            d();
            b bVar8 = this.f71255a;
            if (bVar8 == null) {
                l.a("listener");
            }
            bVar8.a(false);
            w wVar = this.f71261g;
            l.d(a2, "");
            w.b bVar9 = wVar.f72888a;
            if (bVar9 != null) {
                bVar9.a(a2);
            }
        }
    }

    public final void a(CommentAtSummonFriendList commentAtSummonFriendList, int i2) {
        a("", commentAtSummonFriendList, i2);
        b bVar = this.f71255a;
        if (bVar == null) {
            l.a("listener");
        }
        if (bVar.a("")) {
            com.ss.android.ugc.aweme.comment.adapter.b bVar2 = this.f71256b;
            if (bVar2 == null) {
                l.a("adapter");
            }
            bVar2.f71341b = 0;
            b bVar3 = this.f71255a;
            if (bVar3 == null) {
                l.a("listener");
            }
            bVar3.a(true);
            com.ss.android.ugc.aweme.comment.adapter.b bVar4 = this.f71256b;
            if (bVar4 == null) {
                l.a("adapter");
            }
            bVar4.d(commentAtSummonFriendList.hasMore);
            CommentAtSummonFriendList commentAtSummonFriendList2 = this.f71258d.get("");
            if (commentAtSummonFriendList2 != null) {
                this.f71262i = commentAtSummonFriendList2;
                if (i2 == 0) {
                    com.ss.android.ugc.aweme.comment.adapter.b bVar5 = this.f71256b;
                    if (bVar5 == null) {
                        l.a("adapter");
                    }
                    bVar5.b_(this.f71262i.items);
                    this.f71259e = this.f71262i;
                } else {
                    this.f71259e = commentAtSummonFriendList2;
                    com.ss.android.ugc.aweme.comment.adapter.b bVar6 = this.f71256b;
                    if (bVar6 == null) {
                        l.a("adapter");
                    }
                    bVar6.b_(this.f71259e.items);
                }
                List<CommentAtSummonFriendItem> list = this.f71259e.items;
                if (list != null && !list.isEmpty()) {
                    return;
                }
            }
            c();
        }
    }

    public final void a(String str, int i2) {
        ArrayList arrayList;
        List<CommentAtSummonFriendItem> list;
        CommentAtUser commentAtUser;
        String str2;
        l.d(str, "");
        CommentAtSummonFriendList commentAtSummonFriendList = this.f71258d.get(str);
        if (commentAtSummonFriendList == null || (list = commentAtSummonFriendList.items) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (T t : list) {
                if (!(t == null || (commentAtUser = t.mUser) == null || (str2 = commentAtUser.uid) == null)) {
                    arrayList2.add(str2);
                }
            }
            arrayList = arrayList2;
        }
        ((ISearchUserService) this.f71263j.getValue()).a(new com.ss.android.ugc.aweme.search.model.g(3, null, str, "comment_user", 10, arrayList)).a(new g(this, str, i2), b.i.f4826c, null);
    }

    public static String a(int i2, Editable editable, boolean z) {
        boolean z2;
        if (editable == null || editable.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && i2 != 0) {
            Object obj = null;
            for (Object obj2 : h.j.h.a(0, i2)) {
                if (editable.charAt(((Number) obj2).intValue()) == '@') {
                    obj = obj2;
                }
            }
            Integer num = (Integer) obj;
            if (num != null) {
                int intValue = num.intValue();
                MentionEditText.MentionSpan[] mentionSpanArr = (MentionEditText.MentionSpan[]) editable.getSpans(intValue, i2, MentionEditText.MentionSpan.class);
                if (!(mentionSpanArr == null || mentionSpanArr.length == 0)) {
                    return null;
                }
                String obj3 = editable.subSequence(intValue + 1, i2).toString();
                if (p.a((CharSequence) obj3, (CharSequence) "  ", false) || p.c((CharSequence) obj3, '\n')) {
                    return null;
                }
                if (z) {
                    Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.CharSequence");
                    obj3 = p.b((CharSequence) obj3).toString();
                }
                if (obj3.length() > 24) {
                    return null;
                }
                return obj3;
            }
        }
        return null;
    }
}
