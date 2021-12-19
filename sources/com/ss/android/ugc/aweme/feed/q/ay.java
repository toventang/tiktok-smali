package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.player.a.d;
import com.ss.android.ugc.aweme.story.d.a;
import h.f.b.l;

public final class ay {
    static {
        Covode.recordClassIndex(59667);
    }

    public static final void a(d.a aVar, Aweme aweme, Aweme aweme2) {
        int i2;
        long j2;
        Integer currentIndex;
        l.d(aVar, "");
        if (aweme != null && aweme2 != null && a.c(aweme) && a.d(aweme2)) {
            aVar.b("story");
            aVar.c(a.b(aweme2));
            UserStory userStory = aweme.getUserStory();
            int i3 = 0;
            if (userStory != null) {
                i2 = (int) userStory.getCurrentPosition();
            } else {
                i2 = 0;
            }
            aVar.i(i2);
            UserStory userStory2 = aweme.getUserStory();
            if (!(userStory2 == null || (currentIndex = UserStoryKt.currentIndex(userStory2)) == null)) {
                i3 = currentIndex.intValue();
            }
            aVar.j(i3);
            UserStory userStory3 = aweme.getUserStory();
            if (userStory3 != null) {
                j2 = userStory3.getTotalCount();
            } else {
                j2 = 0;
            }
            aVar.k((int) j2);
        }
    }
}
