package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui;

import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public enum b {
    EmptyTopNoticeView("empty_item", 0, 0, 0, "empty"),
    TurnOnNotificationView("dm_turn_on_notification_bar", R.string.w, R.string.v, R.string.u, "dm_push"),
    TurnOnMessagePreview("im_push_preview", R.string.bnw, R.string.bnv, R.string.bnu, "preview_message"),
    PermissionUpdatedNoticeView("permission_updated_notice", R.string.dp0, R.string.doz, 0, "empty");
    
    private final int buttonText;
    private final int description;
    private final String eventPopUpType;
    private final String noticeCode;
    private final int title;

    public final int getButtonText() {
        return this.buttonText;
    }

    public final int getDescription() {
        return this.description;
    }

    public final String getEventPopUpType() {
        return this.eventPopUpType;
    }

    public final String getNoticeCode() {
        return this.noticeCode;
    }

    public final int getTitle() {
        return this.title;
    }

    static {
        Covode.recordClassIndex(65286);
    }

    private b(String str, int i2, int i3, int i4, String str2) {
        this.noticeCode = str;
        this.title = i2;
        this.description = i3;
        this.buttonText = i4;
        this.eventPopUpType = str2;
    }
}
