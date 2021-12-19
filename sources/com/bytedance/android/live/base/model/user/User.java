package com.bytedance.android.live.base.model.user;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.model.FansClubMember;
import com.bytedance.android.livesdk.model.FraternityInfo;
import com.bytedance.android.livesdk.model.NobleLevelInfo;
import com.bytedance.android.livesdk.model.ae;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdk.model.bc;
import com.bytedance.android.livesdk.model.d;
import com.bytedance.android.livesdk.model.e;
import com.bytedance.android.livesdk.model.g;
import com.bytedance.android.livesdk.model.h;
import com.bytedance.android.livesdk.model.j;
import com.bytedance.android.livesdk.model.z;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;
import java.util.ArrayList;
import java.util.List;

public class User implements b {
    public static boolean sSubPermission;
    @c(a = "allow_find_by_contacts")
    public Boolean allowFindByContacts;
    @c(a = "allow_others_download_video")
    public Boolean allowOthersDownloadVideo;
    @c(a = "allow_others_download_when_sharing_video")
    public Boolean allowOthersDownloadWhenSharingVideo;
    @c(a = "allow_share_show_profile")
    public Boolean allowShareShowProfile;
    @c(a = "allow_show_in_gossip")
    public Boolean allowShowInGossip;
    @c(a = "allow_show_my_action")
    public Boolean allowShowMyAction;
    @c(a = "allow_strange_comment")
    public Boolean allowStrangeComment;
    @c(a = "allow_unfollower_comment")
    public Boolean allowUnfollowerComment;
    @c(a = "allow_use_linkmic")
    public Boolean allowUseLinkmic;
    @c(a = "anchor_info")
    d anchorInfo;
    @c(a = "webcast_anchor_level")
    e anchorLevel;
    @c(a = "authentication_info")
    g authenticationInfo;
    @c(a = "author_stats")
    h authorInfo;
    @c(a = "avatar_border")
    ImageModel avatarBorder;
    @c(a = "avatar_jpg")
    public ImageModel avatarJpg;
    @c(a = "avatar_large")
    ImageModel avatarLarge;
    @c(a = "avatar_medium")
    ImageModel avatarMedium;
    @c(a = "avatar_thumb")
    ImageModel avatarThumb;
    @c(a = "bg_img_url")
    String backgroundImgUrl;
    @c(a = "badge_image_list")
    List<ImageModel> badgeImageList;
    @c(a = "block_status")
    public Integer blockStatus;
    @c(a = "border")
    j border;
    @c(a = "border_list")
    List<j> borders;
    @c(a = "combo_badge_info")
    a comboBadgeInfo;
    @c(a = "comment_restrict")
    public Integer commentRestrict;
    @c(a = "commerce_webcast_config_ids")
    public List<Long> commerceWebcastConfigIds;
    @c(a = "constellation")
    public String constellation;
    @c(a = "create_time")
    long createTime;
    @c(a = "disable_ichat")
    public Integer disableIchat;
    @c(a = "display_id")
    public String displayId;
    @c(a = "with_car_management_permission")
    boolean enableCarManagementPermission;
    @c(a = "enable_ichat_img")
    public Long enableIchatImg;
    @c(a = "with_commerce_permission")
    boolean enableShowCommerceSale;
    @c(a = "exp")
    public Integer exp;
    @c(a = "ticket_count")
    long fanTicketCount;
    @c(a = "fans_club")
    FansClubMember fansClub;
    @c(a = "fold_stranger_chat")
    public Boolean foldStrangerChat;
    @c(a = "follow_info")
    FollowInfo followInfo;
    @c(a = "follow_status")
    public Long followStatus;
    FraternityInfo fraternityInfo;
    @c(a = "ichat_restrict_type")
    public Integer ichatRestrictType;
    @c(a = "id")
    long id;
    @c(a = "id_str")
    String idStr;
    @c(a = "is_follower")
    public Boolean isFollower;
    @c(a = "is_following")
    public Boolean isFollowing;
    @c(a = "verified")
    boolean isVerified;
    @c(a = "link_mic_stats")
    int linkMicStats;
    private String logPb;
    private String mAvatarLargeStr;
    private String mAvatarMediumStr;
    private String mAvatarThumbStr;
    @c(a = "medal")
    ImageModel medal;
    @c(a = "media_badge_image_list")
    public List<ImageModel> mediaBadgeImageList;
    @c(a = "modify_time")
    long modifyTime;
    @c(a = "need_profile_guide")
    public Boolean needProfileGuide;
    transient boolean neverRecharge;
    @c(a = "new_real_time_icons")
    List<ImageModel> newUserBadges;
    @c(a = "nickname")
    String nickName;
    NobleLevelInfo nobleLevelInfo;
    @c(a = "own_room")
    b ownRoom;
    @c(a = "pay_score")
    public Long payScore;
    @c(a = "deprecated21")
    long payScores = -1;
    @c(a = "personal_card")
    ImageModel personalCard;
    @c(a = "push_comment_status")
    public Boolean pushCommentStatus;
    @c(a = "push_digg")
    public Boolean pushDigg;
    @c(a = "push_follow")
    public Boolean pushFollow;
    @c(a = "push_friend_action")
    public Boolean pushFriendAction;
    @c(a = "push_ichat")
    public Boolean pushIchat;
    @c(a = "push_status")
    public Boolean pushStatus;
    @c(a = "push_video_post")
    public Boolean pushVideoPost;
    @c(a = "push_video_recommend")
    public Boolean pushVideoRecommend;
    private String requestId;
    @c(a = "activity_reward")
    com.bytedance.android.livesdk.model.c rewardInfo;
    @c(a = "sec_uid")
    String secUid;
    @c(a = "secret")
    int secret;
    @c(a = "share_qrcode_uri")
    String shareQrcodeUri;
    @c(a = "bio_description")
    String signature;
    @c(a = "special_id")
    String specialId;
    @c(a = "status")
    int status;
    @c(a = "subscribe_info")
    SubscribeInfo subscribeInfo;
    @c(a = "top_fans")
    List<User> topFans;
    @c(a = "top_vip_no")
    int topVipNo;
    @c(a = "user_attr")
    ba userAttr;
    @c(a = "real_time_icons")
    List<ImageModel> userBadges;
    @c(a = "pay_grade")
    bc userHonor;
    @c(a = "user_role")
    int userRole;
    @c(a = "verified_content")
    String verifiedContent;
    @c(a = "verified_reason")
    String verifiedReason;
    @c(a = "with_fusion_shop_entry")
    public Boolean withFusionShopEntry;

