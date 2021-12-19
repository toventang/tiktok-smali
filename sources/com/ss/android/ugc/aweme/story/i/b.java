package com.ss.android.ugc.aweme.story.i;

import androidx.c.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import com.ss.android.ugc.aweme.utils.hl;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final String f137799b = "UserStoryCache";

    /* renamed from: c  reason: collision with root package name */
    public static final C3623b f137800c = new C3623b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final MineUserStoryFetcher f137801a = new MineUserStoryFetcher();

    /* renamed from: d  reason: collision with root package name */
    private final h f137802d = i.a((h.f.a.a) d.f137807a);

    /* renamed from: e  reason: collision with root package name */
    private final h f137803e = i.a((h.f.a.a) c.f137806a);

    public final e<String, a> a() {
        return (e) this.f137802d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.i.b$b  reason: collision with other inner class name */
    public static final class C3623b {
        static {
            Covode.recordClassIndex(90151);
        }

        private C3623b() {
        }

        public /* synthetic */ C3623b(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<e<String, a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f137807a = new d();

        static {
            Covode.recordClassIndex(90153);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e<String, a> invoke() {
            return new e(255);
        }
    }

    static final class c extends m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f137806a = new c();

        static {
            Covode.recordClassIndex(90152);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(com.ss.android.ugc.aweme.story.g.c.a().f137768e * 1000);
        }
    }

    static {
        Covode.recordClassIndex(90149);
    }

    public final Aweme a(String str) {
        l.d(str, "");
        if (com.ss.android.ugc.aweme.story.d.a.a(str)) {
            return MineUserStoryFetcher.a();
        }
        a a2 = a().a(str);
        if (a2 == null) {
            com.ss.android.ugc.aweme.story.j.a.a(f137799b, "missing cache for uid: ".concat(String.valueOf(str)));
            return null;
        } else if (System.currentTimeMillis() - a2.f137805b < ((Number) this.f137803e.getValue()).longValue()) {
            com.ss.android.ugc.aweme.story.j.a.a(f137799b, "cache hit for uid: " + str + ", user story instance: " + System.identityHashCode(a2.f137804a));
            return a2.f137804a;
        } else {
            com.ss.android.ugc.aweme.story.j.a.a(f137799b, "cache expired for uid: ".concat(String.valueOf(str)));
            return null;
        }
    }

    public final void b(String str) {
        l.d(str, "");
        if (a().b(str) != null) {
            com.ss.android.ugc.aweme.story.j.a.b(f137799b, "removed " + str + " from cache");
        } else {
            com.ss.android.ugc.aweme.story.j.a.b(f137799b, "removed " + str + " but not found in cache");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Aweme f137804a;

        /* renamed from: b  reason: collision with root package name */
        public long f137805b;

        static {
            Covode.recordClassIndex(90150);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f137804a, aVar.f137804a) && this.f137805b == aVar.f137805b;
        }

        public final int hashCode() {
            Aweme aweme = this.f137804a;
            int hashCode = aweme != null ? aweme.hashCode() : 0;
            long j2 = this.f137805b;
            return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            return "CacheNode(userStory=" + this.f137804a + ", updateTime=" + this.f137805b + ")";
        }

        public a(Aweme aweme, long j2) {
            l.d(aweme, "");
            this.f137804a = aweme;
            this.f137805b = j2;
        }
    }

    public final void a(Aweme aweme, boolean z, String str) {
        boolean z2;
        String uid;
        long j2;
        long j3;
        int currentPosition;
        List<AwemeHybridLabelModel> list;
        List<Aweme> stories;
        Aweme aweme2;
        User user;
        List<Aweme> stories2;
        Aweme aweme3;
        UserStory userStory;
        UserStory userStory2;
        l.d(aweme, "");
        if (!com.ss.android.ugc.aweme.story.d.a.a(aweme.getAid())) {
            l.d(aweme, "");
            if (!z || (userStory = aweme.getUserStory()) == null || userStory.getFakeAwemeShell() || (userStory2 = aweme.getUserStory()) == null || userStory2.getFakeSelfStoryCollection()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (aweme.getAid() == null) {
                aweme.setAid("");
            }
            Aweme aweme4 = null;
            if (aweme.getAuthor() == null) {
                UserStory userStory3 = aweme.getUserStory();
                if (userStory3 == null || (stories2 = userStory3.getStories()) == null || (aweme3 = (Aweme) n.h((List) stories2)) == null) {
                    user = null;
                } else {
                    user = aweme3.getAuthor();
                }
                aweme.setAuthor(user);
            }
            if (aweme.getHybridLabels() == null) {
                UserStory userStory4 = aweme.getUserStory();
                if (userStory4 == null || (stories = userStory4.getStories()) == null || (aweme2 = (Aweme) n.h((List) stories)) == null) {
                    list = null;
                } else {
                    list = aweme2.getHybridLabels();
                }
                aweme.setHybridLabels(list);
            }
            UserStory userStory5 = aweme.getUserStory();
            if (userStory5 != null) {
                c.a(userStory5.getStories(), str, aweme.getAuthor(), aweme.getHybridLabels(), 24);
                Integer currentIndex = UserStoryKt.currentIndex(userStory5);
                if (currentIndex != null) {
                    currentPosition = currentIndex.intValue();
                } else {
                    currentPosition = (int) userStory5.getCurrentPosition();
                }
                Integer valueOf = Integer.valueOf(currentPosition);
                if (userStory5.getStories().size() > 0 && (aweme4 = UserStoryKt.currentStory(userStory5)) == null) {
                    aweme4 = userStory5.getStories().get(0);
                }
                userStory5.setCurrentInfo(new UserStoryCurrentInfo(valueOf, aweme4));
                if (z2) {
                    userStory5.setOriginTotalCount(userStory5.getTotalCount());
                }
            }
            if (str != null) {
                aweme.setRequestId(str);
            }
            User author = aweme.getAuthor();
            if (author == null || (uid = author.getUid()) == null || !hl.a(uid)) {
                com.ss.android.ugc.aweme.story.j.a.b(f137799b, "abort updating because uid empty, aid: " + aweme.getAid() + "; author: " + aweme.getAuthor());
                return;
            }
            UserStory userStory6 = aweme.getUserStory();
            if (userStory6 == null) {
                com.ss.android.ugc.aweme.story.j.a.b(f137799b, "abort updating because this Aweme is not story collection");
            } else if (userStory6.getFakeAwemeShell()) {
                com.ss.android.ugc.aweme.story.j.a.b(f137799b, "abort updating because this Aweme is fake story collection");
            } else {
                User author2 = aweme.getAuthor();
                l.b(author2, "");
                String uid2 = author2.getUid();
                a b2 = a().b(uid2);
                if (b2 != null) {
                    com.ss.android.ugc.aweme.story.j.a.a(f137799b, uid2 + " already in cache, updated. old aweme instance: " + System.identityHashCode(b2.f137804a) + ", new: " + System.identityHashCode(aweme));
                } else {
                    com.ss.android.ugc.aweme.story.j.a.a(f137799b, "add node " + uid2 + " to cache, aweme instance: " + System.identityHashCode(aweme));
                }
                if (z || b2 == null) {
                    j2 = System.currentTimeMillis();
                } else {
                    j2 = b2.f137805b;
                }
                UserStory userStory7 = aweme.getUserStory();
                if (userStory7 != null) {
                    userStory7.setAddToCacheTime(j2);
                }
                a aVar = new a(aweme, j2);
                a().a(uid2, aVar);
                UserStory userStory8 = aweme.getUserStory();
                long j4 = 0;
                if (userStory8 != null) {
                    j3 = userStory8.getAddToCacheTime();
                } else {
                    j3 = 0;
                }
                UserStory userStory9 = aVar.f137804a.getUserStory();
                if (userStory9 != null) {
                    j4 = userStory9.getAddToCacheTime();
                }
                if (j3 >= j4) {
                    l.b(uid2, "");
                    com.ss.android.ugc.aweme.story.avatar.a.a(uid2, aweme);
                }
            }
        } else if (z) {
            l.d(aweme, "");
            if (aweme.getUserStory() == null) {
                com.ss.android.ugc.aweme.framework.a.a.a((Exception) new IllegalArgumentException("UserStory Aweme is not valid"));
            }
            com.ss.android.ugc.aweme.story.userstory.c.a(aweme, str);
            Aweme clone = aweme.clone();
            l.b(clone, "");
            com.ss.android.ugc.aweme.story.userstory.mine.a.a(clone);
        }
    }
}
