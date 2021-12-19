package com.ss.android.ugc.aweme.services.external.ui;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class LiveParams implements Serializable {
    private Boolean onlyShowLiveTab;
    private String sourceParams;

    static {
        Covode.recordClassIndex(79703);
    }

    public final Boolean getOnlyShowLiveTab() {
        return this.onlyShowLiveTab;
    }

    public final String getSourceParams() {
        return this.sourceParams;
    }

    public final void setOnlyShowLiveTab(Boolean bool) {
        this.onlyShowLiveTab = bool;
    }

    public final void setSourceParams(String str) {
        this.sourceParams = str;
    }

    public LiveParams(String str, Boolean bool) {
        this.sourceParams = str;
        this.onlyShowLiveTab = bool;
    }
}
