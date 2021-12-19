package com.ss.android.ugc.aweme.newfollow.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public abstract class a extends BaseResponse implements d {
    private String requestId;

    static {
        Covode.recordClassIndex(72345);
    }

    public Aweme getAweme() {
        return null;
    }

    public List<Comment> getCommentList() {
        return null;
    }

    public abstract int getFeedType();

    public List<User> getLikeList() {
        return null;
    }

    public boolean needUpdateComment() {
        return false;
    }

    public void setAweme(Aweme aweme) {
    }

    public void setCommentList(List<Comment> list) {
    }

    public abstract void setFeedType(int i2);

    @Override // com.ss.android.ugc.aweme.app.api.d
    public String getRequestId() {
        return this.requestId;
    }

    public String getAwemeAuthorId() {
        if (getAweme() != null) {
            return getAweme().getAuthorUid();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public void setRequestId(String str) {
        this.requestId = str;
    }
}
