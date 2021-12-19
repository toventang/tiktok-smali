package com.ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import h.f.b.r;
import h.k.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class UserStory$diffProperties$4 extends r {
    public static final h INSTANCE = new UserStory$diffProperties$4();

    static {
        Covode.recordClassIndex(59533);
    }

    UserStory$diffProperties$4() {
        super(UserStory.class, "minCursor", "getMinCursor()J", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Long.valueOf(((UserStory) obj).getMinCursor());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((UserStory) obj).setMinCursor(((Number) obj2).longValue());
    }
}
