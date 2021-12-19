package com.ss.android.ugc.aweme.im.service.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.utils.dg;

public class IMUser extends IMContact {
    private int accountType;
    private String avatarStr;
    @c(a = "avatar_thumb")
    private UrlModel avatarThumb;
    private long checkedUnreadStoryMillis;
    @c(a = "comment_mention_block_status")
    private long commentMentionBlockStatus;
    @c(a = "commerce_user_level")
    private int commerceUserLevel;
    @c(a = "contact_name")
    private String contactName;
    private String contactNameInitial;
    private String contactNamePinyin;
    @c(a = "custom_verify")
    private String customVerify;
    private boolean enterprise;
    @c(a = "enterprise_verify_reason")
    private String enterpriseVerifyReason;
    @c(a = "follow_status")
    private int followStatus;
    @c(a = "follow_time")
    private long followTime;
    @c(a = "follower_status")
    int followerStatus;
    private long friendRecTime;
    @c(a = "rec_type")
    private int friendRecType;
    private boolean hasUnreadStory;
    private String initialLetter;
    @c(a = "is_block")
    private boolean isBlock;
    private boolean isFake;
    @c(a = "is_group_owner")
    private boolean isGroupOwner;
    @c(a = "is_mention_enabled")
    private boolean isMentionEnabled = true;
    private Boolean isUserEnabledQAInvite;
    private boolean isUserNotInAllFriends;
    @c(a = "nickname")
    private String nickName;
    private String nickNameInitial;
    private String nickNamePinyin;
    @c(a = "qa_invite_block_status")
    private long qaInviteBlockStatus;
    private String qaPrivacyMessage;
    private String recType = "";
    @c(a = "recommend_reason")
    private String recommendReason;
    private String remarkInitial;
    @c(a = "remark_name")
    private String remarkName;
    private String remarkPinyin;
    private int searchType;
    @c(a = "sec_uid")
    private String secUid;
    @c(a = "secret")
    boolean secret;
    private int shareLinkRelationIndex = -1;
    @c(a = "can_share_message")
    private int shareStatus = 1;
    @c(a = "short_id")
    private String shortId;
    @c(a = "signature")
    private String signature;
    private String sortWeight;
    @c(a = "third_name")
    private String thirdName;
    @c(a = "uid")
    private String uid;
    @c(a = "unique_id")
    private String uniqueId = "";
    @c(a = "verification_type")
    private int verificationType;
    @c(a = "video_mention_block_status")
    private long videoMentionBlockStatus;
    @c(a = "video_tag_block_status")
    private long videoTagBlockStatus;
    @c(a = "weibo_verify")
    private String weiboVerify;
    private boolean withCommerceEntry;

    static {
        Covode.recordClassIndex(66556);
    }

    public static boolean isFriend(int i2) {
        return i2 == 2;
    }

    public int getAccountType() {
        return this.accountType;
    }

    public String getAvatarStr() {
        return this.avatarStr;
    }

    public long getCheckedUnreadStoryMillis() {
        return this.checkedUnreadStoryMillis;
    }

    public long getCommentMentionBlockStatus() {
        return this.commentMentionBlockStatus;
    }

