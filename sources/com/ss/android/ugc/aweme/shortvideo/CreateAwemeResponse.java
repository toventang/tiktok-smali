package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

public final class CreateAwemeResponse extends ai implements d, Serializable {
    @c(a = "aweme")
    public Aweme aweme;
    @c(a = "coupon_info")
    public com.ss.android.ugc.aweme.commercialize.coupon.model.a couponInfo;
    @c(a = "has_sticker_red_packet")
    public boolean hasStickerRedPacket;
    @c(a = "is_review_video")
    public int isReviewVideo;
    @c(a = "log_pb")
    public LogPbBean logPbBean;
    @c(a = "notify")
    public String[] notify;
    @c(a = "notify_extra")
    public a notifyExtra;
    public String requestId;
    @c(a = "response_marker")
    public b responseMarker;
    @c(a = "share_tip_duration")
    public int shareTipDuration;
    @c(a = "token")
    public String stickerToken;

    public static final class a implements Serializable {
        @c(a = "button_text")
        public String btnText;
        @c(a = "text")
        public String text;
        @c(a = StringSet.type)
        public int type;

        static {
            Covode.recordClassIndex(81956);
        }
    }

    public static final class b implements Serializable {
        @c(a = "add_to_playlist_fail")
        public Boolean addToPlaylistFail;

        static {
            Covode.recordClassIndex(81957);
        }
    }

    static {
        Covode.recordClassIndex(81955);
    }

    public final LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public final String getRequestId() {
        return this.requestId;
    }

    public final void setLogPbBean(LogPbBean logPbBean2) {
        this.logPbBean = logPbBean2;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public final void setRequestId(String str) {
        this.requestId = str;
    }
}
