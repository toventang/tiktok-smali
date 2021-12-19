package com.ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class h extends BaseResponse implements Serializable {
    @c(a = "emoji_list")
    private final List<a> emojiList;
    @c(a = "user_info")
    private final User user;

    static {
        Covode.recordClassIndex(90275);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.story.model.h */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h copy$default(h hVar, User user2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            user2 = hVar.user;
        }
        if ((i2 & 2) != 0) {
            list = hVar.emojiList;
        }
        return hVar.copy(user2, list);
    }

    public final User component1() {
        return this.user;
    }

    public final List<a> component2() {
        return this.emojiList;
    }

    public final h copy(User user2, List<a> list) {
        l.d(user2, "");
        return new h(user2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.user, hVar.user) && l.a(this.emojiList, hVar.emojiList);
    }

    public final int hashCode() {
        User user2 = this.user;
        int i2 = 0;
        int hashCode = (user2 != null ? user2.hashCode() : 0) * 31;
        List<a> list = this.emojiList;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "StoryViewer(user=" + this.user + ", emojiList=" + this.emojiList + ")";
    }

    public final List<a> getEmojiList() {
        return this.emojiList;
    }

    public final User getUser() {
        return this.user;
    }

    public h(User user2, List<a> list) {
        l.d(user2, "");
        this.user = user2;
        this.emojiList = list;
    }
}
