package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public class ActivityLinkResponse extends BaseResponse {
    @c(a = "link_info")
    public LinkInfo linkInfo;

    static {
        Covode.recordClassIndex(75197);
    }

    public class LinkInfo {
        @c(a = "background_style")
        public String backgroundUrl;
        @c(a = "close_after")
        public int closeAfter;
        @c(a = "days_no_show")
        public int daysNotShow;
        @c(a = "days_window")
        public int daysWindow;
        @c(a = "click_disappear")
        public boolean disappearAfterClicked;
        @c(a = "font_color")
        public String fontColor;
        @c(a = "max_close")
        public int maxClose;
        @c(a = "teenager_mode_enable")
        public boolean teenagerModeEnable;
        @c(a = "text")
        public String text;
        @c(a = "h5_url")
        public String url;

        static {
            Covode.recordClassIndex(75198);
        }

        public LinkInfo() {
        }
    }
}
