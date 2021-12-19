package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class FollowTabGuideStruct {
    @c(a = "follow_tab_guide_times")
    private Integer followTabGuideTimes;
    @c(a = "follow_tab_guide_word")
    private String followTabGuideWord;

    static {
        Covode.recordClassIndex(63038);
    }

    public Integer getFollowTabGuideTimes() {
        Integer num = this.followTabGuideTimes;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public String getFollowTabGuideWord() {
        String str = this.followTabGuideWord;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
