package com.ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.b;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.api.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.dx;
import com.ss.android.ugc.aweme.utils.gk;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Challenge extends a implements Serializable {
    @c(a = "activity_type")
    public int activityType;
    @c(a = "allow_upload_cover")
    public int allowUploadCover;
    @c(a = "cha_attrs")
    public List<String> attrs;
    @c(a = "author")
    public User author;
    @c(a = "background_image_url")
    public UrlModel backgroundImageUrl;
    @c(a = "announcement_info")
    public ChallengeAnnouncement challengeAnnouncement;
    @c(a = "cover_photo")
    public String challengeBgUrl;
    @c(a = "challenge_billboard")
    public ChallengeBillboard challengeBillboard;
    @c(a = "disclaimer")
    public ChallengeDisclaimer challengeDisclaimer;
    @c(a = "cha_name")
    public String challengeName;
    @c(a = "hashtag_profile")
    public String challengeProfileUrl;
    @b(a = dx.class)
    @c(a = "sticker_detail")
    public String challengeStickerDetail;
    @com.ss.android.ugc.aweme.base.api.b
    @c(a = "cid")
    public String cid;
    @c(a = "collect_stat")
    public int collectStatus;
    @c(a = "banner_list")
    public List<CommerceChallengeBanner> commerceChallengeBannerList;
    @c(a = "commerce_sub_type")
    public int commerceSubType = 0;
    @c(a = "connect_music")
    public List<Music> connectMusics;
    @c(a = "content_type")
    public int contentType;
    @c(a = "cover_item")
    public UrlModel coverItem;
    @b(a = gk.class)
    @c(a = "desc")
    public String desc;
    @c(a = "dynamic_list")
    public List<d> dynamicPatchList;
    @c(a = "end_color")
    public String endColor;
    @c(a = "extra_attr")
    public ChallengeExtraAttrStruct extraAttrStruct;
    @c(a = "mission_module")
    public HTCMissionModule htcMissionModule;
    @c(a = "inquiry")
    public InquiryStruct inquiryStruct;
    @c(a = "is_challenge")
    public int isChallenge;
    @c(a = "is_commerce")
    public boolean isCommerceAndValid;
    @c(a = "is_hot_search")
    public int isHotSearch;
    @c(a = "is_strong_music")
    public int isStrongMusic;
    @c(a = "link_action")
    public String linkAction;
    @c(a = "link_text")
    public String linkText;
    @c(a = "link_title")
    public String linkTitle;
    @c(a = "link_type")
    public int linkType;
    @c(a = "background_gradient")
    public BackGroundGradient mBackGroundGradient;
    @c(a = "search_highlight")
    public List<com.ss.android.ugc.aweme.search.d> mHighlightInfoList;
    @c(a = "search_cha_name")
    public String mSearchChaName;
    @c(a = "is_status")
    public int mStatus;
    @c(a = "related_media_source")
    public RelatedMediaSourceStruct mediaSource;
    @c(a = "module_type")
    public int moduleType;
    @c(a = "mv_id")
    public String mvId;
    @c(a = "label_origin_author")
    public String originAuthor;
    @c(a = "is_pgcshow")
    public boolean pgcshow;
    @c(a = "profile_tag")
    public String profileTagUrl;
    @c(a = "related_challenges")
    public List<Challenge> relatedChallenges = new ArrayList();
    public String requestId;
    @c(a = "rule_detail_desc")
    public String ruleDetailDesc;
    @c(a = "rule_detail_url")
    public String ruleDetailUrl;
    @c(a = "schema")
    public String schema;
    @c(a = "share_info")
    public ShareInfo shareInfo;
    @c(a = "show_items")
    public List<ShowItemsStruct> showItems;
    @c(a = "sponsor_ad_label")
    public String sponsorAdLabel;
    @c(a = "sponsor_label_text")
    public String sponsorLabelText;
    @c(a = "start_color")
    public String starColor;
    @c(a = "sticker_id")
    public String stickerId;
    @c(a = "sub_type")
    public int subType;
    @c(a = "tag")
    public int tag;
    @c(a = "button")
    public ChallengeTransform transfrom;
    @c(a = StringSet.type)
    public int type;
    @c(a = "user_count")
    public int userCount;
    @c(a = "view_count")
    public long viewCount = -1;

    public interface ChallengeSubType {
        static {
            Covode.recordClassIndex(50877);
        }
    }

    static {
        Covode.recordClassIndex(50876);
    }

    public int getActivityType() {
        return this.activityType;
    }

    public List<String> getAttrs() {
        return this.attrs;
    }

    public User getAuthor() {
        return this.author;
    }

    public BackGroundGradient getBackGroundGradient() {
        return this.mBackGroundGradient;
    }

    public UrlModel getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public ChallengeAnnouncement getChallengeAnnouncement() {
        return this.challengeAnnouncement;
    }

    public String getChallengeBgUrl() {
        return this.challengeBgUrl;
    }

    public ChallengeDisclaimer getChallengeDisclaimer() {
        return this.challengeDisclaimer;
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public String getChallengeProfileUrl() {
        return this.challengeProfileUrl;
    }

    public String getChallengeStickerDetail() {
        return this.challengeStickerDetail;
    }

    public String getCid() {
        return this.cid;
    }

    public int getCollectStatus() {
        return this.collectStatus;
    }

    public List<Music> getConnectMusics() {
        return this.connectMusics;
    }

    public int getContentType() {
        return this.contentType;
    }

    public UrlModel getCoverItem() {
        return this.coverItem;
    }

    public String getDesc() {
        return this.desc;
    }

    public List<d> getDynamicPatchList() {
        return this.dynamicPatchList;
    }

    public String getEndColor() {
        return this.endColor;
    }

    public List<com.ss.android.ugc.aweme.search.d> getHighlightInfoList() {
        return this.mHighlightInfoList;
    }

    public HTCMissionModule getHtcMissionModule() {
        return this.htcMissionModule;
    }

    public String getLinkAction() {
        return this.linkAction;
    }

    public String getLinkText() {
        return this.linkText;
    }

    public String getLinkTitle() {
        return this.linkTitle;
    }

    public RelatedMediaSourceStruct getMediaSource() {
        return this.mediaSource;
    }

    public int getModuleType() {
        return this.moduleType;
    }

    public String getMvId() {
        return this.mvId;
    }

    public String getProfileTagUrl() {
        return this.profileTagUrl;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getRuleDetailDesc() {
        return this.ruleDetailDesc;
    }

    public String getRuleDetailUrl() {
        return this.ruleDetailUrl;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSearchChaName() {
        return this.mSearchChaName;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public String getSponsorAdLabel() {
        return this.sponsorAdLabel;
    }

    public String getSponsorLabelText() {
        return this.sponsorLabelText;
    }

    public String getStarColor() {
        return this.starColor;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getSubType() {
        return this.subType;
    }

    public int getTag() {
        return this.tag;
    }

    public ChallengeTransform getTransfrom() {
        return this.transfrom;
    }

    public int getType() {
        return this.type;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getViewCount() {
        return this.viewCount;
    }

    public boolean isCommerceAndValid() {
        return this.isCommerceAndValid;
    }

    public boolean isPgcshow() {
        return this.pgcshow;
    }

    public boolean allowUploadCover() {
        if (this.allowUploadCover == 1) {
            return true;
        }
        return false;
    }

    public boolean isChallenge() {
        if (this.isChallenge == 1) {
            return true;
        }
        return false;
    }

    public boolean isCommerce() {
        if (this.subType == 1) {
            return true;
        }
        return false;
    }

    public boolean isStrongMusic() {
        if (this.isStrongMusic == 1) {
            return true;
        }
        return false;
    }

    public boolean isTrending() {
        if (this.isHotSearch == 1) {
            return true;
        }
        return false;
    }

    public boolean isVsChallenge() {
        if (this.activityType == 1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.cid;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isLinkActionAsOpenUrl() {
        if (this.linkType == 7) {
            return true;
        }
        return false;
    }

    public long getDisplayCount() {
        long viewCount2 = getViewCount();
        if (viewCount2 >= 0) {
            return viewCount2;
        }
        return (long) getUserCount();
    }

    public void setActivityType(int i2) {
        this.activityType = i2;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setBackGroundGradient(BackGroundGradient backGroundGradient) {
        this.mBackGroundGradient = backGroundGradient;
    }

    public void setBackgroundImageUrl(UrlModel urlModel) {
        this.backgroundImageUrl = urlModel;
    }

    public void setChallengeAnnouncement(ChallengeAnnouncement challengeAnnouncement2) {
        this.challengeAnnouncement = challengeAnnouncement2;
    }

    public void setChallengeName(String str) {
        this.challengeName = str;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setCollectStatus(int i2) {
        this.collectStatus = i2;
    }

    public void setCommerce(boolean z) {
        this.isCommerceAndValid = z;
    }

    public void setConnectMusics(List<Music> list) {
        this.connectMusics = list;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public Challenge setDynamicPatchList(List<d> list) {
        this.dynamicPatchList = list;
        return this;
    }

    public void setEndColor(String str) {
        this.endColor = str;
    }

    public void setHighlightInfoList(List<com.ss.android.ugc.aweme.search.d> list) {
        this.mHighlightInfoList = list;
    }

    public void setLinkAction(String str) {
        this.linkAction = str;
    }

    public void setLinkText(String str) {
        this.linkText = str;
    }

    public void setLinkTitle(String str) {
        this.linkTitle = str;
    }

    public void setMediaSource(RelatedMediaSourceStruct relatedMediaSourceStruct) {
        this.mediaSource = relatedMediaSourceStruct;
    }

    public void setMvId(String str) {
        this.mvId = str;
    }

    public void setOriginAuthor(String str) {
        this.originAuthor = str;
    }

    public void setRelatedChallenges(List<Challenge> list) {
        this.relatedChallenges = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSearchChaName(String str) {
        this.mSearchChaName = str;
    }

    public void setShareInfo(ShareInfo shareInfo2) {
        this.shareInfo = shareInfo2;
    }

    public void setSponsorAdLabel(String str) {
        this.sponsorAdLabel = str;
    }

    public void setStarColor(String str) {
        this.starColor = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setSubType(int i2) {
        this.subType = i2;
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public void setUserCount(int i2) {
        this.userCount = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Challenge)) {
            return false;
        }
        return TextUtils.equals(this.cid, ((Challenge) obj).cid);
    }
}
