package com.ss.android.ugc.aweme.story.feed.common;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class f extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f137669a = new f();

    static {
        Covode.recordClassIndex(90085);
    }

    f() {
        super(UserStory.class, "stories", "getStories()Ljava/util/List;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((UserStory) obj).getStories();
    }
}
