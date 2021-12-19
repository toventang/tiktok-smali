package com.ss.android.ugc.aweme.openauthorize.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class g implements Serializable {
    private Boolean isEnabled;
    @c(a = "scope_desc")
    private final String scopeDesc;
    @c(a = "scope_name")
    private final String scopeName;
    @c(a = "is_scope_required")
    private final Boolean scopeRequired;

    static {
        Covode.recordClassIndex(73695);
    }

    public final String getScopeDesc() {
        return this.scopeDesc;
    }

    public final String getScopeName() {
        return this.scopeName;
    }

    public final Boolean getScopeRequired() {
        return this.scopeRequired;
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(Boolean bool) {
        this.isEnabled = bool;
    }
}
