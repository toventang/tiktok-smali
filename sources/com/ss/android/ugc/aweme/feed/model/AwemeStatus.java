package com.ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.utils.g;
import java.io.Serializable;
import java.util.Arrays;

public class AwemeStatus implements Serializable, Cloneable {
    @c(a = "aid")
    public String aid;
    @c(a = "allow_comment")
    public boolean allowComment;
    @c(a = "video_hide_search")
    public int allowRecommend;
    @c(a = "allow_share")
    public boolean allowShare;
    @c(a = "download_status")
    public int downloadStatus;
    @c(a = "dont_share_status")
    public int excludeStatus;
    @c(a = "in_reviewing")
    public boolean inReviewing;
    @c(a = "is_delete")
    public boolean isDelete;
    @c(a = "is_prohibited")
    public boolean isProhibited;
    @c(a = "tiktok_music_edit_status")
    public int musicEditStatus;
    @c(a = "private_status")
    public int privateStatus;
    @c(a = "review_result")
    public ReviewResult reviewResult;
    @c(a = "reviewed")
    public int reviewed;
    @c(a = "self_see")
    public boolean selfSee;
    @c(a = "show_good_delay_time")
    public int showGoodDelayTime = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    @c(a = "video_mute")
    public VideoMuteInfo videoMuteInfo;

    static {
        Covode.recordClassIndex(59335);
    }

    /* access modifiers changed from: package-private */
    public class ReviewResult implements Serializable {
        @c(a = "cover_notice")
        String coverNotice;
        @c(a = "detail_url")
        String detailUrl;
        @c(a = "review_status")
        int reviewStatus;
        @c(a = "should_tell")
        boolean shouldTell;
        @c(a = "video_detail_notice")
        String videoDetailNotice;
        @c(a = "video_detail_notice_bottom")
        String videoDetailNoticeBottom;

        static {
            Covode.recordClassIndex(59338);
        }

        public String getCoverNotice() {
            return this.coverNotice;
        }

        public String getDetailUrl() {
            return this.detailUrl;
        }

        public int getReviewStatus() {
            return this.reviewStatus;
        }

        public boolean getShouldTell() {
            return this.shouldTell;
        }

        public String getVideoDetailNotice() {
            return this.videoDetailNotice;
        }

        public String getVideoDetailNoticeBottom() {
            return this.videoDetailNoticeBottom;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{AwemeStatus.this.reviewResult, Boolean.valueOf(this.shouldTell), this.detailUrl});
        }

        public String toString() {
            return "review_result{review_status=" + this.reviewStatus + "should_tell=" + this.shouldTell + "detail_url=" + this.detailUrl + "}";
        }

        public void setCoverNotice(String str) {
            this.coverNotice = str;
        }

        public void setDetailUrl(String str) {
            this.detailUrl = str;
        }

        public void setReviewStatus(int i2) {
            this.reviewStatus = i2;
        }

        public void setShouldTell(boolean z) {
            this.shouldTell = z;
        }

        public void setVideoDetailNotice(String str) {
            this.videoDetailNotice = str;
        }

        public void setVideoDetailNoticeBottom(String str) {
            this.videoDetailNoticeBottom = str;
        }

