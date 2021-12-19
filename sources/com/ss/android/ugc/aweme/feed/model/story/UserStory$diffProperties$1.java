package com.ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import h.f.b.y;
import h.k.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class UserStory$diffProperties$1 extends y {
    public static final k INSTANCE = new UserStory$diffProperties$1();

    static {
        Covode.recordClassIndex(59528);
    }

    UserStory$diffProperties$1() {
        super(UserStory.class, "stories", "getStories()Ljava/util/List;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((UserStory) obj).getStories();
    }
}
