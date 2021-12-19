package com.ss.android.ugc.aweme.question;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class c implements Serializable {
    @com.google.gson.a.c(a = "collect_status")
    private Integer collectStatus;
    @com.google.gson.a.c(a = "content")
    private String content;
    @com.google.gson.a.c(a = "create_time")
    private final Long createTime;
    @com.google.gson.a.c(a = "creator")
    private final User creator;
    @com.google.gson.a.c(a = "id")
    private final Long id;
    @com.google.gson.a.c(a = "invite_info")
    private final d inviteInfo;
    private Boolean isTranslated;
    @com.google.gson.a.c(a = "language")
    private final String language;
    @com.google.gson.a.c(a = "share_info")
    private final ShareInfo shareInfo;
    @com.google.gson.a.c(a = "video")
    private final Aweme video;
    @com.google.gson.a.c(a = "videos_count")
    private final Integer videosCount;

    static {
        Covode.recordClassIndex(77909);
    }

    public c() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final Integer getCollectStatus() {
        return this.collectStatus;
    }

    public final String getContent() {
        return this.content;
    }

    public final Long getCreateTime() {
        return this.createTime;
    }

    public final User getCreator() {
        return this.creator;
    }

    public final Long getId() {
        return this.id;
    }

    public final d getInviteInfo() {
        return this.inviteInfo;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public final Aweme getVideo() {
        return this.video;
    }

    public final Integer getVideosCount() {
        return this.videosCount;
    }

    public final Boolean isTranslated() {
        return this.isTranslated;
    }

    public final String getQuestionType() {
        if (this.video == null) {
            return "textual";
        }
        return "video";
    }

    public final boolean isCollected() {
        Integer num = this.collectStatus;
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public final c clone() {
        return new c(this.id, this.creator, this.video, this.content, this.videosCount, this.collectStatus, this.shareInfo, this.inviteInfo, this.language, this.createTime, this.isTranslated);
    }

    public final Integer getAnswerCount() {
        Integer num = this.videosCount;
        if (num != null) {
            num.intValue();
            if (l.a((Object) getQuestionType(), (Object) "video")) {
                this.videosCount.intValue();
            }
        }
        return this.videosCount;
    }

    public final void setCollectStatus(Integer num) {
        this.collectStatus = num;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setTranslated(Boolean bool) {
        this.isTranslated = bool;
    }

    public final void setCollectStatus(int i2) {
        this.collectStatus = Integer.valueOf(i2);
    }

    public c(Long l2, User user, Aweme aweme, String str, Integer num, Integer num2, ShareInfo shareInfo2, d dVar, String str2, Long l3, Boolean bool) {
        this.id = l2;
        this.creator = user;
        this.video = aweme;
        this.content = str;
        this.videosCount = num;
        this.collectStatus = num2;
        this.shareInfo = shareInfo2;
        this.inviteInfo = dVar;
        this.language = str2;
        this.createTime = l3;
        this.isTranslated = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Long l2, User user, Aweme aweme, String str, Integer num, Integer num2, ShareInfo shareInfo2, d dVar, String str2, Long l3, Boolean bool, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : l2, (i2 & 2) != 0 ? null : user, (i2 & 4) != 0 ? null : aweme, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : shareInfo2, (i2 & 128) != 0 ? null : dVar, (i2 & 256) != 0 ? null : str2, (i2 & 512) == 0 ? l3 : null, (i2 & 1024) != 0 ? false : bool);
    }
}
