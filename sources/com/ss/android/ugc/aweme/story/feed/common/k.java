package com.ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class k extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f137674a = new k();

    static {
        Covode.recordClassIndex(90090);
    }

    k() {
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
