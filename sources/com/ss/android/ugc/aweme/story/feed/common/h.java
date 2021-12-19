package com.ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import h.f.b.r;

final /* synthetic */ class h extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h.k.h f137671a = new h();

    static {
        Covode.recordClassIndex(90087);
    }

    h() {
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
