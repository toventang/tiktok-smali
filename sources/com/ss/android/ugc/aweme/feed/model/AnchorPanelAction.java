package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class AnchorPanelAction implements Serializable {
    @c(a = "action_type")
    public int actionType;
    @c(a = "icon")
    public UrlModel icon;
    @c(a = "schema")
    public String schema = "";

    static {
        Covode.recordClassIndex(59300);
    }

    public final int getActionType() {
        return this.actionType;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getSchema() {
        return this.schema;
    }
}
