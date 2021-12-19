package beancopy;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.RocketFansGroupInfo;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.commerce.f;
import com.ss.android.ugc.aweme.commerce.j;
import com.ss.android.ugc.aweme.commerce.model.a;
import com.ss.android.ugc.aweme.commercialize.model.u;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ChallengeAnnouncement;
import com.ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import com.ss.android.ugc.aweme.discover.model.ChallengeTransform;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.api.g;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Anchor;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.feed.model.AnchorShopLinkStruct;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.AwemeActivity;
import com.ss.android.ugc.aweme.feed.model.AwemeActivityButton;
import com.ss.android.ugc.aweme.feed.model.AwemeActivityContent;
import com.ss.android.ugc.aweme.feed.model.AwemeControl;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeTrendingBar;
import com.ss.android.ugc.aweme.feed.model.BannerTip;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.Boost;
import com.ss.android.ugc.aweme.feed.model.BottomBarModel;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.CommerceConfigData;
import com.ss.android.ugc.aweme.feed.model.DescendantsModel;
import com.ss.android.ugc.aweme.feed.model.Extra;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.FloatingCardInfo;
import com.ss.android.ugc.aweme.feed.model.GameInfo;
import com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord;
import com.ss.android.ugc.aweme.feed.model.HotSearchInfo;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.feed.model.ItemLikeEggData;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.LongVideo;
import com.ss.android.ugc.aweme.feed.model.MixStatisStruct;
import com.ss.android.ugc.aweme.feed.model.MixStatusStruct;
import com.ss.android.ugc.aweme.feed.model.MixStruct;
import com.ss.android.ugc.aweme.feed.model.PlayAddress;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.Preload;
import com.ss.android.ugc.aweme.feed.model.RelationLabelNew;
import com.ss.android.ugc.aweme.feed.model.RelationLabelUser;
import com.ss.android.ugc.aweme.feed.model.SpecialSticker;
import com.ss.android.ugc.aweme.feed.model.TtsInfos;
import com.ss.android.ugc.aweme.feed.model.UserProfileInitInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.ss.android.ugc.aweme.feed.model.live.FansStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.model.live.ShareStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.ss.android.ugc.aweme.feed.model.video.PlayTokenAuth;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.kids.recommendfeed.model.KFeedItemList;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.model.Dsp;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicAvatar;
import com.ss.android.ugc.aweme.music.model.MusicChorusInfo;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.model.MusicPerformer;
import com.ss.android.ugc.aweme.music.o;
import com.ss.android.ugc.aweme.profile.model.AdCoverTitle;
import com.ss.android.ugc.aweme.profile.model.AvatarDecoration;
import com.ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.ss.android.ugc.aweme.profile.model.CommercePermissionStruct;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.EffectArtistDetail;
import com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.HonorStruct;
import com.ss.android.ugc.aweme.profile.model.HotListStruct;
import com.ss.android.ugc.aweme.profile.model.HotSearchSprintStruct;
import com.ss.android.ugc.aweme.profile.model.LinkUserInfoStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.PlatformInfo;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.QuickShopInfo;
import com.ss.android.ugc.aweme.profile.model.QuickShopSecondFloorInfo;
import com.ss.android.ugc.aweme.profile.model.RecommendAwemeItem;
import com.ss.android.ugc.aweme.profile.model.RelativeUserInfo;
import com.ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.ss.android.ugc.aweme.profile.model.UnReadVideoInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.question.QuestionInfo;
import com.ss.android.ugc.aweme.search.c.d;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.DuetStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.sticker.data.b;
import com.ss.android.ugc.aweme.sticker.data.h;
import com.ss.android.ugc.aweme.sticker.model.c;
import com.ss.ugc.aweme.proto.ACLCommonStructV2;
import com.ss.ugc.aweme.proto.ActivityButtonStructV2;
import com.ss.ugc.aweme.proto.ActivityTimeRangeV2;
import com.ss.ugc.aweme.proto.AdCoverTitleV2;
import com.ss.ugc.aweme.proto.AnchorCommonStructV2;
import com.ss.ugc.aweme.proto.AnchorPanelActionStructV2;
import com.ss.ugc.aweme.proto.AnchorShopLinkStructV2;
import com.ss.ugc.aweme.proto.AnchorStructV2;
import com.ss.ugc.aweme.proto.AnchorWikipediaStructV2;
import com.ss.ugc.aweme.proto.AnnouncementStructV2;
import com.ss.ugc.aweme.proto.AudioStructV2;
import com.ss.ugc.aweme.proto.AutoCaptionTypeV2;
import com.ss.ugc.aweme.proto.AutoVideoCaptionStructV2;
import com.ss.ugc.aweme.proto.AvatarDecorationStructV2;
import com.ss.ugc.aweme.proto.AwemeACLStructV2;
import com.ss.ugc.aweme.proto.AwemeActivityStructV2;
import com.ss.ugc.aweme.proto.AwemeAnchorStructV2;
import com.ss.ugc.aweme.proto.AwemeCommerceStickerStructV2;
import com.ss.ugc.aweme.proto.AwemeCommerceStructV2;
import com.ss.ugc.aweme.proto.AwemeControlStructV2;
import com.ss.ugc.aweme.proto.AwemeFloatingCardStructV2;
import com.ss.ugc.aweme.proto.AwemeLabelStructV2;
import com.ss.ugc.aweme.proto.AwemeRiskStructV2;
import com.ss.ugc.aweme.proto.AwemeSearchStructV2;
import com.ss.ugc.aweme.proto.AwemeStatisticsStructV2;
import com.ss.ugc.aweme.proto.AwemeStatusStructV2;
import com.ss.ugc.aweme.proto.AwemeStructV2;
import com.ss.ugc.aweme.proto.BannerTipV2;
import com.ss.ugc.aweme.proto.BitRateStructV2;
import com.ss.ugc.aweme.proto.BlueVBrandInfoStructV2;
import com.ss.ugc.aweme.proto.BoostStructV2;
import com.ss.ugc.aweme.proto.BottomBarStructV2;
import com.ss.ugc.aweme.proto.CNYStructV2;
import com.ss.ugc.aweme.proto.CaptionAnchorStructV2;
import com.ss.ugc.aweme.proto.CaptionInfoStructV2;
import com.ss.ugc.aweme.proto.CaptionStructV2;
import com.ss.ugc.aweme.proto.ChallengeStructV2;
import com.ss.ugc.aweme.proto.ClaStructV2;
import com.ss.ugc.aweme.proto.CommerceActivityStructV2;
import com.ss.ugc.aweme.proto.CommerceConfigDataV2;
import com.ss.ugc.aweme.proto.CommerceInfoStructV2;
import com.ss.ugc.aweme.proto.CommercePermissionStructV2;
import com.ss.ugc.aweme.proto.CommerceStickerStructV2;
import com.ss.ugc.aweme.proto.CommerceStickerUnlockStructV2;
import com.ss.ugc.aweme.proto.CommerceUserStructV2;
import com.ss.ugc.aweme.proto.DescendantStructV2;
import com.ss.ugc.aweme.proto.DisclaimerStructV2;
import com.ss.ugc.aweme.proto.DuetWithMeStickerStructV2;
import com.ss.ugc.aweme.proto.EffectArtistStructV2;
import com.ss.ugc.aweme.proto.ExternalRecommendReasonStructV2;
import com.ss.ugc.aweme.proto.ExternalSongStructV2;
import com.ss.ugc.aweme.proto.ExtraStructV2;
import com.ss.ugc.aweme.proto.FansStructV2;
import com.ss.ugc.aweme.proto.FollowersDetailV2;
import com.ss.ugc.aweme.proto.GameStructV2;
import com.ss.ugc.aweme.proto.GreenScreenMaterialV2;
import com.ss.ugc.aweme.proto.GuideWordV2;
import com.ss.ugc.aweme.proto.HashTagStickerStructV2;
import com.ss.ugc.aweme.proto.HotListStructV2;
import com.ss.ugc.aweme.proto.HotsearchSprintStructV2;
import com.ss.ugc.aweme.proto.HybridLabelStructV2;
import com.ss.ugc.aweme.proto.IconButtonStructV2;
import com.ss.ugc.aweme.proto.ImageInfoStructV2;
import com.ss.ugc.aweme.proto.InteractPermissionV2;
import com.ss.ugc.aweme.proto.InteractionStickerStructV2;
import com.ss.ugc.aweme.proto.InteractionTagInfoV2;
import com.ss.ugc.aweme.proto.InteractionTagUserInfoV2;
import com.ss.ugc.aweme.proto.ItemLikeEggDataV2;
import com.ss.ugc.aweme.proto.LifeStoryBlockStructV2;
import com.ss.ugc.aweme.proto.LinkMatchStructV2;
import com.ss.ugc.aweme.proto.LinkUserInfoStructV2;
import com.ss.ugc.aweme.proto.LiveCountdownStickerStructV2;
import com.ss.ugc.aweme.proto.LiveHonorStructV2;
import com.ss.ugc.aweme.proto.LogPbStructV2;
import com.ss.ugc.aweme.proto.LongVideoStructV2;
import com.ss.ugc.aweme.proto.MaskStructV2;
import com.ss.ugc.aweme.proto.MatchInfoStructV2;
import com.ss.ugc.aweme.proto.MatchedFriendStructV2;
import com.ss.ugc.aweme.proto.MatchedPGCSoundStructV2;
import com.ss.ugc.aweme.proto.MatchedSongStructV2;
import com.ss.ugc.aweme.proto.MentionStickerStructV2;
import com.ss.ugc.aweme.proto.MicroAppCardStructV2;
import com.ss.ugc.aweme.proto.MicroAppStructV2;
import com.ss.ugc.aweme.proto.MixStatisStructV2;
import com.ss.ugc.aweme.proto.MixStatusStructV2;
import com.ss.ugc.aweme.proto.MixStructV2;
import com.ss.ugc.aweme.proto.MusicArtistStructV2;
import com.ss.ugc.aweme.proto.MusicAvatarStructV2;
import com.ss.ugc.aweme.proto.MusicChorusInfoStructV2;
import com.ss.ugc.aweme.proto.MusicDspStructV2;
import com.ss.ugc.aweme.proto.MusicPerformerStructV2;
import com.ss.ugc.aweme.proto.MusicStructV2;
import com.ss.ugc.aweme.proto.MutualStructV2;
import com.ss.ugc.aweme.proto.MutualUserStructV2;
import com.ss.ugc.aweme.proto.NewFaceStickerStructV2;
import com.ss.ugc.aweme.proto.OfflineInfoStructV2;
import com.ss.ugc.aweme.proto.OriginalLanguageStructV2;
import com.ss.ugc.aweme.proto.OriginalMusicianStructV2;
import com.ss.ugc.aweme.proto.PermissionStructV2;
import com.ss.ugc.aweme.proto.PlatformSyncStatusStructV2;
import com.ss.ugc.aweme.proto.PlayTokenAuthStructV2;
import com.ss.ugc.aweme.proto.PlaylistInfoV2;
import com.ss.ugc.aweme.proto.PositionStructV2;
import com.ss.ugc.aweme.proto.PreloadStructV2;
import com.ss.ugc.aweme.proto.ProfileBadgeStructV2;
import com.ss.ugc.aweme.proto.QuestionInfoV2;
import com.ss.ugc.aweme.proto.QuestionStickerStructV2;
import com.ss.ugc.aweme.proto.QuickShopSecondFloorV2;
import com.ss.ugc.aweme.proto.QuickShopStructV2;
import com.ss.ugc.aweme.proto.RFansGroupInfoV2;
import com.ss.ugc.aweme.proto.RecommendItemStructV2;
import com.ss.ugc.aweme.proto.RelationLabelStructV2;
import com.ss.ugc.aweme.proto.RelationRecommendStructV2;
import com.ss.ugc.aweme.proto.RelativeUserStructV2;
import com.ss.ugc.aweme.proto.ShareStructV2;
import com.ss.ugc.aweme.proto.ShowTimeGapRspInfo;
import com.ss.ugc.aweme.proto.SimpleUserStructV2;
import com.ss.ugc.aweme.proto.SpecialStickerStructV2;
import com.ss.ugc.aweme.proto.StoryMetadataV2;
import com.ss.ugc.aweme.proto.StreamUrlStructV2;
import com.ss.ugc.aweme.proto.TextContentStructV2;
import com.ss.ugc.aweme.proto.TextExtraStructV2;
import com.ss.ugc.aweme.proto.TrendingBarForYouPageStructV2;
import com.ss.ugc.aweme.proto.TrendingBarStructV2;
import com.ss.ugc.aweme.proto.TtsAudioStructV2;
import com.ss.ugc.aweme.proto.UpvoteReasonV2;
import com.ss.ugc.aweme.proto.UrlStructV2;
import com.ss.ugc.aweme.proto.UserProfileStructV2;
import com.ss.ugc.aweme.proto.UserStoryV2;
import com.ss.ugc.aweme.proto.UserStructV2;
import com.ss.ugc.aweme.proto.UtteranceV2;
import com.ss.ugc.aweme.proto.VideoControlV2;
import com.ss.ugc.aweme.proto.VideoMuteStructV2;
import com.ss.ugc.aweme.proto.VideoReplyStructV2;
import com.ss.ugc.aweme.proto.VideoStructV2;
import com.ss.ugc.aweme.proto.VideoTextStructV2;
import com.ss.ugc.aweme.proto.VideoUnreadStructV2;
import com.ss.ugc.aweme.proto.VoteOptionStructV2;
import com.ss.ugc.aweme.proto.VoteStructV2;
import com.ss.ugc.aweme.proto.WebcastRoomFeedCellStructV2;
import com.ss.ugc.aweme.proto.WebcastRoomStructV2;
import com.ss.ugc.aweme.proto.aweme_v2_feed_response;
import java.util.ArrayList;
import java.util.List;
import tiktok.kids.proto.tiktok_v1_kids_feed_response;

public class ConvertHelp {
    static {
        Covode.recordClassIndex(1915);
    }

    private ConvertHelp() {
    }

