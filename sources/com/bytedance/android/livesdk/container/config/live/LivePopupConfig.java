package com.bytedance.android.livesdk.container.config.live;

import com.bytedance.android.livesdk.container.a.a;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;

public final class LivePopupConfig extends LiveHybridConfig {
    @a(a = "min_margin_top")
    private int minMarginTop;
    @a(a = "pull_down_close_containers")
    private JSONArray pullDownCloseIds;
    @a(a = "variable_height")
    private int variableHeight;

    static {
        Covode.recordClassIndex(9300);
    }

    public final int getMinMarginTop() {
        return this.minMarginTop;
    }

    public final JSONArray getPullDownCloseIds() {
        return this.pullDownCloseIds;
    }

    public final int getVariableHeight() {
        return this.variableHeight;
    }

    public final void setMinMarginTop(int i2) {
        this.minMarginTop = i2;
    }

    public final void setPullDownCloseIds(JSONArray jSONArray) {
        this.pullDownCloseIds = jSONArray;
    }

    public final void setVariableHeight(int i2) {
        this.variableHeight = i2;
    }
}
