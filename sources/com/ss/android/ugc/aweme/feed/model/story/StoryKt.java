package com.ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class StoryKt {
    static {
        Covode.recordClassIndex(59526);
    }

    public static final Story copyStory(Story story) {
        if (story != null) {
            return Story.copy$default(story, 0, false, 0, false, 0, false, false, false, false, 511, null);
        }
        return null;
    }

    public static final boolean isExpired(Story story) {
        l.d(story, "");
        if (story.getExpiredAt() < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }
}
