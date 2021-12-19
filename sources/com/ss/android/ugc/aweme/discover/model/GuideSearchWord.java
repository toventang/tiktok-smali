package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public final class GuideSearchWord implements Serializable {
    @c(a = "display_query")
    private String displayQuery;
    @c(a = "gs_query")
    private String gsQuery;
    @c(a = "id")
    private String id;
    @c(a = "query_id")
    private String queryId;
    private boolean selected;
    @c(a = StringSet.type)
    private String type;

    static {
        Covode.recordClassIndex(50901);
    }

    public final String getDisplayQuery() {
        return this.displayQuery;
    }

    public final String getGsQuery() {
        return this.gsQuery;
    }

    public final String getId() {
        return this.id;
    }

    public final String getQueryId() {
        return this.queryId;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getType() {
        return this.type;
    }

    public final void setDisplayQuery(String str) {
        this.displayQuery = str;
    }

    public final void setGsQuery(String str) {
        this.gsQuery = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setQueryId(String str) {
        this.queryId = str;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
