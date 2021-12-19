package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

public class SearchLiveStruct implements Serializable {
    @c(a = "lives")
    Aweme liveAweme;
    LogPbBean logPbBean;
    @c(a = StringSet.type)
    int type;

    static {
        Covode.recordClassIndex(50946);
    }

    public Aweme getLiveAweme() {
        return this.liveAweme;
    }

    public LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type * 31) + this.liveAweme.hashCode();
    }

    public void setLogPbBean(LogPbBean logPbBean2) {
        this.logPbBean = logPbBean2;
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchLiveStruct searchLiveStruct = (SearchLiveStruct) obj;
        if (this.type != searchLiveStruct.type) {
            return false;
        }
        return this.liveAweme.equals(searchLiveStruct.liveAweme);
    }
}
