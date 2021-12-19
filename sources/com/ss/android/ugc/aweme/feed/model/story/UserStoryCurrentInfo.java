package com.ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class UserStoryCurrentInfo implements Serializable {
    private final Integer currentIndex;
    private final Aweme currentStory;

    static {
        Covode.recordClassIndex(59539);
    }

    public UserStoryCurrentInfo() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ UserStoryCurrentInfo copy$default(UserStoryCurrentInfo userStoryCurrentInfo, Integer num, Aweme aweme, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = userStoryCurrentInfo.currentIndex;
        }
        if ((i2 & 2) != 0) {
            aweme = userStoryCurrentInfo.currentStory;
        }
        return userStoryCurrentInfo.copy(num, aweme);
    }

    public final Integer component1() {
        return this.currentIndex;
    }

    public final Aweme component2() {
        return this.currentStory;
    }

    public final UserStoryCurrentInfo copy(Integer num, Aweme aweme) {
        return new UserStoryCurrentInfo(num, aweme);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserStoryCurrentInfo)) {
            return false;
        }
        UserStoryCurrentInfo userStoryCurrentInfo = (UserStoryCurrentInfo) obj;
        return l.a(this.currentIndex, userStoryCurrentInfo.currentIndex) && l.a(this.currentStory, userStoryCurrentInfo.currentStory);
    }

    public final int hashCode() {
        Integer num = this.currentIndex;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Aweme aweme = this.currentStory;
        if (aweme != null) {
            i2 = aweme.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "UserStoryCurrentInfo(currentIndex=" + this.currentIndex + ", currentStory=" + this.currentStory + ")";
    }

    public final Integer getCurrentIndex() {
        return this.currentIndex;
    }

    public final Aweme getCurrentStory() {
        return this.currentStory;
    }

    public UserStoryCurrentInfo(Integer num, Aweme aweme) {
        this.currentIndex = num;
        this.currentStory = aweme;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserStoryCurrentInfo(Integer num, Aweme aweme, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : aweme);
    }
}
