package com.ss.android.ugc.aweme.story.avatar;

import android.os.Looper;
import androidx.appcompat.app.d;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.core.e;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.avatar.StoryAvatarEntrySharedVM;
import com.ss.android.ugc.aweme.story.publish.f;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.ac;
import h.f.b.l;
import h.p;
import h.v;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Set<f>> f136765a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final Map<f, String> f136766b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final Map<m, Set<f>> f136767c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final a f136768d = new a();

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.a$a  reason: collision with other inner class name */
    public static final class C3572a extends h.f.b.m implements h.f.a.b<b, b> {
        public static final C3572a INSTANCE = new C3572a();

        static {
            Covode.recordClassIndex(89356);
        }

        public C3572a() {
            super(1);
        }

        public final b invoke(b bVar) {
            l.c(bVar, "");
            return bVar;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f136769a = new b();

        static {
            Covode.recordClassIndex(89357);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "story_avatar_entry";
        }
    }

    private a() {
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.c
    public final boolean a(f fVar, String str) {
        Set<f> set;
        l.d(fVar, "");
        l.d(str, "");
        if (c()) {
            Map<f, String> map = f136766b;
            if (l.a((Object) map.get(fVar), (Object) str) && (set = f136765a.get(str)) != null && set.contains(fVar)) {
                return true;
            }
            a(fVar);
            l.d(fVar, "");
            if (c()) {
                m z = fVar.z();
                if (z == null) {
                    return false;
                }
                Map<m, Set<f>> map2 = f136767c;
                Set<f> set2 = map2.get(z);
                if (set2 == null) {
                    set2 = new LinkedHashSet<>();
                    map2.put(z, set2);
                    z.getLifecycle().a(new AvatarEntryManager$register$1(z));
                }
                set2.add(fVar);
                map.put(fVar, str);
                Map<String, Set<f>> map3 = f136765a;
                Set<f> set3 = map3.get(str);
                if (set3 == null) {
                    set3 = new LinkedHashSet<>();
                    map3.put(str, set3);
                }
                set3.add(fVar);
                return true;
            }
            throw new IllegalAccessException("should register in main thread");
        }
        throw new IllegalAccessException("should bind in main thread");
    }

    private static boolean c() {
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        l.b(mainLooper, "");
        return l.a(currentThread, mainLooper.getThread());
    }

    static {
        Covode.recordClassIndex(89355);
    }

    private static boolean b() {
        IAccountUserService e2 = AccountService.a().e();
        l.b(e2, "");
        return e2.isChildrenMode();
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f136770a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f136771b;

        static {
            Covode.recordClassIndex(89358);
        }

        c(String str, Aweme aweme) {
            this.f136770a = str;
            this.f136771b = aweme;
        }

        public final void run() {
            com.ss.android.ugc.aweme.story.j.a.b("AvatarEntryManager", "dispatching update: uid: " + this.f136770a + ", aweme instance: " + System.identityHashCode(this.f136771b));
            Set<f> set = a.f136765a.get(this.f136770a);
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    it.next().a(this.f136770a, this.f136771b);
                }
            }
            Set<f> set2 = a.f136765a.get("*");
            if (set2 != null) {
                Iterator<T> it2 = set2.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.f136770a, this.f136771b);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.c
    public final boolean a() {
        if (!com.ss.android.ugc.aweme.story.c.b.c() || com.ss.android.ugc.aweme.story.c.b.f() || com.ss.android.ugc.aweme.story.c.b.g() || b()) {
            return false;
        }
        return true;
    }

    private static boolean a(String str) {
        IAccountUserService e2 = AccountService.a().e();
        l.b(e2, "");
        return l.a((Object) str, (Object) e2.getCurUserId());
    }

    public static int b(User user) {
        l.d(user, "");
        if (user.getFollowStatus() == 2) {
            return 2;
        }
        if (user.getFollowStatus() == 1) {
            return 1;
        }
        if (user.getFollowerStatus() == 1) {
            return 3;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.c
    public final d a(e eVar) {
        l.d(eVar, "");
        if (eVar.c() == o.WESTWINDOW || a()) {
            return new com.ss.android.ugc.aweme.story.avatar.entry.c(eVar);
        }
        return null;
    }

    public static boolean a(Aweme aweme) {
        boolean z;
        T t;
        boolean z2;
        l.d(aweme, "");
        UserStory userStory = aweme.getUserStory();
        if (userStory != null) {
            z = userStory.getAllViewed();
        } else {
            z = false;
        }
        if (!a(aweme.getAuthorUid())) {
            return z;
        }
        Iterator<T> it = f.f138112b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            Story story = t.getStory();
            if (story != null && !story.getViewed()) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null) {
            z2 = true;
        } else {
            z2 = false;
            t2.getAid();
            Story story2 = t2.getStory();
            if (story2 != null) {
                Boolean.valueOf(story2.isPublishing());
            }
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.c
    public final void a(f fVar) {
        l.d(fVar, "");
        if (c()) {
            Map<f, String> map = f136766b;
            String str = map.get(fVar);
            if (str != null) {
                Map<String, Set<f>> map2 = f136765a;
                Set<f> set = map2.get(str);
                if (set != null) {
                    Integer.valueOf(set.size());
                }
                Set<f> set2 = map2.get(str);
                if (set2 != null) {
                    Boolean.valueOf(set2.contains(fVar));
                }
                Set<f> set3 = map2.get(str);
                if (set3 != null) {
                    set3.remove(fVar);
                    if (set3.isEmpty()) {
                        map2.remove(str);
                    }
                }
                map.remove(fVar);
                return;
            }
            return;
        }
        throw new IllegalAccessException("should unregister in main thread");
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.c
    public final boolean a(User user) {
        if (user == null || user.getUid() == null || b()) {
            return false;
        }
        boolean a2 = a(user.getUid());
        if ((user.getStoryStatus() > 0 || (a2 && !f.f138112b.isEmpty())) && com.ss.android.ugc.aweme.story.c.b.c() && com.ss.android.ugc.aweme.story.g.a.f137760b && !user.isAdFake() && !user.isBlock && !user.isBlocked()) {
            if (!in.b(user, a2) || user.getFollowStatus() == 1 || user.getFollowStatus() == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void a(String str, Aweme aweme) {
        l.d(str, "");
        com.ss.android.ugc.aweme.base.utils.m.a(new c(str, aweme));
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.c
    public final void a(Aweme aweme, d dVar, SmartRoute smartRoute) {
        List<Aweme> stories;
        l.d(aweme, "");
        l.d(dVar, "");
        l.d(smartRoute, "");
        if (!fe.a(dVar)) {
            new com.bytedance.tux.g.b(dVar).e(R.string.de8).b();
            return;
        }
        UserStory userStory = aweme.getUserStory();
        if (!(userStory == null || (stories = userStory.getStories()) == null)) {
            Iterator<T> it = stories.iterator();
            while (it.hasNext()) {
                it.next().setUserStory(null);
            }
        }
        b bVar = b.f136769a;
        h.k.c a2 = ab.a(StoryAvatarEntrySharedVM.class);
        C3572a aVar = C3572a.INSTANCE;
        h.f.a.a<com.bytedance.assem.arch.core.d> a3 = u.a(dVar);
        h.f.a.a<e> b2 = u.b(dVar);
        l.d(aweme, "");
        ((AssemViewModel) new com.bytedance.assem.a.a(a2, bVar, u.j.f25671a, u.a((m) dVar, false), u.c.f25670a, aVar, a3, b2).getValue()).a(new StoryAvatarEntrySharedVM.b(aweme));
        smartRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.story.avatar.c
    public final void a(String str, String str2, User user, String str3, p<? extends Object, String>... pVarArr) {
        l.d(str, "");
        l.d(str2, "");
        l.d(user, "");
        l.d(pVarArr, "");
        String uid = user.getUid();
        int b2 = b(user);
        ac acVar = new ac(5);
        acVar.b(v.a(str2, "enter_from"));
        acVar.b(v.a(uid, "author_id"));
        acVar.b(v.a(Integer.valueOf(b2), "follow_status"));
        if (str3 == null) {
            str3 = "";
        }
        acVar.b(v.a(str3, "req_id"));
        acVar.a((Object) pVarArr);
        r.a(str, (p[]) acVar.a((Object[]) new p[acVar.f158713a.size()]));
    }
}
