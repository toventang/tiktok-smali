package com.ss.android.ugc.aweme.search.g;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public final class h implements Serializable {
    private a activityOptionStruct;
    @c(a = "description")
    private String description;
    private boolean isDefaultOption;
    private boolean isSelected;
    @c(a = "log_info")
    private String logInfo;
    @c(a = StringSet.name)
    private String name;
    @c(a = "request_key")
    private String requestKey;

    static {
        Covode.recordClassIndex(78905);
    }

    public final a getActivityOptionStruct() {
        return this.activityOptionStruct;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLogInfo() {
        return this.logInfo;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRequestKey() {
        return this.requestKey;
    }

    public final boolean isDefaultOption() {
        return this.isDefaultOption;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setActivityOptionStruct(a aVar) {
        this.activityOptionStruct = aVar;
    }

    public final void setDefaultOption(boolean z) {
        this.isDefaultOption = z;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setLogInfo(String str) {
        this.logInfo = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRequestKey(String str) {
        this.requestKey = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }
}
