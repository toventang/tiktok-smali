package com.ss.android.ugc.aweme.openauthorize.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;

public final class e extends BaseResponse implements Serializable {
    @c(a = "bc_scope_list")
    private final List<g> bcScopeList;
    @c(a = "client_info")
    private final c clientInfo;
    @c(a = "scope_list")
    private List<g> scopeList;
    @c(a = "text_list")
    private final List<f> textList;

    static {
        Covode.recordClassIndex(73693);
    }

    public final List<g> getBcScopeList() {
        return this.bcScopeList;
    }

    public final c getClientInfo() {
        return this.clientInfo;
    }

    public final List<g> getScopeList() {
        return this.scopeList;
    }

    public final List<f> getTextList() {
        return this.textList;
    }

    public final void setScopeList(List<g> list) {
        this.scopeList = list;
    }
}