    public static List<ACLCommonShare> List$com$ss$ugc$aweme$proto$ACLCommonStructV2$$List$com$ss$android$ugc$aweme$feed$model$ACLCommonShare(List<ACLCommonStructV2> list, List<ACLCommonShare> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ACLCommonStructV2 aCLCommonStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$ACLCommonStructV2$$com$ss$android$ugc$aweme$feed$model$ACLCommonShare(aCLCommonStructV2, null));
        }
        return arrayList;
    }

    public static List<a> List$com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$List$com$ss$android$ugc$aweme$commerce$model$ActivityTimeRange(List<ActivityTimeRangeV2> list, List<a> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ActivityTimeRangeV2 activityTimeRangeV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$com$ss$android$ugc$aweme$commerce$model$ActivityTimeRange(activityTimeRangeV2, null));
        }
        return arrayList;
    }

    public static List<AnchorCommonStruct> List$com$ss$ugc$aweme$proto$AnchorCommonStructV2$$List$com$ss$android$ugc$aweme$feed$model$AnchorCommonStruct(List<AnchorCommonStructV2> list, List<AnchorCommonStruct> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStructV2 anchorCommonStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$AnchorCommonStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorCommonStruct(anchorCommonStructV2, null));
        }
        return arrayList;
    }

    public static List<AnchorPanelAction> List$com$ss$ugc$aweme$proto$AnchorPanelActionStructV2$$List$com$ss$android$ugc$aweme$feed$model$AnchorPanelAction(List<AnchorPanelActionStructV2> list, List<AnchorPanelAction> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (AnchorPanelActionStructV2 anchorPanelActionStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$AnchorPanelActionStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorPanelAction(anchorPanelActionStructV2, null));
        }
        return arrayList;
    }

    public static List<b> List$com$ss$ugc$aweme$proto$AutoCaptionTypeV2$$List$com$ss$android$ugc$aweme$sticker$data$AutocaptionType(List<AutoCaptionTypeV2> list, List<b> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (AutoCaptionTypeV2 autoCaptionTypeV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$AutoCaptionTypeV2$$com$ss$android$ugc$aweme$sticker$data$AutocaptionType(autoCaptionTypeV2, null));
        }
        return arrayList;
    }

    public static List<AwemeLabelModel> List$com$ss$ugc$aweme$proto$AwemeLabelStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel(List<AwemeLabelStructV2> list, List<AwemeLabelModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (AwemeLabelStructV2 awemeLabelStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$AwemeLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel(awemeLabelStructV2, null));
        }
        return arrayList;
    }

    public static List<Aweme> List$com$ss$ugc$aweme$proto$AwemeStructV2$$List$com$ss$android$ugc$aweme$feed$model$Aweme(List<AwemeStructV2> list, List<Aweme> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (AwemeStructV2 awemeStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(awemeStructV2, null));
        }
        return arrayList;
    }

    public static List<BitRate> List$com$ss$ugc$aweme$proto$BitRateStructV2$$List$com$ss$android$ugc$aweme$feed$model$BitRate(List<BitRateStructV2> list, List<BitRate> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (BitRateStructV2 bitRateStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$BitRateStructV2$$com$ss$android$ugc$aweme$feed$model$BitRate(bitRateStructV2, null));
        }
        return arrayList;
    }

    public static List<CaptionItemModel> List$com$ss$ugc$aweme$proto$CaptionStructV2$$List$com$ss$android$ugc$aweme$feed$model$CaptionItemModel(List<CaptionStructV2> list, List<CaptionItemModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (CaptionStructV2 captionStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$CaptionStructV2$$com$ss$android$ugc$aweme$feed$model$CaptionItemModel(captionStructV2, null));
        }
        return arrayList;
    }

    public static List<Challenge> List$com$ss$ugc$aweme$proto$ChallengeStructV2$$List$com$ss$android$ugc$aweme$discover$model$Challenge(List<ChallengeStructV2> list, List<Challenge> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ChallengeStructV2 challengeStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$ChallengeStructV2$$com$ss$android$ugc$aweme$discover$model$Challenge(challengeStructV2, null));
        }
        return arrayList;
    }

    public static List<CommerceConfigData> List$com$ss$ugc$aweme$proto$CommerceConfigDataV2$$List$com$ss$android$ugc$aweme$feed$model$CommerceConfigData(List<CommerceConfigDataV2> list, List<CommerceConfigData> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (CommerceConfigDataV2 commerceConfigDataV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$CommerceConfigDataV2$$com$ss$android$ugc$aweme$feed$model$CommerceConfigData(commerceConfigDataV2, null));
        }
        return arrayList;
    }

    public static List<ExternalMusicInfo> List$com$ss$ugc$aweme$proto$ExternalSongStructV2$$List$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo(List<ExternalSongStructV2> list, List<ExternalMusicInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ExternalSongStructV2 externalSongStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$ExternalSongStructV2$$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo(externalSongStructV2, null));
        }
        return arrayList;
    }

    public static List<FollowerDetail> List$com$ss$ugc$aweme$proto$FollowersDetailV2$$List$com$ss$android$ugc$aweme$profile$model$FollowerDetail(List<FollowersDetailV2> list, List<FollowerDetail> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (FollowersDetailV2 followersDetailV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$FollowersDetailV2$$com$ss$android$ugc$aweme$profile$model$FollowerDetail(followersDetailV2, null));
        }
        return arrayList;
    }

    public static List<GreenScreenMaterial> List$com$ss$ugc$aweme$proto$GreenScreenMaterialV2$$List$com$ss$android$ugc$aweme$feed$model$GreenScreenMaterial(List<GreenScreenMaterialV2> list, List<GreenScreenMaterial> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (GreenScreenMaterialV2 greenScreenMaterialV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$GreenScreenMaterialV2$$com$ss$android$ugc$aweme$feed$model$GreenScreenMaterial(greenScreenMaterialV2, null));
        }
        return arrayList;
    }

    public static List<AwemeHybridLabelModel> List$com$ss$ugc$aweme$proto$HybridLabelStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeHybridLabelModel(List<HybridLabelStructV2> list, List<AwemeHybridLabelModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (HybridLabelStructV2 hybridLabelStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$HybridLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeHybridLabelModel(hybridLabelStructV2, null));
        }
        return arrayList;
    }

    public static List<ImageInfo> List$com$ss$ugc$aweme$proto$ImageInfoStructV2$$List$com$ss$android$ugc$aweme$feed$model$ImageInfo(List<ImageInfoStructV2> list, List<ImageInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ImageInfoStructV2 imageInfoStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$ImageInfoStructV2$$com$ss$android$ugc$aweme$feed$model$ImageInfo(imageInfoStructV2, null));
        }
        return arrayList;
    }

    public static List<InteractStickerStruct> List$com$ss$ugc$aweme$proto$InteractionStickerStructV2$$List$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct(List<InteractionStickerStructV2> list, List<InteractStickerStruct> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (InteractionStickerStructV2 interactionStickerStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$InteractionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct(interactionStickerStructV2, null));
        }
        return arrayList;
    }

    public static List<InteractionTagUserInfo> List$com$ss$ugc$aweme$proto$InteractionTagUserInfoV2$$List$com$ss$android$ugc$aweme$feed$model$InteractionTagUserInfo(List<InteractionTagUserInfoV2> list, List<InteractionTagUserInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (InteractionTagUserInfoV2 interactionTagUserInfoV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$InteractionTagUserInfoV2$$com$ss$android$ugc$aweme$feed$model$InteractionTagUserInfo(interactionTagUserInfoV2, null));
        }
        return arrayList;
    }

    public static List<LongVideo> List$com$ss$ugc$aweme$proto$LongVideoStructV2$$List$com$ss$android$ugc$aweme$feed$model$LongVideo(List<LongVideoStructV2> list, List<LongVideo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (LongVideoStructV2 longVideoStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$LongVideoStructV2$$com$ss$android$ugc$aweme$feed$model$LongVideo(longVideoStructV2, null));
        }
        return arrayList;
    }

    public static List<VideoMaskInfo> List$com$ss$ugc$aweme$proto$MaskStructV2$$List$com$ss$android$ugc$aweme$feed$model$VideoMaskInfo(List<MaskStructV2> list, List<VideoMaskInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MaskStructV2 maskStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$MaskStructV2$$com$ss$android$ugc$aweme$feed$model$VideoMaskInfo(maskStructV2, null));
        }
        return arrayList;
    }

    public static List<d> List$com$ss$ugc$aweme$proto$MatchInfoStructV2$$List$com$ss$android$ugc$aweme$search$caption$MatchInfo(List<MatchInfoStructV2> list, List<d> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MatchInfoStructV2 matchInfoStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$MatchInfoStructV2$$com$ss$android$ugc$aweme$search$caption$MatchInfo(matchInfoStructV2, null));
        }
        return arrayList;
    }

    public static List<MusicOwnerInfo> List$com$ss$ugc$aweme$proto$MusicArtistStructV2$$List$com$ss$android$ugc$aweme$music$model$MusicOwnerInfo(List<MusicArtistStructV2> list, List<MusicOwnerInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MusicArtistStructV2 musicArtistStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$MusicArtistStructV2$$com$ss$android$ugc$aweme$music$model$MusicOwnerInfo(musicArtistStructV2, null));
        }
        return arrayList;
    }

    public static List<MusicPerformer> List$com$ss$ugc$aweme$proto$MusicPerformerStructV2$$List$com$ss$android$ugc$aweme$music$model$MusicPerformer(List<MusicPerformerStructV2> list, List<MusicPerformer> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MusicPerformerStructV2 musicPerformerStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$MusicPerformerStructV2$$com$ss$android$ugc$aweme$music$model$MusicPerformer(musicPerformerStructV2, null));
        }
        return arrayList;
    }

    public static List<Music> List$com$ss$ugc$aweme$proto$MusicStructV2$$List$com$ss$android$ugc$aweme$music$model$Music(List<MusicStructV2> list, List<Music> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MusicStructV2 musicStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music(musicStructV2, null));
        }
        return arrayList;
    }

    public static List<MutualUser> List$com$ss$ugc$aweme$proto$MutualUserStructV2$$List$com$ss$android$ugc$aweme$friends$model$MutualUser(List<MutualUserStructV2> list, List<MutualUser> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MutualUserStructV2 mutualUserStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$MutualUserStructV2$$com$ss$android$ugc$aweme$friends$model$MutualUser(mutualUserStructV2, null));
        }
        return arrayList;
    }

    public static List<j> List$com$ss$ugc$aweme$proto$OfflineInfoStructV2$$List$com$ss$android$ugc$aweme$commerce$OfflineInfo(List<OfflineInfoStructV2> list, List<j> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (OfflineInfoStructV2 offlineInfoStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$OfflineInfoStructV2$$com$ss$android$ugc$aweme$commerce$OfflineInfo(offlineInfoStructV2, null));
        }
        return arrayList;
    }

    public static PlatformInfo[] List$com$ss$ugc$aweme$proto$PlatformSyncStatusStructV2$$Arraycom$ss$android$ugc$aweme$profile$model$PlatformInfo(List<PlatformSyncStatusStructV2> list, PlatformInfo[] platformInfoArr) {
        if (list == null) {
            return platformInfoArr;
        }
        if (list.isEmpty()) {
            return new PlatformInfo[0];
        }
        PlatformInfo[] platformInfoArr2 = new PlatformInfo[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            platformInfoArr2[i2] = com$ss$ugc$aweme$proto$PlatformSyncStatusStructV2$$com$ss$android$ugc$aweme$profile$model$PlatformInfo(list.get(i2), null);
        }
        return platformInfoArr2;
    }

    public static List<Position> List$com$ss$ugc$aweme$proto$PositionStructV2$$List$com$ss$android$ugc$aweme$discover$model$Position(List<PositionStructV2> list, List<Position> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (PositionStructV2 positionStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$PositionStructV2$$com$ss$android$ugc$aweme$discover$model$Position(positionStructV2, null));
        }
        return arrayList;
    }

    public static List<QuestionInfo> List$com$ss$ugc$aweme$proto$QuestionInfoV2$$List$com$ss$android$ugc$aweme$question$QuestionInfo(List<QuestionInfoV2> list, List<QuestionInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (QuestionInfoV2 questionInfoV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$QuestionInfoV2$$com$ss$android$ugc$aweme$question$QuestionInfo(questionInfoV2, null));
        }
        return arrayList;
    }

    public static List<RecommendAwemeItem> List$com$ss$ugc$aweme$proto$RecommendItemStructV2$$List$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem(List<RecommendItemStructV2> list, List<RecommendAwemeItem> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (RecommendItemStructV2 recommendItemStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$RecommendItemStructV2$$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem(recommendItemStructV2, null));
        }
        return arrayList;
    }

    public static List<RelationLabelUser> List$com$ss$ugc$aweme$proto$RelativeUserStructV2$$List$com$ss$android$ugc$aweme$feed$model$RelationLabelUser(List<RelativeUserStructV2> list, List<RelationLabelUser> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (RelativeUserStructV2 relativeUserStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$feed$model$RelationLabelUser(relativeUserStructV2, null));
        }
        return arrayList;
    }

    public static List<RelativeUserInfo> List$com$ss$ugc$aweme$proto$RelativeUserStructV2$$List$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo(List<RelativeUserStructV2> list, List<RelativeUserInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (RelativeUserStructV2 relativeUserStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo(relativeUserStructV2, null));
        }
        return arrayList;
    }

    public static List<User> List$com$ss$ugc$aweme$proto$SimpleUserStructV2$$List$com$ss$android$ugc$aweme$profile$model$User(List<SimpleUserStructV2> list, List<User> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (SimpleUserStructV2 simpleUserStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$SimpleUserStructV2$$com$ss$android$ugc$aweme$profile$model$User(simpleUserStructV2, null));
        }
        return arrayList;
    }

    public static List<TextExtraStruct> List$com$ss$ugc$aweme$proto$TextExtraStructV2$$List$com$ss$android$ugc$aweme$model$TextExtraStruct(List<TextExtraStructV2> list, List<TextExtraStruct> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (TextExtraStructV2 textExtraStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$TextExtraStructV2$$com$ss$android$ugc$aweme$model$TextExtraStruct(textExtraStructV2, null));
        }
        return arrayList;
    }

    public static List<TtsInfos> List$com$ss$ugc$aweme$proto$TtsAudioStructV2$$List$com$ss$android$ugc$aweme$feed$model$TtsInfos(List<TtsAudioStructV2> list, List<TtsInfos> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (TtsAudioStructV2 ttsAudioStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$TtsAudioStructV2$$com$ss$android$ugc$aweme$feed$model$TtsInfos(ttsAudioStructV2, null));
        }
        return arrayList;
    }

    public static List<UrlModel> List$com$ss$ugc$aweme$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel(List<UrlStructV2> list, List<UrlModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (UrlStructV2 urlStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(urlStructV2, null));
        }
        return arrayList;
    }

    public static List<h> List$com$ss$ugc$aweme$proto$UtteranceV2$$List$com$ss$android$ugc$aweme$sticker$data$Utterance(List<UtteranceV2> list, List<h> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (UtteranceV2 utteranceV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$UtteranceV2$$com$ss$android$ugc$aweme$sticker$data$Utterance(utteranceV2, null));
        }
        return arrayList;
    }

    public static List<AwemeTextLabelModel> List$com$ss$ugc$aweme$proto$VideoTextStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel(List<VideoTextStructV2> list, List<AwemeTextLabelModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (VideoTextStructV2 videoTextStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$VideoTextStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel(videoTextStructV2, null));
        }
        return arrayList;
    }

    public static List<PollStruct.OptionsBean> List$com$ss$ugc$aweme$proto$VoteOptionStructV2$$List$com$ss$android$ugc$aweme$sticker$data$PollStruct$OptionsBean(List<VoteOptionStructV2> list, List<PollStruct.OptionsBean> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (VoteOptionStructV2 voteOptionStructV2 : list) {
            arrayList.add(com$ss$ugc$aweme$proto$VoteOptionStructV2$$com$ss$android$ugc$aweme$sticker$data$PollStruct$OptionsBean(voteOptionStructV2, null));
        }
        return arrayList;
    }

    public static long[] List$java$lang$Long$$ArrayJ(List<Long> list, long[] jArr) {
        if (list == null) {
            return jArr;
        }
        if (list.isEmpty()) {
            return new long[0];
        }
        long[] jArr2 = new long[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            jArr2[i2] = a.a(list.get(i2));
        }
        return jArr2;
    }

    public static List<Aweme> List$tiktok$kids$proto$AwemeStructV2$$List$com$ss$android$ugc$aweme$feed$model$Aweme(List<tiktok.kids.proto.AwemeStructV2> list, List<Aweme> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (tiktok.kids.proto.AwemeStructV2 awemeStructV2 : list) {
            arrayList.add(tiktok$kids$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(awemeStructV2, null));
        }
        return arrayList;
    }

    public static List<BitRate> List$tiktok$kids$proto$BitRateStructV2$$List$com$ss$android$ugc$aweme$feed$model$BitRate(List<tiktok.kids.proto.BitRateStructV2> list, List<BitRate> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (tiktok.kids.proto.BitRateStructV2 bitRateStructV2 : list) {
            arrayList.add(tiktok$kids$proto$BitRateStructV2$$com$ss$android$ugc$aweme$feed$model$BitRate(bitRateStructV2, null));
        }
        return arrayList;
    }

    public static List<ImageInfo> List$tiktok$kids$proto$ImageInfoStructV2$$List$com$ss$android$ugc$aweme$feed$model$ImageInfo(List<tiktok.kids.proto.ImageInfoStructV2> list, List<ImageInfo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (tiktok.kids.proto.ImageInfoStructV2 imageInfoStructV2 : list) {
            arrayList.add(tiktok$kids$proto$ImageInfoStructV2$$com$ss$android$ugc$aweme$feed$model$ImageInfo(imageInfoStructV2, null));
        }
        return arrayList;
    }

    public static List<LongVideo> List$tiktok$kids$proto$LongVideoStructV2$$List$com$ss$android$ugc$aweme$feed$model$LongVideo(List<tiktok.kids.proto.LongVideoStructV2> list, List<LongVideo> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (tiktok.kids.proto.LongVideoStructV2 longVideoStructV2 : list) {
            arrayList.add(tiktok$kids$proto$LongVideoStructV2$$com$ss$android$ugc$aweme$feed$model$LongVideo(longVideoStructV2, null));
        }
        return arrayList;
    }

    public static List<UrlModel> List$tiktok$kids$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel(List<tiktok.kids.proto.UrlStructV2> list, List<UrlModel> list2) {
        if (list == null) {
            return list2;
        }
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (tiktok.kids.proto.UrlStructV2 urlStructV2 : list) {
            arrayList.add(tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(urlStructV2, null));
        }
        return arrayList;
    }

    public static ACLCommonShare com$ss$ugc$aweme$proto$ACLCommonStructV2$$com$ss$android$ugc$aweme$feed$model$ACLCommonShare(ACLCommonStructV2 aCLCommonStructV2, ACLCommonShare aCLCommonShare) {
        if (aCLCommonStructV2 == null) {
            return aCLCommonShare;
        }
        ACLCommonShare aCLCommonShare2 = new ACLCommonShare();
        aCLCommonShare2.code = a.a(aCLCommonStructV2.code, aCLCommonShare2.code);
        aCLCommonShare2.showType = a.a(aCLCommonStructV2.show_type, aCLCommonShare2.showType);
        aCLCommonShare2.toastMsg = aCLCommonStructV2.toast_msg == null ? aCLCommonShare2.toastMsg : aCLCommonStructV2.toast_msg;
        aCLCommonShare2.extra = aCLCommonStructV2.extra == null ? aCLCommonShare2.extra : aCLCommonStructV2.extra;
        aCLCommonShare2.transcode = a.a(aCLCommonStructV2.transcode, aCLCommonShare2.transcode);
        aCLCommonShare2.mute = a.a(aCLCommonStructV2.mute, aCLCommonShare2.mute);
        aCLCommonShare2.popupMsg = aCLCommonStructV2.popup_msg == null ? aCLCommonShare2.popupMsg : aCLCommonStructV2.popup_msg;
        aCLCommonShare2.platformId = aCLCommonStructV2.platform_id == null ? aCLCommonShare2.platformId : aCLCommonStructV2.platform_id;
        return aCLCommonShare2;
    }

    public static AwemeActivityButton com$ss$ugc$aweme$proto$ActivityButtonStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeActivityButton(ActivityButtonStructV2 activityButtonStructV2, AwemeActivityButton awemeActivityButton) {
        if (activityButtonStructV2 == null) {
            return awemeActivityButton;
        }
        AwemeActivityButton awemeActivityButton2 = new AwemeActivityButton();
        awemeActivityButton2.label = activityButtonStructV2.label == null ? awemeActivityButton2.label : activityButtonStructV2.label;
        awemeActivityButton2.color = activityButtonStructV2.color == null ? awemeActivityButton2.color : activityButtonStructV2.color;
        return awemeActivityButton2;
    }

    public static a com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$com$ss$android$ugc$aweme$commerce$model$ActivityTimeRange(ActivityTimeRangeV2 activityTimeRangeV2, a aVar) {
        if (activityTimeRangeV2 == null) {
            return aVar;
        }
        a aVar2 = new a();
        aVar2.start = a.a(activityTimeRangeV2.start, aVar2.start);
        aVar2.end = a.a(activityTimeRangeV2.end, aVar2.end);
        return aVar2;
    }

    public static AdCoverTitle com$ss$ugc$aweme$proto$AdCoverTitleV2$$com$ss$android$ugc$aweme$profile$model$AdCoverTitle(AdCoverTitleV2 adCoverTitleV2, AdCoverTitle adCoverTitle) {
        if (adCoverTitleV2 == null) {
            return adCoverTitle;
        }
        AdCoverTitle adCoverTitle2 = new AdCoverTitle();
        adCoverTitle2.title = adCoverTitleV2.title == null ? adCoverTitle2.title : adCoverTitleV2.title;
        adCoverTitle2.webUrl = adCoverTitleV2.web_url == null ? adCoverTitle2.webUrl : adCoverTitleV2.web_url;
        return adCoverTitle2;
    }

    public static AnchorCommonStruct com$ss$ugc$aweme$proto$AnchorCommonStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorCommonStruct(AnchorCommonStructV2 anchorCommonStructV2, AnchorCommonStruct anchorCommonStruct) {
        if (anchorCommonStructV2 == null) {
            return anchorCommonStruct;
        }
        AnchorCommonStruct anchorCommonStruct2 = new AnchorCommonStruct();
        anchorCommonStruct2.keyword = anchorCommonStructV2.keyword == null ? anchorCommonStruct2.keyword : anchorCommonStructV2.keyword;
        anchorCommonStruct2.url = anchorCommonStructV2.url == null ? anchorCommonStruct2.url : anchorCommonStructV2.url;
        anchorCommonStruct2.language = anchorCommonStructV2.language == null ? anchorCommonStruct2.language : anchorCommonStructV2.language;
        anchorCommonStruct2.schema = anchorCommonStructV2.schema == null ? anchorCommonStruct2.schema : anchorCommonStructV2.schema;
        anchorCommonStruct2.id = anchorCommonStructV2.id == null ? anchorCommonStruct2.id : anchorCommonStructV2.id;
        anchorCommonStruct2.type = a.a(anchorCommonStructV2.type, anchorCommonStruct2.type);
        anchorCommonStruct2.icon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(anchorCommonStructV2.icon, anchorCommonStruct2.icon);
        anchorCommonStruct2.extra = anchorCommonStructV2.extra == null ? anchorCommonStruct2.extra : anchorCommonStructV2.extra;
        anchorCommonStruct2.deepLink = anchorCommonStructV2.deep_link == null ? anchorCommonStruct2.deepLink : anchorCommonStructV2.deep_link;
        anchorCommonStruct2.universalLink = anchorCommonStructV2.universal_link == null ? anchorCommonStruct2.universalLink : anchorCommonStructV2.universal_link;
        anchorCommonStruct2.generalType = a.a(anchorCommonStructV2.general_type, anchorCommonStruct2.generalType);
        anchorCommonStruct2.logExtra = anchorCommonStructV2.log_extra == null ? anchorCommonStruct2.logExtra : anchorCommonStructV2.log_extra;
        anchorCommonStruct2.description = anchorCommonStructV2.description == null ? anchorCommonStruct2.description : anchorCommonStructV2.description;
        anchorCommonStruct2.thumbnail = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(anchorCommonStructV2.thumbnail, anchorCommonStruct2.thumbnail);
        anchorCommonStruct2.actions = List$com$ss$ugc$aweme$proto$AnchorPanelActionStructV2$$List$com$ss$android$ugc$aweme$feed$model$AnchorPanelAction(anchorCommonStructV2.actions, anchorCommonStruct2.actions);
        return anchorCommonStruct2;
    }

    public static AnchorPanelAction com$ss$ugc$aweme$proto$AnchorPanelActionStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorPanelAction(AnchorPanelActionStructV2 anchorPanelActionStructV2, AnchorPanelAction anchorPanelAction) {
        if (anchorPanelActionStructV2 == null) {
            return anchorPanelAction;
        }
        AnchorPanelAction anchorPanelAction2 = new AnchorPanelAction();
        anchorPanelAction2.icon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(anchorPanelActionStructV2.icon, anchorPanelAction2.icon);
        anchorPanelAction2.schema = anchorPanelActionStructV2.schema == null ? anchorPanelAction2.schema : anchorPanelActionStructV2.schema;
        anchorPanelAction2.actionType = a.a(anchorPanelActionStructV2.action_type, anchorPanelAction2.actionType);
        return anchorPanelAction2;
    }

    public static AnchorShopLinkStruct com$ss$ugc$aweme$proto$AnchorShopLinkStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorShopLinkStruct(AnchorShopLinkStructV2 anchorShopLinkStructV2, AnchorShopLinkStruct anchorShopLinkStruct) {
        if (anchorShopLinkStructV2 == null) {
            return anchorShopLinkStruct;
        }
        AnchorShopLinkStruct anchorShopLinkStruct2 = new AnchorShopLinkStruct();
        anchorShopLinkStruct2.keyword = anchorShopLinkStructV2.keyword == null ? anchorShopLinkStruct2.keyword : anchorShopLinkStructV2.keyword;
        anchorShopLinkStruct2.url = anchorShopLinkStructV2.url == null ? anchorShopLinkStruct2.url : anchorShopLinkStructV2.url;
        return anchorShopLinkStruct2;
    }

    public static Anchor com$ss$ugc$aweme$proto$AnchorStructV2$$com$ss$android$ugc$aweme$feed$model$Anchor(AnchorStructV2 anchorStructV2, Anchor anchor) {
        if (anchorStructV2 == null) {
            return anchor;
        }
        Anchor anchor2 = new Anchor();
        anchor2.showType = anchorStructV2.show_type == null ? anchor2.showType : anchorStructV2.show_type;
        anchor2.businessType = anchorStructV2.business_type == null ? anchor2.businessType : anchorStructV2.business_type;
        anchor2.wikipediaInfo = com$ss$ugc$aweme$proto$AnchorWikipediaStructV2$$com$ss$android$ugc$aweme$feed$model$WikipediaInfo(anchorStructV2.wikipedia_info, anchor2.wikipediaInfo);
        anchor2.shopLinkStruct = com$ss$ugc$aweme$proto$AnchorShopLinkStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorShopLinkStruct(anchorStructV2.shop_link, anchor2.shopLinkStruct);
        anchor2.anchorInfo = com$ss$ugc$aweme$proto$AnchorCommonStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorCommonStruct(anchorStructV2.anchor_info, anchor2.anchorInfo);
        anchor2.anchorId = anchorStructV2.anchor_id == null ? anchor2.anchorId : anchorStructV2.anchor_id;
        return anchor2;
    }

    public static WikipediaInfo com$ss$ugc$aweme$proto$AnchorWikipediaStructV2$$com$ss$android$ugc$aweme$feed$model$WikipediaInfo(AnchorWikipediaStructV2 anchorWikipediaStructV2, WikipediaInfo wikipediaInfo) {
        if (anchorWikipediaStructV2 == null) {
            return wikipediaInfo;
        }
        WikipediaInfo wikipediaInfo2 = new WikipediaInfo();
        wikipediaInfo2.keyword = anchorWikipediaStructV2.keyword == null ? wikipediaInfo2.keyword : anchorWikipediaStructV2.keyword;
        wikipediaInfo2.lang = anchorWikipediaStructV2.lang == null ? wikipediaInfo2.lang : anchorWikipediaStructV2.lang;
        return wikipediaInfo2;
    }

    public static ChallengeAnnouncement com$ss$ugc$aweme$proto$AnnouncementStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeAnnouncement(AnnouncementStructV2 announcementStructV2, ChallengeAnnouncement challengeAnnouncement) {
        if (announcementStructV2 == null) {
            return challengeAnnouncement;
        }
        ChallengeAnnouncement challengeAnnouncement2 = new ChallengeAnnouncement();
        challengeAnnouncement2.title = announcementStructV2.title == null ? challengeAnnouncement2.title : announcementStructV2.title;
        challengeAnnouncement2.content = announcementStructV2.body == null ? challengeAnnouncement2.content : announcementStructV2.body;
        return challengeAnnouncement2;
    }

    public static Audio com$ss$ugc$aweme$proto$AudioStructV2$$com$ss$android$ugc$aweme$feed$model$Audio(AudioStructV2 audioStructV2, Audio audio) {
        if (audioStructV2 == null) {
            return audio;
        }
        Audio audio2 = new Audio();
        audio2.CdnUrlExpired = a.a(audioStructV2.CdnUrlExpired, audio2.CdnUrlExpired);
        audio2.TtsInfos = List$com$ss$ugc$aweme$proto$TtsAudioStructV2$$List$com$ss$android$ugc$aweme$feed$model$TtsInfos(audioStructV2.TtsInfos, audio2.TtsInfos);
        return audio2;
    }

    public static b com$ss$ugc$aweme$proto$AutoCaptionTypeV2$$com$ss$android$ugc$aweme$sticker$data$AutocaptionType(AutoCaptionTypeV2 autoCaptionTypeV2, b bVar) {
        if (autoCaptionTypeV2 == null) {
            return bVar;
        }
        b bVar2 = new b();
        bVar2.language = autoCaptionTypeV2.language == null ? bVar2.language : autoCaptionTypeV2.language;
        bVar2.url = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(autoCaptionTypeV2.url, bVar2.url);
        return bVar2;
    }

    public static com.ss.android.ugc.aweme.sticker.data.d com$ss$ugc$aweme$proto$AutoVideoCaptionStructV2$$com$ss$android$ugc$aweme$sticker$data$CaptionStruct(AutoVideoCaptionStructV2 autoVideoCaptionStructV2, com.ss.android.ugc.aweme.sticker.data.d dVar) {
        if (autoVideoCaptionStructV2 == null) {
            return dVar;
        }
        com.ss.android.ugc.aweme.sticker.data.d dVar2 = new com.ss.android.ugc.aweme.sticker.data.d();
        dVar2.location = a.a(autoVideoCaptionStructV2.location, dVar2.location);
        dVar2.audioUri = autoVideoCaptionStructV2.audio_uri == null ? dVar2.audioUri : autoVideoCaptionStructV2.audio_uri;
        dVar2.utterances = List$com$ss$ugc$aweme$proto$UtteranceV2$$List$com$ss$android$ugc$aweme$sticker$data$Utterance(autoVideoCaptionStructV2.utterances, dVar2.utterances);
        dVar2.autoCaptions = List$com$ss$ugc$aweme$proto$AutoCaptionTypeV2$$List$com$ss$android$ugc$aweme$sticker$data$AutocaptionType(autoVideoCaptionStructV2.auto_captions, dVar2.autoCaptions);
        dVar2.disable = a.a(autoVideoCaptionStructV2.disable, dVar2.disable);
        return dVar2;
    }

    public static AvatarDecoration com$ss$ugc$aweme$proto$AvatarDecorationStructV2$$com$ss$android$ugc$aweme$profile$model$AvatarDecoration(AvatarDecorationStructV2 avatarDecorationStructV2, AvatarDecoration avatarDecoration) {
        if (avatarDecorationStructV2 == null) {
            return avatarDecoration;
        }
        AvatarDecoration avatarDecoration2 = new AvatarDecoration();
        avatarDecoration2.id = a.a(avatarDecorationStructV2.id, avatarDecoration2.id);
        avatarDecoration2.name = avatarDecorationStructV2.name == null ? avatarDecoration2.name : avatarDecorationStructV2.name;
        avatarDecoration2.sourceUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(avatarDecorationStructV2.source_url, avatarDecoration2.sourceUrl);
        return avatarDecoration2;
    }

    public static AwemeACLShare com$ss$ugc$aweme$proto$AwemeACLStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeACLShare(AwemeACLStructV2 awemeACLStructV2, AwemeACLShare awemeACLShare) {
        if (awemeACLStructV2 == null) {
            return awemeACLShare;
        }
        AwemeACLShare awemeACLShare2 = new AwemeACLShare();
        awemeACLShare2.downloadGeneral = com$ss$ugc$aweme$proto$ACLCommonStructV2$$com$ss$android$ugc$aweme$feed$model$ACLCommonShare(awemeACLStructV2.download_general, awemeACLShare2.downloadGeneral);
        awemeACLShare2.downloadMaskPanel = com$ss$ugc$aweme$proto$ACLCommonStructV2$$com$ss$android$ugc$aweme$feed$model$ACLCommonShare(awemeACLStructV2.download_mask_panel, awemeACLShare2.downloadMaskPanel);
        awemeACLShare2.downloadSharePanel = com$ss$ugc$aweme$proto$ACLCommonStructV2$$com$ss$android$ugc$aweme$feed$model$ACLCommonShare(awemeACLStructV2.download_share_panel, awemeACLShare2.downloadSharePanel);
        awemeACLShare2.shareListStatus = a.a(awemeACLStructV2.share_list_status, awemeACLShare2.shareListStatus);
        awemeACLShare2.shareGeneral = com$ss$ugc$aweme$proto$ACLCommonStructV2$$com$ss$android$ugc$aweme$feed$model$ACLCommonShare(awemeACLStructV2.share_general, awemeACLShare2.shareGeneral);
        awemeACLShare2.platformList = List$com$ss$ugc$aweme$proto$ACLCommonStructV2$$List$com$ss$android$ugc$aweme$feed$model$ACLCommonShare(awemeACLStructV2.platform_list, awemeACLShare2.platformList);
        awemeACLShare2.shareThirdPlatform = com$ss$ugc$aweme$proto$ACLCommonStructV2$$com$ss$android$ugc$aweme$feed$model$ACLCommonShare(awemeACLStructV2.share_third_platform, awemeACLShare2.shareThirdPlatform);
        return awemeACLShare2;
    }

    public static AwemeActivity com$ss$ugc$aweme$proto$AwemeActivityStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeActivity(AwemeActivityStructV2 awemeActivityStructV2, AwemeActivity awemeActivity) {
        if (awemeActivityStructV2 == null) {
            return awemeActivity;
        }
        AwemeActivity awemeActivity2 = new AwemeActivity();
        awemeActivity2.activityId = awemeActivityStructV2.activity_id == null ? awemeActivity2.activityId : awemeActivityStructV2.activity_id;
        awemeActivity2.showDelayTime = awemeActivityStructV2.show_delay_time == null ? awemeActivity2.showDelayTime : awemeActivityStructV2.show_delay_time;
        awemeActivity2.schemaUrl = awemeActivityStructV2.schema_url == null ? awemeActivity2.schemaUrl : awemeActivityStructV2.schema_url;
        awemeActivity2.content = com$ss$ugc$aweme$proto$TextContentStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeActivityContent(awemeActivityStructV2.content, awemeActivity2.content);
        awemeActivity2.primaryBtn = com$ss$ugc$aweme$proto$ActivityButtonStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeActivityButton(awemeActivityStructV2.primary_btn, awemeActivity2.primaryBtn);
        return awemeActivity2;
    }

    public static AnchorInfo com$ss$ugc$aweme$proto$AwemeAnchorStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorInfo(AwemeAnchorStructV2 awemeAnchorStructV2, AnchorInfo anchorInfo) {
        if (awemeAnchorStructV2 == null) {
            return anchorInfo;
        }
        AnchorInfo anchorInfo2 = new AnchorInfo();
        anchorInfo2.type = awemeAnchorStructV2.type == null ? anchorInfo2.type : awemeAnchorStructV2.type;
        anchorInfo2.id = awemeAnchorStructV2.id == null ? anchorInfo2.id : awemeAnchorStructV2.id;
        anchorInfo2.icon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeAnchorStructV2.icon, anchorInfo2.icon);
        anchorInfo2.title = awemeAnchorStructV2.title == null ? anchorInfo2.title : awemeAnchorStructV2.title;
        anchorInfo2.openUrl = awemeAnchorStructV2.open_url == null ? anchorInfo2.openUrl : awemeAnchorStructV2.open_url;
        anchorInfo2.webUrl = awemeAnchorStructV2.web_url == null ? anchorInfo2.webUrl : awemeAnchorStructV2.web_url;
        anchorInfo2.mpUrl = awemeAnchorStructV2.mp_url == null ? anchorInfo2.mpUrl : awemeAnchorStructV2.mp_url;
        anchorInfo2.extra = awemeAnchorStructV2.extra == null ? anchorInfo2.extra : awemeAnchorStructV2.extra;
        anchorInfo2.logExtra = awemeAnchorStructV2.log_extra == null ? anchorInfo2.logExtra : awemeAnchorStructV2.log_extra;
        return anchorInfo2;
    }

    public static u com$ss$ugc$aweme$proto$AwemeCommerceStickerStructV2$$com$ss$android$ugc$aweme$commercialize$model$CommerceStickerInfo(AwemeCommerceStickerStructV2 awemeCommerceStickerStructV2, u uVar) {
        if (awemeCommerceStickerStructV2 == null) {
            return uVar;
        }
        u uVar2 = new u();
        uVar2.commerceStickerId = a.a(awemeCommerceStickerStructV2.commerce_sticker_id, uVar2.commerceStickerId);
        uVar2.iconUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeCommerceStickerStructV2.icon_url, uVar2.iconUrl);
        uVar2.letters = awemeCommerceStickerStructV2.letters == null ? uVar2.letters : awemeCommerceStickerStructV2.letters;
        uVar2.openUrl = awemeCommerceStickerStructV2.open_url == null ? uVar2.openUrl : awemeCommerceStickerStructV2.open_url;
        uVar2.webUrl = awemeCommerceStickerStructV2.web_url == null ? uVar2.webUrl : awemeCommerceStickerStructV2.web_url;
        uVar2.webUrlTitle = awemeCommerceStickerStructV2.web_url_title == null ? uVar2.webUrlTitle : awemeCommerceStickerStructV2.web_url_title;
        return uVar2;
    }

    public static com.ss.android.ugc.aweme.commerce.a com$ss$ugc$aweme$proto$AwemeCommerceStructV2$$com$ss$android$ugc$aweme$commerce$AwemeCommerceStruct(AwemeCommerceStructV2 awemeCommerceStructV2, com.ss.android.ugc.aweme.commerce.a aVar) {
        if (awemeCommerceStructV2 == null) {
            return aVar;
        }
        com.ss.android.ugc.aweme.commerce.a aVar2 = new com.ss.android.ugc.aweme.commerce.a();
        aVar2.ad_auth_status = a.a(awemeCommerceStructV2.ad_auth_status, aVar2.ad_auth_status);
        aVar2.ad_source = a.a(awemeCommerceStructV2.ad_source, aVar2.ad_source);
        aVar2.avoid_global_pendant = a.a(awemeCommerceStructV2.avoid_global_pendant, aVar2.avoid_global_pendant);
        aVar2.withCommentFilterWords = a.a(awemeCommerceStructV2.with_comment_filter_words, aVar2.withCommentFilterWords);
        aVar2.preventShare = a.a(awemeCommerceStructV2.prevent_share, aVar2.preventShare);
        aVar2.studyId = awemeCommerceStructV2.study_id == null ? aVar2.studyId : awemeCommerceStructV2.study_id;
        return aVar2;
    }

    public static AwemeControl com$ss$ugc$aweme$proto$AwemeControlStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeControl(AwemeControlStructV2 awemeControlStructV2, AwemeControl awemeControl) {
        if (awemeControlStructV2 == null) {
            return awemeControl;
        }
        AwemeControl awemeControl2 = new AwemeControl();
        awemeControl2.canForward = a.a(awemeControlStructV2.can_forward, awemeControl2.canForward);
        awemeControl2.canShare = a.a(awemeControlStructV2.can_share, awemeControl2.canShare);
        awemeControl2.canComment = a.a(awemeControlStructV2.can_comment, awemeControl2.canComment);
        awemeControl2.canShowComment = a.a(awemeControlStructV2.can_show_comment, awemeControl2.canShowComment);
        return awemeControl2;
    }

    public static FloatingCardInfo com$ss$ugc$aweme$proto$AwemeFloatingCardStructV2$$com$ss$android$ugc$aweme$feed$model$FloatingCardInfo(AwemeFloatingCardStructV2 awemeFloatingCardStructV2, FloatingCardInfo floatingCardInfo) {
        if (awemeFloatingCardStructV2 == null) {
            return floatingCardInfo;
        }
        FloatingCardInfo floatingCardInfo2 = new FloatingCardInfo();
        floatingCardInfo2.schema = awemeFloatingCardStructV2.schema == null ? floatingCardInfo2.schema : awemeFloatingCardStructV2.schema;
        floatingCardInfo2.schemaDesc = awemeFloatingCardStructV2.schema_desc == null ? floatingCardInfo2.schemaDesc : awemeFloatingCardStructV2.schema_desc;
        floatingCardInfo2.icons = List$com$ss$ugc$aweme$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel(awemeFloatingCardStructV2.icons, floatingCardInfo2.icons);
        floatingCardInfo2.title = awemeFloatingCardStructV2.title == null ? floatingCardInfo2.title : awemeFloatingCardStructV2.title;
        floatingCardInfo2.description = awemeFloatingCardStructV2.description == null ? floatingCardInfo2.description : awemeFloatingCardStructV2.description;
        floatingCardInfo2.buttonDesc = awemeFloatingCardStructV2.button_desc == null ? floatingCardInfo2.buttonDesc : awemeFloatingCardStructV2.button_desc;
        floatingCardInfo2.buttonBackground = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeFloatingCardStructV2.button_bg, floatingCardInfo2.buttonBackground);
        return floatingCardInfo2;
    }

    public static AwemeLabelModel com$ss$ugc$aweme$proto$AwemeLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel(AwemeLabelStructV2 awemeLabelStructV2, AwemeLabelModel awemeLabelModel) {
        if (awemeLabelStructV2 == null) {
            return awemeLabelModel;
        }
        AwemeLabelModel awemeLabelModel2 = new AwemeLabelModel();
        awemeLabelModel2.urlModels = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeLabelStructV2.label_url, awemeLabelModel2.urlModels);
        awemeLabelModel2.labelType = a.a(awemeLabelStructV2.label_type, awemeLabelModel2.labelType);
        return awemeLabelModel2;
    }

    public static AwemeRiskModel com$ss$ugc$aweme$proto$AwemeRiskStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeRiskModel(AwemeRiskStructV2 awemeRiskStructV2, AwemeRiskModel awemeRiskModel) {
        if (awemeRiskStructV2 == null) {
            return awemeRiskModel;
        }
        AwemeRiskModel awemeRiskModel2 = new AwemeRiskModel();
        awemeRiskModel2.warn = a.a(awemeRiskStructV2.warn, awemeRiskModel2.warn);
        awemeRiskModel2.riskSink = a.a(awemeRiskStructV2.risk_sink, awemeRiskModel2.riskSink);
        awemeRiskModel2.type = a.a(awemeRiskStructV2.type, awemeRiskModel2.type);
        awemeRiskModel2.content = awemeRiskStructV2.content == null ? awemeRiskModel2.content : awemeRiskStructV2.content;
        awemeRiskModel2.notice = a.a(awemeRiskStructV2.notice, awemeRiskModel2.notice);
        awemeRiskModel2.url = awemeRiskStructV2.url == null ? awemeRiskModel2.url : awemeRiskStructV2.url;
        return awemeRiskModel2;
    }

    public static HotSearchInfo com$ss$ugc$aweme$proto$AwemeSearchStructV2$$com$ss$android$ugc$aweme$feed$model$HotSearchInfo(AwemeSearchStructV2 awemeSearchStructV2, HotSearchInfo hotSearchInfo) {
        if (awemeSearchStructV2 == null) {
            return hotSearchInfo;
        }
        HotSearchInfo hotSearchInfo2 = new HotSearchInfo();
        hotSearchInfo2.sentence = awemeSearchStructV2.sentence == null ? hotSearchInfo2.sentence : awemeSearchStructV2.sentence;
        hotSearchInfo2.challengeId = awemeSearchStructV2.challenge_id == null ? hotSearchInfo2.challengeId : awemeSearchStructV2.challenge_id;
        hotSearchInfo2.searchWord = awemeSearchStructV2.search_word == null ? hotSearchInfo2.searchWord : awemeSearchStructV2.search_word;
        hotSearchInfo2.value = a.a(awemeSearchStructV2.value, hotSearchInfo2.value);
        hotSearchInfo2.videoRank = a.a(awemeSearchStructV2.vb_rank, hotSearchInfo2.videoRank);
        hotSearchInfo2.videoRankVV = a.a(awemeSearchStructV2.vb_rank_value, hotSearchInfo2.videoRankVV);
        hotSearchInfo2.rank = a.a(awemeSearchStructV2.rank, hotSearchInfo2.rank);
        hotSearchInfo2.id = awemeSearchStructV2.group_id == null ? hotSearchInfo2.id : awemeSearchStructV2.group_id;
        hotSearchInfo2.label = a.a(awemeSearchStructV2.label, hotSearchInfo2.label);
        return hotSearchInfo2;
    }

    public static AwemeStatistics com$ss$ugc$aweme$proto$AwemeStatisticsStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatistics(AwemeStatisticsStructV2 awemeStatisticsStructV2, AwemeStatistics awemeStatistics) {
        if (awemeStatisticsStructV2 == null) {
            return awemeStatistics;
        }
        AwemeStatistics awemeStatistics2 = new AwemeStatistics();
        awemeStatistics2.commentCount = a.a(awemeStatisticsStructV2.comment_count, awemeStatistics2.commentCount);
        awemeStatistics2.diggCount = a.a(awemeStatisticsStructV2.digg_count, awemeStatistics2.diggCount);
        awemeStatistics2.downloadCount = a.a(awemeStatisticsStructV2.download_count, awemeStatistics2.downloadCount);
        awemeStatistics2.playCount = a.a(awemeStatisticsStructV2.play_count, awemeStatistics2.playCount);
        awemeStatistics2.shareCount = a.a(awemeStatisticsStructV2.share_count, awemeStatistics2.shareCount);
        awemeStatistics2.forwardCount = a.a(awemeStatisticsStructV2.forward_count, awemeStatistics2.forwardCount);
        awemeStatistics2.loseCount = a.a(awemeStatisticsStructV2.lose_count, awemeStatistics2.loseCount);
        awemeStatistics2.loseCommentCount = a.a(awemeStatisticsStructV2.lose_comment_count, awemeStatistics2.loseCommentCount);
        return awemeStatistics2;
    }

    public static AwemeStatus com$ss$ugc$aweme$proto$AwemeStatusStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatus(AwemeStatusStructV2 awemeStatusStructV2, AwemeStatus awemeStatus) {
        if (awemeStatusStructV2 == null) {
            return awemeStatus;
        }
        AwemeStatus awemeStatus2 = new AwemeStatus();
        awemeStatus2.isDelete = a.a(awemeStatusStructV2.is_delete, awemeStatus2.isDelete);
        awemeStatus2.allowShare = a.a(awemeStatusStructV2.allow_share, awemeStatus2.allowShare);
        awemeStatus2.allowComment = a.a(awemeStatusStructV2.allow_comment, awemeStatus2.allowComment);
        awemeStatus2.privateStatus = a.a(awemeStatusStructV2.private_status, awemeStatus2.privateStatus);
        awemeStatus2.inReviewing = a.a(awemeStatusStructV2.in_reviewing, awemeStatus2.inReviewing);
        awemeStatus2.reviewed = a.a(awemeStatusStructV2.reviewed, awemeStatus2.reviewed);
        awemeStatus2.selfSee = a.a(awemeStatusStructV2.self_see, awemeStatus2.selfSee);
        awemeStatus2.isProhibited = a.a(awemeStatusStructV2.is_prohibited, awemeStatus2.isProhibited);
        awemeStatus2.downloadStatus = a.a(awemeStatusStructV2.download_status, awemeStatus2.downloadStatus);
        awemeStatus2.excludeStatus = a.a(awemeStatusStructV2.dont_share_status, awemeStatus2.excludeStatus);
        awemeStatus2.allowRecommend = a.a(awemeStatusStructV2.video_hide_search, awemeStatus2.allowRecommend);
        awemeStatus2.videoMuteInfo = com$ss$ugc$aweme$proto$VideoMuteStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatus$VideoMuteInfo(awemeStatusStructV2.video_mute, awemeStatus2.videoMuteInfo);
        return awemeStatus2;
    }

    public static Aweme com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(AwemeStructV2 awemeStructV2, Aweme aweme) {
        if (awemeStructV2 == null) {
            return aweme;
        }
        Aweme aweme2 = new Aweme();
        aweme2.aid = awemeStructV2.aweme_id == null ? aweme2.aid : awemeStructV2.aweme_id;
        aweme2.desc = awemeStructV2.desc == null ? aweme2.desc : awemeStructV2.desc;
        aweme2.createTime = a.a(awemeStructV2.create_time, aweme2.createTime);
        aweme2.author = com$ss$ugc$aweme$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User(awemeStructV2.author, aweme2.author);
        aweme2.music = com$ss$ugc$aweme$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music(awemeStructV2.music, aweme2.music);
        aweme2.challengeList = List$com$ss$ugc$aweme$proto$ChallengeStructV2$$List$com$ss$android$ugc$aweme$discover$model$Challenge(awemeStructV2.cha_list, aweme2.challengeList);
        aweme2.video = com$ss$ugc$aweme$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video(awemeStructV2.video, aweme2.video);
        aweme2.shareUrl = awemeStructV2.share_url == null ? aweme2.shareUrl : awemeStructV2.share_url;
        aweme2.userDigg = a.a(awemeStructV2.user_digged, aweme2.userDigg);
        aweme2.statistics = com$ss$ugc$aweme$proto$AwemeStatisticsStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatistics(awemeStructV2.statistics, aweme2.statistics);
        aweme2.status = com$ss$ugc$aweme$proto$AwemeStatusStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatus(awemeStructV2.status, aweme2.status);
        aweme2.extra = awemeStructV2.extra == null ? aweme2.extra : awemeStructV2.extra;
        aweme2.rate = a.a(awemeStructV2.rate, aweme2.rate);
        aweme2.textExtra = List$com$ss$ugc$aweme$proto$TextExtraStructV2$$List$com$ss$android$ugc$aweme$model$TextExtraStruct(awemeStructV2.text_extra, aweme2.textExtra);
        aweme2.labelLarge = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeStructV2.label_large, aweme2.labelLarge);
        aweme2.labelThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeStructV2.label_thumb, aweme2.labelThumb);
        aweme2.isTop = a.a(awemeStructV2.is_top, aweme2.isTop);
        aweme2.labelTop = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeStructV2.label_top, aweme2.labelTop);
        aweme2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(awemeStructV2.share_info, aweme2.shareInfo);
        aweme2.originAuthor = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeStructV2.label_origin_author, aweme2.originAuthor);
        aweme2.distance = awemeStructV2.distance == null ? aweme2.distance : awemeStructV2.distance;
        aweme2.musicStarter = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeStructV2.label_music_starter, aweme2.musicStarter);
        aweme2.labelPrivate = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(awemeStructV2.label_private, aweme2.labelPrivate);
        aweme2.videoLabels = List$com$ss$ugc$aweme$proto$AwemeLabelStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeLabelModel(awemeStructV2.video_labels, aweme2.videoLabels);
        aweme2.isVr = a.a(awemeStructV2.is_vr, aweme2.isVr);
        aweme2.landingPage = awemeStructV2.landing_page == null ? aweme2.landingPage : awemeStructV2.landing_page;
        aweme2.isAd = a.a(awemeStructV2.is_ads, aweme2.isAd);
        aweme2.awemeType = a.a(awemeStructV2.aweme_type, aweme2.awemeType);
        aweme2.cmtSwt = a.a(awemeStructV2.cmt_swt, aweme2.cmtSwt);
        aweme2.imageInfos = List$com$ss$ugc$aweme$proto$ImageInfoStructV2$$List$com$ss$android$ugc$aweme$feed$model$ImageInfo(awemeStructV2.image_infos, aweme2.imageInfos);
        aweme2.awemeRiskModel = com$ss$ugc$aweme$proto$AwemeRiskStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeRiskModel(awemeStructV2.risk_infos, aweme2.awemeRiskModel);
        aweme2.isRelieve = a.a(awemeStructV2.is_relieve, aweme2.isRelieve);
        aweme2.position = List$com$ss$ugc$aweme$proto$PositionStructV2$$List$com$ss$android$ugc$aweme$discover$model$Position(awemeStructV2.position, aweme2.position);
        aweme2.uniqidPosition = List$com$ss$ugc$aweme$proto$PositionStructV2$$List$com$ss$android$ugc$aweme$discover$model$Position(awemeStructV2.uniqid_position, aweme2.uniqidPosition);
        aweme2.isHashTag = a.a(awemeStructV2.is_hash_tag, aweme2.isHashTag);
        aweme2.isPgcShow = a.a(awemeStructV2.is_pgcshow, aweme2.isPgcShow);
        aweme2.region = awemeStructV2.region == null ? aweme2.region : awemeStructV2.region;
        aweme2.textVideoLabels = List$com$ss$ugc$aweme$proto$VideoTextStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel(awemeStructV2.video_text, aweme2.textVideoLabels);
        aweme2.specialSticker = com$ss$ugc$aweme$proto$SpecialStickerStructV2$$com$ss$android$ugc$aweme$feed$model$SpecialSticker(awemeStructV2.sp_sticker, aweme2.specialSticker);
        aweme2.adSchedule = awemeStructV2.ad_schedule == null ? aweme2.adSchedule : awemeStructV2.ad_schedule;
        aweme2.collectStatus = a.a(awemeStructV2.collect_stat, aweme2.collectStatus);
        aweme2.textTopLabels = List$com$ss$ugc$aweme$proto$VideoTextStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel(awemeStructV2.label_top_text, aweme2.textTopLabels);
        aweme2.stickerIDs = awemeStructV2.stickers == null ? aweme2.stickerIDs : awemeStructV2.stickers;
        aweme2.forwardItem = com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(awemeStructV2.forward_item, aweme2.forwardItem);
        aweme2.forwardCommentId = awemeStructV2.forward_comment_id == null ? aweme2.forwardCommentId : awemeStructV2.forward_comment_id;
        aweme2.forwardItemId = awemeStructV2.forward_item_id == null ? aweme2.forwardItemId : awemeStructV2.forward_item_id;
        aweme2.groupId = awemeStructV2.group_id == null ? aweme2.groupId : awemeStructV2.group_id;
        aweme2.preForwardId = awemeStructV2.pre_forward_id == null ? aweme2.preForwardId : awemeStructV2.pre_forward_id;
        aweme2.preventDownload = a.a(awemeStructV2.prevent_download, aweme2.preventDownload);
        aweme2.nicknamePosition = List$com$ss$ugc$aweme$proto$PositionStructV2$$List$com$ss$android$ugc$aweme$discover$model$Position(awemeStructV2.nickname_position, aweme2.nicknamePosition);
        aweme2.commentSetting = a.a(awemeStructV2.item_comment_settings, aweme2.commentSetting);
        aweme2.descendantsModel = com$ss$ugc$aweme$proto$DescendantStructV2$$com$ss$android$ugc$aweme$feed$model$DescendantsModel(awemeStructV2.descendants, aweme2.descendantsModel);
        aweme2.awemeRawAd = g.a(awemeStructV2.raw_ad_data, aweme2.awemeRawAd);
        aweme2.gameInfo = com$ss$ugc$aweme$proto$GameStructV2$$com$ss$android$ugc$aweme$feed$model$GameInfo(awemeStructV2.game_info, aweme2.gameInfo);
        aweme2.microAppInfo = com$ss$ugc$aweme$proto$MicroAppStructV2$$com$ss$android$ugc$aweme$miniapp_api$model$MicroAppInfo(awemeStructV2.micro_app_info, aweme2.microAppInfo);
        aweme2.withPromotionalMusic = a.a(awemeStructV2.with_promotional_music, aweme2.withPromotionalMusic);
        aweme2.linkAdData = g.a(awemeStructV2.link_ad_data, aweme2.linkAdData);
        aweme2.activityPendant = com$ss$ugc$aweme$proto$CommerceActivityStructV2$$com$ss$android$ugc$aweme$commerce$model$CommerceActivityStruct(awemeStructV2.activity_pendant, aweme2.activityPendant);
        aweme2.stickerEntranceInfo = com$ss$ugc$aweme$proto$NewFaceStickerStructV2$$com$ss$android$ugc$aweme$sticker$model$NewFaceStickerBean(awemeStructV2.sticker_detail, aweme2.stickerEntranceInfo);
        aweme2.longVideos = List$com$ss$ugc$aweme$proto$LongVideoStructV2$$List$com$ss$android$ugc$aweme$feed$model$LongVideo(awemeStructV2.long_video, aweme2.longVideos);
        aweme2.duetSetting = a.a(awemeStructV2.item_duet, aweme2.duetSetting);
        aweme2.reactSetting = a.a(awemeStructV2.item_react, aweme2.reactSetting);
        aweme2.hotSearchInfo = com$ss$ugc$aweme$proto$AwemeSearchStructV2$$com$ss$android$ugc$aweme$feed$model$HotSearchInfo(awemeStructV2.hot_info, aweme2.hotSearchInfo);
        aweme2.starAtlasOrderId = a.a(awemeStructV2.star_atlas_order_id, aweme2.starAtlasOrderId);
        aweme2.mLabelMusicStarterText = awemeStructV2.label_music_starter_text == null ? aweme2.mLabelMusicStarterText : awemeStructV2.label_music_starter_text;
        aweme2.downloadWithoutWatermark = a.a(awemeStructV2.without_watermark, aweme2.downloadWithoutWatermark);
        aweme2.preload = com$ss$ugc$aweme$proto$PreloadStructV2$$com$ss$android$ugc$aweme$feed$model$Preload(awemeStructV2.preload, aweme2.preload);
        aweme2.descLanguage = awemeStructV2.desc_language == null ? aweme2.descLanguage : awemeStructV2.desc_language;
        aweme2.floatingCardInfo = com$ss$ugc$aweme$proto$AwemeFloatingCardStructV2$$com$ss$android$ugc$aweme$feed$model$FloatingCardInfo(awemeStructV2.floating_card_content, aweme2.floatingCardInfo);
        aweme2.interactStickerStructs = List$com$ss$ugc$aweme$proto$InteractionStickerStructV2$$List$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct(awemeStructV2.interaction_stickers, aweme2.interactStickerStructs);
        aweme2.adLinkType = a.a(awemeStructV2.ad_link_type, aweme2.adLinkType);
        aweme2.takeDownReason = a.a(awemeStructV2.take_down_reason, aweme2.takeDownReason);
        aweme2.takeDownDesc = awemeStructV2.take_down_desc == null ? aweme2.takeDownDesc : awemeStructV2.take_down_desc;
        aweme2.uploadMiscInfoStructStr = awemeStructV2.misc_info == null ? aweme2.uploadMiscInfoStructStr : awemeStructV2.misc_info;
        aweme2.originCommentIds = awemeStructV2.origin_comment_ids == null ? aweme2.originCommentIds : awemeStructV2.origin_comment_ids;
        aweme2.commerceConfigDataList = List$com$ss$ugc$aweme$proto$CommerceConfigDataV2$$List$com$ss$android$ugc$aweme$feed$model$CommerceConfigData(awemeStructV2.commerce_config_data, aweme2.commerceConfigDataList);
        aweme2.commerceStickerInfo = com$ss$ugc$aweme$proto$AwemeCommerceStickerStructV2$$com$ss$android$ugc$aweme$commercialize$model$CommerceStickerInfo(awemeStructV2.commerce_sticker_info, aweme2.commerceStickerInfo);
        aweme2.distributeType = a.a(awemeStructV2.distribute_type, aweme2.distributeType);
        aweme2.videoControl = com$ss$ugc$aweme$proto$VideoControlV2$$com$ss$android$ugc$aweme$feed$model$VideoControl(awemeStructV2.video_control, aweme2.videoControl);
        aweme2.isEffectDesigner = a.a(awemeStructV2.is_effect_designer, aweme2.isEffectDesigner);
        aweme2.adAwemeSource = a.a(awemeStructV2.ad_aweme_source, aweme2.adAwemeSource);
        aweme2.awemeControl = com$ss$ugc$aweme$proto$AwemeControlStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeControl(awemeStructV2.aweme_control, aweme2.awemeControl);
        aweme2.hasVisionSearchEntry = a.a(awemeStructV2.has_vs_entry, aweme2.hasVisionSearchEntry);
        aweme2.anchor = com$ss$ugc$aweme$proto$AnchorStructV2$$com$ss$android$ugc$aweme$feed$model$Anchor(awemeStructV2.anchor, aweme2.anchor);
        aweme2.feedRelationLabel = com$ss$ugc$aweme$proto$RelationLabelStructV2$$com$ss$android$ugc$aweme$feed$model$RelationLabelNew(awemeStructV2.feed_relation_label, aweme2.feedRelationLabel);
        aweme2.mixInfo = com$ss$ugc$aweme$proto$MixStructV2$$com$ss$android$ugc$aweme$feed$model$MixStruct(awemeStructV2.mix_info, aweme2.mixInfo);
        aweme2.hotListStruct = com$ss$ugc$aweme$proto$HotListStructV2$$com$ss$android$ugc$aweme$profile$model$HotListStruct(awemeStructV2.hot_list, aweme2.hotListStruct);
        aweme2.mCommerceVideoAuthInfo = com$ss$ugc$aweme$proto$AwemeCommerceStructV2$$com$ss$android$ugc$aweme$commerce$AwemeCommerceStruct(awemeStructV2.commerce_info, aweme2.mCommerceVideoAuthInfo);
        aweme2.bannerTip = com$ss$ugc$aweme$proto$BannerTipV2$$com$ss$android$ugc$aweme$feed$model$BannerTip(awemeStructV2.banner_tip, aweme2.bannerTip);
        aweme2.anchorInfo = com$ss$ugc$aweme$proto$AwemeAnchorStructV2$$com$ss$android$ugc$aweme$feed$model$AnchorInfo(awemeStructV2.anchor_info, aweme2.anchorInfo);
        aweme2.mLiveAwesomeSplashInfo = com$ss$ugc$aweme$proto$CNYStructV2$$com$ss$android$ugc$aweme$feed$model$livesplash$LiveAwesomeSplashInfo(awemeStructV2.cny_info, aweme2.mLiveAwesomeSplashInfo);
        aweme2.isFamiliar = a.a(awemeStructV2.is_familiar, aweme2.isFamiliar);
        aweme2.needVisionSearchEntry = a.a(awemeStructV2.need_vs_entry, aweme2.needVisionSearchEntry);
        aweme2.mRoomFeedCellStruct = com$ss$ugc$aweme$proto$WebcastRoomFeedCellStructV2$$com$ss$android$ugc$aweme$feed$model$live$RoomFeedCellStruct(awemeStructV2.cell_room, aweme2.mRoomFeedCellStruct);
        aweme2.liveReaSon = awemeStructV2.live_reason == null ? aweme2.liveReaSon : awemeStructV2.live_reason;
        aweme2.videoFeedTag = awemeStructV2.video_feed_tag == null ? aweme2.videoFeedTag : awemeStructV2.video_feed_tag;
        aweme2.videoMaskInfo = com$ss$ugc$aweme$proto$MaskStructV2$$com$ss$android$ugc$aweme$feed$model$VideoMaskInfo(awemeStructV2.mask_info, aweme2.videoMaskInfo);
        aweme2.linkMatch = com$ss$ugc$aweme$proto$LinkMatchStructV2$$com$ss$android$ugc$aweme$search$caption$LinkMatch(awemeStructV2.link_match, aweme2.linkMatch);
        aweme2.videoReplyStruct = com$ss$ugc$aweme$proto$VideoReplyStructV2$$com$ss$android$ugc$aweme$feed$model$VideoReplyStruct(awemeStructV2.video_reply_info, aweme2.videoReplyStruct);
        aweme2.anchors = List$com$ss$ugc$aweme$proto$AnchorCommonStructV2$$List$com$ss$android$ugc$aweme$feed$model$AnchorCommonStruct(awemeStructV2.anchors, aweme2.anchors);
        aweme2.hybridLabels = List$com$ss$ugc$aweme$proto$HybridLabelStructV2$$List$com$ss$android$ugc$aweme$feed$model$AwemeHybridLabelModel(awemeStructV2.hybrid_label, aweme2.hybridLabels);
        aweme2.relationRecommendInfo = com$ss$ugc$aweme$proto$RelationRecommendStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeRelationRecommendModel(awemeStructV2.relation_recommend_info, aweme2.relationRecommendInfo);
        aweme2.userProfileInitInfo = com$ss$ugc$aweme$proto$UserProfileStructV2$$com$ss$android$ugc$aweme$feed$model$UserProfileInitInfo(awemeStructV2.user_profile_init_info, aweme2.userProfileInitInfo);
        aweme2.withSurvey = a.a(awemeStructV2.with_survey, aweme2.withSurvey);
        aweme2.douDiscountMixInfo = com$ss$ugc$aweme$proto$AwemeSearchStructV2$$com$ss$android$ugc$aweme$feed$model$HotSearchInfo(awemeStructV2.dou_discount_mix_info, aweme2.douDiscountMixInfo);
        aweme2.awemeACLShareInfo = com$ss$ugc$aweme$proto$AwemeACLStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeACLShare(awemeStructV2.aweme_acl, aweme2.awemeACLShareInfo);
        aweme2.activity = com$ss$ugc$aweme$proto$AwemeActivityStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeActivity(awemeStructV2.activity, aweme2.activity);
        aweme2.stitchSetting = a.a(awemeStructV2.item_stitch, aweme2.stitchSetting);
        aweme2.geofencingRegions = awemeStructV2.geofencing_regions == null ? aweme2.geofencingRegions : awemeStructV2.geofencing_regions;
        aweme2.anchorsExtras = awemeStructV2.anchors_extras == null ? aweme2.anchorsExtras : awemeStructV2.anchors_extras;
        aweme2.allowGift = a.a(awemeStructV2.allow_gift, aweme2.allowGift);
        aweme2.mutualRelation = com$ss$ugc$aweme$proto$MutualStructV2$$com$ss$android$ugc$aweme$friends$model$MutualStruct(awemeStructV2.mutual_relation, aweme2.mutualRelation);
        aweme2.videoMaskInfos = List$com$ss$ugc$aweme$proto$MaskStructV2$$List$com$ss$android$ugc$aweme$feed$model$VideoMaskInfo(awemeStructV2.mask_infos, aweme2.videoMaskInfos);
        aweme2.boost = com$ss$ugc$aweme$proto$BoostStructV2$$com$ss$android$ugc$aweme$feed$model$Boost(awemeStructV2.boost_tag_info, aweme2.boost);
        aweme2.bottomBarModel = com$ss$ugc$aweme$proto$BottomBarStructV2$$com$ss$android$ugc$aweme$feed$model$BottomBarModel(awemeStructV2.bottom_bar, aweme2.bottomBarModel);
        aweme2.playlist_info = com$ss$ugc$aweme$proto$PlaylistInfoV2$$com$ss$android$ugc$aweme$feed$model$PlayListInfo(awemeStructV2.playlist_info, aweme2.playlist_info);
        aweme2.soundExemption = a.a(awemeStructV2.sound_exemption, aweme2.soundExemption);
        aweme2.playlistBlocked = a.a(awemeStructV2.playlist_blocked, aweme2.playlistBlocked);
        aweme2.partN = awemeStructV2.part_n == null ? aweme2.partN : awemeStructV2.part_n;
        aweme2.greenScreenMaterialList = List$com$ss$ugc$aweme$proto$GreenScreenMaterialV2$$List$com$ss$android$ugc$aweme$feed$model$GreenScreenMaterial(awemeStructV2.green_screen_materials, aweme2.greenScreenMaterialList);
        aweme2.trendingBar = com$ss$ugc$aweme$proto$TrendingBarStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTrendingBar(awemeStructV2.trending_bar, aweme2.trendingBar);
        aweme2.userStory = com$ss$ugc$aweme$proto$UserStoryV2$$com$ss$android$ugc$aweme$feed$model$story$UserStory(awemeStructV2.user_story, aweme2.userStory);
        aweme2.story = com$ss$ugc$aweme$proto$StoryMetadataV2$$com$ss$android$ugc$aweme$feed$model$story$Story(awemeStructV2.story_metadata, aweme2.story);
        aweme2.interactPermission = com$ss$ugc$aweme$proto$InteractPermissionV2$$com$ss$android$ugc$aweme$feed$model$InteractPermission(awemeStructV2.interact_permission, aweme2.interactPermission);
        aweme2.mItemDistributeSource = awemeStructV2.item_distribute_source == null ? aweme2.mItemDistributeSource : awemeStructV2.item_distribute_source;
        aweme2.questionInfo = List$com$ss$ugc$aweme$proto$QuestionInfoV2$$List$com$ss$android$ugc$aweme$question$QuestionInfo(awemeStructV2.question_list, aweme2.questionInfo);
        aweme2.audio = com$ss$ugc$aweme$proto$AudioStructV2$$com$ss$android$ugc$aweme$feed$model$Audio(awemeStructV2.audio, aweme2.audio);
        aweme2.upvoteReason = com$ss$ugc$aweme$proto$UpvoteReasonV2$$com$ss$android$ugc$aweme$feed$model$upvote$UpvoteReason(awemeStructV2.upvote_reason, aweme2.upvoteReason);
        aweme2.deduplicationType = a.a(awemeStructV2.deduplication_type, aweme2.deduplicationType);
        aweme2.interactionTagInfo = com$ss$ugc$aweme$proto$InteractionTagInfoV2$$com$ss$android$ugc$aweme$feed$model$InteractionTagInfo(awemeStructV2.interaction_tag_info, aweme2.interactionTagInfo);
        aweme2.contentDesc = awemeStructV2.content_desc == null ? aweme2.contentDesc : awemeStructV2.content_desc;
        aweme2.contentDescExtra = List$com$ss$ugc$aweme$proto$TextExtraStructV2$$List$com$ss$android$ugc$aweme$model$TextExtraStruct(awemeStructV2.content_desc_extra, aweme2.contentDescExtra);
        aweme2.mItemSourceCategory = a.a(awemeStructV2.item_source_category, aweme2.mItemSourceCategory);
        aweme2.enablePosAdjust = a.a(awemeStructV2.enable_pos_adjust, aweme2.enablePosAdjust);
        aweme2.enableAdDrop = a.a(awemeStructV2.enable_ad_drop, aweme2.enableAdDrop);
        aweme2.predPlaytime = a.a(awemeStructV2.pred_playtime, aweme2.predPlaytime);
        aweme2.gapList = awemeStructV2.gap_list == null ? aweme2.gapList : awemeStructV2.gap_list;
        aweme2.isClientCache = a.a(awemeStructV2.is_client_cache, aweme2.isClientCache);
        aweme2.followUpPublishFromId = a.a(awemeStructV2.follow_up_publish_from_id, aweme2.followUpPublishFromId);
        aweme2.trendingBarFYP = com$ss$ugc$aweme$proto$TrendingBarForYouPageStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTrendingBar(awemeStructV2.trending_bar_fyp, aweme2.trendingBarFYP);
        aweme2.dsp = com$ss$ugc$aweme$proto$MusicDspStructV2$$com$ss$android$ugc$aweme$music$model$Dsp(awemeStructV2.music_dsp_info, aweme2.dsp);
        aweme2.disableSearchTrendingBar = a.a(awemeStructV2.disable_search_trending_bar, aweme2.disableSearchTrendingBar);
        return aweme2;
    }

    public static BannerTip com$ss$ugc$aweme$proto$BannerTipV2$$com$ss$android$ugc$aweme$feed$model$BannerTip(BannerTipV2 bannerTipV2, BannerTip bannerTip) {
        if (bannerTipV2 == null) {
            return bannerTip;
        }
        BannerTip bannerTip2 = new BannerTip();
        bannerTip2.bannerType = a.a(bannerTipV2.banner_type, bannerTip2.bannerType);
        bannerTip2.bannerTxt = bannerTipV2.banner_txt == null ? bannerTip2.bannerTxt : bannerTipV2.banner_txt;
        bannerTip2.linkType = a.a(bannerTipV2.link_type, bannerTip2.linkType);
        bannerTip2.linkUrl = bannerTipV2.link_url == null ? bannerTip2.linkUrl : bannerTipV2.link_url;
        bannerTip2.linkTxt = bannerTipV2.link_txt == null ? bannerTip2.linkTxt : bannerTipV2.link_txt;
        return bannerTip2;
    }

    public static BitRate com$ss$ugc$aweme$proto$BitRateStructV2$$com$ss$android$ugc$aweme$feed$model$BitRate(BitRateStructV2 bitRateStructV2, BitRate bitRate) {
        if (bitRateStructV2 == null) {
            return bitRate;
        }
        BitRate bitRate2 = new BitRate();
        bitRate2.gearName = bitRateStructV2.gear_name == null ? bitRate2.gearName : bitRateStructV2.gear_name;
        bitRate2.qualityType = a.a(bitRateStructV2.quality_type, bitRate2.qualityType);
        bitRate2.bitRate = a.a(bitRateStructV2.bit_rate, bitRate2.bitRate);
        bitRate2.playAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(bitRateStructV2.play_addr, bitRate2.playAddr);
        bitRate2.isBytevc1 = a.a(bitRateStructV2.is_bytevc1, bitRate2.isBytevc1);
        return bitRate2;
    }

    public static BlueVBrandInfo com$ss$ugc$aweme$proto$BlueVBrandInfoStructV2$$com$ss$android$ugc$aweme$profile$model$BlueVBrandInfo(BlueVBrandInfoStructV2 blueVBrandInfoStructV2, BlueVBrandInfo blueVBrandInfo) {
        if (blueVBrandInfoStructV2 == null) {
            return blueVBrandInfo;
        }
        BlueVBrandInfo blueVBrandInfo2 = new BlueVBrandInfo();
        blueVBrandInfo2.categoryId = a.a(blueVBrandInfoStructV2.category_id, blueVBrandInfo2.categoryId);
        blueVBrandInfo2.categoryName = blueVBrandInfoStructV2.category_name == null ? blueVBrandInfo2.categoryName : blueVBrandInfoStructV2.category_name;
        blueVBrandInfo2.brandId = a.a(blueVBrandInfoStructV2.brand_id, blueVBrandInfo2.brandId);
        blueVBrandInfo2.brandName = blueVBrandInfoStructV2.brand_name == null ? blueVBrandInfo2.brandName : blueVBrandInfoStructV2.brand_name;
        blueVBrandInfo2.logoUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(blueVBrandInfoStructV2.logo_url, blueVBrandInfo2.logoUrl);
        blueVBrandInfo2.heat = a.a(blueVBrandInfoStructV2.heat, blueVBrandInfo2.heat);
        blueVBrandInfo2.rank = a.a(blueVBrandInfoStructV2.rank, blueVBrandInfo2.rank);
        blueVBrandInfo2.rankDiff = a.a(blueVBrandInfoStructV2.rank_diff, blueVBrandInfo2.rankDiff);
        blueVBrandInfo2.tagName = blueVBrandInfoStructV2.tag_name == null ? blueVBrandInfo2.tagName : blueVBrandInfoStructV2.tag_name;
        return blueVBrandInfo2;
    }

    public static Boost com$ss$ugc$aweme$proto$BoostStructV2$$com$ss$android$ugc$aweme$feed$model$Boost(BoostStructV2 boostStructV2, Boost boost) {
        if (boostStructV2 == null) {
            return boost;
        }
        Boost boost2 = new Boost();
        boost2.text = boostStructV2.label == null ? boost2.text : boostStructV2.label;
        boost2.bgColor = boostStructV2.color == null ? boost2.bgColor : boostStructV2.color;
        boost2.textColor = boostStructV2.color_text == null ? boost2.textColor : boostStructV2.color_text;
        return boost2;
    }

    public static BottomBarModel com$ss$ugc$aweme$proto$BottomBarStructV2$$com$ss$android$ugc$aweme$feed$model$BottomBarModel(BottomBarStructV2 bottomBarStructV2, BottomBarModel bottomBarModel) {
        if (bottomBarStructV2 == null) {
            return bottomBarModel;
        }
        BottomBarModel bottomBarModel2 = new BottomBarModel();
        bottomBarModel2.content = bottomBarStructV2.content == null ? bottomBarModel2.content : bottomBarStructV2.content;
        bottomBarModel2.icon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(bottomBarStructV2.icon, bottomBarModel2.icon);
        bottomBarModel2.type = a.a(bottomBarStructV2.type, bottomBarModel2.type);
        return bottomBarModel2;
    }

    public static LiveAwesomeSplashInfo com$ss$ugc$aweme$proto$CNYStructV2$$com$ss$android$ugc$aweme$feed$model$livesplash$LiveAwesomeSplashInfo(CNYStructV2 cNYStructV2, LiveAwesomeSplashInfo liveAwesomeSplashInfo) {
        if (cNYStructV2 == null) {
            return liveAwesomeSplashInfo;
        }
        LiveAwesomeSplashInfo liveAwesomeSplashInfo2 = new LiveAwesomeSplashInfo();
        liveAwesomeSplashInfo2.startTime = a.a(cNYStructV2.start_time, liveAwesomeSplashInfo2.startTime);
        liveAwesomeSplashInfo2.endTime = a.a(cNYStructV2.end_time, liveAwesomeSplashInfo2.endTime);
        liveAwesomeSplashInfo2.topviewValid = a.a(cNYStructV2.topview_valid, liveAwesomeSplashInfo2.topviewValid);
        liveAwesomeSplashInfo2.feedShowTime = a.a(cNYStructV2.feed_show_time, liveAwesomeSplashInfo2.feedShowTime);
        liveAwesomeSplashInfo2.liveData = cNYStructV2.live_info == null ? liveAwesomeSplashInfo2.liveData : cNYStructV2.live_info;
        return liveAwesomeSplashInfo2;
    }

    public static com.ss.android.ugc.aweme.search.c.a com$ss$ugc$aweme$proto$CaptionAnchorStructV2$$com$ss$android$ugc$aweme$search$caption$CaptionAnchor(CaptionAnchorStructV2 captionAnchorStructV2, com.ss.android.ugc.aweme.search.c.a aVar) {
        if (captionAnchorStructV2 == null) {
            return aVar;
        }
        com.ss.android.ugc.aweme.search.c.a aVar2 = new com.ss.android.ugc.aweme.search.c.a();
        aVar2.keyword = captionAnchorStructV2.keyword == null ? aVar2.keyword : captionAnchorStructV2.keyword;
        aVar2.link = captionAnchorStructV2.link == null ? aVar2.link : captionAnchorStructV2.link;
        aVar2.icon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(captionAnchorStructV2.icon, aVar2.icon);
        return aVar2;
    }

    public static com.ss.android.ugc.aweme.search.c.b com$ss$ugc$aweme$proto$CaptionInfoStructV2$$com$ss$android$ugc$aweme$search$caption$CaptionInfo(CaptionInfoStructV2 captionInfoStructV2, com.ss.android.ugc.aweme.search.c.b bVar) {
        if (captionInfoStructV2 == null) {
            return bVar;
        }
        com.ss.android.ugc.aweme.search.c.b bVar2 = new com.ss.android.ugc.aweme.search.c.b();
        bVar2.keyword = captionInfoStructV2.keyword == null ? bVar2.keyword : captionInfoStructV2.keyword;
        bVar2.link = captionInfoStructV2.link == null ? bVar2.link : captionInfoStructV2.link;
        return bVar2;
    }

    public static CaptionItemModel com$ss$ugc$aweme$proto$CaptionStructV2$$com$ss$android$ugc$aweme$feed$model$CaptionItemModel(CaptionStructV2 captionStructV2, CaptionItemModel captionItemModel) {
        if (captionStructV2 == null) {
            return captionItemModel;
        }
        CaptionItemModel captionItemModel2 = new CaptionItemModel();
        captionItemModel2.languageName = captionStructV2.lang == null ? captionItemModel2.languageName : captionStructV2.lang;
        captionItemModel2.languageId = a.a(captionStructV2.language_id, captionItemModel2.languageId);
        captionItemModel2.url = captionStructV2.url == null ? captionItemModel2.url : captionStructV2.url;
        captionItemModel2.expire = a.a(captionStructV2.expire, captionItemModel2.expire);
        captionItemModel2.format = captionStructV2.caption_format == null ? captionItemModel2.format : captionStructV2.caption_format;
        captionItemModel2.complaintId = a.a(captionStructV2.complaint_id, captionItemModel2.complaintId);
        captionItemModel2.isAutoGenerated = a.a(captionStructV2.is_auto_generated, captionItemModel2.isAutoGenerated);
        captionItemModel2.subId = a.a(captionStructV2.sub_id, captionItemModel2.subId);
        captionItemModel2.versionType = captionStructV2.sub_version == null ? captionItemModel2.versionType : captionStructV2.sub_version;
        captionItemModel2.claSubtitleId = a.a(captionStructV2.cla_subtitle_id, captionItemModel2.claSubtitleId);
        captionItemModel2.translatorId = a.a(captionStructV2.translator_id, captionItemModel2.translatorId);
        return captionItemModel2;
    }

    public static Challenge com$ss$ugc$aweme$proto$ChallengeStructV2$$com$ss$android$ugc$aweme$discover$model$Challenge(ChallengeStructV2 challengeStructV2, Challenge challenge) {
        if (challengeStructV2 == null) {
            return challenge;
        }
        Challenge challenge2 = new Challenge();
        challenge2.cid = challengeStructV2.cid == null ? challenge2.cid : challengeStructV2.cid;
        challenge2.challengeName = challengeStructV2.cha_name == null ? challenge2.challengeName : challengeStructV2.cha_name;
        challenge2.desc = challengeStructV2.desc == null ? challenge2.desc : challengeStructV2.desc;
        challenge2.schema = challengeStructV2.schema == null ? challenge2.schema : challengeStructV2.schema;
        challenge2.author = com$ss$ugc$aweme$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User(challengeStructV2.author, challenge2.author);
        challenge2.userCount = a.a(challengeStructV2.user_count, challenge2.userCount);
        challenge2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(challengeStructV2.share_info, challenge2.shareInfo);
        challenge2.connectMusics = List$com$ss$ugc$aweme$proto$MusicStructV2$$List$com$ss$android$ugc$aweme$music$model$Music(challengeStructV2.connect_music, challenge2.connectMusics);
        challenge2.type = a.a(challengeStructV2.type, challenge2.type);
        challenge2.subType = a.a(challengeStructV2.sub_type, challenge2.subType);
        challenge2.backgroundImageUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(challengeStructV2.background_image_url, challenge2.backgroundImageUrl);
        challenge2.stickerId = challengeStructV2.sticker_id == null ? challenge2.stickerId : challengeStructV2.sticker_id;
        challenge2.linkText = challengeStructV2.link_text == null ? challenge2.linkText : challengeStructV2.link_text;
        challenge2.linkAction = challengeStructV2.link_action == null ? challenge2.linkAction : challengeStructV2.link_action;
        challenge2.pgcshow = a.a(challengeStructV2.is_pgcshow, challenge2.pgcshow);
        challenge2.collectStatus = a.a(challengeStructV2.collect_stat, challenge2.collectStatus);
        challenge2.coverItem = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(challengeStructV2.cover_item, challenge2.coverItem);
        challenge2.isChallenge = a.a(challengeStructV2.is_challenge, challenge2.isChallenge);
        challenge2.viewCount = a.a(challengeStructV2.view_count, challenge2.viewCount);
        challenge2.challengeDisclaimer = com$ss$ugc$aweme$proto$DisclaimerStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeDisclaimer(challengeStructV2.disclaimer, challenge2.challengeDisclaimer);
        challenge2.allowUploadCover = a.a(challengeStructV2.allow_upload_cover, challenge2.allowUploadCover);
        challenge2.isCommerceAndValid = a.a(challengeStructV2.is_commerce, challenge2.isCommerceAndValid);
        challenge2.challengeProfileUrl = challengeStructV2.hashtag_profile == null ? challenge2.challengeProfileUrl : challengeStructV2.hashtag_profile;
        challenge2.challengeBgUrl = challengeStructV2.cover_photo == null ? challenge2.challengeBgUrl : challengeStructV2.cover_photo;
        challenge2.isHotSearch = a.a(challengeStructV2.is_hot_search, challenge2.isHotSearch);
        challenge2.linkType = a.a(challengeStructV2.link_type, challenge2.linkType);
        challenge2.challengeAnnouncement = com$ss$ugc$aweme$proto$AnnouncementStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeAnnouncement(challengeStructV2.announcement_info, challenge2.challengeAnnouncement);
        challenge2.moduleType = a.a(challengeStructV2.module_type, challenge2.moduleType);
        challenge2.profileTagUrl = challengeStructV2.profile_tag == null ? challenge2.profileTagUrl : challengeStructV2.profile_tag;
        challenge2.attrs = challengeStructV2.cha_attrs == null ? challenge2.attrs : challengeStructV2.cha_attrs;
        challenge2.transfrom = com$ss$ugc$aweme$proto$IconButtonStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeTransform(challengeStructV2.button, challenge2.transfrom);
        return challenge2;
    }

    public static CaptionModel com$ss$ugc$aweme$proto$ClaStructV2$$com$ss$android$ugc$aweme$feed$model$CaptionModel(ClaStructV2 claStructV2, CaptionModel captionModel) {
        if (claStructV2 == null) {
            return captionModel;
        }
        CaptionModel captionModel2 = new CaptionModel();
        captionModel2.hasOriginalAudio = a.a(claStructV2.has_original_audio, captionModel2.hasOriginalAudio);
        captionModel2.enableAutoCaption = a.a(claStructV2.enable_auto_caption, captionModel2.enableAutoCaption);
        captionModel2.originalCaptionLanguage = com$ss$ugc$aweme$proto$OriginalLanguageStructV2$$com$ss$android$ugc$aweme$feed$model$CaptionLanguage(claStructV2.original_language_info, captionModel2.originalCaptionLanguage);
        captionModel2.captionList = List$com$ss$ugc$aweme$proto$CaptionStructV2$$List$com$ss$android$ugc$aweme$feed$model$CaptionItemModel(claStructV2.caption_infos, captionModel2.captionList);
        return captionModel2;
    }

    public static com.ss.android.ugc.aweme.commerce.model.b com$ss$ugc$aweme$proto$CommerceActivityStructV2$$com$ss$android$ugc$aweme$commerce$model$CommerceActivityStruct(CommerceActivityStructV2 commerceActivityStructV2, com.ss.android.ugc.aweme.commerce.model.b bVar) {
        if (commerceActivityStructV2 == null) {
            return bVar;
        }
        com.ss.android.ugc.aweme.commerce.model.b bVar2 = new com.ss.android.ugc.aweme.commerce.model.b();
        bVar2.actType = a.a(commerceActivityStructV2.act_type, bVar2.actType);
        bVar2.image = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(commerceActivityStructV2.image, bVar2.image);
        bVar2.jumpWebUrl = commerceActivityStructV2.jump_web_url == null ? bVar2.jumpWebUrl : commerceActivityStructV2.jump_web_url;
        bVar2.jumpOpenUrl = commerceActivityStructV2.jump_open_url == null ? bVar2.jumpOpenUrl : commerceActivityStructV2.jump_open_url;
        bVar2.title = commerceActivityStructV2.title == null ? bVar2.title : commerceActivityStructV2.title;
        bVar2.startTime = a.a(commerceActivityStructV2.start_time, bVar2.startTime);
        bVar2.endTime = a.a(commerceActivityStructV2.end_time, bVar2.endTime);
        bVar2.timeRange = List$com$ss$ugc$aweme$proto$ActivityTimeRangeV2$$List$com$ss$android$ugc$aweme$commerce$model$ActivityTimeRange(commerceActivityStructV2.time_range, bVar2.timeRange);
        bVar2.trackUrlList = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(commerceActivityStructV2.track_url_list, bVar2.trackUrlList);
        bVar2.clickTrackUrlList = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(commerceActivityStructV2.click_track_url_list, bVar2.clickTrackUrlList);
        return bVar2;
    }

    public static CommerceConfigData com$ss$ugc$aweme$proto$CommerceConfigDataV2$$com$ss$android$ugc$aweme$feed$model$CommerceConfigData(CommerceConfigDataV2 commerceConfigDataV2, CommerceConfigData commerceConfigData) {
        if (commerceConfigDataV2 == null) {
            return commerceConfigData;
        }
        CommerceConfigData commerceConfigData2 = new CommerceConfigData();
        commerceConfigData2.type = a.a(commerceConfigDataV2.type, commerceConfigData2.type);
        commerceConfigData2.itemLikeEggData = com$ss$ugc$aweme$proto$ItemLikeEggDataV2$$com$ss$android$ugc$aweme$feed$model$ItemLikeEggData(commerceConfigDataV2.item_like_egg, commerceConfigData2.itemLikeEggData);
        commerceConfigData2.itemCommentEggGroup = g.a(commerceConfigDataV2.data, commerceConfigData2.itemCommentEggGroup);
        return commerceConfigData2;
    }

    public static f com$ss$ugc$aweme$proto$CommerceInfoStructV2$$com$ss$android$ugc$aweme$commerce$CommerceInfo(CommerceInfoStructV2 commerceInfoStructV2, f fVar) {
        if (commerceInfoStructV2 == null) {
            return fVar;
        }
        f fVar2 = new f();
        fVar2.headImageUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(commerceInfoStructV2.head_image_url, fVar2.headImageUrl);
        fVar2.offlineInfoList = List$com$ss$ugc$aweme$proto$OfflineInfoStructV2$$List$com$ss$android$ugc$aweme$commerce$OfflineInfo(commerceInfoStructV2.offline_info_list, fVar2.offlineInfoList);
        fVar2.challengeList = List$com$ss$ugc$aweme$proto$ChallengeStructV2$$List$com$ss$android$ugc$aweme$discover$model$Challenge(commerceInfoStructV2.challenge_list, fVar2.challengeList);
        fVar2.quickShopUrl = commerceInfoStructV2.quick_shop_url == null ? fVar2.quickShopUrl : commerceInfoStructV2.quick_shop_url;
        fVar2.quickShopName = commerceInfoStructV2.quick_shop_name == null ? fVar2.quickShopName : commerceInfoStructV2.quick_shop_name;
        fVar2.siteId = commerceInfoStructV2.site_id == null ? fVar2.siteId : commerceInfoStructV2.site_id;
        return fVar2;
    }

    public static CommercePermissionStruct com$ss$ugc$aweme$proto$CommercePermissionStructV2$$com$ss$android$ugc$aweme$profile$model$CommercePermissionStruct(CommercePermissionStructV2 commercePermissionStructV2, CommercePermissionStruct commercePermissionStruct) {
        if (commercePermissionStructV2 == null) {
            return commercePermissionStruct;
        }
        CommercePermissionStruct commercePermissionStruct2 = new CommercePermissionStruct();
        commercePermissionStruct2.topItem = a.a(commercePermissionStructV2.top_item, commercePermissionStruct2.topItem);
        commercePermissionStruct2.starAtlasOrder = a.a(commercePermissionStructV2.star_atlas_order, commercePermissionStruct2.starAtlasOrder);
        return commercePermissionStruct2;
    }

    public static c com$ss$ugc$aweme$proto$CommerceStickerStructV2$$com$ss$android$ugc$aweme$sticker$model$CommerceSticker(CommerceStickerStructV2 commerceStickerStructV2, c cVar) {
        if (commerceStickerStructV2 == null) {
            return cVar;
        }
        c cVar2 = new c();
        cVar2.id = commerceStickerStructV2.id == null ? cVar2.id : commerceStickerStructV2.id;
        cVar2.adOwnerId = commerceStickerStructV2.ad_owner_id == null ? cVar2.adOwnerId : commerceStickerStructV2.ad_owner_id;
        cVar2.adOwnerName = commerceStickerStructV2.ad_owner_name == null ? cVar2.adOwnerName : commerceStickerStructV2.ad_owner_name;
        cVar2.detailDesc = commerceStickerStructV2.detail_desc == null ? cVar2.detailDesc : commerceStickerStructV2.detail_desc;
        cVar2.detailLetters = commerceStickerStructV2.detail_letters == null ? cVar2.detailLetters : commerceStickerStructV2.detail_letters;
        cVar2.detailOpenUrl = commerceStickerStructV2.detail_open_url == null ? cVar2.detailOpenUrl : commerceStickerStructV2.detail_open_url;
        cVar2.detailWebUrl = commerceStickerStructV2.detail_web_url == null ? cVar2.detailWebUrl : commerceStickerStructV2.detail_web_url;
        cVar2.detailWebUrlTitle = commerceStickerStructV2.detail_web_url_title == null ? cVar2.detailWebUrlTitle : commerceStickerStructV2.detail_web_url_title;
        cVar2.screenDesc = commerceStickerStructV2.screen_desc == null ? cVar2.screenDesc : commerceStickerStructV2.screen_desc;
        cVar2.musicId = commerceStickerStructV2.music_id == null ? cVar2.musicId : commerceStickerStructV2.music_id;
        cVar2.challengeId = commerceStickerStructV2.challenge_id == null ? cVar2.challengeId : commerceStickerStructV2.challenge_id;
        cVar2.screenIcon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(commerceStickerStructV2.screen_icon, cVar2.screenIcon);
        cVar2.expireTime = a.a(commerceStickerStructV2.expire_time, cVar2.expireTime);
        cVar2.commerceStickerUnlockInfo = com$ss$ugc$aweme$proto$CommerceStickerUnlockStructV2$$com$ss$android$ugc$aweme$sticker$model$CommerceStickerUnlockInfo(commerceStickerStructV2.unlock_info, cVar2.commerceStickerUnlockInfo);
        return cVar2;
    }

    public static com.ss.android.ugc.aweme.sticker.model.d com$ss$ugc$aweme$proto$CommerceStickerUnlockStructV2$$com$ss$android$ugc$aweme$sticker$model$CommerceStickerUnlockInfo(CommerceStickerUnlockStructV2 commerceStickerUnlockStructV2, com.ss.android.ugc.aweme.sticker.model.d dVar) {
        if (commerceStickerUnlockStructV2 == null) {
            return dVar;
        }
        com.ss.android.ugc.aweme.sticker.model.d dVar2 = new com.ss.android.ugc.aweme.sticker.model.d();
        dVar2.desc = commerceStickerUnlockStructV2.desc == null ? dVar2.desc : commerceStickerUnlockStructV2.desc;
        dVar2.webUrl = commerceStickerUnlockStructV2.web_url == null ? dVar2.webUrl : commerceStickerUnlockStructV2.web_url;
        dVar2.openUrl = commerceStickerUnlockStructV2.open_url == null ? dVar2.openUrl : commerceStickerUnlockStructV2.open_url;
        return dVar2;
    }

    public static CommerceUserInfo com$ss$ugc$aweme$proto$CommerceUserStructV2$$com$ss$android$ugc$aweme$profile$model$CommerceUserInfo(CommerceUserStructV2 commerceUserStructV2, CommerceUserInfo commerceUserInfo) {
        if (commerceUserStructV2 == null) {
            return commerceUserInfo;
        }
        CommerceUserInfo commerceUserInfo2 = new CommerceUserInfo();
        commerceUserInfo2.starAtlas = a.a(commerceUserStructV2.star_atlas, commerceUserInfo2.starAtlas);
        commerceUserInfo2.showStarAtlasCooperation = a.a(commerceUserStructV2.show_star_atlas_cooperation, commerceUserInfo2.showStarAtlasCooperation);
        commerceUserInfo2.hasAdEntry = a.a(commerceUserStructV2.has_ads_entry, commerceUserInfo2.hasAdEntry);
        commerceUserInfo2.linkUserInfo = com$ss$ugc$aweme$proto$LinkUserInfoStructV2$$com$ss$android$ugc$aweme$profile$model$LinkUserInfoStruct(commerceUserStructV2.link_user_info, commerceUserInfo2.linkUserInfo);
        commerceUserInfo2.adInfluencerType = a.a(commerceUserStructV2.ad_influencer_type, commerceUserInfo2.adInfluencerType);
        return commerceUserInfo2;
    }

    public static DescendantsModel com$ss$ugc$aweme$proto$DescendantStructV2$$com$ss$android$ugc$aweme$feed$model$DescendantsModel(DescendantStructV2 descendantStructV2, DescendantsModel descendantsModel) {
        if (descendantStructV2 == null) {
            return descendantsModel;
        }
        DescendantsModel descendantsModel2 = new DescendantsModel();
        descendantsModel2.platforms = descendantStructV2.platforms == null ? descendantsModel2.platforms : descendantStructV2.platforms;
        descendantsModel2.notifyMsg = descendantStructV2.notify_msg == null ? descendantsModel2.notifyMsg : descendantStructV2.notify_msg;
        return descendantsModel2;
    }

    public static ChallengeDisclaimer com$ss$ugc$aweme$proto$DisclaimerStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeDisclaimer(DisclaimerStructV2 disclaimerStructV2, ChallengeDisclaimer challengeDisclaimer) {
        if (disclaimerStructV2 == null) {
            return challengeDisclaimer;
        }
        ChallengeDisclaimer challengeDisclaimer2 = new ChallengeDisclaimer();
        challengeDisclaimer2.title = disclaimerStructV2.title == null ? challengeDisclaimer2.title : disclaimerStructV2.title;
        challengeDisclaimer2.content = disclaimerStructV2.content == null ? challengeDisclaimer2.content : disclaimerStructV2.content;
        return challengeDisclaimer2;
    }

    public static DuetStickerStruct com$ss$ugc$aweme$proto$DuetWithMeStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$DuetStickerStruct(DuetWithMeStickerStructV2 duetWithMeStickerStructV2, DuetStickerStruct duetStickerStruct) {
        if (duetWithMeStickerStructV2 == null) {
            return duetStickerStruct;
        }
        DuetStickerStruct duetStickerStruct2 = new DuetStickerStruct();
        duetStickerStruct2.userIdList = duetWithMeStickerStructV2.invitedToDuetUserIds == null ? duetStickerStruct2.userIdList : duetWithMeStickerStructV2.invitedToDuetUserIds;
        duetStickerStruct2.openMic = a.a(duetWithMeStickerStructV2.micPermissionOn, duetStickerStruct2.openMic);
        duetStickerStruct2.duetString = duetWithMeStickerStructV2.stickerContent == null ? duetStickerStruct2.duetString : duetWithMeStickerStructV2.stickerContent;
        return duetStickerStruct2;
    }

    public static EffectArtistDetail com$ss$ugc$aweme$proto$EffectArtistStructV2$$com$ss$android$ugc$aweme$profile$model$EffectArtistDetail(EffectArtistStructV2 effectArtistStructV2, EffectArtistDetail effectArtistDetail) {
        if (effectArtistStructV2 == null) {
            return effectArtistDetail;
        }
        EffectArtistDetail effectArtistDetail2 = new EffectArtistDetail();
        effectArtistDetail2.total = a.a(effectArtistStructV2.total, effectArtistDetail2.total);
        return effectArtistDetail2;
    }

    public static ExternalRecommendReasonStruct com$ss$ugc$aweme$proto$ExternalRecommendReasonStructV2$$com$ss$android$ugc$aweme$profile$model$ExternalRecommendReasonStruct(ExternalRecommendReasonStructV2 externalRecommendReasonStructV2, ExternalRecommendReasonStruct externalRecommendReasonStruct) {
        if (externalRecommendReasonStructV2 == null) {
            return externalRecommendReasonStruct;
        }
        ExternalRecommendReasonStruct externalRecommendReasonStruct2 = new ExternalRecommendReasonStruct();
        externalRecommendReasonStruct2.reason = externalRecommendReasonStructV2.reason == null ? externalRecommendReasonStruct2.reason : externalRecommendReasonStructV2.reason;
        externalRecommendReasonStruct2.hashedPhoneNumber = externalRecommendReasonStructV2.hashed_phone_number == null ? externalRecommendReasonStruct2.hashedPhoneNumber : externalRecommendReasonStructV2.hashed_phone_number;
        externalRecommendReasonStruct2.externalUsername = externalRecommendReasonStructV2.external_username == null ? externalRecommendReasonStruct2.externalUsername : externalRecommendReasonStructV2.external_username;
        return externalRecommendReasonStruct2;
    }

    public static ExternalMusicInfo com$ss$ugc$aweme$proto$ExternalSongStructV2$$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo(ExternalSongStructV2 externalSongStructV2, ExternalMusicInfo externalMusicInfo) {
        if (externalSongStructV2 == null) {
            return externalMusicInfo;
        }
        ExternalMusicInfo externalMusicInfo2 = new ExternalMusicInfo();
        externalMusicInfo2.jumpUrl = externalSongStructV2.h5_url == null ? externalMusicInfo2.jumpUrl : externalSongStructV2.h5_url;
        externalMusicInfo2.partnerName = externalSongStructV2.partner_name == null ? externalMusicInfo2.partnerName : externalSongStructV2.partner_name;
        externalMusicInfo2.partnerSongId = externalSongStructV2.partner_song_id == null ? externalMusicInfo2.partnerSongId : externalSongStructV2.partner_song_id;
        externalMusicInfo2.externalSongKey = externalSongStructV2.external_song_key == null ? externalMusicInfo2.externalSongKey : externalSongStructV2.external_song_key;
        return externalMusicInfo2;
    }

    public static Extra com$ss$ugc$aweme$proto$ExtraStructV2$$com$ss$android$ugc$aweme$feed$model$Extra(ExtraStructV2 extraStructV2, Extra extra) {
        if (extraStructV2 == null) {
            return extra;
        }
        Extra extra2 = new Extra();
        extra2.now = a.a(extraStructV2.now, extra2.now);
        extra2.fatalItemIds = extraStructV2.fatal_item_ids == null ? extra2.fatalItemIds : extraStructV2.fatal_item_ids;
        return extra2;
    }

    public static FansStruct com$ss$ugc$aweme$proto$FansStructV2$$com$ss$android$ugc$aweme$feed$model$live$FansStruct(FansStructV2 fansStructV2, FansStruct fansStruct) {
        if (fansStructV2 == null) {
            return fansStruct;
        }
        FansStruct fansStruct2 = new FansStruct();
        fansStruct2.fansName = fansStructV2.fans_name == null ? fansStruct2.fansName : fansStructV2.fans_name;
        fansStruct2.fansLevel = a.a(fansStructV2.fans_level, fansStruct2.fansLevel);
        fansStruct2.isFan = a.a(fansStructV2.is_fan, fansStruct2.isFan);
        fansStruct2.lightUp = a.a(fansStructV2.light_up, fansStruct2.lightUp);
        return fansStruct2;
    }

    public static FollowerDetail com$ss$ugc$aweme$proto$FollowersDetailV2$$com$ss$android$ugc$aweme$profile$model$FollowerDetail(FollowersDetailV2 followersDetailV2, FollowerDetail followerDetail) {
        if (followersDetailV2 == null) {
            return followerDetail;
        }
        FollowerDetail followerDetail2 = new FollowerDetail();
        followerDetail2.name = followersDetailV2.name == null ? followerDetail2.name : followersDetailV2.name;
        followerDetail2.icon = followersDetailV2.icon == null ? followerDetail2.icon : followersDetailV2.icon;
        followerDetail2.fansCount = a.a(followersDetailV2.fans_count, followerDetail2.fansCount);
        followerDetail2.openUrl = followersDetailV2.open_url == null ? followerDetail2.openUrl : followersDetailV2.open_url;
        followerDetail2.appleId = followersDetailV2.apple_id == null ? followerDetail2.appleId : followersDetailV2.apple_id;
        followerDetail2.downloadUrl = followersDetailV2.download_url == null ? followerDetail2.downloadUrl : followersDetailV2.download_url;
        followerDetail2.packageName = followersDetailV2.package_name == null ? followerDetail2.packageName : followersDetailV2.package_name;
        followerDetail2.appName = followersDetailV2.app_name == null ? followerDetail2.appName : followersDetailV2.app_name;
        return followerDetail2;
    }

    public static GameInfo com$ss$ugc$aweme$proto$GameStructV2$$com$ss$android$ugc$aweme$feed$model$GameInfo(GameStructV2 gameStructV2, GameInfo gameInfo) {
        if (gameStructV2 == null) {
            return gameInfo;
        }
        GameInfo gameInfo2 = new GameInfo();
        gameInfo2.gameType = a.a(gameStructV2.game_type, gameInfo2.gameType);
        gameInfo2.gameScore = a.a(gameStructV2.game_score, gameInfo2.gameScore);
        return gameInfo2;
    }

    public static GreenScreenMaterial com$ss$ugc$aweme$proto$GreenScreenMaterialV2$$com$ss$android$ugc$aweme$feed$model$GreenScreenMaterial(GreenScreenMaterialV2 greenScreenMaterialV2, GreenScreenMaterial greenScreenMaterial) {
        if (greenScreenMaterialV2 == null) {
            return greenScreenMaterial;
        }
        GreenScreenMaterial greenScreenMaterial2 = new GreenScreenMaterial();
        greenScreenMaterial2.type = a.a(greenScreenMaterialV2.type, greenScreenMaterial2.type);
        greenScreenMaterial2.startTime = a.a(greenScreenMaterialV2.start_time, greenScreenMaterial2.startTime);
        greenScreenMaterial2.endTime = a.a(greenScreenMaterialV2.end_time, greenScreenMaterial2.endTime);
        greenScreenMaterial2.resId = greenScreenMaterialV2.resource_id == null ? greenScreenMaterial2.resId : greenScreenMaterialV2.resource_id;
        greenScreenMaterial2.authorName = greenScreenMaterialV2.author_name == null ? greenScreenMaterial2.authorName : greenScreenMaterialV2.author_name;
        greenScreenMaterial2.stickerId = greenScreenMaterialV2.effect_id == null ? greenScreenMaterial2.stickerId : greenScreenMaterialV2.effect_id;
        return greenScreenMaterial2;
    }

    public static HotSearchGuideWord com$ss$ugc$aweme$proto$GuideWordV2$$com$ss$android$ugc$aweme$feed$model$HotSearchGuideWord(GuideWordV2 guideWordV2, HotSearchGuideWord hotSearchGuideWord) {
        if (guideWordV2 == null) {
            return hotSearchGuideWord;
        }
        HotSearchGuideWord hotSearchGuideWord2 = new HotSearchGuideWord();
        hotSearchGuideWord2.displayWord = guideWordV2.word == null ? hotSearchGuideWord2.displayWord : guideWordV2.word;
        hotSearchGuideWord2.searchWord = guideWordV2.search_word == null ? hotSearchGuideWord2.searchWord : guideWordV2.search_word;
        hotSearchGuideWord2.type = a.a(guideWordV2.type, hotSearchGuideWord2.type);
        hotSearchGuideWord2.breatheTimes = a.a(guideWordV2.breathe_times, hotSearchGuideWord2.breatheTimes);
        return hotSearchGuideWord2;
    }

    public static HashtagStruct com$ss$ugc$aweme$proto$HashTagStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$HashtagStruct(HashTagStickerStructV2 hashTagStickerStructV2, HashtagStruct hashtagStruct) {
        if (hashTagStickerStructV2 == null) {
            return hashtagStruct;
        }
        HashtagStruct hashtagStruct2 = new HashtagStruct();
        hashtagStruct2.hashtagName = hashTagStickerStructV2.hashtag_name == null ? hashtagStruct2.hashtagName : hashTagStickerStructV2.hashtag_name;
        hashtagStruct2.hashtagId = hashTagStickerStructV2.hashtag_id == null ? hashtagStruct2.hashtagId : hashTagStickerStructV2.hashtag_id;
        hashtagStruct2.status = a.a(hashTagStickerStructV2.status, hashtagStruct2.status);
        return hashtagStruct2;
    }

    public static HotListStruct com$ss$ugc$aweme$proto$HotListStructV2$$com$ss$android$ugc$aweme$profile$model$HotListStruct(HotListStructV2 hotListStructV2, HotListStruct hotListStruct) {
        if (hotListStructV2 == null) {
            return hotListStruct;
        }
        HotListStruct hotListStruct2 = new HotListStruct();
        hotListStruct2.titile = hotListStructV2.title == null ? hotListStruct2.titile : hotListStructV2.title;
        hotListStruct2.imageUrl = hotListStructV2.image_url == null ? hotListStruct2.imageUrl : hotListStructV2.image_url;
        hotListStruct2.schema = hotListStructV2.schema == null ? hotListStruct2.schema : hotListStructV2.schema;
        hotListStruct2.type = a.a(hotListStructV2.type, hotListStruct2.type);
        hotListStruct2.header = hotListStructV2.header == null ? hotListStruct2.header : hotListStructV2.header;
        hotListStruct2.footer = hotListStructV2.footer == null ? hotListStruct2.footer : hotListStructV2.footer;
        return hotListStruct2;
    }

    public static HotSearchSprintStruct com$ss$ugc$aweme$proto$HotsearchSprintStructV2$$com$ss$android$ugc$aweme$profile$model$HotSearchSprintStruct(HotsearchSprintStructV2 hotsearchSprintStructV2, HotSearchSprintStruct hotSearchSprintStruct) {
        if (hotsearchSprintStructV2 == null) {
            return hotSearchSprintStruct;
        }
        HotSearchSprintStruct hotSearchSprintStruct2 = new HotSearchSprintStruct();
        hotSearchSprintStruct2.sprint = a.a(hotsearchSprintStructV2.sprint, hotSearchSprintStruct2.sprint);
        hotSearchSprintStruct2.hitRankPeoples = List$com$ss$ugc$aweme$proto$SimpleUserStructV2$$List$com$ss$android$ugc$aweme$profile$model$User(hotsearchSprintStructV2.followers, hotSearchSprintStruct2.hitRankPeoples);
        return hotSearchSprintStruct2;
    }

    public static AwemeHybridLabelModel com$ss$ugc$aweme$proto$HybridLabelStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeHybridLabelModel(HybridLabelStructV2 hybridLabelStructV2, AwemeHybridLabelModel awemeHybridLabelModel) {
        if (hybridLabelStructV2 == null) {
            return awemeHybridLabelModel;
        }
        AwemeHybridLabelModel awemeHybridLabelModel2 = new AwemeHybridLabelModel();
        awemeHybridLabelModel2.backgroundColor = hybridLabelStructV2.background_color == null ? awemeHybridLabelModel2.backgroundColor : hybridLabelStructV2.background_color;
        awemeHybridLabelModel2.text = hybridLabelStructV2.text == null ? awemeHybridLabelModel2.text : hybridLabelStructV2.text;
        awemeHybridLabelModel2.textColor = hybridLabelStructV2.text_color == null ? awemeHybridLabelModel2.textColor : hybridLabelStructV2.text_color;
        awemeHybridLabelModel2.imageUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(hybridLabelStructV2.image, awemeHybridLabelModel2.imageUrl);
        awemeHybridLabelModel2.refUrl = hybridLabelStructV2.ref_url == null ? awemeHybridLabelModel2.refUrl : hybridLabelStructV2.ref_url;
        return awemeHybridLabelModel2;
    }

    public static ChallengeTransform com$ss$ugc$aweme$proto$IconButtonStructV2$$com$ss$android$ugc$aweme$discover$model$ChallengeTransform(IconButtonStructV2 iconButtonStructV2, ChallengeTransform challengeTransform) {
        if (iconButtonStructV2 == null) {
            return challengeTransform;
        }
        ChallengeTransform challengeTransform2 = new ChallengeTransform();
        challengeTransform2.text = iconButtonStructV2.text == null ? challengeTransform2.text : iconButtonStructV2.text;
        challengeTransform2.iconUrlModel = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(iconButtonStructV2.icon, challengeTransform2.iconUrlModel);
        challengeTransform2.action = iconButtonStructV2.action == null ? challengeTransform2.action : iconButtonStructV2.action;
        return challengeTransform2;
    }

    public static ImageInfo com$ss$ugc$aweme$proto$ImageInfoStructV2$$com$ss$android$ugc$aweme$feed$model$ImageInfo(ImageInfoStructV2 imageInfoStructV2, ImageInfo imageInfo) {
        if (imageInfoStructV2 == null) {
            return imageInfo;
        }
        ImageInfo imageInfo2 = new ImageInfo();
        imageInfo2.height = a.a(imageInfoStructV2.height, imageInfo2.height);
        imageInfo2.width = a.a(imageInfoStructV2.width, imageInfo2.width);
        imageInfo2.labelLarge = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(imageInfoStructV2.label_large, imageInfo2.labelLarge);
        imageInfo2.labelThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(imageInfoStructV2.label_thumb, imageInfo2.labelThumb);
        return imageInfo2;
    }

    public static InteractPermission com$ss$ugc$aweme$proto$InteractPermissionV2$$com$ss$android$ugc$aweme$feed$model$InteractPermission(InteractPermissionV2 interactPermissionV2, InteractPermission interactPermission) {
        if (interactPermissionV2 == null) {
            return interactPermission;
        }
        InteractPermission interactPermission2 = new InteractPermission();
        interactPermission2.duet = a.a(interactPermissionV2.duet, interactPermission2.duet);
        interactPermission2.stitch = a.a(interactPermissionV2.stitch, interactPermission2.stitch);
        interactPermission2.duetPrivacySettingControl = a.a(interactPermissionV2.duet_privacy_setting, interactPermission2.duetPrivacySettingControl);
        interactPermission2.stitchPrivacySettingControl = a.a(interactPermissionV2.stitch_privacy_setting, interactPermission2.stitchPrivacySettingControl);
        interactPermission2.upvote = a.a(interactPermissionV2.upvote, interactPermission2.upvote);
        return interactPermission2;
    }

    public static InteractStickerStruct com$ss$ugc$aweme$proto$InteractionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$InteractStickerStruct(InteractionStickerStructV2 interactionStickerStructV2, InteractStickerStruct interactStickerStruct) {
        if (interactionStickerStructV2 == null) {
            return interactStickerStruct;
        }
        InteractStickerStruct interactStickerStruct2 = new InteractStickerStruct();
        interactStickerStruct2.type = a.a(interactionStickerStructV2.type, interactStickerStruct2.type);
        interactStickerStruct2.index = a.a(interactionStickerStructV2.index, interactStickerStruct2.index);
        interactStickerStruct2.trackList = interactionStickerStructV2.track_info == null ? interactStickerStruct2.trackList : interactionStickerStructV2.track_info;
        interactStickerStruct2.attr = interactionStickerStructV2.attr == null ? interactStickerStruct2.attr : interactionStickerStructV2.attr;
        interactStickerStruct2.pollStruct = com$ss$ugc$aweme$proto$VoteStructV2$$com$ss$android$ugc$aweme$sticker$data$PollStruct(interactionStickerStructV2.vote_info, interactStickerStruct2.pollStruct);
        interactStickerStruct2.mTextStruct = interactionStickerStructV2.text_info == null ? interactStickerStruct2.mTextStruct : interactionStickerStructV2.text_info;
        interactStickerStruct2.mentionInfo = com$ss$ugc$aweme$proto$MentionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$MentionStruct(interactionStickerStructV2.mention_info, interactStickerStruct2.mentionInfo);
        interactStickerStruct2.hashtagInfo = com$ss$ugc$aweme$proto$HashTagStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$HashtagStruct(interactionStickerStructV2.hashtag_info, interactStickerStruct2.hashtagInfo);
        interactStickerStruct2.mCountDownStickerStruct = com$ss$ugc$aweme$proto$LiveCountdownStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$CountDownStickerStruct(interactionStickerStructV2.countdown_info, interactStickerStruct2.mCountDownStickerStruct);
        interactStickerStruct2.mCaptionStruct = com$ss$ugc$aweme$proto$AutoVideoCaptionStructV2$$com$ss$android$ugc$aweme$sticker$data$CaptionStruct(interactionStickerStructV2.auto_video_caption_info, interactStickerStruct2.mCaptionStruct);
        interactStickerStruct2.duetStickerStruct = com$ss$ugc$aweme$proto$DuetWithMeStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$DuetStickerStruct(interactionStickerStructV2.duet_with_me, interactStickerStruct2.duetStickerStruct);
        interactStickerStruct2.mQaStruct = com$ss$ugc$aweme$proto$QuestionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$QaStruct(interactionStickerStructV2.question_info, interactStickerStruct2.mQaStruct);
        return interactStickerStruct2;
    }

    public static InteractionTagInfo com$ss$ugc$aweme$proto$InteractionTagInfoV2$$com$ss$android$ugc$aweme$feed$model$InteractionTagInfo(InteractionTagInfoV2 interactionTagInfoV2, InteractionTagInfo interactionTagInfo) {
        if (interactionTagInfoV2 == null) {
            return interactionTagInfo;
        }
        InteractionTagInfo interactionTagInfo2 = new InteractionTagInfo();
        interactionTagInfo2.interestLevel = a.a(interactionTagInfoV2.interest_level, interactionTagInfo2.interestLevel);
        interactionTagInfo2.videoLabelText = interactionTagInfoV2.video_label_text == null ? interactionTagInfo2.videoLabelText : interactionTagInfoV2.video_label_text;
        interactionTagInfo2.taggedUsers = List$com$ss$ugc$aweme$proto$InteractionTagUserInfoV2$$List$com$ss$android$ugc$aweme$feed$model$InteractionTagUserInfo(interactionTagInfoV2.tagged_users, interactionTagInfo2.taggedUsers);
        return interactionTagInfo2;
    }

    public static InteractionTagUserInfo com$ss$ugc$aweme$proto$InteractionTagUserInfoV2$$com$ss$android$ugc$aweme$feed$model$InteractionTagUserInfo(InteractionTagUserInfoV2 interactionTagUserInfoV2, InteractionTagUserInfo interactionTagUserInfo) {
        if (interactionTagUserInfoV2 == null) {
            return interactionTagUserInfo;
        }
        InteractionTagUserInfo interactionTagUserInfo2 = new InteractionTagUserInfo();
        interactionTagUserInfo2.uid = interactionTagUserInfoV2.uid == null ? interactionTagUserInfo2.uid : interactionTagUserInfoV2.uid;
        interactionTagUserInfo2.uniqueId = interactionTagUserInfoV2.unique_id == null ? interactionTagUserInfo2.uniqueId : interactionTagUserInfoV2.unique_id;
        interactionTagUserInfo2.nickname = interactionTagUserInfoV2.nickname == null ? interactionTagUserInfo2.nickname : interactionTagUserInfoV2.nickname;
        interactionTagUserInfo2.avatarThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(interactionTagUserInfoV2.avatar_thumb, interactionTagUserInfo2.avatarThumb);
        interactionTagUserInfo2.followStatus = a.a(interactionTagUserInfoV2.follow_status, interactionTagUserInfo2.followStatus);
        interactionTagUserInfo2.followerStatus = a.a(interactionTagUserInfoV2.follower_status, interactionTagUserInfo2.followerStatus);
        interactionTagUserInfo2.isPrivateAccount = a.a(interactionTagUserInfoV2.is_private_account, interactionTagUserInfo2.isPrivateAccount);
        interactionTagUserInfo2.customVerify = interactionTagUserInfoV2.custom_verify == null ? interactionTagUserInfo2.customVerify : interactionTagUserInfoV2.custom_verify;
        interactionTagUserInfo2.enterpriseVerifyReason = interactionTagUserInfoV2.enterprise_verify_reason == null ? interactionTagUserInfo2.enterpriseVerifyReason : interactionTagUserInfoV2.enterprise_verify_reason;
        interactionTagUserInfo2.interestLevel = a.a(interactionTagUserInfoV2.interest_level, interactionTagUserInfo2.interestLevel);
        return interactionTagUserInfo2;
    }

    public static ItemLikeEggData com$ss$ugc$aweme$proto$ItemLikeEggDataV2$$com$ss$android$ugc$aweme$feed$model$ItemLikeEggData(ItemLikeEggDataV2 itemLikeEggDataV2, ItemLikeEggData itemLikeEggData) {
        if (itemLikeEggDataV2 == null) {
            return itemLikeEggData;
        }
        ItemLikeEggData itemLikeEggData2 = new ItemLikeEggData();
        itemLikeEggData2.materialUrl = itemLikeEggDataV2.material_url == null ? itemLikeEggData2.materialUrl : itemLikeEggDataV2.material_url;
        itemLikeEggData2.fileType = itemLikeEggDataV2.file_type == null ? itemLikeEggData2.fileType : itemLikeEggDataV2.file_type;
        return itemLikeEggData2;
    }

    public static StoryBlockInfo com$ss$ugc$aweme$proto$LifeStoryBlockStructV2$$com$ss$android$ugc$aweme$profile$model$StoryBlockInfo(LifeStoryBlockStructV2 lifeStoryBlockStructV2, StoryBlockInfo storyBlockInfo) {
        if (lifeStoryBlockStructV2 == null) {
            return storyBlockInfo;
        }
        StoryBlockInfo storyBlockInfo2 = new StoryBlockInfo();
        storyBlockInfo2.isBlock = a.a(lifeStoryBlockStructV2.life_story_block, storyBlockInfo2.isBlock);
        storyBlockInfo2.isBlocked = a.a(lifeStoryBlockStructV2.life_story_blocked, storyBlockInfo2.isBlocked);
        return storyBlockInfo2;
    }

    public static com.ss.android.ugc.aweme.search.c.c com$ss$ugc$aweme$proto$LinkMatchStructV2$$com$ss$android$ugc$aweme$search$caption$LinkMatch(LinkMatchStructV2 linkMatchStructV2, com.ss.android.ugc.aweme.search.c.c cVar) {
        if (linkMatchStructV2 == null) {
            return cVar;
        }
        com.ss.android.ugc.aweme.search.c.c cVar2 = new com.ss.android.ugc.aweme.search.c.c();
        cVar2.totalLimit = a.a(linkMatchStructV2.total_limit, cVar2.totalLimit);
        cVar2.queryLimit = a.a(linkMatchStructV2.query_limit, cVar2.queryLimit);
        cVar2.matchInfoList = List$com$ss$ugc$aweme$proto$MatchInfoStructV2$$List$com$ss$android$ugc$aweme$search$caption$MatchInfo(linkMatchStructV2.match_info, cVar2.matchInfoList);
        cVar2.captionInfo = com$ss$ugc$aweme$proto$CaptionInfoStructV2$$com$ss$android$ugc$aweme$search$caption$CaptionInfo(linkMatchStructV2.caption_info, cVar2.captionInfo);
        cVar2.captionAnchor = com$ss$ugc$aweme$proto$CaptionAnchorStructV2$$com$ss$android$ugc$aweme$search$caption$CaptionAnchor(linkMatchStructV2.caption_anchor, cVar2.captionAnchor);
        return cVar2;
    }

    public static LinkUserInfoStruct com$ss$ugc$aweme$proto$LinkUserInfoStructV2$$com$ss$android$ugc$aweme$profile$model$LinkUserInfoStruct(LinkUserInfoStructV2 linkUserInfoStructV2, LinkUserInfoStruct linkUserInfoStruct) {
        if (linkUserInfoStructV2 == null) {
            return linkUserInfoStruct;
        }
        LinkUserInfoStruct linkUserInfoStruct2 = new LinkUserInfoStruct();
        linkUserInfoStruct2.authStatus = a.a(linkUserInfoStructV2.auth_status, linkUserInfoStruct2.authStatus);
        linkUserInfoStruct2.authType = a.a(linkUserInfoStructV2.auth_type, linkUserInfoStruct2.authType);
        return linkUserInfoStruct2;
    }

    public static CountDownStickerStruct com$ss$ugc$aweme$proto$LiveCountdownStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$CountDownStickerStruct(LiveCountdownStickerStructV2 liveCountdownStickerStructV2, CountDownStickerStruct countDownStickerStruct) {
        if (liveCountdownStickerStructV2 == null) {
            return countDownStickerStruct;
        }
        CountDownStickerStruct countDownStickerStruct2 = new CountDownStickerStruct();
        countDownStickerStruct2.title = liveCountdownStickerStructV2.title == null ? countDownStickerStruct2.title : liveCountdownStickerStructV2.title;
        countDownStickerStruct2.expiredTime = liveCountdownStickerStructV2.end_time == null ? countDownStickerStruct2.expiredTime : liveCountdownStickerStructV2.end_time;
        countDownStickerStruct2.subscribeNum = a.a(liveCountdownStickerStructV2.subscribe_count, countDownStickerStruct2.subscribeNum);
        countDownStickerStruct2.subscribe = liveCountdownStickerStructV2.is_subscribed == null ? countDownStickerStruct2.subscribe : liveCountdownStickerStructV2.is_subscribed;
        countDownStickerStruct2.textTobeSubscribed = liveCountdownStickerStructV2.text_to_be_subscribed == null ? countDownStickerStruct2.textTobeSubscribed : liveCountdownStickerStructV2.text_to_be_subscribed;
        countDownStickerStruct2.textAlreadySubscribed = liveCountdownStickerStructV2.text_already_subscribed == null ? countDownStickerStruct2.textAlreadySubscribed : liveCountdownStickerStructV2.text_already_subscribed;
        countDownStickerStruct2.textAlreadyExpired = liveCountdownStickerStructV2.text_already_ended == null ? countDownStickerStruct2.textAlreadyExpired : liveCountdownStickerStructV2.text_already_ended;
        return countDownStickerStruct2;
    }

    public static HonorStruct com$ss$ugc$aweme$proto$LiveHonorStructV2$$com$ss$android$ugc$aweme$profile$model$HonorStruct(LiveHonorStructV2 liveHonorStructV2, HonorStruct honorStruct) {
        if (liveHonorStructV2 == null) {
            return honorStruct;
        }
        HonorStruct honorStruct2 = new HonorStruct();
        honorStruct2.level = a.a(liveHonorStructV2.honor_level, honorStruct2.level);
        honorStruct2.score = a.a(liveHonorStructV2.honor_score, honorStruct2.score);
        return honorStruct2;
    }

    public static LogPbBean com$ss$ugc$aweme$proto$LogPbStructV2$$com$ss$android$ugc$aweme$feed$model$LogPbBean(LogPbStructV2 logPbStructV2, LogPbBean logPbBean) {
        if (logPbStructV2 == null) {
            return logPbBean;
        }
        LogPbBean logPbBean2 = new LogPbBean();
        logPbBean2.imprId = logPbStructV2.impr_id == null ? logPbBean2.imprId : logPbStructV2.impr_id;
        return logPbBean2;
    }

    public static LongVideo com$ss$ugc$aweme$proto$LongVideoStructV2$$com$ss$android$ugc$aweme$feed$model$LongVideo(LongVideoStructV2 longVideoStructV2, LongVideo longVideo) {
        if (longVideoStructV2 == null) {
            return longVideo;
        }
        LongVideo longVideo2 = new LongVideo();
        longVideo2.video = com$ss$ugc$aweme$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video(longVideoStructV2.video, longVideo2.video);
        longVideo2.longVideoType = a.a(longVideoStructV2.long_video_type, longVideo2.longVideoType);
        longVideo2.trailerStartTime = a.a(longVideoStructV2.trailer_start_time, longVideo2.trailerStartTime);
        longVideo2.videoControl = com$ss$ugc$aweme$proto$VideoControlV2$$com$ss$android$ugc$aweme$feed$model$VideoControl(longVideoStructV2.video_control, longVideo2.videoControl);
        return longVideo2;
    }

    public static VideoMaskInfo com$ss$ugc$aweme$proto$MaskStructV2$$com$ss$android$ugc$aweme$feed$model$VideoMaskInfo(MaskStructV2 maskStructV2, VideoMaskInfo videoMaskInfo) {
        if (maskStructV2 == null) {
            return videoMaskInfo;
        }
        VideoMaskInfo videoMaskInfo2 = new VideoMaskInfo();
        videoMaskInfo2.showMask = maskStructV2.show_mask == null ? videoMaskInfo2.showMask : maskStructV2.show_mask;
        videoMaskInfo2.maskType = maskStructV2.mask_type == null ? videoMaskInfo2.maskType : maskStructV2.mask_type;
        videoMaskInfo2.status = maskStructV2.status == null ? videoMaskInfo2.status : maskStructV2.status;
        videoMaskInfo2.title = maskStructV2.title == null ? videoMaskInfo2.title : maskStructV2.title;
        videoMaskInfo2.content = maskStructV2.content == null ? videoMaskInfo2.content : maskStructV2.content;
        videoMaskInfo2.cancelMaskLabel = maskStructV2.cancel_mask_label == null ? videoMaskInfo2.cancelMaskLabel : maskStructV2.cancel_mask_label;
        return videoMaskInfo2;
    }

    public static d com$ss$ugc$aweme$proto$MatchInfoStructV2$$com$ss$android$ugc$aweme$search$caption$MatchInfo(MatchInfoStructV2 matchInfoStructV2, d dVar) {
        if (matchInfoStructV2 == null) {
            return dVar;
        }
        d dVar2 = new d();
        dVar2.query = matchInfoStructV2.query == null ? dVar2.query : matchInfoStructV2.query;
        dVar2.link = matchInfoStructV2.link == null ? dVar2.link : matchInfoStructV2.link;
        dVar2.begin = a.a(matchInfoStructV2.begin, dVar2.begin);
        dVar2.end = a.a(matchInfoStructV2.end, dVar2.end);
        return dVar2;
    }

    public static MatchedFriendStruct com$ss$ugc$aweme$proto$MatchedFriendStructV2$$com$ss$android$ugc$aweme$profile$model$MatchedFriendStruct(MatchedFriendStructV2 matchedFriendStructV2, MatchedFriendStruct matchedFriendStruct) {
        if (matchedFriendStructV2 == null) {
            return matchedFriendStruct;
        }
        MatchedFriendStruct matchedFriendStruct2 = new MatchedFriendStruct();
        matchedFriendStruct2.recType = matchedFriendStructV2.rec_type == null ? matchedFriendStruct2.recType : matchedFriendStructV2.rec_type;
        matchedFriendStruct2.recommendReason = matchedFriendStructV2.recommend_reason == null ? matchedFriendStruct2.recommendReason : matchedFriendStructV2.recommend_reason;
        matchedFriendStruct2.mMutualStruct = com$ss$ugc$aweme$proto$MutualStructV2$$com$ss$android$ugc$aweme$friends$model$MutualStruct(matchedFriendStructV2.mutual_struct, matchedFriendStruct2.mMutualStruct);
        matchedFriendStruct2.relationType = matchedFriendStructV2.relation_type == null ? matchedFriendStruct2.relationType : matchedFriendStructV2.relation_type;
        matchedFriendStruct2.externalRecommendReasonStruct = com$ss$ugc$aweme$proto$ExternalRecommendReasonStructV2$$com$ss$android$ugc$aweme$profile$model$ExternalRecommendReasonStruct(matchedFriendStructV2.external_recommend_reason, matchedFriendStruct2.externalRecommendReasonStruct);
        return matchedFriendStruct2;
    }

    public static MatchedPGCSoundInfo com$ss$ugc$aweme$proto$MatchedPGCSoundStructV2$$com$ss$android$ugc$aweme$music$model$MatchedPGCSoundInfo(MatchedPGCSoundStructV2 matchedPGCSoundStructV2, MatchedPGCSoundInfo matchedPGCSoundInfo) {
        if (matchedPGCSoundStructV2 == null) {
            return matchedPGCSoundInfo;
        }
        MatchedPGCSoundInfo matchedPGCSoundInfo2 = new MatchedPGCSoundInfo();
        matchedPGCSoundInfo2.id = a.a(matchedPGCSoundStructV2.id, matchedPGCSoundInfo2.id);
        matchedPGCSoundInfo2.author = matchedPGCSoundStructV2.author == null ? matchedPGCSoundInfo2.author : matchedPGCSoundStructV2.author;
        matchedPGCSoundInfo2.title = matchedPGCSoundStructV2.title == null ? matchedPGCSoundInfo2.title : matchedPGCSoundStructV2.title;
        matchedPGCSoundInfo2.mixedTitle = matchedPGCSoundStructV2.mixed_title == null ? matchedPGCSoundInfo2.mixedTitle : matchedPGCSoundStructV2.mixed_title;
        matchedPGCSoundInfo2.mixedAuthor = matchedPGCSoundStructV2.mixed_author == null ? matchedPGCSoundInfo2.mixedAuthor : matchedPGCSoundStructV2.mixed_author;
        return matchedPGCSoundInfo2;
    }

    public static MatchedSoundInfo com$ss$ugc$aweme$proto$MatchedSongStructV2$$com$ss$android$ugc$aweme$music$model$MatchedSoundInfo(MatchedSongStructV2 matchedSongStructV2, MatchedSoundInfo matchedSoundInfo) {
        if (matchedSongStructV2 == null) {
            return matchedSoundInfo;
        }
        MatchedSoundInfo matchedSoundInfo2 = new MatchedSoundInfo();
        matchedSoundInfo2.id = matchedSongStructV2.id == null ? matchedSoundInfo2.id : matchedSongStructV2.id;
        matchedSoundInfo2.author = matchedSongStructV2.author == null ? matchedSoundInfo2.author : matchedSongStructV2.author;
        matchedSoundInfo2.title = matchedSongStructV2.title == null ? matchedSoundInfo2.title : matchedSongStructV2.title;
        matchedSoundInfo2.h5Url = matchedSongStructV2.h5_url == null ? matchedSoundInfo2.h5Url : matchedSongStructV2.h5_url;
        matchedSoundInfo2.coverMedium = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(matchedSongStructV2.cover_medium, matchedSoundInfo2.coverMedium);
        matchedSoundInfo2.performers = List$com$ss$ugc$aweme$proto$MusicPerformerStructV2$$List$com$ss$android$ugc$aweme$music$model$MusicPerformer(matchedSongStructV2.performers, matchedSoundInfo2.performers);
        matchedSoundInfo2.chorusInfo = com$ss$ugc$aweme$proto$MusicChorusInfoStructV2$$com$ss$android$ugc$aweme$music$model$MusicChorusInfo(matchedSongStructV2.chorus_info, matchedSoundInfo2.chorusInfo);
        return matchedSoundInfo2;
    }

    public static MentionStruct com$ss$ugc$aweme$proto$MentionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$MentionStruct(MentionStickerStructV2 mentionStickerStructV2, MentionStruct mentionStruct) {
        if (mentionStickerStructV2 == null) {
            return mentionStruct;
        }
        MentionStruct mentionStruct2 = new MentionStruct();
        mentionStruct2.secUid = mentionStickerStructV2.sec_uid == null ? mentionStruct2.secUid : mentionStickerStructV2.sec_uid;
        mentionStruct2.username = mentionStickerStructV2.user_name == null ? mentionStruct2.username : mentionStickerStructV2.user_name;
        mentionStruct2.userId = mentionStickerStructV2.user_id == null ? mentionStruct2.userId : mentionStickerStructV2.user_id;
        mentionStruct2.nickname = mentionStickerStructV2.nickname == null ? mentionStruct2.nickname : mentionStickerStructV2.nickname;
        mentionStruct2.avatarUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(mentionStickerStructV2.user_avatar_url, mentionStruct2.avatarUrl);
        return mentionStruct2;
    }

    public static com.ss.android.ugc.aweme.miniapp_api.model.c com$ss$ugc$aweme$proto$MicroAppCardStructV2$$com$ss$android$ugc$aweme$miniapp_api$model$MiniAppCard(MicroAppCardStructV2 microAppCardStructV2, com.ss.android.ugc.aweme.miniapp_api.model.c cVar) {
        if (microAppCardStructV2 == null) {
            return cVar;
        }
        com.ss.android.ugc.aweme.miniapp_api.model.c cVar2 = new com.ss.android.ugc.aweme.miniapp_api.model.c();
        cVar2.imageUrl = microAppCardStructV2.image_url == null ? cVar2.imageUrl : microAppCardStructV2.image_url;
        cVar2.text = microAppCardStructV2.text == null ? cVar2.text : microAppCardStructV2.text;
        cVar2.waitTime = a.a(microAppCardStructV2.wait_time, cVar2.waitTime);
        return cVar2;
    }

    public static com.ss.android.ugc.aweme.miniapp_api.model.b com$ss$ugc$aweme$proto$MicroAppStructV2$$com$ss$android$ugc$aweme$miniapp_api$model$MicroAppInfo(MicroAppStructV2 microAppStructV2, com.ss.android.ugc.aweme.miniapp_api.model.b bVar) {
        if (microAppStructV2 == null) {
            return bVar;
        }
        com.ss.android.ugc.aweme.miniapp_api.model.b bVar2 = new com.ss.android.ugc.aweme.miniapp_api.model.b();
        bVar2.appId = microAppStructV2.app_id == null ? bVar2.appId : microAppStructV2.app_id;
        bVar2.name = microAppStructV2.app_name == null ? bVar2.name : microAppStructV2.app_name;
        bVar2.icon = microAppStructV2.icon == null ? bVar2.icon : microAppStructV2.icon;
        bVar2.orientation = a.a(microAppStructV2.orientation, bVar2.orientation);
        bVar2.schema = microAppStructV2.schema == null ? bVar2.schema : microAppStructV2.schema;
        bVar2.state = a.a(microAppStructV2.state, bVar2.state);
        bVar2.summary = microAppStructV2.summary == null ? bVar2.summary : microAppStructV2.summary;
        bVar2.type = a.a(microAppStructV2.type, bVar2.type);
        bVar2.desc = microAppStructV2.description == null ? bVar2.desc : microAppStructV2.description;
        bVar2.title = microAppStructV2.title == null ? bVar2.title : microAppStructV2.title;
        bVar2.miniAppCard = com$ss$ugc$aweme$proto$MicroAppCardStructV2$$com$ss$android$ugc$aweme$miniapp_api$model$MiniAppCard(microAppStructV2.card, bVar2.miniAppCard);
        bVar2.webUrl = microAppStructV2.web_url == null ? bVar2.webUrl : microAppStructV2.web_url;
        return bVar2;
    }

    public static MixStatisStruct com$ss$ugc$aweme$proto$MixStatisStructV2$$com$ss$android$ugc$aweme$feed$model$MixStatisStruct(MixStatisStructV2 mixStatisStructV2, MixStatisStruct mixStatisStruct) {
        if (mixStatisStructV2 == null) {
            return mixStatisStruct;
        }
        MixStatisStruct mixStatisStruct2 = new MixStatisStruct();
        mixStatisStruct2.playVV = a.a(mixStatisStructV2.play_vv, mixStatisStruct2.playVV);
        mixStatisStruct2.collectVV = a.a(mixStatisStructV2.collect_vv, mixStatisStruct2.collectVV);
        mixStatisStruct2.currentEpisode = a.a(mixStatisStructV2.current_episode, mixStatisStruct2.currentEpisode);
        mixStatisStruct2.updatedToEpisode = a.a(mixStatisStructV2.updated_to_episode, mixStatisStruct2.updatedToEpisode);
        mixStatisStruct2.hasUpdatedEpisode = a.a(mixStatisStructV2.has_updated_episode, mixStatisStruct2.hasUpdatedEpisode);
        return mixStatisStruct2;
    }

    public static MixStatusStruct com$ss$ugc$aweme$proto$MixStatusStructV2$$com$ss$android$ugc$aweme$feed$model$MixStatusStruct(MixStatusStructV2 mixStatusStructV2, MixStatusStruct mixStatusStruct) {
        if (mixStatusStructV2 == null) {
            return mixStatusStruct;
        }
        MixStatusStruct mixStatusStruct2 = new MixStatusStruct();
        mixStatusStruct2.status = a.a(mixStatusStructV2.status, mixStatusStruct2.status);
        mixStatusStruct2.isCollected = a.a(mixStatusStructV2.is_collected, mixStatusStruct2.isCollected);
        return mixStatusStruct2;
    }

    public static MixStruct com$ss$ugc$aweme$proto$MixStructV2$$com$ss$android$ugc$aweme$feed$model$MixStruct(MixStructV2 mixStructV2, MixStruct mixStruct) {
        if (mixStructV2 == null) {
            return mixStruct;
        }
        MixStruct mixStruct2 = new MixStruct();
        mixStruct2.mixId = mixStructV2.mix_id == null ? mixStruct2.mixId : mixStructV2.mix_id;
        mixStruct2.mixName = mixStructV2.mix_name == null ? mixStruct2.mixName : mixStructV2.mix_name;
        mixStruct2.cover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(mixStructV2.cover_url, mixStruct2.cover);
        mixStruct2.icon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(mixStructV2.icon_url, mixStruct2.icon);
        mixStruct2.status = com$ss$ugc$aweme$proto$MixStatusStructV2$$com$ss$android$ugc$aweme$feed$model$MixStatusStruct(mixStructV2.status, mixStruct2.status);
        mixStruct2.statis = com$ss$ugc$aweme$proto$MixStatisStructV2$$com$ss$android$ugc$aweme$feed$model$MixStatisStruct(mixStructV2.statis, mixStruct2.statis);
        mixStruct2.desc = mixStructV2.desc == null ? mixStruct2.desc : mixStructV2.desc;
        mixStruct2.author = com$ss$ugc$aweme$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User(mixStructV2.author, mixStruct2.author);
        mixStruct2.extra = mixStructV2.extra == null ? mixStruct2.extra : mixStructV2.extra;
        mixStruct2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(mixStructV2.share_info, mixStruct2.shareInfo);
        return mixStruct2;
    }

    public static MusicOwnerInfo com$ss$ugc$aweme$proto$MusicArtistStructV2$$com$ss$android$ugc$aweme$music$model$MusicOwnerInfo(MusicArtistStructV2 musicArtistStructV2, MusicOwnerInfo musicOwnerInfo) {
        if (musicArtistStructV2 == null) {
            return musicOwnerInfo;
        }
        MusicOwnerInfo musicOwnerInfo2 = new MusicOwnerInfo();
        musicOwnerInfo2.uid = musicArtistStructV2.uid == null ? musicOwnerInfo2.uid : musicArtistStructV2.uid;
        musicOwnerInfo2.secUid = musicArtistStructV2.sec_uid == null ? musicOwnerInfo2.secUid : musicArtistStructV2.sec_uid;
        musicOwnerInfo2.nickName = musicArtistStructV2.nick_name == null ? musicOwnerInfo2.nickName : musicArtistStructV2.nick_name;
        musicOwnerInfo2.handle = musicArtistStructV2.handle == null ? musicOwnerInfo2.handle : musicArtistStructV2.handle;
        musicOwnerInfo2.avatar = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicArtistStructV2.avatar, musicOwnerInfo2.avatar);
        musicOwnerInfo2.verified = a.a(musicArtistStructV2.is_verified, musicOwnerInfo2.verified);
        musicOwnerInfo2.enterType = a.a(musicArtistStructV2.enter_type, musicOwnerInfo2.enterType);
        musicOwnerInfo2.followStatus = musicArtistStructV2.follow_status == null ? musicOwnerInfo2.followStatus : musicArtistStructV2.follow_status;
        return musicOwnerInfo2;
    }

    public static MusicAvatar com$ss$ugc$aweme$proto$MusicAvatarStructV2$$com$ss$android$ugc$aweme$music$model$MusicAvatar(MusicAvatarStructV2 musicAvatarStructV2, MusicAvatar musicAvatar) {
        if (musicAvatarStructV2 == null) {
            return musicAvatar;
        }
        MusicAvatar musicAvatar2 = new MusicAvatar();
        musicAvatar2.thumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicAvatarStructV2.thumb, musicAvatar2.thumb);
        musicAvatar2.thumbnail = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicAvatarStructV2.thumbnail, musicAvatar2.thumbnail);
        musicAvatar2.medium = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicAvatarStructV2.medium, musicAvatar2.medium);
        musicAvatar2.large = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicAvatarStructV2.large, musicAvatar2.large);
        musicAvatar2.hd = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicAvatarStructV2.hd, musicAvatar2.hd);
        return musicAvatar2;
    }

    public static MusicChorusInfo com$ss$ugc$aweme$proto$MusicChorusInfoStructV2$$com$ss$android$ugc$aweme$music$model$MusicChorusInfo(MusicChorusInfoStructV2 musicChorusInfoStructV2, MusicChorusInfo musicChorusInfo) {
        if (musicChorusInfoStructV2 == null) {
            return musicChorusInfo;
        }
        MusicChorusInfo musicChorusInfo2 = new MusicChorusInfo();
        musicChorusInfo2.startTime = a.a(musicChorusInfoStructV2.start_ms, musicChorusInfo2.startTime);
        musicChorusInfo2.duration = a.a(musicChorusInfoStructV2.duration_ms, musicChorusInfo2.duration);
        return musicChorusInfo2;
    }

    public static Dsp com$ss$ugc$aweme$proto$MusicDspStructV2$$com$ss$android$ugc$aweme$music$model$Dsp(MusicDspStructV2 musicDspStructV2, Dsp dsp) {
        if (musicDspStructV2 == null) {
            return dsp;
        }
        Dsp dsp2 = new Dsp();
        dsp2.fullClipId = musicDspStructV2.full_clip_id == null ? dsp2.fullClipId : musicDspStructV2.full_clip_id;
        dsp2.fullClipAuthor = musicDspStructV2.full_clip_author == null ? dsp2.fullClipAuthor : musicDspStructV2.full_clip_author;
        dsp2.fullClipTitle = musicDspStructV2.full_clip_title == null ? dsp2.fullClipTitle : musicDspStructV2.full_clip_title;
        dsp2.collectStatus = musicDspStructV2.collect_status == null ? dsp2.collectStatus : musicDspStructV2.collect_status;
        dsp2.defaultPerformerAvatar = com$ss$ugc$aweme$proto$MusicAvatarStructV2$$com$ss$android$ugc$aweme$music$model$MusicAvatar(musicDspStructV2.default_performer_avatar, dsp2.defaultPerformerAvatar);
        return dsp2;
    }

    public static MusicPerformer com$ss$ugc$aweme$proto$MusicPerformerStructV2$$com$ss$android$ugc$aweme$music$model$MusicPerformer(MusicPerformerStructV2 musicPerformerStructV2, MusicPerformer musicPerformer) {
        if (musicPerformerStructV2 == null) {
            return musicPerformer;
        }
        MusicPerformer musicPerformer2 = new MusicPerformer();
        musicPerformer2.id = musicPerformerStructV2.id == null ? musicPerformer2.id : musicPerformerStructV2.id;
        musicPerformer2.name = musicPerformerStructV2.name == null ? musicPerformer2.name : musicPerformerStructV2.name;
        musicPerformer2.avatar = com$ss$ugc$aweme$proto$MusicAvatarStructV2$$com$ss$android$ugc$aweme$music$model$MusicAvatar(musicPerformerStructV2.avatar, musicPerformer2.avatar);
        return musicPerformer2;
    }

    public static Music com$ss$ugc$aweme$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music(MusicStructV2 musicStructV2, Music music) {
        if (musicStructV2 == null) {
            return music;
        }
        Music music2 = new Music();
        music2.id = a.a(musicStructV2.id, music2.id);
        music2.idStr = musicStructV2.id_str == null ? music2.idStr : musicStructV2.id_str;
        music2.musicName = musicStructV2.title == null ? music2.musicName : musicStructV2.title;
        music2.authorName = musicStructV2.author == null ? music2.authorName : musicStructV2.author;
        music2.album = musicStructV2.album == null ? music2.album : musicStructV2.album;
        music2.coverLarge = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.cover_large, music2.coverLarge);
        music2.coverMedium = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.cover_medium, music2.coverMedium);
        music2.coverThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.cover_thumb, music2.coverThumb);
        music2.playUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.play_url, music2.playUrl);
        music2.duration = a.a(musicStructV2.duration, music2.duration);
        music2.extra = musicStructV2.extra == null ? music2.extra : musicStructV2.extra;
        music2.userCount = a.a(musicStructV2.user_count, music2.userCount);
        music2.positions = List$com$ss$ugc$aweme$proto$PositionStructV2$$List$com$ss$android$ugc$aweme$discover$model$Position(musicStructV2.position, music2.positions);
        music2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(musicStructV2.share_info, music2.shareInfo);
        music2.collectStatus = a.a(musicStructV2.collect_stat, music2.collectStatus);
        music2.musicStatus = a.a(musicStructV2.status, music2.musicStatus);
        music2.offlineDesc = musicStructV2.offline_desc == null ? music2.offlineDesc : musicStructV2.offline_desc;
        music2.effectsData = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.effects_data, music2.effectsData);
        music2.ownerId = musicStructV2.owner_id == null ? music2.ownerId : musicStructV2.owner_id;
        music2.ownerNickName = musicStructV2.owner_nickname == null ? music2.ownerNickName : musicStructV2.owner_nickname;
        music2.isOriginMusic = a.a(musicStructV2.is_original, music2.isOriginMusic);
        music2.challenge = com$ss$ugc$aweme$proto$ChallengeStructV2$$com$ss$android$ugc$aweme$discover$model$Challenge(musicStructV2.challenge, music2.challenge);
        music2.billboardRank = a.a(musicStructV2.billboard_rank, music2.billboardRank);
        music2.bindChallengeId = a.a(musicStructV2.binded_challenge_id, music2.bindChallengeId);
        music2.isAuthorDeleted = a.a(musicStructV2.author_deleted, music2.isAuthorDeleted);
        music2.ownerHandle = musicStructV2.owner_handle == null ? music2.ownerHandle : musicStructV2.owner_handle;
        music2.preventDownload = a.a(musicStructV2.prevent_download, music2.preventDownload);
        music2.strongBeatUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.strong_beat_url, music2.strongBeatUrl);
        music2.mExternalMusicInfos = List$com$ss$ugc$aweme$proto$ExternalSongStructV2$$List$com$ss$android$ugc$aweme$music$model$ExternalMusicInfo(musicStructV2.external_song_info, music2.mExternalMusicInfos);
        music2.secUid = musicStructV2.sec_uid == null ? music2.secUid : musicStructV2.sec_uid;
        music2.lrcType = a.a(musicStructV2.lyric_type, music2.lrcType);
        music2.lrcUrl = musicStructV2.lyric_url == null ? music2.lrcUrl : musicStructV2.lyric_url;
        music2.avatarThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.avatar_thumb, music2.avatarThumb);
        music2.previewStartTime = a.a(musicStructV2.preview_start_time, music2.previewStartTime);
        music2.muteShare = a.a(musicStructV2.mute_share, music2.muteShare);
        music2.isArtistMusic = a.a(musicStructV2.is_author_artist, music2.isArtistMusic);
        music2.isPgc = a.a(musicStructV2.is_pgc, music2.isPgc);
        music2.matchedPGCSoundInfo = com$ss$ugc$aweme$proto$MatchedPGCSoundStructV2$$com$ss$android$ugc$aweme$music$model$MatchedPGCSoundInfo(musicStructV2.matched_pgc_sound, music2.matchedPGCSoundInfo);
        music2.mMatchedSongInfo = com$ss$ugc$aweme$proto$MatchedSongStructV2$$com$ss$android$ugc$aweme$music$model$MatchedSoundInfo(musicStructV2.matched_song, music2.mMatchedSongInfo);
        music2.isCommercialMusic = a.a(musicStructV2.is_commerce_music, music2.isCommercialMusic);
        music2.mMusicOwnerInfos = List$com$ss$ugc$aweme$proto$MusicArtistStructV2$$List$com$ss$android$ugc$aweme$music$model$MusicOwnerInfo(musicStructV2.artists, music2.mMusicOwnerInfos);
        return music2;
    }

    public static MutualStruct com$ss$ugc$aweme$proto$MutualStructV2$$com$ss$android$ugc$aweme$friends$model$MutualStruct(MutualStructV2 mutualStructV2, MutualStruct mutualStruct) {
        if (mutualStructV2 == null) {
            return mutualStruct;
        }
        MutualStruct mutualStruct2 = new MutualStruct();
        mutualStruct2.mutualType = a.a(mutualStructV2.mutual_type, mutualStruct2.mutualType);
        mutualStruct2.userList = List$com$ss$ugc$aweme$proto$MutualUserStructV2$$List$com$ss$android$ugc$aweme$friends$model$MutualUser(mutualStructV2.user_list, mutualStruct2.userList);
        mutualStruct2.total = a.a(mutualStructV2.total, mutualStruct2.total);
        return mutualStruct2;
    }

    public static MutualUser com$ss$ugc$aweme$proto$MutualUserStructV2$$com$ss$android$ugc$aweme$friends$model$MutualUser(MutualUserStructV2 mutualUserStructV2, MutualUser mutualUser) {
        if (mutualUserStructV2 == null) {
            return mutualUser;
        }
        MutualUser mutualUser2 = new MutualUser();
        mutualUser2.secUid = mutualUserStructV2.sec_uid == null ? mutualUser2.secUid : mutualUserStructV2.sec_uid;
        mutualUser2.nickname = mutualUserStructV2.nickname == null ? mutualUser2.nickname : mutualUserStructV2.nickname;
        mutualUser2.avatarMedium = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(mutualUserStructV2.avatar_medium, mutualUser2.avatarMedium);
        return mutualUser2;
    }

    public static com.ss.android.ugc.aweme.sticker.model.g com$ss$ugc$aweme$proto$NewFaceStickerStructV2$$com$ss$android$ugc$aweme$sticker$model$NewFaceStickerBean(NewFaceStickerStructV2 newFaceStickerStructV2, com.ss.android.ugc.aweme.sticker.model.g gVar) {
        if (newFaceStickerStructV2 == null) {
            return gVar;
        }
        com.ss.android.ugc.aweme.sticker.model.g gVar2 = new com.ss.android.ugc.aweme.sticker.model.g();
        gVar2.id = newFaceStickerStructV2.id == null ? gVar2.id : newFaceStickerStructV2.id;
        gVar2.name = newFaceStickerStructV2.name == null ? gVar2.name : newFaceStickerStructV2.name;
        gVar2.children = newFaceStickerStructV2.children == null ? gVar2.children : newFaceStickerStructV2.children;
        gVar2.iconUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(newFaceStickerStructV2.icon_url, gVar2.iconUrl);
        gVar2.ownerId = newFaceStickerStructV2.owner_id == null ? gVar2.ownerId : newFaceStickerStructV2.owner_id;
        gVar2.ownerName = newFaceStickerStructV2.owner_nickname == null ? gVar2.ownerName : newFaceStickerStructV2.owner_nickname;
        gVar2.userCount = a.a(newFaceStickerStructV2.user_count, gVar2.userCount);
        gVar2.desc = newFaceStickerStructV2.desc == null ? gVar2.desc : newFaceStickerStructV2.desc;
        gVar2.effectId = newFaceStickerStructV2.effect_id == null ? gVar2.effectId : newFaceStickerStructV2.effect_id;
        gVar2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(newFaceStickerStructV2.share_info, gVar2.shareInfo);
        gVar2.isFavorite = a.a(newFaceStickerStructV2.is_favorite, gVar2.isFavorite);
        gVar2.commerceSticker = com$ss$ugc$aweme$proto$CommerceStickerStructV2$$com$ss$android$ugc$aweme$sticker$model$CommerceSticker(newFaceStickerStructV2.commerce_sticker, gVar2.commerceSticker);
        gVar2.mTags = newFaceStickerStructV2.tags == null ? gVar2.mTags : newFaceStickerStructV2.tags;
        gVar2.avatarThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(newFaceStickerStructV2.avatar_thumb, gVar2.avatarThumb);
        gVar2.viewCount = a.a(newFaceStickerStructV2.vv_count, gVar2.viewCount);
        gVar2.extra = newFaceStickerStructV2.extra == null ? gVar2.extra : newFaceStickerStructV2.extra;
        gVar2.mSecUid = newFaceStickerStructV2.sec_uid == null ? gVar2.mSecUid : newFaceStickerStructV2.sec_uid;
        return gVar2;
    }

    public static j com$ss$ugc$aweme$proto$OfflineInfoStructV2$$com$ss$android$ugc$aweme$commerce$OfflineInfo(OfflineInfoStructV2 offlineInfoStructV2, j jVar) {
        if (offlineInfoStructV2 == null) {
            return jVar;
        }
        j jVar2 = new j();
        jVar2.offlineInfoType = a.a(offlineInfoStructV2.offline_info_type, jVar2.offlineInfoType);
        jVar2.text = offlineInfoStructV2.text == null ? jVar2.text : offlineInfoStructV2.text;
        jVar2.action = offlineInfoStructV2.action == null ? jVar2.action : offlineInfoStructV2.action;
        return jVar2;
    }

    public static CaptionLanguage com$ss$ugc$aweme$proto$OriginalLanguageStructV2$$com$ss$android$ugc$aweme$feed$model$CaptionLanguage(OriginalLanguageStructV2 originalLanguageStructV2, CaptionLanguage captionLanguage) {
        if (originalLanguageStructV2 == null) {
            return captionLanguage;
        }
        CaptionLanguage captionLanguage2 = new CaptionLanguage();
        captionLanguage2.languageName = originalLanguageStructV2.lang == null ? captionLanguage2.languageName : originalLanguageStructV2.lang;
        captionLanguage2.languageId = a.a(originalLanguageStructV2.language_id, captionLanguage2.languageId);
        return captionLanguage2;
    }

    public static o com$ss$ugc$aweme$proto$OriginalMusicianStructV2$$com$ss$android$ugc$aweme$music$OriginalMusician(OriginalMusicianStructV2 originalMusicianStructV2, o oVar) {
        if (originalMusicianStructV2 == null) {
            return oVar;
        }
        o oVar2 = new o();
        oVar2.musicCount = a.a(originalMusicianStructV2.music_count, oVar2.musicCount);
        oVar2.musicUseCount = a.a(originalMusicianStructV2.music_used_count, oVar2.musicUseCount);
        oVar2.musicQrcodeUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(originalMusicianStructV2.music_qrcode_url, oVar2.musicQrcodeUrl);
        oVar2.musicCoverUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(originalMusicianStructV2.music_cover_url, oVar2.musicCoverUrl);
        oVar2.diggCount = a.a(originalMusicianStructV2.digg_count, oVar2.diggCount);
        return oVar2;
    }

    public static GeneralPermission com$ss$ugc$aweme$proto$PermissionStructV2$$com$ss$android$ugc$aweme$profile$model$GeneralPermission(PermissionStructV2 permissionStructV2, GeneralPermission generalPermission) {
        if (permissionStructV2 == null) {
            return generalPermission;
        }
        GeneralPermission generalPermission2 = new GeneralPermission();
        generalPermission2.mFollowToast = a.a(permissionStructV2.follow_toast, generalPermission2.mFollowToast);
        generalPermission2.mOriginalList = a.a(permissionStructV2.original_list, generalPermission2.mOriginalList);
        generalPermission2.mShopToast = a.a(permissionStructV2.shop_toast, generalPermission2.mShopToast);
        generalPermission2.mShareToast = a.a(permissionStructV2.share_toast, generalPermission2.mShareToast);
        return generalPermission2;
    }

    public static PlatformInfo com$ss$ugc$aweme$proto$PlatformSyncStatusStructV2$$com$ss$android$ugc$aweme$profile$model$PlatformInfo(PlatformSyncStatusStructV2 platformSyncStatusStructV2, PlatformInfo platformInfo) {
        if (platformSyncStatusStructV2 == null) {
            return platformInfo;
        }
        PlatformInfo platformInfo2 = new PlatformInfo();
        platformInfo2.patformName = platformSyncStatusStructV2.platform_name == null ? platformInfo2.patformName : platformSyncStatusStructV2.platform_name;
        platformInfo2.nickName = platformSyncStatusStructV2.nickname == null ? platformInfo2.nickName : platformSyncStatusStructV2.nickname;
        platformInfo2.fullSynced = a.a(platformSyncStatusStructV2.full_synced, platformInfo2.fullSynced);
        return platformInfo2;
    }

    public static PlayTokenAuth com$ss$ugc$aweme$proto$PlayTokenAuthStructV2$$com$ss$android$ugc$aweme$feed$model$video$PlayTokenAuth(PlayTokenAuthStructV2 playTokenAuthStructV2, PlayTokenAuth playTokenAuth) {
        if (playTokenAuthStructV2 == null) {
            return playTokenAuth;
        }
        PlayTokenAuth playTokenAuth2 = new PlayTokenAuth();
        playTokenAuth2.vid = playTokenAuthStructV2.vid == null ? playTokenAuth2.vid : playTokenAuthStructV2.vid;
        playTokenAuth2.token = playTokenAuthStructV2.token == null ? playTokenAuth2.token : playTokenAuthStructV2.token;
        playTokenAuth2.auth = playTokenAuthStructV2.auth == null ? playTokenAuth2.auth : playTokenAuthStructV2.auth;
        playTokenAuth2.hosts = playTokenAuthStructV2.hosts == null ? playTokenAuth2.hosts : playTokenAuthStructV2.hosts;
        return playTokenAuth2;
    }

    public static PlayListInfo com$ss$ugc$aweme$proto$PlaylistInfoV2$$com$ss$android$ugc$aweme$feed$model$PlayListInfo(PlaylistInfoV2 playlistInfoV2, PlayListInfo playListInfo) {
        if (playlistInfoV2 == null) {
            return playListInfo;
        }
        PlayListInfo playListInfo2 = new PlayListInfo();
        playListInfo2.mixId = playlistInfoV2.mix_id == null ? playListInfo2.mixId : playlistInfoV2.mix_id;
        playListInfo2.mixName = playlistInfoV2.name == null ? playListInfo2.mixName : playlistInfoV2.name;
        playListInfo2.index = playlistInfoV2.index == null ? playListInfo2.index : playlistInfoV2.index;
        playListInfo2.icon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(playlistInfoV2.icon, playListInfo2.icon);
        playListInfo2.itemTotal = playlistInfoV2.item_total == null ? playListInfo2.itemTotal : playlistInfoV2.item_total;
        return playListInfo2;
    }

    public static Position com$ss$ugc$aweme$proto$PositionStructV2$$com$ss$android$ugc$aweme$discover$model$Position(PositionStructV2 positionStructV2, Position position) {
        if (positionStructV2 == null) {
            return position;
        }
        Position position2 = new Position();
        position2.begin = a.a(positionStructV2.begin, position2.begin);
        position2.end = a.a(positionStructV2.end, position2.end);
        return position2;
    }

    public static Preload com$ss$ugc$aweme$proto$PreloadStructV2$$com$ss$android$ugc$aweme$feed$model$Preload(PreloadStructV2 preloadStructV2, Preload preload) {
        if (preloadStructV2 == null) {
            return preload;
        }
        Preload preload2 = new Preload();
        preload2.commentPreload = a.a(preloadStructV2.comment, preload2.commentPreload);
        preload2.profilePreload = a.a(preloadStructV2.profile, preload2.profilePreload);
        preload2.commentPro = a.a(preloadStructV2.comment_pro, preload2.commentPro);
        preload2.profilePro = a.a(preloadStructV2.profile_pro, preload2.profilePro);
        preload2.commentThres = a.a(preloadStructV2.comment_thres, preload2.commentThres);
        preload2.profileThres = a.a(preloadStructV2.profile_thres, preload2.profileThres);
        preload2.commentMedianTime = a.a(preloadStructV2.comment_median_time, preload2.commentMedianTime);
        preload2.profileMedianTime = a.a(preloadStructV2.profile_median_time, preload2.profileMedianTime);
        preload2.modelV2 = a.a(preloadStructV2.model_v2, preload2.modelV2);
        preload2.predictConfig = preloadStructV2.predict_config == null ? preload2.predictConfig : preloadStructV2.predict_config;
        return preload2;
    }

    public static ProfileBadgeStruct com$ss$ugc$aweme$proto$ProfileBadgeStructV2$$com$ss$android$ugc$aweme$profile$model$ProfileBadgeStruct(ProfileBadgeStructV2 profileBadgeStructV2, ProfileBadgeStruct profileBadgeStruct) {
        if (profileBadgeStructV2 == null) {
            return profileBadgeStruct;
        }
        ProfileBadgeStruct profileBadgeStruct2 = new ProfileBadgeStruct();
        profileBadgeStruct2.id = a.a(profileBadgeStructV2.id, profileBadgeStruct2.id);
        profileBadgeStruct2.name = profileBadgeStructV2.name == null ? profileBadgeStruct2.name : profileBadgeStructV2.name;
        profileBadgeStruct2.description = profileBadgeStructV2.description == null ? profileBadgeStruct2.description : profileBadgeStructV2.description;
        profileBadgeStruct2.url = profileBadgeStructV2.url == null ? profileBadgeStruct2.url : profileBadgeStructV2.url;
        profileBadgeStruct2.shouldShow = a.a(profileBadgeStructV2.should_show, profileBadgeStruct2.shouldShow);
        return profileBadgeStruct2;
    }

    public static QuestionInfo com$ss$ugc$aweme$proto$QuestionInfoV2$$com$ss$android$ugc$aweme$question$QuestionInfo(QuestionInfoV2 questionInfoV2, QuestionInfo questionInfo) {
        if (questionInfoV2 == null) {
            return questionInfo;
        }
        QuestionInfo questionInfo2 = new QuestionInfo();
        questionInfo2.f119889a = questionInfoV2.id == null ? questionInfo2.f119889a : questionInfoV2.id;
        questionInfo2.f119890b = questionInfoV2.item_id == null ? questionInfo2.f119890b : questionInfoV2.item_id;
        questionInfo2.f119891c = questionInfoV2.user_id == null ? questionInfo2.f119891c : questionInfoV2.user_id;
        questionInfo2.f119892d = questionInfoV2.username == null ? questionInfo2.f119892d : questionInfoV2.username;
        questionInfo2.f119893e = questionInfoV2.content == null ? questionInfo2.f119893e : questionInfoV2.content;
        questionInfo2.f119894f = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(questionInfoV2.user_avatar, questionInfo2.f119894f);
        return questionInfo2;
    }

    public static QaStruct com$ss$ugc$aweme$proto$QuestionStickerStructV2$$com$ss$android$ugc$aweme$sticker$data$QaStruct(QuestionStickerStructV2 questionStickerStructV2, QaStruct qaStruct) {
        if (questionStickerStructV2 == null) {
            return qaStruct;
        }
        QaStruct qaStruct2 = new QaStruct();
        qaStruct2.questionId = a.a(questionStickerStructV2.question_id, qaStruct2.questionId);
        qaStruct2.userId = a.a(questionStickerStructV2.user_id, qaStruct2.userId);
        qaStruct2.itemId = a.a(questionStickerStructV2.item_id, qaStruct2.itemId);
        qaStruct2.questionContent = questionStickerStructV2.content == null ? qaStruct2.questionContent : questionStickerStructV2.content;
        qaStruct2.userName = questionStickerStructV2.username == null ? qaStruct2.userName : questionStickerStructV2.username;
        qaStruct2.avatarUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(questionStickerStructV2.user_avatar, qaStruct2.avatarUrl);
        qaStruct2.secId = questionStickerStructV2.sec_uid == null ? qaStruct2.secId : questionStickerStructV2.sec_uid;
        return qaStruct2;
    }

    public static QuickShopSecondFloorInfo com$ss$ugc$aweme$proto$QuickShopSecondFloorV2$$com$ss$android$ugc$aweme$profile$model$QuickShopSecondFloorInfo(QuickShopSecondFloorV2 quickShopSecondFloorV2, QuickShopSecondFloorInfo quickShopSecondFloorInfo) {
        if (quickShopSecondFloorV2 == null) {
            return quickShopSecondFloorInfo;
        }
        QuickShopSecondFloorInfo quickShopSecondFloorInfo2 = new QuickShopSecondFloorInfo();
        quickShopSecondFloorInfo2.processText = quickShopSecondFloorV2.process_text == null ? quickShopSecondFloorInfo2.processText : quickShopSecondFloorV2.process_text;
        quickShopSecondFloorInfo2.enterText = quickShopSecondFloorV2.enter_text == null ? quickShopSecondFloorInfo2.enterText : quickShopSecondFloorV2.enter_text;
        quickShopSecondFloorInfo2.transBgText = quickShopSecondFloorV2.trans_bg_text == null ? quickShopSecondFloorInfo2.transBgText : quickShopSecondFloorV2.trans_bg_text;
        return quickShopSecondFloorInfo2;
    }

    public static QuickShopInfo com$ss$ugc$aweme$proto$QuickShopStructV2$$com$ss$android$ugc$aweme$profile$model$QuickShopInfo(QuickShopStructV2 quickShopStructV2, QuickShopInfo quickShopInfo) {
        if (quickShopStructV2 == null) {
            return quickShopInfo;
        }
        QuickShopInfo quickShopInfo2 = new QuickShopInfo();
        quickShopInfo2.quickShopUrl = quickShopStructV2.quick_shop_url == null ? quickShopInfo2.quickShopUrl : quickShopStructV2.quick_shop_url;
        quickShopInfo2.quickShopName = quickShopStructV2.quick_shop_name == null ? quickShopInfo2.quickShopName : quickShopStructV2.quick_shop_name;
        quickShopInfo2.withTextEntry = a.a(quickShopStructV2.with_text_entry, quickShopInfo2.withTextEntry);
        quickShopInfo2.secondFloorInfo = com$ss$ugc$aweme$proto$QuickShopSecondFloorV2$$com$ss$android$ugc$aweme$profile$model$QuickShopSecondFloorInfo(quickShopStructV2.second_floor_info, quickShopInfo2.secondFloorInfo);
        return quickShopInfo2;
    }

    public static RocketFansGroupInfo com$ss$ugc$aweme$proto$RFansGroupInfoV2$$com$ss$android$ugc$aweme$base$share$RocketFansGroupInfo(RFansGroupInfoV2 rFansGroupInfoV2, RocketFansGroupInfo rocketFansGroupInfo) {
        if (rFansGroupInfoV2 == null) {
            return rocketFansGroupInfo;
        }
        RocketFansGroupInfo rocketFansGroupInfo2 = new RocketFansGroupInfo();
        rocketFansGroupInfo2.schema = rFansGroupInfoV2.schema == null ? rocketFansGroupInfo2.schema : rFansGroupInfoV2.schema;
        rocketFansGroupInfo2.token = rFansGroupInfoV2.token == null ? rocketFansGroupInfo2.token : rFansGroupInfoV2.token;
        rocketFansGroupInfo2.downloadUrl = rFansGroupInfoV2.download_url == null ? rocketFansGroupInfo2.downloadUrl : rFansGroupInfoV2.download_url;
        return rocketFansGroupInfo2;
    }

    public static RecommendAwemeItem com$ss$ugc$aweme$proto$RecommendItemStructV2$$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem(RecommendItemStructV2 recommendItemStructV2, RecommendAwemeItem recommendAwemeItem) {
        if (recommendItemStructV2 == null) {
            return recommendAwemeItem;
        }
        RecommendAwemeItem recommendAwemeItem2 = new RecommendAwemeItem();
        recommendAwemeItem2.aid = recommendItemStructV2.aweme_id == null ? recommendAwemeItem2.aid : recommendItemStructV2.aweme_id;
        recommendAwemeItem2.cover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(recommendItemStructV2.cover, recommendAwemeItem2.cover);
        recommendAwemeItem2.dynamicCover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(recommendItemStructV2.dynamic_cover, recommendAwemeItem2.dynamicCover);
        recommendAwemeItem2.mediaType = a.a(recommendItemStructV2.media_type, recommendAwemeItem2.mediaType);
        return recommendAwemeItem2;
    }

    public static RelationLabelNew com$ss$ugc$aweme$proto$RelationLabelStructV2$$com$ss$android$ugc$aweme$feed$model$RelationLabelNew(RelationLabelStructV2 relationLabelStructV2, RelationLabelNew relationLabelNew) {
        if (relationLabelStructV2 == null) {
            return relationLabelNew;
        }
        RelationLabelNew relationLabelNew2 = new RelationLabelNew();
        relationLabelNew2.userList = List$com$ss$ugc$aweme$proto$RelativeUserStructV2$$List$com$ss$android$ugc$aweme$feed$model$RelationLabelUser(relationLabelStructV2.user_list, relationLabelNew2.userList);
        relationLabelNew2.type = relationLabelStructV2.type == null ? relationLabelNew2.type : relationLabelStructV2.type;
        relationLabelNew2.extra = g.a(relationLabelStructV2.extra, relationLabelNew2.extra);
        return relationLabelNew2;
    }

    public static AwemeRelationRecommendModel com$ss$ugc$aweme$proto$RelationRecommendStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeRelationRecommendModel(RelationRecommendStructV2 relationRecommendStructV2, AwemeRelationRecommendModel awemeRelationRecommendModel) {
        if (relationRecommendStructV2 == null) {
            return awemeRelationRecommendModel;
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel2 = new AwemeRelationRecommendModel();
        awemeRelationRecommendModel2.recommendType = a.a(relationRecommendStructV2.recommend_type, awemeRelationRecommendModel2.recommendType);
        awemeRelationRecommendModel2.relationTextKey = relationRecommendStructV2.relation_text_key == null ? awemeRelationRecommendModel2.relationTextKey : relationRecommendStructV2.relation_text_key;
        awemeRelationRecommendModel2.recType = relationRecommendStructV2.rec_type == null ? awemeRelationRecommendModel2.recType : relationRecommendStructV2.rec_type;
        awemeRelationRecommendModel2.friendTypeStr = relationRecommendStructV2.friend_type_str == null ? awemeRelationRecommendModel2.friendTypeStr : relationRecommendStructV2.friend_type_str;
        return awemeRelationRecommendModel2;
    }

    public static RelationLabelUser com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$feed$model$RelationLabelUser(RelativeUserStructV2 relativeUserStructV2, RelationLabelUser relationLabelUser) {
        if (relativeUserStructV2 == null) {
            return relationLabelUser;
        }
        RelationLabelUser relationLabelUser2 = new RelationLabelUser();
        relationLabelUser2.uid = a.a(relativeUserStructV2.uid, relationLabelUser2.uid);
        relationLabelUser2.avatarLarger = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(relativeUserStructV2.avatar, relationLabelUser2.avatarLarger);
        relationLabelUser2.nickName = relativeUserStructV2.nickname == null ? relationLabelUser2.nickName : relativeUserStructV2.nickname;
        relationLabelUser2.remarkName = relativeUserStructV2.remark_name == null ? relationLabelUser2.remarkName : relativeUserStructV2.remark_name;
        relationLabelUser2.avatarThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(relativeUserStructV2.avatar_thumb, relationLabelUser2.avatarThumb);
        relationLabelUser2.followStatus = a.a(relativeUserStructV2.follow_status, relationLabelUser2.followStatus);
        relationLabelUser2.secUid = relativeUserStructV2.sec_uid == null ? relationLabelUser2.secUid : relativeUserStructV2.sec_uid;
        return relationLabelUser2;
    }

    public static RelativeUserInfo com$ss$ugc$aweme$proto$RelativeUserStructV2$$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo(RelativeUserStructV2 relativeUserStructV2, RelativeUserInfo relativeUserInfo) {
        if (relativeUserStructV2 == null) {
            return relativeUserInfo;
        }
        RelativeUserInfo relativeUserInfo2 = new RelativeUserInfo();
        relativeUserInfo2.uid = a.a(relativeUserStructV2.uid, relativeUserInfo2.uid);
        relativeUserInfo2.avatar = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(relativeUserStructV2.avatar, relativeUserInfo2.avatar);
        return relativeUserInfo2;
    }

    public static ShareInfo com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(ShareStructV2 shareStructV2, ShareInfo shareInfo) {
        if (shareStructV2 == null) {
            return shareInfo;
        }
        ShareInfo shareInfo2 = new ShareInfo();
        shareInfo2.shareUrl = shareStructV2.share_url == null ? shareInfo2.shareUrl : shareStructV2.share_url;
        shareInfo2.shareDesc = shareStructV2.share_desc == null ? shareInfo2.shareDesc : shareStructV2.share_desc;
        shareInfo2.shareTitle = shareStructV2.share_title == null ? shareInfo2.shareTitle : shareStructV2.share_title;
        shareInfo2.qrCodeUrls = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(shareStructV2.share_qrcode_url, shareInfo2.qrCodeUrls);
        shareInfo2.goodsManagerUrl = shareStructV2.manage_goods_url == null ? shareInfo2.goodsManagerUrl : shareStructV2.manage_goods_url;
        shareInfo2.imageUrls = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(shareStructV2.share_image_url, shareInfo2.imageUrls);
        shareInfo2.boolPersist = a.a(shareStructV2.bool_persist, shareInfo2.boolPersist);
        shareInfo2.goodsRecUrl = shareStructV2.goods_rec_url == null ? shareInfo2.goodsRecUrl : shareStructV2.goods_rec_url;
        shareInfo2.shareTitleMyself = shareStructV2.share_title_myself == null ? shareInfo2.shareTitleMyself : shareStructV2.share_title_myself;
        shareInfo2.shareTitleOther = shareStructV2.share_title_other == null ? shareInfo2.shareTitleOther : shareStructV2.share_title_other;
        shareInfo2.shareLinkDesc = shareStructV2.share_link_desc == null ? shareInfo2.shareLinkDesc : shareStructV2.share_link_desc;
        shareInfo2.shareSignatureUrl = shareStructV2.share_signature_url == null ? shareInfo2.shareSignatureUrl : shareStructV2.share_signature_url;
        shareInfo2.shareSignatureDesc = shareStructV2.share_signature_desc == null ? shareInfo2.shareSignatureDesc : shareStructV2.share_signature_desc;
        shareInfo2.shareQuote = shareStructV2.share_quote == null ? shareInfo2.shareQuote : shareStructV2.share_quote;
        shareInfo2.whatsappShareDesc = shareStructV2.whatsapp_desc == null ? shareInfo2.whatsappShareDesc : shareStructV2.whatsapp_desc;
        shareInfo2.shareDescInfo = shareStructV2.share_desc_info == null ? shareInfo2.shareDescInfo : shareStructV2.share_desc_info;
        return shareInfo2;
    }

    public static ShareStruct com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$feed$model$live$ShareStruct(ShareStructV2 shareStructV2, ShareStruct shareStruct) {
        if (shareStructV2 == null) {
            return shareStruct;
        }
        ShareStruct shareStruct2 = new ShareStruct();
        shareStruct2.shareUrl = shareStructV2.share_url == null ? shareStruct2.shareUrl : shareStructV2.share_url;
        shareStruct2.shareWeiboDesc = shareStructV2.share_weibo_desc == null ? shareStruct2.shareWeiboDesc : shareStructV2.share_weibo_desc;
        shareStruct2.shareDesc = shareStructV2.share_desc == null ? shareStruct2.shareDesc : shareStructV2.share_desc;
        shareStruct2.shareTitle = shareStructV2.share_title == null ? shareStruct2.shareTitle : shareStructV2.share_title;
        shareStruct2.shareQrcodeUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(shareStructV2.share_qrcode_url, shareStruct2.shareQrcodeUrl);
        shareStruct2.boolPersist = a.a(shareStructV2.bool_persist, shareStruct2.boolPersist);
        shareStruct2.shareLinkDesc = shareStructV2.share_link_desc == null ? shareStruct2.shareLinkDesc : shareStructV2.share_link_desc;
        return shareStruct2;
    }

    public static com.ss.android.ugc.aweme.commercialize.feed.timegap.c com$ss$ugc$aweme$proto$ShowTimeGapRspInfo$$com$ss$android$ugc$aweme$commercialize$feed$timegap$AdShowTimeGapResponse(ShowTimeGapRspInfo showTimeGapRspInfo, com.ss.android.ugc.aweme.commercialize.feed.timegap.c cVar) {
        if (showTimeGapRspInfo == null) {
            return cVar;
        }
        com.ss.android.ugc.aweme.commercialize.feed.timegap.c cVar2 = new com.ss.android.ugc.aweme.commercialize.feed.timegap.c();
        cVar2.isEnableGapAdjust = a.a(showTimeGapRspInfo.enable_client_adgap_adjust, cVar2.isEnableGapAdjust);
        cVar2.isEnableFastBrowseAdjust = a.a(showTimeGapRspInfo.enable_fast_browse, cVar2.isEnableFastBrowseAdjust);
        cVar2.isEnableShowTimeGap = a.a(showTimeGapRspInfo.enable_showtime_gap, cVar2.isEnableShowTimeGap);
        cVar2.downstreamRange = a.a(showTimeGapRspInfo.downstream_range_end, cVar2.downstreamRange);
        cVar2.deltaGapTimeMap = showTimeGapRspInfo.adgap_delta_by_time == null ? cVar2.deltaGapTimeMap : showTimeGapRspInfo.adgap_delta_by_time;
        cVar2.isUserFastBrowseModel = a.a(showTimeGapRspInfo.use_fast_browse_model, cVar2.isUserFastBrowseModel);
        cVar2.viewVidNumForFastBrowse = a.a(showTimeGapRspInfo.viewed_vid_num, cVar2.viewVidNumForFastBrowse);
        cVar2.singleVidViewTime = a.a(showTimeGapRspInfo.single_vid_view_time, cVar2.singleVidViewTime);
        cVar2.fastBrowseTimeThreshold = a.a(showTimeGapRspInfo.fast_browse_time_threshold, cVar2.fastBrowseTimeThreshold);
        cVar2.minGap = a.a(showTimeGapRspInfo.min_gap, cVar2.minGap);
        return cVar2;
    }

    public static User com$ss$ugc$aweme$proto$SimpleUserStructV2$$com$ss$android$ugc$aweme$profile$model$User(SimpleUserStructV2 simpleUserStructV2, User user) {
        if (simpleUserStructV2 == null) {
            return user;
        }
        User user2 = new User();
        user2.uid = simpleUserStructV2.uid == null ? user2.uid : simpleUserStructV2.uid;
        user2.nickname = simpleUserStructV2.nickname == null ? user2.nickname : simpleUserStructV2.nickname;
        user2.signature = simpleUserStructV2.signature == null ? user2.signature : simpleUserStructV2.signature;
        user2.avatarThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(simpleUserStructV2.avatar_thumb, user2.avatarThumb);
        user2.followStatus = a.a(simpleUserStructV2.follow_status, user2.followStatus);
        user2.userRate = a.a(simpleUserStructV2.user_rate, user2.userRate);
        user2.avatarLarger = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(simpleUserStructV2.avatar_larger, user2.avatarLarger);
        user2.uniqueId = simpleUserStructV2.unique_id == null ? user2.uniqueId : simpleUserStructV2.unique_id;
        user2.secUid = simpleUserStructV2.sec_uid == null ? user2.secUid : simpleUserStructV2.sec_uid;
        return user2;
    }

    public static SpecialSticker com$ss$ugc$aweme$proto$SpecialStickerStructV2$$com$ss$android$ugc$aweme$feed$model$SpecialSticker(SpecialStickerStructV2 specialStickerStructV2, SpecialSticker specialSticker) {
        if (specialStickerStructV2 == null) {
            return specialSticker;
        }
        SpecialSticker specialSticker2 = new SpecialSticker();
        specialSticker2.stickerType = a.a(specialStickerStructV2.sticker_type, specialSticker2.stickerType);
        specialSticker2.linkUrl = specialStickerStructV2.link == null ? specialSticker2.linkUrl : specialStickerStructV2.link;
        specialSticker2.title = specialStickerStructV2.title == null ? specialSticker2.title : specialStickerStructV2.title;
        specialSticker2.stickerId = specialStickerStructV2.sticker_id == null ? specialSticker2.stickerId : specialStickerStructV2.sticker_id;
        specialSticker2.iconUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(specialStickerStructV2.icon_url, specialSticker2.iconUrl);
        specialSticker2.openUrl = specialStickerStructV2.open_url == null ? specialSticker2.openUrl : specialStickerStructV2.open_url;
        return specialSticker2;
    }

    public static Story com$ss$ugc$aweme$proto$StoryMetadataV2$$com$ss$android$ugc$aweme$feed$model$story$Story(StoryMetadataV2 storyMetadataV2, Story story) {
        if (storyMetadataV2 == null) {
            return story;
        }
        Story story2 = new Story();
        story2.expiredAt = a.a(storyMetadataV2.expired_at, story2.expiredAt);
        story2.viewed = a.a(storyMetadataV2.viewed, story2.viewed);
        story2.totalComments = a.a(storyMetadataV2.total_comments, story2.totalComments);
        story2.isOfficial = a.a(storyMetadataV2.is_official, story2.isOfficial);
        story2.viewerCount = a.a(storyMetadataV2.viewer_count, story2.viewerCount);
        story2.chatDisable = a.a(storyMetadataV2.chat_disabled, story2.chatDisable);
        return story2;
    }

    public static StreamUrlStruct com$ss$ugc$aweme$proto$StreamUrlStructV2$$com$ss$android$ugc$aweme$feed$model$live$StreamUrlStruct(StreamUrlStructV2 streamUrlStructV2, StreamUrlStruct streamUrlStruct) {
        if (streamUrlStructV2 == null) {
            return streamUrlStruct;
        }
        StreamUrlStruct streamUrlStruct2 = new StreamUrlStruct();
        streamUrlStruct2.sid = a.a(streamUrlStructV2.sid, streamUrlStruct2.sid);
        streamUrlStruct2.rtmp_pull_url = streamUrlStructV2.rtmp_pull_url == null ? streamUrlStruct2.rtmp_pull_url : streamUrlStructV2.rtmp_pull_url;
        streamUrlStruct2.rtmp_push_url = streamUrlStructV2.rtmp_push_url == null ? streamUrlStruct2.rtmp_push_url : streamUrlStructV2.rtmp_push_url;
        streamUrlStruct2.provider = a.a(streamUrlStructV2.provider, streamUrlStruct2.provider);
        return streamUrlStruct2;
    }

    public static AwemeActivityContent com$ss$ugc$aweme$proto$TextContentStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeActivityContent(TextContentStructV2 textContentStructV2, AwemeActivityContent awemeActivityContent) {
        if (textContentStructV2 == null) {
            return awemeActivityContent;
        }
        AwemeActivityContent awemeActivityContent2 = new AwemeActivityContent();
        awemeActivityContent2.text = textContentStructV2.text == null ? awemeActivityContent2.text : textContentStructV2.text;
        awemeActivityContent2.color = textContentStructV2.color == null ? awemeActivityContent2.color : textContentStructV2.color;
        awemeActivityContent2.size = textContentStructV2.size == null ? awemeActivityContent2.size : textContentStructV2.size;
        return awemeActivityContent2;
    }

    public static TextExtraStruct com$ss$ugc$aweme$proto$TextExtraStructV2$$com$ss$android$ugc$aweme$model$TextExtraStruct(TextExtraStructV2 textExtraStructV2, TextExtraStruct textExtraStruct) {
        if (textExtraStructV2 == null) {
            return textExtraStruct;
        }
        TextExtraStruct textExtraStruct2 = new TextExtraStruct();
        textExtraStruct2.start = a.a(textExtraStructV2.start, textExtraStruct2.start);
        textExtraStruct2.end = a.a(textExtraStructV2.end, textExtraStruct2.end);
        textExtraStruct2.userId = textExtraStructV2.user_id == null ? textExtraStruct2.userId : textExtraStructV2.user_id;
        textExtraStruct2.type = a.a(textExtraStructV2.type, textExtraStruct2.type);
        textExtraStruct2.hashTagName = textExtraStructV2.hashtag_name == null ? textExtraStruct2.hashTagName : textExtraStructV2.hashtag_name;
        textExtraStruct2.cid = textExtraStructV2.hashtag_id == null ? textExtraStruct2.cid : textExtraStructV2.hashtag_id;
        textExtraStruct2.isCommerce = a.a(textExtraStructV2.is_commerce, textExtraStruct2.isCommerce);
        textExtraStruct2.mSecUid = textExtraStructV2.sec_uid == null ? textExtraStruct2.mSecUid : textExtraStructV2.sec_uid;
        textExtraStruct2.awemeId = textExtraStructV2.aweme_id == null ? textExtraStruct2.awemeId : textExtraStructV2.aweme_id;
        textExtraStruct2.subType = a.a(textExtraStructV2.sub_type, textExtraStruct2.subType);
        textExtraStruct2.lineIndex = a.a(textExtraStructV2.line_idx, textExtraStruct2.lineIndex);
        return textExtraStruct2;
    }

    public static AwemeTrendingBar com$ss$ugc$aweme$proto$TrendingBarForYouPageStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTrendingBar(TrendingBarForYouPageStructV2 trendingBarForYouPageStructV2, AwemeTrendingBar awemeTrendingBar) {
        if (trendingBarForYouPageStructV2 == null) {
            return awemeTrendingBar;
        }
        AwemeTrendingBar awemeTrendingBar2 = new AwemeTrendingBar();
        awemeTrendingBar2.iconUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(trendingBarForYouPageStructV2.icon_url, awemeTrendingBar2.iconUrl);
        awemeTrendingBar2.display = trendingBarForYouPageStructV2.display == null ? awemeTrendingBar2.display : trendingBarForYouPageStructV2.display;
        awemeTrendingBar2.schema = trendingBarForYouPageStructV2.schema == null ? awemeTrendingBar2.schema : trendingBarForYouPageStructV2.schema;
        awemeTrendingBar2.eventKeywordId = a.a(trendingBarForYouPageStructV2.event_keyword_id, awemeTrendingBar2.eventKeywordId);
        awemeTrendingBar2.eventKeyword = trendingBarForYouPageStructV2.event_keyword == null ? awemeTrendingBar2.eventKeyword : trendingBarForYouPageStructV2.event_keyword;
        awemeTrendingBar2.eventTrackingParam = trendingBarForYouPageStructV2.event_tracking_param == null ? awemeTrendingBar2.eventTrackingParam : trendingBarForYouPageStructV2.event_tracking_param;
        return awemeTrendingBar2;
    }

    public static AwemeTrendingBar com$ss$ugc$aweme$proto$TrendingBarStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTrendingBar(TrendingBarStructV2 trendingBarStructV2, AwemeTrendingBar awemeTrendingBar) {
        if (trendingBarStructV2 == null) {
            return awemeTrendingBar;
        }
        AwemeTrendingBar awemeTrendingBar2 = new AwemeTrendingBar();
        awemeTrendingBar2.iconUrl = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(trendingBarStructV2.icon_url, awemeTrendingBar2.iconUrl);
        awemeTrendingBar2.display = trendingBarStructV2.display == null ? awemeTrendingBar2.display : trendingBarStructV2.display;
        awemeTrendingBar2.schema = trendingBarStructV2.schema == null ? awemeTrendingBar2.schema : trendingBarStructV2.schema;
        awemeTrendingBar2.eventKeywordId = a.a(trendingBarStructV2.event_keyword_id, awemeTrendingBar2.eventKeywordId);
        awemeTrendingBar2.eventKeyword = trendingBarStructV2.event_keyword == null ? awemeTrendingBar2.eventKeyword : trendingBarStructV2.event_keyword;
        awemeTrendingBar2.eventTrackingParam = trendingBarStructV2.event_tracking_param == null ? awemeTrendingBar2.eventTrackingParam : trendingBarStructV2.event_tracking_param;
        return awemeTrendingBar2;
    }

    public static TtsInfos com$ss$ugc$aweme$proto$TtsAudioStructV2$$com$ss$android$ugc$aweme$feed$model$TtsInfos(TtsAudioStructV2 ttsAudioStructV2, TtsInfos ttsInfos) {
        if (ttsAudioStructV2 == null) {
            return ttsInfos;
        }
        TtsInfos ttsInfos2 = new TtsInfos();
        ttsInfos2.lang = ttsAudioStructV2.lang == null ? ttsInfos2.lang : ttsAudioStructV2.lang;
        ttsInfos2.languageId = ttsAudioStructV2.language_id == null ? ttsInfos2.languageId : ttsAudioStructV2.language_id;
        ttsInfos2.voiceType = ttsAudioStructV2.voice_type == null ? ttsInfos2.voiceType : ttsAudioStructV2.voice_type;
        ttsInfos2.playAddress = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$PlayAddress(ttsAudioStructV2.play_addr, ttsInfos2.playAddress);
        ttsInfos2.volumeInfo = ttsAudioStructV2.volume_info == null ? ttsInfos2.volumeInfo : ttsAudioStructV2.volume_info;
        return ttsInfos2;
    }

    public static UpvoteReason com$ss$ugc$aweme$proto$UpvoteReasonV2$$com$ss$android$ugc$aweme$feed$model$upvote$UpvoteReason(UpvoteReasonV2 upvoteReasonV2, UpvoteReason upvoteReason) {
        if (upvoteReasonV2 == null) {
            return upvoteReason;
        }
        UpvoteReason upvoteReason2 = new UpvoteReason();
        upvoteReason2.reasonType = upvoteReasonV2.reason_type == null ? upvoteReason2.reasonType : upvoteReasonV2.reason_type;
        upvoteReason2.subType = upvoteReasonV2.sub_type == null ? upvoteReason2.subType : upvoteReasonV2.sub_type;
        upvoteReason2.middleInfo = List$java$lang$Long$$ArrayJ(upvoteReasonV2.middle_info, upvoteReason2.middleInfo);
        upvoteReason2.middleCount = upvoteReasonV2.middle_count == null ? upvoteReason2.middleCount : upvoteReasonV2.middle_count;
        upvoteReason2.userId = a.a(upvoteReasonV2.user_id, upvoteReason2.userId);
        upvoteReason2.itemId = a.a(upvoteReasonV2.item_id, upvoteReason2.itemId);
        return upvoteReason2;
    }

    public static UrlModel com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(UrlStructV2 urlStructV2, UrlModel urlModel) {
        if (urlStructV2 == null) {
            return urlModel;
        }
        UrlModel urlModel2 = new UrlModel();
        urlModel2.uri = urlStructV2.uri == null ? urlModel2.uri : urlStructV2.uri;
        urlModel2.urlList = urlStructV2.url_list == null ? urlModel2.urlList : urlStructV2.url_list;
        urlModel2.width = a.a(urlStructV2.width, urlModel2.width);
        urlModel2.height = a.a(urlStructV2.height, urlModel2.height);
        urlModel2.urlKey = urlStructV2.url_key == null ? urlModel2.urlKey : urlStructV2.url_key;
        urlModel2.size = a.a(urlStructV2.data_size, urlModel2.size);
        urlModel2.fileHash = urlStructV2.file_hash == null ? urlModel2.fileHash : urlStructV2.file_hash;
        return urlModel2;
    }

    public static PlayAddress com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$PlayAddress(UrlStructV2 urlStructV2, PlayAddress playAddress) {
        if (urlStructV2 == null) {
            return playAddress;
        }
        PlayAddress playAddress2 = new PlayAddress();
        playAddress2.uri = urlStructV2.uri == null ? playAddress2.uri : urlStructV2.uri;
        playAddress2.urlList = urlStructV2.url_list == null ? playAddress2.urlList : urlStructV2.url_list;
        playAddress2.width = urlStructV2.width == null ? playAddress2.width : urlStructV2.width;
        playAddress2.height = urlStructV2.height == null ? playAddress2.height : urlStructV2.height;
        playAddress2.urlKey = urlStructV2.url_key == null ? playAddress2.urlKey : urlStructV2.url_key;
        playAddress2.dataSize = urlStructV2.data_size == null ? playAddress2.dataSize : urlStructV2.data_size;
        playAddress2.fileHash = urlStructV2.file_hash == null ? playAddress2.fileHash : urlStructV2.file_hash;
        playAddress2.fileCS = urlStructV2.file_cs == null ? playAddress2.fileCS : urlStructV2.file_cs;
        playAddress2.playerAccessKey = urlStructV2.player_access_key == null ? playAddress2.playerAccessKey : urlStructV2.player_access_key;
        return playAddress2;
    }

    public static VideoUrlModel com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(UrlStructV2 urlStructV2, VideoUrlModel videoUrlModel) {
        if (urlStructV2 == null) {
            return videoUrlModel;
        }
        VideoUrlModel videoUrlModel2 = new VideoUrlModel();
        videoUrlModel2.uri = urlStructV2.uri == null ? videoUrlModel2.uri : urlStructV2.uri;
        videoUrlModel2.urlList = urlStructV2.url_list == null ? videoUrlModel2.urlList : urlStructV2.url_list;
        videoUrlModel2.width = a.a(urlStructV2.width, videoUrlModel2.width);
        videoUrlModel2.height = a.a(urlStructV2.height, videoUrlModel2.height);
        videoUrlModel2.urlKey = urlStructV2.url_key == null ? videoUrlModel2.urlKey : urlStructV2.url_key;
        videoUrlModel2.size = a.a(urlStructV2.data_size, videoUrlModel2.size);
        videoUrlModel2.fileHash = urlStructV2.file_hash == null ? videoUrlModel2.fileHash : urlStructV2.file_hash;
        videoUrlModel2.fileCheckSum = urlStructV2.file_cs == null ? videoUrlModel2.fileCheckSum : urlStructV2.file_cs;
        return videoUrlModel2;
    }

    public static UserProfileInitInfo com$ss$ugc$aweme$proto$UserProfileStructV2$$com$ss$android$ugc$aweme$feed$model$UserProfileInitInfo(UserProfileStructV2 userProfileStructV2, UserProfileInitInfo userProfileInitInfo) {
        if (userProfileStructV2 == null) {
            return userProfileInitInfo;
        }
        UserProfileInitInfo userProfileInitInfo2 = new UserProfileInitInfo();
        userProfileInitInfo2.headModelScore = a.a(userProfileStructV2.head_model_score, userProfileInitInfo2.headModelScore);
        return userProfileInitInfo2;
    }

    public static UserStory com$ss$ugc$aweme$proto$UserStoryV2$$com$ss$android$ugc$aweme$feed$model$story$UserStory(UserStoryV2 userStoryV2, UserStory userStory) {
        if (userStoryV2 == null) {
            return userStory;
        }
        UserStory userStory2 = new UserStory();
        userStory2.stories = List$com$ss$ugc$aweme$proto$AwemeStructV2$$List$com$ss$android$ugc$aweme$feed$model$Aweme(userStoryV2.stories, userStory2.stories);
        userStory2.totalCount = a.a(userStoryV2.total_count, userStory2.totalCount);
        userStory2.currentPosition = a.a(userStoryV2.current_position, userStory2.currentPosition);
        userStory2.allViewed = a.a(userStoryV2.all_viewed, userStory2.allViewed);
        userStory2.minCursor = a.a(userStoryV2.min_cursor, userStory2.minCursor);
        userStory2.maxCursor = a.a(userStoryV2.max_cursor, userStory2.maxCursor);
        userStory2.hasMoreAfter = a.a(userStoryV2.has_more_after, userStory2.hasMoreAfter);
        userStory2.hasMoreBefore = a.a(userStoryV2.has_more_before, userStory2.hasMoreBefore);
        userStory2.lastStoryCreatedAt = a.a(userStoryV2.last_story_created_at, userStory2.lastStoryCreatedAt);
        return userStory2;
    }

    public static User com$ss$ugc$aweme$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User(UserStructV2 userStructV2, User user) {
        if (userStructV2 == null) {
            return user;
        }
        User user2 = new User();
        user2.uid = userStructV2.uid == null ? user2.uid : userStructV2.uid;
        user2.shortId = userStructV2.short_id == null ? user2.shortId : userStructV2.short_id;
        user2.nickname = userStructV2.nickname == null ? user2.nickname : userStructV2.nickname;
        user2.signature = userStructV2.signature == null ? user2.signature : userStructV2.signature;
        user2.avatarLarger = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.avatar_larger, user2.avatarLarger);
        user2.avatarThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.avatar_thumb, user2.avatarThumb);
        user2.avatarMedium = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.avatar_medium, user2.avatarMedium);
        user2.birthday = userStructV2.birthday == null ? user2.birthday : userStructV2.birthday;
        user2.followStatus = a.a(userStructV2.follow_status, user2.followStatus);
        user2.awemeCount = a.a(userStructV2.aweme_count, user2.awemeCount);
        user2.followingCount = a.a(userStructV2.following_count, user2.followingCount);
        user2.followerCount = a.a(userStructV2.follower_count, user2.followerCount);
        user2.favoritingCount = a.a(userStructV2.favoriting_count, user2.favoritingCount);
        user2.totalFavorited = a.a(userStructV2.total_favorited, user2.totalFavorited);
        user2.isBlock = a.a(userStructV2.is_block, user2.isBlock);
        user2.hideSearch = a.a(userStructV2.hide_search, user2.hideSearch);
        user2.customVerify = userStructV2.custom_verify == null ? user2.customVerify : userStructV2.custom_verify;
        user2.uniqueId = userStructV2.unique_id == null ? user2.uniqueId : userStructV2.unique_id;
        user2.bindPhone = userStructV2.bind_phone == null ? user2.bindPhone : userStructV2.bind_phone;
        user2.needRecommend = a.a(userStructV2.need_recommend, user2.needRecommend);
        user2.recommendReason = userStructV2.recommend_reason == null ? user2.recommendReason : userStructV2.recommend_reason;
        user2.hasFacebookToken = a.a(userStructV2.has_facebook_token, user2.hasFacebookToken);
        user2.hasTwitterToken = a.a(userStructV2.has_twitter_token, user2.hasTwitterToken);
        user2.fbExpireTime = a.a(userStructV2.fb_expire_time, user2.fbExpireTime);
        user2.twExpireTime = a.a(userStructV2.tw_expire_time, user2.twExpireTime);
        user2.hasYoutubeToken = a.a(userStructV2.has_youtube_token, user2.hasYoutubeToken);
        user2.youtubeExpireTime = a.a(userStructV2.youtube_expire_time, user2.youtubeExpireTime);
        user2.roomId = a.a(userStructV2.room_id, user2.roomId);
        user2.authorityStatus = a.a(userStructV2.authority_status, user2.authorityStatus);
        user2.verifyInfo = userStructV2.verify_info == null ? user2.verifyInfo : userStructV2.verify_info;
        user2.shieldFollowNotice = a.a(userStructV2.shield_follow_notice, user2.shieldFollowNotice);
        user2.shieldDiggNotice = a.a(userStructV2.shield_digg_notice, user2.shieldDiggNotice);
        user2.shieldCommentNotice = a.a(userStructV2.shield_comment_notice, user2.shieldCommentNotice);
        user2.shareInfo = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$base$share$ShareInfo(userStructV2.share_info, user2.shareInfo);
        user2.withCommerceEntry = a.a(userStructV2.with_commerce_entry, user2.withCommerceEntry);
        user2.verificationType = a.a(userStructV2.verification_type, user2.verificationType);
        user2.originalMusician = com$ss$ugc$aweme$proto$OriginalMusicianStructV2$$com$ss$android$ugc$aweme$music$OriginalMusician(userStructV2.original_musician, user2.originalMusician);
        user2.enterpriseVerifyReason = userStructV2.enterprise_verify_reason == null ? user2.enterpriseVerifyReason : userStructV2.enterprise_verify_reason;
        user2.isAdFake = a.a(userStructV2.is_ad_fake, user2.isAdFake);
        user2.fansCount = a.a(userStructV2.mplatform_followers_count, user2.fansCount);
        user2.followerDetailList = List$com$ss$ugc$aweme$proto$FollowersDetailV2$$List$com$ss$android$ugc$aweme$profile$model$FollowerDetail(userStructV2.followers_detail, user2.followerDetailList);
        user2.region = userStructV2.region == null ? user2.region : userStructV2.region;
        user2.accountRegion = userStructV2.account_region == null ? user2.accountRegion : userStructV2.account_region;
        user2.commerceUserLevel = a.a(userStructV2.commerce_user_level, user2.commerceUserLevel);
        user2.commerceInfo = com$ss$ugc$aweme$proto$CommerceInfoStructV2$$com$ss$android$ugc$aweme$commerce$CommerceInfo(userStructV2.commerce_info, user2.commerceInfo);
        user2.liveAgreement = a.a(userStructV2.live_agreement, user2.liveAgreement);
        user2.platformInfos = List$com$ss$ugc$aweme$proto$PlatformSyncStatusStructV2$$Arraycom$ss$android$ugc$aweme$profile$model$PlatformInfo(userStructV2.platform_sync_info, user2.platformInfos);
        user2.withShopEntry = a.a(userStructV2.with_shop_entry, user2.withShopEntry);
        user2.isDisciplineMember = a.a(userStructV2.is_discipline_member, user2.isDisciplineMember);
        user2.secret = a.a(userStructV2.secret, user2.secret);
        user2.hasOrders = a.a(userStructV2.has_orders, user2.hasOrders);
        user2.preventDownload = a.a(userStructV2.prevent_download, user2.preventDownload);
        user2.showImageBubble = a.a(userStructV2.show_image_bubble, user2.showImageBubble);
        user2.unique_id_modify_time = a.a(userStructV2.unique_id_modify_time, user2.unique_id_modify_time);
        user2.avatarVideoUri = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.video_icon, user2.avatarVideoUri);
        user2.insId = userStructV2.ins_id == null ? user2.insId : userStructV2.ins_id;
        user2.youtubeChannelId = userStructV2.youtube_channel_id == null ? user2.youtubeChannelId : userStructV2.youtube_channel_id;
        user2.youtubeChannelTitle = userStructV2.youtube_channel_title == null ? user2.youtubeChannelTitle : userStructV2.youtube_channel_title;
        user2.isPhoneBinded = a.a(userStructV2.is_phone_binded, user2.isPhoneBinded);
        user2.loginPlatform = a.a(userStructV2.login_platform, user2.loginPlatform);
        user2.acceptPrivatePolicy = a.a(userStructV2.accept_private_policy, user2.acceptPrivatePolicy);
        user2.twitterId = userStructV2.twitter_id == null ? user2.twitterId : userStructV2.twitter_id;
        user2.twitterName = userStructV2.twitter_name == null ? user2.twitterName : userStructV2.twitter_name;
        user2.userCancelled = a.a(userStructV2.user_canceled, user2.userCancelled);
        user2.hasEmail = a.a(userStructV2.has_email, user2.hasEmail);
        user2.registerTime = a.a(userStructV2.register_time, user2.registerTime);
        user2.createTime = userStructV2.create_time == null ? user2.createTime : userStructV2.create_time;
        user2.followerStatus = a.a(userStructV2.follower_status, user2.followerStatus);
        user2.commentSetting = a.a(userStructV2.comment_setting, user2.commentSetting);
        user2.duetSetting = a.a(userStructV2.duet_setting, user2.duetSetting);
        user2.userRate = a.a(userStructV2.user_rate, user2.userRate);
        user2.withNewGoods = a.a(userStructV2.with_new_goods, user2.withNewGoods);
        user2.roomCover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.room_cover, user2.roomCover);
        user2.downloadSetting = a.a(userStructV2.download_setting, user2.downloadSetting);
        user2.liveCommerce = a.a(userStructV2.live_commerce, user2.liveCommerce);
        user2.country = userStructV2.country == null ? user2.country : userStructV2.country;
        user2.province = userStructV2.province == null ? user2.province : userStructV2.province;
        user2.cityName = userStructV2.city == null ? user2.cityName : userStructV2.city;
        user2.coverUrls = List$com$ss$ugc$aweme$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.cover_url, user2.coverUrls);
        user2.recommendReasonRelation = userStructV2.recommend_reason_relation == null ? user2.recommendReasonRelation : userStructV2.recommend_reason_relation;
        user2.isoCountryCode = userStructV2.iso_country_code == null ? user2.isoCountryCode : userStructV2.iso_country_code;
        user2.district = userStructV2.district == null ? user2.district : userStructV2.district;
        user2.language = userStructV2.language == null ? user2.language : userStructV2.language;
        user2.roomTypeTag = userStructV2.room_type_tag == null ? user2.roomTypeTag : userStructV2.room_type_tag;
        user2.isCreater = a.a(userStructV2.has_insights, user2.isCreater);
        user2.remarkName = userStructV2.remark_name == null ? user2.remarkName : userStructV2.remark_name;
        user2.tabType = a.a(userStructV2.profile_tab_type, user2.tabType);
        user2.avatarDecoration = com$ss$ugc$aweme$proto$AvatarDecorationStructV2$$com$ss$android$ugc$aweme$profile$model$AvatarDecoration(userStructV2.avatar_decoration, user2.avatarDecoration);
        user2.watchStatus = a.a(userStructV2.watch_status, user2.watchStatus);
        user2.withCommerceNewbieTask = a.a(userStructV2.with_commerce_newbie_task, user2.withCommerceNewbieTask);
        user2.withItemCommerceEntry = a.a(userStructV2.with_item_commerce_entry, user2.withItemCommerceEntry);
        user2.starBillboardRank = a.a(userStructV2.star_billboard_rank, user2.starBillboardRank);
        user2.education = a.a(userStructV2.education, user2.education);
        user2.canModifySchoolInfo = a.a(userStructV2.can_modify_school_info, user2.canModifySchoolInfo);
        user2.schoolInfoShowRange = a.a(userStructV2.school_visible, user2.schoolInfoShowRange);
        user2.avatarPendantLarger = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.avatar_pendant_larger, user2.avatarPendantLarger);
        user2.avatarPendantThumb = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.avatar_pendant_thumb, user2.avatarPendantThumb);
        user2.avatarPendantMedium = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.avatar_pendant_medium, user2.avatarPendantMedium);
        user2.recommendAwemeItems = List$com$ss$ugc$aweme$proto$RecommendItemStructV2$$List$com$ss$android$ugc$aweme$profile$model$RecommendAwemeItem(userStructV2.item_list, user2.recommendAwemeItems);
        user2.userMode = a.a(userStructV2.user_mode, user2.userMode);
        user2.userPeriod = a.a(userStructV2.user_period, user2.userPeriod);
        user2.isEffectArtist = a.a(userStructV2.is_effect_artist, user2.isEffectArtist);
        user2.effectArtistDetail = com$ss$ugc$aweme$proto$EffectArtistStructV2$$com$ss$android$ugc$aweme$profile$model$EffectArtistDetail(userStructV2.effect_detail, user2.effectArtistDetail);
        user2.commercePermission = com$ss$ugc$aweme$proto$CommercePermissionStructV2$$com$ss$android$ugc$aweme$profile$model$CommercePermissionStruct(userStructV2.commerce_permissions, user2.commercePermission);
        user2.storyBlockInfo = com$ss$ugc$aweme$proto$LifeStoryBlockStructV2$$com$ss$android$ugc$aweme$profile$model$StoryBlockInfo(userStructV2.life_story_block, user2.storyBlockInfo);
        user2.hideFollowingFollowerList = a.a(userStructV2.hide_following_follower_list, user2.hideFollowingFollowerList);
        user2.isStar = a.a(userStructV2.is_star, user2.isStar);
        user2.typeLabels = List$java$lang$Long$$ArrayJ(userStructV2.type_label, user2.typeLabels);
        user2.adCoverUrl = List$com$ss$ugc$aweme$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.ad_cover_url, user2.adCoverUrl);
        user2.adCoverTitle = com$ss$ugc$aweme$proto$AdCoverTitleV2$$com$ss$android$ugc$aweme$profile$model$AdCoverTitle(userStructV2.ad_cover_title, user2.adCoverTitle);
        user2.adOrderId = userStructV2.ad_order_id == null ? user2.adOrderId : userStructV2.ad_order_id;
        user2.rFansGroupInfo = com$ss$ugc$aweme$proto$RFansGroupInfoV2$$com$ss$android$ugc$aweme$base$share$RocketFansGroupInfo(userStructV2.r_fans_group_info, user2.rFansGroupInfo);
        user2.withCommerceEnterpriseTabEntry = a.a(userStructV2.with_commerce_enterprise_tab_entry, user2.withCommerceEnterpriseTabEntry);
        user2.honorStruct = com$ss$ugc$aweme$proto$LiveHonorStructV2$$com$ss$android$ugc$aweme$profile$model$HonorStruct(userStructV2.honor_info, user2.honorStruct);
        user2.commentFilterStatus = a.a(userStructV2.comment_filter_status, user2.commentFilterStatus);
        user2.notifyPrivateAccount = a.a(userStructV2.notify_private_account, user2.notifyPrivateAccount);
        user2.isBlocked = a.a(userStructV2.is_blocked, user2.isBlocked);
        user2.forcePrivateAccount = a.a(userStructV2.force_private_account, user2.forcePrivateAccount);
        user2.withStarAtlasEntry = a.a(userStructV2.with_star_atlas_entry, user2.withStarAtlasEntry);
        user2.sprintSupportUserInfo = com$ss$ugc$aweme$proto$HotsearchSprintStructV2$$com$ss$android$ugc$aweme$profile$model$HotSearchSprintStruct(userStructV2.sprint_support_user_info, user2.sprintSupportUserInfo);
        user2.signatureLanguage = userStructV2.signature_language == null ? user2.signatureLanguage : userStructV2.signature_language;
        user2.brandInfo = com$ss$ugc$aweme$proto$BlueVBrandInfoStructV2$$com$ss$android$ugc$aweme$profile$model$BlueVBrandInfo(userStructV2.brand_info, user2.brandInfo);
        user2.displayWvalantineActivityEntry = a.a(userStructV2.display_wvalantine_activity_entry, user2.displayWvalantineActivityEntry);
        user2.shopMicroApp = userStructV2.shop_micro_app == null ? user2.shopMicroApp : userStructV2.shop_micro_app;
        user2.commerceUserInfo = com$ss$ugc$aweme$proto$CommerceUserStructV2$$com$ss$android$ugc$aweme$profile$model$CommerceUserInfo(userStructV2.commerce_user_info, user2.commerceUserInfo);
        user2.relativeUserInfos = List$com$ss$ugc$aweme$proto$RelativeUserStructV2$$List$com$ss$android$ugc$aweme$profile$model$RelativeUserInfo(userStructV2.relative_users, user2.relativeUserInfos);
        user2.quickShopInfo = com$ss$ugc$aweme$proto$QuickShopStructV2$$com$ss$android$ugc$aweme$profile$model$QuickShopInfo(userStructV2.quick_shop_info, user2.quickShopInfo);
        user2.challengeList = List$com$ss$ugc$aweme$proto$ChallengeStructV2$$List$com$ss$android$ugc$aweme$discover$model$Challenge(userStructV2.cha_list, user2.challengeList);
        user2.secUid = userStructV2.sec_uid == null ? user2.secUid : userStructV2.sec_uid;
        user2.recommendScore = a.a(userStructV2.recommend_score, user2.recommendScore);
        user2.mGeneralPermission = com$ss$ugc$aweme$proto$PermissionStructV2$$com$ss$android$ugc$aweme$profile$model$GeneralPermission(userStructV2.general_permission, user2.mGeneralPermission);
        user2.bioUrl = userStructV2.bio_url == null ? user2.bioUrl : userStructV2.bio_url;
        user2.bioEmail = userStructV2.bio_email == null ? user2.bioEmail : userStructV2.bio_email;
        user2.latestOrderTime = userStructV2.latest_order_time == null ? user2.latestOrderTime : userStructV2.latest_order_time;
        user2.isProAccount = a.a(userStructV2.is_pro_account, user2.isProAccount);
        user2.email = userStructV2.email == null ? user2.email : userStructV2.email;
        user2.isEmailVerified = a.a(userStructV2.is_email_verified, user2.isEmailVerified);
        user2.bioSecureUrl = userStructV2.bio_secure_url == null ? user2.bioSecureUrl : userStructV2.bio_secure_url;
        user2.collectCount = a.a(userStructV2.collect_count, user2.collectCount);
        user2.nicknameUpdateReminder = a.a(userStructV2.nickname_update_reminder, user2.nicknameUpdateReminder);
        user2.avatarUpdateReminder = a.a(userStructV2.avatar_update_reminder, user2.avatarUpdateReminder);
        user2.isActivityUser = a.a(userStructV2.is_activity_user, user2.isActivityUser);
        user2.roomData = userStructV2.room_data == null ? user2.roomData : userStructV2.room_data;
        user2.unReadVideoInfo = com$ss$ugc$aweme$proto$VideoUnreadStructV2$$com$ss$android$ugc$aweme$profile$model$UnReadVideoInfo(userStructV2.video_unread_info, user2.unReadVideoInfo);
        user2.stitchSetting = a.a(userStructV2.stitch_setting, user2.stitchSetting);
        user2.qnaStatus = a.a(userStructV2.qa_status, user2.qnaStatus);
        user2.mProfileBadgeStruct = com$ss$ugc$aweme$proto$ProfileBadgeStructV2$$com$ss$android$ugc$aweme$profile$model$ProfileBadgeStruct(userStructV2.badge_info, user2.mProfileBadgeStruct);
        user2.socialInfo = userStructV2.social_info == null ? user2.socialInfo : userStructV2.social_info;
        user2.storyStatus = a.a(userStructV2.story_status, user2.storyStatus);
        user2.matchedFriendStruct = com$ss$ugc$aweme$proto$MatchedFriendStructV2$$com$ss$android$ugc$aweme$profile$model$MatchedFriendStruct(userStructV2.matched_friend, user2.matchedFriendStruct);
        return user2;
    }

    public static h com$ss$ugc$aweme$proto$UtteranceV2$$com$ss$android$ugc$aweme$sticker$data$Utterance(UtteranceV2 utteranceV2, h hVar) {
        if (utteranceV2 == null) {
            return hVar;
        }
        h hVar2 = new h();
        hVar2.text = utteranceV2.text == null ? hVar2.text : utteranceV2.text;
        hVar2.startTime = a.a(utteranceV2.start_time, hVar2.startTime);
        hVar2.endTime = a.a(utteranceV2.end_time, hVar2.endTime);
        return hVar2;
    }

    public static VideoControl com$ss$ugc$aweme$proto$VideoControlV2$$com$ss$android$ugc$aweme$feed$model$VideoControl(VideoControlV2 videoControlV2, VideoControl videoControl) {
        if (videoControlV2 == null) {
            return videoControl;
        }
        VideoControl videoControl2 = new VideoControl();
        videoControl2.allowDownload = videoControlV2.allow_download == null ? videoControl2.allowDownload : videoControlV2.allow_download;
        videoControl2.shareType = a.a(videoControlV2.share_type, videoControl2.shareType);
        videoControl2.showProgressBar = a.a(videoControlV2.show_progress_bar, videoControl2.showProgressBar);
        videoControl2.draftProgressBar = a.a(videoControlV2.draft_progress_bar, videoControl2.draftProgressBar);
        videoControl2.isAllowDuet = a.a(videoControlV2.allow_duet, videoControl2.isAllowDuet);
        videoControl2.isAllowReact = a.a(videoControlV2.allow_react, videoControl2.isAllowReact);
        videoControl2.preventDownloadType = a.a(videoControlV2.prevent_download_type, videoControl2.preventDownloadType);
        videoControl2.isAllowDynamicWallpaper = a.a(videoControlV2.allow_dynamic_wallpaper, videoControl2.isAllowDynamicWallpaper);
        videoControl2.timerStatus = a.a(videoControlV2.timer_status, videoControl2.timerStatus);
        videoControl2.isAllowMusic = a.a(videoControlV2.allow_music, videoControl2.isAllowMusic);
        return videoControl2;
    }

    public static AwemeStatus.VideoMuteInfo com$ss$ugc$aweme$proto$VideoMuteStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatus$VideoMuteInfo(VideoMuteStructV2 videoMuteStructV2, AwemeStatus.VideoMuteInfo videoMuteInfo) {
        if (videoMuteStructV2 == null) {
            return videoMuteInfo;
        }
        AwemeStatus.VideoMuteInfo videoMuteInfo2 = new AwemeStatus.VideoMuteInfo();
        videoMuteInfo2.isMute = a.a(videoMuteStructV2.is_mute, videoMuteInfo2.isMute);
        videoMuteInfo2.muteDesc = videoMuteStructV2.mute_desc == null ? videoMuteInfo2.muteDesc : videoMuteStructV2.mute_desc;
        return videoMuteInfo2;
    }

    public static VideoReplyStruct com$ss$ugc$aweme$proto$VideoReplyStructV2$$com$ss$android$ugc$aweme$feed$model$VideoReplyStruct(VideoReplyStructV2 videoReplyStructV2, VideoReplyStruct videoReplyStruct) {
        if (videoReplyStructV2 == null) {
            return videoReplyStruct;
        }
        VideoReplyStruct videoReplyStruct2 = new VideoReplyStruct();
        videoReplyStruct2.awemeId = a.a(videoReplyStructV2.aweme_id, videoReplyStruct2.awemeId);
        videoReplyStruct2.commentId = a.a(videoReplyStructV2.comment_id, videoReplyStruct2.commentId);
        videoReplyStruct2.aliasCommentId = a.a(videoReplyStructV2.alias_comment_id, videoReplyStruct2.aliasCommentId);
        videoReplyStruct2.userName = videoReplyStructV2.user_name == null ? videoReplyStruct2.userName : videoReplyStructV2.user_name;
        videoReplyStruct2.commentMsg = videoReplyStructV2.comment_msg == null ? videoReplyStruct2.commentMsg : videoReplyStructV2.comment_msg;
        videoReplyStruct2.commentUserId = a.a(videoReplyStructV2.comment_user_id, videoReplyStruct2.commentUserId);
        videoReplyStruct2.userAvatar = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoReplyStructV2.user_avatar, videoReplyStruct2.userAvatar);
        videoReplyStruct2.collectStat = videoReplyStructV2.collect_stat == null ? videoReplyStruct2.collectStat : videoReplyStructV2.collect_stat;
        return videoReplyStruct2;
    }

    public static Video com$ss$ugc$aweme$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video(VideoStructV2 videoStructV2, Video video) {
        if (videoStructV2 == null) {
            return video;
        }
        Video video2 = new Video();
        video2.playAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(videoStructV2.play_addr, video2.playAddr);
        video2.cover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoStructV2.cover, video2.cover);
        video2.height = a.a(videoStructV2.height, video2.height);
        video2.width = a.a(videoStructV2.width, video2.width);
        video2.dynamicCover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoStructV2.dynamic_cover, video2.dynamicCover);
        video2.originCover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoStructV2.origin_cover, video2.originCover);
        video2.ratio = videoStructV2.ratio == null ? video2.ratio : videoStructV2.ratio;
        video2.downloadAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoStructV2.download_addr, video2.downloadAddr);
        video2.bitRate = List$com$ss$ugc$aweme$proto$BitRateStructV2$$List$com$ss$android$ugc$aweme$feed$model$BitRate(videoStructV2.bit_rate, video2.bitRate);
        video2.newDownloadAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoStructV2.new_download_addr, video2.newDownloadAddr);
        video2.videoLength = a.a(videoStructV2.duration, video2.videoLength);
        video2.h264PlayAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(videoStructV2.play_addr_h264, video2.h264PlayAddr);
        video2.uiAlikeAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoStructV2.ui_alike_download_addr, video2.uiAlikeAddr);
        video2.captionDownloadAddr = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoStructV2.caption_download_addr, video2.captionDownloadAddr);
        video2.isLongVideo = a.a(videoStructV2.is_long_video, video2.isLongVideo);
        video2.dVideoModel = videoStructV2.video_model == null ? video2.dVideoModel : videoStructV2.video_model;
        video2.needSetCookie = a.a(videoStructV2.need_set_token, video2.needSetCookie);
        video2.miscDownloadAddrs = videoStructV2.misc_download_addrs == null ? video2.miscDownloadAddrs : videoStructV2.misc_download_addrs;
        video2.drmTokenAuth = com$ss$ugc$aweme$proto$PlayTokenAuthStructV2$$com$ss$android$ugc$aweme$feed$model$video$PlayTokenAuth(videoStructV2.token_auth, video2.drmTokenAuth);
        video2.playAddrBytevc1 = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(videoStructV2.play_addr_bytevc1, video2.playAddrBytevc1);
        video2.meta = videoStructV2.meta == null ? video2.meta : videoStructV2.meta;
        video2.captionModel = com$ss$ugc$aweme$proto$ClaStructV2$$com$ss$android$ugc$aweme$feed$model$CaptionModel(videoStructV2.cla_info, video2.captionModel);
        return video2;
    }

    public static AwemeTextLabelModel com$ss$ugc$aweme$proto$VideoTextStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeTextLabelModel(VideoTextStructV2 videoTextStructV2, AwemeTextLabelModel awemeTextLabelModel) {
        if (videoTextStructV2 == null) {
            return awemeTextLabelModel;
        }
        AwemeTextLabelModel awemeTextLabelModel2 = new AwemeTextLabelModel();
        awemeTextLabelModel2.labelName = videoTextStructV2.text == null ? awemeTextLabelModel2.labelName : videoTextStructV2.text;
        awemeTextLabelModel2.bgColor = videoTextStructV2.color == null ? awemeTextLabelModel2.bgColor : videoTextStructV2.color;
        awemeTextLabelModel2.textColor = videoTextStructV2.color_text == null ? awemeTextLabelModel2.textColor : videoTextStructV2.color_text;
        awemeTextLabelModel2.labelType = a.a(videoTextStructV2.type, awemeTextLabelModel2.labelType);
        return awemeTextLabelModel2;
    }

    public static UnReadVideoInfo com$ss$ugc$aweme$proto$VideoUnreadStructV2$$com$ss$android$ugc$aweme$profile$model$UnReadVideoInfo(VideoUnreadStructV2 videoUnreadStructV2, UnReadVideoInfo unReadVideoInfo) {
        if (videoUnreadStructV2 == null) {
            return unReadVideoInfo;
        }
        UnReadVideoInfo unReadVideoInfo2 = new UnReadVideoInfo();
        unReadVideoInfo2.unReadCount = a.a(videoUnreadStructV2.unread_count, unReadVideoInfo2.unReadCount);
        unReadVideoInfo2.latestUnreadVideoCreatedTime = a.a(videoUnreadStructV2.latest_unread_video_created_time, unReadVideoInfo2.latestUnreadVideoCreatedTime);
        return unReadVideoInfo2;
    }

    public static PollStruct.OptionsBean com$ss$ugc$aweme$proto$VoteOptionStructV2$$com$ss$android$ugc$aweme$sticker$data$PollStruct$OptionsBean(VoteOptionStructV2 voteOptionStructV2, PollStruct.OptionsBean optionsBean) {
        if (voteOptionStructV2 == null) {
            return optionsBean;
        }
        PollStruct.OptionsBean optionsBean2 = new PollStruct.OptionsBean();
        optionsBean2.optionText = voteOptionStructV2.option_text == null ? optionsBean2.optionText : voteOptionStructV2.option_text;
        optionsBean2.optionId = a.a(voteOptionStructV2.option_id, optionsBean2.optionId);
        optionsBean2.pollCount = a.a(voteOptionStructV2.vote_count, optionsBean2.pollCount);
        optionsBean2.postOption = voteOptionStructV2.option == null ? optionsBean2.postOption : voteOptionStructV2.option;
        return optionsBean2;
    }

    public static PollStruct com$ss$ugc$aweme$proto$VoteStructV2$$com$ss$android$ugc$aweme$sticker$data$PollStruct(VoteStructV2 voteStructV2, PollStruct pollStruct) {
        if (voteStructV2 == null) {
            return pollStruct;
        }
        PollStruct pollStruct2 = new PollStruct();
        pollStruct2.pollId = a.a(voteStructV2.vote_id, pollStruct2.pollId);
        pollStruct2.refId = a.a(voteStructV2.ref_id, pollStruct2.refId);
        pollStruct2.refType = a.a(voteStructV2.ref_type, pollStruct2.refType);
        pollStruct2.question = voteStructV2.question == null ? pollStruct2.question : voteStructV2.question;
        pollStruct2.options = List$com$ss$ugc$aweme$proto$VoteOptionStructV2$$List$com$ss$android$ugc$aweme$sticker$data$PollStruct$OptionsBean(voteStructV2.options, pollStruct2.options);
        pollStruct2.selectOptionId = a.a(voteStructV2.select_option_id, pollStruct2.selectOptionId);
        return pollStruct2;
    }

    public static RoomFeedCellStruct com$ss$ugc$aweme$proto$WebcastRoomFeedCellStructV2$$com$ss$android$ugc$aweme$feed$model$live$RoomFeedCellStruct(WebcastRoomFeedCellStructV2 webcastRoomFeedCellStructV2, RoomFeedCellStruct roomFeedCellStruct) {
        if (webcastRoomFeedCellStructV2 == null) {
            return roomFeedCellStruct;
        }
        RoomFeedCellStruct roomFeedCellStruct2 = new RoomFeedCellStruct();
        roomFeedCellStruct2.room = com$ss$ugc$aweme$proto$WebcastRoomStructV2$$com$ss$android$ugc$aweme$feed$model$live$LiveRoomStruct(webcastRoomFeedCellStructV2.room, roomFeedCellStruct2.room);
        roomFeedCellStruct2.type = a.a(webcastRoomFeedCellStructV2.type, roomFeedCellStruct2.type);
        roomFeedCellStruct2.mFansStruct = com$ss$ugc$aweme$proto$FansStructV2$$com$ss$android$ugc$aweme$feed$model$live$FansStruct(webcastRoomFeedCellStructV2.fans_struct, roomFeedCellStruct2.mFansStruct);
        roomFeedCellStruct2.tag = webcastRoomFeedCellStructV2.tag == null ? roomFeedCellStruct2.tag : webcastRoomFeedCellStructV2.tag;
        roomFeedCellStruct2.tagId = a.a(webcastRoomFeedCellStructV2.tag_id, roomFeedCellStruct2.tagId);
        roomFeedCellStruct2.icon = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(webcastRoomFeedCellStructV2.icon, roomFeedCellStruct2.icon);
        roomFeedCellStruct2.distance = webcastRoomFeedCellStructV2.distance == null ? roomFeedCellStruct2.distance : webcastRoomFeedCellStructV2.distance;
        roomFeedCellStruct2.newLiveRoomData = g.a(webcastRoomFeedCellStructV2.rawdata, roomFeedCellStruct2.newLiveRoomData);
        return roomFeedCellStruct2;
    }

    public static LiveRoomStruct com$ss$ugc$aweme$proto$WebcastRoomStructV2$$com$ss$android$ugc$aweme$feed$model$live$LiveRoomStruct(WebcastRoomStructV2 webcastRoomStructV2, LiveRoomStruct liveRoomStruct) {
        if (webcastRoomStructV2 == null) {
            return liveRoomStruct;
        }
        LiveRoomStruct liveRoomStruct2 = new LiveRoomStruct();
        liveRoomStruct2.id = a.a(webcastRoomStructV2.room_id, liveRoomStruct2.id);
        liveRoomStruct2.status = a.a(webcastRoomStructV2.status, liveRoomStruct2.status);
        liveRoomStruct2.owner = com$ss$ugc$aweme$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User(webcastRoomStructV2.owner, liveRoomStruct2.owner);
        liveRoomStruct2.title = webcastRoomStructV2.title == null ? liveRoomStruct2.title : webcastRoomStructV2.title;
        liveRoomStruct2.user_count = a.a(webcastRoomStructV2.user_count, liveRoomStruct2.user_count);
        liveRoomStruct2.create_time = a.a(webcastRoomStructV2.create_time, liveRoomStruct2.create_time);
        liveRoomStruct2.finish_time = a.a(webcastRoomStructV2.finish_time, liveRoomStruct2.finish_time);
        liveRoomStruct2.stream_id = a.a(webcastRoomStructV2.stream_id, liveRoomStruct2.stream_id);
        liveRoomStruct2.stream_url = com$ss$ugc$aweme$proto$StreamUrlStructV2$$com$ss$android$ugc$aweme$feed$model$live$StreamUrlStruct(webcastRoomStructV2.stream_url, liveRoomStruct2.stream_url);
        liveRoomStruct2.share_info = com$ss$ugc$aweme$proto$ShareStructV2$$com$ss$android$ugc$aweme$feed$model$live$ShareStruct(webcastRoomStructV2.share_info, liveRoomStruct2.share_info);
        liveRoomStruct2.digg_count = a.a(webcastRoomStructV2.digg_count, liveRoomStruct2.digg_count);
        liveRoomStruct2.total_user_count = a.a(webcastRoomStructV2.total_user_count, liveRoomStruct2.total_user_count);
        liveRoomStruct2.inSandbox = a.a(webcastRoomStructV2.in_sandbox, liveRoomStruct2.inSandbox);
        liveRoomStruct2.roomCover = com$ss$ugc$aweme$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(webcastRoomStructV2.room_cover, liveRoomStruct2.roomCover);
        liveRoomStruct2.roomTypeTag = webcastRoomStructV2.room_type_tag == null ? liveRoomStruct2.roomTypeTag : webcastRoomStructV2.room_type_tag;
        liveRoomStruct2.additional_stream_url = com$ss$ugc$aweme$proto$StreamUrlStructV2$$com$ss$android$ugc$aweme$feed$model$live$StreamUrlStruct(webcastRoomStructV2.additional_stream_url, liveRoomStruct2.additional_stream_url);
        liveRoomStruct2.liveTypeAudio = a.a(webcastRoomStructV2.live_type_audio, liveRoomStruct2.liveTypeAudio);
        liveRoomStruct2.isThirdParty = a.a(webcastRoomStructV2.live_type_third_party, liveRoomStruct2.isThirdParty);
        liveRoomStruct2.isScreenshot = a.a(webcastRoomStructV2.live_type_screenshot, liveRoomStruct2.isScreenshot);
        liveRoomStruct2.isOfficialType = a.a(webcastRoomStructV2.live_type_official, liveRoomStruct2.isOfficialType);
        liveRoomStruct2.withLinkmic = a.a(webcastRoomStructV2.with_linkmic, liveRoomStruct2.withLinkmic);
        return liveRoomStruct2;
    }

    public static FeedItemList com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList(aweme_v2_feed_response aweme_v2_feed_response, FeedItemList feedItemList) {
        if (aweme_v2_feed_response == null) {
            return feedItemList;
        }
        FeedItemList feedItemList2 = new FeedItemList();
        feedItemList2.status_code = a.a(aweme_v2_feed_response.status_code, feedItemList2.status_code);
        feedItemList2.minCursor = a.a(aweme_v2_feed_response.min_cursor, feedItemList2.minCursor);
        feedItemList2.maxCursor = a.a(aweme_v2_feed_response.max_cursor, feedItemList2.maxCursor);
        feedItemList2.hasMore = a.a(aweme_v2_feed_response.has_more, feedItemList2.hasMore);
        feedItemList2.items = List$com$ss$ugc$aweme$proto$AwemeStructV2$$List$com$ss$android$ugc$aweme$feed$model$Aweme(aweme_v2_feed_response.aweme_list, feedItemList2.items);
        feedItemList2.requestId = aweme_v2_feed_response.rid == null ? feedItemList2.requestId : aweme_v2_feed_response.rid;
        feedItemList2.refreshClear = a.a(aweme_v2_feed_response.refresh_clear, feedItemList2.refreshClear);
        feedItemList2.extra = com$ss$ugc$aweme$proto$ExtraStructV2$$com$ss$android$ugc$aweme$feed$model$Extra(aweme_v2_feed_response.extra, feedItemList2.extra);
        feedItemList2.logPb = com$ss$ugc$aweme$proto$LogPbStructV2$$com$ss$android$ugc$aweme$feed$model$LogPbBean(aweme_v2_feed_response.log_pb, feedItemList2.logPb);
        feedItemList2.hotSearchGuideWord = com$ss$ugc$aweme$proto$GuideWordV2$$com$ss$android$ugc$aweme$feed$model$HotSearchGuideWord(aweme_v2_feed_response.guide_word, feedItemList2.hotSearchGuideWord);
        feedItemList2.preloadAds = List$com$ss$ugc$aweme$proto$AwemeStructV2$$List$com$ss$android$ugc$aweme$feed$model$Aweme(aweme_v2_feed_response.preload_ads, feedItemList2.preloadAds);
        feedItemList2.status_msg = aweme_v2_feed_response.status_msg == null ? feedItemList2.status_msg : aweme_v2_feed_response.status_msg;
        feedItemList2.blockCode = a.a(aweme_v2_feed_response.block_code, feedItemList2.blockCode);
        feedItemList2.enableReRank = a.a(aweme_v2_feed_response.enable_re_rank, feedItemList2.enableReRank);
        feedItemList2.disableAdjustForCache = a.a(aweme_v2_feed_response.disable_adjust_for_cache, feedItemList2.disableAdjustForCache);
        feedItemList2.showTimeGapResponse = com$ss$ugc$aweme$proto$ShowTimeGapRspInfo$$com$ss$android$ugc$aweme$commercialize$feed$timegap$AdShowTimeGapResponse(aweme_v2_feed_response.showtime_gap_rsp_info, feedItemList2.showTimeGapResponse);
        feedItemList2.hasAd = a.a(aweme_v2_feed_response.has_ad, feedItemList2.hasAd);
        return feedItemList2;
    }

    public static AwemeStatistics tiktok$kids$proto$AwemeStatisticsStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatistics(tiktok.kids.proto.AwemeStatisticsStructV2 awemeStatisticsStructV2, AwemeStatistics awemeStatistics) {
        if (awemeStatisticsStructV2 == null) {
            return awemeStatistics;
        }
        AwemeStatistics awemeStatistics2 = new AwemeStatistics();
        awemeStatistics2.diggCount = a.a(awemeStatisticsStructV2.digg_count, awemeStatistics2.diggCount);
        awemeStatistics2.playCount = a.a(awemeStatisticsStructV2.play_count, awemeStatistics2.playCount);
        awemeStatistics2.loseCount = a.a(awemeStatisticsStructV2.lose_count, awemeStatistics2.loseCount);
        return awemeStatistics2;
    }

    public static AwemeStatus tiktok$kids$proto$AwemeStatusStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatus(tiktok.kids.proto.AwemeStatusStructV2 awemeStatusStructV2, AwemeStatus awemeStatus) {
        if (awemeStatusStructV2 == null) {
            return awemeStatus;
        }
        AwemeStatus awemeStatus2 = new AwemeStatus();
        awemeStatus2.isDelete = a.a(awemeStatusStructV2.is_delete, awemeStatus2.isDelete);
        awemeStatus2.isProhibited = a.a(awemeStatusStructV2.is_prohibited, awemeStatus2.isProhibited);
        return awemeStatus2;
    }

    public static Aweme tiktok$kids$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(tiktok.kids.proto.AwemeStructV2 awemeStructV2, Aweme aweme) {
        if (awemeStructV2 == null) {
            return aweme;
        }
        Aweme aweme2 = new Aweme();
        aweme2.aid = awemeStructV2.aweme_id == null ? aweme2.aid : awemeStructV2.aweme_id;
        aweme2.createTime = a.a(awemeStructV2.create_time, aweme2.createTime);
        aweme2.author = tiktok$kids$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User(awemeStructV2.author, aweme2.author);
        aweme2.music = tiktok$kids$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music(awemeStructV2.music, aweme2.music);
        aweme2.video = tiktok$kids$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video(awemeStructV2.video, aweme2.video);
        aweme2.userDigg = a.a(awemeStructV2.user_digged, aweme2.userDigg);
        aweme2.statistics = tiktok$kids$proto$AwemeStatisticsStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatistics(awemeStructV2.statistics, aweme2.statistics);
        aweme2.status = tiktok$kids$proto$AwemeStatusStructV2$$com$ss$android$ugc$aweme$feed$model$AwemeStatus(awemeStructV2.status, aweme2.status);
        aweme2.extra = awemeStructV2.extra == null ? aweme2.extra : awemeStructV2.extra;
        aweme2.isVr = a.a(awemeStructV2.is_vr, aweme2.isVr);
        aweme2.awemeType = a.a(awemeStructV2.aweme_type, aweme2.awemeType);
        aweme2.imageInfos = List$tiktok$kids$proto$ImageInfoStructV2$$List$com$ss$android$ugc$aweme$feed$model$ImageInfo(awemeStructV2.image_infos, aweme2.imageInfos);
        aweme2.groupId = awemeStructV2.group_id == null ? aweme2.groupId : awemeStructV2.group_id;
        aweme2.longVideos = List$tiktok$kids$proto$LongVideoStructV2$$List$com$ss$android$ugc$aweme$feed$model$LongVideo(awemeStructV2.long_video, aweme2.longVideos);
        aweme2.descLanguage = awemeStructV2.desc_language == null ? aweme2.descLanguage : awemeStructV2.desc_language;
        aweme2.takeDownReason = a.a(awemeStructV2.take_down_reason, aweme2.takeDownReason);
        aweme2.takeDownDesc = awemeStructV2.take_down_desc == null ? aweme2.takeDownDesc : awemeStructV2.take_down_desc;
        aweme2.distributeType = a.a(awemeStructV2.distribute_type, aweme2.distributeType);
        return aweme2;
    }

    public static BitRate tiktok$kids$proto$BitRateStructV2$$com$ss$android$ugc$aweme$feed$model$BitRate(tiktok.kids.proto.BitRateStructV2 bitRateStructV2, BitRate bitRate) {
        if (bitRateStructV2 == null) {
            return bitRate;
        }
        BitRate bitRate2 = new BitRate();
        bitRate2.gearName = bitRateStructV2.gear_name == null ? bitRate2.gearName : bitRateStructV2.gear_name;
        bitRate2.qualityType = a.a(bitRateStructV2.quality_type, bitRate2.qualityType);
        bitRate2.bitRate = a.a(bitRateStructV2.bit_rate, bitRate2.bitRate);
        bitRate2.playAddr = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(bitRateStructV2.play_addr, bitRate2.playAddr);
        return bitRate2;
    }

    public static ImageInfo tiktok$kids$proto$ImageInfoStructV2$$com$ss$android$ugc$aweme$feed$model$ImageInfo(tiktok.kids.proto.ImageInfoStructV2 imageInfoStructV2, ImageInfo imageInfo) {
        if (imageInfoStructV2 == null) {
            return imageInfo;
        }
        ImageInfo imageInfo2 = new ImageInfo();
        imageInfo2.height = a.a(imageInfoStructV2.height, imageInfo2.height);
        imageInfo2.width = a.a(imageInfoStructV2.width, imageInfo2.width);
        imageInfo2.labelLarge = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(imageInfoStructV2.label_large, imageInfo2.labelLarge);
        imageInfo2.labelThumb = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(imageInfoStructV2.label_thumb, imageInfo2.labelThumb);
        return imageInfo2;
    }

    public static LogPbBean tiktok$kids$proto$LogPbStructV2$$com$ss$android$ugc$aweme$feed$model$LogPbBean(tiktok.kids.proto.LogPbStructV2 logPbStructV2, LogPbBean logPbBean) {
        if (logPbStructV2 == null) {
            return logPbBean;
        }
        LogPbBean logPbBean2 = new LogPbBean();
        logPbBean2.imprId = logPbStructV2.impr_id == null ? logPbBean2.imprId : logPbStructV2.impr_id;
        return logPbBean2;
    }

    public static LongVideo tiktok$kids$proto$LongVideoStructV2$$com$ss$android$ugc$aweme$feed$model$LongVideo(tiktok.kids.proto.LongVideoStructV2 longVideoStructV2, LongVideo longVideo) {
        if (longVideoStructV2 == null) {
            return longVideo;
        }
        LongVideo longVideo2 = new LongVideo();
        longVideo2.video = tiktok$kids$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video(longVideoStructV2.video, longVideo2.video);
        longVideo2.longVideoType = a.a(longVideoStructV2.long_video_type, longVideo2.longVideoType);
        longVideo2.trailerStartTime = a.a(longVideoStructV2.trailer_start_time, longVideo2.trailerStartTime);
        return longVideo2;
    }

    public static Music tiktok$kids$proto$MusicStructV2$$com$ss$android$ugc$aweme$music$model$Music(tiktok.kids.proto.MusicStructV2 musicStructV2, Music music) {
        if (musicStructV2 == null) {
            return music;
        }
        Music music2 = new Music();
        music2.id = a.a(musicStructV2.id, music2.id);
        music2.idStr = musicStructV2.id_str == null ? music2.idStr : musicStructV2.id_str;
        music2.musicName = musicStructV2.title == null ? music2.musicName : musicStructV2.title;
        music2.authorName = musicStructV2.author == null ? music2.authorName : musicStructV2.author;
        music2.album = musicStructV2.album == null ? music2.album : musicStructV2.album;
        music2.strongBeatUrl = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.strong_beat_url, music2.strongBeatUrl);
        music2.isArtistMusic = a.a(musicStructV2.is_author_artist, music2.isArtistMusic);
        music2.coverThumb = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.cover_thumb, music2.coverThumb);
        music2.playUrl = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(musicStructV2.play_url, music2.playUrl);
        music2.duration = a.a(musicStructV2.duration, music2.duration);
        music2.ownerHandle = musicStructV2.owner_handle == null ? music2.ownerHandle : musicStructV2.owner_handle;
        music2.musicStatus = a.a(musicStructV2.status, music2.musicStatus);
        music2.offlineDesc = musicStructV2.offline_desc == null ? music2.offlineDesc : musicStructV2.offline_desc;
        music2.ownerId = musicStructV2.owner_id == null ? music2.ownerId : musicStructV2.owner_id;
        music2.ownerNickName = musicStructV2.owner_nickname == null ? music2.ownerNickName : musicStructV2.owner_nickname;
        music2.isOriginMusic = a.a(musicStructV2.is_original, music2.isOriginMusic);
        music2.isAuthorDeleted = a.a(musicStructV2.author_deleted, music2.isAuthorDeleted);
        return music2;
    }

    public static PlayTokenAuth tiktok$kids$proto$PlayTokenAuthStructV2$$com$ss$android$ugc$aweme$feed$model$video$PlayTokenAuth(tiktok.kids.proto.PlayTokenAuthStructV2 playTokenAuthStructV2, PlayTokenAuth playTokenAuth) {
        if (playTokenAuthStructV2 == null) {
            return playTokenAuth;
        }
        PlayTokenAuth playTokenAuth2 = new PlayTokenAuth();
        playTokenAuth2.vid = playTokenAuthStructV2.vid == null ? playTokenAuth2.vid : playTokenAuthStructV2.vid;
        playTokenAuth2.token = playTokenAuthStructV2.token == null ? playTokenAuth2.token : playTokenAuthStructV2.token;
        playTokenAuth2.auth = playTokenAuthStructV2.auth == null ? playTokenAuth2.auth : playTokenAuthStructV2.auth;
        playTokenAuth2.hosts = playTokenAuthStructV2.hosts == null ? playTokenAuth2.hosts : playTokenAuthStructV2.hosts;
        return playTokenAuth2;
    }

    public static UrlModel tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(tiktok.kids.proto.UrlStructV2 urlStructV2, UrlModel urlModel) {
        if (urlStructV2 == null) {
            return urlModel;
        }
        UrlModel urlModel2 = new UrlModel();
        urlModel2.uri = urlStructV2.uri == null ? urlModel2.uri : urlStructV2.uri;
        urlModel2.urlList = urlStructV2.url_list == null ? urlModel2.urlList : urlStructV2.url_list;
        urlModel2.width = a.a(urlStructV2.width, urlModel2.width);
        urlModel2.height = a.a(urlStructV2.height, urlModel2.height);
        urlModel2.urlKey = urlStructV2.url_key == null ? urlModel2.urlKey : urlStructV2.url_key;
        urlModel2.size = a.a(urlStructV2.data_size, urlModel2.size);
        urlModel2.fileHash = urlStructV2.file_hash == null ? urlModel2.fileHash : urlStructV2.file_hash;
        return urlModel2;
    }

    public static VideoUrlModel tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(tiktok.kids.proto.UrlStructV2 urlStructV2, VideoUrlModel videoUrlModel) {
        if (urlStructV2 == null) {
            return videoUrlModel;
        }
        VideoUrlModel videoUrlModel2 = new VideoUrlModel();
        videoUrlModel2.uri = urlStructV2.uri == null ? videoUrlModel2.uri : urlStructV2.uri;
        videoUrlModel2.urlList = urlStructV2.url_list == null ? videoUrlModel2.urlList : urlStructV2.url_list;
        videoUrlModel2.width = a.a(urlStructV2.width, videoUrlModel2.width);
        videoUrlModel2.height = a.a(urlStructV2.height, videoUrlModel2.height);
        videoUrlModel2.urlKey = urlStructV2.url_key == null ? videoUrlModel2.urlKey : urlStructV2.url_key;
        videoUrlModel2.size = a.a(urlStructV2.data_size, videoUrlModel2.size);
        videoUrlModel2.fileHash = urlStructV2.file_hash == null ? videoUrlModel2.fileHash : urlStructV2.file_hash;
        videoUrlModel2.fileCheckSum = urlStructV2.file_cs == null ? videoUrlModel2.fileCheckSum : urlStructV2.file_cs;
        return videoUrlModel2;
    }

    public static User tiktok$kids$proto$UserStructV2$$com$ss$android$ugc$aweme$profile$model$User(tiktok.kids.proto.UserStructV2 userStructV2, User user) {
        if (userStructV2 == null) {
            return user;
        }
        User user2 = new User();
        user2.uid = userStructV2.uid == null ? user2.uid : userStructV2.uid;
        user2.shortId = userStructV2.short_id == null ? user2.shortId : userStructV2.short_id;
        user2.nickname = userStructV2.nickname == null ? user2.nickname : userStructV2.nickname;
        user2.avatarLarger = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.avatar_larger, user2.avatarLarger);
        user2.avatarThumb = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.avatar_thumb, user2.avatarThumb);
        user2.avatarMedium = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.avatar_medium, user2.avatarMedium);
        user2.customVerify = userStructV2.custom_verify == null ? user2.customVerify : userStructV2.custom_verify;
        user2.uniqueId = userStructV2.unique_id == null ? user2.uniqueId : userStructV2.unique_id;
        user2.secUid = userStructV2.sec_uid == null ? user2.secUid : userStructV2.sec_uid;
        user2.region = userStructV2.region == null ? user2.region : userStructV2.region;
        user2.accountRegion = userStructV2.account_region == null ? user2.accountRegion : userStructV2.account_region;
        user2.secret = a.a(userStructV2.secret, user2.secret);
        user2.typeLabels = List$java$lang$Long$$ArrayJ(userStructV2.type_label, user2.typeLabels);
        user2.unique_id_modify_time = a.a(userStructV2.unique_id_modify_time, user2.unique_id_modify_time);
        user2.userCancelled = a.a(userStructV2.user_canceled, user2.userCancelled);
        user2.registerTime = a.a(userStructV2.register_time, user2.registerTime);
        user2.createTime = userStructV2.create_time == null ? user2.createTime : userStructV2.create_time;
        user2.country = userStructV2.country == null ? user2.country : userStructV2.country;
        user2.coverUrls = List$tiktok$kids$proto$UrlStructV2$$List$com$ss$android$ugc$aweme$base$model$UrlModel(userStructV2.cover_url, user2.coverUrls);
        user2.isoCountryCode = userStructV2.iso_country_code == null ? user2.isoCountryCode : userStructV2.iso_country_code;
        user2.language = userStructV2.language == null ? user2.language : userStructV2.language;
        user2.remarkName = userStructV2.remark_name == null ? user2.remarkName : userStructV2.remark_name;
        user2.userMode = a.a(userStructV2.user_mode, user2.userMode);
        user2.userPeriod = a.a(userStructV2.user_period, user2.userPeriod);
        user2.isStar = a.a(userStructV2.is_star, user2.isStar);
        return user2;
    }

    public static Video tiktok$kids$proto$VideoStructV2$$com$ss$android$ugc$aweme$feed$model$Video(tiktok.kids.proto.VideoStructV2 videoStructV2, Video video) {
        if (videoStructV2 == null) {
            return video;
        }
        Video video2 = new Video();
        video2.playAddr = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(videoStructV2.play_addr, video2.playAddr);
        video2.cover = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoStructV2.cover, video2.cover);
        video2.height = a.a(videoStructV2.height, video2.height);
        video2.width = a.a(videoStructV2.width, video2.width);
        video2.dynamicCover = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoStructV2.dynamic_cover, video2.dynamicCover);
        video2.originCover = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$base$model$UrlModel(videoStructV2.origin_cover, video2.originCover);
        video2.ratio = videoStructV2.ratio == null ? video2.ratio : videoStructV2.ratio;
        video2.bitRate = List$tiktok$kids$proto$BitRateStructV2$$List$com$ss$android$ugc$aweme$feed$model$BitRate(videoStructV2.bit_rate, video2.bitRate);
        video2.videoLength = a.a(videoStructV2.duration, video2.videoLength);
        video2.h264PlayAddr = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(videoStructV2.play_addr_h264, video2.h264PlayAddr);
        video2.isLongVideo = a.a(videoStructV2.is_long_video, video2.isLongVideo);
        video2.dVideoModel = videoStructV2.video_model == null ? video2.dVideoModel : videoStructV2.video_model;
        video2.needSetCookie = a.a(videoStructV2.need_set_token, video2.needSetCookie);
        video2.drmTokenAuth = tiktok$kids$proto$PlayTokenAuthStructV2$$com$ss$android$ugc$aweme$feed$model$video$PlayTokenAuth(videoStructV2.token_auth, video2.drmTokenAuth);
        video2.playAddrBytevc1 = tiktok$kids$proto$UrlStructV2$$com$ss$android$ugc$aweme$feed$model$VideoUrlModel(videoStructV2.play_addr_bytevc1, video2.playAddrBytevc1);
        return video2;
    }

    public static KFeedItemList tiktok$kids$proto$tiktok_v1_kids_feed_response$$com$ss$android$ugc$aweme$kids$recommendfeed$model$KFeedItemList(tiktok_v1_kids_feed_response tiktok_v1_kids_feed_response, KFeedItemList kFeedItemList) {
        if (tiktok_v1_kids_feed_response == null) {
            return kFeedItemList;
        }
        KFeedItemList kFeedItemList2 = new KFeedItemList();
        kFeedItemList2.statusCode = a.a(tiktok_v1_kids_feed_response.status_code, kFeedItemList2.statusCode);
        kFeedItemList2.minCursor = a.a(tiktok_v1_kids_feed_response.min_cursor, kFeedItemList2.minCursor);
        kFeedItemList2.maxCursor = a.a(tiktok_v1_kids_feed_response.max_cursor, kFeedItemList2.maxCursor);
        kFeedItemList2.hasMore = a.a(tiktok_v1_kids_feed_response.has_more, kFeedItemList2.hasMore);
        kFeedItemList2.items = List$tiktok$kids$proto$AwemeStructV2$$List$com$ss$android$ugc$aweme$feed$model$Aweme(tiktok_v1_kids_feed_response.aweme_list, kFeedItemList2.items);
        kFeedItemList2.requestId = tiktok_v1_kids_feed_response.rid == null ? kFeedItemList2.requestId : tiktok_v1_kids_feed_response.rid;
        kFeedItemList2.refreshClear = a.a(tiktok_v1_kids_feed_response.refresh_clear, kFeedItemList2.refreshClear);
        kFeedItemList2.logPb = tiktok$kids$proto$LogPbStructV2$$com$ss$android$ugc$aweme$feed$model$LogPbBean(tiktok_v1_kids_feed_response.log_pb, kFeedItemList2.logPb);
        kFeedItemList2.blockCode = a.a(tiktok_v1_kids_feed_response.block_code, kFeedItemList2.blockCode);
        kFeedItemList2.statusMsg = tiktok_v1_kids_feed_response.status_msg == null ? kFeedItemList2.statusMsg : tiktok_v1_kids_feed_response.status_msg;
        return kFeedItemList2;
    }
}
