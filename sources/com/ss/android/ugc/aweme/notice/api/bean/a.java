package com.ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class a extends b implements Serializable {
    @c(a = "new_content_num")
    private final int newContentNum;
    private String uid;
    @c(a = "update_time")
    private final long updateTime;

    static {
        Covode.recordClassIndex(72416);
    }

    public final int getNewContentNum() {
        return this.newContentNum;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.bean.b
    public final f getType() {
        return f.BC;
    }

    public final String getUid() {
        return this.uid;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final void setUid(String str) {
        this.uid = str;
    }
}
