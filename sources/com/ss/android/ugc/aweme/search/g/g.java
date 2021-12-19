package com.ss.android.ugc.aweme.search.g;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import java.util.Map;

public final class g implements Serializable {
    @c(a = "code")
    private int code;
    private c filterOptionStruct;
    private boolean isDefaultOption;
    private boolean isSelected;
    @c(a = "log_info")
    private Map<String, String> logInfo;
    @c(a = StringSet.name)
    private String name;

    static {
        Covode.recordClassIndex(78904);
    }

    public final int getCode() {
        return this.code;
    }

    public final c getFilterOptionStruct() {
        return this.filterOptionStruct;
    }

    public final Map<String, String> getLogInfo() {
        return this.logInfo;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean isDefaultOption() {
        return this.isDefaultOption;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setCode(int i2) {
        this.code = i2;
    }

    public final void setDefaultOption(boolean z) {
        this.isDefaultOption = z;
    }

    public final void setFilterOptionStruct(c cVar) {
        this.filterOptionStruct = cVar;
    }

    public final void setLogInfo(Map<String, String> map) {
        this.logInfo = map;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public g(int i2, String str) {
        this.code = i2;
        this.name = str;
    }
}
