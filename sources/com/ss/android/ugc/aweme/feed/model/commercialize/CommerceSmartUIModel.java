package com.ss.android.ugc.aweme.feed.model.commercialize;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class CommerceSmartUIModel implements Serializable {
    @c(a = "playtime_ml")
    private CommerceSmartUIPlayTime playTime;
    @c(a = "commerce_ml_ui_strategy")
    private CommerceSmartUIStrategyConfig uiStrategy;

    static {
        Covode.recordClassIndex(59477);
    }

    public final CommerceSmartUIPlayTime getPlayTime() {
        return this.playTime;
    }

    public final CommerceSmartUIStrategyConfig getUiStrategy() {
        return this.uiStrategy;
    }

    public final void setPlayTime(CommerceSmartUIPlayTime commerceSmartUIPlayTime) {
        this.playTime = commerceSmartUIPlayTime;
    }

    public final void setUiStrategy(CommerceSmartUIStrategyConfig commerceSmartUIStrategyConfig) {
        this.uiStrategy = commerceSmartUIStrategyConfig;
    }
}
