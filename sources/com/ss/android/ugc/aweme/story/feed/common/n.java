package com.ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class n extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f137677a = new n();

    static {
        Covode.recordClassIndex(90093);
    }

    n() {
        super(UserStory.class, "maxCursor", "getMaxCursor()J", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Long.valueOf(((UserStory) obj).getMaxCursor());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((UserStory) obj).setMaxCursor(((Number) obj2).longValue());
    }
}
