package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public final class PollDetailResponse extends BaseResponse {
    @c(a = "has_more")
    private boolean hasMore;
    @c(a = "offset")
    private int offset;
    @c(a = "user_list")
    private List<? extends User> users;

    static {
        Covode.recordClassIndex(85484);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getOffset() {
        return this.offset;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, java.util.List<com.ss.android.ugc.aweme.profile.model.User> */
    public final List<User> getUsers() {
        return this.users;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setOffset(int i2) {
        this.offset = i2;
    }

    public final void setUsers(List<? extends User> list) {
        this.users = list;
    }
}
