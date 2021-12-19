package com.ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import h.f.b.r;
import h.k.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class UserStory$diffProperties$3 extends r {
    public static final h INSTANCE = new UserStory$diffProperties$3();

    static {
        Covode.recordClassIndex(59532);
    }

    UserStory$diffProperties$3() {
        super(UserStory.class, "allViewed", "getAllViewed()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((UserStory) obj).getAllViewed());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((UserStory) obj).setAllViewed(((Boolean) obj2).booleanValue());
    }
}
