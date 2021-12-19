package com.ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import h.f.b.r;
import h.k.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class UserStory$diffProperties$9 extends r {
    public static final h INSTANCE = new UserStory$diffProperties$9();

    static {
        Covode.recordClassIndex(59538);
    }

    UserStory$diffProperties$9() {
        super(UserStory.class, "hasMoreBefore", "getHasMoreBefore()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((UserStory) obj).getHasMoreBefore());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((UserStory) obj).setHasMoreBefore(((Boolean) obj2).booleanValue());
    }
}
