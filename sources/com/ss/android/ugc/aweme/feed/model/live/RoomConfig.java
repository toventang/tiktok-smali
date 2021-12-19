package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class RoomConfig implements Serializable {
    @c(a = "enable_emoji")
    public int enableEmoji;
    @c(a = "enable_fans_club")
    public int enableFansClub;
    @c(a = "enable_hourly_list")
    public int enableHourRank;
    @c(a = "enable_send_barrage")
    public int enableSendBarrage;
    @c(a = "enable_send_comment")
    public int enableSendComment;
    @c(a = "enable_send_gift")
    public int enableSendGift;
    @c(a = "enable_send_gift_guide")
    public int enableSendGiftGuide;
    @c(a = "enable_send_shortcut_gift")
    public int enableSendShortcutGift;
    @c(a = "enable_share")
    public int enableShare;

    static {
        Covode.recordClassIndex(59508);
    }

    private boolean calc(int i2, int i3) {
        int i4 = i3 == 0 ? 1 : 2;
        return (i2 & i4) == i4;
    }

    public boolean enableHourRank(int i2) {
        return calc(this.enableHourRank, i2);
    }

    public boolean isEnableEmoji(int i2) {
        return calc(this.enableEmoji, i2);
    }

    public boolean isEnableFansClub(int i2) {
        return calc(this.enableFansClub, i2);
    }

    public boolean isEnableSendBarrage(int i2) {
        return calc(this.enableSendBarrage, i2);
    }

    public boolean isEnableSendComment(int i2) {
        return calc(this.enableSendComment, i2);
    }

    public boolean isEnableSendGift(int i2) {
        return calc(this.enableSendGift, i2);
    }

    public boolean isEnableSendGiftGuide(int i2) {
        return calc(this.enableSendGiftGuide, i2);
    }

    public boolean isEnableShare(int i2) {
        return calc(this.enableShare, i2);
    }

    public boolean isEnableShortcutGift(int i2) {
        return calc(this.enableSendShortcutGift, i2);
    }
}
