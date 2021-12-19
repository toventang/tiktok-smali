package com.ss.android.ugc.aweme.story.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.in;
import f.a.t;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class d implements com.ss.android.ugc.aweme.story.api.b, i, j {

    /* renamed from: a  reason: collision with root package name */
    public static final d f137808a;

    /* renamed from: b  reason: collision with root package name */
    private static final h f137809b = h.i.a((h.f.a.a) a.f137810a);

    public static b b() {
        return (b) f137809b.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(371, new g(d.class, "onBlockEvent", com.ss.android.ugc.aweme.profile.b.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    private d() {
    }

    static final class a extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f137810a = new a();

        static {
            Covode.recordClassIndex(90156);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.api.b
    public final Aweme a() {
        b();
        return MineUserStoryFetcher.a();
    }

    static {
        Covode.recordClassIndex(90155);
        d dVar = new d();
        f137808a = dVar;
        cg.a(dVar);
    }

    @Override // com.ss.android.ugc.aweme.story.api.b
    public final Aweme a(String str) {
        l.d(str, "");
        return b().a(str);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f137812a;

        static {
            Covode.recordClassIndex(90158);
        }

        c(String str) {
            this.f137812a = str;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            Object obj2;
            List list = (List) obj;
            l.d(list, "");
            if (list.size() == 1 && (obj2 = list.get(0)) != null) {
                return obj2;
            }
            Aweme aweme = new Aweme();
            aweme.setAid(this.f137812a);
            return aweme;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.i.d$d  reason: collision with other inner class name */
    public static final class C3624d<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f137813a;

        static {
            Covode.recordClassIndex(90159);
        }

        C3624d(String str) {
            this.f137813a = str;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            l.d(list, "");
            if (!list.isEmpty()) {
                return list.get(0);
            }
            Aweme aweme = new Aweme();
            aweme.setAid(this.f137813a);
            return aweme;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.api.b
    public final t<List<Aweme>> a(List<String> list) {
        l.d(list, "");
        return b(list);
    }

    @r
    public final void onBlockEvent(com.ss.android.ugc.aweme.profile.b.a aVar) {
        String uid;
        l.d(aVar, "");
        User user = aVar.f116043a;
        if (user != null && (uid = user.getUid()) != null) {
            b().b(uid);
            com.ss.android.ugc.aweme.story.avatar.a.a(uid, (Aweme) null);
        }
    }

    private static t<List<Aweme>> b(List<String> list) {
        String obj = list.toString();
        com.ss.android.ugc.aweme.story.j.a.a("UserStoryRepo", "querying server for ".concat(String.valueOf(obj)));
        t<R> d2 = StoryApi.f136727a.getUserStories(obj).d(new b(list));
        l.b(d2, "");
        return d2;
    }

    private static t<Aweme> c(String str) {
        Aweme a2 = b().a(str);
        if (a2 == null) {
            t<R> d2 = b(n.a(str)).d(new c(str));
            l.b(d2, "");
            return d2;
        }
        t<Aweme> b2 = t.b(a2);
        l.b(b2, "");
        return b2;
    }

    public static void b(String str) {
        l.d(str, "");
        Aweme a2 = b().a(str);
        if (a2 != null) {
            UserStory userStory = a2.getUserStory();
            if (userStory != null) {
                userStory.setAllViewed(true);
            }
            com.ss.android.ugc.aweme.story.j.a.b("UserStoryRepo", str + " 's stories reported all viewed");
            if (!com.ss.android.ugc.aweme.story.c.b.f()) {
                com.ss.android.ugc.aweme.story.avatar.a.a(str, a2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f137811a;

        static {
            Covode.recordClassIndex(90157);
        }

        b(List list) {
            this.f137811a = list;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            String str;
            String uid;
            String str2;
            com.ss.android.ugc.aweme.story.model.j jVar = (com.ss.android.ugc.aweme.story.model.j) obj;
            String str3 = "";
            l.d(jVar, str3);
            List<Aweme> awemes = jVar.getAwemes();
            if (awemes == null) {
                awemes = z.INSTANCE;
            }
            List list = this.f137811a;
            ArrayList arrayList = new ArrayList(n.a((Iterable) awemes, 10));
            Iterator<T> it = awemes.iterator();
            while (it.hasNext()) {
                User author = it.next().getAuthor();
                if (author == null || (str2 = author.getUid()) == null) {
                    str2 = str3;
                }
                arrayList.add(str2);
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            for (T t : list) {
                if (!arrayList2.contains(t)) {
                    arrayList3.add(t);
                }
            }
            ArrayList arrayList4 = arrayList3;
            User c2 = in.c();
            if (!(c2 == null || (uid = c2.getUid()) == null)) {
                str3 = uid;
            }
            List g2 = n.g((Collection) awemes);
            for (T t2 : arrayList4) {
                if (!l.a((Object) t2, (Object) str3) || com.ss.android.ugc.aweme.story.g.f137757a.f().a().isEmpty()) {
                    d.b().b(t2);
                } else {
                    d.b();
                    g2.add(0, MineUserStoryFetcher.a());
                }
            }
            BaseResponse.ServerTimeExtra serverTimeExtra = jVar.extra;
            if (serverTimeExtra != null) {
                str = serverTimeExtra.logid;
            } else {
                str = null;
            }
            d.a(g2, str);
            return g2;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.api.b
    public final void a(FollowStatus followStatus) {
        User author;
        l.d(followStatus, "");
        String str = followStatus.userId;
        l.b(str, "");
        Aweme a2 = a(str);
        if (a2 != null && (author = a2.getAuthor()) != null) {
            author.setFollowStatus(followStatus.followStatus);
            author.setFollowerStatus(followStatus.followerStatus);
        }
    }

    public static void a(List<? extends Aweme> list, String str) {
        l.d(list, "");
        b b2 = b();
        l.d(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b2.a(it.next(), true, str);
        }
        com.ss.android.ugc.aweme.story.j.a.a(b.f137799b, "tried update " + list.size() + " in cache");
    }

    @Override // com.ss.android.ugc.aweme.story.api.b
    public final t<Aweme> a(String str, boolean z) {
        l.d(str, "");
        if (z) {
            return c(str);
        }
        t<R> d2 = b(n.a(str)).d(new C3624d(str));
        l.b(d2, "");
        return d2;
    }

    @Override // com.ss.android.ugc.aweme.story.api.b
    public final void a(Aweme aweme, boolean z, String str) {
        l.d(aweme, "");
        b().a(aweme, z, str);
    }
}