    public int getCommerceUserLevel() {
        return this.commerceUserLevel;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getContactNameInitial() {
        return this.contactNameInitial;
    }

    public String getContactNamePinyin() {
        return this.contactNamePinyin;
    }

    public String getCustomVerify() {
        return this.customVerify;
    }

    public boolean getEnterprise() {
        return this.enterprise;
    }

    public String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public long getFollowTime() {
        return this.followTime;
    }

    public int getFollowerStatus() {
        return this.followerStatus;
    }

    public long getFriendRecTime() {
        return this.friendRecTime;
    }

    public int getFriendRecType() {
        return this.friendRecType;
    }

    public String getInitialLetter() {
        return this.initialLetter;
    }

    public boolean getIsUserNotInAllFriends() {
        return this.isUserNotInAllFriends;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public String getNickName() {
        return this.nickName;
    }

    public String getNickNameInitial() {
        return this.nickNameInitial;
    }

    public String getNickNamePinyin() {
        return this.nickNamePinyin;
    }

    public long getQaInviteBlockStatus() {
        return this.qaInviteBlockStatus;
    }

    public String getQaPrivacyMessage() {
        return this.qaPrivacyMessage;
    }

    public String getRecType() {
        return this.recType;
    }

    public String getRecommendReason() {
        return this.recommendReason;
    }

    public String getRemarkInitial() {
        return this.remarkInitial;
    }

    public String getRemarkName() {
        return this.remarkName;
    }

    public String getRemarkPinyin() {
        return this.remarkPinyin;
    }

    public int getSearchType() {
        return this.searchType;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public int getShareLinkRelationIndex() {
        return this.shareLinkRelationIndex;
    }

    public int getShareStatus() {
        return this.shareStatus;
    }

    public String getShortId() {
        return this.shortId;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getSortWeight() {
        return this.sortWeight;
    }

    public String getThirdName() {
        return this.thirdName;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public int getVerificationType() {
        return this.verificationType;
    }

    public long getVideoMentionBlockStatus() {
        return this.videoMentionBlockStatus;
    }

    public long getVideoTagBlockStatus() {
        return this.videoTagBlockStatus;
    }

    public String getWeiboVerify() {
        return this.weiboVerify;
    }

    public boolean isBlock() {
        return this.isBlock;
    }

    public boolean isEnterprise() {
        return this.enterprise;
    }

    public boolean isFake() {
        return this.isFake;
    }

    public boolean isGroupOwner() {
        return this.isGroupOwner;
    }

    public boolean isHasUnreadStory() {
        return this.hasUnreadStory;
    }

    public boolean isMentionEnabled() {
        return this.isMentionEnabled;
    }

    public boolean isSecret() {
        return this.secret;
    }

    public Boolean isUserEnabledQAInvite() {
        return this.isUserEnabledQAInvite;
    }

    public boolean isWithCommerceEntry() {
        return this.withCommerceEntry;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public UrlModel getDisplayAvatar() {
        return getAvatarThumb();
    }

    public String getDisplayId() {
        if (TextUtils.isEmpty(this.uniqueId)) {
            return this.shortId;
        }
        return this.uniqueId;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public String getDisplayName() {
        if (TextUtils.isEmpty(this.remarkName)) {
            return this.nickName;
        }
        return this.remarkName;
    }

    public int getFollowStatus() {
        if (isSelf(this.uid)) {
            return 2;
        }
        return this.followStatus;
    }

    public UrlModel getAvatarThumb() {
        if (this.avatarThumb == null && !TextUtils.isEmpty(this.avatarStr)) {
            try {
                this.avatarThumb = (UrlModel) dg.a(this.avatarStr, UrlModel.class);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.avatarThumb;
    }

    public int hashCode() {
        if (getUid() != null) {
            return getUid().hashCode();
        }
        return 0;
    }

    @Override // java.lang.Object
    public IMUser clone() {
        IMUser iMUser = new IMUser();
        iMUser.uid = this.uid;
        iMUser.secUid = this.secUid;
        iMUser.nickName = this.nickName;
        iMUser.signature = this.signature;
        iMUser.avatarThumb = this.avatarThumb;
        iMUser.followStatus = this.followStatus;
        iMUser.relationListItemType = this.relationListItemType;
        iMUser.uniqueId = this.uniqueId;
        iMUser.shortId = this.shortId;
        iMUser.weiboVerify = this.weiboVerify;
        iMUser.customVerify = this.customVerify;
        iMUser.enterpriseVerifyReason = this.enterpriseVerifyReason;
        iMUser.verificationType = this.verificationType;
        iMUser.remarkName = this.remarkName;
        iMUser.avatarStr = this.avatarStr;
        iMUser.initialLetter = this.initialLetter;
        iMUser.sortWeight = this.sortWeight;
        iMUser.remarkPinyin = this.remarkPinyin;
        iMUser.remarkInitial = this.remarkInitial;
        iMUser.nickNamePinyin = this.nickNamePinyin;
        iMUser.nickNameInitial = this.nickNameInitial;
        iMUser.isBlock = this.isBlock;
        iMUser.commerceUserLevel = this.commerceUserLevel;
        iMUser.withCommerceEntry = this.withCommerceEntry;
        iMUser.hasUnreadStory = this.hasUnreadStory;
        iMUser.checkedUnreadStoryMillis = this.checkedUnreadStoryMillis;
        iMUser.contactName = this.contactName;
        iMUser.contactNamePinyin = this.contactNamePinyin;
        iMUser.contactNameInitial = this.contactNameInitial;
        iMUser.shareStatus = this.shareStatus;
        iMUser.enterprise = this.enterprise;
        iMUser.accountType = this.accountType;
        iMUser.isGroupOwner = this.isGroupOwner;
        iMUser.recommendReason = this.recommendReason;
        iMUser.followerStatus = this.followerStatus;
        iMUser.thirdName = this.thirdName;
        iMUser.recType = this.recType;
        iMUser.secret = this.secret;
        iMUser.followTime = this.followTime;
        iMUser.shareLinkRelationIndex = this.shareLinkRelationIndex;
        iMUser.isUserNotInAllFriends = this.isUserNotInAllFriends;
        iMUser.isUserEnabledQAInvite = this.isUserEnabledQAInvite;
        iMUser.qaPrivacyMessage = this.qaPrivacyMessage;
        iMUser.isMentionEnabled = this.isMentionEnabled;
        iMUser.commentMentionBlockStatus = this.commentMentionBlockStatus;
        iMUser.videoMentionBlockStatus = this.videoMentionBlockStatus;
        iMUser.videoTagBlockStatus = this.videoTagBlockStatus;
        iMUser.qaInviteBlockStatus = this.qaInviteBlockStatus;
        return iMUser;
    }

    public String toString() {
        return "IMUser{uid='" + this.uid + '\'' + ", secUid='" + this.secUid + '\'' + ", nickName='" + this.nickName + '\'' + ", signature='" + this.signature + '\'' + ", avatarThumb=" + this.avatarThumb + ", followStatus=" + this.followStatus + ", uniqueId='" + this.uniqueId + '\'' + ", shortId='" + this.shortId + '\'' + ", weiboVerify='" + this.weiboVerify + '\'' + ", customVerify='" + this.customVerify + '\'' + ", enterpriseVerifyReason='" + this.enterpriseVerifyReason + '\'' + ", verificationType=" + this.verificationType + ", remarkName='" + this.remarkName + '\'' + ", commerceUserLevel=" + this.commerceUserLevel + ", contactName='" + this.contactName + '\'' + ", withCommerceEntry=" + this.withCommerceEntry + ", hasUnreadStory=" + this.hasUnreadStory + ", checkedUnreadStoryMillis=" + this.checkedUnreadStoryMillis + ", avatarStr='" + this.avatarStr + '\'' + ", sortWeight='" + this.sortWeight + '\'' + ", initialLetter='" + this.initialLetter + '\'' + ", remarkPinyin='" + this.remarkPinyin + '\'' + ", remarkInitial='" + this.remarkInitial + '\'' + ", nickNamePinyin='" + this.nickNamePinyin + '\'' + ", nickNameInitial='" + this.nickNameInitial + '\'' + ", contactNamePinyin='" + this.contactNamePinyin + '\'' + ", contactNameInitial='" + this.contactNameInitial + '\'' + ", shareStatus=" + this.shareStatus + ", searchType=" + this.searchType + ", isBlock=" + this.isBlock + ", isFake=" + this.isFake + ", friendRecType=" + this.friendRecType + ", friendRecTime=" + this.friendRecTime + ", enterprise=" + this.enterprise + ", accountType=" + this.accountType + ", followerStatus=" + this.followerStatus + ", followTime =" + this.followTime + ", secret=" + this.secret + ", isMentionEnabled=" + this.isMentionEnabled + ", commentMentionBlockStatus=" + this.commentMentionBlockStatus + ", videoMentionBlockStatus=" + this.videoMentionBlockStatus + ", videoTagBlockStatus=" + this.videoTagBlockStatus + ", qaInviteBlockStatus=" + this.qaInviteBlockStatus + '}';
    }

    public void setAccountType(int i2) {
        this.accountType = i2;
    }

    public void setAvatarStr(String str) {
        this.avatarStr = str;
    }

    public void setBlock(boolean z) {
        this.isBlock = z;
    }

    public void setCheckedUnreadStoryMillis(long j2) {
        this.checkedUnreadStoryMillis = j2;
    }

    public void setCommentMentionBlockStatus(long j2) {
        this.commentMentionBlockStatus = j2;
    }

    public void setCommerceUserLevel(int i2) {
        this.commerceUserLevel = i2;
    }

    public void setContactName(String str) {
        this.contactName = str;
    }

    public void setContactNameInitial(String str) {
        this.contactNameInitial = str;
    }

    public void setContactNamePinyin(String str) {
        this.contactNamePinyin = str;
    }

    public void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public void setEnterprise(boolean z) {
        this.enterprise = z;
    }

    public void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }

    public void setFake(boolean z) {
        this.isFake = z;
    }

    public void setFollowStatus(int i2) {
        this.followStatus = i2;
    }

    public void setFollowerStatus(int i2) {
        this.followerStatus = i2;
    }

    public void setFriendRecTime(long j2) {
        this.friendRecTime = j2;
    }

    public void setFriendRecType(int i2) {
        this.friendRecType = i2;
    }

    public void setGroupOwner(boolean z) {
        this.isGroupOwner = z;
    }

    public void setHasUnreadStory(boolean z) {
        this.hasUnreadStory = z;
    }

    public void setInitialLetter(String str) {
        this.initialLetter = str;
    }

    public void setIsUserNotInAllFriends(boolean z) {
        this.isUserNotInAllFriends = z;
    }

    public void setMentionEnabled(boolean z) {
        this.isMentionEnabled = z;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setNickNameInitial(String str) {
        this.nickNameInitial = str;
    }

    public void setNickNamePinyin(String str) {
        this.nickNamePinyin = str;
    }

    public void setQaInviteBlockStatus(long j2) {
        this.qaInviteBlockStatus = j2;
    }

    public void setQaPrivacyMessage(String str) {
        this.qaPrivacyMessage = str;
    }

    public void setRecType(String str) {
        this.recType = str;
    }

    public void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public void setRemarkInitial(String str) {
        this.remarkInitial = str;
    }

    public void setRemarkName(String str) {
        this.remarkName = str;
    }

    public void setRemarkPinyin(String str) {
        this.remarkPinyin = str;
    }

    public void setSearchType(int i2) {
        this.searchType = i2;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSecret(boolean z) {
        this.secret = z;
    }

    public void setShareLinkRelationIndex(int i2) {
        this.shareLinkRelationIndex = i2;
    }

    public void setShareStatus(int i2) {
        this.shareStatus = i2;
    }

    public void setShortId(String str) {
        this.shortId = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSortWeight(String str) {
        this.sortWeight = str;
    }

    public void setThirdName(String str) {
        this.thirdName = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public void setUserEnabledQAInvite(Boolean bool) {
        this.isUserEnabledQAInvite = bool;
    }

    public void setVerificationType(int i2) {
        this.verificationType = i2;
    }

    public void setVideoMentionBlockStatus(long j2) {
        this.videoMentionBlockStatus = j2;
    }

    public void setVideoTagBlockStatus(long j2) {
        this.videoTagBlockStatus = j2;
    }

    public void setWeiboVerify(String str) {
        this.weiboVerify = str;
    }

    public void setWithCommerceEntry(boolean z) {
        this.withCommerceEntry = z;
    }

    public void setFollowTime(long j2) {
        this.followTime = j2;
        this.friendRecTime = j2 * 1000;
    }

    public static boolean isInvalidUser(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            if (Long.parseLong(str) <= 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isSelf(String str) {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null) {
            return TextUtils.equals(createIUserServicebyMonsterPlugin.getCurrentUserID(), str);
        }
        return false;
    }

    public void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
        try {
            this.avatarStr = dg.a().b(urlModel);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMUser)) {
            return false;
        }
        IMUser iMUser = (IMUser) obj;
        if (getUid() != null) {
            return getUid().equals(iMUser.getUid());
        }
        if (iMUser.getUid() == null) {
            return true;
        }
        return false;
    }

    public static IMUser fromInteractionTagUser(InteractionTagUserInfo interactionTagUserInfo) {
        if (interactionTagUserInfo == null) {
            return null;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(interactionTagUserInfo.getUid());
        iMUser.setNickName(interactionTagUserInfo.getNickname());
        iMUser.setAvatarThumb(interactionTagUserInfo.getAvatarThumb());
        if (interactionTagUserInfo.getFollowStatus() == 1 && interactionTagUserInfo.getFollowerStatus() == 1) {
            iMUser.setFollowStatus(2);
        } else {
            iMUser.setFollowStatus(interactionTagUserInfo.getFollowStatus());
        }
        iMUser.setFollowerStatus(interactionTagUserInfo.getFollowerStatus());
        iMUser.setUniqueId(interactionTagUserInfo.getUniqueId());
        iMUser.setCustomVerify(interactionTagUserInfo.getCustomVerify());
        iMUser.setEnterpriseVerifyReason(interactionTagUserInfo.getEnterpriseVerifyReason());
        iMUser.setCheckedUnreadStoryMillis(0);
        return iMUser;
    }

    public static InteractionTagUserInfo toInteractionTagUserInfo(IMUser iMUser) {
        InteractionTagUserInfo interactionTagUserInfo = new InteractionTagUserInfo();
        interactionTagUserInfo.setUid(iMUser.getUid());
        interactionTagUserInfo.setUniqueId(iMUser.getUniqueId());
        interactionTagUserInfo.setNickname(iMUser.getNickName());
        interactionTagUserInfo.setAvatarThumb(iMUser.getAvatarThumb());
        interactionTagUserInfo.setFollowStatus(iMUser.getFollowStatus());
        interactionTagUserInfo.setFollowerStatus(iMUser.getFollowerStatus());
        interactionTagUserInfo.setPrivateAccount(iMUser.isSecret() ? 1 : 0);
        interactionTagUserInfo.setCustomVerify(iMUser.getCustomVerify());
        interactionTagUserInfo.setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
        return interactionTagUserInfo;
    }

    public static IMUser fromUser(User user) {
        if (user == null) {
            return null;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(user.getUid());
        iMUser.setSecUid(user.getSecUid());
        iMUser.setNickName(user.getNickname());
        iMUser.setSignature(user.getSignature());
        iMUser.setAvatarThumb(user.getAvatarThumb());
        boolean z = true;
        if (user.getFollowStatus() == 1 && user.getFollowerStatus() == 1) {
            iMUser.setFollowStatus(2);
        } else {
            iMUser.setFollowStatus(user.getFollowStatus());
        }
        iMUser.setFollowerStatus(user.getFollowerStatus());
        iMUser.setUniqueId(user.getUniqueId());
        iMUser.setShortId(user.getShortId());
        iMUser.setCustomVerify(user.getCustomVerify());
        iMUser.setEnterpriseVerifyReason(user.getEnterpriseVerifyReason());
        iMUser.setVerificationType(user.getVerificationType());
        iMUser.setRemarkName(user.getRemarkName());
        iMUser.setBlock(user.isBlock());
        iMUser.setContactName(user.getContactName());
        iMUser.setCommerceUserLevel(user.getCommerceUserLevel());
        iMUser.setWithCommerceEntry(user.isWithCommerceEntry());
        iMUser.setCheckedUnreadStoryMillis(0);
        if (user.getCommercePermission() == null || user.getCommercePermission().enterprise != 1) {
            z = false;
        }
        iMUser.setEnterprise(z);
        iMUser.setAccountType(user.getAccountType());
        iMUser.setRecommendReason(user.getRecommendReason());
        iMUser.setSecret(user.isSecret());
        return iMUser;
    }

    public static User toUser(IMUser iMUser) {
        User user = new User();
        user.setUid(iMUser.getUid());
        user.setSecUid(iMUser.getSecUid());
        user.setNickname(iMUser.getNickName());
        user.setSignature(iMUser.getSignature());
        user.setAvatarThumb(iMUser.getAvatarThumb());
        user.setFollowStatus(iMUser.getFollowStatus());
        user.setUniqueId(iMUser.getUniqueId());
        user.setShortId(iMUser.getShortId());
        user.setCustomVerify(iMUser.getCustomVerify());
        user.setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
        user.setVerificationType(iMUser.getVerificationType());
        user.setRemarkName(iMUser.getRemarkName());
        user.setBlock(iMUser.isBlock());
        user.setCommerceUserLevel(iMUser.getCommerceUserLevel());
        user.setWithCommerceEntry(iMUser.isWithCommerceEntry());
        user.setRecommendReason(iMUser.getRecommendReason());
        user.setFollowerStatus(iMUser.getFollowerStatus());
        user.setSecret(iMUser.isSecret());
        user.setAccountType(iMUser.accountType);
        return user;
    }

    public void copy(IMUser iMUser) {
        setUid(iMUser.getUid());
        setSecUid(iMUser.getSecUid());
        setNickName(iMUser.getNickName());
        setSignature(iMUser.getSignature());
        setAvatarThumb(iMUser.getAvatarThumb());
        setFollowStatus(iMUser.getFollowStatus());
        setUniqueId(iMUser.getUniqueId());
        setShortId(iMUser.getShortId());
        setWeiboVerify(iMUser.getWeiboVerify());
        setCustomVerify(iMUser.getCustomVerify());
        setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
        setVerificationType(iMUser.getVerificationType());
        setRemarkName(iMUser.getRemarkName());
        setBlock(iMUser.isBlock());
        setCommerceUserLevel(iMUser.getCommerceUserLevel());
        setWithCommerceEntry(iMUser.isWithCommerceEntry());
        setHasUnreadStory(iMUser.isHasUnreadStory());
        setCheckedUnreadStoryMillis(0);
        setShareStatus(iMUser.getShareStatus());
        setEnterprise(iMUser.getEnterprise());
        setAccountType(iMUser.getAccountType());
        setRecommendReason(iMUser.recommendReason);
        setFollowerStatus(iMUser.followerStatus);
        setThirdName(iMUser.thirdName);
        setRecType(iMUser.recType);
        setSecret(iMUser.secret);
        setFollowTime(iMUser.followTime);
        setIsUserNotInAllFriends(iMUser.isUserNotInAllFriends);
        setUserEnabledQAInvite(iMUser.isUserEnabledQAInvite);
        setQaPrivacyMessage(iMUser.qaPrivacyMessage);
        setMentionEnabled(iMUser.isMentionEnabled);
        setCommentMentionBlockStatus(iMUser.commentMentionBlockStatus);
        setVideoTagBlockStatus(iMUser.videoTagBlockStatus);
        setVideoMentionBlockStatus(iMUser.videoMentionBlockStatus);
        setQaInviteBlockStatus(iMUser.qaInviteBlockStatus);
    }
}
