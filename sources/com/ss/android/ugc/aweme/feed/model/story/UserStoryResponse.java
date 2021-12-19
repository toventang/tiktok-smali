package com.ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.io.Serializable;

public final class UserStoryResponse extends BaseResponse implements Serializable {
    @c(a = "user_story")
    private final UserStory userStory;

    static {
        Covode.recordClassIndex(59541);
    }

    public static /* synthetic */ UserStoryResponse copy$default(UserStoryResponse userStoryResponse, UserStory userStory2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            userStory2 = userStoryResponse.userStory;
        }
        return userStoryResponse.copy(userStory2);
    }

    public final UserStory component1() {
        return this.userStory;
    }

    public final UserStoryResponse copy(UserStory userStory2) {
        l.d(userStory2, "");
        return new UserStoryResponse(userStory2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof UserStoryResponse) && l.a(this.userStory, ((UserStoryResponse) obj).userStory);
        }
        return true;
    }

    public final int hashCode() {
        UserStory userStory2 = this.userStory;
        if (userStory2 != null) {
            return userStory2.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UserStoryResponse(userStory=" + this.userStory + ")";
    }

    public final UserStory getUserStory() {
        return this.userStory;
    }

    public UserStoryResponse(UserStory userStory2) {
        l.d(userStory2, "");
        this.userStory = userStory2;
    }
}
