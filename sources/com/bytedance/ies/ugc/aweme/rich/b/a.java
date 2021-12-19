package com.bytedance.ies.ugc.aweme.rich.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class a implements Serializable {
    @c(a = "creative_id")
    Long creativeId;
    @c(a = "group_id")
    Long groupId;
    @c(a = "log_extra")
    String logExtra;

    static {
        Covode.recordClassIndex(21059);
    }

    public Long getCreativeId() {
        return this.creativeId;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public String getCreativeIdStr() {
        Long l2 = this.creativeId;
        if (l2 == null) {
            return null;
        }
        return l2.toString();
    }

    public void setCreativeId(Long l2) {
        this.creativeId = l2;
    }

    public void setGroupId(Long l2) {
        this.groupId = l2;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
    }
}
