package com.ss.android.ugc.aweme.commerce;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.commercialize.model.y;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

public class a implements Serializable {
    @c(a = "ad_event_type")
    public int adEventType;
    @c(a = "ad_id")
    public String adId;
    @c(a = "ad_auth_status")
    public int ad_auth_status;
    @c(a = "ad_source")
    public int ad_source;
    @c(a = "advertiser_id")
    public String advId;
    @c(a = "adv_promotable")
    public boolean adv_promotable;
    @c(a = "auction_ad_invited")
    public boolean auction_ad_invited;
    @c(a = "avoid_global_pendant")
    public boolean avoid_global_pendant;
    @c(a = "biz_account")
    public d bizAccountInfo;
    @c(a = "card_infos")
    public CardStruct cardStruct;
    @c(a = "creative_id")
    public String creativeId;
    @c(a = "dark_post_source")
    public int darkPostSource;
    @c(a = "dark_post_status")
    public int darkPostStatus;
    @c(a = "douplus_toast")
    public y douplus_toast;
    @c(a = "feedback_submitted")
    public boolean hasUserSubmittedFeedback;
    @c(a = "is_music_not_clickable")
    public boolean isMusicNotClickable;
    @c(a = "is_personal_page_forbidden")
    public boolean isPersonalPageForbidden;
    @c(a = "item_id")
    public String itemId;
    @c(a = "last_view_time")
    public long lastViewTime;
    @c(a = "mission_id")
    public long missionId;
    @c(a = "mission_item_status")
    public int missionItemStatus;
    @c(a = "prevent_delete")
    public boolean preventDelete;
    @c(a = "prevent_friend_see")
    public boolean preventFriendSee;
    @c(a = "prevent_privacy_reason")
    public String preventPrivacyReason;
    @c(a = "prevent_self_see")
    public boolean preventSelfSee;
    @c(a = "prevent_share")
    public boolean preventShare;
    @c(a = "show_share_link")
    public boolean show_share_link;
    @c(a = "study_id")
    public String studyId;
    @c(a = "with_comment_filter_words")
    public boolean withCommentFilterWords;

    static {
        Covode.recordClassIndex(45139);
    }

    public int getAdEventType() {
        return this.adEventType;
    }

    public String getAdId() {
        return this.adId;
    }

    public int getAdSource() {
        return this.ad_source;
    }

    public String getAdvId() {
        return this.advId;
    }

    public int getAuthStatus() {
        return this.ad_auth_status;
    }

    public d getBizAccountInfo() {
        return this.bizAccountInfo;
    }

    public CardStruct getCardStruct() {
        return this.cardStruct;
    }

    public String getCreativeId() {
        return this.creativeId;
    }

    public int getDarkPostSource() {
        return this.darkPostSource;
    }

    public int getDarkPostStatus() {
        return this.darkPostStatus;
    }

    public y getDouplusToast() {
        return this.douplus_toast;
    }

    public String getItemId() {
        return this.itemId;
    }

    public long getLastViewTime() {
        return this.lastViewTime;
    }

    public long getMissionId() {
        return this.missionId;
    }

    public int getMissionItemStatus() {
        return this.missionItemStatus;
    }

    public String getPreventPrivacyReason() {
        return this.preventPrivacyReason;
    }

    public String getStudyId() {
        return this.studyId;
    }

    public boolean isAdvPromotable() {
        return this.adv_promotable;
    }

    public boolean isAuctionAdInvited() {
        return this.auction_ad_invited;
    }

    public boolean isAvoidGlobalPendant() {
        return this.avoid_global_pendant;
    }

    public boolean isHasUserSubmittedFeedback() {
        return this.hasUserSubmittedFeedback;
    }

    public boolean isMusicNotClickable() {
        return this.isMusicNotClickable;
    }

    public boolean isPersonalPageForbidden() {
        return this.isPersonalPageForbidden;
    }

    public boolean isPreventDelete() {
        return this.preventDelete;
    }

    public boolean isPreventFriendSee() {
        return this.preventFriendSee;
    }

    public boolean isPreventSelfSee() {
        return this.preventSelfSee;
    }

    public boolean isPreventShare() {
        return this.preventShare;
    }

    public boolean isShowShareLink() {
        return this.show_share_link;
    }

    public boolean isWithCommentFilterWords() {
        return this.withCommentFilterWords;
    }

    public void setAdId(String str) {
        this.adId = str;
    }

    public void setAdvId(String str) {
        this.advId = str;
    }

    public void setAdvPromotable(boolean z) {
        this.adv_promotable = z;
    }

    public void setCardStruct(CardStruct cardStruct2) {
        this.cardStruct = cardStruct2;
    }

    public void setCreativeId(String str) {
        this.creativeId = str;
    }

    public void setDarkPostSource(int i2) {
        this.darkPostSource = i2;
    }

    public void setDarkPostStatus(int i2) {
        this.darkPostStatus = i2;
    }

    public void setHasUserSubmittedFeedback(boolean z) {
        this.hasUserSubmittedFeedback = z;
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public void setLastViewTime(long j2) {
        this.lastViewTime = j2;
    }

    public void setMissionId(long j2) {
        this.missionId = j2;
    }

    public void setMissionItemStatus(int i2) {
        this.missionItemStatus = i2;
    }

    public void setMusicNotClickable(boolean z) {
        this.isMusicNotClickable = z;
    }

    public void setPersonalPageForbidden(boolean z) {
        this.isPersonalPageForbidden = z;
    }

    public void setPreventDelete(boolean z) {
        this.preventDelete = z;
    }

    public void setPreventFriendSee(boolean z) {
        this.preventFriendSee = z;
    }

    public void setPreventPrivacyReason(String str) {
        this.preventPrivacyReason = str;
    }

    public void setPreventSelfSee(boolean z) {
        this.preventSelfSee = z;
    }

    public void setPreventShare(boolean z) {
        this.preventShare = z;
    }

    public void setWithCommentFilterWords(boolean z) {
        this.withCommentFilterWords = z;
    }
}
