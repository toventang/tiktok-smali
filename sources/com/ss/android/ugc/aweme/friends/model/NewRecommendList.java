package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

public final class NewRecommendList extends RecommendList {
    @c(a = "next_cursor")
    private int nextCursor;
    @c(a = "users")
    private List<User> users;

    static {
        Covode.recordClassIndex(61594);
    }

    @Override // com.ss.android.ugc.aweme.friends.model.RecommendList
    public final int getCursor() {
        return this.nextCursor;
    }

    @Override // com.ss.android.ugc.aweme.friends.model.RecommendList
    public final List<User> getUserList() {
        List<User> list = this.users;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    @Override // com.ss.android.ugc.aweme.friends.model.RecommendList
    public final void setCursor(int i2) {
        this.nextCursor = i2;
    }

    @Override // com.ss.android.ugc.aweme.friends.model.RecommendList
    public final void setUserList(List<User> list) {
        this.users = list;
    }
}
