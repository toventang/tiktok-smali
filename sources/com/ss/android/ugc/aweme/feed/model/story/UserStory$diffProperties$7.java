package com.ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import h.f.b.r;
import h.k.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class UserStory$diffProperties$7 extends r {
    public static final h INSTANCE = new UserStory$diffProperties$7();

    static {
        Covode.recordClassIndex(59536);
    }

    UserStory$diffProperties$7() {
        super(UserStory.class, "originTotalCount", "getOriginTotalCount()J", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Long.valueOf(((UserStory) obj).getOriginTotalCount());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((UserStory) obj).setOriginTotalCount(((Number) obj2).longValue());
    }
}
