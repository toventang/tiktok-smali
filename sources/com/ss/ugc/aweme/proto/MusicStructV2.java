package com.ss.ugc.aweme.proto;

import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.covode.number.Covode;
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

public final class MusicStructV2 extends Message<MusicStructV2, Builder> {
    public static final ProtoAdapter<MusicStructV2> ADAPTER = new ProtoAdapter_MusicStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String album;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MusicArtistStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 68)
    public List<MusicArtistStructV2> artists;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 27)
    public UrlStructV2 audio_track;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String author;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 38)
    public Boolean author_deleted;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PositionStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 42)
    public List<PositionStructV2> author_position;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 58)
    public UrlStructV2 avatar_large;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 57)
    public UrlStructV2 avatar_medium;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 56)
    public UrlStructV2 avatar_thumb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 32)
    public Integer billboard_rank;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 35)
    public Long binded_challenge_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ChallengeStructV2#ADAPTER", tag = 29)
    public ChallengeStructV2 bodydance_challenge;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 34)
    public UrlStructV2 bodydance_challenge_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 28)
    public UrlStructV2 bodydance_url;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CategoryCoverStructV2#ADAPTER", tag = 46)
    public CategoryCoverStructV2 category_cover_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ChallengeStructV2#ADAPTER", tag = 31)
    public ChallengeStructV2 challenge;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = v.U)
    public Integer collect_stat;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public UrlStructV2 cover_hd;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public UrlStructV2 cover_large;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public UrlStructV2 cover_medium;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public UrlStructV2 cover_thumb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 15)
    public Integer duration;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 23)
    public UrlStructV2 effects_data;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_SELECT_SCENE)
    public Integer end_time;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ExternalSongStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 52)
    public List<ExternalSongStructV2> external_song_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 16)
    public String extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String id_str;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 63)
    public Boolean is_author_artist;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 67)
    public Boolean is_commerce_music;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 39)
    public Boolean is_del_video;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 47)
    public Boolean is_only_owner_use;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 30)
    public Boolean is_original;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 64)
    public Boolean is_pgc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 37)
    public Boolean is_restricted;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 48)
    public Boolean is_video_not_recommend;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 40)
    public Boolean is_video_self_see;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 54)
    public Integer lyric_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 55)
    public String lyric_url;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MatchedPGCSoundStructV2#ADAPTER", tag = 65)
    public MatchedPGCSoundStructV2 matched_pgc_sound;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MatchedSongStructV2#ADAPTER", tag = 66)
    public MatchedSongStructV2 matched_song;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 33)
    public String mid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = BuildConfig.VERSION_CODE)
    public Integer music_billboard_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.BranchBillboardWeeklyStructV2#ADAPTER", tag = 45)
    public BranchBillboardWeeklyStructV2 music_billboard_weekly_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 62)
    public Boolean mute_share;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 22)
    public String offline_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 41)
    public String owner_handle;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 24)
    public String owner_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 25)
    public String owner_nickname;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public UrlStructV2 play_url;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PositionStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = LiveRechargeAgeThresholdSetting.DEFAULT)
    public List<PositionStructV2> position;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 43)
    public Boolean prevent_download;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 51)
    public Integer prevent_item_download_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = AudiencePingIntervalSetting.DEFAULT)
    public Double preview_end_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 59)
    public Double preview_start_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 36)
    public Boolean redirect;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public String schema_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 53)
    public String sec_uid;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ShareStructV2#ADAPTER", tag = 19)
    public ShareStructV2 share_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public Integer source_platform;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_MAX_BITRATE)
    public Integer start_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 21)
    public Integer status;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 49)
    public UrlStructV2 strong_beat_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 50)
    public List<String> unshelve_countries;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 26)
    public String use_count_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 17)
    public Integer user_count;

    public MusicStructV2() {
    }

    public MusicStructV2(Long l2, String str, String str2, String str3, String str4, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, UrlStructV2 urlStructV25, String str5, Integer num, Integer num2, Integer num3, Integer num4, String str6, Integer num5, List<PositionStructV2> list, ShareStructV2 shareStructV2, Integer num6, Integer num7, String str7, UrlStructV2 urlStructV26, String str8, String str9, String str10, UrlStructV2 urlStructV27, UrlStructV2 urlStructV28, ChallengeStructV2 challengeStructV2, Boolean bool, ChallengeStructV2 challengeStructV22, Integer num8, String str11, UrlStructV2 urlStructV29, Long l3, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str12, List<PositionStructV2> list2, Boolean bool7, Integer num9, BranchBillboardWeeklyStructV2 branchBillboardWeeklyStructV2, CategoryCoverStructV2 categoryCoverStructV2, Boolean bool8, Boolean bool9, UrlStructV2 urlStructV210, List<String> list3, Integer num10, List<ExternalSongStructV2> list4, String str13, Integer num11, String str14, UrlStructV2 urlStructV211, UrlStructV2 urlStructV212, UrlStructV2 urlStructV213, Double d2, Double d3, Boolean bool10, Boolean bool11, Boolean bool12, MatchedPGCSoundStructV2 matchedPGCSoundStructV2, MatchedSongStructV2 matchedSongStructV2, Boolean bool13, List<MusicArtistStructV2> list5) {
        this(l2, str, str2, str3, str4, urlStructV2, urlStructV22, urlStructV23, urlStructV24, urlStructV25, str5, num, num2, num3, num4, str6, num5, list, shareStructV2, num6, num7, str7, urlStructV26, str8, str9, str10, urlStructV27, urlStructV28, challengeStructV2, bool, challengeStructV22, num8, str11, urlStructV29, l3, bool2, bool3, bool4, bool5, bool6, str12, list2, bool7, num9, branchBillboardWeeklyStructV2, categoryCoverStructV2, bool8, bool9, urlStructV210, list3, num10, list4, str13, num11, str14, urlStructV211, urlStructV212, urlStructV213, d2, d3, bool10, bool11, bool12, matchedPGCSoundStructV2, matchedSongStructV2, bool13, list5, i.EMPTY);
    }

    public MusicStructV2(Long l2, String str, String str2, String str3, String str4, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, UrlStructV2 urlStructV25, String str5, Integer num, Integer num2, Integer num3, Integer num4, String str6, Integer num5, List<PositionStructV2> list, ShareStructV2 shareStructV2, Integer num6, Integer num7, String str7, UrlStructV2 urlStructV26, String str8, String str9, String str10, UrlStructV2 urlStructV27, UrlStructV2 urlStructV28, ChallengeStructV2 challengeStructV2, Boolean bool, ChallengeStructV2 challengeStructV22, Integer num8, String str11, UrlStructV2 urlStructV29, Long l3, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str12, List<PositionStructV2> list2, Boolean bool7, Integer num9, BranchBillboardWeeklyStructV2 branchBillboardWeeklyStructV2, CategoryCoverStructV2 categoryCoverStructV2, Boolean bool8, Boolean bool9, UrlStructV2 urlStructV210, List<String> list3, Integer num10, List<ExternalSongStructV2> list4, String str13, Integer num11, String str14, UrlStructV2 urlStructV211, UrlStructV2 urlStructV212, UrlStructV2 urlStructV213, Double d2, Double d3, Boolean bool10, Boolean bool11, Boolean bool12, MatchedPGCSoundStructV2 matchedPGCSoundStructV2, MatchedSongStructV2 matchedSongStructV2, Boolean bool13, List<MusicArtistStructV2> list5, i iVar) {
        super(ADAPTER, iVar);
        this.id = l2;
        this.id_str = str;
        this.title = str2;
        this.author = str3;
        this.album = str4;
        this.cover_hd = urlStructV2;
        this.cover_large = urlStructV22;
        this.cover_medium = urlStructV23;
        this.cover_thumb = urlStructV24;
        this.play_url = urlStructV25;
        this.schema_url = str5;
        this.source_platform = num;
        this.start_time = num2;
        this.end_time = num3;
        this.duration = num4;
        this.extra = str6;
        this.user_count = num5;
        this.position = Internal.immutableCopyOf("position", list);
        this.share_info = shareStructV2;
        this.collect_stat = num6;
        this.status = num7;
        this.offline_desc = str7;
        this.effects_data = urlStructV26;
        this.owner_id = str8;
        this.owner_nickname = str9;
        this.use_count_desc = str10;
        this.audio_track = urlStructV27;
        this.bodydance_url = urlStructV28;
        this.bodydance_challenge = challengeStructV2;
        this.is_original = bool;
        this.challenge = challengeStructV22;
        this.billboard_rank = num8;
        this.mid = str11;
        this.bodydance_challenge_id = urlStructV29;
        this.binded_challenge_id = l3;
        this.redirect = bool2;
        this.is_restricted = bool3;
        this.author_deleted = bool4;
        this.is_del_video = bool5;
        this.is_video_self_see = bool6;
        this.owner_handle = str12;
        this.author_position = Internal.immutableCopyOf("author_position", list2);
        this.prevent_download = bool7;
        this.music_billboard_type = num9;
        this.music_billboard_weekly_info = branchBillboardWeeklyStructV2;
        this.category_cover_info = categoryCoverStructV2;
        this.is_only_owner_use = bool8;
        this.is_video_not_recommend = bool9;
        this.strong_beat_url = urlStructV210;
        this.unshelve_countries = Internal.immutableCopyOf("unshelve_countries", list3);
        this.prevent_item_download_status = num10;
        this.external_song_info = Internal.immutableCopyOf("external_song_info", list4);
        this.sec_uid = str13;
        this.lyric_type = num11;
        this.lyric_url = str14;
        this.avatar_thumb = urlStructV211;
        this.avatar_medium = urlStructV212;
        this.avatar_large = urlStructV213;
        this.preview_start_time = d2;
        this.preview_end_time = d3;
        this.mute_share = bool10;
        this.is_author_artist = bool11;
        this.is_pgc = bool12;
        this.matched_pgc_sound = matchedPGCSoundStructV2;
        this.matched_song = matchedSongStructV2;
        this.is_commerce_music = bool13;
        this.artists = Internal.immutableCopyOf("artists", list5);
    }

    static final class ProtoAdapter_MusicStructV2 extends ProtoAdapter<MusicStructV2> {
        static {
            Covode.recordClassIndex(102136);
        }

        public ProtoAdapter_MusicStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MusicStructV2.class);
        }

        public final int encodedSize(MusicStructV2 musicStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, musicStructV2.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, musicStructV2.id_str) + ProtoAdapter.STRING.encodedSizeWithTag(3, musicStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(4, musicStructV2.author) + ProtoAdapter.STRING.encodedSizeWithTag(5, musicStructV2.album) + UrlStructV2.ADAPTER.encodedSizeWithTag(6, musicStructV2.cover_hd) + UrlStructV2.ADAPTER.encodedSizeWithTag(7, musicStructV2.cover_large) + UrlStructV2.ADAPTER.encodedSizeWithTag(8, musicStructV2.cover_medium) + UrlStructV2.ADAPTER.encodedSizeWithTag(9, musicStructV2.cover_thumb) + UrlStructV2.ADAPTER.encodedSizeWithTag(10, musicStructV2.play_url) + ProtoAdapter.STRING.encodedSizeWithTag(11, musicStructV2.schema_url) + ProtoAdapter.INT32.encodedSizeWithTag(12, musicStructV2.source_platform) + ProtoAdapter.INT32.encodedSizeWithTag(13, musicStructV2.start_time) + ProtoAdapter.INT32.encodedSizeWithTag(14, musicStructV2.end_time) + ProtoAdapter.INT32.encodedSizeWithTag(15, musicStructV2.duration) + ProtoAdapter.STRING.encodedSizeWithTag(16, musicStructV2.extra) + ProtoAdapter.INT32.encodedSizeWithTag(17, musicStructV2.user_count) + PositionStructV2.ADAPTER.asRepeated().encodedSizeWithTag(18, musicStructV2.position) + ShareStructV2.ADAPTER.encodedSizeWithTag(19, musicStructV2.share_info) + ProtoAdapter.INT32.encodedSizeWithTag(20, musicStructV2.collect_stat) + ProtoAdapter.INT32.encodedSizeWithTag(21, musicStructV2.status) + ProtoAdapter.STRING.encodedSizeWithTag(22, musicStructV2.offline_desc) + UrlStructV2.ADAPTER.encodedSizeWithTag(23, musicStructV2.effects_data) + ProtoAdapter.STRING.encodedSizeWithTag(24, musicStructV2.owner_id) + ProtoAdapter.STRING.encodedSizeWithTag(25, musicStructV2.owner_nickname) + ProtoAdapter.STRING.encodedSizeWithTag(26, musicStructV2.use_count_desc) + UrlStructV2.ADAPTER.encodedSizeWithTag(27, musicStructV2.audio_track) + UrlStructV2.ADAPTER.encodedSizeWithTag(28, musicStructV2.bodydance_url) + ChallengeStructV2.ADAPTER.encodedSizeWithTag(29, musicStructV2.bodydance_challenge) + ProtoAdapter.BOOL.encodedSizeWithTag(30, musicStructV2.is_original) + ChallengeStructV2.ADAPTER.encodedSizeWithTag(31, musicStructV2.challenge) + ProtoAdapter.INT32.encodedSizeWithTag(32, musicStructV2.billboard_rank) + ProtoAdapter.STRING.encodedSizeWithTag(33, musicStructV2.mid) + UrlStructV2.ADAPTER.encodedSizeWithTag(34, musicStructV2.bodydance_challenge_id) + ProtoAdapter.INT64.encodedSizeWithTag(35, musicStructV2.binded_challenge_id) + ProtoAdapter.BOOL.encodedSizeWithTag(36, musicStructV2.redirect) + ProtoAdapter.BOOL.encodedSizeWithTag(37, musicStructV2.is_restricted) + ProtoAdapter.BOOL.encodedSizeWithTag(38, musicStructV2.author_deleted) + ProtoAdapter.BOOL.encodedSizeWithTag(39, musicStructV2.is_del_video) + ProtoAdapter.BOOL.encodedSizeWithTag(40, musicStructV2.is_video_self_see) + ProtoAdapter.STRING.encodedSizeWithTag(41, musicStructV2.owner_handle) + PositionStructV2.ADAPTER.asRepeated().encodedSizeWithTag(42, musicStructV2.author_position) + ProtoAdapter.BOOL.encodedSizeWithTag(43, musicStructV2.prevent_download) + ProtoAdapter.INT32.encodedSizeWithTag(44, musicStructV2.music_billboard_type) + BranchBillboardWeeklyStructV2.ADAPTER.encodedSizeWithTag(45, musicStructV2.music_billboard_weekly_info) + CategoryCoverStructV2.ADAPTER.encodedSizeWithTag(46, musicStructV2.category_cover_info) + ProtoAdapter.BOOL.encodedSizeWithTag(47, musicStructV2.is_only_owner_use) + ProtoAdapter.BOOL.encodedSizeWithTag(48, musicStructV2.is_video_not_recommend) + UrlStructV2.ADAPTER.encodedSizeWithTag(49, musicStructV2.strong_beat_url) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(50, musicStructV2.unshelve_countries) + ProtoAdapter.INT32.encodedSizeWithTag(51, musicStructV2.prevent_item_download_status) + ExternalSongStructV2.ADAPTER.asRepeated().encodedSizeWithTag(52, musicStructV2.external_song_info) + ProtoAdapter.STRING.encodedSizeWithTag(53, musicStructV2.sec_uid) + ProtoAdapter.INT32.encodedSizeWithTag(54, musicStructV2.lyric_type) + ProtoAdapter.STRING.encodedSizeWithTag(55, musicStructV2.lyric_url) + UrlStructV2.ADAPTER.encodedSizeWithTag(56, musicStructV2.avatar_thumb) + UrlStructV2.ADAPTER.encodedSizeWithTag(57, musicStructV2.avatar_medium) + UrlStructV2.ADAPTER.encodedSizeWithTag(58, musicStructV2.avatar_large) + ProtoAdapter.DOUBLE.encodedSizeWithTag(59, musicStructV2.preview_start_time) + ProtoAdapter.DOUBLE.encodedSizeWithTag(60, musicStructV2.preview_end_time) + ProtoAdapter.BOOL.encodedSizeWithTag(62, musicStructV2.mute_share) + ProtoAdapter.BOOL.encodedSizeWithTag(63, musicStructV2.is_author_artist) + ProtoAdapter.BOOL.encodedSizeWithTag(64, musicStructV2.is_pgc) + MatchedPGCSoundStructV2.ADAPTER.encodedSizeWithTag(65, musicStructV2.matched_pgc_sound) + MatchedSongStructV2.ADAPTER.encodedSizeWithTag(66, musicStructV2.matched_song) + ProtoAdapter.BOOL.encodedSizeWithTag(67, musicStructV2.is_commerce_music) + MusicArtistStructV2.ADAPTER.asRepeated().encodedSizeWithTag(68, musicStructV2.artists) + musicStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MusicStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.id_str(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.title(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.author(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.album(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.cover_hd(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.cover_large(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.cover_medium(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.cover_thumb(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.play_url(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.schema_url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.source_platform(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            builder.start_time(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            builder.end_time(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 15:
                            builder.duration(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 16:
                            builder.extra(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 17:
                            builder.user_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            builder.position.add(PositionStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            builder.share_info(ShareStructV2.ADAPTER.decode(protoReader));
                            break;
                        case v.U:
                            builder.collect_stat(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 21:
                            builder.status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 22:
                            builder.offline_desc(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 23:
                            builder.effects_data(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 24:
                            builder.owner_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 25:
                            builder.owner_nickname(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 26:
                            builder.use_count_desc(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 27:
                            builder.audio_track(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 28:
                            builder.bodydance_url(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 29:
                            builder.bodydance_challenge(ChallengeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 30:
                            builder.is_original(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 31:
                            builder.challenge(ChallengeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 32:
                            builder.billboard_rank(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 33:
                            builder.mid(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 34:
                            builder.bodydance_challenge_id(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 35:
                            builder.binded_challenge_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 36:
                            builder.redirect(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 37:
                            builder.is_restricted(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 38:
                            builder.author_deleted(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 39:
                            builder.is_del_video(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 40:
                            builder.is_video_self_see(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 41:
                            builder.owner_handle(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 42:
                            builder.author_position.add(PositionStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 43:
                            builder.prevent_download(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case BuildConfig.VERSION_CODE:
                            builder.music_billboard_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 45:
                            builder.music_billboard_weekly_info(BranchBillboardWeeklyStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 46:
                            builder.category_cover_info(CategoryCoverStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 47:
                            builder.is_only_owner_use(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 48:
                            builder.is_video_not_recommend(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 49:
                            builder.strong_beat_url(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 50:
                            builder.unshelve_countries.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 51:
                            builder.prevent_item_download_status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 52:
                            builder.external_song_info.add(ExternalSongStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 53:
                            builder.sec_uid(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 54:
                            builder.lyric_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 55:
                            builder.lyric_url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 56:
                            builder.avatar_thumb(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 57:
                            builder.avatar_medium(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 58:
                            builder.avatar_large(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 59:
                            builder.preview_start_time(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case AudiencePingIntervalSetting.DEFAULT:
                            builder.preview_end_time(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 61:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 62:
                            builder.mute_share(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 63:
                            builder.is_author_artist(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 64:
                            builder.is_pgc(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 65:
                            builder.matched_pgc_sound(MatchedPGCSoundStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 66:
                            builder.matched_song(MatchedSongStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 67:
                            builder.is_commerce_music(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 68:
                            builder.artists.add(MusicArtistStructV2.ADAPTER.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MusicStructV2 musicStructV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, musicStructV2.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, musicStructV2.id_str);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, musicStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, musicStructV2.author);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, musicStructV2.album);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 6, musicStructV2.cover_hd);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 7, musicStructV2.cover_large);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 8, musicStructV2.cover_medium);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 9, musicStructV2.cover_thumb);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 10, musicStructV2.play_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, musicStructV2.schema_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, musicStructV2.source_platform);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, musicStructV2.start_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 14, musicStructV2.end_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, musicStructV2.duration);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, musicStructV2.extra);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, musicStructV2.user_count);
            PositionStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 18, musicStructV2.position);
            ShareStructV2.ADAPTER.encodeWithTag(protoWriter, 19, musicStructV2.share_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 20, musicStructV2.collect_stat);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 21, musicStructV2.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, musicStructV2.offline_desc);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 23, musicStructV2.effects_data);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 24, musicStructV2.owner_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 25, musicStructV2.owner_nickname);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 26, musicStructV2.use_count_desc);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 27, musicStructV2.audio_track);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 28, musicStructV2.bodydance_url);
            ChallengeStructV2.ADAPTER.encodeWithTag(protoWriter, 29, musicStructV2.bodydance_challenge);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 30, musicStructV2.is_original);
            ChallengeStructV2.ADAPTER.encodeWithTag(protoWriter, 31, musicStructV2.challenge);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 32, musicStructV2.billboard_rank);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 33, musicStructV2.mid);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 34, musicStructV2.bodydance_challenge_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 35, musicStructV2.binded_challenge_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 36, musicStructV2.redirect);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 37, musicStructV2.is_restricted);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 38, musicStructV2.author_deleted);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 39, musicStructV2.is_del_video);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 40, musicStructV2.is_video_self_see);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 41, musicStructV2.owner_handle);
            PositionStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 42, musicStructV2.author_position);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 43, musicStructV2.prevent_download);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 44, musicStructV2.music_billboard_type);
            BranchBillboardWeeklyStructV2.ADAPTER.encodeWithTag(protoWriter, 45, musicStructV2.music_billboard_weekly_info);
            CategoryCoverStructV2.ADAPTER.encodeWithTag(protoWriter, 46, musicStructV2.category_cover_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 47, musicStructV2.is_only_owner_use);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 48, musicStructV2.is_video_not_recommend);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 49, musicStructV2.strong_beat_url);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 50, musicStructV2.unshelve_countries);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 51, musicStructV2.prevent_item_download_status);
            ExternalSongStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 52, musicStructV2.external_song_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 53, musicStructV2.sec_uid);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 54, musicStructV2.lyric_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 55, musicStructV2.lyric_url);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 56, musicStructV2.avatar_thumb);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 57, musicStructV2.avatar_medium);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 58, musicStructV2.avatar_large);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 59, musicStructV2.preview_start_time);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 60, musicStructV2.preview_end_time);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 62, musicStructV2.mute_share);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 63, musicStructV2.is_author_artist);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 64, musicStructV2.is_pgc);
            MatchedPGCSoundStructV2.ADAPTER.encodeWithTag(protoWriter, 65, musicStructV2.matched_pgc_sound);
            MatchedSongStructV2.ADAPTER.encodeWithTag(protoWriter, 66, musicStructV2.matched_song);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 67, musicStructV2.is_commerce_music);
            MusicArtistStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 68, musicStructV2.artists);
            protoWriter.writeBytes(musicStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102134);
    }

    public static final class Builder extends Message.Builder<MusicStructV2, Builder> {
        public String album;
        public List<MusicArtistStructV2> artists = Internal.newMutableList();
        public UrlStructV2 audio_track;
        public String author;
        public Boolean author_deleted;
        public List<PositionStructV2> author_position = Internal.newMutableList();
        public UrlStructV2 avatar_large;
        public UrlStructV2 avatar_medium;
        public UrlStructV2 avatar_thumb;
        public Integer billboard_rank;
        public Long binded_challenge_id;
        public ChallengeStructV2 bodydance_challenge;
        public UrlStructV2 bodydance_challenge_id;
        public UrlStructV2 bodydance_url;
        public CategoryCoverStructV2 category_cover_info;
        public ChallengeStructV2 challenge;
        public Integer collect_stat;
        public UrlStructV2 cover_hd;
        public UrlStructV2 cover_large;
        public UrlStructV2 cover_medium;
        public UrlStructV2 cover_thumb;
        public Integer duration;
        public UrlStructV2 effects_data;
        public Integer end_time;
        public List<ExternalSongStructV2> external_song_info = Internal.newMutableList();
        public String extra;
        public Long id;
        public String id_str;
        public Boolean is_author_artist;
        public Boolean is_commerce_music;
        public Boolean is_del_video;
        public Boolean is_only_owner_use;
        public Boolean is_original;
        public Boolean is_pgc;
        public Boolean is_restricted;
        public Boolean is_video_not_recommend;
        public Boolean is_video_self_see;
        public Integer lyric_type;
        public String lyric_url;
        public MatchedPGCSoundStructV2 matched_pgc_sound;
        public MatchedSongStructV2 matched_song;
        public String mid;
        public Integer music_billboard_type;
        public BranchBillboardWeeklyStructV2 music_billboard_weekly_info;
        public Boolean mute_share;
        public String offline_desc;
        public String owner_handle;
        public String owner_id;
        public String owner_nickname;
        public UrlStructV2 play_url;
        public List<PositionStructV2> position = Internal.newMutableList();
        public Boolean prevent_download;
        public Integer prevent_item_download_status;
        public Double preview_end_time;
        public Double preview_start_time;
        public Boolean redirect;
        public String schema_url;
        public String sec_uid;
        public ShareStructV2 share_info;
        public Integer source_platform;
        public Integer start_time;
        public Integer status;
        public UrlStructV2 strong_beat_url;
        public String title;
        public List<String> unshelve_countries = Internal.newMutableList();
        public String use_count_desc;
        public Integer user_count;

        static {
            Covode.recordClassIndex(102135);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MusicStructV2 build() {
            return new MusicStructV2(this.id, this.id_str, this.title, this.author, this.album, this.cover_hd, this.cover_large, this.cover_medium, this.cover_thumb, this.play_url, this.schema_url, this.source_platform, this.start_time, this.end_time, this.duration, this.extra, this.user_count, this.position, this.share_info, this.collect_stat, this.status, this.offline_desc, this.effects_data, this.owner_id, this.owner_nickname, this.use_count_desc, this.audio_track, this.bodydance_url, this.bodydance_challenge, this.is_original, this.challenge, this.billboard_rank, this.mid, this.bodydance_challenge_id, this.binded_challenge_id, this.redirect, this.is_restricted, this.author_deleted, this.is_del_video, this.is_video_self_see, this.owner_handle, this.author_position, this.prevent_download, this.music_billboard_type, this.music_billboard_weekly_info, this.category_cover_info, this.is_only_owner_use, this.is_video_not_recommend, this.strong_beat_url, this.unshelve_countries, this.prevent_item_download_status, this.external_song_info, this.sec_uid, this.lyric_type, this.lyric_url, this.avatar_thumb, this.avatar_medium, this.avatar_large, this.preview_start_time, this.preview_end_time, this.mute_share, this.is_author_artist, this.is_pgc, this.matched_pgc_sound, this.matched_song, this.is_commerce_music, this.artists, super.buildUnknownFields());
        }

        public final Builder album(String str) {
            this.album = str;
            return this;
        }

        public final Builder audio_track(UrlStructV2 urlStructV2) {
            this.audio_track = urlStructV2;
            return this;
        }

        public final Builder author(String str) {
            this.author = str;
            return this;
        }

        public final Builder author_deleted(Boolean bool) {
            this.author_deleted = bool;
            return this;
        }

        public final Builder avatar_large(UrlStructV2 urlStructV2) {
            this.avatar_large = urlStructV2;
            return this;
        }

        public final Builder avatar_medium(UrlStructV2 urlStructV2) {
            this.avatar_medium = urlStructV2;
            return this;
        }

        public final Builder avatar_thumb(UrlStructV2 urlStructV2) {
            this.avatar_thumb = urlStructV2;
            return this;
        }

        public final Builder billboard_rank(Integer num) {
            this.billboard_rank = num;
            return this;
        }

        public final Builder binded_challenge_id(Long l2) {
            this.binded_challenge_id = l2;
            return this;
        }

        public final Builder bodydance_challenge(ChallengeStructV2 challengeStructV2) {
            this.bodydance_challenge = challengeStructV2;
            return this;
        }

        public final Builder bodydance_challenge_id(UrlStructV2 urlStructV2) {
            this.bodydance_challenge_id = urlStructV2;
            return this;
        }

        public final Builder bodydance_url(UrlStructV2 urlStructV2) {
            this.bodydance_url = urlStructV2;
            return this;
        }

        public final Builder category_cover_info(CategoryCoverStructV2 categoryCoverStructV2) {
            this.category_cover_info = categoryCoverStructV2;
            return this;
        }

        public final Builder challenge(ChallengeStructV2 challengeStructV2) {
            this.challenge = challengeStructV2;
            return this;
        }

        public final Builder collect_stat(Integer num) {
            this.collect_stat = num;
            return this;
        }

        public final Builder cover_hd(UrlStructV2 urlStructV2) {
            this.cover_hd = urlStructV2;
            return this;
        }

        public final Builder cover_large(UrlStructV2 urlStructV2) {
            this.cover_large = urlStructV2;
            return this;
        }

        public final Builder cover_medium(UrlStructV2 urlStructV2) {
            this.cover_medium = urlStructV2;
            return this;
        }

        public final Builder cover_thumb(UrlStructV2 urlStructV2) {
            this.cover_thumb = urlStructV2;
            return this;
        }

        public final Builder duration(Integer num) {
            this.duration = num;
            return this;
        }

        public final Builder effects_data(UrlStructV2 urlStructV2) {
            this.effects_data = urlStructV2;
            return this;
        }

        public final Builder end_time(Integer num) {
            this.end_time = num;
            return this;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder id(Long l2) {
            this.id = l2;
            return this;
        }

        public final Builder id_str(String str) {
            this.id_str = str;
            return this;
        }

        public final Builder is_author_artist(Boolean bool) {
            this.is_author_artist = bool;
            return this;
        }

        public final Builder is_commerce_music(Boolean bool) {
            this.is_commerce_music = bool;
            return this;
        }

        public final Builder is_del_video(Boolean bool) {
            this.is_del_video = bool;
            return this;
        }

        public final Builder is_only_owner_use(Boolean bool) {
            this.is_only_owner_use = bool;
            return this;
        }

        public final Builder is_original(Boolean bool) {
            this.is_original = bool;
            return this;
        }

        public final Builder is_pgc(Boolean bool) {
            this.is_pgc = bool;
            return this;
        }

        public final Builder is_restricted(Boolean bool) {
            this.is_restricted = bool;
            return this;
        }

        public final Builder is_video_not_recommend(Boolean bool) {
            this.is_video_not_recommend = bool;
            return this;
        }

        public final Builder is_video_self_see(Boolean bool) {
            this.is_video_self_see = bool;
            return this;
        }

        public final Builder lyric_type(Integer num) {
            this.lyric_type = num;
            return this;
        }

        public final Builder lyric_url(String str) {
            this.lyric_url = str;
            return this;
        }

        public final Builder matched_pgc_sound(MatchedPGCSoundStructV2 matchedPGCSoundStructV2) {
            this.matched_pgc_sound = matchedPGCSoundStructV2;
            return this;
        }

        public final Builder matched_song(MatchedSongStructV2 matchedSongStructV2) {
            this.matched_song = matchedSongStructV2;
            return this;
        }

        public final Builder mid(String str) {
            this.mid = str;
            return this;
        }

        public final Builder music_billboard_type(Integer num) {
            this.music_billboard_type = num;
            return this;
        }

        public final Builder music_billboard_weekly_info(BranchBillboardWeeklyStructV2 branchBillboardWeeklyStructV2) {
            this.music_billboard_weekly_info = branchBillboardWeeklyStructV2;
            return this;
        }

        public final Builder mute_share(Boolean bool) {
            this.mute_share = bool;
            return this;
        }

        public final Builder offline_desc(String str) {
            this.offline_desc = str;
            return this;
        }

        public final Builder owner_handle(String str) {
            this.owner_handle = str;
            return this;
        }

        public final Builder owner_id(String str) {
            this.owner_id = str;
            return this;
        }

        public final Builder owner_nickname(String str) {
            this.owner_nickname = str;
            return this;
        }

        public final Builder play_url(UrlStructV2 urlStructV2) {
            this.play_url = urlStructV2;
            return this;
        }

        public final Builder prevent_download(Boolean bool) {
            this.prevent_download = bool;
            return this;
        }

        public final Builder prevent_item_download_status(Integer num) {
            this.prevent_item_download_status = num;
            return this;
        }

        public final Builder preview_end_time(Double d2) {
            this.preview_end_time = d2;
            return this;
        }

        public final Builder preview_start_time(Double d2) {
            this.preview_start_time = d2;
            return this;
        }

        public final Builder redirect(Boolean bool) {
            this.redirect = bool;
            return this;
        }

        public final Builder schema_url(String str) {
            this.schema_url = str;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder share_info(ShareStructV2 shareStructV2) {
            this.share_info = shareStructV2;
            return this;
        }

        public final Builder source_platform(Integer num) {
            this.source_platform = num;
            return this;
        }

        public final Builder start_time(Integer num) {
            this.start_time = num;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder strong_beat_url(UrlStructV2 urlStructV2) {
            this.strong_beat_url = urlStructV2;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder use_count_desc(String str) {
            this.use_count_desc = str;
            return this;
        }

        public final Builder user_count(Integer num) {
            this.user_count = num;
            return this;
        }

        public final Builder artists(List<MusicArtistStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.artists = list;
            return this;
        }

        public final Builder author_position(List<PositionStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.author_position = list;
            return this;
        }

        public final Builder external_song_info(List<ExternalSongStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.external_song_info = list;
            return this;
        }

        public final Builder position(List<PositionStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.position = list;
            return this;
        }

        public final Builder unshelve_countries(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.unshelve_countries = list;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MusicStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MusicStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.id_str = this.id_str;
        builder.title = this.title;
        builder.author = this.author;
        builder.album = this.album;
        builder.cover_hd = this.cover_hd;
        builder.cover_large = this.cover_large;
        builder.cover_medium = this.cover_medium;
        builder.cover_thumb = this.cover_thumb;
        builder.play_url = this.play_url;
        builder.schema_url = this.schema_url;
        builder.source_platform = this.source_platform;
        builder.start_time = this.start_time;
        builder.end_time = this.end_time;
        builder.duration = this.duration;
        builder.extra = this.extra;
        builder.user_count = this.user_count;
        builder.position = Internal.copyOf("position", this.position);
        builder.share_info = this.share_info;
        builder.collect_stat = this.collect_stat;
        builder.status = this.status;
        builder.offline_desc = this.offline_desc;
        builder.effects_data = this.effects_data;
        builder.owner_id = this.owner_id;
        builder.owner_nickname = this.owner_nickname;
        builder.use_count_desc = this.use_count_desc;
        builder.audio_track = this.audio_track;
        builder.bodydance_url = this.bodydance_url;
        builder.bodydance_challenge = this.bodydance_challenge;
        builder.is_original = this.is_original;
        builder.challenge = this.challenge;
        builder.billboard_rank = this.billboard_rank;
        builder.mid = this.mid;
        builder.bodydance_challenge_id = this.bodydance_challenge_id;
        builder.binded_challenge_id = this.binded_challenge_id;
        builder.redirect = this.redirect;
        builder.is_restricted = this.is_restricted;
        builder.author_deleted = this.author_deleted;
        builder.is_del_video = this.is_del_video;
        builder.is_video_self_see = this.is_video_self_see;
        builder.owner_handle = this.owner_handle;
        builder.author_position = Internal.copyOf("author_position", this.author_position);
        builder.prevent_download = this.prevent_download;
        builder.music_billboard_type = this.music_billboard_type;
        builder.music_billboard_weekly_info = this.music_billboard_weekly_info;
        builder.category_cover_info = this.category_cover_info;
        builder.is_only_owner_use = this.is_only_owner_use;
        builder.is_video_not_recommend = this.is_video_not_recommend;
        builder.strong_beat_url = this.strong_beat_url;
        builder.unshelve_countries = Internal.copyOf("unshelve_countries", this.unshelve_countries);
        builder.prevent_item_download_status = this.prevent_item_download_status;
        builder.external_song_info = Internal.copyOf("external_song_info", this.external_song_info);
        builder.sec_uid = this.sec_uid;
        builder.lyric_type = this.lyric_type;
        builder.lyric_url = this.lyric_url;
        builder.avatar_thumb = this.avatar_thumb;
        builder.avatar_medium = this.avatar_medium;
        builder.avatar_large = this.avatar_large;
        builder.preview_start_time = this.preview_start_time;
        builder.preview_end_time = this.preview_end_time;
        builder.mute_share = this.mute_share;
        builder.is_author_artist = this.is_author_artist;
        builder.is_pgc = this.is_pgc;
        builder.matched_pgc_sound = this.matched_pgc_sound;
        builder.matched_song = this.matched_song;
        builder.is_commerce_music = this.is_commerce_music;
        builder.artists = Internal.copyOf("artists", this.artists);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
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
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i60;
        int i61;
        int i62;
        int i63 = this.hashCode;
        if (i63 != 0) {
            return i63;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l2 = this.id;
        int i64 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i65 = (hashCode + i2) * 37;
        String str = this.id_str;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i66 = (i65 + i3) * 37;
        String str2 = this.title;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i67 = (i66 + i4) * 37;
        String str3 = this.author;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i68 = (i67 + i5) * 37;
        String str4 = this.album;
        if (str4 != null) {
            i6 = str4.hashCode();
        } else {
            i6 = 0;
        }
        int i69 = (i68 + i6) * 37;
        UrlStructV2 urlStructV2 = this.cover_hd;
        if (urlStructV2 != null) {
            i7 = urlStructV2.hashCode();
        } else {
            i7 = 0;
        }
        int i70 = (i69 + i7) * 37;
        UrlStructV2 urlStructV22 = this.cover_large;
        if (urlStructV22 != null) {
            i8 = urlStructV22.hashCode();
        } else {
            i8 = 0;
        }
        int i71 = (i70 + i8) * 37;
        UrlStructV2 urlStructV23 = this.cover_medium;
        if (urlStructV23 != null) {
            i9 = urlStructV23.hashCode();
        } else {
            i9 = 0;
        }
        int i72 = (i71 + i9) * 37;
        UrlStructV2 urlStructV24 = this.cover_thumb;
        if (urlStructV24 != null) {
            i10 = urlStructV24.hashCode();
        } else {
            i10 = 0;
        }
        int i73 = (i72 + i10) * 37;
        UrlStructV2 urlStructV25 = this.play_url;
        if (urlStructV25 != null) {
            i11 = urlStructV25.hashCode();
        } else {
            i11 = 0;
        }
        int i74 = (i73 + i11) * 37;
        String str5 = this.schema_url;
        if (str5 != null) {
            i12 = str5.hashCode();
        } else {
            i12 = 0;
        }
        int i75 = (i74 + i12) * 37;
        Integer num = this.source_platform;
        if (num != null) {
            i13 = num.hashCode();
        } else {
            i13 = 0;
        }
        int i76 = (i75 + i13) * 37;
        Integer num2 = this.start_time;
        if (num2 != null) {
            i14 = num2.hashCode();
        } else {
            i14 = 0;
        }
        int i77 = (i76 + i14) * 37;
        Integer num3 = this.end_time;
        if (num3 != null) {
            i15 = num3.hashCode();
        } else {
            i15 = 0;
        }
        int i78 = (i77 + i15) * 37;
        Integer num4 = this.duration;
        if (num4 != null) {
            i16 = num4.hashCode();
        } else {
            i16 = 0;
        }
        int i79 = (i78 + i16) * 37;
        String str6 = this.extra;
        if (str6 != null) {
            i17 = str6.hashCode();
        } else {
            i17 = 0;
        }
        int i80 = (i79 + i17) * 37;
        Integer num5 = this.user_count;
        if (num5 != null) {
            i18 = num5.hashCode();
        } else {
            i18 = 0;
        }
        int hashCode2 = (((i80 + i18) * 37) + this.position.hashCode()) * 37;
        ShareStructV2 shareStructV2 = this.share_info;
        if (shareStructV2 != null) {
            i19 = shareStructV2.hashCode();
        } else {
            i19 = 0;
        }
        int i81 = (hashCode2 + i19) * 37;
        Integer num6 = this.collect_stat;
        if (num6 != null) {
            i20 = num6.hashCode();
        } else {
            i20 = 0;
        }
        int i82 = (i81 + i20) * 37;
        Integer num7 = this.status;
        if (num7 != null) {
            i21 = num7.hashCode();
        } else {
            i21 = 0;
        }
        int i83 = (i82 + i21) * 37;
        String str7 = this.offline_desc;
        if (str7 != null) {
            i22 = str7.hashCode();
        } else {
            i22 = 0;
        }
        int i84 = (i83 + i22) * 37;
        UrlStructV2 urlStructV26 = this.effects_data;
        if (urlStructV26 != null) {
            i23 = urlStructV26.hashCode();
        } else {
            i23 = 0;
        }
        int i85 = (i84 + i23) * 37;
        String str8 = this.owner_id;
        if (str8 != null) {
            i24 = str8.hashCode();
        } else {
            i24 = 0;
        }
        int i86 = (i85 + i24) * 37;
        String str9 = this.owner_nickname;
        if (str9 != null) {
            i25 = str9.hashCode();
        } else {
            i25 = 0;
        }
        int i87 = (i86 + i25) * 37;
        String str10 = this.use_count_desc;
        if (str10 != null) {
            i26 = str10.hashCode();
        } else {
            i26 = 0;
        }
        int i88 = (i87 + i26) * 37;
        UrlStructV2 urlStructV27 = this.audio_track;
        if (urlStructV27 != null) {
            i27 = urlStructV27.hashCode();
        } else {
            i27 = 0;
        }
        int i89 = (i88 + i27) * 37;
        UrlStructV2 urlStructV28 = this.bodydance_url;
        if (urlStructV28 != null) {
            i28 = urlStructV28.hashCode();
        } else {
            i28 = 0;
        }
        int i90 = (i89 + i28) * 37;
        ChallengeStructV2 challengeStructV2 = this.bodydance_challenge;
        if (challengeStructV2 != null) {
            i29 = challengeStructV2.hashCode();
        } else {
            i29 = 0;
        }
        int i91 = (i90 + i29) * 37;
        Boolean bool = this.is_original;
        if (bool != null) {
            i30 = bool.hashCode();
        } else {
            i30 = 0;
        }
        int i92 = (i91 + i30) * 37;
        ChallengeStructV2 challengeStructV22 = this.challenge;
        if (challengeStructV22 != null) {
            i31 = challengeStructV22.hashCode();
        } else {
            i31 = 0;
        }
        int i93 = (i92 + i31) * 37;
        Integer num8 = this.billboard_rank;
        if (num8 != null) {
            i32 = num8.hashCode();
        } else {
            i32 = 0;
        }
        int i94 = (i93 + i32) * 37;
        String str11 = this.mid;
        if (str11 != null) {
            i33 = str11.hashCode();
        } else {
            i33 = 0;
        }
        int i95 = (i94 + i33) * 37;
        UrlStructV2 urlStructV29 = this.bodydance_challenge_id;
        if (urlStructV29 != null) {
            i34 = urlStructV29.hashCode();
        } else {
            i34 = 0;
        }
        int i96 = (i95 + i34) * 37;
        Long l3 = this.binded_challenge_id;
        if (l3 != null) {
            i35 = l3.hashCode();
        } else {
            i35 = 0;
        }
        int i97 = (i96 + i35) * 37;
        Boolean bool2 = this.redirect;
        if (bool2 != null) {
            i36 = bool2.hashCode();
        } else {
            i36 = 0;
        }
        int i98 = (i97 + i36) * 37;
        Boolean bool3 = this.is_restricted;
        if (bool3 != null) {
            i37 = bool3.hashCode();
        } else {
            i37 = 0;
        }
        int i99 = (i98 + i37) * 37;
        Boolean bool4 = this.author_deleted;
        if (bool4 != null) {
            i38 = bool4.hashCode();
        } else {
            i38 = 0;
        }
        int i100 = (i99 + i38) * 37;
        Boolean bool5 = this.is_del_video;
        if (bool5 != null) {
            i39 = bool5.hashCode();
        } else {
            i39 = 0;
        }
        int i101 = (i100 + i39) * 37;
        Boolean bool6 = this.is_video_self_see;
        if (bool6 != null) {
            i40 = bool6.hashCode();
        } else {
            i40 = 0;
        }
        int i102 = (i101 + i40) * 37;
        String str12 = this.owner_handle;
        if (str12 != null) {
            i41 = str12.hashCode();
        } else {
            i41 = 0;
        }
        int hashCode3 = (((i102 + i41) * 37) + this.author_position.hashCode()) * 37;
        Boolean bool7 = this.prevent_download;
        if (bool7 != null) {
            i42 = bool7.hashCode();
        } else {
            i42 = 0;
        }
        int i103 = (hashCode3 + i42) * 37;
        Integer num9 = this.music_billboard_type;
        if (num9 != null) {
            i43 = num9.hashCode();
        } else {
            i43 = 0;
        }
        int i104 = (i103 + i43) * 37;
        BranchBillboardWeeklyStructV2 branchBillboardWeeklyStructV2 = this.music_billboard_weekly_info;
        if (branchBillboardWeeklyStructV2 != null) {
            i44 = branchBillboardWeeklyStructV2.hashCode();
        } else {
            i44 = 0;
        }
        int i105 = (i104 + i44) * 37;
        CategoryCoverStructV2 categoryCoverStructV2 = this.category_cover_info;
        if (categoryCoverStructV2 != null) {
            i45 = categoryCoverStructV2.hashCode();
        } else {
            i45 = 0;
        }
        int i106 = (i105 + i45) * 37;
        Boolean bool8 = this.is_only_owner_use;
        if (bool8 != null) {
            i46 = bool8.hashCode();
        } else {
            i46 = 0;
        }
        int i107 = (i106 + i46) * 37;
        Boolean bool9 = this.is_video_not_recommend;
        if (bool9 != null) {
            i47 = bool9.hashCode();
        } else {
            i47 = 0;
        }
        int i108 = (i107 + i47) * 37;
        UrlStructV2 urlStructV210 = this.strong_beat_url;
        if (urlStructV210 != null) {
            i48 = urlStructV210.hashCode();
        } else {
            i48 = 0;
        }
        int hashCode4 = (((i108 + i48) * 37) + this.unshelve_countries.hashCode()) * 37;
        Integer num10 = this.prevent_item_download_status;
        if (num10 != null) {
            i49 = num10.hashCode();
        } else {
            i49 = 0;
        }
        int hashCode5 = (((hashCode4 + i49) * 37) + this.external_song_info.hashCode()) * 37;
        String str13 = this.sec_uid;
        if (str13 != null) {
            i50 = str13.hashCode();
        } else {
            i50 = 0;
        }
        int i109 = (hashCode5 + i50) * 37;
        Integer num11 = this.lyric_type;
        if (num11 != null) {
            i51 = num11.hashCode();
        } else {
            i51 = 0;
        }
        int i110 = (i109 + i51) * 37;
        String str14 = this.lyric_url;
        if (str14 != null) {
            i52 = str14.hashCode();
        } else {
            i52 = 0;
        }
        int i111 = (i110 + i52) * 37;
        UrlStructV2 urlStructV211 = this.avatar_thumb;
        if (urlStructV211 != null) {
            i53 = urlStructV211.hashCode();
        } else {
            i53 = 0;
        }
        int i112 = (i111 + i53) * 37;
        UrlStructV2 urlStructV212 = this.avatar_medium;
        if (urlStructV212 != null) {
            i54 = urlStructV212.hashCode();
        } else {
            i54 = 0;
        }
        int i113 = (i112 + i54) * 37;
        UrlStructV2 urlStructV213 = this.avatar_large;
        if (urlStructV213 != null) {
            i55 = urlStructV213.hashCode();
        } else {
            i55 = 0;
        }
        int i114 = (i113 + i55) * 37;
        Double d2 = this.preview_start_time;
        if (d2 != null) {
            i56 = d2.hashCode();
        } else {
            i56 = 0;
        }
        int i115 = (i114 + i56) * 37;
        Double d3 = this.preview_end_time;
        if (d3 != null) {
            i57 = d3.hashCode();
        } else {
            i57 = 0;
        }
        int i116 = (i115 + i57) * 37;
        Boolean bool10 = this.mute_share;
        if (bool10 != null) {
            i58 = bool10.hashCode();
        } else {
            i58 = 0;
        }
        int i117 = (i116 + i58) * 37;
        Boolean bool11 = this.is_author_artist;
        if (bool11 != null) {
            i59 = bool11.hashCode();
        } else {
            i59 = 0;
        }
        int i118 = (i117 + i59) * 37;
        Boolean bool12 = this.is_pgc;
        if (bool12 != null) {
            i60 = bool12.hashCode();
        } else {
            i60 = 0;
        }
        int i119 = (i118 + i60) * 37;
        MatchedPGCSoundStructV2 matchedPGCSoundStructV2 = this.matched_pgc_sound;
        if (matchedPGCSoundStructV2 != null) {
            i61 = matchedPGCSoundStructV2.hashCode();
        } else {
            i61 = 0;
        }
        int i120 = (i119 + i61) * 37;
        MatchedSongStructV2 matchedSongStructV2 = this.matched_song;
        if (matchedSongStructV2 != null) {
            i62 = matchedSongStructV2.hashCode();
        } else {
            i62 = 0;
        }
        int i121 = (i120 + i62) * 37;
        Boolean bool13 = this.is_commerce_music;
        if (bool13 != null) {
            i64 = bool13.hashCode();
        }
        int hashCode6 = ((i121 + i64) * 37) + this.artists.hashCode();
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=").append(this.id);
        }
        if (this.id_str != null) {
            sb.append(", id_str=").append(this.id_str);
        }
        if (this.title != null) {
            sb.append(", title=").append(this.title);
        }
        if (this.author != null) {
            sb.append(", author=").append(this.author);
        }
        if (this.album != null) {
            sb.append(", album=").append(this.album);
        }
        if (this.cover_hd != null) {
            sb.append(", cover_hd=").append(this.cover_hd);
        }
        if (this.cover_large != null) {
            sb.append(", cover_large=").append(this.cover_large);
        }
        if (this.cover_medium != null) {
            sb.append(", cover_medium=").append(this.cover_medium);
        }
        if (this.cover_thumb != null) {
            sb.append(", cover_thumb=").append(this.cover_thumb);
        }
        if (this.play_url != null) {
            sb.append(", play_url=").append(this.play_url);
        }
        if (this.schema_url != null) {
            sb.append(", schema_url=").append(this.schema_url);
        }
        if (this.source_platform != null) {
            sb.append(", source_platform=").append(this.source_platform);
        }
        if (this.start_time != null) {
            sb.append(", start_time=").append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=").append(this.end_time);
        }
        if (this.duration != null) {
            sb.append(", duration=").append(this.duration);
        }
        if (this.extra != null) {
            sb.append(", extra=").append(this.extra);
        }
        if (this.user_count != null) {
            sb.append(", user_count=").append(this.user_count);
        }
        if (!this.position.isEmpty()) {
            sb.append(", position=").append(this.position);
        }
        if (this.share_info != null) {
            sb.append(", share_info=").append(this.share_info);
        }
        if (this.collect_stat != null) {
            sb.append(", collect_stat=").append(this.collect_stat);
        }
        if (this.status != null) {
            sb.append(", status=").append(this.status);
        }
        if (this.offline_desc != null) {
            sb.append(", offline_desc=").append(this.offline_desc);
        }
        if (this.effects_data != null) {
            sb.append(", effects_data=").append(this.effects_data);
        }
        if (this.owner_id != null) {
            sb.append(", owner_id=").append(this.owner_id);
        }
        if (this.owner_nickname != null) {
            sb.append(", owner_nickname=").append(this.owner_nickname);
        }
        if (this.use_count_desc != null) {
            sb.append(", use_count_desc=").append(this.use_count_desc);
        }
        if (this.audio_track != null) {
            sb.append(", audio_track=").append(this.audio_track);
        }
        if (this.bodydance_url != null) {
            sb.append(", bodydance_url=").append(this.bodydance_url);
        }
        if (this.bodydance_challenge != null) {
            sb.append(", bodydance_challenge=").append(this.bodydance_challenge);
        }
        if (this.is_original != null) {
            sb.append(", is_original=").append(this.is_original);
        }
        if (this.challenge != null) {
            sb.append(", challenge=").append(this.challenge);
        }
        if (this.billboard_rank != null) {
            sb.append(", billboard_rank=").append(this.billboard_rank);
        }
        if (this.mid != null) {
            sb.append(", mid=").append(this.mid);
        }
        if (this.bodydance_challenge_id != null) {
            sb.append(", bodydance_challenge_id=").append(this.bodydance_challenge_id);
        }
        if (this.binded_challenge_id != null) {
            sb.append(", binded_challenge_id=").append(this.binded_challenge_id);
        }
        if (this.redirect != null) {
            sb.append(", redirect=").append(this.redirect);
        }
        if (this.is_restricted != null) {
            sb.append(", is_restricted=").append(this.is_restricted);
        }
        if (this.author_deleted != null) {
            sb.append(", author_deleted=").append(this.author_deleted);
        }
        if (this.is_del_video != null) {
            sb.append(", is_del_video=").append(this.is_del_video);
        }
        if (this.is_video_self_see != null) {
            sb.append(", is_video_self_see=").append(this.is_video_self_see);
        }
        if (this.owner_handle != null) {
            sb.append(", owner_handle=").append(this.owner_handle);
        }
        if (!this.author_position.isEmpty()) {
            sb.append(", author_position=").append(this.author_position);
        }
        if (this.prevent_download != null) {
            sb.append(", prevent_download=").append(this.prevent_download);
        }
        if (this.music_billboard_type != null) {
            sb.append(", music_billboard_type=").append(this.music_billboard_type);
        }
        if (this.music_billboard_weekly_info != null) {
            sb.append(", music_billboard_weekly_info=").append(this.music_billboard_weekly_info);
        }
        if (this.category_cover_info != null) {
            sb.append(", category_cover_info=").append(this.category_cover_info);
        }
        if (this.is_only_owner_use != null) {
            sb.append(", is_only_owner_use=").append(this.is_only_owner_use);
        }
        if (this.is_video_not_recommend != null) {
            sb.append(", is_video_not_recommend=").append(this.is_video_not_recommend);
        }
        if (this.strong_beat_url != null) {
            sb.append(", strong_beat_url=").append(this.strong_beat_url);
        }
        if (!this.unshelve_countries.isEmpty()) {
            sb.append(", unshelve_countries=").append(this.unshelve_countries);
        }
        if (this.prevent_item_download_status != null) {
            sb.append(", prevent_item_download_status=").append(this.prevent_item_download_status);
        }
        if (!this.external_song_info.isEmpty()) {
            sb.append(", external_song_info=").append(this.external_song_info);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=").append(this.sec_uid);
        }
        if (this.lyric_type != null) {
            sb.append(", lyric_type=").append(this.lyric_type);
        }
        if (this.lyric_url != null) {
            sb.append(", lyric_url=").append(this.lyric_url);
        }
        if (this.avatar_thumb != null) {
            sb.append(", avatar_thumb=").append(this.avatar_thumb);
        }
        if (this.avatar_medium != null) {
            sb.append(", avatar_medium=").append(this.avatar_medium);
        }
        if (this.avatar_large != null) {
            sb.append(", avatar_large=").append(this.avatar_large);
        }
        if (this.preview_start_time != null) {
            sb.append(", preview_start_time=").append(this.preview_start_time);
        }
        if (this.preview_end_time != null) {
            sb.append(", preview_end_time=").append(this.preview_end_time);
        }
        if (this.mute_share != null) {
            sb.append(", mute_share=").append(this.mute_share);
        }
        if (this.is_author_artist != null) {
            sb.append(", is_author_artist=").append(this.is_author_artist);
        }
        if (this.is_pgc != null) {
            sb.append(", is_pgc=").append(this.is_pgc);
        }
        if (this.matched_pgc_sound != null) {
            sb.append(", matched_pgc_sound=").append(this.matched_pgc_sound);
        }
        if (this.matched_song != null) {
            sb.append(", matched_song=").append(this.matched_song);
        }
        if (this.is_commerce_music != null) {
            sb.append(", is_commerce_music=").append(this.is_commerce_music);
        }
        if (!this.artists.isEmpty()) {
            sb.append(", artists=").append(this.artists);
        }
        return sb.replace(0, 2, "MusicStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MusicStructV2)) {
            return false;
        }
        MusicStructV2 musicStructV2 = (MusicStructV2) obj;
        if (!unknownFields().equals(musicStructV2.unknownFields()) || !Internal.equals(this.id, musicStructV2.id) || !Internal.equals(this.id_str, musicStructV2.id_str) || !Internal.equals(this.title, musicStructV2.title) || !Internal.equals(this.author, musicStructV2.author) || !Internal.equals(this.album, musicStructV2.album) || !Internal.equals(this.cover_hd, musicStructV2.cover_hd) || !Internal.equals(this.cover_large, musicStructV2.cover_large) || !Internal.equals(this.cover_medium, musicStructV2.cover_medium) || !Internal.equals(this.cover_thumb, musicStructV2.cover_thumb) || !Internal.equals(this.play_url, musicStructV2.play_url) || !Internal.equals(this.schema_url, musicStructV2.schema_url) || !Internal.equals(this.source_platform, musicStructV2.source_platform) || !Internal.equals(this.start_time, musicStructV2.start_time) || !Internal.equals(this.end_time, musicStructV2.end_time) || !Internal.equals(this.duration, musicStructV2.duration) || !Internal.equals(this.extra, musicStructV2.extra) || !Internal.equals(this.user_count, musicStructV2.user_count) || !this.position.equals(musicStructV2.position) || !Internal.equals(this.share_info, musicStructV2.share_info) || !Internal.equals(this.collect_stat, musicStructV2.collect_stat) || !Internal.equals(this.status, musicStructV2.status) || !Internal.equals(this.offline_desc, musicStructV2.offline_desc) || !Internal.equals(this.effects_data, musicStructV2.effects_data) || !Internal.equals(this.owner_id, musicStructV2.owner_id) || !Internal.equals(this.owner_nickname, musicStructV2.owner_nickname) || !Internal.equals(this.use_count_desc, musicStructV2.use_count_desc) || !Internal.equals(this.audio_track, musicStructV2.audio_track) || !Internal.equals(this.bodydance_url, musicStructV2.bodydance_url) || !Internal.equals(this.bodydance_challenge, musicStructV2.bodydance_challenge) || !Internal.equals(this.is_original, musicStructV2.is_original) || !Internal.equals(this.challenge, musicStructV2.challenge) || !Internal.equals(this.billboard_rank, musicStructV2.billboard_rank) || !Internal.equals(this.mid, musicStructV2.mid) || !Internal.equals(this.bodydance_challenge_id, musicStructV2.bodydance_challenge_id) || !Internal.equals(this.binded_challenge_id, musicStructV2.binded_challenge_id) || !Internal.equals(this.redirect, musicStructV2.redirect) || !Internal.equals(this.is_restricted, musicStructV2.is_restricted) || !Internal.equals(this.author_deleted, musicStructV2.author_deleted) || !Internal.equals(this.is_del_video, musicStructV2.is_del_video) || !Internal.equals(this.is_video_self_see, musicStructV2.is_video_self_see) || !Internal.equals(this.owner_handle, musicStructV2.owner_handle) || !this.author_position.equals(musicStructV2.author_position) || !Internal.equals(this.prevent_download, musicStructV2.prevent_download) || !Internal.equals(this.music_billboard_type, musicStructV2.music_billboard_type) || !Internal.equals(this.music_billboard_weekly_info, musicStructV2.music_billboard_weekly_info) || !Internal.equals(this.category_cover_info, musicStructV2.category_cover_info) || !Internal.equals(this.is_only_owner_use, musicStructV2.is_only_owner_use) || !Internal.equals(this.is_video_not_recommend, musicStructV2.is_video_not_recommend) || !Internal.equals(this.strong_beat_url, musicStructV2.strong_beat_url) || !this.unshelve_countries.equals(musicStructV2.unshelve_countries) || !Internal.equals(this.prevent_item_download_status, musicStructV2.prevent_item_download_status) || !this.external_song_info.equals(musicStructV2.external_song_info) || !Internal.equals(this.sec_uid, musicStructV2.sec_uid) || !Internal.equals(this.lyric_type, musicStructV2.lyric_type) || !Internal.equals(this.lyric_url, musicStructV2.lyric_url) || !Internal.equals(this.avatar_thumb, musicStructV2.avatar_thumb) || !Internal.equals(this.avatar_medium, musicStructV2.avatar_medium) || !Internal.equals(this.avatar_large, musicStructV2.avatar_large) || !Internal.equals(this.preview_start_time, musicStructV2.preview_start_time) || !Internal.equals(this.preview_end_time, musicStructV2.preview_end_time) || !Internal.equals(this.mute_share, musicStructV2.mute_share) || !Internal.equals(this.is_author_artist, musicStructV2.is_author_artist) || !Internal.equals(this.is_pgc, musicStructV2.is_pgc) || !Internal.equals(this.matched_pgc_sound, musicStructV2.matched_pgc_sound) || !Internal.equals(this.matched_song, musicStructV2.matched_song) || !Internal.equals(this.is_commerce_music, musicStructV2.is_commerce_music) || !this.artists.equals(musicStructV2.artists)) {
            return false;
        }
        return true;
    }
}
