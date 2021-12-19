package com.ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.story.i.d;
import h.f.b.l;
import h.f.b.m;

public final class p {
    static {
        Covode.recordClassIndex(90095);
    }

    static final class a extends m implements h.f.a.b<UserStory, UserStory> {
        final /* synthetic */ boolean $allViewed = true;

        static {
            Covode.recordClassIndex(90096);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ UserStory invoke(UserStory userStory) {
            UserStory userStory2 = userStory;
            l.d(userStory2, "");
            return UserStory.copy$default(userStory2, null, 0, 0, this.$allViewed, 0, 0, false, false, 0, 0, null, false, false, false, 16375, null);
        }
    }

    static final class b extends m implements h.f.a.b<UserStory, UserStory> {
        final /* synthetic */ UserStoryCurrentInfo $info;

        static {
            Covode.recordClassIndex(90097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(UserStoryCurrentInfo userStoryCurrentInfo) {
            super(1);
            this.$info = userStoryCurrentInfo;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ UserStory invoke(UserStory userStory) {
            UserStory userStory2 = userStory;
            l.d(userStory2, "");
            return UserStory.copy$default(userStory2, null, 0, 0, false, 0, 0, false, false, 0, 0, this.$info, false, false, false, 15359, null);
        }
    }

    public static void a(String str, UserStory userStory) {
        if (str != null && userStory != null) {
            boolean allViewed = userStory.getAllViewed();
            userStory.setAllViewed(true);
            if (!com.ss.android.ugc.aweme.story.d.a.a(str) || allViewed) {
                d.b(str);
            } else {
                com.ss.android.ugc.aweme.story.userstory.mine.b.a(new a());
            }
        }
    }

    public static void a(String str, UserStory userStory, Integer num, Aweme aweme) {
        if (str != null && userStory != null) {
            UserStoryCurrentInfo userStoryCurrentInfo = new UserStoryCurrentInfo(num, aweme);
            if (!l.a(userStory.getCurrentInfo(), userStoryCurrentInfo)) {
                userStory.setCurrentInfo(userStoryCurrentInfo);
                if (com.ss.android.ugc.aweme.story.d.a.a(str)) {
                    com.ss.android.ugc.aweme.story.userstory.mine.b.a(new b(userStoryCurrentInfo));
                }
            }
        }
    }
}
