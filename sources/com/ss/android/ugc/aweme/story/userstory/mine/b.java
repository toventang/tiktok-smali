package com.ss.android.ugc.aweme.story.userstory.mine;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.g;
import h.f.b.l;
import h.f.b.m;
import java.util.Iterator;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(90606);
    }

    static final class a extends m implements h.f.a.b<UserStory, UserStory> {
        final /* synthetic */ UserStory $this_apply;

        static {
            Covode.recordClassIndex(90607);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(UserStory userStory) {
            super(1);
            this.$this_apply = userStory;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ UserStory invoke(UserStory userStory) {
            l.d(userStory, "");
            UserStory userStory2 = this.$this_apply;
            l.b(userStory2, "");
            return userStory2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.userstory.mine.b$b  reason: collision with other inner class name */
    static final class C3650b extends m implements h.f.a.b<UserStory, UserStory> {
        final /* synthetic */ UserStory $this_apply;

        static {
            Covode.recordClassIndex(90608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3650b(UserStory userStory) {
            super(1);
            this.$this_apply = userStory;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ UserStory invoke(UserStory userStory) {
            l.d(userStory, "");
            UserStory userStory2 = this.$this_apply;
            l.b(userStory2, "");
            return userStory2;
        }
    }

    public static final void a(h.f.a.b<? super UserStory, UserStory> bVar) {
        l.d(bVar, "");
        Aweme a2 = a.a();
        UserStory userStory = a2.getUserStory();
        if (userStory == null) {
            l.b();
        }
        l.b(userStory, "");
        UserStory invoke = bVar.invoke(userStory);
        if (invoke == a2.getUserStory()) {
            com.ss.android.ugc.aweme.framework.a.a.a((Exception) new IllegalArgumentException("Must copy"));
        }
        a.a(invoke);
    }

    public static final boolean a(String str) {
        T t;
        List<Aweme> stories;
        List<Aweme> stories2;
        l.d(str, "");
        new MineUserStoryFetcher();
        Aweme a2 = MineUserStoryFetcher.a();
        UserStory userStory = a2.getUserStory();
        T t2 = null;
        if (userStory != null && (stories2 = userStory.getStories()) != null) {
            Iterator<T> it = stories2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (l.a((Object) t.getAid(), (Object) str)) {
                    break;
                }
            }
        } else {
            t = null;
        }
        if (t != null) {
            UserStory userStory2 = a2.getUserStory();
            if (!(userStory2 == null || (stories = userStory2.getStories()) == null)) {
                stories.remove(t);
            }
            UserStory userStory3 = a2.getUserStory();
            if (userStory3 != null) {
                userStory3.getStories().remove(t);
                userStory3.setTotalCount(userStory3.getTotalCount() - 1);
                a(new a(userStory3));
            }
            return true;
        }
        Iterator<T> it2 = g.f137757a.f().a().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            if (l.a((Object) next.getAid(), (Object) str)) {
                t2 = next;
                break;
            }
        }
        T t3 = t2;
        if (t3 == null) {
            return false;
        }
        com.ss.android.ugc.aweme.story.publish.a f2 = g.f137757a.f();
        String scheduleId = t3.getScheduleId();
        l.b(scheduleId, "");
        f2.a(scheduleId);
        UserStory userStory4 = a2.getUserStory();
        if (userStory4 != null) {
            userStory4.setTotalCount(userStory4.getTotalCount() - 1);
            a(new C3650b(userStory4));
        }
        return true;
    }
}
