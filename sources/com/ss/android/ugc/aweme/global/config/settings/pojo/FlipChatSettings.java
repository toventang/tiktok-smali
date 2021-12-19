package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class FlipChatSettings {
    @c(a = "main_switch")
    private Boolean mainSwitch;
    @c(a = "msg_cell_avatar_url")
    private String msgCellAvatarUrl;
    @c(a = "msg_cell_name")
    private String msgCellName;
    @c(a = "show_launch_page_popup")
    private Boolean showLaunchPagePopup;
    @c(a = "show_login_icon")
    private Boolean showLoginIcon;
    @c(a = "show_msg_cell")
    private Boolean showMsgCell;

    static {
        Covode.recordClassIndex(63037);
    }

    public Boolean getMainSwitch() {
        return this.mainSwitch;
    }

    public Boolean getShowLaunchPagePopup() {
        return this.showLaunchPagePopup;
    }

    public Boolean getShowLoginIcon() {
        return this.showLoginIcon;
    }

    public Boolean getShowMsgCell() {
        return this.showMsgCell;
    }

    public String getMsgCellAvatarUrl() {
        String str = this.msgCellAvatarUrl;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getMsgCellName() {
        String str = this.msgCellName;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
