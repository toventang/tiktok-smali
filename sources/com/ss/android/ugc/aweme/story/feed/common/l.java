package com.ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class l extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f137675a = new l();

    static {
        Covode.recordClassIndex(90091);
    }

    l() {
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
