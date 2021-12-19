package com.ss.android.ugc.aweme.report;

import com.bytedance.covode.number.Covode;

public enum c {
    PAGE_SELECT_TOTAL("page_select_total"),
    PAGE_SELECT_BEFORE("page_select_before"),
    PAGE_SELECT_INVOKE_SELECT("page_select_invoke_select"),
    PAGE_SELECT_PLAYER("page_select_player"),
    PAGE_SELECT_AFTER("page_select_after"),
    PLAYER_PAUSE("player_pause"),
    PLAYER_PREPARE("player_prepare"),
    PLAYER_STOP("player_stop"),
    PLAYER_RENDER_READY("player_render_ready"),
    PLAYER_RENDER_FIRST("player_render_first"),
    PLAYER_RENDER_FIRST_DELAY("player_render_first_delay");
    
    private final String type;

    public final String getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(78512);
    }

    private c(String str) {
        this.type = str;
    }
}
