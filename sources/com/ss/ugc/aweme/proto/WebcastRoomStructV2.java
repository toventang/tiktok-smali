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
import k.i;

public final class WebcastRoomStructV2 extends Message<WebcastRoomStructV2, Builder> {
    public static final ProtoAdapter<WebcastRoomStructV2> ADAPTER = new ProtoAdapter_WebcastRoomStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.StreamUrlStructV2#ADAPTER", tag = LiveRechargeAgeThresholdSetting.DEFAULT)
    public StreamUrlStructV2 additional_stream_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Long create_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public Integer digg_count;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 15)
    public UrlStructV2 dynamic_cover;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = v.U)
    public String extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Long finish_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_SELECT_SCENE)
    public Boolean in_sandbox;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 21)
    public Boolean live_type_audio;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 26)
    public Boolean live_type_linkmic;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 25)
    public Boolean live_type_normal;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 24)
    public Boolean live_type_official;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 27)
    public Boolean live_type_sandbox;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 23)
    public Boolean live_type_screenshot;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 22)
    public Boolean live_type_third_party;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UserStructV2#ADAPTER", tag = 3)
    public UserStructV2 owner;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 16)
    public UrlStructV2 room_cover;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long room_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 17)
    public String room_type_tag;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ShareStructV2#ADAPTER", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public ShareStructV2 share_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public Long stream_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.StreamUrlStructV2#ADAPTER", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public StreamUrlStructV2 stream_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public Integer total_user_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Integer user_count;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 19)
    public UrlStructV2 webp_cover;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 28)
    public Boolean with_linkmic;

    public WebcastRoomStructV2() {
    }

    static final class ProtoAdapter_WebcastRoomStructV2 extends ProtoAdapter<WebcastRoomStructV2> {
        static {
            Covode.recordClassIndex(102298);
        }

        public ProtoAdapter_WebcastRoomStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, WebcastRoomStructV2.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final WebcastRoomStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.room_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.owner(UserStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.title(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.user_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.create_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.finish_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.stream_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.stream_url(StreamUrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.share_info(ShareStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.digg_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.total_user_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            builder.in_sandbox(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 15:
                            builder.dynamic_cover(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 16:
                            builder.room_cover(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 17:
                            builder.room_type_tag(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            builder.additional_stream_url(StreamUrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            builder.webp_cover(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case v.U:
                            builder.extra(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 21:
                            builder.live_type_audio(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 22:
                            builder.live_type_third_party(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 23:
                            builder.live_type_screenshot(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 24:
                            builder.live_type_official(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 25:
                            builder.live_type_normal(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 26:
                            builder.live_type_linkmic(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 27:
                            builder.live_type_sandbox(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 28:
                            builder.with_linkmic(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final int encodedSize(WebcastRoomStructV2 webcastRoomStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, webcastRoomStructV2.room_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, webcastRoomStructV2.status) + UserStructV2.ADAPTER.encodedSizeWithTag(3, webcastRoomStructV2.owner) + ProtoAdapter.STRING.encodedSizeWithTag(4, webcastRoomStructV2.title) + ProtoAdapter.INT32.encodedSizeWithTag(5, webcastRoomStructV2.user_count) + ProtoAdapter.INT64.encodedSizeWithTag(6, webcastRoomStructV2.create_time) + ProtoAdapter.INT64.encodedSizeWithTag(7, webcastRoomStructV2.finish_time) + ProtoAdapter.INT64.encodedSizeWithTag(8, webcastRoomStructV2.stream_id) + StreamUrlStructV2.ADAPTER.encodedSizeWithTag(9, webcastRoomStructV2.stream_url) + ShareStructV2.ADAPTER.encodedSizeWithTag(10, webcastRoomStructV2.share_info) + ProtoAdapter.INT32.encodedSizeWithTag(11, webcastRoomStructV2.digg_count) + ProtoAdapter.INT32.encodedSizeWithTag(12, webcastRoomStructV2.total_user_count) + ProtoAdapter.BOOL.encodedSizeWithTag(14, webcastRoomStructV2.in_sandbox) + UrlStructV2.ADAPTER.encodedSizeWithTag(15, webcastRoomStructV2.dynamic_cover) + UrlStructV2.ADAPTER.encodedSizeWithTag(16, webcastRoomStructV2.room_cover) + ProtoAdapter.STRING.encodedSizeWithTag(17, webcastRoomStructV2.room_type_tag) + StreamUrlStructV2.ADAPTER.encodedSizeWithTag(18, webcastRoomStructV2.additional_stream_url) + UrlStructV2.ADAPTER.encodedSizeWithTag(19, webcastRoomStructV2.webp_cover) + ProtoAdapter.STRING.encodedSizeWithTag(20, webcastRoomStructV2.extra) + ProtoAdapter.BOOL.encodedSizeWithTag(21, webcastRoomStructV2.live_type_audio) + ProtoAdapter.BOOL.encodedSizeWithTag(22, webcastRoomStructV2.live_type_third_party) + ProtoAdapter.BOOL.encodedSizeWithTag(23, webcastRoomStructV2.live_type_screenshot) + ProtoAdapter.BOOL.encodedSizeWithTag(24, webcastRoomStructV2.live_type_official) + ProtoAdapter.BOOL.encodedSizeWithTag(25, webcastRoomStructV2.live_type_normal) + ProtoAdapter.BOOL.encodedSizeWithTag(26, webcastRoomStructV2.live_type_linkmic) + ProtoAdapter.BOOL.encodedSizeWithTag(27, webcastRoomStructV2.live_type_sandbox) + ProtoAdapter.BOOL.encodedSizeWithTag(28, webcastRoomStructV2.with_linkmic) + webcastRoomStructV2.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, WebcastRoomStructV2 webcastRoomStructV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, webcastRoomStructV2.room_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, webcastRoomStructV2.status);
            UserStructV2.ADAPTER.encodeWithTag(protoWriter, 3, webcastRoomStructV2.owner);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, webcastRoomStructV2.title);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, webcastRoomStructV2.user_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, webcastRoomStructV2.create_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, webcastRoomStructV2.finish_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, webcastRoomStructV2.stream_id);
            StreamUrlStructV2.ADAPTER.encodeWithTag(protoWriter, 9, webcastRoomStructV2.stream_url);
            ShareStructV2.ADAPTER.encodeWithTag(protoWriter, 10, webcastRoomStructV2.share_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, webcastRoomStructV2.digg_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, webcastRoomStructV2.total_user_count);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, webcastRoomStructV2.in_sandbox);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 15, webcastRoomStructV2.dynamic_cover);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 16, webcastRoomStructV2.room_cover);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, webcastRoomStructV2.room_type_tag);
            StreamUrlStructV2.ADAPTER.encodeWithTag(protoWriter, 18, webcastRoomStructV2.additional_stream_url);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 19, webcastRoomStructV2.webp_cover);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 20, webcastRoomStructV2.extra);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, webcastRoomStructV2.live_type_audio);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 22, webcastRoomStructV2.live_type_third_party);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, webcastRoomStructV2.live_type_screenshot);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, webcastRoomStructV2.live_type_official);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 25, webcastRoomStructV2.live_type_normal);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 26, webcastRoomStructV2.live_type_linkmic);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, webcastRoomStructV2.live_type_sandbox);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 28, webcastRoomStructV2.with_linkmic);
            protoWriter.writeBytes(webcastRoomStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102296);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.WebcastRoomStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<WebcastRoomStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.room_id = this.room_id;
        builder.status = this.status;
        builder.owner = this.owner;
        builder.title = this.title;
        builder.user_count = this.user_count;
        builder.create_time = this.create_time;
        builder.finish_time = this.finish_time;
        builder.stream_id = this.stream_id;
        builder.stream_url = this.stream_url;
        builder.share_info = this.share_info;
        builder.digg_count = this.digg_count;
        builder.total_user_count = this.total_user_count;
        builder.in_sandbox = this.in_sandbox;
        builder.dynamic_cover = this.dynamic_cover;
        builder.room_cover = this.room_cover;
        builder.room_type_tag = this.room_type_tag;
        builder.additional_stream_url = this.additional_stream_url;
        builder.webp_cover = this.webp_cover;
        builder.extra = this.extra;
        builder.live_type_audio = this.live_type_audio;
        builder.live_type_third_party = this.live_type_third_party;
        builder.live_type_screenshot = this.live_type_screenshot;
        builder.live_type_official = this.live_type_official;
        builder.live_type_normal = this.live_type_normal;
        builder.live_type_linkmic = this.live_type_linkmic;
        builder.live_type_sandbox = this.live_type_sandbox;
        builder.with_linkmic = this.with_linkmic;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public static final class Builder extends Message.Builder<WebcastRoomStructV2, Builder> {
        public StreamUrlStructV2 additional_stream_url;
        public Long create_time;
        public Integer digg_count;
        public UrlStructV2 dynamic_cover;
        public String extra;
        public Long finish_time;
        public Boolean in_sandbox;
        public Boolean live_type_audio;
        public Boolean live_type_linkmic;
        public Boolean live_type_normal;
        public Boolean live_type_official;
        public Boolean live_type_sandbox;
        public Boolean live_type_screenshot;
        public Boolean live_type_third_party;
        public UserStructV2 owner;
        public UrlStructV2 room_cover;
        public Long room_id;
        public String room_type_tag;
        public ShareStructV2 share_info;
        public Integer status;
        public Long stream_id;
        public StreamUrlStructV2 stream_url;
        public String title;
        public Integer total_user_count;
        public Integer user_count;
        public UrlStructV2 webp_cover;
        public Boolean with_linkmic;

        static {
            Covode.recordClassIndex(102297);
        }

        @Override // com.squareup.wire.Message.Builder
        public final WebcastRoomStructV2 build() {
            return new WebcastRoomStructV2(this.room_id, this.status, this.owner, this.title, this.user_count, this.create_time, this.finish_time, this.stream_id, this.stream_url, this.share_info, this.digg_count, this.total_user_count, this.in_sandbox, this.dynamic_cover, this.room_cover, this.room_type_tag, this.additional_stream_url, this.webp_cover, this.extra, this.live_type_audio, this.live_type_third_party, this.live_type_screenshot, this.live_type_official, this.live_type_normal, this.live_type_linkmic, this.live_type_sandbox, this.with_linkmic, super.buildUnknownFields());
        }

        public final Builder additional_stream_url(StreamUrlStructV2 streamUrlStructV2) {
            this.additional_stream_url = streamUrlStructV2;
            return this;
        }

        public final Builder create_time(Long l2) {
            this.create_time = l2;
            return this;
        }

        public final Builder digg_count(Integer num) {
            this.digg_count = num;
            return this;
        }

        public final Builder dynamic_cover(UrlStructV2 urlStructV2) {
            this.dynamic_cover = urlStructV2;
            return this;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder finish_time(Long l2) {
            this.finish_time = l2;
            return this;
        }

        public final Builder in_sandbox(Boolean bool) {
            this.in_sandbox = bool;
            return this;
        }

        public final Builder live_type_audio(Boolean bool) {
            this.live_type_audio = bool;
            return this;
        }

        public final Builder live_type_linkmic(Boolean bool) {
            this.live_type_linkmic = bool;
            return this;
        }

        public final Builder live_type_normal(Boolean bool) {
            this.live_type_normal = bool;
            return this;
        }

        public final Builder live_type_official(Boolean bool) {
            this.live_type_official = bool;
            return this;
        }

        public final Builder live_type_sandbox(Boolean bool) {
            this.live_type_sandbox = bool;
            return this;
        }

        public final Builder live_type_screenshot(Boolean bool) {
            this.live_type_screenshot = bool;
            return this;
        }

        public final Builder live_type_third_party(Boolean bool) {
            this.live_type_third_party = bool;
            return this;
        }

        public final Builder owner(UserStructV2 userStructV2) {
            this.owner = userStructV2;
            return this;
        }

        public final Builder room_cover(UrlStructV2 urlStructV2) {
            this.room_cover = urlStructV2;
            return this;
        }

        public final Builder room_id(Long l2) {
            this.room_id = l2;
            return this;
        }

        public final Builder room_type_tag(String str) {
            this.room_type_tag = str;
            return this;
        }

        public final Builder share_info(ShareStructV2 shareStructV2) {
            this.share_info = shareStructV2;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder stream_id(Long l2) {
            this.stream_id = l2;
            return this;
        }

        public final Builder stream_url(StreamUrlStructV2 streamUrlStructV2) {
            this.stream_url = streamUrlStructV2;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder total_user_count(Integer num) {
            this.total_user_count = num;
            return this;
        }

        public final Builder user_count(Integer num) {
            this.user_count = num;
            return this;
        }

        public final Builder webp_cover(UrlStructV2 urlStructV2) {
            this.webp_cover = urlStructV2;
            return this;
        }

        public final Builder with_linkmic(Boolean bool) {
            this.with_linkmic = bool;
            return this;
        }
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
        int i28 = this.hashCode;
        if (i28 != 0) {
            return i28;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l2 = this.room_id;
        int i29 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i30 = (hashCode + i2) * 37;
        Integer num = this.status;
        if (num != null) {
            i3 = num.hashCode();
        } else {
            i3 = 0;
        }
        int i31 = (i30 + i3) * 37;
        UserStructV2 userStructV2 = this.owner;
        if (userStructV2 != null) {
            i4 = userStructV2.hashCode();
        } else {
            i4 = 0;
        }
        int i32 = (i31 + i4) * 37;
        String str = this.title;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i33 = (i32 + i5) * 37;
        Integer num2 = this.user_count;
        if (num2 != null) {
            i6 = num2.hashCode();
        } else {
            i6 = 0;
        }
        int i34 = (i33 + i6) * 37;
        Long l3 = this.create_time;
        if (l3 != null) {
            i7 = l3.hashCode();
        } else {
            i7 = 0;
        }
        int i35 = (i34 + i7) * 37;
        Long l4 = this.finish_time;
        if (l4 != null) {
            i8 = l4.hashCode();
        } else {
            i8 = 0;
        }
        int i36 = (i35 + i8) * 37;
        Long l5 = this.stream_id;
        if (l5 != null) {
            i9 = l5.hashCode();
        } else {
            i9 = 0;
        }
        int i37 = (i36 + i9) * 37;
        StreamUrlStructV2 streamUrlStructV2 = this.stream_url;
        if (streamUrlStructV2 != null) {
            i10 = streamUrlStructV2.hashCode();
        } else {
            i10 = 0;
        }
        int i38 = (i37 + i10) * 37;
        ShareStructV2 shareStructV2 = this.share_info;
        if (shareStructV2 != null) {
            i11 = shareStructV2.hashCode();
        } else {
            i11 = 0;
        }
        int i39 = (i38 + i11) * 37;
        Integer num3 = this.digg_count;
        if (num3 != null) {
            i12 = num3.hashCode();
        } else {
            i12 = 0;
        }
        int i40 = (i39 + i12) * 37;
        Integer num4 = this.total_user_count;
        if (num4 != null) {
            i13 = num4.hashCode();
        } else {
            i13 = 0;
        }
        int i41 = (i40 + i13) * 37;
        Boolean bool = this.in_sandbox;
        if (bool != null) {
            i14 = bool.hashCode();
        } else {
            i14 = 0;
        }
        int i42 = (i41 + i14) * 37;
        UrlStructV2 urlStructV2 = this.dynamic_cover;
        if (urlStructV2 != null) {
            i15 = urlStructV2.hashCode();
        } else {
            i15 = 0;
        }
        int i43 = (i42 + i15) * 37;
        UrlStructV2 urlStructV22 = this.room_cover;
        if (urlStructV22 != null) {
            i16 = urlStructV22.hashCode();
        } else {
            i16 = 0;
        }
        int i44 = (i43 + i16) * 37;
        String str2 = this.room_type_tag;
        if (str2 != null) {
            i17 = str2.hashCode();
        } else {
            i17 = 0;
        }
        int i45 = (i44 + i17) * 37;
        StreamUrlStructV2 streamUrlStructV22 = this.additional_stream_url;
        if (streamUrlStructV22 != null) {
            i18 = streamUrlStructV22.hashCode();
        } else {
            i18 = 0;
        }
        int i46 = (i45 + i18) * 37;
        UrlStructV2 urlStructV23 = this.webp_cover;
        if (urlStructV23 != null) {
            i19 = urlStructV23.hashCode();
        } else {
            i19 = 0;
        }
        int i47 = (i46 + i19) * 37;
        String str3 = this.extra;
        if (str3 != null) {
            i20 = str3.hashCode();
        } else {
            i20 = 0;
        }
        int i48 = (i47 + i20) * 37;
        Boolean bool2 = this.live_type_audio;
        if (bool2 != null) {
            i21 = bool2.hashCode();
        } else {
            i21 = 0;
        }
        int i49 = (i48 + i21) * 37;
        Boolean bool3 = this.live_type_third_party;
        if (bool3 != null) {
            i22 = bool3.hashCode();
        } else {
            i22 = 0;
        }
        int i50 = (i49 + i22) * 37;
        Boolean bool4 = this.live_type_screenshot;
        if (bool4 != null) {
            i23 = bool4.hashCode();
        } else {
            i23 = 0;
        }
        int i51 = (i50 + i23) * 37;
        Boolean bool5 = this.live_type_official;
        if (bool5 != null) {
            i24 = bool5.hashCode();
        } else {
            i24 = 0;
        }
        int i52 = (i51 + i24) * 37;
        Boolean bool6 = this.live_type_normal;
        if (bool6 != null) {
            i25 = bool6.hashCode();
        } else {
            i25 = 0;
        }
        int i53 = (i52 + i25) * 37;
        Boolean bool7 = this.live_type_linkmic;
        if (bool7 != null) {
            i26 = bool7.hashCode();
        } else {
            i26 = 0;
        }
        int i54 = (i53 + i26) * 37;
        Boolean bool8 = this.live_type_sandbox;
        if (bool8 != null) {
            i27 = bool8.hashCode();
        } else {
            i27 = 0;
        }
        int i55 = (i54 + i27) * 37;
        Boolean bool9 = this.with_linkmic;
        if (bool9 != null) {
            i29 = bool9.hashCode();
        }
        int i56 = i55 + i29;
        this.hashCode = i56;
        return i56;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.room_id != null) {
            sb.append(", room_id=").append(this.room_id);
        }
        if (this.status != null) {
            sb.append(", status=").append(this.status);
        }
        if (this.owner != null) {
            sb.append(", owner=").append(this.owner);
        }
        if (this.title != null) {
            sb.append(", title=").append(this.title);
        }
        if (this.user_count != null) {
            sb.append(", user_count=").append(this.user_count);
        }
        if (this.create_time != null) {
            sb.append(", create_time=").append(this.create_time);
        }
        if (this.finish_time != null) {
            sb.append(", finish_time=").append(this.finish_time);
        }
        if (this.stream_id != null) {
            sb.append(", stream_id=").append(this.stream_id);
        }
        if (this.stream_url != null) {
            sb.append(", stream_url=").append(this.stream_url);
        }
        if (this.share_info != null) {
            sb.append(", share_info=").append(this.share_info);
        }
        if (this.digg_count != null) {
            sb.append(", digg_count=").append(this.digg_count);
        }
        if (this.total_user_count != null) {
            sb.append(", total_user_count=").append(this.total_user_count);
        }
        if (this.in_sandbox != null) {
            sb.append(", in_sandbox=").append(this.in_sandbox);
        }
        if (this.dynamic_cover != null) {
            sb.append(", dynamic_cover=").append(this.dynamic_cover);
        }
        if (this.room_cover != null) {
            sb.append(", room_cover=").append(this.room_cover);
        }
        if (this.room_type_tag != null) {
            sb.append(", room_type_tag=").append(this.room_type_tag);
        }
        if (this.additional_stream_url != null) {
            sb.append(", additional_stream_url=").append(this.additional_stream_url);
        }
        if (this.webp_cover != null) {
            sb.append(", webp_cover=").append(this.webp_cover);
        }
        if (this.extra != null) {
            sb.append(", extra=").append(this.extra);
        }
        if (this.live_type_audio != null) {
            sb.append(", live_type_audio=").append(this.live_type_audio);
        }
        if (this.live_type_third_party != null) {
            sb.append(", live_type_third_party=").append(this.live_type_third_party);
        }
        if (this.live_type_screenshot != null) {
            sb.append(", live_type_screenshot=").append(this.live_type_screenshot);
        }
        if (this.live_type_official != null) {
            sb.append(", live_type_official=").append(this.live_type_official);
        }
        if (this.live_type_normal != null) {
            sb.append(", live_type_normal=").append(this.live_type_normal);
        }
        if (this.live_type_linkmic != null) {
            sb.append(", live_type_linkmic=").append(this.live_type_linkmic);
        }
        if (this.live_type_sandbox != null) {
            sb.append(", live_type_sandbox=").append(this.live_type_sandbox);
        }
        if (this.with_linkmic != null) {
            sb.append(", with_linkmic=").append(this.with_linkmic);
        }
        return sb.replace(0, 2, "WebcastRoomStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebcastRoomStructV2)) {
            return false;
        }
        WebcastRoomStructV2 webcastRoomStructV2 = (WebcastRoomStructV2) obj;
        if (!unknownFields().equals(webcastRoomStructV2.unknownFields()) || !Internal.equals(this.room_id, webcastRoomStructV2.room_id) || !Internal.equals(this.status, webcastRoomStructV2.status) || !Internal.equals(this.owner, webcastRoomStructV2.owner) || !Internal.equals(this.title, webcastRoomStructV2.title) || !Internal.equals(this.user_count, webcastRoomStructV2.user_count) || !Internal.equals(this.create_time, webcastRoomStructV2.create_time) || !Internal.equals(this.finish_time, webcastRoomStructV2.finish_time) || !Internal.equals(this.stream_id, webcastRoomStructV2.stream_id) || !Internal.equals(this.stream_url, webcastRoomStructV2.stream_url) || !Internal.equals(this.share_info, webcastRoomStructV2.share_info) || !Internal.equals(this.digg_count, webcastRoomStructV2.digg_count) || !Internal.equals(this.total_user_count, webcastRoomStructV2.total_user_count) || !Internal.equals(this.in_sandbox, webcastRoomStructV2.in_sandbox) || !Internal.equals(this.dynamic_cover, webcastRoomStructV2.dynamic_cover) || !Internal.equals(this.room_cover, webcastRoomStructV2.room_cover) || !Internal.equals(this.room_type_tag, webcastRoomStructV2.room_type_tag) || !Internal.equals(this.additional_stream_url, webcastRoomStructV2.additional_stream_url) || !Internal.equals(this.webp_cover, webcastRoomStructV2.webp_cover) || !Internal.equals(this.extra, webcastRoomStructV2.extra) || !Internal.equals(this.live_type_audio, webcastRoomStructV2.live_type_audio) || !Internal.equals(this.live_type_third_party, webcastRoomStructV2.live_type_third_party) || !Internal.equals(this.live_type_screenshot, webcastRoomStructV2.live_type_screenshot) || !Internal.equals(this.live_type_official, webcastRoomStructV2.live_type_official) || !Internal.equals(this.live_type_normal, webcastRoomStructV2.live_type_normal) || !Internal.equals(this.live_type_linkmic, webcastRoomStructV2.live_type_linkmic) || !Internal.equals(this.live_type_sandbox, webcastRoomStructV2.live_type_sandbox) || !Internal.equals(this.with_linkmic, webcastRoomStructV2.with_linkmic)) {
            return false;
        }
        return true;
    }

    public WebcastRoomStructV2(Long l2, Integer num, UserStructV2 userStructV2, String str, Integer num2, Long l3, Long l4, Long l5, StreamUrlStructV2 streamUrlStructV2, ShareStructV2 shareStructV2, Integer num3, Integer num4, Boolean bool, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, String str2, StreamUrlStructV2 streamUrlStructV22, UrlStructV2 urlStructV23, String str3, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9) {
        this(l2, num, userStructV2, str, num2, l3, l4, l5, streamUrlStructV2, shareStructV2, num3, num4, bool, urlStructV2, urlStructV22, str2, streamUrlStructV22, urlStructV23, str3, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, i.EMPTY);
    }

    public WebcastRoomStructV2(Long l2, Integer num, UserStructV2 userStructV2, String str, Integer num2, Long l3, Long l4, Long l5, StreamUrlStructV2 streamUrlStructV2, ShareStructV2 shareStructV2, Integer num3, Integer num4, Boolean bool, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, String str2, StreamUrlStructV2 streamUrlStructV22, UrlStructV2 urlStructV23, String str3, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, i iVar) {
        super(ADAPTER, iVar);
        this.room_id = l2;
        this.status = num;
        this.owner = userStructV2;
        this.title = str;
        this.user_count = num2;
        this.create_time = l3;
        this.finish_time = l4;
        this.stream_id = l5;
        this.stream_url = streamUrlStructV2;
        this.share_info = shareStructV2;
        this.digg_count = num3;
        this.total_user_count = num4;
        this.in_sandbox = bool;
        this.dynamic_cover = urlStructV2;
        this.room_cover = urlStructV22;
        this.room_type_tag = str2;
        this.additional_stream_url = streamUrlStructV22;
        this.webp_cover = urlStructV23;
        this.extra = str3;
        this.live_type_audio = bool2;
        this.live_type_third_party = bool3;
        this.live_type_screenshot = bool4;
        this.live_type_official = bool5;
        this.live_type_normal = bool6;
        this.live_type_linkmic = bool7;
        this.live_type_sandbox = bool8;
        this.with_linkmic = bool9;
    }
}
