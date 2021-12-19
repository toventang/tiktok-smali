package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class AggregationTab implements Serializable {
    @c(a = "show_tab")
    boolean showTab;
    @c(a = "title")
    String title;

    static {
        Covode.recordClassIndex(75202);
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isShowTab() {
        return this.showTab;
    }

    public void setShowTab(boolean z) {
        this.showTab = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
