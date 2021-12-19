package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public final class AgeGateInfo implements Serializable {
    @c(a = "content")
    private final String content;
    @c(a = "option_list")
    private final List<AgeGateOption> optionList;
    @c(a = "title")
    private final String title;

    static {
        Covode.recordClassIndex(75200);
    }

    public final String getContent() {
        return this.content;
    }

    public final List<AgeGateOption> getOptionList() {
        return this.optionList;
    }

    public final String getTitle() {
        return this.title;
    }
}
