package com.ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class UserStoryKt {
    static {
        Covode.recordClassIndex(59540);
    }

    public static final Integer currentIndex(UserStory userStory) {
        l.d(userStory, "");
        UserStoryCurrentInfo currentInfo = userStory.getCurrentInfo();
        if (currentInfo != null) {
            return currentInfo.getCurrentIndex();
        }
        return null;
    }

    public static final Aweme currentStory(UserStory userStory) {
        l.d(userStory, "");
        UserStoryCurrentInfo currentInfo = userStory.getCurrentInfo();
        if (currentInfo != null) {
            return currentInfo.getCurrentStory();
        }
        return null;
    }

    public static final UserStory copyAll(UserStory userStory) {
        l.d(userStory, "");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(userStory.getStories());
        UserStoryCurrentInfo currentInfo = userStory.getCurrentInfo();
        UserStoryCurrentInfo userStoryCurrentInfo = null;
        if (currentInfo != null) {
            userStoryCurrentInfo = UserStoryCurrentInfo.copy$default(currentInfo, null, null, 3, null);
        }
        return UserStory.copy$default(userStory, arrayList, 0, 0, false, 0, 0, false, false, 0, 0, userStoryCurrentInfo, false, false, false, 15358, null);
    }

    public static final UserStory copyUserStory(UserStory userStory) {
        if (userStory == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(userStory.getStories());
        return UserStory.copy$default(userStory, arrayList, 0, 0, false, 0, 0, false, false, 0, 0, null, false, false, false, 16382, null);
    }

    public static final UserStory update(UserStory userStory, UserStory userStory2) {
        l.d(userStory, "");
        if (userStory2 == null) {
            return userStory;
        }
        List<Aweme> stories = userStory.getStories();
        stories.clear();
        stories.addAll(userStory2.getStories());
        userStory.setTotalCount(userStory2.getTotalCount());
        userStory.setCurrentPosition(userStory2.getCurrentPosition());
        userStory.setAllViewed(userStory2.getAllViewed());
        userStory.setMinCursor(userStory2.getMinCursor());
        userStory.setMaxCursor(userStory2.getMaxCursor());
        userStory.setHasMoreAfter(userStory2.getHasMoreBefore());
        userStory.setHasMoreBefore(userStory2.getHasMoreBefore());
        userStory.setLastStoryCreatedAt(userStory2.getLastStoryCreatedAt());
        UserStoryCurrentInfo currentInfo = userStory2.getCurrentInfo();
        UserStoryCurrentInfo userStoryCurrentInfo = null;
        if (currentInfo != null) {
            userStoryCurrentInfo = UserStoryCurrentInfo.copy$default(currentInfo, null, null, 3, null);
        }
        userStory.setCurrentInfo(userStoryCurrentInfo);
        return userStory;
    }
}
