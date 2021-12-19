package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

public final class RecommendUserDialogList extends RecommendList {
    @c(a = "next_cursor")
    private int nextCursor;
    @c(a = "users")
    private List<? extends User> recommendUsers;

    static {
        Covode.recordClassIndex(61602);
    }

    @Override // com.ss.android.ugc.aweme.friends.model.RecommendList
    public final int getCursor() {
        return this.nextCursor;
    }

    public final int getNextCursor() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, java.util.List<com.ss.android.ugc.aweme.profile.model.User> */
    public final List<User> getRecommendUsers() {
        return this.recommendUsers;
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, java.util.List<com.ss.android.ugc.aweme.profile.model.User> */
    @Override // com.ss.android.ugc.aweme.friends.model.RecommendList
    public final List<User> getUserList() {
        if (this.recommendUsers == null) {
            this.recommendUsers = new ArrayList(0);
        }
        return this.recommendUsers;
    }

    @Override // com.ss.android.ugc.aweme.friends.model.RecommendList
    public final void setCursor(int i2) {
        this.nextCursor = i2;
    }

    public final void setNextCursor(int i2) {
        this.nextCursor = i2;
    }

    public final void setRecommendUsers(List<? extends User> list) {
        this.recommendUsers = list;
    }

    @Override // com.ss.android.ugc.aweme.friends.model.RecommendList
    public final void setUserList(List<User> list) {
        this.recommendUsers = list;
    }
}
