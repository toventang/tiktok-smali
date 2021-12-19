package com.ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import h.f.b.r;
import h.k.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class UserStory$diffProperties$2 extends r {
    public static final h INSTANCE = new UserStory$diffProperties$2();

    static {
        Covode.recordClassIndex(59531);
    }

    UserStory$diffProperties$2() {
        super(UserStory.class, "currentPosition", "getCurrentPosition()J", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Long.valueOf(((UserStory) obj).getCurrentPosition());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((UserStory) obj).setCurrentPosition(((Number) obj2).longValue());
    }
}
