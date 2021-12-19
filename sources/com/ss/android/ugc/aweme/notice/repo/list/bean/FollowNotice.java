package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Objects;

public class FollowNotice {
    @c(a = "content")
    String content;
    @c(a = "relation_label")
    RelationDynamicLabel relationLabel;
    @c(a = "from_user")
    User user;

    static {
        Covode.recordClassIndex(72524);
    }

    public String getContent() {
        return this.content;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public User getUser() {
        return this.user;
    }

    public FollowNotice clone() {
        User clone;
        FollowNotice followNotice = new FollowNotice();
        User user2 = this.user;
        if (user2 == null) {
            clone = null;
        } else {
            clone = user2.clone();
        }
        followNotice.user = clone;
        followNotice.content = this.content;
        followNotice.relationLabel = this.relationLabel;
        return followNotice;
    }

    public int hashCode() {
        return Objects.hash(this.content, this.user);
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setUser(User user2) {
        this.user = user2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FollowNotice followNotice = (FollowNotice) obj;
            if (!Objects.equals(this.content, followNotice.content) || !Objects.equals(this.user, followNotice.user)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
