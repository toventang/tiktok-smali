package com.ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class g extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f137670a = new g();

    static {
        Covode.recordClassIndex(90086);
    }

    g() {
        super(UserStory.class, "currentInfo", "getCurrentInfo()Lcom/ss/android/ugc/aweme/feed/model/story/UserStoryCurrentInfo;", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return ((UserStory) obj).getCurrentInfo();
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((UserStory) obj).setCurrentInfo((UserStoryCurrentInfo) obj2);
    }
}
