package com.ss.ugc.aweme.proto;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
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

public final class ChallengeStructV2 extends Message<ChallengeStructV2, Builder> {
    public static final ProtoAdapter<ChallengeStructV2> ADAPTER = new ProtoAdapter_ChallengeStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 22)
    public Boolean allow_upload_cover;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AnnouncementStructV2#ADAPTER", tag = 29)
    public AnnouncementStructV2 announcement_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UserStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public UserStructV2 author;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public UrlStructV2 background_image_url;
    @WireField(adapter = "com.ss.ugc.aweme.proto.IconButtonStructV2#ADAPTER", tag = 34)
    public IconButtonStructV2 button;
    @WireField(adapter = "com.ss.ugc.aweme.proto.CategoryCoverStructV2#ADAPTER", tag = 24)
    public CategoryCoverStructV2 category_cover_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 33)
    public List<String> cha_attrs;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String cha_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String cid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 17)
    public Integer collect_stat;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MusicStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public List<MusicStructV2> connect_music;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = LiveRechargeAgeThresholdSetting.DEFAULT)
    public UrlStructV2 cover_item;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 26)
    public String cover_photo;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String desc;
    @WireField(adapter = "com.ss.ugc.aweme.proto.DisclaimerStructV2#ADAPTER", tag = 21)
    public DisclaimerStructV2 disclaimer;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 25)
    public String hashtag_profile;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 19)
    public Integer is_challenge;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 23)
    public Boolean is_commerce;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 27)
    public Integer is_hot_search;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 16)
    public Boolean is_pgcshow;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public String link_action;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_SELECT_SCENE)
    public String link_text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 28)
    public Integer link_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 31)
    public Integer module_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 32)
    public String profile_tag;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String schema;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ShareStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public ShareStructV2 share_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MAX_BITRATE)
    public String sticker_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public Integer sub_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public Integer type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Integer user_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = v.U)
    public Long view_count;

    public ChallengeStructV2() {
    }

    static final class ProtoAdapter_ChallengeStructV2 extends ProtoAdapter<ChallengeStructV2> {
        static {
            Covode.recordClassIndex(101956);
        }

        public ProtoAdapter_ChallengeStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ChallengeStructV2.class);
        }

        public final int encodedSize(ChallengeStructV2 challengeStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, challengeStructV2.cid) + ProtoAdapter.STRING.encodedSizeWithTag(2, challengeStructV2.cha_name) + ProtoAdapter.STRING.encodedSizeWithTag(3, challengeStructV2.desc) + ProtoAdapter.STRING.encodedSizeWithTag(4, challengeStructV2.schema) + UserStructV2.ADAPTER.encodedSizeWithTag(5, challengeStructV2.author) + ProtoAdapter.INT32.encodedSizeWithTag(6, challengeStructV2.user_count) + ShareStructV2.ADAPTER.encodedSizeWithTag(7, challengeStructV2.share_info) + MusicStructV2.ADAPTER.asRepeated().encodedSizeWithTag(8, challengeStructV2.connect_music) + ProtoAdapter.INT32.encodedSizeWithTag(9, challengeStructV2.type) + ProtoAdapter.INT32.encodedSizeWithTag(11, challengeStructV2.sub_type) + UrlStructV2.ADAPTER.encodedSizeWithTag(12, challengeStructV2.background_image_url) + ProtoAdapter.STRING.encodedSizeWithTag(13, challengeStructV2.sticker_id) + ProtoAdapter.STRING.encodedSizeWithTag(14, challengeStructV2.link_text) + ProtoAdapter.STRING.encodedSizeWithTag(15, challengeStructV2.link_action) + ProtoAdapter.BOOL.encodedSizeWithTag(16, challengeStructV2.is_pgcshow) + ProtoAdapter.INT32.encodedSizeWithTag(17, challengeStructV2.collect_stat) + UrlStructV2.ADAPTER.encodedSizeWithTag(18, challengeStructV2.cover_item) + ProtoAdapter.INT32.encodedSizeWithTag(19, challengeStructV2.is_challenge) + ProtoAdapter.INT64.encodedSizeWithTag(20, challengeStructV2.view_count) + DisclaimerStructV2.ADAPTER.encodedSizeWithTag(21, challengeStructV2.disclaimer) + ProtoAdapter.BOOL.encodedSizeWithTag(22, challengeStructV2.allow_upload_cover) + ProtoAdapter.BOOL.encodedSizeWithTag(23, challengeStructV2.is_commerce) + CategoryCoverStructV2.ADAPTER.encodedSizeWithTag(24, challengeStructV2.category_cover_info) + ProtoAdapter.STRING.encodedSizeWithTag(25, challengeStructV2.hashtag_profile) + ProtoAdapter.STRING.encodedSizeWithTag(26, challengeStructV2.cover_photo) + ProtoAdapter.INT32.encodedSizeWithTag(27, challengeStructV2.is_hot_search) + ProtoAdapter.INT32.encodedSizeWithTag(28, challengeStructV2.link_type) + AnnouncementStructV2.ADAPTER.encodedSizeWithTag(29, challengeStructV2.announcement_info) + ProtoAdapter.INT32.encodedSizeWithTag(31, challengeStructV2.module_type) + ProtoAdapter.STRING.encodedSizeWithTag(32, challengeStructV2.profile_tag) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(33, challengeStructV2.cha_attrs) + IconButtonStructV2.ADAPTER.encodedSizeWithTag(34, challengeStructV2.button) + challengeStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ChallengeStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.cid(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.cha_name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.desc(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.schema(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.author(UserStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.user_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.share_info(ShareStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.connect_music.add(MusicStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        case 30:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.sub_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.background_image_url(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            builder.sticker_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            builder.link_text(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            builder.link_action(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 16:
                            builder.is_pgcshow(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 17:
                            builder.collect_stat(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            builder.cover_item(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            builder.is_challenge(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case v.U:
                            builder.view_count(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 21:
                            builder.disclaimer(DisclaimerStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 22:
                            builder.allow_upload_cover(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 23:
                            builder.is_commerce(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 24:
                            builder.category_cover_info(CategoryCoverStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 25:
                            builder.hashtag_profile(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 26:
                            builder.cover_photo(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 27:
                            builder.is_hot_search(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 28:
                            builder.link_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 29:
                            builder.announcement_info(AnnouncementStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 31:
                            builder.module_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 32:
                            builder.profile_tag(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 33:
                            builder.cha_attrs.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 34:
                            builder.button(IconButtonStructV2.ADAPTER.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ChallengeStructV2 challengeStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, challengeStructV2.cid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, challengeStructV2.cha_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, challengeStructV2.desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, challengeStructV2.schema);
            UserStructV2.ADAPTER.encodeWithTag(protoWriter, 5, challengeStructV2.author);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, challengeStructV2.user_count);
            ShareStructV2.ADAPTER.encodeWithTag(protoWriter, 7, challengeStructV2.share_info);
            MusicStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, challengeStructV2.connect_music);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, challengeStructV2.type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, challengeStructV2.sub_type);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 12, challengeStructV2.background_image_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, challengeStructV2.sticker_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, challengeStructV2.link_text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, challengeStructV2.link_action);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, challengeStructV2.is_pgcshow);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, challengeStructV2.collect_stat);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 18, challengeStructV2.cover_item);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 19, challengeStructV2.is_challenge);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 20, challengeStructV2.view_count);
            DisclaimerStructV2.ADAPTER.encodeWithTag(protoWriter, 21, challengeStructV2.disclaimer);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 22, challengeStructV2.allow_upload_cover);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, challengeStructV2.is_commerce);
            CategoryCoverStructV2.ADAPTER.encodeWithTag(protoWriter, 24, challengeStructV2.category_cover_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 25, challengeStructV2.hashtag_profile);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 26, challengeStructV2.cover_photo);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 27, challengeStructV2.is_hot_search);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 28, challengeStructV2.link_type);
            AnnouncementStructV2.ADAPTER.encodeWithTag(protoWriter, 29, challengeStructV2.announcement_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 31, challengeStructV2.module_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 32, challengeStructV2.profile_tag);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 33, challengeStructV2.cha_attrs);
            IconButtonStructV2.ADAPTER.encodeWithTag(protoWriter, 34, challengeStructV2.button);
            protoWriter.writeBytes(challengeStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101954);
    }

    public static final class Builder extends Message.Builder<ChallengeStructV2, Builder> {
        public Boolean allow_upload_cover;
        public AnnouncementStructV2 announcement_info;
        public UserStructV2 author;
        public UrlStructV2 background_image_url;
        public IconButtonStructV2 button;
        public CategoryCoverStructV2 category_cover_info;
        public List<String> cha_attrs = Internal.newMutableList();
        public String cha_name;
        public String cid;
        public Integer collect_stat;
        public List<MusicStructV2> connect_music = Internal.newMutableList();
        public UrlStructV2 cover_item;
        public String cover_photo;
        public String desc;
        public DisclaimerStructV2 disclaimer;
        public String hashtag_profile;
        public Integer is_challenge;
        public Boolean is_commerce;
        public Integer is_hot_search;
        public Boolean is_pgcshow;
        public String link_action;
        public String link_text;
        public Integer link_type;
        public Integer module_type;
        public String profile_tag;
        public String schema;
        public ShareStructV2 share_info;
        public String sticker_id;
        public Integer sub_type;
        public Integer type;
        public Integer user_count;
        public Long view_count;

        static {
            Covode.recordClassIndex(101955);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ChallengeStructV2 build() {
            return new ChallengeStructV2(this.cid, this.cha_name, this.desc, this.schema, this.author, this.user_count, this.share_info, this.connect_music, this.type, this.sub_type, this.background_image_url, this.sticker_id, this.link_text, this.link_action, this.is_pgcshow, this.collect_stat, this.cover_item, this.is_challenge, this.view_count, this.disclaimer, this.allow_upload_cover, this.is_commerce, this.category_cover_info, this.hashtag_profile, this.cover_photo, this.is_hot_search, this.link_type, this.announcement_info, this.module_type, this.profile_tag, this.cha_attrs, this.button, super.buildUnknownFields());
        }

        public final Builder allow_upload_cover(Boolean bool) {
            this.allow_upload_cover = bool;
            return this;
        }

        public final Builder announcement_info(AnnouncementStructV2 announcementStructV2) {
            this.announcement_info = announcementStructV2;
            return this;
        }

        public final Builder author(UserStructV2 userStructV2) {
            this.author = userStructV2;
            return this;
        }

        public final Builder background_image_url(UrlStructV2 urlStructV2) {
            this.background_image_url = urlStructV2;
            return this;
        }

        public final Builder button(IconButtonStructV2 iconButtonStructV2) {
            this.button = iconButtonStructV2;
            return this;
        }

        public final Builder category_cover_info(CategoryCoverStructV2 categoryCoverStructV2) {
            this.category_cover_info = categoryCoverStructV2;
            return this;
        }

        public final Builder cha_name(String str) {
            this.cha_name = str;
            return this;
        }

        public final Builder cid(String str) {
            this.cid = str;
            return this;
        }

        public final Builder collect_stat(Integer num) {
            this.collect_stat = num;
            return this;
        }

        public final Builder cover_item(UrlStructV2 urlStructV2) {
            this.cover_item = urlStructV2;
            return this;
        }

        public final Builder cover_photo(String str) {
            this.cover_photo = str;
            return this;
        }

        public final Builder desc(String str) {
            this.desc = str;
            return this;
        }

        public final Builder disclaimer(DisclaimerStructV2 disclaimerStructV2) {
            this.disclaimer = disclaimerStructV2;
            return this;
        }

        public final Builder hashtag_profile(String str) {
            this.hashtag_profile = str;
            return this;
        }

        public final Builder is_challenge(Integer num) {
            this.is_challenge = num;
            return this;
        }

        public final Builder is_commerce(Boolean bool) {
            this.is_commerce = bool;
            return this;
        }

        public final Builder is_hot_search(Integer num) {
            this.is_hot_search = num;
            return this;
        }

        public final Builder is_pgcshow(Boolean bool) {
            this.is_pgcshow = bool;
            return this;
        }

        public final Builder link_action(String str) {
            this.link_action = str;
            return this;
        }

        public final Builder link_text(String str) {
            this.link_text = str;
            return this;
        }

        public final Builder link_type(Integer num) {
            this.link_type = num;
            return this;
        }

        public final Builder module_type(Integer num) {
            this.module_type = num;
            return this;
        }

        public final Builder profile_tag(String str) {
            this.profile_tag = str;
            return this;
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }

        public final Builder share_info(ShareStructV2 shareStructV2) {
            this.share_info = shareStructV2;
            return this;
        }

        public final Builder sticker_id(String str) {
            this.sticker_id = str;
            return this;
        }

        public final Builder sub_type(Integer num) {
            this.sub_type = num;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder user_count(Integer num) {
            this.user_count = num;
            return this;
        }

        public final Builder view_count(Long l2) {
            this.view_count = l2;
            return this;
        }

        public final Builder cha_attrs(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.cha_attrs = list;
            return this;
        }

        public final Builder connect_music(List<MusicStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.connect_music = list;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.ChallengeStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ChallengeStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.cid = this.cid;
        builder.cha_name = this.cha_name;
        builder.desc = this.desc;
        builder.schema = this.schema;
        builder.author = this.author;
        builder.user_count = this.user_count;
        builder.share_info = this.share_info;
        builder.connect_music = Internal.copyOf("connect_music", this.connect_music);
        builder.type = this.type;
        builder.sub_type = this.sub_type;
        builder.background_image_url = this.background_image_url;
        builder.sticker_id = this.sticker_id;
        builder.link_text = this.link_text;
        builder.link_action = this.link_action;
        builder.is_pgcshow = this.is_pgcshow;
        builder.collect_stat = this.collect_stat;
        builder.cover_item = this.cover_item;
        builder.is_challenge = this.is_challenge;
        builder.view_count = this.view_count;
        builder.disclaimer = this.disclaimer;
        builder.allow_upload_cover = this.allow_upload_cover;
        builder.is_commerce = this.is_commerce;
        builder.category_cover_info = this.category_cover_info;
        builder.hashtag_profile = this.hashtag_profile;
        builder.cover_photo = this.cover_photo;
        builder.is_hot_search = this.is_hot_search;
        builder.link_type = this.link_type;
        builder.announcement_info = this.announcement_info;
        builder.module_type = this.module_type;
        builder.profile_tag = this.profile_tag;
        builder.cha_attrs = Internal.copyOf("cha_attrs", this.cha_attrs);
        builder.button = this.button;
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
        int i31 = this.hashCode;
        if (i31 != 0) {
            return i31;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.cid;
        int i32 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i33 = (hashCode + i2) * 37;
        String str2 = this.cha_name;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i34 = (i33 + i3) * 37;
        String str3 = this.desc;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i35 = (i34 + i4) * 37;
        String str4 = this.schema;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i36 = (i35 + i5) * 37;
        UserStructV2 userStructV2 = this.author;
        if (userStructV2 != null) {
            i6 = userStructV2.hashCode();
        } else {
            i6 = 0;
        }
        int i37 = (i36 + i6) * 37;
        Integer num = this.user_count;
        if (num != null) {
            i7 = num.hashCode();
        } else {
            i7 = 0;
        }
        int i38 = (i37 + i7) * 37;
        ShareStructV2 shareStructV2 = this.share_info;
        if (shareStructV2 != null) {
            i8 = shareStructV2.hashCode();
        } else {
            i8 = 0;
        }
        int hashCode2 = (((i38 + i8) * 37) + this.connect_music.hashCode()) * 37;
        Integer num2 = this.type;
        if (num2 != null) {
            i9 = num2.hashCode();
        } else {
            i9 = 0;
        }
        int i39 = (hashCode2 + i9) * 37;
        Integer num3 = this.sub_type;
        if (num3 != null) {
            i10 = num3.hashCode();
        } else {
            i10 = 0;
        }
        int i40 = (i39 + i10) * 37;
        UrlStructV2 urlStructV2 = this.background_image_url;
        if (urlStructV2 != null) {
            i11 = urlStructV2.hashCode();
        } else {
            i11 = 0;
        }
        int i41 = (i40 + i11) * 37;
        String str5 = this.sticker_id;
        if (str5 != null) {
            i12 = str5.hashCode();
        } else {
            i12 = 0;
        }
        int i42 = (i41 + i12) * 37;
        String str6 = this.link_text;
        if (str6 != null) {
            i13 = str6.hashCode();
        } else {
            i13 = 0;
        }
        int i43 = (i42 + i13) * 37;
        String str7 = this.link_action;
        if (str7 != null) {
            i14 = str7.hashCode();
        } else {
            i14 = 0;
        }
        int i44 = (i43 + i14) * 37;
        Boolean bool = this.is_pgcshow;
        if (bool != null) {
            i15 = bool.hashCode();
        } else {
            i15 = 0;
        }
        int i45 = (i44 + i15) * 37;
        Integer num4 = this.collect_stat;
        if (num4 != null) {
            i16 = num4.hashCode();
        } else {
            i16 = 0;
        }
        int i46 = (i45 + i16) * 37;
        UrlStructV2 urlStructV22 = this.cover_item;
        if (urlStructV22 != null) {
            i17 = urlStructV22.hashCode();
        } else {
            i17 = 0;
        }
        int i47 = (i46 + i17) * 37;
        Integer num5 = this.is_challenge;
        if (num5 != null) {
            i18 = num5.hashCode();
        } else {
            i18 = 0;
        }
        int i48 = (i47 + i18) * 37;
        Long l2 = this.view_count;
        if (l2 != null) {
            i19 = l2.hashCode();
        } else {
            i19 = 0;
        }
        int i49 = (i48 + i19) * 37;
        DisclaimerStructV2 disclaimerStructV2 = this.disclaimer;
        if (disclaimerStructV2 != null) {
            i20 = disclaimerStructV2.hashCode();
        } else {
            i20 = 0;
        }
        int i50 = (i49 + i20) * 37;
        Boolean bool2 = this.allow_upload_cover;
        if (bool2 != null) {
            i21 = bool2.hashCode();
        } else {
            i21 = 0;
        }
        int i51 = (i50 + i21) * 37;
        Boolean bool3 = this.is_commerce;
        if (bool3 != null) {
            i22 = bool3.hashCode();
        } else {
            i22 = 0;
        }
        int i52 = (i51 + i22) * 37;
        CategoryCoverStructV2 categoryCoverStructV2 = this.category_cover_info;
        if (categoryCoverStructV2 != null) {
            i23 = categoryCoverStructV2.hashCode();
        } else {
            i23 = 0;
        }
        int i53 = (i52 + i23) * 37;
        String str8 = this.hashtag_profile;
        if (str8 != null) {
            i24 = str8.hashCode();
        } else {
            i24 = 0;
        }
        int i54 = (i53 + i24) * 37;
        String str9 = this.cover_photo;
        if (str9 != null) {
            i25 = str9.hashCode();
        } else {
            i25 = 0;
        }
        int i55 = (i54 + i25) * 37;
        Integer num6 = this.is_hot_search;
        if (num6 != null) {
            i26 = num6.hashCode();
        } else {
            i26 = 0;
        }
        int i56 = (i55 + i26) * 37;
        Integer num7 = this.link_type;
        if (num7 != null) {
            i27 = num7.hashCode();
        } else {
            i27 = 0;
        }
        int i57 = (i56 + i27) * 37;
        AnnouncementStructV2 announcementStructV2 = this.announcement_info;
        if (announcementStructV2 != null) {
            i28 = announcementStructV2.hashCode();
        } else {
            i28 = 0;
        }
        int i58 = (i57 + i28) * 37;
        Integer num8 = this.module_type;
        if (num8 != null) {
            i29 = num8.hashCode();
        } else {
            i29 = 0;
        }
        int i59 = (i58 + i29) * 37;
        String str10 = this.profile_tag;
        if (str10 != null) {
            i30 = str10.hashCode();
        } else {
            i30 = 0;
        }
        int hashCode3 = (((i59 + i30) * 37) + this.cha_attrs.hashCode()) * 37;
        IconButtonStructV2 iconButtonStructV2 = this.button;
        if (iconButtonStructV2 != null) {
            i32 = iconButtonStructV2.hashCode();
        }
        int i60 = hashCode3 + i32;
        this.hashCode = i60;
        return i60;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cid != null) {
            sb.append(", cid=").append(this.cid);
        }
        if (this.cha_name != null) {
            sb.append(", cha_name=").append(this.cha_name);
        }
        if (this.desc != null) {
            sb.append(", desc=").append(this.desc);
        }
        if (this.schema != null) {
            sb.append(", schema=").append(this.schema);
        }
        if (this.author != null) {
            sb.append(", author=").append(this.author);
        }
        if (this.user_count != null) {
            sb.append(", user_count=").append(this.user_count);
        }
        if (this.share_info != null) {
            sb.append(", share_info=").append(this.share_info);
        }
        if (!this.connect_music.isEmpty()) {
            sb.append(", connect_music=").append(this.connect_music);
        }
        if (this.type != null) {
            sb.append(", type=").append(this.type);
        }
        if (this.sub_type != null) {
            sb.append(", sub_type=").append(this.sub_type);
        }
        if (this.background_image_url != null) {
            sb.append(", background_image_url=").append(this.background_image_url);
        }
        if (this.sticker_id != null) {
            sb.append(", sticker_id=").append(this.sticker_id);
        }
        if (this.link_text != null) {
            sb.append(", link_text=").append(this.link_text);
        }
        if (this.link_action != null) {
            sb.append(", link_action=").append(this.link_action);
        }
        if (this.is_pgcshow != null) {
            sb.append(", is_pgcshow=").append(this.is_pgcshow);
        }
        if (this.collect_stat != null) {
            sb.append(", collect_stat=").append(this.collect_stat);
        }
        if (this.cover_item != null) {
            sb.append(", cover_item=").append(this.cover_item);
        }
        if (this.is_challenge != null) {
            sb.append(", is_challenge=").append(this.is_challenge);
        }
        if (this.view_count != null) {
            sb.append(", view_count=").append(this.view_count);
        }
        if (this.disclaimer != null) {
            sb.append(", disclaimer=").append(this.disclaimer);
        }
        if (this.allow_upload_cover != null) {
            sb.append(", allow_upload_cover=").append(this.allow_upload_cover);
        }
        if (this.is_commerce != null) {
            sb.append(", is_commerce=").append(this.is_commerce);
        }
        if (this.category_cover_info != null) {
            sb.append(", category_cover_info=").append(this.category_cover_info);
        }
        if (this.hashtag_profile != null) {
            sb.append(", hashtag_profile=").append(this.hashtag_profile);
        }
        if (this.cover_photo != null) {
            sb.append(", cover_photo=").append(this.cover_photo);
        }
        if (this.is_hot_search != null) {
            sb.append(", is_hot_search=").append(this.is_hot_search);
        }
        if (this.link_type != null) {
            sb.append(", link_type=").append(this.link_type);
        }
        if (this.announcement_info != null) {
            sb.append(", announcement_info=").append(this.announcement_info);
        }
        if (this.module_type != null) {
            sb.append(", module_type=").append(this.module_type);
        }
        if (this.profile_tag != null) {
            sb.append(", profile_tag=").append(this.profile_tag);
        }
        if (!this.cha_attrs.isEmpty()) {
            sb.append(", cha_attrs=").append(this.cha_attrs);
        }
        if (this.button != null) {
            sb.append(", button=").append(this.button);
        }
        return sb.replace(0, 2, "ChallengeStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChallengeStructV2)) {
            return false;
        }
        ChallengeStructV2 challengeStructV2 = (ChallengeStructV2) obj;
        if (!unknownFields().equals(challengeStructV2.unknownFields()) || !Internal.equals(this.cid, challengeStructV2.cid) || !Internal.equals(this.cha_name, challengeStructV2.cha_name) || !Internal.equals(this.desc, challengeStructV2.desc) || !Internal.equals(this.schema, challengeStructV2.schema) || !Internal.equals(this.author, challengeStructV2.author) || !Internal.equals(this.user_count, challengeStructV2.user_count) || !Internal.equals(this.share_info, challengeStructV2.share_info) || !this.connect_music.equals(challengeStructV2.connect_music) || !Internal.equals(this.type, challengeStructV2.type) || !Internal.equals(this.sub_type, challengeStructV2.sub_type) || !Internal.equals(this.background_image_url, challengeStructV2.background_image_url) || !Internal.equals(this.sticker_id, challengeStructV2.sticker_id) || !Internal.equals(this.link_text, challengeStructV2.link_text) || !Internal.equals(this.link_action, challengeStructV2.link_action) || !Internal.equals(this.is_pgcshow, challengeStructV2.is_pgcshow) || !Internal.equals(this.collect_stat, challengeStructV2.collect_stat) || !Internal.equals(this.cover_item, challengeStructV2.cover_item) || !Internal.equals(this.is_challenge, challengeStructV2.is_challenge) || !Internal.equals(this.view_count, challengeStructV2.view_count) || !Internal.equals(this.disclaimer, challengeStructV2.disclaimer) || !Internal.equals(this.allow_upload_cover, challengeStructV2.allow_upload_cover) || !Internal.equals(this.is_commerce, challengeStructV2.is_commerce) || !Internal.equals(this.category_cover_info, challengeStructV2.category_cover_info) || !Internal.equals(this.hashtag_profile, challengeStructV2.hashtag_profile) || !Internal.equals(this.cover_photo, challengeStructV2.cover_photo) || !Internal.equals(this.is_hot_search, challengeStructV2.is_hot_search) || !Internal.equals(this.link_type, challengeStructV2.link_type) || !Internal.equals(this.announcement_info, challengeStructV2.announcement_info) || !Internal.equals(this.module_type, challengeStructV2.module_type) || !Internal.equals(this.profile_tag, challengeStructV2.profile_tag) || !this.cha_attrs.equals(challengeStructV2.cha_attrs) || !Internal.equals(this.button, challengeStructV2.button)) {
            return false;
        }
        return true;
    }

    public ChallengeStructV2(String str, String str2, String str3, String str4, UserStructV2 userStructV2, Integer num, ShareStructV2 shareStructV2, List<MusicStructV2> list, Integer num2, Integer num3, UrlStructV2 urlStructV2, String str5, String str6, String str7, Boolean bool, Integer num4, UrlStructV2 urlStructV22, Integer num5, Long l2, DisclaimerStructV2 disclaimerStructV2, Boolean bool2, Boolean bool3, CategoryCoverStructV2 categoryCoverStructV2, String str8, String str9, Integer num6, Integer num7, AnnouncementStructV2 announcementStructV2, Integer num8, String str10, List<String> list2, IconButtonStructV2 iconButtonStructV2) {
        this(str, str2, str3, str4, userStructV2, num, shareStructV2, list, num2, num3, urlStructV2, str5, str6, str7, bool, num4, urlStructV22, num5, l2, disclaimerStructV2, bool2, bool3, categoryCoverStructV2, str8, str9, num6, num7, announcementStructV2, num8, str10, list2, iconButtonStructV2, i.EMPTY);
    }

    public ChallengeStructV2(String str, String str2, String str3, String str4, UserStructV2 userStructV2, Integer num, ShareStructV2 shareStructV2, List<MusicStructV2> list, Integer num2, Integer num3, UrlStructV2 urlStructV2, String str5, String str6, String str7, Boolean bool, Integer num4, UrlStructV2 urlStructV22, Integer num5, Long l2, DisclaimerStructV2 disclaimerStructV2, Boolean bool2, Boolean bool3, CategoryCoverStructV2 categoryCoverStructV2, String str8, String str9, Integer num6, Integer num7, AnnouncementStructV2 announcementStructV2, Integer num8, String str10, List<String> list2, IconButtonStructV2 iconButtonStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.cid = str;
        this.cha_name = str2;
        this.desc = str3;
        this.schema = str4;
        this.author = userStructV2;
        this.user_count = num;
        this.share_info = shareStructV2;
        this.connect_music = Internal.immutableCopyOf("connect_music", list);
        this.type = num2;
        this.sub_type = num3;
        this.background_image_url = urlStructV2;
        this.sticker_id = str5;
        this.link_text = str6;
        this.link_action = str7;
        this.is_pgcshow = bool;
        this.collect_stat = num4;
        this.cover_item = urlStructV22;
        this.is_challenge = num5;
        this.view_count = l2;
        this.disclaimer = disclaimerStructV2;
        this.allow_upload_cover = bool2;
        this.is_commerce = bool3;
        this.category_cover_info = categoryCoverStructV2;
        this.hashtag_profile = str8;
        this.cover_photo = str9;
        this.is_hot_search = num6;
        this.link_type = num7;
        this.announcement_info = announcementStructV2;
        this.module_type = num8;
        this.profile_tag = str10;
        this.cha_attrs = Internal.immutableCopyOf("cha_attrs", list2);
        this.button = iconButtonStructV2;
    }
}
