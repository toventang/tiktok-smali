package com.ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class i extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f137672a = new i();

    static {
        Covode.recordClassIndex(90088);
    }

    i() {
        super(UserStory.class, "totalCount", "getTotalCount()J", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Long.valueOf(((UserStory) obj).getTotalCount());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((UserStory) obj).setTotalCount(((Number) obj2).longValue());
    }
}