    public static class a {
        @c(a = "icon")

        /* renamed from: a  reason: collision with root package name */
        public ImageModel f7448a;
        @c(a = "combo_count")

        /* renamed from: b  reason: collision with root package name */
        public long f7449b;

        static {
            Covode.recordClassIndex(3629);
        }
    }

    public static class b {
        @c(a = "room_ids")

        /* renamed from: a  reason: collision with root package name */
        public List<Long> f7450a;

        static {
            Covode.recordClassIndex(3630);
        }
    }

    static {
        Covode.recordClassIndex(3628);
    }

    public boolean childrenManagerForbidCreateLiveRoom() {
        return false;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public boolean childrenManagerForbidWalletFunctions() {
        return false;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public d getAnchorInfo() {
        return this.anchorInfo;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public e getAnchorLevel() {
        return this.anchorLevel;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public g getAuthenticationInfo() {
        return this.authenticationInfo;
    }

    public h getAuthorInfo() {
        return this.authorInfo;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public String getAutoGraph() {
        return this.signature;
    }

    public ImageModel getAvatarBorder() {
        return this.avatarBorder;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public String getBackgroundImgUrl() {
        return this.backgroundImgUrl;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public List<ImageModel> getBadgeImageList() {
        return this.badgeImageList;
    }

    public j getBorder() {
        return this.border;
    }

    public List<j> getBorders() {
        return this.borders;
    }

    public a getComboBadgeInfo() {
        return this.comboBadgeInfo;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public long getCreateTime() {
        return this.createTime;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public String getDisplayId() {
        return this.displayId;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public long getFanTicketCount() {
        return this.fanTicketCount;
    }

    public FansClubMember getFansClub() {
        return this.fansClub;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public FollowInfo getFollowInfo() {
        return this.followInfo;
    }

    public FraternityInfo getFraternityInfo() {
        return this.fraternityInfo;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public long getId() {
        return this.id;
    }

    public int getLinkMicStats() {
        return this.linkMicStats;
    }

    public String getLogPb() {
        return this.logPb;
    }

    public ImageModel getMedal() {
        return this.medal;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public long getModifyTime() {
        return this.modifyTime;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public String getNickName() {
        return this.nickName;
    }

    public NobleLevelInfo getNobleLevelInfo() {
        return this.nobleLevelInfo;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public b getOwnRoom() {
        return this.ownRoom;
    }

    public long getPayScores() {
        return this.payScores;
    }

    public ImageModel getPersonalCard() {
        return this.personalCard;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public com.bytedance.android.livesdk.model.c getRewardInfo() {
        return this.rewardInfo;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public String getSecUid() {
        return this.secUid;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public int getSecret() {
        return this.secret;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public String getShareQrcodeUri() {
        return this.shareQrcodeUri;
    }

    public String getSpecialId() {
        return this.specialId;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public int getStatus() {
        return this.status;
    }

    public SubscribeInfo getSubscribeInfo() {
        return this.subscribeInfo;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public List<User> getTopFans() {
        return this.topFans;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public int getTopVipNo() {
        return this.topVipNo;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public ba getUserAttr() {
        return this.userAttr;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public List<ImageModel> getUserBadges() {
        return this.userBadges;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public bc getUserHonor() {
        return this.userHonor;
    }

    public int getUserRole() {
        return this.userRole;
    }

    public String getVerifiedContent() {
        return this.verifiedContent;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public String getVerifiedReason() {
        return this.verifiedReason;
    }

    public boolean isEnableCarManagement() {
        return this.enableCarManagementPermission;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public boolean isEnableShowCommerceSale() {
        return this.enableShowCommerceSale;
    }

    public boolean isNeverRecharge() {
        return this.neverRecharge;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public boolean isVerified() {
        return this.isVerified;
    }

    public boolean isWithCommercePermission() {
        return isEnableShowCommerceSale();
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public List<ImageModel> getNewUserBadges() {
        List<ImageModel> list = this.newUserBadges;
        if (list == null || list.isEmpty()) {
            return this.userBadges;
        }
        return this.newUserBadges;
    }

    public boolean isAnchorHasSubQualification() {
        SubscribeInfo subscribeInfo2 = this.subscribeInfo;
        if (subscribeInfo2 != null) {
            return subscribeInfo2.isAnchorQualified();
        }
        return false;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public ImageModel getAvatarLarge() {
        try {
            if (this.avatarLarge == null && !TextUtils.isEmpty(this.mAvatarLargeStr)) {
                this.avatarLarge = (ImageModel) e.a.f9628b.a(this.mAvatarLargeStr, ImageModel.class);
            }
        } catch (Exception unused) {
        }
        return this.avatarLarge;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public ImageModel getAvatarMedium() {
        try {
            if (this.avatarMedium == null && !TextUtils.isEmpty(this.mAvatarMediumStr)) {
                this.avatarMedium = (ImageModel) e.a.f9628b.a(this.mAvatarMediumStr, ImageModel.class);
            }
        } catch (Exception unused) {
        }
        return this.avatarMedium;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public ImageModel getAvatarThumb() {
        try {
            if (this.avatarThumb == null && !TextUtils.isEmpty(this.mAvatarThumbStr)) {
                this.avatarThumb = (ImageModel) e.a.f9628b.a(this.mAvatarThumbStr, ImageModel.class);
            }
        } catch (Exception unused) {
        }
        return this.avatarThumb;
    }

    public String getIdStr() {
        if (TextUtils.isEmpty(this.idStr)) {
            return String.valueOf(this.id);
        }
        return this.idStr;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public boolean isFollowing() {
        FollowInfo followInfo2 = this.followInfo;
        if (followInfo2 == null) {
            return false;
        }
        if (followInfo2.getFollowStatus() == 2 || this.followInfo.getFollowStatus() == 1) {
            return true;
        }
        return false;
    }

    public boolean isSubscribed() {
        SubscribeInfo subscribeInfo2 = this.subscribeInfo;
        if (subscribeInfo2 == null || !subscribeInfo2.isAnchorQualified()) {
            return false;
        }
        return this.subscribeInfo.isSubscribed();
    }

    public long getLiveRoomId() {
        b bVar = this.ownRoom;
        if (bVar == null || bVar.f7450a == null || bVar.f7450a.size() == 0) {
            return 0;
        }
        return bVar.f7450a.get(0).longValue();
    }

    public int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        String str = this.nickName;
        int i22 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i23 = i2 * 31;
        String str2 = this.signature;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        long j2 = this.id;
        long j3 = this.createTime;
        int i24 = (((((i23 + i3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        ImageModel imageModel = this.avatarThumb;
        if (imageModel != null) {
            i4 = imageModel.hashCode();
        } else {
            i4 = 0;
        }
        int i25 = (i24 + i4) * 31;
        ImageModel imageModel2 = this.avatarMedium;
        if (imageModel2 != null) {
            i5 = imageModel2.hashCode();
        } else {
            i5 = 0;
        }
        int i26 = (i25 + i5) * 31;
        ImageModel imageModel3 = this.avatarLarge;
        if (imageModel3 != null) {
            i6 = imageModel3.hashCode();
        } else {
            i6 = 0;
        }
        int i27 = (i26 + i6) * 31;
        List<User> list = this.topFans;
        if (list != null) {
            i7 = list.hashCode();
        } else {
            i7 = 0;
        }
        int i28 = (i27 + i7) * 31;
        String str3 = this.idStr;
        if (str3 != null) {
            i8 = str3.hashCode();
        } else {
            i8 = 0;
        }
        long j4 = this.fanTicketCount;
        int i29 = (((((i28 + i8) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.isVerified ? 1 : 0)) * 31;
        String str4 = this.verifiedReason;
        if (str4 != null) {
            i9 = str4.hashCode();
        } else {
            i9 = 0;
        }
        int i30 = (((i29 + i9) * 31) + this.topVipNo) * 31;
        bc bcVar = this.userHonor;
        if (bcVar != null) {
            i10 = bcVar.hashCode();
        } else {
            i10 = 0;
        }
        int i31 = (i30 + i10) * 31;
        com.bytedance.android.livesdk.model.e eVar = this.anchorLevel;
        if (eVar != null) {
            i11 = eVar.hashCode();
        } else {
            i11 = 0;
        }
        int i32 = (i31 + i11) * 31;
        List<ImageModel> list2 = this.userBadges;
        if (list2 != null) {
            i12 = list2.hashCode();
        } else {
            i12 = 0;
        }
        int i33 = (i32 + i12) * 31;
        List<ImageModel> list3 = this.newUserBadges;
        if (list3 != null) {
            i13 = list3.hashCode();
        } else {
            i13 = 0;
        }
        int i34 = (i33 + i13) * 31;
        String str5 = this.mAvatarThumbStr;
        if (str5 != null) {
            i14 = str5.hashCode();
        } else {
            i14 = 0;
        }
        int i35 = (i34 + i14) * 31;
        String str6 = this.mAvatarMediumStr;
        if (str6 != null) {
            i15 = str6.hashCode();
        } else {
            i15 = 0;
        }
        int i36 = (i35 + i15) * 31;
        String str7 = this.mAvatarLargeStr;
        if (str7 != null) {
            i16 = str7.hashCode();
        } else {
            i16 = 0;
        }
        int i37 = (((i36 + i16) * 31) + (this.enableShowCommerceSale ? 1 : 0)) * 31;
        String str8 = this.backgroundImgUrl;
        if (str8 != null) {
            i17 = str8.hashCode();
        } else {
            i17 = 0;
        }
        long j5 = this.modifyTime;
        int i38 = (((((((i37 + i17) * 31) + this.status) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.secret) * 31;
        String str9 = this.shareQrcodeUri;
        if (str9 != null) {
            i18 = str9.hashCode();
        } else {
            i18 = 0;
        }
        int i39 = (i38 + i18) * 31;
        List<ImageModel> list4 = this.badgeImageList;
        if (list4 != null) {
            i19 = list4.hashCode();
        } else {
            i19 = 0;
        }
        int i40 = (i39 + i19) * 31;
        FollowInfo followInfo2 = this.followInfo;
        if (followInfo2 != null) {
            i20 = followInfo2.hashCode();
        } else {
            i20 = 0;
        }
        int i41 = (i40 + i20) * 31;
        ba baVar = this.userAttr;
        if (baVar != null) {
            i21 = baVar.hashCode();
        } else {
            i21 = 0;
        }
        int i42 = (i41 + i21) * 31;
        d dVar = this.anchorInfo;
        if (dVar != null) {
            i22 = dVar.hashCode();
        }
        return i42 + i22;
    }

    public void setAVatarMediumStr(String str) {
        this.mAvatarMediumStr = str;
    }

    public void setAnchorInfo(d dVar) {
        this.anchorInfo = dVar;
    }

    public void setAnchorLevel(com.bytedance.android.livesdk.model.e eVar) {
        this.anchorLevel = eVar;
    }

    public void setAuthenticationInfo(g gVar) {
        this.authenticationInfo = gVar;
    }

    public void setAuthorInfo(h hVar) {
        this.authorInfo = hVar;
    }

    public void setAvatarBorder(ImageModel imageModel) {
        this.avatarBorder = imageModel;
    }

    public void setAvatarLarge(ImageModel imageModel) {
        this.avatarLarge = imageModel;
    }

    public void setAvatarLargeStr(String str) {
        this.mAvatarLargeStr = str;
    }

    public void setAvatarMedium(ImageModel imageModel) {
        this.avatarMedium = imageModel;
    }

    public void setAvatarThumb(ImageModel imageModel) {
        this.avatarThumb = imageModel;
    }

    public void setAvatarThumbStr(String str) {
        this.mAvatarThumbStr = str;
    }

    public void setBackgroundImgUrl(String str) {
        this.backgroundImgUrl = str;
    }

    public void setBadgeImageList(List<ImageModel> list) {
        this.badgeImageList = list;
    }

    public void setBorder(j jVar) {
        this.border = jVar;
    }

    public void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public void setEnableShowCommerceSale(boolean z) {
        this.enableShowCommerceSale = z;
    }

    public void setFanTicketCount(long j2) {
        this.fanTicketCount = j2;
    }

    public void setFansClub(FansClubMember fansClubMember) {
        this.fansClub = fansClubMember;
    }

    public void setFollowInfo(FollowInfo followInfo2) {
        this.followInfo = followInfo2;
    }

    public void setFraternityInfo(FraternityInfo fraternityInfo2) {
        this.fraternityInfo = fraternityInfo2;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setLogPb(String str) {
        this.logPb = str;
    }

    public void setMedal(ImageModel imageModel) {
        this.medal = imageModel;
    }

    public void setModifyTime(long j2) {
        this.modifyTime = j2;
    }

    public void setNeverRecharge(boolean z) {
        this.neverRecharge = z;
    }

    public void setNewUserBadges(List<ImageModel> list) {
        this.newUserBadges = list;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setNobleLevelInfo(NobleLevelInfo nobleLevelInfo2) {
        this.nobleLevelInfo = nobleLevelInfo2;
    }

    public void setPersonalCard(ImageModel imageModel) {
        this.personalCard = imageModel;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSecret(int i2) {
        this.secret = i2;
    }

    public void setShareQrcodeUri(String str) {
        this.shareQrcodeUri = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSpecialId(String str) {
        this.specialId = str;
    }

    public void setStatus(int i2) {
        this.status = i2;
    }

    public void setSubscribeInfo(SubscribeInfo subscribeInfo2) {
        this.subscribeInfo = subscribeInfo2;
    }

    public void setTopFans(List<User> list) {
        this.topFans = list;
    }

    public void setTopVipNo(int i2) {
        this.topVipNo = i2;
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public void setUserAttr(ba baVar) {
        this.userAttr = baVar;
    }

    public void setUserBadges(List<ImageModel> list) {
        this.userBadges = list;
    }

    public void setUserHonor(bc bcVar) {
        this.userHonor = bcVar;
    }

    public void setUserRole(int i2) {
        this.userRole = i2;
    }

    public void setVerified(boolean z) {
        this.isVerified = z;
    }

    public void setVerifiedContent(String str) {
        this.verifiedContent = str;
    }

    public void setVerifiedReason(String str) {
        this.verifiedReason = str;
    }

    public void setWithCommercePermission(boolean z) {
        setEnableShowCommerceSale(z);
    }

    public void setSubscribeStatus(boolean z) {
        SubscribeInfo subscribeInfo2 = this.subscribeInfo;
        if (subscribeInfo2 != null) {
            subscribeInfo2.setSubscribed(z);
        }
    }

    @Override // com.bytedance.android.live.base.model.user.b
    public void setFollowStatus(int i2) {
        FollowInfo followInfo2 = this.followInfo;
        if (followInfo2 != null) {
            followInfo2.setFollowStatus((long) i2);
        }
    }

    public void setPayScores(long j2) {
        this.payScores = j2;
        if (j2 > 0) {
            this.neverRecharge = false;
        }
    }

    public static User from(b bVar) {
        if (bVar == null) {
            return null;
        }
        if (bVar instanceof User) {
            f fVar = e.a.f9628b;
            return (User) fVar.a(fVar.b(bVar), User.class);
        }
        User user = new User();
        user.initWith(bVar);
        return user;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            User user = (User) obj;
            if (this.id != user.id || this.createTime != user.createTime || this.fanTicketCount != user.fanTicketCount || this.isVerified != user.isVerified || this.topVipNo != user.topVipNo || getLiveRoomId() != user.getLiveRoomId() || this.enableShowCommerceSale != user.enableShowCommerceSale) {
                return false;
            }
            String str = this.nickName;
            if (str == null ? user.nickName != null : !str.equals(user.nickName)) {
                return false;
            }
            String str2 = this.signature;
            if (str2 == null ? user.signature != null : !str2.equals(user.signature)) {
                return false;
            }
            ImageModel imageModel = this.avatarThumb;
            if (imageModel == null ? user.avatarThumb != null : !imageModel.equals(user.avatarThumb)) {
                return false;
            }
            ImageModel imageModel2 = this.avatarMedium;
            if (imageModel2 == null ? user.avatarMedium != null : !imageModel2.equals(user.avatarMedium)) {
                return false;
            }
            ImageModel imageModel3 = this.avatarLarge;
            if (imageModel3 == null ? user.avatarLarge != null : !imageModel3.equals(user.avatarLarge)) {
                return false;
            }
            List<User> list = this.topFans;
            if (list == null ? user.topFans != null : !list.equals(user.topFans)) {
                return false;
            }
            String str3 = this.idStr;
            if (str3 == null ? user.idStr != null : !str3.equals(user.idStr)) {
                return false;
            }
            String str4 = this.verifiedReason;
            if (str4 == null ? user.verifiedReason != null : !str4.equals(user.verifiedReason)) {
                return false;
            }
            bc bcVar = this.userHonor;
            if (bcVar == null ? user.userHonor != null : !bcVar.equals(user.userHonor)) {
                return false;
            }
            com.bytedance.android.livesdk.model.e eVar = this.anchorLevel;
            if (eVar == null ? user.anchorLevel != null : !eVar.equals(user.anchorLevel)) {
                return false;
            }
            List<ImageModel> list2 = this.userBadges;
            if (list2 == null ? user.userBadges != null : !list2.equals(user.userBadges)) {
                return false;
            }
            List<ImageModel> list3 = this.newUserBadges;
            if (list3 == null ? user.newUserBadges != null : !list3.equals(user.newUserBadges)) {
                return false;
            }
            String str5 = this.mAvatarThumbStr;
            if (str5 == null ? user.mAvatarThumbStr != null : !str5.equals(user.mAvatarThumbStr)) {
                return false;
            }
            String str6 = this.mAvatarMediumStr;
            if (str6 == null ? user.mAvatarMediumStr != null : !str6.equals(user.mAvatarMediumStr)) {
                return false;
            }
            String str7 = this.mAvatarLargeStr;
            if (str7 == null ? user.mAvatarLargeStr != null : !str7.equals(user.mAvatarLargeStr)) {
                return false;
            }
            String str8 = this.backgroundImgUrl;
            if (str8 == null ? user.backgroundImgUrl != null : !str8.equals(user.backgroundImgUrl)) {
                return false;
            }
            if (this.status != user.status || this.modifyTime != user.modifyTime || this.secret != user.secret) {
                return false;
            }
            String str9 = this.shareQrcodeUri;
            if (str9 == null ? user.shareQrcodeUri != null : !str9.equals(user.shareQrcodeUri)) {
                return false;
            }
            List<ImageModel> list4 = this.badgeImageList;
            if (list4 == null ? user.badgeImageList != null : !list4.equals(user.badgeImageList)) {
                return false;
            }
            FollowInfo followInfo2 = this.followInfo;
            if (followInfo2 == null ? user.followInfo != null : !followInfo2.equals(user.followInfo)) {
                return false;
            }
            ba baVar = this.userAttr;
            if (baVar == null ? user.userAttr != null : !baVar.equals(user.userAttr)) {
                return false;
            }
            g gVar = this.authenticationInfo;
            if (gVar == null ? user.authenticationInfo != null : !gVar.equals(user.authenticationInfo)) {
                return false;
            }
            d dVar = this.anchorInfo;
            d dVar2 = user.anchorInfo;
            if (dVar != null) {
                return dVar.equals(dVar2);
            }
            if (dVar2 == null) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void initWith(b bVar) {
        ArrayList arrayList;
        bc bcVar;
        ArrayList arrayList2;
        com.bytedance.android.livesdk.model.e eVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.enableShowCommerceSale = bVar.isEnableShowCommerceSale();
        this.fanTicketCount = bVar.getFanTicketCount();
        this.avatarThumb = bVar.getAvatarThumb();
        this.avatarMedium = bVar.getAvatarMedium();
        this.avatarLarge = bVar.getAvatarLarge();
        this.nickName = bVar.getNickName();
        this.signature = bVar.getAutoGraph();
        this.id = bVar.getId();
        ArrayList arrayList5 = null;
        if (bVar.getTopFans() != null) {
            arrayList = new ArrayList(bVar.getTopFans());
        } else {
            arrayList = null;
        }
        this.topFans = arrayList;
        this.isVerified = bVar.isVerified();
        this.verifiedReason = bVar.getVerifiedReason();
        this.topVipNo = bVar.getTopVipNo();
        ae userHonor2 = bVar.getUserHonor();
        if (userHonor2 == null) {
            bcVar = null;
        } else if (userHonor2 instanceof bc) {
            f fVar = e.a.f9628b;
            bcVar = (bc) fVar.a(fVar.b(userHonor2), bc.class);
        } else {
            bcVar = new bc();
            bcVar.f19034a = userHonor2.a();
            bcVar.f19035b = userHonor2.b();
            bcVar.f19036c = userHonor2.c();
            bcVar.f19037d = userHonor2.d();
            bcVar.f19038e = userHonor2.e();
            bcVar.f19039f = userHonor2.f();
            bcVar.f19040g = userHonor2.g();
            bcVar.f19041h = userHonor2.j();
            bcVar.f19042i = userHonor2.k();
            bcVar.f19043j = userHonor2.o();
            bcVar.f19046m = userHonor2.l();
            bcVar.f19044k = userHonor2.m();
            bcVar.f19045l = userHonor2.n();
            if (userHonor2.p() != null) {
                arrayList2 = new ArrayList(userHonor2.p());
            } else {
                arrayList2 = null;
            }
            bcVar.n = arrayList2;
            bcVar.o = userHonor2.q();
            bcVar.p = userHonor2.h();
            bcVar.q = userHonor2.i();
            bcVar.r = userHonor2.r();
            bcVar.s = userHonor2.s();
        }
        this.userHonor = bcVar;
        z anchorLevel2 = bVar.getAnchorLevel();
        if (anchorLevel2 == null) {
            eVar = null;
        } else if (anchorLevel2 instanceof com.bytedance.android.livesdk.model.e) {
            eVar = (com.bytedance.android.livesdk.model.e) anchorLevel2;
        } else {
            com.bytedance.android.livesdk.model.e eVar2 = new com.bytedance.android.livesdk.model.e();
            eVar2.f19050a = anchorLevel2.a();
            eVar2.f19051b = anchorLevel2.b();
            eVar2.f19052c = anchorLevel2.c();
            eVar2.f19053d = anchorLevel2.d();
            eVar2.f19054e = anchorLevel2.e();
            eVar2.f19055f = anchorLevel2.f();
            eVar2.f19056g = anchorLevel2.g();
            eVar2.f19057h = anchorLevel2.h();
            eVar2.f19058i = anchorLevel2.i();
            eVar2.f19059j = anchorLevel2.j();
            eVar2.f19060k = anchorLevel2.k();
            eVar2.f19061l = anchorLevel2.l();
            eVar2.f19062m = anchorLevel2.m();
            eVar = eVar2;
        }
        this.anchorLevel = eVar;
        this.createTime = bVar.getCreateTime();
        this.ownRoom = bVar.getOwnRoom();
        if (bVar.getUserBadges() != null) {
            arrayList3 = new ArrayList(bVar.getUserBadges());
        } else {
            arrayList3 = null;
        }
        this.userBadges = arrayList3;
        if (bVar.getNewUserBadges() != null) {
            arrayList4 = new ArrayList(bVar.getNewUserBadges());
        } else {
            arrayList4 = null;
        }
        this.newUserBadges = arrayList4;
        this.backgroundImgUrl = bVar.getBackgroundImgUrl();
        this.status = bVar.getStatus();
        this.modifyTime = bVar.getModifyTime();
        this.secret = bVar.getSecret();
        this.shareQrcodeUri = bVar.getShareQrcodeUri();
        if (bVar.getBadgeImageList() != null) {
            arrayList5 = new ArrayList(bVar.getBadgeImageList());
        }
        this.badgeImageList = arrayList5;
        this.followInfo = bVar.getFollowInfo();
        this.userAttr = bVar.getUserAttr();
        this.anchorInfo = bVar.getAnchorInfo();
        this.authenticationInfo = bVar.getAuthenticationInfo();
    }
}
