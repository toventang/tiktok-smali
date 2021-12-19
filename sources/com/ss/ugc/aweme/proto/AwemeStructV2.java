package com.ss.ugc.aweme.proto;

import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.c.a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.ss.android.ugc.playerkit.model.v;
import java.util.List;
import k.i;

public final class AwemeStructV2 extends Message<AwemeStructV2, Builder> {
    public static final ProtoAdapter<AwemeStructV2> ADAPTER = new ProtoAdapter_AwemeStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeACLStructV2#ADAPTER", tag = 119)
    public AwemeACLStructV2 acl_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeActivityStructV2#ADAPTER", tag = 139)
    public AwemeActivityStructV2 activity;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CommerceActivityStructV2#ADAPTER", tag = 77)
    public CommerceActivityStructV2 activity_pendant;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 108)
    public Integer ad_aweme_source;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 95)
    public Integer ad_link_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 88)
    public String ad_order_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 53)
    public String ad_schedule;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 161)
    public Boolean allow_gift;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AnchorStructV2#ADAPTER", tag = 111)
    public AnchorStructV2 anchor;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeAnchorStructV2#ADAPTER", tag = 121)
    public AwemeAnchorStructV2 anchor_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AnchorCommonStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 132)
    public List<AnchorCommonStructV2> anchors;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 160)
    public String anchors_extras;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AudioStructV2#ADAPTER", tag = 186)
    public AudioStructV2 audio;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UserStructV2#ADAPTER", tag = 4)
    public UserStructV2 author;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = BuildConfig.VERSION_CODE)
    public Long author_user_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeACLStructV2#ADAPTER", tag = 138)
    public AwemeACLStructV2 aweme_acl;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeControlStructV2#ADAPTER", tag = 109)
    public AwemeControlStructV2 aweme_control;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 30)
    public Integer aweme_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.BannerTipV2#ADAPTER", tag = 118)
    public BannerTipV2 banner_tip;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 45)
    public Integer bodydance_score;
    @WireField(adapter = "com.ss.ugc.aweme.proto.BoostStructV2#ADAPTER", tag = 164)
    public BoostStructV2 boost_tag_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.BottomBarStructV2#ADAPTER", tag = 165)
    public BottomBarStructV2 bottom_bar;
    @WireField(adapter = "com.ss.ugc.aweme.proto.WebcastRoomFeedCellStructV2#ADAPTER", tag = 126)
    public WebcastRoomFeedCellStructV2 cell_room;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ChallengeStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public List<ChallengeStructV2> cha_list;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PositionStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 67)
    public List<PositionStructV2> challenge_position;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 151)
    public String city;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 35)
    public Boolean cmt_swt;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CNYStructV2#ADAPTER", tag = 123)
    public CNYStructV2 cny_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 54)
    public Integer collect_stat;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CommerceConfigDataV2#ADAPTER", label = WireField.Label.REPEATED, tag = 102)
    public List<CommerceConfigDataV2> commerce_config_data;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeCommerceStructV2#ADAPTER", tag = 116)
    public AwemeCommerceStructV2 commerce_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeCommerceStickerStructV2#ADAPTER", tag = 103)
    public AwemeCommerceStickerStructV2 commerce_sticker_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = com.bytedance.vcloud.mlcomponent_api.BuildConfig.VERSION_CODE)
    public String content_desc;
    @WireField(adapter = "com.ss.ugc.aweme.proto.TextExtraStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 191)
    public List<TextExtraStructV2> content_desc_extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long create_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 188)
    public Integer deduplication_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 91)
    public String desc_language;
    @WireField(adapter = "com.ss.ugc.aweme.proto.DescendantStructV2#ADAPTER", tag = 69)
    public DescendantStructV2 descendants;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 204)
    public Boolean disable_search_trending_bar;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 21)
    public String distance;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 105)
    public Integer distribute_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeSearchStructV2#ADAPTER", tag = 137)
    public AwemeSearchStructV2 dou_discount_mix_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.DuetInfoV2#ADAPTER", tag = 193)
    public DuetInfoV2 duet_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 29)
    public Integer duration;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 197)
    public Boolean enable_ad_drop;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 196)
    public Boolean enable_pos_adjust;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 104)
    public Boolean enable_top_view;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public String extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 194)
    public String extra_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.RelationLabelStructV2#ADAPTER", tag = 112)
    public RelationLabelStructV2 feed_relation_label;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeFloatingCardStructV2#ADAPTER", tag = 92)
    public AwemeFloatingCardStructV2 floating_card_content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 201)
    public Long follow_up_publish_from_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 59)
    public String forward_comment_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeStructV2#ADAPTER", tag = 58)
    public AwemeStructV2 forward_item;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 62)
    public String forward_item_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.GameStructV2#ADAPTER", tag = 71)
    public GameStructV2 game_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REPEATED, tag = 199)
    public List<Integer> gap_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 46)
    public List<String> geofencing;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 150)
    public List<String> geofencing_regions;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CommerceActivityStructV2#ADAPTER", tag = 76)
    public CommerceActivityStructV2 gesture_red_packet;
    @WireField(adapter = "com.ss.ugc.aweme.proto.GreenScreenMaterialV2#ADAPTER", label = WireField.Label.REPEATED, tag = 172)
    public List<GreenScreenMaterialV2> green_screen_materials;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 63)
    public String group_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 110)
    public Boolean has_vs_entry;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeSearchStructV2#ADAPTER", tag = 82)
    public AwemeSearchStructV2 hot_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.HotListStructV2#ADAPTER", tag = 115)
    public HotListStructV2 hot_list;
    @WireField(adapter = "com.ss.ugc.aweme.proto.HybridLabelStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 133)
    public List<HybridLabelStructV2> hybrid_label;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ImageInfoStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 36)
    public List<ImageInfoStructV2> image_infos;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ImageConsumptionInfoV2#ADAPTER", tag = 205)
    public ImageConsumptionInfoV2 image_post_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.InteractPermissionV2#ADAPTER", tag = 182)
    public InteractPermissionV2 interact_permission;
    @WireField(adapter = "com.ss.ugc.aweme.proto.InteractionStickerStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 93)
    public List<InteractionStickerStructV2> interaction_stickers;
    @WireField(adapter = "com.ss.ugc.aweme.proto.InteractionTagInfoV2#ADAPTER", tag = 189)
    public InteractionTagInfoV2 interaction_tag_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 27)
    public Boolean is_ads;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 200)
    public Boolean is_client_cache;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 107)
    public Integer is_effect_designer;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 124)
    public Boolean is_familiar;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 47)
    public Integer is_hash_tag;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 149)
    public Boolean is_horizontal;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 48)
    public Boolean is_pgcshow;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 38)
    public Boolean is_relieve;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 141)
    public Integer is_story;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 17)
    public Integer is_top;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 25)
    public Boolean is_vr;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 68)
    public Integer item_comment_settings;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 183)
    public String item_distribute_source;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 80)
    public Integer item_duet;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 81)
    public Integer item_react;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 195)
    public Integer item_source_category;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 143)
    public Integer item_stitch;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 39)
    public UrlStructV2 label_friend;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 15)
    public UrlStructV2 label_large;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 22)
    public UrlStructV2 label_music_starter;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 84)
    public String label_music_starter_text;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = v.U)
    public UrlStructV2 label_origin_author;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 23)
    public UrlStructV2 label_private;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 16)
    public UrlStructV2 label_thumb;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = LiveRechargeAgeThresholdSetting.DEFAULT)
    public UrlStructV2 label_top;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VideoTextStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 55)
    public List<VideoTextStructV2> label_top_text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 26)
    public String landing_page;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 74)
    public String link_ad_data;
    @WireField(adapter = "com.ss.ugc.aweme.proto.LinkMatchStructV2#ADAPTER", tag = 130)
    public LinkMatchStructV2 link_match;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 127)
    public String live_reason;
    @WireField(adapter = "com.ss.ugc.aweme.proto.LongVideoStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 79)
    public List<LongVideoStructV2> long_video;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MaskStructV2#ADAPTER", tag = 129)
    public MaskStructV2 mask_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MaskStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 163)
    public List<MaskStructV2> mask_infos;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MicroAppStructV2#ADAPTER", tag = 72)
    public MicroAppStructV2 micro_app_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 99)
    public String misc_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MixStructV2#ADAPTER", tag = 113)
    public MixStructV2 mix_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MusicStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public MusicStructV2 music;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MusicDspStructV2#ADAPTER", tag = 203)
    public MusicDspStructV2 music_dsp_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MutualStructV2#ADAPTER", tag = 162)
    public MutualStructV2 mutual_relation;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MutualStructV2#ADAPTER", tag = 154)
    public MutualStructV2 mutual_relation_tmp;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 125)
    public Boolean need_vs_entry;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PositionStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 66)
    public List<PositionStructV2> nickname_position;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 89)
    public String open_platform_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 101)
    public List<String> origin_comment_ids;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 171)
    public String part_n;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 170)
    public Boolean playlist_blocked;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PlaylistInfoV2#ADAPTER", tag = 167)
    public PlaylistInfoV2 playlist_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PositionStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 41)
    public List<PositionStructV2> position;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 64)
    public String pre_forward_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 198)
    public Integer pred_playtime;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PreloadStructV2#ADAPTER", tag = 86)
    public PreloadStructV2 preload;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 65)
    public Boolean prevent_download;
    @WireField(adapter = "com.ss.ugc.aweme.proto.QuestionInfoV2#ADAPTER", label = WireField.Label.REPEATED, tag = 185)
    public List<QuestionInfoV2> question_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_MAX_BITRATE)
    public Integer rate;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 70)
    public String raw_ad_data;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 49)
    public String region;
    @WireField(adapter = "com.ss.ugc.aweme.proto.RelationRecommendStructV2#ADAPTER", tag = 134)
    public RelationRecommendStructV2 relation_recommend_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeRiskStructV2#ADAPTER", tag = 37)
    public AwemeRiskStructV2 risk_infos;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ShareStructV2#ADAPTER", tag = 19)
    public ShareStructV2 share_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public String share_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 147)
    public Boolean show_sticker_guide;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 98)
    public String simple_promotions;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 114)
    public String simple_shop_seeding;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 40)
    public String sort_label;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 168)
    public Integer sound_exemption;
    @WireField(adapter = "com.ss.ugc.aweme.proto.SpecialStickerStructV2#ADAPTER", tag = 52)
    public SpecialStickerStructV2 sp_sticker;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeStarAtlasStructV2#ADAPTER", tag = 90)
    public AwemeStarAtlasStructV2 star_atlas_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 83)
    public Long star_atlas_order_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 87)
    public String star_recommend_tag;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeStatisticsStructV2#ADAPTER", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public AwemeStatisticsStructV2 statistics;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeStatusStructV2#ADAPTER", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public AwemeStatusStructV2 status;
    @WireField(adapter = "com.ss.ugc.aweme.proto.NewFaceStickerStructV2#ADAPTER", tag = 78)
    public NewFaceStickerStructV2 sticker_detail;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 57)
    public String stickers;
    @WireField(adapter = "com.ss.ugc.aweme.proto.StitchV2#ADAPTER", tag = 169)
    public StitchV2 stitch;
    @WireField(adapter = "com.ss.ugc.aweme.proto.StitchPermissionStructV2#ADAPTER", tag = 173)
    public StitchPermissionStructV2 stitch_permission;
    @WireField(adapter = "com.ss.ugc.aweme.proto.StoryMetadataV2#ADAPTER", tag = 181)
    public StoryMetadataV2 story_metadata;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 148)
    public Integer story_ttl;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 97)
    public String take_down_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 96)
    public Integer take_down_reason;
    @WireField(adapter = "com.ss.ugc.aweme.proto.TextExtraStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = ABRConfig.ABR_SELECT_SCENE)
    public List<TextExtraStructV2> text_extra;
    @WireField(adapter = "com.ss.ugc.aweme.proto.TrendingBarStructV2#ADAPTER", tag = 174)
    public TrendingBarStructV2 trending_bar;
    @WireField(adapter = "com.ss.ugc.aweme.proto.TrendingBarForYouPageStructV2#ADAPTER", tag = 202)
    public TrendingBarForYouPageStructV2 trending_bar_fyp;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PositionStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 42)
    public List<PositionStructV2> uniqid_position;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UpvoteReasonV2#ADAPTER", tag = 187)
    public UpvoteReasonV2 upvote_reason;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public Integer user_digged;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UserProfileStructV2#ADAPTER", tag = 135)
    public UserProfileStructV2 user_profile_init_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UserStoryV2#ADAPTER", tag = LiveFeedRefreshTimeSetting.DEFAULT)
    public UserStoryV2 user_story;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VideoStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public VideoStructV2 video;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VideoControlV2#ADAPTER", tag = 106)
    public VideoControlV2 video_control;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 128)
    public String video_feed_tag;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeLabelStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 24)
    public List<AwemeLabelStructV2> video_labels;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VideoReplyStructV2#ADAPTER", tag = 131)
    public VideoReplyStructV2 video_reply_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VideoTextStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 50)
    public List<VideoTextStructV2> video_text;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VPAInfoStructV2#ADAPTER", tag = 122)
    public VPAInfoStructV2 vpa_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.VisualSearchEntryStructV2#ADAPTER", tag = 142)
    public VisualSearchEntryStructV2 vs_entry;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 73)
    public Boolean with_promotional_music;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 136)
    public Boolean with_survey;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 85)
    public Boolean without_watermark;

    public AwemeStructV2() {
    }

    public AwemeStructV2(String str, String str2, Long l2, UserStructV2 userStructV2, MusicStructV2 musicStructV2, List<ChallengeStructV2> list, VideoStructV2 videoStructV2, String str3, Integer num, AwemeStatisticsStructV2 awemeStatisticsStructV2, AwemeStatusStructV2 awemeStatusStructV2, String str4, Integer num2, List<TextExtraStructV2> list2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Integer num3, UrlStructV2 urlStructV23, ShareStructV2 shareStructV2, UrlStructV2 urlStructV24, String str5, UrlStructV2 urlStructV25, UrlStructV2 urlStructV26, List<AwemeLabelStructV2> list3, Boolean bool, String str6, Boolean bool2, Integer num4, Integer num5, Boolean bool3, List<ImageInfoStructV2> list4, AwemeRiskStructV2 awemeRiskStructV2, Boolean bool4, UrlStructV2 urlStructV27, String str7, List<PositionStructV2> list5, List<PositionStructV2> list6, Long l3, Integer num6, List<String> list7, Integer num7, Boolean bool5, String str8, List<VideoTextStructV2> list8, SpecialStickerStructV2 specialStickerStructV2, String str9, Integer num8, List<VideoTextStructV2> list9, String str10, AwemeStructV2 awemeStructV2, String str11, String str12, String str13, String str14, Boolean bool6, List<PositionStructV2> list10, List<PositionStructV2> list11, Integer num9, DescendantStructV2 descendantStructV2, String str15, GameStructV2 gameStructV2, MicroAppStructV2 microAppStructV2, Boolean bool7, String str16, CommerceActivityStructV2 commerceActivityStructV2, CommerceActivityStructV2 commerceActivityStructV22, NewFaceStickerStructV2 newFaceStickerStructV2, List<LongVideoStructV2> list12, Integer num10, Integer num11, AwemeSearchStructV2 awemeSearchStructV2, Long l4, String str17, Boolean bool8, PreloadStructV2 preloadStructV2, String str18, String str19, String str20, AwemeStarAtlasStructV2 awemeStarAtlasStructV2, String str21, AwemeFloatingCardStructV2 awemeFloatingCardStructV2, List<InteractionStickerStructV2> list13, Integer num12, Integer num13, String str22, String str23, String str24, List<String> list14, List<CommerceConfigDataV2> list15, AwemeCommerceStickerStructV2 awemeCommerceStickerStructV2, Boolean bool9, Integer num14, VideoControlV2 videoControlV2, Integer num15, Integer num16, AwemeControlStructV2 awemeControlStructV2, Boolean bool10, AnchorStructV2 anchorStructV2, RelationLabelStructV2 relationLabelStructV2, MixStructV2 mixStructV2, String str25, HotListStructV2 hotListStructV2, AwemeCommerceStructV2 awemeCommerceStructV2, BannerTipV2 bannerTipV2, AwemeACLStructV2 awemeACLStructV2, AwemeAnchorStructV2 awemeAnchorStructV2, VPAInfoStructV2 vPAInfoStructV2, CNYStructV2 cNYStructV2, Boolean bool11, Boolean bool12, WebcastRoomFeedCellStructV2 webcastRoomFeedCellStructV2, String str26, String str27, MaskStructV2 maskStructV2, LinkMatchStructV2 linkMatchStructV2, VideoReplyStructV2 videoReplyStructV2, List<AnchorCommonStructV2> list16, List<HybridLabelStructV2> list17, RelationRecommendStructV2 relationRecommendStructV2, UserProfileStructV2 userProfileStructV2, Boolean bool13, AwemeSearchStructV2 awemeSearchStructV22, AwemeACLStructV2 awemeACLStructV22, AwemeActivityStructV2 awemeActivityStructV2, Integer num17, VisualSearchEntryStructV2 visualSearchEntryStructV2, Integer num18, Boolean bool14, Integer num19, Boolean bool15, List<String> list18, String str28, MutualStructV2 mutualStructV2, String str29, Boolean bool16, MutualStructV2 mutualStructV22, List<MaskStructV2> list19, BoostStructV2 boostStructV2, BottomBarStructV2 bottomBarStructV2, PlaylistInfoV2 playlistInfoV2, Integer num20, StitchV2 stitchV2, Boolean bool17, String str30, List<GreenScreenMaterialV2> list20, StitchPermissionStructV2 stitchPermissionStructV2, TrendingBarStructV2 trendingBarStructV2, UserStoryV2 userStoryV2, StoryMetadataV2 storyMetadataV2, InteractPermissionV2 interactPermissionV2, String str31, List<QuestionInfoV2> list21, AudioStructV2 audioStructV2, UpvoteReasonV2 upvoteReasonV2, Integer num21, InteractionTagInfoV2 interactionTagInfoV2, String str32, List<TextExtraStructV2> list22, DuetInfoV2 duetInfoV2, String str33, Integer num22, Boolean bool18, Boolean bool19, Integer num23, List<Integer> list23, Boolean bool20, Long l5, TrendingBarForYouPageStructV2 trendingBarForYouPageStructV2, MusicDspStructV2 musicDspStructV2, Boolean bool21, ImageConsumptionInfoV2 imageConsumptionInfoV2) {
        this(str, str2, l2, userStructV2, musicStructV2, list, videoStructV2, str3, num, awemeStatisticsStructV2, awemeStatusStructV2, str4, num2, list2, urlStructV2, urlStructV22, num3, urlStructV23, shareStructV2, urlStructV24, str5, urlStructV25, urlStructV26, list3, bool, str6, bool2, num4, num5, bool3, list4, awemeRiskStructV2, bool4, urlStructV27, str7, list5, list6, l3, num6, list7, num7, bool5, str8, list8, specialStickerStructV2, str9, num8, list9, str10, awemeStructV2, str11, str12, str13, str14, bool6, list10, list11, num9, descendantStructV2, str15, gameStructV2, microAppStructV2, bool7, str16, commerceActivityStructV2, commerceActivityStructV22, newFaceStickerStructV2, list12, num10, num11, awemeSearchStructV2, l4, str17, bool8, preloadStructV2, str18, str19, str20, awemeStarAtlasStructV2, str21, awemeFloatingCardStructV2, list13, num12, num13, str22, str23, str24, list14, list15, awemeCommerceStickerStructV2, bool9, num14, videoControlV2, num15, num16, awemeControlStructV2, bool10, anchorStructV2, relationLabelStructV2, mixStructV2, str25, hotListStructV2, awemeCommerceStructV2, bannerTipV2, awemeACLStructV2, awemeAnchorStructV2, vPAInfoStructV2, cNYStructV2, bool11, bool12, webcastRoomFeedCellStructV2, str26, str27, maskStructV2, linkMatchStructV2, videoReplyStructV2, list16, list17, relationRecommendStructV2, userProfileStructV2, bool13, awemeSearchStructV22, awemeACLStructV22, awemeActivityStructV2, num17, visualSearchEntryStructV2, num18, bool14, num19, bool15, list18, str28, mutualStructV2, str29, bool16, mutualStructV22, list19, boostStructV2, bottomBarStructV2, playlistInfoV2, num20, stitchV2, bool17, str30, list20, stitchPermissionStructV2, trendingBarStructV2, userStoryV2, storyMetadataV2, interactPermissionV2, str31, list21, audioStructV2, upvoteReasonV2, num21, interactionTagInfoV2, str32, list22, duetInfoV2, str33, num22, bool18, bool19, num23, list23, bool20, l5, trendingBarForYouPageStructV2, musicDspStructV2, bool21, imageConsumptionInfoV2, i.EMPTY);
    }

    public AwemeStructV2(String str, String str2, Long l2, UserStructV2 userStructV2, MusicStructV2 musicStructV2, List<ChallengeStructV2> list, VideoStructV2 videoStructV2, String str3, Integer num, AwemeStatisticsStructV2 awemeStatisticsStructV2, AwemeStatusStructV2 awemeStatusStructV2, String str4, Integer num2, List<TextExtraStructV2> list2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Integer num3, UrlStructV2 urlStructV23, ShareStructV2 shareStructV2, UrlStructV2 urlStructV24, String str5, UrlStructV2 urlStructV25, UrlStructV2 urlStructV26, List<AwemeLabelStructV2> list3, Boolean bool, String str6, Boolean bool2, Integer num4, Integer num5, Boolean bool3, List<ImageInfoStructV2> list4, AwemeRiskStructV2 awemeRiskStructV2, Boolean bool4, UrlStructV2 urlStructV27, String str7, List<PositionStructV2> list5, List<PositionStructV2> list6, Long l3, Integer num6, List<String> list7, Integer num7, Boolean bool5, String str8, List<VideoTextStructV2> list8, SpecialStickerStructV2 specialStickerStructV2, String str9, Integer num8, List<VideoTextStructV2> list9, String str10, AwemeStructV2 awemeStructV2, String str11, String str12, String str13, String str14, Boolean bool6, List<PositionStructV2> list10, List<PositionStructV2> list11, Integer num9, DescendantStructV2 descendantStructV2, String str15, GameStructV2 gameStructV2, MicroAppStructV2 microAppStructV2, Boolean bool7, String str16, CommerceActivityStructV2 commerceActivityStructV2, CommerceActivityStructV2 commerceActivityStructV22, NewFaceStickerStructV2 newFaceStickerStructV2, List<LongVideoStructV2> list12, Integer num10, Integer num11, AwemeSearchStructV2 awemeSearchStructV2, Long l4, String str17, Boolean bool8, PreloadStructV2 preloadStructV2, String str18, String str19, String str20, AwemeStarAtlasStructV2 awemeStarAtlasStructV2, String str21, AwemeFloatingCardStructV2 awemeFloatingCardStructV2, List<InteractionStickerStructV2> list13, Integer num12, Integer num13, String str22, String str23, String str24, List<String> list14, List<CommerceConfigDataV2> list15, AwemeCommerceStickerStructV2 awemeCommerceStickerStructV2, Boolean bool9, Integer num14, VideoControlV2 videoControlV2, Integer num15, Integer num16, AwemeControlStructV2 awemeControlStructV2, Boolean bool10, AnchorStructV2 anchorStructV2, RelationLabelStructV2 relationLabelStructV2, MixStructV2 mixStructV2, String str25, HotListStructV2 hotListStructV2, AwemeCommerceStructV2 awemeCommerceStructV2, BannerTipV2 bannerTipV2, AwemeACLStructV2 awemeACLStructV2, AwemeAnchorStructV2 awemeAnchorStructV2, VPAInfoStructV2 vPAInfoStructV2, CNYStructV2 cNYStructV2, Boolean bool11, Boolean bool12, WebcastRoomFeedCellStructV2 webcastRoomFeedCellStructV2, String str26, String str27, MaskStructV2 maskStructV2, LinkMatchStructV2 linkMatchStructV2, VideoReplyStructV2 videoReplyStructV2, List<AnchorCommonStructV2> list16, List<HybridLabelStructV2> list17, RelationRecommendStructV2 relationRecommendStructV2, UserProfileStructV2 userProfileStructV2, Boolean bool13, AwemeSearchStructV2 awemeSearchStructV22, AwemeACLStructV2 awemeACLStructV22, AwemeActivityStructV2 awemeActivityStructV2, Integer num17, VisualSearchEntryStructV2 visualSearchEntryStructV2, Integer num18, Boolean bool14, Integer num19, Boolean bool15, List<String> list18, String str28, MutualStructV2 mutualStructV2, String str29, Boolean bool16, MutualStructV2 mutualStructV22, List<MaskStructV2> list19, BoostStructV2 boostStructV2, BottomBarStructV2 bottomBarStructV2, PlaylistInfoV2 playlistInfoV2, Integer num20, StitchV2 stitchV2, Boolean bool17, String str30, List<GreenScreenMaterialV2> list20, StitchPermissionStructV2 stitchPermissionStructV2, TrendingBarStructV2 trendingBarStructV2, UserStoryV2 userStoryV2, StoryMetadataV2 storyMetadataV2, InteractPermissionV2 interactPermissionV2, String str31, List<QuestionInfoV2> list21, AudioStructV2 audioStructV2, UpvoteReasonV2 upvoteReasonV2, Integer num21, InteractionTagInfoV2 interactionTagInfoV2, String str32, List<TextExtraStructV2> list22, DuetInfoV2 duetInfoV2, String str33, Integer num22, Boolean bool18, Boolean bool19, Integer num23, List<Integer> list23, Boolean bool20, Long l5, TrendingBarForYouPageStructV2 trendingBarForYouPageStructV2, MusicDspStructV2 musicDspStructV2, Boolean bool21, ImageConsumptionInfoV2 imageConsumptionInfoV2, i iVar) {
        super(ADAPTER, iVar);
        this.aweme_id = str;
        this.desc = str2;
        this.create_time = l2;
        this.author = userStructV2;
        this.music = musicStructV2;
        this.cha_list = Internal.immutableCopyOf("cha_list", list);
        this.video = videoStructV2;
        this.share_url = str3;
        this.user_digged = num;
        this.statistics = awemeStatisticsStructV2;
        this.status = awemeStatusStructV2;
        this.extra = str4;
        this.rate = num2;
        this.text_extra = Internal.immutableCopyOf("text_extra", list2);
        this.label_large = urlStructV2;
        this.label_thumb = urlStructV22;
        this.is_top = num3;
        this.label_top = urlStructV23;
        this.share_info = shareStructV2;
        this.label_origin_author = urlStructV24;
        this.distance = str5;
        this.label_music_starter = urlStructV25;
        this.label_private = urlStructV26;
        this.video_labels = Internal.immutableCopyOf("video_labels", list3);
        this.is_vr = bool;
        this.landing_page = str6;
        this.is_ads = bool2;
        this.duration = num4;
        this.aweme_type = num5;
        this.cmt_swt = bool3;
        this.image_infos = Internal.immutableCopyOf("image_infos", list4);
        this.risk_infos = awemeRiskStructV2;
        this.is_relieve = bool4;
        this.label_friend = urlStructV27;
        this.sort_label = str7;
        this.position = Internal.immutableCopyOf("position", list5);
        this.uniqid_position = Internal.immutableCopyOf("uniqid_position", list6);
        this.author_user_id = l3;
        this.bodydance_score = num6;
        this.geofencing = Internal.immutableCopyOf("geofencing", list7);
        this.is_hash_tag = num7;
        this.is_pgcshow = bool5;
        this.region = str8;
        this.video_text = Internal.immutableCopyOf("video_text", list8);
        this.sp_sticker = specialStickerStructV2;
        this.ad_schedule = str9;
        this.collect_stat = num8;
        this.label_top_text = Internal.immutableCopyOf("label_top_text", list9);
        this.stickers = str10;
        this.forward_item = awemeStructV2;
        this.forward_comment_id = str11;
        this.forward_item_id = str12;
        this.group_id = str13;
        this.pre_forward_id = str14;
        this.prevent_download = bool6;
        this.nickname_position = Internal.immutableCopyOf("nickname_position", list10);
        this.challenge_position = Internal.immutableCopyOf("challenge_position", list11);
        this.item_comment_settings = num9;
        this.descendants = descendantStructV2;
        this.raw_ad_data = str15;
        this.game_info = gameStructV2;
        this.micro_app_info = microAppStructV2;
        this.with_promotional_music = bool7;
        this.link_ad_data = str16;
        this.gesture_red_packet = commerceActivityStructV2;
        this.activity_pendant = commerceActivityStructV22;
        this.sticker_detail = newFaceStickerStructV2;
        this.long_video = Internal.immutableCopyOf("long_video", list12);
        this.item_duet = num10;
        this.item_react = num11;
        this.hot_info = awemeSearchStructV2;
        this.star_atlas_order_id = l4;
        this.label_music_starter_text = str17;
        this.without_watermark = bool8;
        this.preload = preloadStructV2;
        this.star_recommend_tag = str18;
        this.ad_order_id = str19;
        this.open_platform_name = str20;
        this.star_atlas_info = awemeStarAtlasStructV2;
        this.desc_language = str21;
        this.floating_card_content = awemeFloatingCardStructV2;
        this.interaction_stickers = Internal.immutableCopyOf("interaction_stickers", list13);
        this.ad_link_type = num12;
        this.take_down_reason = num13;
        this.take_down_desc = str22;
        this.simple_promotions = str23;
        this.misc_info = str24;
        this.origin_comment_ids = Internal.immutableCopyOf("origin_comment_ids", list14);
        this.commerce_config_data = Internal.immutableCopyOf("commerce_config_data", list15);
        this.commerce_sticker_info = awemeCommerceStickerStructV2;
        this.enable_top_view = bool9;
        this.distribute_type = num14;
        this.video_control = videoControlV2;
        this.is_effect_designer = num15;
        this.ad_aweme_source = num16;
        this.aweme_control = awemeControlStructV2;
        this.has_vs_entry = bool10;
        this.anchor = anchorStructV2;
        this.feed_relation_label = relationLabelStructV2;
        this.mix_info = mixStructV2;
        this.simple_shop_seeding = str25;
        this.hot_list = hotListStructV2;
        this.commerce_info = awemeCommerceStructV2;
        this.banner_tip = bannerTipV2;
        this.acl_info = awemeACLStructV2;
        this.anchor_info = awemeAnchorStructV2;
        this.vpa_info = vPAInfoStructV2;
        this.cny_info = cNYStructV2;
        this.is_familiar = bool11;
        this.need_vs_entry = bool12;
        this.cell_room = webcastRoomFeedCellStructV2;
        this.live_reason = str26;
        this.video_feed_tag = str27;
        this.mask_info = maskStructV2;
        this.link_match = linkMatchStructV2;
        this.video_reply_info = videoReplyStructV2;
        this.anchors = Internal.immutableCopyOf("anchors", list16);
        this.hybrid_label = Internal.immutableCopyOf("hybrid_label", list17);
        this.relation_recommend_info = relationRecommendStructV2;
        this.user_profile_init_info = userProfileStructV2;
        this.with_survey = bool13;
        this.dou_discount_mix_info = awemeSearchStructV22;
        this.aweme_acl = awemeACLStructV22;
        this.activity = awemeActivityStructV2;
        this.is_story = num17;
        this.vs_entry = visualSearchEntryStructV2;
        this.item_stitch = num18;
        this.show_sticker_guide = bool14;
        this.story_ttl = num19;
        this.is_horizontal = bool15;
        this.geofencing_regions = Internal.immutableCopyOf("geofencing_regions", list18);
        this.city = str28;
        this.mutual_relation_tmp = mutualStructV2;
        this.anchors_extras = str29;
        this.allow_gift = bool16;
        this.mutual_relation = mutualStructV22;
        this.mask_infos = Internal.immutableCopyOf("mask_infos", list19);
        this.boost_tag_info = boostStructV2;
        this.bottom_bar = bottomBarStructV2;
        this.playlist_info = playlistInfoV2;
        this.sound_exemption = num20;
        this.stitch = stitchV2;
        this.playlist_blocked = bool17;
        this.part_n = str30;
        this.green_screen_materials = Internal.immutableCopyOf("green_screen_materials", list20);
        this.stitch_permission = stitchPermissionStructV2;
        this.trending_bar = trendingBarStructV2;
        this.user_story = userStoryV2;
        this.story_metadata = storyMetadataV2;
        this.interact_permission = interactPermissionV2;
        this.item_distribute_source = str31;
        this.question_list = Internal.immutableCopyOf("question_list", list21);
        this.audio = audioStructV2;
        this.upvote_reason = upvoteReasonV2;
        this.deduplication_type = num21;
        this.interaction_tag_info = interactionTagInfoV2;
        this.content_desc = str32;
        this.content_desc_extra = Internal.immutableCopyOf("content_desc_extra", list22);
        this.duet_info = duetInfoV2;
        this.extra_info = str33;
        this.item_source_category = num22;
        this.enable_pos_adjust = bool18;
        this.enable_ad_drop = bool19;
        this.pred_playtime = num23;
        this.gap_list = Internal.immutableCopyOf("gap_list", list23);
        this.is_client_cache = bool20;
        this.follow_up_publish_from_id = l5;
        this.trending_bar_fyp = trendingBarForYouPageStructV2;
        this.music_dsp_info = musicDspStructV2;
        this.disable_search_trending_bar = bool21;
        this.image_post_info = imageConsumptionInfoV2;
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r0v301 ?? I:int)
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:107)
        */
    public final int hashCode() {
        /*
        // Method dump skipped, instructions count: 2284
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.aweme.proto.AwemeStructV2.hashCode():int");
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.aweme_id != null) {
            sb.append(", aweme_id=").append(this.aweme_id);
        }
        if (this.desc != null) {
            sb.append(", desc=").append(this.desc);
        }
        if (this.create_time != null) {
            sb.append(", create_time=").append(this.create_time);
        }
        if (this.author != null) {
            sb.append(", author=").append(this.author);
        }
        if (this.music != null) {
            sb.append(", music=").append(this.music);
        }
        if (!this.cha_list.isEmpty()) {
            sb.append(", cha_list=").append(this.cha_list);
        }
        if (this.video != null) {
            sb.append(", video=").append(this.video);
        }
        if (this.share_url != null) {
            sb.append(", share_url=").append(this.share_url);
        }
        if (this.user_digged != null) {
            sb.append(", user_digged=").append(this.user_digged);
        }
        if (this.statistics != null) {
            sb.append(", statistics=").append(this.statistics);
        }
        if (this.status != null) {
            sb.append(", status=").append(this.status);
        }
        if (this.extra != null) {
            sb.append(", extra=").append(this.extra);
        }
        if (this.rate != null) {
            sb.append(", rate=").append(this.rate);
        }
        if (!this.text_extra.isEmpty()) {
            sb.append(", text_extra=").append(this.text_extra);
        }
        if (this.label_large != null) {
            sb.append(", label_large=").append(this.label_large);
        }
        if (this.label_thumb != null) {
            sb.append(", label_thumb=").append(this.label_thumb);
        }
        if (this.is_top != null) {
            sb.append(", is_top=").append(this.is_top);
        }
        if (this.label_top != null) {
            sb.append(", label_top=").append(this.label_top);
        }
        if (this.share_info != null) {
            sb.append(", share_info=").append(this.share_info);
        }
        if (this.label_origin_author != null) {
            sb.append(", label_origin_author=").append(this.label_origin_author);
        }
        if (this.distance != null) {
            sb.append(", distance=").append(this.distance);
        }
        if (this.label_music_starter != null) {
            sb.append(", label_music_starter=").append(this.label_music_starter);
        }
        if (this.label_private != null) {
            sb.append(", label_private=").append(this.label_private);
        }
        if (!this.video_labels.isEmpty()) {
            sb.append(", video_labels=").append(this.video_labels);
        }
        if (this.is_vr != null) {
            sb.append(", is_vr=").append(this.is_vr);
        }
        if (this.landing_page != null) {
            sb.append(", landing_page=").append(this.landing_page);
        }
        if (this.is_ads != null) {
            sb.append(", is_ads=").append(this.is_ads);
        }
        if (this.duration != null) {
            sb.append(", duration=").append(this.duration);
        }
        if (this.aweme_type != null) {
            sb.append(", aweme_type=").append(this.aweme_type);
        }
        if (this.cmt_swt != null) {
            sb.append(", cmt_swt=").append(this.cmt_swt);
        }
        if (!this.image_infos.isEmpty()) {
            sb.append(", image_infos=").append(this.image_infos);
        }
        if (this.risk_infos != null) {
            sb.append(", risk_infos=").append(this.risk_infos);
        }
        if (this.is_relieve != null) {
            sb.append(", is_relieve=").append(this.is_relieve);
        }
        if (this.label_friend != null) {
            sb.append(", label_friend=").append(this.label_friend);
        }
        if (this.sort_label != null) {
            sb.append(", sort_label=").append(this.sort_label);
        }
        if (!this.position.isEmpty()) {
            sb.append(", position=").append(this.position);
        }
        if (!this.uniqid_position.isEmpty()) {
            sb.append(", uniqid_position=").append(this.uniqid_position);
        }
        if (this.author_user_id != null) {
            sb.append(", author_user_id=").append(this.author_user_id);
        }
        if (this.bodydance_score != null) {
            sb.append(", bodydance_score=").append(this.bodydance_score);
        }
        if (!this.geofencing.isEmpty()) {
            sb.append(", geofencing=").append(this.geofencing);
        }
        if (this.is_hash_tag != null) {
            sb.append(", is_hash_tag=").append(this.is_hash_tag);
        }
        if (this.is_pgcshow != null) {
            sb.append(", is_pgcshow=").append(this.is_pgcshow);
        }
        if (this.region != null) {
            sb.append(", region=").append(this.region);
        }
        if (!this.video_text.isEmpty()) {
            sb.append(", video_text=").append(this.video_text);
        }
        if (this.sp_sticker != null) {
            sb.append(", sp_sticker=").append(this.sp_sticker);
        }
        if (this.ad_schedule != null) {
            sb.append(", ad_schedule=").append(this.ad_schedule);
        }
        if (this.collect_stat != null) {
            sb.append(", collect_stat=").append(this.collect_stat);
        }
        if (!this.label_top_text.isEmpty()) {
            sb.append(", label_top_text=").append(this.label_top_text);
        }
        if (this.stickers != null) {
            sb.append(", stickers=").append(this.stickers);
        }
        if (this.forward_item != null) {
            sb.append(", forward_item=").append(this.forward_item);
        }
        if (this.forward_comment_id != null) {
            sb.append(", forward_comment_id=").append(this.forward_comment_id);
        }
        if (this.forward_item_id != null) {
            sb.append(", forward_item_id=").append(this.forward_item_id);
        }
        if (this.group_id != null) {
            sb.append(", group_id=").append(this.group_id);
        }
        if (this.pre_forward_id != null) {
            sb.append(", pre_forward_id=").append(this.pre_forward_id);
        }
        if (this.prevent_download != null) {
            sb.append(", prevent_download=").append(this.prevent_download);
        }
        if (!this.nickname_position.isEmpty()) {
            sb.append(", nickname_position=").append(this.nickname_position);
        }
        if (!this.challenge_position.isEmpty()) {
            sb.append(", challenge_position=").append(this.challenge_position);
        }
        if (this.item_comment_settings != null) {
            sb.append(", item_comment_settings=").append(this.item_comment_settings);
        }
        if (this.descendants != null) {
            sb.append(", descendants=").append(this.descendants);
        }
        if (this.raw_ad_data != null) {
            sb.append(", raw_ad_data=").append(this.raw_ad_data);
        }
        if (this.game_info != null) {
            sb.append(", game_info=").append(this.game_info);
        }
        if (this.micro_app_info != null) {
            sb.append(", micro_app_info=").append(this.micro_app_info);
        }
        if (this.with_promotional_music != null) {
            sb.append(", with_promotional_music=").append(this.with_promotional_music);
        }
        if (this.link_ad_data != null) {
            sb.append(", link_ad_data=").append(this.link_ad_data);
        }
        if (this.gesture_red_packet != null) {
            sb.append(", gesture_red_packet=").append(this.gesture_red_packet);
        }
        if (this.activity_pendant != null) {
            sb.append(", activity_pendant=").append(this.activity_pendant);
        }
        if (this.sticker_detail != null) {
            sb.append(", sticker_detail=").append(this.sticker_detail);
        }
        if (!this.long_video.isEmpty()) {
            sb.append(", long_video=").append(this.long_video);
        }
        if (this.item_duet != null) {
            sb.append(", item_duet=").append(this.item_duet);
        }
        if (this.item_react != null) {
            sb.append(", item_react=").append(this.item_react);
        }
        if (this.hot_info != null) {
            sb.append(", hot_info=").append(this.hot_info);
        }
        if (this.star_atlas_order_id != null) {
            sb.append(", star_atlas_order_id=").append(this.star_atlas_order_id);
        }
        if (this.label_music_starter_text != null) {
            sb.append(", label_music_starter_text=").append(this.label_music_starter_text);
        }
        if (this.without_watermark != null) {
            sb.append(", without_watermark=").append(this.without_watermark);
        }
        if (this.preload != null) {
            sb.append(", preload=").append(this.preload);
        }
        if (this.star_recommend_tag != null) {
            sb.append(", star_recommend_tag=").append(this.star_recommend_tag);
        }
        if (this.ad_order_id != null) {
            sb.append(", ad_order_id=").append(this.ad_order_id);
        }
        if (this.open_platform_name != null) {
            sb.append(", open_platform_name=").append(this.open_platform_name);
        }
        if (this.star_atlas_info != null) {
            sb.append(", star_atlas_info=").append(this.star_atlas_info);
        }
        if (this.desc_language != null) {
            sb.append(", desc_language=").append(this.desc_language);
        }
        if (this.floating_card_content != null) {
            sb.append(", floating_card_content=").append(this.floating_card_content);
        }
        if (!this.interaction_stickers.isEmpty()) {
            sb.append(", interaction_stickers=").append(this.interaction_stickers);
        }
        if (this.ad_link_type != null) {
            sb.append(", ad_link_type=").append(this.ad_link_type);
        }
        if (this.take_down_reason != null) {
            sb.append(", take_down_reason=").append(this.take_down_reason);
        }
        if (this.take_down_desc != null) {
            sb.append(", take_down_desc=").append(this.take_down_desc);
        }
        if (this.simple_promotions != null) {
            sb.append(", simple_promotions=").append(this.simple_promotions);
        }
        if (this.misc_info != null) {
            sb.append(", misc_info=").append(this.misc_info);
        }
        if (!this.origin_comment_ids.isEmpty()) {
            sb.append(", origin_comment_ids=").append(this.origin_comment_ids);
        }
        if (!this.commerce_config_data.isEmpty()) {
            sb.append(", commerce_config_data=").append(this.commerce_config_data);
        }
        if (this.commerce_sticker_info != null) {
            sb.append(", commerce_sticker_info=").append(this.commerce_sticker_info);
        }
        if (this.enable_top_view != null) {
            sb.append(", enable_top_view=").append(this.enable_top_view);
        }
        if (this.distribute_type != null) {
            sb.append(", distribute_type=").append(this.distribute_type);
        }
        if (this.video_control != null) {
            sb.append(", video_control=").append(this.video_control);
        }
        if (this.is_effect_designer != null) {
            sb.append(", is_effect_designer=").append(this.is_effect_designer);
        }
        if (this.ad_aweme_source != null) {
            sb.append(", ad_aweme_source=").append(this.ad_aweme_source);
        }
        if (this.aweme_control != null) {
            sb.append(", aweme_control=").append(this.aweme_control);
        }
        if (this.has_vs_entry != null) {
            sb.append(", has_vs_entry=").append(this.has_vs_entry);
        }
        if (this.anchor != null) {
            sb.append(", anchor=").append(this.anchor);
        }
        if (this.feed_relation_label != null) {
            sb.append(", feed_relation_label=").append(this.feed_relation_label);
        }
        if (this.mix_info != null) {
            sb.append(", mix_info=").append(this.mix_info);
        }
        if (this.simple_shop_seeding != null) {
            sb.append(", simple_shop_seeding=").append(this.simple_shop_seeding);
        }
        if (this.hot_list != null) {
            sb.append(", hot_list=").append(this.hot_list);
        }
        if (this.commerce_info != null) {
            sb.append(", commerce_info=").append(this.commerce_info);
        }
        if (this.banner_tip != null) {
            sb.append(", banner_tip=").append(this.banner_tip);
        }
        if (this.acl_info != null) {
            sb.append(", acl_info=").append(this.acl_info);
        }
        if (this.anchor_info != null) {
            sb.append(", anchor_info=").append(this.anchor_info);
        }
        if (this.vpa_info != null) {
            sb.append(", vpa_info=").append(this.vpa_info);
        }
        if (this.cny_info != null) {
            sb.append(", cny_info=").append(this.cny_info);
        }
        if (this.is_familiar != null) {
            sb.append(", is_familiar=").append(this.is_familiar);
        }
        if (this.need_vs_entry != null) {
            sb.append(", need_vs_entry=").append(this.need_vs_entry);
        }
        if (this.cell_room != null) {
            sb.append(", cell_room=").append(this.cell_room);
        }
        if (this.live_reason != null) {
            sb.append(", live_reason=").append(this.live_reason);
        }
        if (this.video_feed_tag != null) {
            sb.append(", video_feed_tag=").append(this.video_feed_tag);
        }
        if (this.mask_info != null) {
            sb.append(", mask_info=").append(this.mask_info);
        }
        if (this.link_match != null) {
            sb.append(", link_match=").append(this.link_match);
        }
        if (this.video_reply_info != null) {
            sb.append(", video_reply_info=").append(this.video_reply_info);
        }
        if (!this.anchors.isEmpty()) {
            sb.append(", anchors=").append(this.anchors);
        }
        if (!this.hybrid_label.isEmpty()) {
            sb.append(", hybrid_label=").append(this.hybrid_label);
        }
        if (this.relation_recommend_info != null) {
            sb.append(", relation_recommend_info=").append(this.relation_recommend_info);
        }
        if (this.user_profile_init_info != null) {
            sb.append(", user_profile_init_info=").append(this.user_profile_init_info);
        }
        if (this.with_survey != null) {
            sb.append(", with_survey=").append(this.with_survey);
        }
        if (this.dou_discount_mix_info != null) {
            sb.append(", dou_discount_mix_info=").append(this.dou_discount_mix_info);
        }
        if (this.aweme_acl != null) {
            sb.append(", aweme_acl=").append(this.aweme_acl);
        }
        if (this.activity != null) {
            sb.append(", activity=").append(this.activity);
        }
        if (this.is_story != null) {
            sb.append(", is_story=").append(this.is_story);
        }
        if (this.vs_entry != null) {
            sb.append(", vs_entry=").append(this.vs_entry);
        }
        if (this.item_stitch != null) {
            sb.append(", item_stitch=").append(this.item_stitch);
        }
        if (this.show_sticker_guide != null) {
            sb.append(", show_sticker_guide=").append(this.show_sticker_guide);
        }
        if (this.story_ttl != null) {
            sb.append(", story_ttl=").append(this.story_ttl);
        }
        if (this.is_horizontal != null) {
            sb.append(", is_horizontal=").append(this.is_horizontal);
        }
        if (!this.geofencing_regions.isEmpty()) {
            sb.append(", geofencing_regions=").append(this.geofencing_regions);
        }
        if (this.city != null) {
            sb.append(", city=").append(this.city);
        }
        if (this.mutual_relation_tmp != null) {
            sb.append(", mutual_relation_tmp=").append(this.mutual_relation_tmp);
        }
        if (this.anchors_extras != null) {
            sb.append(", anchors_extras=").append(this.anchors_extras);
        }
        if (this.allow_gift != null) {
            sb.append(", allow_gift=").append(this.allow_gift);
        }
        if (this.mutual_relation != null) {
            sb.append(", mutual_relation=").append(this.mutual_relation);
        }
        if (!this.mask_infos.isEmpty()) {
            sb.append(", mask_infos=").append(this.mask_infos);
        }
        if (this.boost_tag_info != null) {
            sb.append(", boost_tag_info=").append(this.boost_tag_info);
        }
        if (this.bottom_bar != null) {
            sb.append(", bottom_bar=").append(this.bottom_bar);
        }
        if (this.playlist_info != null) {
            sb.append(", playlist_info=").append(this.playlist_info);
        }
        if (this.sound_exemption != null) {
            sb.append(", sound_exemption=").append(this.sound_exemption);
        }
        if (this.stitch != null) {
            sb.append(", stitch=").append(this.stitch);
        }
        if (this.playlist_blocked != null) {
            sb.append(", playlist_blocked=").append(this.playlist_blocked);
        }
        if (this.part_n != null) {
            sb.append(", part_n=").append(this.part_n);
        }
        if (!this.green_screen_materials.isEmpty()) {
            sb.append(", green_screen_materials=").append(this.green_screen_materials);
        }
        if (this.stitch_permission != null) {
            sb.append(", stitch_permission=").append(this.stitch_permission);
        }
        if (this.trending_bar != null) {
            sb.append(", trending_bar=").append(this.trending_bar);
        }
        if (this.user_story != null) {
            sb.append(", user_story=").append(this.user_story);
        }
        if (this.story_metadata != null) {
            sb.append(", story_metadata=").append(this.story_metadata);
        }
        if (this.interact_permission != null) {
            sb.append(", interact_permission=").append(this.interact_permission);
        }
        if (this.item_distribute_source != null) {
            sb.append(", item_distribute_source=").append(this.item_distribute_source);
        }
        if (!this.question_list.isEmpty()) {
            sb.append(", question_list=").append(this.question_list);
        }
        if (this.audio != null) {
            sb.append(", audio=").append(this.audio);
        }
        if (this.upvote_reason != null) {
            sb.append(", upvote_reason=").append(this.upvote_reason);
        }
        if (this.deduplication_type != null) {
            sb.append(", deduplication_type=").append(this.deduplication_type);
        }
        if (this.interaction_tag_info != null) {
            sb.append(", interaction_tag_info=").append(this.interaction_tag_info);
        }
        if (this.content_desc != null) {
            sb.append(", content_desc=").append(this.content_desc);
        }
        if (!this.content_desc_extra.isEmpty()) {
            sb.append(", content_desc_extra=").append(this.content_desc_extra);
        }
        if (this.duet_info != null) {
            sb.append(", duet_info=").append(this.duet_info);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=").append(this.extra_info);
        }
        if (this.item_source_category != null) {
            sb.append(", item_source_category=").append(this.item_source_category);
        }
        if (this.enable_pos_adjust != null) {
            sb.append(", enable_pos_adjust=").append(this.enable_pos_adjust);
        }
        if (this.enable_ad_drop != null) {
            sb.append(", enable_ad_drop=").append(this.enable_ad_drop);
        }
        if (this.pred_playtime != null) {
            sb.append(", pred_playtime=").append(this.pred_playtime);
        }
        if (!this.gap_list.isEmpty()) {
            sb.append(", gap_list=").append(this.gap_list);
        }
        if (this.is_client_cache != null) {
            sb.append(", is_client_cache=").append(this.is_client_cache);
        }
        if (this.follow_up_publish_from_id != null) {
            sb.append(", follow_up_publish_from_id=").append(this.follow_up_publish_from_id);
        }
        if (this.trending_bar_fyp != null) {
            sb.append(", trending_bar_fyp=").append(this.trending_bar_fyp);
        }
        if (this.music_dsp_info != null) {
            sb.append(", music_dsp_info=").append(this.music_dsp_info);
        }
        if (this.disable_search_trending_bar != null) {
            sb.append(", disable_search_trending_bar=").append(this.disable_search_trending_bar);
        }
        if (this.image_post_info != null) {
            sb.append(", image_post_info=").append(this.image_post_info);
        }
        return sb.replace(0, 2, "AwemeStructV2{").append('}').toString();
    }

    static final class ProtoAdapter_AwemeStructV2 extends ProtoAdapter<AwemeStructV2> {
        static {
            Covode.recordClassIndex(101917);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AwemeStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.aweme_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.desc(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.create_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.author(UserStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.music(MusicStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.cha_list.add(ChallengeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.video(VideoStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.share_url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.user_digged(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.statistics(AwemeStatisticsStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.status(AwemeStatusStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.extra(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            builder.rate(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            builder.text_extra.add(TextExtraStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            builder.label_large(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 16:
                            builder.label_thumb(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 17:
                            builder.is_top(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            builder.label_top(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            builder.share_info(ShareStructV2.ADAPTER.decode(protoReader));
                            break;
                        case v.U:
                            builder.label_origin_author(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 21:
                            builder.distance(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 22:
                            builder.label_music_starter(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 23:
                            builder.label_private(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 24:
                            builder.video_labels.add(AwemeLabelStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 25:
                            builder.is_vr(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 26:
                            builder.landing_page(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 27:
                            builder.is_ads(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 28:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 43:
                        case 51:
                        case 56:
                        case AudiencePingIntervalSetting.DEFAULT:
                        case 61:
                        case 75:
                        case 94:
                        case a.f41622a:
                        case 117:
                        case 120:
                        case 140:
                        case 144:
                        case 145:
                        case 146:
                        case 152:
                        case 153:
                        case 155:
                        case 156:
                        case 157:
                        case 158:
                        case 159:
                        case 166:
                        case 175:
                        case 176:
                        case 177:
                        case 178:
                        case 179:
                        case 184:
                        case 192:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 29:
                            builder.duration(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 30:
                            builder.aweme_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 35:
                            builder.cmt_swt(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 36:
                            builder.image_infos.add(ImageInfoStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 37:
                            builder.risk_infos(AwemeRiskStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 38:
                            builder.is_relieve(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 39:
                            builder.label_friend(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 40:
                            builder.sort_label(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 41:
                            builder.position.add(PositionStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 42:
                            builder.uniqid_position.add(PositionStructV2.ADAPTER.decode(protoReader));
                            break;
                        case BuildConfig.VERSION_CODE:
                            builder.author_user_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 45:
                            builder.bodydance_score(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 46:
                            builder.geofencing.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 47:
                            builder.is_hash_tag(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 48:
                            builder.is_pgcshow(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 49:
                            builder.region(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 50:
                            builder.video_text.add(VideoTextStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 52:
                            builder.sp_sticker(SpecialStickerStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 53:
                            builder.ad_schedule(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 54:
                            builder.collect_stat(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 55:
                            builder.label_top_text.add(VideoTextStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 57:
                            builder.stickers(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 58:
                            builder.forward_item(AwemeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 59:
                            builder.forward_comment_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 62:
                            builder.forward_item_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 63:
                            builder.group_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 64:
                            builder.pre_forward_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 65:
                            builder.prevent_download(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 66:
                            builder.nickname_position.add(PositionStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 67:
                            builder.challenge_position.add(PositionStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 68:
                            builder.item_comment_settings(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 69:
                            builder.descendants(DescendantStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 70:
                            builder.raw_ad_data(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 71:
                            builder.game_info(GameStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 72:
                            builder.micro_app_info(MicroAppStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 73:
                            builder.with_promotional_music(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 74:
                            builder.link_ad_data(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 76:
                            builder.gesture_red_packet(CommerceActivityStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 77:
                            builder.activity_pendant(CommerceActivityStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 78:
                            builder.sticker_detail(NewFaceStickerStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 79:
                            builder.long_video.add(LongVideoStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 80:
                            builder.item_duet(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 81:
                            builder.item_react(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 82:
                            builder.hot_info(AwemeSearchStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 83:
                            builder.star_atlas_order_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 84:
                            builder.label_music_starter_text(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 85:
                            builder.without_watermark(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 86:
                            builder.preload(PreloadStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 87:
                            builder.star_recommend_tag(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 88:
                            builder.ad_order_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 89:
                            builder.open_platform_name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 90:
                            builder.star_atlas_info(AwemeStarAtlasStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 91:
                            builder.desc_language(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 92:
                            builder.floating_card_content(AwemeFloatingCardStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 93:
                            builder.interaction_stickers.add(InteractionStickerStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 95:
                            builder.ad_link_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 96:
                            builder.take_down_reason(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 97:
                            builder.take_down_desc(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 98:
                            builder.simple_promotions(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 99:
                            builder.misc_info(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 101:
                            builder.origin_comment_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 102:
                            builder.commerce_config_data.add(CommerceConfigDataV2.ADAPTER.decode(protoReader));
                            break;
                        case 103:
                            builder.commerce_sticker_info(AwemeCommerceStickerStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 104:
                            builder.enable_top_view(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 105:
                            builder.distribute_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 106:
                            builder.video_control(VideoControlV2.ADAPTER.decode(protoReader));
                            break;
                        case 107:
                            builder.is_effect_designer(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 108:
                            builder.ad_aweme_source(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 109:
                            builder.aweme_control(AwemeControlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 110:
                            builder.has_vs_entry(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 111:
                            builder.anchor(AnchorStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 112:
                            builder.feed_relation_label(RelationLabelStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 113:
                            builder.mix_info(MixStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 114:
                            builder.simple_shop_seeding(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 115:
                            builder.hot_list(HotListStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 116:
                            builder.commerce_info(AwemeCommerceStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 118:
                            builder.banner_tip(BannerTipV2.ADAPTER.decode(protoReader));
                            break;
                        case 119:
                            builder.acl_info(AwemeACLStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 121:
                            builder.anchor_info(AwemeAnchorStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 122:
                            builder.vpa_info(VPAInfoStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 123:
                            builder.cny_info(CNYStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 124:
                            builder.is_familiar(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 125:
                            builder.need_vs_entry(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 126:
                            builder.cell_room(WebcastRoomFeedCellStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 127:
                            builder.live_reason(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 128:
                            builder.video_feed_tag(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 129:
                            builder.mask_info(MaskStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 130:
                            builder.link_match(LinkMatchStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 131:
                            builder.video_reply_info(VideoReplyStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 132:
                            builder.anchors.add(AnchorCommonStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 133:
                            builder.hybrid_label.add(HybridLabelStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 134:
                            builder.relation_recommend_info(RelationRecommendStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 135:
                            builder.user_profile_init_info(UserProfileStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 136:
                            builder.with_survey(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 137:
                            builder.dou_discount_mix_info(AwemeSearchStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 138:
                            builder.aweme_acl(AwemeACLStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 139:
                            builder.activity(AwemeActivityStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 141:
                            builder.is_story(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 142:
                            builder.vs_entry(VisualSearchEntryStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 143:
                            builder.item_stitch(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 147:
                            builder.show_sticker_guide(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 148:
                            builder.story_ttl(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 149:
                            builder.is_horizontal(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 150:
                            builder.geofencing_regions.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 151:
                            builder.city(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 154:
                            builder.mutual_relation_tmp(MutualStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 160:
                            builder.anchors_extras(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 161:
                            builder.allow_gift(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 162:
                            builder.mutual_relation(MutualStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 163:
                            builder.mask_infos.add(MaskStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 164:
                            builder.boost_tag_info(BoostStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 165:
                            builder.bottom_bar(BottomBarStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 167:
                            builder.playlist_info(PlaylistInfoV2.ADAPTER.decode(protoReader));
                            break;
                        case 168:
                            builder.sound_exemption(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 169:
                            builder.stitch(StitchV2.ADAPTER.decode(protoReader));
                            break;
                        case 170:
                            builder.playlist_blocked(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 171:
                            builder.part_n(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 172:
                            builder.green_screen_materials.add(GreenScreenMaterialV2.ADAPTER.decode(protoReader));
                            break;
                        case 173:
                            builder.stitch_permission(StitchPermissionStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 174:
                            builder.trending_bar(TrendingBarStructV2.ADAPTER.decode(protoReader));
                            break;
                        case LiveFeedRefreshTimeSetting.DEFAULT:
                            builder.user_story(UserStoryV2.ADAPTER.decode(protoReader));
                            break;
                        case 181:
                            builder.story_metadata(StoryMetadataV2.ADAPTER.decode(protoReader));
                            break;
                        case 182:
                            builder.interact_permission(InteractPermissionV2.ADAPTER.decode(protoReader));
                            break;
                        case 183:
                            builder.item_distribute_source(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 185:
                            builder.question_list.add(QuestionInfoV2.ADAPTER.decode(protoReader));
                            break;
                        case 186:
                            builder.audio(AudioStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 187:
                            builder.upvote_reason(UpvoteReasonV2.ADAPTER.decode(protoReader));
                            break;
                        case 188:
                            builder.deduplication_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 189:
                            builder.interaction_tag_info(InteractionTagInfoV2.ADAPTER.decode(protoReader));
                            break;
                        case com.bytedance.vcloud.mlcomponent_api.BuildConfig.VERSION_CODE:
                            builder.content_desc(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 191:
                            builder.content_desc_extra.add(TextExtraStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 193:
                            builder.duet_info(DuetInfoV2.ADAPTER.decode(protoReader));
                            break;
                        case 194:
                            builder.extra_info(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 195:
                            builder.item_source_category(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 196:
                            builder.enable_pos_adjust(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 197:
                            builder.enable_ad_drop(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 198:
                            builder.pred_playtime(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 199:
                            builder.gap_list.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 200:
                            builder.is_client_cache(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 201:
                            builder.follow_up_publish_from_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 202:
                            builder.trending_bar_fyp(TrendingBarForYouPageStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 203:
                            builder.music_dsp_info(MusicDspStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 204:
                            builder.disable_search_trending_bar(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 205:
                            builder.image_post_info(ImageConsumptionInfoV2.ADAPTER.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public ProtoAdapter_AwemeStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeStructV2.class);
        }

        public final int encodedSize(AwemeStructV2 awemeStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, awemeStructV2.aweme_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, awemeStructV2.desc) + ProtoAdapter.INT64.encodedSizeWithTag(3, awemeStructV2.create_time) + UserStructV2.ADAPTER.encodedSizeWithTag(4, awemeStructV2.author) + MusicStructV2.ADAPTER.encodedSizeWithTag(5, awemeStructV2.music) + ChallengeStructV2.ADAPTER.asRepeated().encodedSizeWithTag(6, awemeStructV2.cha_list) + VideoStructV2.ADAPTER.encodedSizeWithTag(7, awemeStructV2.video) + ProtoAdapter.STRING.encodedSizeWithTag(8, awemeStructV2.share_url) + ProtoAdapter.INT32.encodedSizeWithTag(9, awemeStructV2.user_digged) + AwemeStatisticsStructV2.ADAPTER.encodedSizeWithTag(10, awemeStructV2.statistics) + AwemeStatusStructV2.ADAPTER.encodedSizeWithTag(11, awemeStructV2.status) + ProtoAdapter.STRING.encodedSizeWithTag(12, awemeStructV2.extra) + ProtoAdapter.INT32.encodedSizeWithTag(13, awemeStructV2.rate) + TextExtraStructV2.ADAPTER.asRepeated().encodedSizeWithTag(14, awemeStructV2.text_extra) + UrlStructV2.ADAPTER.encodedSizeWithTag(15, awemeStructV2.label_large) + UrlStructV2.ADAPTER.encodedSizeWithTag(16, awemeStructV2.label_thumb) + ProtoAdapter.INT32.encodedSizeWithTag(17, awemeStructV2.is_top) + UrlStructV2.ADAPTER.encodedSizeWithTag(18, awemeStructV2.label_top) + ShareStructV2.ADAPTER.encodedSizeWithTag(19, awemeStructV2.share_info) + UrlStructV2.ADAPTER.encodedSizeWithTag(20, awemeStructV2.label_origin_author) + ProtoAdapter.STRING.encodedSizeWithTag(21, awemeStructV2.distance) + UrlStructV2.ADAPTER.encodedSizeWithTag(22, awemeStructV2.label_music_starter) + UrlStructV2.ADAPTER.encodedSizeWithTag(23, awemeStructV2.label_private) + AwemeLabelStructV2.ADAPTER.asRepeated().encodedSizeWithTag(24, awemeStructV2.video_labels) + ProtoAdapter.BOOL.encodedSizeWithTag(25, awemeStructV2.is_vr) + ProtoAdapter.STRING.encodedSizeWithTag(26, awemeStructV2.landing_page) + ProtoAdapter.BOOL.encodedSizeWithTag(27, awemeStructV2.is_ads) + ProtoAdapter.INT32.encodedSizeWithTag(29, awemeStructV2.duration) + ProtoAdapter.INT32.encodedSizeWithTag(30, awemeStructV2.aweme_type) + ProtoAdapter.BOOL.encodedSizeWithTag(35, awemeStructV2.cmt_swt) + ImageInfoStructV2.ADAPTER.asRepeated().encodedSizeWithTag(36, awemeStructV2.image_infos) + AwemeRiskStructV2.ADAPTER.encodedSizeWithTag(37, awemeStructV2.risk_infos) + ProtoAdapter.BOOL.encodedSizeWithTag(38, awemeStructV2.is_relieve) + UrlStructV2.ADAPTER.encodedSizeWithTag(39, awemeStructV2.label_friend) + ProtoAdapter.STRING.encodedSizeWithTag(40, awemeStructV2.sort_label) + PositionStructV2.ADAPTER.asRepeated().encodedSizeWithTag(41, awemeStructV2.position) + PositionStructV2.ADAPTER.asRepeated().encodedSizeWithTag(42, awemeStructV2.uniqid_position) + ProtoAdapter.INT64.encodedSizeWithTag(44, awemeStructV2.author_user_id) + ProtoAdapter.INT32.encodedSizeWithTag(45, awemeStructV2.bodydance_score) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(46, awemeStructV2.geofencing) + ProtoAdapter.INT32.encodedSizeWithTag(47, awemeStructV2.is_hash_tag) + ProtoAdapter.BOOL.encodedSizeWithTag(48, awemeStructV2.is_pgcshow) + ProtoAdapter.STRING.encodedSizeWithTag(49, awemeStructV2.region) + VideoTextStructV2.ADAPTER.asRepeated().encodedSizeWithTag(50, awemeStructV2.video_text) + SpecialStickerStructV2.ADAPTER.encodedSizeWithTag(52, awemeStructV2.sp_sticker) + ProtoAdapter.STRING.encodedSizeWithTag(53, awemeStructV2.ad_schedule) + ProtoAdapter.INT32.encodedSizeWithTag(54, awemeStructV2.collect_stat) + VideoTextStructV2.ADAPTER.asRepeated().encodedSizeWithTag(55, awemeStructV2.label_top_text) + ProtoAdapter.STRING.encodedSizeWithTag(57, awemeStructV2.stickers) + AwemeStructV2.ADAPTER.encodedSizeWithTag(58, awemeStructV2.forward_item) + ProtoAdapter.STRING.encodedSizeWithTag(59, awemeStructV2.forward_comment_id) + ProtoAdapter.STRING.encodedSizeWithTag(62, awemeStructV2.forward_item_id) + ProtoAdapter.STRING.encodedSizeWithTag(63, awemeStructV2.group_id) + ProtoAdapter.STRING.encodedSizeWithTag(64, awemeStructV2.pre_forward_id) + ProtoAdapter.BOOL.encodedSizeWithTag(65, awemeStructV2.prevent_download) + PositionStructV2.ADAPTER.asRepeated().encodedSizeWithTag(66, awemeStructV2.nickname_position) + PositionStructV2.ADAPTER.asRepeated().encodedSizeWithTag(67, awemeStructV2.challenge_position) + ProtoAdapter.INT32.encodedSizeWithTag(68, awemeStructV2.item_comment_settings) + DescendantStructV2.ADAPTER.encodedSizeWithTag(69, awemeStructV2.descendants) + ProtoAdapter.STRING.encodedSizeWithTag(70, awemeStructV2.raw_ad_data) + GameStructV2.ADAPTER.encodedSizeWithTag(71, awemeStructV2.game_info) + MicroAppStructV2.ADAPTER.encodedSizeWithTag(72, awemeStructV2.micro_app_info) + ProtoAdapter.BOOL.encodedSizeWithTag(73, awemeStructV2.with_promotional_music) + ProtoAdapter.STRING.encodedSizeWithTag(74, awemeStructV2.link_ad_data) + CommerceActivityStructV2.ADAPTER.encodedSizeWithTag(76, awemeStructV2.gesture_red_packet) + CommerceActivityStructV2.ADAPTER.encodedSizeWithTag(77, awemeStructV2.activity_pendant) + NewFaceStickerStructV2.ADAPTER.encodedSizeWithTag(78, awemeStructV2.sticker_detail) + LongVideoStructV2.ADAPTER.asRepeated().encodedSizeWithTag(79, awemeStructV2.long_video) + ProtoAdapter.INT32.encodedSizeWithTag(80, awemeStructV2.item_duet) + ProtoAdapter.INT32.encodedSizeWithTag(81, awemeStructV2.item_react) + AwemeSearchStructV2.ADAPTER.encodedSizeWithTag(82, awemeStructV2.hot_info) + ProtoAdapter.INT64.encodedSizeWithTag(83, awemeStructV2.star_atlas_order_id) + ProtoAdapter.STRING.encodedSizeWithTag(84, awemeStructV2.label_music_starter_text) + ProtoAdapter.BOOL.encodedSizeWithTag(85, awemeStructV2.without_watermark) + PreloadStructV2.ADAPTER.encodedSizeWithTag(86, awemeStructV2.preload) + ProtoAdapter.STRING.encodedSizeWithTag(87, awemeStructV2.star_recommend_tag) + ProtoAdapter.STRING.encodedSizeWithTag(88, awemeStructV2.ad_order_id) + ProtoAdapter.STRING.encodedSizeWithTag(89, awemeStructV2.open_platform_name) + AwemeStarAtlasStructV2.ADAPTER.encodedSizeWithTag(90, awemeStructV2.star_atlas_info) + ProtoAdapter.STRING.encodedSizeWithTag(91, awemeStructV2.desc_language) + AwemeFloatingCardStructV2.ADAPTER.encodedSizeWithTag(92, awemeStructV2.floating_card_content) + InteractionStickerStructV2.ADAPTER.asRepeated().encodedSizeWithTag(93, awemeStructV2.interaction_stickers) + ProtoAdapter.INT32.encodedSizeWithTag(95, awemeStructV2.ad_link_type) + ProtoAdapter.INT32.encodedSizeWithTag(96, awemeStructV2.take_down_reason) + ProtoAdapter.STRING.encodedSizeWithTag(97, awemeStructV2.take_down_desc) + ProtoAdapter.STRING.encodedSizeWithTag(98, awemeStructV2.simple_promotions) + ProtoAdapter.STRING.encodedSizeWithTag(99, awemeStructV2.misc_info) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(101, awemeStructV2.origin_comment_ids) + CommerceConfigDataV2.ADAPTER.asRepeated().encodedSizeWithTag(102, awemeStructV2.commerce_config_data) + AwemeCommerceStickerStructV2.ADAPTER.encodedSizeWithTag(103, awemeStructV2.commerce_sticker_info) + ProtoAdapter.BOOL.encodedSizeWithTag(104, awemeStructV2.enable_top_view) + ProtoAdapter.INT32.encodedSizeWithTag(105, awemeStructV2.distribute_type) + VideoControlV2.ADAPTER.encodedSizeWithTag(106, awemeStructV2.video_control) + ProtoAdapter.INT32.encodedSizeWithTag(107, awemeStructV2.is_effect_designer) + ProtoAdapter.INT32.encodedSizeWithTag(108, awemeStructV2.ad_aweme_source) + AwemeControlStructV2.ADAPTER.encodedSizeWithTag(109, awemeStructV2.aweme_control) + ProtoAdapter.BOOL.encodedSizeWithTag(110, awemeStructV2.has_vs_entry) + AnchorStructV2.ADAPTER.encodedSizeWithTag(111, awemeStructV2.anchor) + RelationLabelStructV2.ADAPTER.encodedSizeWithTag(112, awemeStructV2.feed_relation_label) + MixStructV2.ADAPTER.encodedSizeWithTag(113, awemeStructV2.mix_info) + ProtoAdapter.STRING.encodedSizeWithTag(114, awemeStructV2.simple_shop_seeding) + HotListStructV2.ADAPTER.encodedSizeWithTag(115, awemeStructV2.hot_list) + AwemeCommerceStructV2.ADAPTER.encodedSizeWithTag(116, awemeStructV2.commerce_info) + BannerTipV2.ADAPTER.encodedSizeWithTag(118, awemeStructV2.banner_tip) + AwemeACLStructV2.ADAPTER.encodedSizeWithTag(119, awemeStructV2.acl_info) + AwemeAnchorStructV2.ADAPTER.encodedSizeWithTag(121, awemeStructV2.anchor_info) + VPAInfoStructV2.ADAPTER.encodedSizeWithTag(122, awemeStructV2.vpa_info) + CNYStructV2.ADAPTER.encodedSizeWithTag(123, awemeStructV2.cny_info) + ProtoAdapter.BOOL.encodedSizeWithTag(124, awemeStructV2.is_familiar) + ProtoAdapter.BOOL.encodedSizeWithTag(125, awemeStructV2.need_vs_entry) + WebcastRoomFeedCellStructV2.ADAPTER.encodedSizeWithTag(126, awemeStructV2.cell_room) + ProtoAdapter.STRING.encodedSizeWithTag(127, awemeStructV2.live_reason) + ProtoAdapter.STRING.encodedSizeWithTag(128, awemeStructV2.video_feed_tag) + MaskStructV2.ADAPTER.encodedSizeWithTag(129, awemeStructV2.mask_info) + LinkMatchStructV2.ADAPTER.encodedSizeWithTag(130, awemeStructV2.link_match) + VideoReplyStructV2.ADAPTER.encodedSizeWithTag(131, awemeStructV2.video_reply_info) + AnchorCommonStructV2.ADAPTER.asRepeated().encodedSizeWithTag(132, awemeStructV2.anchors) + HybridLabelStructV2.ADAPTER.asRepeated().encodedSizeWithTag(133, awemeStructV2.hybrid_label) + RelationRecommendStructV2.ADAPTER.encodedSizeWithTag(134, awemeStructV2.relation_recommend_info) + UserProfileStructV2.ADAPTER.encodedSizeWithTag(135, awemeStructV2.user_profile_init_info) + ProtoAdapter.BOOL.encodedSizeWithTag(136, awemeStructV2.with_survey) + AwemeSearchStructV2.ADAPTER.encodedSizeWithTag(137, awemeStructV2.dou_discount_mix_info) + AwemeACLStructV2.ADAPTER.encodedSizeWithTag(138, awemeStructV2.aweme_acl) + AwemeActivityStructV2.ADAPTER.encodedSizeWithTag(139, awemeStructV2.activity) + ProtoAdapter.INT32.encodedSizeWithTag(141, awemeStructV2.is_story) + VisualSearchEntryStructV2.ADAPTER.encodedSizeWithTag(142, awemeStructV2.vs_entry) + ProtoAdapter.INT32.encodedSizeWithTag(143, awemeStructV2.item_stitch) + ProtoAdapter.BOOL.encodedSizeWithTag(147, awemeStructV2.show_sticker_guide) + ProtoAdapter.INT32.encodedSizeWithTag(148, awemeStructV2.story_ttl) + ProtoAdapter.BOOL.encodedSizeWithTag(149, awemeStructV2.is_horizontal) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(150, awemeStructV2.geofencing_regions) + ProtoAdapter.STRING.encodedSizeWithTag(151, awemeStructV2.city) + MutualStructV2.ADAPTER.encodedSizeWithTag(154, awemeStructV2.mutual_relation_tmp) + ProtoAdapter.STRING.encodedSizeWithTag(160, awemeStructV2.anchors_extras) + ProtoAdapter.BOOL.encodedSizeWithTag(161, awemeStructV2.allow_gift) + MutualStructV2.ADAPTER.encodedSizeWithTag(162, awemeStructV2.mutual_relation) + MaskStructV2.ADAPTER.asRepeated().encodedSizeWithTag(163, awemeStructV2.mask_infos) + BoostStructV2.ADAPTER.encodedSizeWithTag(164, awemeStructV2.boost_tag_info) + BottomBarStructV2.ADAPTER.encodedSizeWithTag(165, awemeStructV2.bottom_bar) + PlaylistInfoV2.ADAPTER.encodedSizeWithTag(167, awemeStructV2.playlist_info) + ProtoAdapter.INT32.encodedSizeWithTag(168, awemeStructV2.sound_exemption) + StitchV2.ADAPTER.encodedSizeWithTag(169, awemeStructV2.stitch) + ProtoAdapter.BOOL.encodedSizeWithTag(170, awemeStructV2.playlist_blocked) + ProtoAdapter.STRING.encodedSizeWithTag(171, awemeStructV2.part_n) + GreenScreenMaterialV2.ADAPTER.asRepeated().encodedSizeWithTag(172, awemeStructV2.green_screen_materials) + StitchPermissionStructV2.ADAPTER.encodedSizeWithTag(173, awemeStructV2.stitch_permission) + TrendingBarStructV2.ADAPTER.encodedSizeWithTag(174, awemeStructV2.trending_bar) + UserStoryV2.ADAPTER.encodedSizeWithTag(LiveFeedRefreshTimeSetting.DEFAULT, awemeStructV2.user_story) + StoryMetadataV2.ADAPTER.encodedSizeWithTag(181, awemeStructV2.story_metadata) + InteractPermissionV2.ADAPTER.encodedSizeWithTag(182, awemeStructV2.interact_permission) + ProtoAdapter.STRING.encodedSizeWithTag(183, awemeStructV2.item_distribute_source) + QuestionInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(185, awemeStructV2.question_list) + AudioStructV2.ADAPTER.encodedSizeWithTag(186, awemeStructV2.audio) + UpvoteReasonV2.ADAPTER.encodedSizeWithTag(187, awemeStructV2.upvote_reason) + ProtoAdapter.INT32.encodedSizeWithTag(188, awemeStructV2.deduplication_type) + InteractionTagInfoV2.ADAPTER.encodedSizeWithTag(189, awemeStructV2.interaction_tag_info) + ProtoAdapter.STRING.encodedSizeWithTag(com.bytedance.vcloud.mlcomponent_api.BuildConfig.VERSION_CODE, awemeStructV2.content_desc) + TextExtraStructV2.ADAPTER.asRepeated().encodedSizeWithTag(191, awemeStructV2.content_desc_extra) + DuetInfoV2.ADAPTER.encodedSizeWithTag(193, awemeStructV2.duet_info) + ProtoAdapter.STRING.encodedSizeWithTag(194, awemeStructV2.extra_info) + ProtoAdapter.INT32.encodedSizeWithTag(195, awemeStructV2.item_source_category) + ProtoAdapter.BOOL.encodedSizeWithTag(196, awemeStructV2.enable_pos_adjust) + ProtoAdapter.BOOL.encodedSizeWithTag(197, awemeStructV2.enable_ad_drop) + ProtoAdapter.INT32.encodedSizeWithTag(198, awemeStructV2.pred_playtime) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(199, awemeStructV2.gap_list) + ProtoAdapter.BOOL.encodedSizeWithTag(200, awemeStructV2.is_client_cache) + ProtoAdapter.INT64.encodedSizeWithTag(201, awemeStructV2.follow_up_publish_from_id) + TrendingBarForYouPageStructV2.ADAPTER.encodedSizeWithTag(202, awemeStructV2.trending_bar_fyp) + MusicDspStructV2.ADAPTER.encodedSizeWithTag(203, awemeStructV2.music_dsp_info) + ProtoAdapter.BOOL.encodedSizeWithTag(204, awemeStructV2.disable_search_trending_bar) + ImageConsumptionInfoV2.ADAPTER.encodedSizeWithTag(205, awemeStructV2.image_post_info) + awemeStructV2.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, AwemeStructV2 awemeStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, awemeStructV2.aweme_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, awemeStructV2.desc);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, awemeStructV2.create_time);
            UserStructV2.ADAPTER.encodeWithTag(protoWriter, 4, awemeStructV2.author);
            MusicStructV2.ADAPTER.encodeWithTag(protoWriter, 5, awemeStructV2.music);
            ChallengeStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, awemeStructV2.cha_list);
            VideoStructV2.ADAPTER.encodeWithTag(protoWriter, 7, awemeStructV2.video);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, awemeStructV2.share_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, awemeStructV2.user_digged);
            AwemeStatisticsStructV2.ADAPTER.encodeWithTag(protoWriter, 10, awemeStructV2.statistics);
            AwemeStatusStructV2.ADAPTER.encodeWithTag(protoWriter, 11, awemeStructV2.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, awemeStructV2.extra);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, awemeStructV2.rate);
            TextExtraStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 14, awemeStructV2.text_extra);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 15, awemeStructV2.label_large);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 16, awemeStructV2.label_thumb);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, awemeStructV2.is_top);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 18, awemeStructV2.label_top);
            ShareStructV2.ADAPTER.encodeWithTag(protoWriter, 19, awemeStructV2.share_info);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 20, awemeStructV2.label_origin_author);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, awemeStructV2.distance);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 22, awemeStructV2.label_music_starter);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 23, awemeStructV2.label_private);
            AwemeLabelStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 24, awemeStructV2.video_labels);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 25, awemeStructV2.is_vr);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 26, awemeStructV2.landing_page);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, awemeStructV2.is_ads);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 29, awemeStructV2.duration);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 30, awemeStructV2.aweme_type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 35, awemeStructV2.cmt_swt);
            ImageInfoStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 36, awemeStructV2.image_infos);
            AwemeRiskStructV2.ADAPTER.encodeWithTag(protoWriter, 37, awemeStructV2.risk_infos);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 38, awemeStructV2.is_relieve);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 39, awemeStructV2.label_friend);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 40, awemeStructV2.sort_label);
            PositionStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 41, awemeStructV2.position);
            PositionStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 42, awemeStructV2.uniqid_position);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 44, awemeStructV2.author_user_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 45, awemeStructV2.bodydance_score);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 46, awemeStructV2.geofencing);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 47, awemeStructV2.is_hash_tag);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 48, awemeStructV2.is_pgcshow);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 49, awemeStructV2.region);
            VideoTextStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 50, awemeStructV2.video_text);
            SpecialStickerStructV2.ADAPTER.encodeWithTag(protoWriter, 52, awemeStructV2.sp_sticker);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 53, awemeStructV2.ad_schedule);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 54, awemeStructV2.collect_stat);
            VideoTextStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 55, awemeStructV2.label_top_text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 57, awemeStructV2.stickers);
            AwemeStructV2.ADAPTER.encodeWithTag(protoWriter, 58, awemeStructV2.forward_item);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 59, awemeStructV2.forward_comment_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 62, awemeStructV2.forward_item_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 63, awemeStructV2.group_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 64, awemeStructV2.pre_forward_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 65, awemeStructV2.prevent_download);
            PositionStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 66, awemeStructV2.nickname_position);
            PositionStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 67, awemeStructV2.challenge_position);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 68, awemeStructV2.item_comment_settings);
            DescendantStructV2.ADAPTER.encodeWithTag(protoWriter, 69, awemeStructV2.descendants);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 70, awemeStructV2.raw_ad_data);
            GameStructV2.ADAPTER.encodeWithTag(protoWriter, 71, awemeStructV2.game_info);
            MicroAppStructV2.ADAPTER.encodeWithTag(protoWriter, 72, awemeStructV2.micro_app_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 73, awemeStructV2.with_promotional_music);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 74, awemeStructV2.link_ad_data);
            CommerceActivityStructV2.ADAPTER.encodeWithTag(protoWriter, 76, awemeStructV2.gesture_red_packet);
            CommerceActivityStructV2.ADAPTER.encodeWithTag(protoWriter, 77, awemeStructV2.activity_pendant);
            NewFaceStickerStructV2.ADAPTER.encodeWithTag(protoWriter, 78, awemeStructV2.sticker_detail);
            LongVideoStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 79, awemeStructV2.long_video);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 80, awemeStructV2.item_duet);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 81, awemeStructV2.item_react);
            AwemeSearchStructV2.ADAPTER.encodeWithTag(protoWriter, 82, awemeStructV2.hot_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 83, awemeStructV2.star_atlas_order_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 84, awemeStructV2.label_music_starter_text);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 85, awemeStructV2.without_watermark);
            PreloadStructV2.ADAPTER.encodeWithTag(protoWriter, 86, awemeStructV2.preload);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 87, awemeStructV2.star_recommend_tag);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 88, awemeStructV2.ad_order_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 89, awemeStructV2.open_platform_name);
            AwemeStarAtlasStructV2.ADAPTER.encodeWithTag(protoWriter, 90, awemeStructV2.star_atlas_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 91, awemeStructV2.desc_language);
            AwemeFloatingCardStructV2.ADAPTER.encodeWithTag(protoWriter, 92, awemeStructV2.floating_card_content);
            InteractionStickerStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 93, awemeStructV2.interaction_stickers);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 95, awemeStructV2.ad_link_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 96, awemeStructV2.take_down_reason);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 97, awemeStructV2.take_down_desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 98, awemeStructV2.simple_promotions);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 99, awemeStructV2.misc_info);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 101, awemeStructV2.origin_comment_ids);
            CommerceConfigDataV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 102, awemeStructV2.commerce_config_data);
            AwemeCommerceStickerStructV2.ADAPTER.encodeWithTag(protoWriter, 103, awemeStructV2.commerce_sticker_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 104, awemeStructV2.enable_top_view);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 105, awemeStructV2.distribute_type);
            VideoControlV2.ADAPTER.encodeWithTag(protoWriter, 106, awemeStructV2.video_control);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 107, awemeStructV2.is_effect_designer);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 108, awemeStructV2.ad_aweme_source);
            AwemeControlStructV2.ADAPTER.encodeWithTag(protoWriter, 109, awemeStructV2.aweme_control);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 110, awemeStructV2.has_vs_entry);
            AnchorStructV2.ADAPTER.encodeWithTag(protoWriter, 111, awemeStructV2.anchor);
            RelationLabelStructV2.ADAPTER.encodeWithTag(protoWriter, 112, awemeStructV2.feed_relation_label);
            MixStructV2.ADAPTER.encodeWithTag(protoWriter, 113, awemeStructV2.mix_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 114, awemeStructV2.simple_shop_seeding);
            HotListStructV2.ADAPTER.encodeWithTag(protoWriter, 115, awemeStructV2.hot_list);
            AwemeCommerceStructV2.ADAPTER.encodeWithTag(protoWriter, 116, awemeStructV2.commerce_info);
            BannerTipV2.ADAPTER.encodeWithTag(protoWriter, 118, awemeStructV2.banner_tip);
            AwemeACLStructV2.ADAPTER.encodeWithTag(protoWriter, 119, awemeStructV2.acl_info);
            AwemeAnchorStructV2.ADAPTER.encodeWithTag(protoWriter, 121, awemeStructV2.anchor_info);
            VPAInfoStructV2.ADAPTER.encodeWithTag(protoWriter, 122, awemeStructV2.vpa_info);
            CNYStructV2.ADAPTER.encodeWithTag(protoWriter, 123, awemeStructV2.cny_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 124, awemeStructV2.is_familiar);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 125, awemeStructV2.need_vs_entry);
            WebcastRoomFeedCellStructV2.ADAPTER.encodeWithTag(protoWriter, 126, awemeStructV2.cell_room);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 127, awemeStructV2.live_reason);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 128, awemeStructV2.video_feed_tag);
            MaskStructV2.ADAPTER.encodeWithTag(protoWriter, 129, awemeStructV2.mask_info);
            LinkMatchStructV2.ADAPTER.encodeWithTag(protoWriter, 130, awemeStructV2.link_match);
            VideoReplyStructV2.ADAPTER.encodeWithTag(protoWriter, 131, awemeStructV2.video_reply_info);
            AnchorCommonStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 132, awemeStructV2.anchors);
            HybridLabelStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 133, awemeStructV2.hybrid_label);
            RelationRecommendStructV2.ADAPTER.encodeWithTag(protoWriter, 134, awemeStructV2.relation_recommend_info);
            UserProfileStructV2.ADAPTER.encodeWithTag(protoWriter, 135, awemeStructV2.user_profile_init_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 136, awemeStructV2.with_survey);
            AwemeSearchStructV2.ADAPTER.encodeWithTag(protoWriter, 137, awemeStructV2.dou_discount_mix_info);
            AwemeACLStructV2.ADAPTER.encodeWithTag(protoWriter, 138, awemeStructV2.aweme_acl);
            AwemeActivityStructV2.ADAPTER.encodeWithTag(protoWriter, 139, awemeStructV2.activity);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 141, awemeStructV2.is_story);
            VisualSearchEntryStructV2.ADAPTER.encodeWithTag(protoWriter, 142, awemeStructV2.vs_entry);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 143, awemeStructV2.item_stitch);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 147, awemeStructV2.show_sticker_guide);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 148, awemeStructV2.story_ttl);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 149, awemeStructV2.is_horizontal);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 150, awemeStructV2.geofencing_regions);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 151, awemeStructV2.city);
            MutualStructV2.ADAPTER.encodeWithTag(protoWriter, 154, awemeStructV2.mutual_relation_tmp);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 160, awemeStructV2.anchors_extras);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 161, awemeStructV2.allow_gift);
            MutualStructV2.ADAPTER.encodeWithTag(protoWriter, 162, awemeStructV2.mutual_relation);
            MaskStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 163, awemeStructV2.mask_infos);
            BoostStructV2.ADAPTER.encodeWithTag(protoWriter, 164, awemeStructV2.boost_tag_info);
            BottomBarStructV2.ADAPTER.encodeWithTag(protoWriter, 165, awemeStructV2.bottom_bar);
            PlaylistInfoV2.ADAPTER.encodeWithTag(protoWriter, 167, awemeStructV2.playlist_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 168, awemeStructV2.sound_exemption);
            StitchV2.ADAPTER.encodeWithTag(protoWriter, 169, awemeStructV2.stitch);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 170, awemeStructV2.playlist_blocked);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 171, awemeStructV2.part_n);
            GreenScreenMaterialV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 172, awemeStructV2.green_screen_materials);
            StitchPermissionStructV2.ADAPTER.encodeWithTag(protoWriter, 173, awemeStructV2.stitch_permission);
            TrendingBarStructV2.ADAPTER.encodeWithTag(protoWriter, 174, awemeStructV2.trending_bar);
            UserStoryV2.ADAPTER.encodeWithTag(protoWriter, LiveFeedRefreshTimeSetting.DEFAULT, awemeStructV2.user_story);
            StoryMetadataV2.ADAPTER.encodeWithTag(protoWriter, 181, awemeStructV2.story_metadata);
            InteractPermissionV2.ADAPTER.encodeWithTag(protoWriter, 182, awemeStructV2.interact_permission);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 183, awemeStructV2.item_distribute_source);
            QuestionInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 185, awemeStructV2.question_list);
            AudioStructV2.ADAPTER.encodeWithTag(protoWriter, 186, awemeStructV2.audio);
            UpvoteReasonV2.ADAPTER.encodeWithTag(protoWriter, 187, awemeStructV2.upvote_reason);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 188, awemeStructV2.deduplication_type);
            InteractionTagInfoV2.ADAPTER.encodeWithTag(protoWriter, 189, awemeStructV2.interaction_tag_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, com.bytedance.vcloud.mlcomponent_api.BuildConfig.VERSION_CODE, awemeStructV2.content_desc);
            TextExtraStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 191, awemeStructV2.content_desc_extra);
            DuetInfoV2.ADAPTER.encodeWithTag(protoWriter, 193, awemeStructV2.duet_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 194, awemeStructV2.extra_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 195, awemeStructV2.item_source_category);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 196, awemeStructV2.enable_pos_adjust);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 197, awemeStructV2.enable_ad_drop);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 198, awemeStructV2.pred_playtime);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 199, awemeStructV2.gap_list);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 200, awemeStructV2.is_client_cache);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 201, awemeStructV2.follow_up_publish_from_id);
            TrendingBarForYouPageStructV2.ADAPTER.encodeWithTag(protoWriter, 202, awemeStructV2.trending_bar_fyp);
            MusicDspStructV2.ADAPTER.encodeWithTag(protoWriter, 203, awemeStructV2.music_dsp_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 204, awemeStructV2.disable_search_trending_bar);
            ImageConsumptionInfoV2.ADAPTER.encodeWithTag(protoWriter, 205, awemeStructV2.image_post_info);
            protoWriter.writeBytes(awemeStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101915);
    }

    public static final class Builder extends Message.Builder<AwemeStructV2, Builder> {
        public AwemeACLStructV2 acl_info;
        public AwemeActivityStructV2 activity;
        public CommerceActivityStructV2 activity_pendant;
        public Integer ad_aweme_source;
        public Integer ad_link_type;
        public String ad_order_id;
        public String ad_schedule;
        public Boolean allow_gift;
        public AnchorStructV2 anchor;
        public AwemeAnchorStructV2 anchor_info;
        public List<AnchorCommonStructV2> anchors = Internal.newMutableList();
        public String anchors_extras;
        public AudioStructV2 audio;
        public UserStructV2 author;
        public Long author_user_id;
        public AwemeACLStructV2 aweme_acl;
        public AwemeControlStructV2 aweme_control;
        public String aweme_id;
        public Integer aweme_type;
        public BannerTipV2 banner_tip;
        public Integer bodydance_score;
        public BoostStructV2 boost_tag_info;
        public BottomBarStructV2 bottom_bar;
        public WebcastRoomFeedCellStructV2 cell_room;
        public List<ChallengeStructV2> cha_list = Internal.newMutableList();
        public List<PositionStructV2> challenge_position = Internal.newMutableList();
        public String city;
        public Boolean cmt_swt;
        public CNYStructV2 cny_info;
        public Integer collect_stat;
        public List<CommerceConfigDataV2> commerce_config_data = Internal.newMutableList();
        public AwemeCommerceStructV2 commerce_info;
        public AwemeCommerceStickerStructV2 commerce_sticker_info;
        public String content_desc;
        public List<TextExtraStructV2> content_desc_extra = Internal.newMutableList();
        public Long create_time;
        public Integer deduplication_type;
        public String desc;
        public String desc_language;
        public DescendantStructV2 descendants;
        public Boolean disable_search_trending_bar;
        public String distance;
        public Integer distribute_type;
        public AwemeSearchStructV2 dou_discount_mix_info;
        public DuetInfoV2 duet_info;
        public Integer duration;
        public Boolean enable_ad_drop;
        public Boolean enable_pos_adjust;
        public Boolean enable_top_view;
        public String extra;
        public String extra_info;
        public RelationLabelStructV2 feed_relation_label;
        public AwemeFloatingCardStructV2 floating_card_content;
        public Long follow_up_publish_from_id;
        public String forward_comment_id;
        public AwemeStructV2 forward_item;
        public String forward_item_id;
        public GameStructV2 game_info;
        public List<Integer> gap_list = Internal.newMutableList();
        public List<String> geofencing = Internal.newMutableList();
        public List<String> geofencing_regions = Internal.newMutableList();
        public CommerceActivityStructV2 gesture_red_packet;
        public List<GreenScreenMaterialV2> green_screen_materials = Internal.newMutableList();
        public String group_id;
        public Boolean has_vs_entry;
        public AwemeSearchStructV2 hot_info;
        public HotListStructV2 hot_list;
        public List<HybridLabelStructV2> hybrid_label = Internal.newMutableList();
        public List<ImageInfoStructV2> image_infos = Internal.newMutableList();
        public ImageConsumptionInfoV2 image_post_info;
        public InteractPermissionV2 interact_permission;
        public List<InteractionStickerStructV2> interaction_stickers = Internal.newMutableList();
        public InteractionTagInfoV2 interaction_tag_info;
        public Boolean is_ads;
        public Boolean is_client_cache;
        public Integer is_effect_designer;
        public Boolean is_familiar;
        public Integer is_hash_tag;
        public Boolean is_horizontal;
        public Boolean is_pgcshow;
        public Boolean is_relieve;
        public Integer is_story;
        public Integer is_top;
        public Boolean is_vr;
        public Integer item_comment_settings;
        public String item_distribute_source;
        public Integer item_duet;
        public Integer item_react;
        public Integer item_source_category;
        public Integer item_stitch;
        public UrlStructV2 label_friend;
        public UrlStructV2 label_large;
        public UrlStructV2 label_music_starter;
        public String label_music_starter_text;
        public UrlStructV2 label_origin_author;
        public UrlStructV2 label_private;
        public UrlStructV2 label_thumb;
        public UrlStructV2 label_top;
        public List<VideoTextStructV2> label_top_text = Internal.newMutableList();
        public String landing_page;
        public String link_ad_data;
        public LinkMatchStructV2 link_match;
        public String live_reason;
        public List<LongVideoStructV2> long_video = Internal.newMutableList();
        public MaskStructV2 mask_info;
        public List<MaskStructV2> mask_infos = Internal.newMutableList();
        public MicroAppStructV2 micro_app_info;
        public String misc_info;
        public MixStructV2 mix_info;
        public MusicStructV2 music;
        public MusicDspStructV2 music_dsp_info;
        public MutualStructV2 mutual_relation;
        public MutualStructV2 mutual_relation_tmp;
        public Boolean need_vs_entry;
        public List<PositionStructV2> nickname_position = Internal.newMutableList();
        public String open_platform_name;
        public List<String> origin_comment_ids = Internal.newMutableList();
        public String part_n;
        public Boolean playlist_blocked;
        public PlaylistInfoV2 playlist_info;
        public List<PositionStructV2> position = Internal.newMutableList();
        public String pre_forward_id;
        public Integer pred_playtime;
        public PreloadStructV2 preload;
        public Boolean prevent_download;
        public List<QuestionInfoV2> question_list = Internal.newMutableList();
        public Integer rate;
        public String raw_ad_data;
        public String region;
        public RelationRecommendStructV2 relation_recommend_info;
        public AwemeRiskStructV2 risk_infos;
        public ShareStructV2 share_info;
        public String share_url;
        public Boolean show_sticker_guide;
        public String simple_promotions;
        public String simple_shop_seeding;
        public String sort_label;
        public Integer sound_exemption;
        public SpecialStickerStructV2 sp_sticker;
        public AwemeStarAtlasStructV2 star_atlas_info;
        public Long star_atlas_order_id;
        public String star_recommend_tag;
        public AwemeStatisticsStructV2 statistics;
        public AwemeStatusStructV2 status;
        public NewFaceStickerStructV2 sticker_detail;
        public String stickers;
        public StitchV2 stitch;
        public StitchPermissionStructV2 stitch_permission;
        public StoryMetadataV2 story_metadata;
        public Integer story_ttl;
        public String take_down_desc;
        public Integer take_down_reason;
        public List<TextExtraStructV2> text_extra = Internal.newMutableList();
        public TrendingBarStructV2 trending_bar;
        public TrendingBarForYouPageStructV2 trending_bar_fyp;
        public List<PositionStructV2> uniqid_position = Internal.newMutableList();
        public UpvoteReasonV2 upvote_reason;
        public Integer user_digged;
        public UserProfileStructV2 user_profile_init_info;
        public UserStoryV2 user_story;
        public VideoStructV2 video;
        public VideoControlV2 video_control;
        public String video_feed_tag;
        public List<AwemeLabelStructV2> video_labels = Internal.newMutableList();
        public VideoReplyStructV2 video_reply_info;
        public List<VideoTextStructV2> video_text = Internal.newMutableList();
        public VPAInfoStructV2 vpa_info;
        public VisualSearchEntryStructV2 vs_entry;
        public Boolean with_promotional_music;
        public Boolean with_survey;
        public Boolean without_watermark;

        static {
            Covode.recordClassIndex(101916);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AwemeStructV2 build() {
            return new AwemeStructV2(this.aweme_id, this.desc, this.create_time, this.author, this.music, this.cha_list, this.video, this.share_url, this.user_digged, this.statistics, this.status, this.extra, this.rate, this.text_extra, this.label_large, this.label_thumb, this.is_top, this.label_top, this.share_info, this.label_origin_author, this.distance, this.label_music_starter, this.label_private, this.video_labels, this.is_vr, this.landing_page, this.is_ads, this.duration, this.aweme_type, this.cmt_swt, this.image_infos, this.risk_infos, this.is_relieve, this.label_friend, this.sort_label, this.position, this.uniqid_position, this.author_user_id, this.bodydance_score, this.geofencing, this.is_hash_tag, this.is_pgcshow, this.region, this.video_text, this.sp_sticker, this.ad_schedule, this.collect_stat, this.label_top_text, this.stickers, this.forward_item, this.forward_comment_id, this.forward_item_id, this.group_id, this.pre_forward_id, this.prevent_download, this.nickname_position, this.challenge_position, this.item_comment_settings, this.descendants, this.raw_ad_data, this.game_info, this.micro_app_info, this.with_promotional_music, this.link_ad_data, this.gesture_red_packet, this.activity_pendant, this.sticker_detail, this.long_video, this.item_duet, this.item_react, this.hot_info, this.star_atlas_order_id, this.label_music_starter_text, this.without_watermark, this.preload, this.star_recommend_tag, this.ad_order_id, this.open_platform_name, this.star_atlas_info, this.desc_language, this.floating_card_content, this.interaction_stickers, this.ad_link_type, this.take_down_reason, this.take_down_desc, this.simple_promotions, this.misc_info, this.origin_comment_ids, this.commerce_config_data, this.commerce_sticker_info, this.enable_top_view, this.distribute_type, this.video_control, this.is_effect_designer, this.ad_aweme_source, this.aweme_control, this.has_vs_entry, this.anchor, this.feed_relation_label, this.mix_info, this.simple_shop_seeding, this.hot_list, this.commerce_info, this.banner_tip, this.acl_info, this.anchor_info, this.vpa_info, this.cny_info, this.is_familiar, this.need_vs_entry, this.cell_room, this.live_reason, this.video_feed_tag, this.mask_info, this.link_match, this.video_reply_info, this.anchors, this.hybrid_label, this.relation_recommend_info, this.user_profile_init_info, this.with_survey, this.dou_discount_mix_info, this.aweme_acl, this.activity, this.is_story, this.vs_entry, this.item_stitch, this.show_sticker_guide, this.story_ttl, this.is_horizontal, this.geofencing_regions, this.city, this.mutual_relation_tmp, this.anchors_extras, this.allow_gift, this.mutual_relation, this.mask_infos, this.boost_tag_info, this.bottom_bar, this.playlist_info, this.sound_exemption, this.stitch, this.playlist_blocked, this.part_n, this.green_screen_materials, this.stitch_permission, this.trending_bar, this.user_story, this.story_metadata, this.interact_permission, this.item_distribute_source, this.question_list, this.audio, this.upvote_reason, this.deduplication_type, this.interaction_tag_info, this.content_desc, this.content_desc_extra, this.duet_info, this.extra_info, this.item_source_category, this.enable_pos_adjust, this.enable_ad_drop, this.pred_playtime, this.gap_list, this.is_client_cache, this.follow_up_publish_from_id, this.trending_bar_fyp, this.music_dsp_info, this.disable_search_trending_bar, this.image_post_info, super.buildUnknownFields());
        }

        public final Builder acl_info(AwemeACLStructV2 awemeACLStructV2) {
            this.acl_info = awemeACLStructV2;
            return this;
        }

        public final Builder activity(AwemeActivityStructV2 awemeActivityStructV2) {
            this.activity = awemeActivityStructV2;
            return this;
        }

        public final Builder activity_pendant(CommerceActivityStructV2 commerceActivityStructV2) {
            this.activity_pendant = commerceActivityStructV2;
            return this;
        }

        public final Builder ad_aweme_source(Integer num) {
            this.ad_aweme_source = num;
            return this;
        }

        public final Builder ad_link_type(Integer num) {
            this.ad_link_type = num;
            return this;
        }

        public final Builder ad_order_id(String str) {
            this.ad_order_id = str;
            return this;
        }

        public final Builder ad_schedule(String str) {
            this.ad_schedule = str;
            return this;
        }

        public final Builder allow_gift(Boolean bool) {
            this.allow_gift = bool;
            return this;
        }

        public final Builder anchor(AnchorStructV2 anchorStructV2) {
            this.anchor = anchorStructV2;
            return this;
        }

        public final Builder anchor_info(AwemeAnchorStructV2 awemeAnchorStructV2) {
            this.anchor_info = awemeAnchorStructV2;
            return this;
        }

        public final Builder anchors_extras(String str) {
            this.anchors_extras = str;
            return this;
        }

        public final Builder audio(AudioStructV2 audioStructV2) {
            this.audio = audioStructV2;
            return this;
        }

        public final Builder author(UserStructV2 userStructV2) {
            this.author = userStructV2;
            return this;
        }

        public final Builder author_user_id(Long l2) {
            this.author_user_id = l2;
            return this;
        }

        public final Builder aweme_acl(AwemeACLStructV2 awemeACLStructV2) {
            this.aweme_acl = awemeACLStructV2;
            return this;
        }

        public final Builder aweme_control(AwemeControlStructV2 awemeControlStructV2) {
            this.aweme_control = awemeControlStructV2;
            return this;
        }

        public final Builder aweme_id(String str) {
            this.aweme_id = str;
            return this;
        }

        public final Builder aweme_type(Integer num) {
            this.aweme_type = num;
            return this;
        }

        public final Builder banner_tip(BannerTipV2 bannerTipV2) {
            this.banner_tip = bannerTipV2;
            return this;
        }

        public final Builder bodydance_score(Integer num) {
            this.bodydance_score = num;
            return this;
        }

        public final Builder boost_tag_info(BoostStructV2 boostStructV2) {
            this.boost_tag_info = boostStructV2;
            return this;
        }

        public final Builder bottom_bar(BottomBarStructV2 bottomBarStructV2) {
            this.bottom_bar = bottomBarStructV2;
            return this;
        }

        public final Builder cell_room(WebcastRoomFeedCellStructV2 webcastRoomFeedCellStructV2) {
            this.cell_room = webcastRoomFeedCellStructV2;
            return this;
        }

        public final Builder city(String str) {
            this.city = str;
            return this;
        }

        public final Builder cmt_swt(Boolean bool) {
            this.cmt_swt = bool;
            return this;
        }

        public final Builder cny_info(CNYStructV2 cNYStructV2) {
            this.cny_info = cNYStructV2;
            return this;
        }

        public final Builder collect_stat(Integer num) {
            this.collect_stat = num;
            return this;
        }

        public final Builder commerce_info(AwemeCommerceStructV2 awemeCommerceStructV2) {
            this.commerce_info = awemeCommerceStructV2;
            return this;
        }

        public final Builder commerce_sticker_info(AwemeCommerceStickerStructV2 awemeCommerceStickerStructV2) {
            this.commerce_sticker_info = awemeCommerceStickerStructV2;
            return this;
        }

        public final Builder content_desc(String str) {
            this.content_desc = str;
            return this;
        }

        public final Builder create_time(Long l2) {
            this.create_time = l2;
            return this;
        }

        public final Builder deduplication_type(Integer num) {
            this.deduplication_type = num;
            return this;
        }

        public final Builder desc(String str) {
            this.desc = str;
            return this;
        }

        public final Builder desc_language(String str) {
            this.desc_language = str;
            return this;
        }

        public final Builder descendants(DescendantStructV2 descendantStructV2) {
            this.descendants = descendantStructV2;
            return this;
        }

        public final Builder disable_search_trending_bar(Boolean bool) {
            this.disable_search_trending_bar = bool;
            return this;
        }

        public final Builder distance(String str) {
            this.distance = str;
            return this;
        }

        public final Builder distribute_type(Integer num) {
            this.distribute_type = num;
            return this;
        }

        public final Builder dou_discount_mix_info(AwemeSearchStructV2 awemeSearchStructV2) {
            this.dou_discount_mix_info = awemeSearchStructV2;
            return this;
        }

        public final Builder duet_info(DuetInfoV2 duetInfoV2) {
            this.duet_info = duetInfoV2;
            return this;
        }

        public final Builder duration(Integer num) {
            this.duration = num;
            return this;
        }

        public final Builder enable_ad_drop(Boolean bool) {
            this.enable_ad_drop = bool;
            return this;
        }

        public final Builder enable_pos_adjust(Boolean bool) {
            this.enable_pos_adjust = bool;
            return this;
        }

        public final Builder enable_top_view(Boolean bool) {
            this.enable_top_view = bool;
            return this;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder extra_info(String str) {
            this.extra_info = str;
            return this;
        }

        public final Builder feed_relation_label(RelationLabelStructV2 relationLabelStructV2) {
            this.feed_relation_label = relationLabelStructV2;
            return this;
        }

        public final Builder floating_card_content(AwemeFloatingCardStructV2 awemeFloatingCardStructV2) {
            this.floating_card_content = awemeFloatingCardStructV2;
            return this;
        }

        public final Builder follow_up_publish_from_id(Long l2) {
            this.follow_up_publish_from_id = l2;
            return this;
        }

        public final Builder forward_comment_id(String str) {
            this.forward_comment_id = str;
            return this;
        }

        public final Builder forward_item(AwemeStructV2 awemeStructV2) {
            this.forward_item = awemeStructV2;
            return this;
        }

        public final Builder forward_item_id(String str) {
            this.forward_item_id = str;
            return this;
        }

        public final Builder game_info(GameStructV2 gameStructV2) {
            this.game_info = gameStructV2;
            return this;
        }

        public final Builder gesture_red_packet(CommerceActivityStructV2 commerceActivityStructV2) {
            this.gesture_red_packet = commerceActivityStructV2;
            return this;
        }

        public final Builder group_id(String str) {
            this.group_id = str;
            return this;
        }

        public final Builder has_vs_entry(Boolean bool) {
            this.has_vs_entry = bool;
            return this;
        }

        public final Builder hot_info(AwemeSearchStructV2 awemeSearchStructV2) {
            this.hot_info = awemeSearchStructV2;
            return this;
        }

        public final Builder hot_list(HotListStructV2 hotListStructV2) {
            this.hot_list = hotListStructV2;
            return this;
        }

        public final Builder image_post_info(ImageConsumptionInfoV2 imageConsumptionInfoV2) {
            this.image_post_info = imageConsumptionInfoV2;
            return this;
        }

        public final Builder interact_permission(InteractPermissionV2 interactPermissionV2) {
            this.interact_permission = interactPermissionV2;
            return this;
        }

        public final Builder interaction_tag_info(InteractionTagInfoV2 interactionTagInfoV2) {
            this.interaction_tag_info = interactionTagInfoV2;
            return this;
        }

        public final Builder is_ads(Boolean bool) {
            this.is_ads = bool;
            return this;
        }

        public final Builder is_client_cache(Boolean bool) {
            this.is_client_cache = bool;
            return this;
        }

        public final Builder is_effect_designer(Integer num) {
            this.is_effect_designer = num;
            return this;
        }

        public final Builder is_familiar(Boolean bool) {
            this.is_familiar = bool;
            return this;
        }

        public final Builder is_hash_tag(Integer num) {
            this.is_hash_tag = num;
            return this;
        }

        public final Builder is_horizontal(Boolean bool) {
            this.is_horizontal = bool;
            return this;
        }

        public final Builder is_pgcshow(Boolean bool) {
            this.is_pgcshow = bool;
            return this;
        }

        public final Builder is_relieve(Boolean bool) {
            this.is_relieve = bool;
            return this;
        }

        public final Builder is_story(Integer num) {
            this.is_story = num;
            return this;
        }

        public final Builder is_top(Integer num) {
            this.is_top = num;
            return this;
        }

        public final Builder is_vr(Boolean bool) {
            this.is_vr = bool;
            return this;
        }

        public final Builder item_comment_settings(Integer num) {
            this.item_comment_settings = num;
            return this;
        }

        public final Builder item_distribute_source(String str) {
            this.item_distribute_source = str;
            return this;
        }

        public final Builder item_duet(Integer num) {
            this.item_duet = num;
            return this;
        }

        public final Builder item_react(Integer num) {
            this.item_react = num;
            return this;
        }

        public final Builder item_source_category(Integer num) {
            this.item_source_category = num;
            return this;
        }

        public final Builder item_stitch(Integer num) {
            this.item_stitch = num;
            return this;
        }

        public final Builder label_friend(UrlStructV2 urlStructV2) {
            this.label_friend = urlStructV2;
            return this;
        }

        public final Builder label_large(UrlStructV2 urlStructV2) {
            this.label_large = urlStructV2;
            return this;
        }

        public final Builder label_music_starter(UrlStructV2 urlStructV2) {
            this.label_music_starter = urlStructV2;
            return this;
        }

        public final Builder label_music_starter_text(String str) {
            this.label_music_starter_text = str;
            return this;
        }

        public final Builder label_origin_author(UrlStructV2 urlStructV2) {
            this.label_origin_author = urlStructV2;
            return this;
        }

        public final Builder label_private(UrlStructV2 urlStructV2) {
            this.label_private = urlStructV2;
            return this;
        }

        public final Builder label_thumb(UrlStructV2 urlStructV2) {
            this.label_thumb = urlStructV2;
            return this;
        }

        public final Builder label_top(UrlStructV2 urlStructV2) {
            this.label_top = urlStructV2;
            return this;
        }

        public final Builder landing_page(String str) {
            this.landing_page = str;
            return this;
        }

        public final Builder link_ad_data(String str) {
            this.link_ad_data = str;
            return this;
        }

        public final Builder link_match(LinkMatchStructV2 linkMatchStructV2) {
            this.link_match = linkMatchStructV2;
            return this;
        }

        public final Builder live_reason(String str) {
            this.live_reason = str;
            return this;
        }

        public final Builder mask_info(MaskStructV2 maskStructV2) {
            this.mask_info = maskStructV2;
            return this;
        }

        public final Builder micro_app_info(MicroAppStructV2 microAppStructV2) {
            this.micro_app_info = microAppStructV2;
            return this;
        }

        public final Builder misc_info(String str) {
            this.misc_info = str;
            return this;
        }

        public final Builder mix_info(MixStructV2 mixStructV2) {
            this.mix_info = mixStructV2;
            return this;
        }

        public final Builder music(MusicStructV2 musicStructV2) {
            this.music = musicStructV2;
            return this;
        }

        public final Builder music_dsp_info(MusicDspStructV2 musicDspStructV2) {
            this.music_dsp_info = musicDspStructV2;
            return this;
        }

        public final Builder mutual_relation(MutualStructV2 mutualStructV2) {
            this.mutual_relation = mutualStructV2;
            return this;
        }

        public final Builder mutual_relation_tmp(MutualStructV2 mutualStructV2) {
            this.mutual_relation_tmp = mutualStructV2;
            return this;
        }

        public final Builder need_vs_entry(Boolean bool) {
            this.need_vs_entry = bool;
            return this;
        }

        public final Builder open_platform_name(String str) {
            this.open_platform_name = str;
            return this;
        }

        public final Builder part_n(String str) {
            this.part_n = str;
            return this;
        }

        public final Builder playlist_blocked(Boolean bool) {
            this.playlist_blocked = bool;
            return this;
        }

        public final Builder playlist_info(PlaylistInfoV2 playlistInfoV2) {
            this.playlist_info = playlistInfoV2;
            return this;
        }

        public final Builder pre_forward_id(String str) {
            this.pre_forward_id = str;
            return this;
        }

        public final Builder pred_playtime(Integer num) {
            this.pred_playtime = num;
            return this;
        }

        public final Builder preload(PreloadStructV2 preloadStructV2) {
            this.preload = preloadStructV2;
            return this;
        }

        public final Builder prevent_download(Boolean bool) {
            this.prevent_download = bool;
            return this;
        }

        public final Builder rate(Integer num) {
            this.rate = num;
            return this;
        }

        public final Builder raw_ad_data(String str) {
            this.raw_ad_data = str;
            return this;
        }

        public final Builder region(String str) {
            this.region = str;
            return this;
        }

        public final Builder relation_recommend_info(RelationRecommendStructV2 relationRecommendStructV2) {
            this.relation_recommend_info = relationRecommendStructV2;
            return this;
        }

        public final Builder risk_infos(AwemeRiskStructV2 awemeRiskStructV2) {
            this.risk_infos = awemeRiskStructV2;
            return this;
        }

        public final Builder share_info(ShareStructV2 shareStructV2) {
            this.share_info = shareStructV2;
            return this;
        }

        public final Builder share_url(String str) {
            this.share_url = str;
            return this;
        }

        public final Builder show_sticker_guide(Boolean bool) {
            this.show_sticker_guide = bool;
            return this;
        }

        public final Builder simple_promotions(String str) {
            this.simple_promotions = str;
            return this;
        }

        public final Builder simple_shop_seeding(String str) {
            this.simple_shop_seeding = str;
            return this;
        }

        public final Builder sort_label(String str) {
            this.sort_label = str;
            return this;
        }

        public final Builder sound_exemption(Integer num) {
            this.sound_exemption = num;
            return this;
        }

        public final Builder sp_sticker(SpecialStickerStructV2 specialStickerStructV2) {
            this.sp_sticker = specialStickerStructV2;
            return this;
        }

        public final Builder star_atlas_info(AwemeStarAtlasStructV2 awemeStarAtlasStructV2) {
            this.star_atlas_info = awemeStarAtlasStructV2;
            return this;
        }

        public final Builder star_atlas_order_id(Long l2) {
            this.star_atlas_order_id = l2;
            return this;
        }

        public final Builder star_recommend_tag(String str) {
            this.star_recommend_tag = str;
            return this;
        }

        public final Builder statistics(AwemeStatisticsStructV2 awemeStatisticsStructV2) {
            this.statistics = awemeStatisticsStructV2;
            return this;
        }

        public final Builder status(AwemeStatusStructV2 awemeStatusStructV2) {
            this.status = awemeStatusStructV2;
            return this;
        }

        public final Builder sticker_detail(NewFaceStickerStructV2 newFaceStickerStructV2) {
            this.sticker_detail = newFaceStickerStructV2;
            return this;
        }

        public final Builder stickers(String str) {
            this.stickers = str;
            return this;
        }

        public final Builder stitch(StitchV2 stitchV2) {
            this.stitch = stitchV2;
            return this;
        }

        public final Builder stitch_permission(StitchPermissionStructV2 stitchPermissionStructV2) {
            this.stitch_permission = stitchPermissionStructV2;
            return this;
        }

        public final Builder story_metadata(StoryMetadataV2 storyMetadataV2) {
            this.story_metadata = storyMetadataV2;
            return this;
        }

        public final Builder story_ttl(Integer num) {
            this.story_ttl = num;
            return this;
        }

        public final Builder take_down_desc(String str) {
            this.take_down_desc = str;
            return this;
        }

        public final Builder take_down_reason(Integer num) {
            this.take_down_reason = num;
            return this;
        }

        public final Builder trending_bar(TrendingBarStructV2 trendingBarStructV2) {
            this.trending_bar = trendingBarStructV2;
            return this;
        }

        public final Builder trending_bar_fyp(TrendingBarForYouPageStructV2 trendingBarForYouPageStructV2) {
            this.trending_bar_fyp = trendingBarForYouPageStructV2;
            return this;
        }

        public final Builder upvote_reason(UpvoteReasonV2 upvoteReasonV2) {
            this.upvote_reason = upvoteReasonV2;
            return this;
        }

        public final Builder user_digged(Integer num) {
            this.user_digged = num;
            return this;
        }

        public final Builder user_profile_init_info(UserProfileStructV2 userProfileStructV2) {
            this.user_profile_init_info = userProfileStructV2;
            return this;
        }

        public final Builder user_story(UserStoryV2 userStoryV2) {
            this.user_story = userStoryV2;
            return this;
        }

        public final Builder video(VideoStructV2 videoStructV2) {
            this.video = videoStructV2;
            return this;
        }

        public final Builder video_control(VideoControlV2 videoControlV2) {
            this.video_control = videoControlV2;
            return this;
        }

        public final Builder video_feed_tag(String str) {
            this.video_feed_tag = str;
            return this;
        }

        public final Builder video_reply_info(VideoReplyStructV2 videoReplyStructV2) {
            this.video_reply_info = videoReplyStructV2;
            return this;
        }

        public final Builder vpa_info(VPAInfoStructV2 vPAInfoStructV2) {
            this.vpa_info = vPAInfoStructV2;
            return this;
        }

        public final Builder vs_entry(VisualSearchEntryStructV2 visualSearchEntryStructV2) {
            this.vs_entry = visualSearchEntryStructV2;
            return this;
        }

        public final Builder with_promotional_music(Boolean bool) {
            this.with_promotional_music = bool;
            return this;
        }

        public final Builder with_survey(Boolean bool) {
            this.with_survey = bool;
            return this;
        }

        public final Builder without_watermark(Boolean bool) {
            this.without_watermark = bool;
            return this;
        }

        public final Builder anchors(List<AnchorCommonStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.anchors = list;
            return this;
        }

        public final Builder cha_list(List<ChallengeStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.cha_list = list;
            return this;
        }

        public final Builder challenge_position(List<PositionStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.challenge_position = list;
            return this;
        }

        public final Builder commerce_config_data(List<CommerceConfigDataV2> list) {
            Internal.checkElementsNotNull(list);
            this.commerce_config_data = list;
            return this;
        }

        public final Builder content_desc_extra(List<TextExtraStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.content_desc_extra = list;
            return this;
        }

        public final Builder gap_list(List<Integer> list) {
            Internal.checkElementsNotNull(list);
            this.gap_list = list;
            return this;
        }

        public final Builder geofencing(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.geofencing = list;
            return this;
        }

        public final Builder geofencing_regions(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.geofencing_regions = list;
            return this;
        }

        public final Builder green_screen_materials(List<GreenScreenMaterialV2> list) {
            Internal.checkElementsNotNull(list);
            this.green_screen_materials = list;
            return this;
        }

        public final Builder hybrid_label(List<HybridLabelStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.hybrid_label = list;
            return this;
        }

        public final Builder image_infos(List<ImageInfoStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.image_infos = list;
            return this;
        }

        public final Builder interaction_stickers(List<InteractionStickerStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.interaction_stickers = list;
            return this;
        }

        public final Builder label_top_text(List<VideoTextStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.label_top_text = list;
            return this;
        }

        public final Builder long_video(List<LongVideoStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.long_video = list;
            return this;
        }

        public final Builder mask_infos(List<MaskStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.mask_infos = list;
            return this;
        }

        public final Builder nickname_position(List<PositionStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.nickname_position = list;
            return this;
        }

        public final Builder origin_comment_ids(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.origin_comment_ids = list;
            return this;
        }

        public final Builder position(List<PositionStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.position = list;
            return this;
        }

        public final Builder question_list(List<QuestionInfoV2> list) {
            Internal.checkElementsNotNull(list);
            this.question_list = list;
            return this;
        }

        public final Builder text_extra(List<TextExtraStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.text_extra = list;
            return this;
        }

        public final Builder uniqid_position(List<PositionStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.uniqid_position = list;
            return this;
        }

        public final Builder video_labels(List<AwemeLabelStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.video_labels = list;
            return this;
        }

        public final Builder video_text(List<VideoTextStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.video_text = list;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AwemeStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AwemeStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.aweme_id = this.aweme_id;
        builder.desc = this.desc;
        builder.create_time = this.create_time;
        builder.author = this.author;
        builder.music = this.music;
        builder.cha_list = Internal.copyOf("cha_list", this.cha_list);
        builder.video = this.video;
        builder.share_url = this.share_url;
        builder.user_digged = this.user_digged;
        builder.statistics = this.statistics;
        builder.status = this.status;
        builder.extra = this.extra;
        builder.rate = this.rate;
        builder.text_extra = Internal.copyOf("text_extra", this.text_extra);
        builder.label_large = this.label_large;
        builder.label_thumb = this.label_thumb;
        builder.is_top = this.is_top;
        builder.label_top = this.label_top;
        builder.share_info = this.share_info;
        builder.label_origin_author = this.label_origin_author;
        builder.distance = this.distance;
        builder.label_music_starter = this.label_music_starter;
        builder.label_private = this.label_private;
        builder.video_labels = Internal.copyOf("video_labels", this.video_labels);
        builder.is_vr = this.is_vr;
        builder.landing_page = this.landing_page;
        builder.is_ads = this.is_ads;
        builder.duration = this.duration;
        builder.aweme_type = this.aweme_type;
        builder.cmt_swt = this.cmt_swt;
        builder.image_infos = Internal.copyOf("image_infos", this.image_infos);
        builder.risk_infos = this.risk_infos;
        builder.is_relieve = this.is_relieve;
        builder.label_friend = this.label_friend;
        builder.sort_label = this.sort_label;
        builder.position = Internal.copyOf("position", this.position);
        builder.uniqid_position = Internal.copyOf("uniqid_position", this.uniqid_position);
        builder.author_user_id = this.author_user_id;
        builder.bodydance_score = this.bodydance_score;
        builder.geofencing = Internal.copyOf("geofencing", this.geofencing);
        builder.is_hash_tag = this.is_hash_tag;
        builder.is_pgcshow = this.is_pgcshow;
        builder.region = this.region;
        builder.video_text = Internal.copyOf("video_text", this.video_text);
        builder.sp_sticker = this.sp_sticker;
        builder.ad_schedule = this.ad_schedule;
        builder.collect_stat = this.collect_stat;
        builder.label_top_text = Internal.copyOf("label_top_text", this.label_top_text);
        builder.stickers = this.stickers;
        builder.forward_item = this.forward_item;
        builder.forward_comment_id = this.forward_comment_id;
        builder.forward_item_id = this.forward_item_id;
        builder.group_id = this.group_id;
        builder.pre_forward_id = this.pre_forward_id;
        builder.prevent_download = this.prevent_download;
        builder.nickname_position = Internal.copyOf("nickname_position", this.nickname_position);
        builder.challenge_position = Internal.copyOf("challenge_position", this.challenge_position);
        builder.item_comment_settings = this.item_comment_settings;
        builder.descendants = this.descendants;
        builder.raw_ad_data = this.raw_ad_data;
        builder.game_info = this.game_info;
        builder.micro_app_info = this.micro_app_info;
        builder.with_promotional_music = this.with_promotional_music;
        builder.link_ad_data = this.link_ad_data;
        builder.gesture_red_packet = this.gesture_red_packet;
        builder.activity_pendant = this.activity_pendant;
        builder.sticker_detail = this.sticker_detail;
        builder.long_video = Internal.copyOf("long_video", this.long_video);
        builder.item_duet = this.item_duet;
        builder.item_react = this.item_react;
        builder.hot_info = this.hot_info;
        builder.star_atlas_order_id = this.star_atlas_order_id;
        builder.label_music_starter_text = this.label_music_starter_text;
        builder.without_watermark = this.without_watermark;
        builder.preload = this.preload;
        builder.star_recommend_tag = this.star_recommend_tag;
        builder.ad_order_id = this.ad_order_id;
        builder.open_platform_name = this.open_platform_name;
        builder.star_atlas_info = this.star_atlas_info;
        builder.desc_language = this.desc_language;
        builder.floating_card_content = this.floating_card_content;
        builder.interaction_stickers = Internal.copyOf("interaction_stickers", this.interaction_stickers);
        builder.ad_link_type = this.ad_link_type;
        builder.take_down_reason = this.take_down_reason;
        builder.take_down_desc = this.take_down_desc;
        builder.simple_promotions = this.simple_promotions;
        builder.misc_info = this.misc_info;
        builder.origin_comment_ids = Internal.copyOf("origin_comment_ids", this.origin_comment_ids);
        builder.commerce_config_data = Internal.copyOf("commerce_config_data", this.commerce_config_data);
        builder.commerce_sticker_info = this.commerce_sticker_info;
        builder.enable_top_view = this.enable_top_view;
        builder.distribute_type = this.distribute_type;
        builder.video_control = this.video_control;
        builder.is_effect_designer = this.is_effect_designer;
        builder.ad_aweme_source = this.ad_aweme_source;
        builder.aweme_control = this.aweme_control;
        builder.has_vs_entry = this.has_vs_entry;
        builder.anchor = this.anchor;
        builder.feed_relation_label = this.feed_relation_label;
        builder.mix_info = this.mix_info;
        builder.simple_shop_seeding = this.simple_shop_seeding;
        builder.hot_list = this.hot_list;
        builder.commerce_info = this.commerce_info;
        builder.banner_tip = this.banner_tip;
        builder.acl_info = this.acl_info;
        builder.anchor_info = this.anchor_info;
        builder.vpa_info = this.vpa_info;
        builder.cny_info = this.cny_info;
        builder.is_familiar = this.is_familiar;
        builder.need_vs_entry = this.need_vs_entry;
        builder.cell_room = this.cell_room;
        builder.live_reason = this.live_reason;
        builder.video_feed_tag = this.video_feed_tag;
        builder.mask_info = this.mask_info;
        builder.link_match = this.link_match;
        builder.video_reply_info = this.video_reply_info;
        builder.anchors = Internal.copyOf("anchors", this.anchors);
        builder.hybrid_label = Internal.copyOf("hybrid_label", this.hybrid_label);
        builder.relation_recommend_info = this.relation_recommend_info;
        builder.user_profile_init_info = this.user_profile_init_info;
        builder.with_survey = this.with_survey;
        builder.dou_discount_mix_info = this.dou_discount_mix_info;
        builder.aweme_acl = this.aweme_acl;
        builder.activity = this.activity;
        builder.is_story = this.is_story;
        builder.vs_entry = this.vs_entry;
        builder.item_stitch = this.item_stitch;
        builder.show_sticker_guide = this.show_sticker_guide;
        builder.story_ttl = this.story_ttl;
        builder.is_horizontal = this.is_horizontal;
        builder.geofencing_regions = Internal.copyOf("geofencing_regions", this.geofencing_regions);
        builder.city = this.city;
        builder.mutual_relation_tmp = this.mutual_relation_tmp;
        builder.anchors_extras = this.anchors_extras;
        builder.allow_gift = this.allow_gift;
        builder.mutual_relation = this.mutual_relation;
        builder.mask_infos = Internal.copyOf("mask_infos", this.mask_infos);
        builder.boost_tag_info = this.boost_tag_info;
        builder.bottom_bar = this.bottom_bar;
        builder.playlist_info = this.playlist_info;
        builder.sound_exemption = this.sound_exemption;
        builder.stitch = this.stitch;
        builder.playlist_blocked = this.playlist_blocked;
        builder.part_n = this.part_n;
        builder.green_screen_materials = Internal.copyOf("green_screen_materials", this.green_screen_materials);
        builder.stitch_permission = this.stitch_permission;
        builder.trending_bar = this.trending_bar;
        builder.user_story = this.user_story;
        builder.story_metadata = this.story_metadata;
        builder.interact_permission = this.interact_permission;
        builder.item_distribute_source = this.item_distribute_source;
        builder.question_list = Internal.copyOf("question_list", this.question_list);
        builder.audio = this.audio;
        builder.upvote_reason = this.upvote_reason;
        builder.deduplication_type = this.deduplication_type;
        builder.interaction_tag_info = this.interaction_tag_info;
        builder.content_desc = this.content_desc;
        builder.content_desc_extra = Internal.copyOf("content_desc_extra", this.content_desc_extra);
        builder.duet_info = this.duet_info;
        builder.extra_info = this.extra_info;
        builder.item_source_category = this.item_source_category;
        builder.enable_pos_adjust = this.enable_pos_adjust;
        builder.enable_ad_drop = this.enable_ad_drop;
        builder.pred_playtime = this.pred_playtime;
        builder.gap_list = Internal.copyOf("gap_list", this.gap_list);
        builder.is_client_cache = this.is_client_cache;
        builder.follow_up_publish_from_id = this.follow_up_publish_from_id;
        builder.trending_bar_fyp = this.trending_bar_fyp;
        builder.music_dsp_info = this.music_dsp_info;
        builder.disable_search_trending_bar = this.disable_search_trending_bar;
        builder.image_post_info = this.image_post_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeStructV2)) {
            return false;
        }
        AwemeStructV2 awemeStructV2 = (AwemeStructV2) obj;
        if (!unknownFields().equals(awemeStructV2.unknownFields()) || !Internal.equals(this.aweme_id, awemeStructV2.aweme_id) || !Internal.equals(this.desc, awemeStructV2.desc) || !Internal.equals(this.create_time, awemeStructV2.create_time) || !Internal.equals(this.author, awemeStructV2.author) || !Internal.equals(this.music, awemeStructV2.music) || !this.cha_list.equals(awemeStructV2.cha_list) || !Internal.equals(this.video, awemeStructV2.video) || !Internal.equals(this.share_url, awemeStructV2.share_url) || !Internal.equals(this.user_digged, awemeStructV2.user_digged) || !Internal.equals(this.statistics, awemeStructV2.statistics) || !Internal.equals(this.status, awemeStructV2.status) || !Internal.equals(this.extra, awemeStructV2.extra) || !Internal.equals(this.rate, awemeStructV2.rate) || !this.text_extra.equals(awemeStructV2.text_extra) || !Internal.equals(this.label_large, awemeStructV2.label_large) || !Internal.equals(this.label_thumb, awemeStructV2.label_thumb) || !Internal.equals(this.is_top, awemeStructV2.is_top) || !Internal.equals(this.label_top, awemeStructV2.label_top) || !Internal.equals(this.share_info, awemeStructV2.share_info) || !Internal.equals(this.label_origin_author, awemeStructV2.label_origin_author) || !Internal.equals(this.distance, awemeStructV2.distance) || !Internal.equals(this.label_music_starter, awemeStructV2.label_music_starter) || !Internal.equals(this.label_private, awemeStructV2.label_private) || !this.video_labels.equals(awemeStructV2.video_labels) || !Internal.equals(this.is_vr, awemeStructV2.is_vr) || !Internal.equals(this.landing_page, awemeStructV2.landing_page) || !Internal.equals(this.is_ads, awemeStructV2.is_ads) || !Internal.equals(this.duration, awemeStructV2.duration) || !Internal.equals(this.aweme_type, awemeStructV2.aweme_type) || !Internal.equals(this.cmt_swt, awemeStructV2.cmt_swt) || !this.image_infos.equals(awemeStructV2.image_infos) || !Internal.equals(this.risk_infos, awemeStructV2.risk_infos) || !Internal.equals(this.is_relieve, awemeStructV2.is_relieve) || !Internal.equals(this.label_friend, awemeStructV2.label_friend) || !Internal.equals(this.sort_label, awemeStructV2.sort_label) || !this.position.equals(awemeStructV2.position) || !this.uniqid_position.equals(awemeStructV2.uniqid_position) || !Internal.equals(this.author_user_id, awemeStructV2.author_user_id) || !Internal.equals(this.bodydance_score, awemeStructV2.bodydance_score) || !this.geofencing.equals(awemeStructV2.geofencing) || !Internal.equals(this.is_hash_tag, awemeStructV2.is_hash_tag) || !Internal.equals(this.is_pgcshow, awemeStructV2.is_pgcshow) || !Internal.equals(this.region, awemeStructV2.region) || !this.video_text.equals(awemeStructV2.video_text) || !Internal.equals(this.sp_sticker, awemeStructV2.sp_sticker) || !Internal.equals(this.ad_schedule, awemeStructV2.ad_schedule) || !Internal.equals(this.collect_stat, awemeStructV2.collect_stat) || !this.label_top_text.equals(awemeStructV2.label_top_text) || !Internal.equals(this.stickers, awemeStructV2.stickers) || !Internal.equals(this.forward_item, awemeStructV2.forward_item) || !Internal.equals(this.forward_comment_id, awemeStructV2.forward_comment_id) || !Internal.equals(this.forward_item_id, awemeStructV2.forward_item_id) || !Internal.equals(this.group_id, awemeStructV2.group_id) || !Internal.equals(this.pre_forward_id, awemeStructV2.pre_forward_id) || !Internal.equals(this.prevent_download, awemeStructV2.prevent_download) || !this.nickname_position.equals(awemeStructV2.nickname_position) || !this.challenge_position.equals(awemeStructV2.challenge_position) || !Internal.equals(this.item_comment_settings, awemeStructV2.item_comment_settings) || !Internal.equals(this.descendants, awemeStructV2.descendants) || !Internal.equals(this.raw_ad_data, awemeStructV2.raw_ad_data) || !Internal.equals(this.game_info, awemeStructV2.game_info) || !Internal.equals(this.micro_app_info, awemeStructV2.micro_app_info) || !Internal.equals(this.with_promotional_music, awemeStructV2.with_promotional_music) || !Internal.equals(this.link_ad_data, awemeStructV2.link_ad_data) || !Internal.equals(this.gesture_red_packet, awemeStructV2.gesture_red_packet) || !Internal.equals(this.activity_pendant, awemeStructV2.activity_pendant) || !Internal.equals(this.sticker_detail, awemeStructV2.sticker_detail) || !this.long_video.equals(awemeStructV2.long_video) || !Internal.equals(this.item_duet, awemeStructV2.item_duet) || !Internal.equals(this.item_react, awemeStructV2.item_react) || !Internal.equals(this.hot_info, awemeStructV2.hot_info) || !Internal.equals(this.star_atlas_order_id, awemeStructV2.star_atlas_order_id) || !Internal.equals(this.label_music_starter_text, awemeStructV2.label_music_starter_text) || !Internal.equals(this.without_watermark, awemeStructV2.without_watermark) || !Internal.equals(this.preload, awemeStructV2.preload) || !Internal.equals(this.star_recommend_tag, awemeStructV2.star_recommend_tag) || !Internal.equals(this.ad_order_id, awemeStructV2.ad_order_id) || !Internal.equals(this.open_platform_name, awemeStructV2.open_platform_name) || !Internal.equals(this.star_atlas_info, awemeStructV2.star_atlas_info) || !Internal.equals(this.desc_language, awemeStructV2.desc_language) || !Internal.equals(this.floating_card_content, awemeStructV2.floating_card_content) || !this.interaction_stickers.equals(awemeStructV2.interaction_stickers) || !Internal.equals(this.ad_link_type, awemeStructV2.ad_link_type) || !Internal.equals(this.take_down_reason, awemeStructV2.take_down_reason) || !Internal.equals(this.take_down_desc, awemeStructV2.take_down_desc) || !Internal.equals(this.simple_promotions, awemeStructV2.simple_promotions) || !Internal.equals(this.misc_info, awemeStructV2.misc_info) || !this.origin_comment_ids.equals(awemeStructV2.origin_comment_ids) || !this.commerce_config_data.equals(awemeStructV2.commerce_config_data) || !Internal.equals(this.commerce_sticker_info, awemeStructV2.commerce_sticker_info) || !Internal.equals(this.enable_top_view, awemeStructV2.enable_top_view) || !Internal.equals(this.distribute_type, awemeStructV2.distribute_type) || !Internal.equals(this.video_control, awemeStructV2.video_control) || !Internal.equals(this.is_effect_designer, awemeStructV2.is_effect_designer) || !Internal.equals(this.ad_aweme_source, awemeStructV2.ad_aweme_source) || !Internal.equals(this.aweme_control, awemeStructV2.aweme_control) || !Internal.equals(this.has_vs_entry, awemeStructV2.has_vs_entry) || !Internal.equals(this.anchor, awemeStructV2.anchor) || !Internal.equals(this.feed_relation_label, awemeStructV2.feed_relation_label) || !Internal.equals(this.mix_info, awemeStructV2.mix_info) || !Internal.equals(this.simple_shop_seeding, awemeStructV2.simple_shop_seeding) || !Internal.equals(this.hot_list, awemeStructV2.hot_list) || !Internal.equals(this.commerce_info, awemeStructV2.commerce_info) || !Internal.equals(this.banner_tip, awemeStructV2.banner_tip) || !Internal.equals(this.acl_info, awemeStructV2.acl_info) || !Internal.equals(this.anchor_info, awemeStructV2.anchor_info) || !Internal.equals(this.vpa_info, awemeStructV2.vpa_info) || !Internal.equals(this.cny_info, awemeStructV2.cny_info) || !Internal.equals(this.is_familiar, awemeStructV2.is_familiar) || !Internal.equals(this.need_vs_entry, awemeStructV2.need_vs_entry) || !Internal.equals(this.cell_room, awemeStructV2.cell_room) || !Internal.equals(this.live_reason, awemeStructV2.live_reason) || !Internal.equals(this.video_feed_tag, awemeStructV2.video_feed_tag) || !Internal.equals(this.mask_info, awemeStructV2.mask_info) || !Internal.equals(this.link_match, awemeStructV2.link_match) || !Internal.equals(this.video_reply_info, awemeStructV2.video_reply_info) || !this.anchors.equals(awemeStructV2.anchors) || !this.hybrid_label.equals(awemeStructV2.hybrid_label) || !Internal.equals(this.relation_recommend_info, awemeStructV2.relation_recommend_info) || !Internal.equals(this.user_profile_init_info, awemeStructV2.user_profile_init_info) || !Internal.equals(this.with_survey, awemeStructV2.with_survey) || !Internal.equals(this.dou_discount_mix_info, awemeStructV2.dou_discount_mix_info) || !Internal.equals(this.aweme_acl, awemeStructV2.aweme_acl) || !Internal.equals(this.activity, awemeStructV2.activity) || !Internal.equals(this.is_story, awemeStructV2.is_story) || !Internal.equals(this.vs_entry, awemeStructV2.vs_entry) || !Internal.equals(this.item_stitch, awemeStructV2.item_stitch) || !Internal.equals(this.show_sticker_guide, awemeStructV2.show_sticker_guide) || !Internal.equals(this.story_ttl, awemeStructV2.story_ttl) || !Internal.equals(this.is_horizontal, awemeStructV2.is_horizontal) || !this.geofencing_regions.equals(awemeStructV2.geofencing_regions) || !Internal.equals(this.city, awemeStructV2.city) || !Internal.equals(this.mutual_relation_tmp, awemeStructV2.mutual_relation_tmp) || !Internal.equals(this.anchors_extras, awemeStructV2.anchors_extras) || !Internal.equals(this.allow_gift, awemeStructV2.allow_gift) || !Internal.equals(this.mutual_relation, awemeStructV2.mutual_relation) || !this.mask_infos.equals(awemeStructV2.mask_infos) || !Internal.equals(this.boost_tag_info, awemeStructV2.boost_tag_info) || !Internal.equals(this.bottom_bar, awemeStructV2.bottom_bar) || !Internal.equals(this.playlist_info, awemeStructV2.playlist_info) || !Internal.equals(this.sound_exemption, awemeStructV2.sound_exemption) || !Internal.equals(this.stitch, awemeStructV2.stitch) || !Internal.equals(this.playlist_blocked, awemeStructV2.playlist_blocked) || !Internal.equals(this.part_n, awemeStructV2.part_n) || !this.green_screen_materials.equals(awemeStructV2.green_screen_materials) || !Internal.equals(this.stitch_permission, awemeStructV2.stitch_permission) || !Internal.equals(this.trending_bar, awemeStructV2.trending_bar) || !Internal.equals(this.user_story, awemeStructV2.user_story) || !Internal.equals(this.story_metadata, awemeStructV2.story_metadata) || !Internal.equals(this.interact_permission, awemeStructV2.interact_permission) || !Internal.equals(this.item_distribute_source, awemeStructV2.item_distribute_source) || !this.question_list.equals(awemeStructV2.question_list) || !Internal.equals(this.audio, awemeStructV2.audio) || !Internal.equals(this.upvote_reason, awemeStructV2.upvote_reason) || !Internal.equals(this.deduplication_type, awemeStructV2.deduplication_type) || !Internal.equals(this.interaction_tag_info, awemeStructV2.interaction_tag_info) || !Internal.equals(this.content_desc, awemeStructV2.content_desc) || !this.content_desc_extra.equals(awemeStructV2.content_desc_extra) || !Internal.equals(this.duet_info, awemeStructV2.duet_info) || !Internal.equals(this.extra_info, awemeStructV2.extra_info) || !Internal.equals(this.item_source_category, awemeStructV2.item_source_category) || !Internal.equals(this.enable_pos_adjust, awemeStructV2.enable_pos_adjust) || !Internal.equals(this.enable_ad_drop, awemeStructV2.enable_ad_drop) || !Internal.equals(this.pred_playtime, awemeStructV2.pred_playtime) || !this.gap_list.equals(awemeStructV2.gap_list) || !Internal.equals(this.is_client_cache, awemeStructV2.is_client_cache) || !Internal.equals(this.follow_up_publish_from_id, awemeStructV2.follow_up_publish_from_id) || !Internal.equals(this.trending_bar_fyp, awemeStructV2.trending_bar_fyp) || !Internal.equals(this.music_dsp_info, awemeStructV2.music_dsp_info) || !Internal.equals(this.disable_search_trending_bar, awemeStructV2.disable_search_trending_bar) || !Internal.equals(this.image_post_info, awemeStructV2.image_post_info)) {
            return false;
        }
        return true;
    }
}
