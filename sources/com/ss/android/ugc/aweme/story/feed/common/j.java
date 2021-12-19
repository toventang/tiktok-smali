package com.ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class j extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f137673a = new j();

    static {
        Covode.recordClassIndex(90089);
    }

    j() {
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
