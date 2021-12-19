package com.ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import h.f.b.r;
import h.k.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class UserStory$diffProperties$8 extends r {
    public static final h INSTANCE = new UserStory$diffProperties$8();

    static {
        Covode.recordClassIndex(59537);
    }

    UserStory$diffProperties$8() {
        super(UserStory.class, "hasMoreAfter", "getHasMoreAfter()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((UserStory) obj).getHasMoreAfter());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((UserStory) obj).setHasMoreAfter(((Boolean) obj2).booleanValue());
    }
}
