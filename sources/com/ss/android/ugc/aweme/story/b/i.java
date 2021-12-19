package com.ss.android.ugc.aweme.story.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.param.b;
import h.a.n;
import h.f.b.l;

public final class i {
    static {
        Covode.recordClassIndex(89439);
    }

    public static final String a(b bVar) {
        l.d(bVar, "");
        if (n.b("STORY_ENTRANCE_AVATAR", "STORY_ENTRANCE_MINE", "STORY_ENTRANCE_OTHER", "STORY_ENTRANCE_SIDE_BAR").contains(bVar.getFrom())) {
            return "head";
        }
        if (l.a((Object) bVar.getFrom(), (Object) "STORY_ENTRANCE_PREVIEW")) {
            return "";
        }
        if (l.a((Object) "homepage_follow", (Object) bVar.getEventType()) || l.a((Object) "homepage_hot", (Object) bVar.getEventType())) {
            return "feed";
        }
        return "video_cover";
    }
}