        ReviewResult() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewResult)) {
                return false;
            }
            ReviewResult reviewResult = (ReviewResult) obj;
            if (this.reviewStatus == reviewResult.reviewStatus && this.shouldTell == reviewResult.shouldTell && g.a(this.detailUrl, reviewResult.detailUrl)) {
                return true;
            }
            return false;
        }
    }

    public class VideoMuteInfo implements Serializable {
        @c(a = "is_mute")
        public boolean isMute;
        @c(a = "mute_desc")
        public String muteDesc;
        @c(a = "mute_detail_notice_bottom")
        public String muteDetailNotice;
        @c(a = "mute_detail_url")
        public String muteDetailUrl;

        static {
            Covode.recordClassIndex(59339);
        }

        public String getMuteDesc() {
            return this.muteDesc;
        }

        public String getMuteDetailNotice() {
            return this.muteDetailNotice;
        }

        public String getMuteDetailUrl() {
            return this.muteDetailUrl;
        }

        public boolean isMute() {
            return this.isMute;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.isMute), this.muteDesc});
        }

        public String toString() {
            return "VideoMuteInfo{isMute=" + this.isMute + ", muteDesc='" + this.muteDesc + '\'' + ", muteDetailUrl=" + this.muteDetailUrl + ", muteDetailNotice" + this.muteDetailNotice + '}';
        }

        public VideoMuteInfo() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoMuteInfo)) {
                return false;
            }
            VideoMuteInfo videoMuteInfo = (VideoMuteInfo) obj;
            if (this.isMute != videoMuteInfo.isMute || !g.a(this.muteDesc, videoMuteInfo.muteDesc)) {
                return false;
            }
            return true;
        }
    }

    public String getAid() {
        return this.aid;
    }

    public int getAllowRecommend() {
        return this.allowRecommend;
    }

    public int getDownloadStatus() {
        return this.downloadStatus;
    }

    public int getExcludeStatus() {
        return this.excludeStatus;
    }

    public int getMusicEditStatus() {
        return this.musicEditStatus;
    }

    public int getPrivateStatus() {
        return this.privateStatus;
    }

    public ReviewResult getReviewResult() {
        return this.reviewResult;
    }

    public int getShowGoodDelayTime() {
        return this.showGoodDelayTime;
    }

    public VideoMuteInfo getVideoMuteInfo() {
        return this.videoMuteInfo;
    }

    public boolean isAllowComment() {
        return this.allowComment;
    }

    public boolean isAllowShare() {
        return this.allowShare;
    }

    public boolean isDelete() {
        return this.isDelete;
    }

    public boolean isInReviewing() {
        return this.inReviewing;
    }

    public boolean isProhibited() {
        return this.isProhibited;
    }

    public boolean isSelfSee() {
        return this.selfSee;
    }

    public boolean isPrivate() {
        if (this.privateStatus == 1) {
            return true;
        }
        return false;
    }

    public boolean isReviewed() {
        if (this.reviewed == 1) {
            return true;
        }
        return false;
    }

    public int getReviewStatus() {
        ReviewResult reviewResult2 = this.reviewResult;
        if (reviewResult2 != null) {
            return reviewResult2.reviewStatus;
        }
        return 0;
    }

    public boolean shouldShowReviewStatus() {
        ReviewResult reviewResult2 = this.reviewResult;
        if (reviewResult2 == null || reviewResult2.reviewStatus == 0) {
            return false;
        }
        return true;
    }

    public String getReviewDetailUrl() {
        ReviewResult reviewResult2 = this.reviewResult;
        if (reviewResult2 != null && !TextUtils.isEmpty(reviewResult2.detailUrl)) {
            return this.reviewResult.detailUrl;
        }
        return "";
    }

    public boolean isProhibitedAndShouldTell() {
        ReviewResult reviewResult2 = this.reviewResult;
        if (reviewResult2 == null || reviewResult2.reviewStatus != 1 || !this.reviewResult.shouldTell) {
            return false;
        }
        return true;
    }

    public boolean isSelfSeeAndShouldTell() {
        ReviewResult reviewResult2 = this.reviewResult;
        if (reviewResult2 == null || reviewResult2.reviewStatus != 2 || !this.reviewResult.shouldTell) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public AwemeStatus clone() {
        AwemeStatus awemeStatus = new AwemeStatus();
        awemeStatus.aid = this.aid;
        awemeStatus.isDelete = this.isDelete;
        awemeStatus.allowShare = this.allowShare;
        awemeStatus.allowComment = this.allowComment;
        awemeStatus.privateStatus = this.privateStatus;
        awemeStatus.showGoodDelayTime = this.showGoodDelayTime;
        awemeStatus.inReviewing = this.inReviewing;
        awemeStatus.reviewed = this.reviewed;
        awemeStatus.selfSee = this.selfSee;
        awemeStatus.isProhibited = this.isProhibited;
        awemeStatus.downloadStatus = this.downloadStatus;
        awemeStatus.reviewResult = this.reviewResult;
        awemeStatus.excludeStatus = this.excludeStatus;
        awemeStatus.allowRecommend = this.allowRecommend;
        awemeStatus.videoMuteInfo = this.videoMuteInfo;
        awemeStatus.musicEditStatus = this.musicEditStatus;
        return awemeStatus;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.aid, Boolean.valueOf(this.isDelete), Boolean.valueOf(this.allowShare), Boolean.valueOf(this.allowComment), Integer.valueOf(this.privateStatus), Integer.valueOf(this.showGoodDelayTime), Boolean.valueOf(this.inReviewing), Integer.valueOf(this.reviewed), Boolean.valueOf(this.selfSee), Boolean.valueOf(this.isProhibited), Integer.valueOf(this.downloadStatus), this.reviewResult, Integer.valueOf(this.allowRecommend), Integer.valueOf(this.excludeStatus), this.videoMuteInfo});
    }

    public String toString() {
        String str;
        ReviewResult reviewResult2 = this.reviewResult;
        if (reviewResult2 != null) {
            str = reviewResult2.toString();
        } else {
            str = "";
        }
        return "AwemeStatus{aid='" + this.aid + '\'' + ", isDelete=" + this.isDelete + ", allowShare=" + this.allowShare + ", allowComment=" + this.allowComment + ", privateStatus=" + this.privateStatus + ", showGoodDelayTime=" + this.showGoodDelayTime + ", inReviewing=" + this.inReviewing + ", reviewed=" + this.reviewed + ", selfSee=" + this.selfSee + ", isProhibited=" + this.isProhibited + ", downloadStatus=" + this.downloadStatus + ", reviewStatus=" + str + ", excludeStatus=" + this.excludeStatus + ", allowRecommend=" + this.allowRecommend + ", videoMuteInfo=" + this.videoMuteInfo + ", musicEditStatus=" + this.musicEditStatus + '}';
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAllowComment(boolean z) {
        this.allowComment = z;
    }

    public void setAllowRecommend(int i2) {
        this.allowRecommend = i2;
    }

    public void setAllowShare(boolean z) {
        this.allowShare = z;
    }

    public void setDelete(boolean z) {
        this.isDelete = z;
    }

    public void setDownloadStatus(int i2) {
        this.downloadStatus = i2;
    }

    public void setExcludeStatus(int i2) {
        this.excludeStatus = i2;
    }

    public void setInReviewing(boolean z) {
        this.inReviewing = z;
    }

    public void setPrivateStatus(int i2) {
        this.privateStatus = i2;
    }

    public void setProhibited(boolean z) {
        this.isProhibited = z;
    }

    public void setReviewResult(ReviewResult reviewResult2) {
        this.reviewResult = reviewResult2;
    }

    public void setSelfSee(boolean z) {
        this.selfSee = z;
    }

    public void setPrivate(boolean z) {
        if (z) {
            this.privateStatus = 1;
        } else {
            this.privateStatus = 0;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeStatus)) {
            return false;
        }
        AwemeStatus awemeStatus = (AwemeStatus) obj;
        if (this.isDelete == awemeStatus.isDelete && this.allowShare == awemeStatus.allowShare && this.allowComment == awemeStatus.allowComment && this.privateStatus == awemeStatus.privateStatus && this.showGoodDelayTime == awemeStatus.showGoodDelayTime && this.inReviewing == awemeStatus.inReviewing && this.reviewed == awemeStatus.reviewed && this.selfSee == awemeStatus.selfSee && this.isProhibited == awemeStatus.isProhibited && this.downloadStatus == awemeStatus.downloadStatus && g.a(this.aid, awemeStatus.aid) && g.a(this.reviewResult, awemeStatus.reviewResult) && this.allowRecommend == awemeStatus.allowRecommend && this.excludeStatus == awemeStatus.excludeStatus && g.a(this.videoMuteInfo, awemeStatus.videoMuteInfo) && this.musicEditStatus == awemeStatus.musicEditStatus) {
            return true;
        }
        return false;
    }
}
