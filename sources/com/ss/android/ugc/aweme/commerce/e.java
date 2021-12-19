package com.ss.android.ugc.aweme.commerce;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public final class e implements Serializable {
    @c(a = "enter_from_list")
    private final List<String> enterFroms;
    @c(a = "new_content_num")
    private final int newContentNum;
    @c(a = "update_time")
    private final long updateTime;

    static {
        Covode.recordClassIndex(45195);
    }

    public final List<String> getEnterFroms() {
        return this.enterFroms;
    }

    public final int getNewContentNum() {
        return this.newContentNum;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }
}
