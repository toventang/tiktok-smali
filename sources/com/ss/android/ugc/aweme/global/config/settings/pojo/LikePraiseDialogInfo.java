package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class LikePraiseDialogInfo {
    @c(a = "new_like_num")
    private Integer newLikeNum;
    @c(a = "two_dialog_interval")
    private Integer twoDialogInterval;

    static {
        Covode.recordClassIndex(63053);
    }

    public Integer getNewLikeNum() {
        Integer num = this.newLikeNum;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Integer getTwoDialogInterval() {
        Integer num = this.twoDialogInterval;
        if (num != null) {
            return num;
        }
        throw new a();
    }
}
