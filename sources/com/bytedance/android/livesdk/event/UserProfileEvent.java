package com.bytedance.android.livesdk.event;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public class UserProfileEvent {
    public String chatType;
    public String clickModule;
    public boolean coHostEnable;
    public String content;
    public String interactLogLabel;
    public boolean linkInRoomEnable;
    public String mClickUserPosition;
    public String mEventModule;
    public Map<String, String> mRankInfo;
    public String mReportType;
    public String mSource;
    public long msgId;
    public long roomId;
    public User user;
    public long userId;

    static {
        Covode.recordClassIndex(9533);
    }

    public void setClickModule(String str) {
        this.clickModule = str;
    }

    public void setClickUserPosition(String str) {
        this.mClickUserPosition = str;
    }

    public void setEventModule(String str) {
        this.mEventModule = str;
    }

    public UserProfileEvent(long j2) {
        this.content = "";
        this.clickModule = "";
        this.linkInRoomEnable = true;
        this.chatType = "1";
        this.mReportType = "report_anchor";
        this.userId = j2;
    }

    public UserProfileEvent(User user2) {
        this.content = "";
        this.clickModule = "";
        this.linkInRoomEnable = true;
        this.chatType = "1";
        this.mReportType = "report_anchor";
        if (user2 != null) {
            this.user = user2;
            return;
        }
        throw new RuntimeException("mUser cannot be null!");
    }

    public UserProfileEvent(User user2, String str) {
        this(user2);
        this.interactLogLabel = str;
    }

    public UserProfileEvent(long j2, String str) {
        this.content = "";
        this.clickModule = "";
        this.linkInRoomEnable = true;
        this.chatType = "1";
        this.mReportType = "report_anchor";
        this.userId = j2;
        this.clickModule = str;
    }
}
