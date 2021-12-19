package com.ss.android.ugc.aweme.setting.model;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import java.util.List;

public final class c implements Serializable {
    @com.google.gson.a.c(a = "access_msg")
    private final String accessMsg;
    @com.google.gson.a.c(a = "removal_alert")
    private final String alert;
    @com.google.gson.a.c(a = "authorized_time_text")
    private final String authorizedTimeText;
    @com.google.gson.a.c(a = "client_key")
    private final String clientKey;
    @com.google.gson.a.c(a = "desc")
    private final String desc;
    @com.google.gson.a.c(a = "icon")
    private final String icon;
    @com.google.gson.a.c(a = StringSet.name)
    private final String name;
    @com.google.gson.a.c(a = "client_permission_url")
    private final String permissionUrl;
    @com.google.gson.a.c(a = "removal_popup_content")
    private final String removalPopupContent;
    @com.google.gson.a.c(a = "removal_popup_title")
    private final String removalPopupTitle;
    @com.google.gson.a.c(a = "scope_names")
    private final List<String> scopeNames;
    @com.google.gson.a.c(a = "status")
    private final String status;

    static {
        Covode.recordClassIndex(80207);
    }

    public final String getAccessMsg() {
        return this.accessMsg;
    }

    public final String getAlert() {
        return this.alert;
    }

    public final String getAuthorizedTimeText() {
        return this.authorizedTimeText;
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPermissionUrl() {
        return this.permissionUrl;
    }

    public final String getRemovalPopupContent() {
        return this.removalPopupContent;
    }

    public final String getRemovalPopupTitle() {
        return this.removalPopupTitle;
    }

    public final List<String> getScopeNames() {
        return this.scopeNames;
    }

    public final String getStatus() {
        return this.status;
    }
}
