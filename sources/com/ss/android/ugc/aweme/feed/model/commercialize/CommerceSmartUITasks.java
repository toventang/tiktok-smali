package com.ss.android.ugc.aweme.feed.model.commercialize;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class CommerceSmartUITasks implements Serializable {
    @c(a = "ad_cards")
    private int adCardDelay = -1;
    @c(a = "learnmore_button_showtime")
    private int buttonShow = -1;
    @c(a = "learnmore_color_delay")
    private int colorDelay = -1;

    static {
        Covode.recordClassIndex(59480);
    }

    public final int getAdCardDelay() {
        return this.adCardDelay;
    }

    public final int getButtonShow() {
        return this.buttonShow;
    }

    public final int getColorDelay() {
        return this.colorDelay;
    }

    public final void setAdCardDelay(int i2) {
        this.adCardDelay = i2;
    }

    public final void setButtonShow(int i2) {
        this.buttonShow = i2;
    }

    public final void setColorDelay(int i2) {
        this.colorDelay = i2;
    }
}
