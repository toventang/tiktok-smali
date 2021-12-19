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

public final class VideoStructV2 extends Message<VideoStructV2, Builder> {
    public static final ProtoAdapter<VideoStructV2> ADAPTER = new ProtoAdapter_VideoStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.BigThumbV2#ADAPTER", label = WireField.Label.REPEATED, tag = 29)
    public List<BigThumbV2> big_thumbs;
    @WireField(adapter = "com.ss.ugc.aweme.proto.BitRateStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public List<BitRateStructV2> bit_rate;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = v.U)
    public UrlStructV2 caption_download_addr;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 21)
    public Long cdn_url_expired;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ClaStructV2#ADAPTER", tag = 31)
    public ClaStructV2 cla_info;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 2)
    public UrlStructV2 cover;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public UrlStructV2 download_addr;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_SELECT_SCENE)
    public UrlStructV2 download_suffix_logo_addr;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_MAX_BITRATE)
    public Integer duration;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public UrlStructV2 dynamic_cover;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 15)
    public Boolean has_download_suffix_logo_addr;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public Boolean has_watermark;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer height;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 28)
    public Integer is_bytevc1;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 22)
    public Integer is_long_video;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 30)
    public String meta;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 25)
    public String misc_download_addrs;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 24)
    public Boolean need_set_token;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public UrlStructV2 new_download_addr;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public UrlStructV2 origin_cover;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 1)
    public UrlStructV2 play_addr;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 16)
    public UrlStructV2 play_addr_265;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 27)
    public UrlStructV2 play_addr_bytevc1;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = LiveRechargeAgeThresholdSetting.DEFAULT)
    public UrlStructV2 play_addr_h264;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public UrlStructV2 play_addr_lowbr;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public String ratio;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PlayTokenAuthStructV2#ADAPTER", tag = 26)
    public PlayTokenAuthStructV2 token_auth;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 19)
    public UrlStructV2 ui_alike_download_addr;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 23)
    public String video_model;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer width;

    public VideoStructV2() {
    }

    static final class ProtoAdapter_VideoStructV2 extends ProtoAdapter<VideoStructV2> {
        static {
            Covode.recordClassIndex(102277);
        }

        public ProtoAdapter_VideoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoStructV2.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final VideoStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.play_addr(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.cover(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.height(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.width(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.dynamic_cover(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.origin_cover(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.ratio(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.download_addr(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.has_watermark(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.play_addr_lowbr(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.bit_rate.add(BitRateStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.new_download_addr(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            builder.duration(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            builder.download_suffix_logo_addr(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            builder.has_download_suffix_logo_addr(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 16:
                            builder.play_addr_265(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 17:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            builder.play_addr_h264(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            builder.ui_alike_download_addr(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case v.U:
                            builder.caption_download_addr(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 21:
                            builder.cdn_url_expired(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 22:
                            builder.is_long_video(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 23:
                            builder.video_model(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 24:
                            builder.need_set_token(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 25:
                            builder.misc_download_addrs(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 26:
                            builder.token_auth(PlayTokenAuthStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 27:
                            builder.play_addr_bytevc1(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 28:
                            builder.is_bytevc1(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 29:
                            builder.big_thumbs.add(BigThumbV2.ADAPTER.decode(protoReader));
                            break;
                        case 30:
                            builder.meta(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 31:
                            builder.cla_info(ClaStructV2.ADAPTER.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final int encodedSize(VideoStructV2 videoStructV2) {
            return UrlStructV2.ADAPTER.encodedSizeWithTag(1, videoStructV2.play_addr) + UrlStructV2.ADAPTER.encodedSizeWithTag(2, videoStructV2.cover) + ProtoAdapter.INT32.encodedSizeWithTag(3, videoStructV2.height) + ProtoAdapter.INT32.encodedSizeWithTag(4, videoStructV2.width) + UrlStructV2.ADAPTER.encodedSizeWithTag(5, videoStructV2.dynamic_cover) + UrlStructV2.ADAPTER.encodedSizeWithTag(6, videoStructV2.origin_cover) + ProtoAdapter.STRING.encodedSizeWithTag(7, videoStructV2.ratio) + UrlStructV2.ADAPTER.encodedSizeWithTag(8, videoStructV2.download_addr) + ProtoAdapter.BOOL.encodedSizeWithTag(9, videoStructV2.has_watermark) + UrlStructV2.ADAPTER.encodedSizeWithTag(10, videoStructV2.play_addr_lowbr) + BitRateStructV2.ADAPTER.asRepeated().encodedSizeWithTag(11, videoStructV2.bit_rate) + UrlStructV2.ADAPTER.encodedSizeWithTag(12, videoStructV2.new_download_addr) + ProtoAdapter.INT32.encodedSizeWithTag(13, videoStructV2.duration) + UrlStructV2.ADAPTER.encodedSizeWithTag(14, videoStructV2.download_suffix_logo_addr) + ProtoAdapter.BOOL.encodedSizeWithTag(15, videoStructV2.has_download_suffix_logo_addr) + UrlStructV2.ADAPTER.encodedSizeWithTag(16, videoStructV2.play_addr_265) + UrlStructV2.ADAPTER.encodedSizeWithTag(18, videoStructV2.play_addr_h264) + UrlStructV2.ADAPTER.encodedSizeWithTag(19, videoStructV2.ui_alike_download_addr) + UrlStructV2.ADAPTER.encodedSizeWithTag(20, videoStructV2.caption_download_addr) + ProtoAdapter.INT64.encodedSizeWithTag(21, videoStructV2.cdn_url_expired) + ProtoAdapter.INT32.encodedSizeWithTag(22, videoStructV2.is_long_video) + ProtoAdapter.STRING.encodedSizeWithTag(23, videoStructV2.video_model) + ProtoAdapter.BOOL.encodedSizeWithTag(24, videoStructV2.need_set_token) + ProtoAdapter.STRING.encodedSizeWithTag(25, videoStructV2.misc_download_addrs) + PlayTokenAuthStructV2.ADAPTER.encodedSizeWithTag(26, videoStructV2.token_auth) + UrlStructV2.ADAPTER.encodedSizeWithTag(27, videoStructV2.play_addr_bytevc1) + ProtoAdapter.INT32.encodedSizeWithTag(28, videoStructV2.is_bytevc1) + BigThumbV2.ADAPTER.asRepeated().encodedSizeWithTag(29, videoStructV2.big_thumbs) + ProtoAdapter.STRING.encodedSizeWithTag(30, videoStructV2.meta) + ClaStructV2.ADAPTER.encodedSizeWithTag(31, videoStructV2.cla_info) + videoStructV2.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, VideoStructV2 videoStructV2) {
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 1, videoStructV2.play_addr);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 2, videoStructV2.cover);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, videoStructV2.height);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, videoStructV2.width);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 5, videoStructV2.dynamic_cover);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 6, videoStructV2.origin_cover);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, videoStructV2.ratio);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 8, videoStructV2.download_addr);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, videoStructV2.has_watermark);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 10, videoStructV2.play_addr_lowbr);
            BitRateStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, videoStructV2.bit_rate);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 12, videoStructV2.new_download_addr);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, videoStructV2.duration);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 14, videoStructV2.download_suffix_logo_addr);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, videoStructV2.has_download_suffix_logo_addr);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 16, videoStructV2.play_addr_265);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 18, videoStructV2.play_addr_h264);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 19, videoStructV2.ui_alike_download_addr);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 20, videoStructV2.caption_download_addr);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 21, videoStructV2.cdn_url_expired);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 22, videoStructV2.is_long_video);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 23, videoStructV2.video_model);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, videoStructV2.need_set_token);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 25, videoStructV2.misc_download_addrs);
            PlayTokenAuthStructV2.ADAPTER.encodeWithTag(protoWriter, 26, videoStructV2.token_auth);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 27, videoStructV2.play_addr_bytevc1);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 28, videoStructV2.is_bytevc1);
            BigThumbV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 29, videoStructV2.big_thumbs);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 30, videoStructV2.meta);
            ClaStructV2.ADAPTER.encodeWithTag(protoWriter, 31, videoStructV2.cla_info);
            protoWriter.writeBytes(videoStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102275);
    }

    public static final class Builder extends Message.Builder<VideoStructV2, Builder> {
        public List<BigThumbV2> big_thumbs = Internal.newMutableList();
        public List<BitRateStructV2> bit_rate = Internal.newMutableList();
        public UrlStructV2 caption_download_addr;
        public Long cdn_url_expired;
        public ClaStructV2 cla_info;
        public UrlStructV2 cover;
        public UrlStructV2 download_addr;
        public UrlStructV2 download_suffix_logo_addr;
        public Integer duration;
        public UrlStructV2 dynamic_cover;
        public Boolean has_download_suffix_logo_addr;
        public Boolean has_watermark;
        public Integer height;
        public Integer is_bytevc1;
        public Integer is_long_video;
        public String meta;
        public String misc_download_addrs;
        public Boolean need_set_token;
        public UrlStructV2 new_download_addr;
        public UrlStructV2 origin_cover;
        public UrlStructV2 play_addr;
        public UrlStructV2 play_addr_265;
        public UrlStructV2 play_addr_bytevc1;
        public UrlStructV2 play_addr_h264;
        public UrlStructV2 play_addr_lowbr;
        public String ratio;
        public PlayTokenAuthStructV2 token_auth;
        public UrlStructV2 ui_alike_download_addr;
        public String video_model;
        public Integer width;

        static {
            Covode.recordClassIndex(102276);
        }

        @Override // com.squareup.wire.Message.Builder
        public final VideoStructV2 build() {
            return new VideoStructV2(this.play_addr, this.cover, this.height, this.width, this.dynamic_cover, this.origin_cover, this.ratio, this.download_addr, this.has_watermark, this.play_addr_lowbr, this.bit_rate, this.new_download_addr, this.duration, this.download_suffix_logo_addr, this.has_download_suffix_logo_addr, this.play_addr_265, this.play_addr_h264, this.ui_alike_download_addr, this.caption_download_addr, this.cdn_url_expired, this.is_long_video, this.video_model, this.need_set_token, this.misc_download_addrs, this.token_auth, this.play_addr_bytevc1, this.is_bytevc1, this.big_thumbs, this.meta, this.cla_info, super.buildUnknownFields());
        }

        public final Builder caption_download_addr(UrlStructV2 urlStructV2) {
            this.caption_download_addr = urlStructV2;
            return this;
        }

        public final Builder cdn_url_expired(Long l2) {
            this.cdn_url_expired = l2;
            return this;
        }

        public final Builder cla_info(ClaStructV2 claStructV2) {
            this.cla_info = claStructV2;
            return this;
        }

        public final Builder cover(UrlStructV2 urlStructV2) {
            this.cover = urlStructV2;
            return this;
        }

        public final Builder download_addr(UrlStructV2 urlStructV2) {
            this.download_addr = urlStructV2;
            return this;
        }

        public final Builder download_suffix_logo_addr(UrlStructV2 urlStructV2) {
            this.download_suffix_logo_addr = urlStructV2;
            return this;
        }

        public final Builder duration(Integer num) {
            this.duration = num;
            return this;
        }

        public final Builder dynamic_cover(UrlStructV2 urlStructV2) {
            this.dynamic_cover = urlStructV2;
            return this;
        }

        public final Builder has_download_suffix_logo_addr(Boolean bool) {
            this.has_download_suffix_logo_addr = bool;
            return this;
        }

        public final Builder has_watermark(Boolean bool) {
            this.has_watermark = bool;
            return this;
        }

        public final Builder height(Integer num) {
            this.height = num;
            return this;
        }

        public final Builder is_bytevc1(Integer num) {
            this.is_bytevc1 = num;
            return this;
        }

        public final Builder is_long_video(Integer num) {
            this.is_long_video = num;
            return this;
        }

        public final Builder meta(String str) {
            this.meta = str;
            return this;
        }

        public final Builder misc_download_addrs(String str) {
            this.misc_download_addrs = str;
            return this;
        }

        public final Builder need_set_token(Boolean bool) {
            this.need_set_token = bool;
            return this;
        }

        public final Builder new_download_addr(UrlStructV2 urlStructV2) {
            this.new_download_addr = urlStructV2;
            return this;
        }

        public final Builder origin_cover(UrlStructV2 urlStructV2) {
            this.origin_cover = urlStructV2;
            return this;
        }

        public final Builder play_addr(UrlStructV2 urlStructV2) {
            this.play_addr = urlStructV2;
            return this;
        }

        public final Builder play_addr_265(UrlStructV2 urlStructV2) {
            this.play_addr_265 = urlStructV2;
            return this;
        }

        public final Builder play_addr_bytevc1(UrlStructV2 urlStructV2) {
            this.play_addr_bytevc1 = urlStructV2;
            return this;
        }

        public final Builder play_addr_h264(UrlStructV2 urlStructV2) {
            this.play_addr_h264 = urlStructV2;
            return this;
        }

        public final Builder play_addr_lowbr(UrlStructV2 urlStructV2) {
            this.play_addr_lowbr = urlStructV2;
            return this;
        }

        public final Builder ratio(String str) {
            this.ratio = str;
            return this;
        }

        public final Builder token_auth(PlayTokenAuthStructV2 playTokenAuthStructV2) {
            this.token_auth = playTokenAuthStructV2;
            return this;
        }

        public final Builder ui_alike_download_addr(UrlStructV2 urlStructV2) {
            this.ui_alike_download_addr = urlStructV2;
            return this;
        }

        public final Builder video_model(String str) {
            this.video_model = str;
            return this;
        }

        public final Builder width(Integer num) {
            this.width = num;
            return this;
        }

        public final Builder big_thumbs(List<BigThumbV2> list) {
            Internal.checkElementsNotNull(list);
            this.big_thumbs = list;
            return this;
        }

        public final Builder bit_rate(List<BitRateStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.bit_rate = list;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.VideoStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<VideoStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.play_addr = this.play_addr;
        builder.cover = this.cover;
        builder.height = this.height;
        builder.width = this.width;
        builder.dynamic_cover = this.dynamic_cover;
        builder.origin_cover = this.origin_cover;
        builder.ratio = this.ratio;
        builder.download_addr = this.download_addr;
        builder.has_watermark = this.has_watermark;
        builder.play_addr_lowbr = this.play_addr_lowbr;
        builder.bit_rate = Internal.copyOf("bit_rate", this.bit_rate);
        builder.new_download_addr = this.new_download_addr;
        builder.duration = this.duration;
        builder.download_suffix_logo_addr = this.download_suffix_logo_addr;
        builder.has_download_suffix_logo_addr = this.has_download_suffix_logo_addr;
        builder.play_addr_265 = this.play_addr_265;
        builder.play_addr_h264 = this.play_addr_h264;
        builder.ui_alike_download_addr = this.ui_alike_download_addr;
        builder.caption_download_addr = this.caption_download_addr;
        builder.cdn_url_expired = this.cdn_url_expired;
        builder.is_long_video = this.is_long_video;
        builder.video_model = this.video_model;
        builder.need_set_token = this.need_set_token;
        builder.misc_download_addrs = this.misc_download_addrs;
        builder.token_auth = this.token_auth;
        builder.play_addr_bytevc1 = this.play_addr_bytevc1;
        builder.is_bytevc1 = this.is_bytevc1;
        builder.big_thumbs = Internal.copyOf("big_thumbs", this.big_thumbs);
        builder.meta = this.meta;
        builder.cla_info = this.cla_info;
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
        int i29 = this.hashCode;
        if (i29 != 0) {
            return i29;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UrlStructV2 urlStructV2 = this.play_addr;
        int i30 = 0;
        if (urlStructV2 != null) {
            i2 = urlStructV2.hashCode();
        } else {
            i2 = 0;
        }
        int i31 = (hashCode + i2) * 37;
        UrlStructV2 urlStructV22 = this.cover;
        if (urlStructV22 != null) {
            i3 = urlStructV22.hashCode();
        } else {
            i3 = 0;
        }
        int i32 = (i31 + i3) * 37;
        Integer num = this.height;
        if (num != null) {
            i4 = num.hashCode();
        } else {
            i4 = 0;
        }
        int i33 = (i32 + i4) * 37;
        Integer num2 = this.width;
        if (num2 != null) {
            i5 = num2.hashCode();
        } else {
            i5 = 0;
        }
        int i34 = (i33 + i5) * 37;
        UrlStructV2 urlStructV23 = this.dynamic_cover;
        if (urlStructV23 != null) {
            i6 = urlStructV23.hashCode();
        } else {
            i6 = 0;
        }
        int i35 = (i34 + i6) * 37;
        UrlStructV2 urlStructV24 = this.origin_cover;
        if (urlStructV24 != null) {
            i7 = urlStructV24.hashCode();
        } else {
            i7 = 0;
        }
        int i36 = (i35 + i7) * 37;
        String str = this.ratio;
        if (str != null) {
            i8 = str.hashCode();
        } else {
            i8 = 0;
        }
        int i37 = (i36 + i8) * 37;
        UrlStructV2 urlStructV25 = this.download_addr;
        if (urlStructV25 != null) {
            i9 = urlStructV25.hashCode();
        } else {
            i9 = 0;
        }
        int i38 = (i37 + i9) * 37;
        Boolean bool = this.has_watermark;
        if (bool != null) {
            i10 = bool.hashCode();
        } else {
            i10 = 0;
        }
        int i39 = (i38 + i10) * 37;
        UrlStructV2 urlStructV26 = this.play_addr_lowbr;
        if (urlStructV26 != null) {
            i11 = urlStructV26.hashCode();
        } else {
            i11 = 0;
        }
        int hashCode2 = (((i39 + i11) * 37) + this.bit_rate.hashCode()) * 37;
        UrlStructV2 urlStructV27 = this.new_download_addr;
        if (urlStructV27 != null) {
            i12 = urlStructV27.hashCode();
        } else {
            i12 = 0;
        }
        int i40 = (hashCode2 + i12) * 37;
        Integer num3 = this.duration;
        if (num3 != null) {
            i13 = num3.hashCode();
        } else {
            i13 = 0;
        }
        int i41 = (i40 + i13) * 37;
        UrlStructV2 urlStructV28 = this.download_suffix_logo_addr;
        if (urlStructV28 != null) {
            i14 = urlStructV28.hashCode();
        } else {
            i14 = 0;
        }
        int i42 = (i41 + i14) * 37;
        Boolean bool2 = this.has_download_suffix_logo_addr;
        if (bool2 != null) {
            i15 = bool2.hashCode();
        } else {
            i15 = 0;
        }
        int i43 = (i42 + i15) * 37;
        UrlStructV2 urlStructV29 = this.play_addr_265;
        if (urlStructV29 != null) {
            i16 = urlStructV29.hashCode();
        } else {
            i16 = 0;
        }
        int i44 = (i43 + i16) * 37;
        UrlStructV2 urlStructV210 = this.play_addr_h264;
        if (urlStructV210 != null) {
            i17 = urlStructV210.hashCode();
        } else {
            i17 = 0;
        }
        int i45 = (i44 + i17) * 37;
        UrlStructV2 urlStructV211 = this.ui_alike_download_addr;
        if (urlStructV211 != null) {
            i18 = urlStructV211.hashCode();
        } else {
            i18 = 0;
        }
        int i46 = (i45 + i18) * 37;
        UrlStructV2 urlStructV212 = this.caption_download_addr;
        if (urlStructV212 != null) {
            i19 = urlStructV212.hashCode();
        } else {
            i19 = 0;
        }
        int i47 = (i46 + i19) * 37;
        Long l2 = this.cdn_url_expired;
        if (l2 != null) {
            i20 = l2.hashCode();
        } else {
            i20 = 0;
        }
        int i48 = (i47 + i20) * 37;
        Integer num4 = this.is_long_video;
        if (num4 != null) {
            i21 = num4.hashCode();
        } else {
            i21 = 0;
        }
        int i49 = (i48 + i21) * 37;
        String str2 = this.video_model;
        if (str2 != null) {
            i22 = str2.hashCode();
        } else {
            i22 = 0;
        }
        int i50 = (i49 + i22) * 37;
        Boolean bool3 = this.need_set_token;
        if (bool3 != null) {
            i23 = bool3.hashCode();
        } else {
            i23 = 0;
        }
        int i51 = (i50 + i23) * 37;
        String str3 = this.misc_download_addrs;
        if (str3 != null) {
            i24 = str3.hashCode();
        } else {
            i24 = 0;
        }
        int i52 = (i51 + i24) * 37;
        PlayTokenAuthStructV2 playTokenAuthStructV2 = this.token_auth;
        if (playTokenAuthStructV2 != null) {
            i25 = playTokenAuthStructV2.hashCode();
        } else {
            i25 = 0;
        }
        int i53 = (i52 + i25) * 37;
        UrlStructV2 urlStructV213 = this.play_addr_bytevc1;
        if (urlStructV213 != null) {
            i26 = urlStructV213.hashCode();
        } else {
            i26 = 0;
        }
        int i54 = (i53 + i26) * 37;
        Integer num5 = this.is_bytevc1;
        if (num5 != null) {
            i27 = num5.hashCode();
        } else {
            i27 = 0;
        }
        int hashCode3 = (((i54 + i27) * 37) + this.big_thumbs.hashCode()) * 37;
        String str4 = this.meta;
        if (str4 != null) {
            i28 = str4.hashCode();
        } else {
            i28 = 0;
        }
        int i55 = (hashCode3 + i28) * 37;
        ClaStructV2 claStructV2 = this.cla_info;
        if (claStructV2 != null) {
            i30 = claStructV2.hashCode();
        }
        int i56 = i55 + i30;
        this.hashCode = i56;
        return i56;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.play_addr != null) {
            sb.append(", play_addr=").append(this.play_addr);
        }
        if (this.cover != null) {
            sb.append(", cover=").append(this.cover);
        }
        if (this.height != null) {
            sb.append(", height=").append(this.height);
        }
        if (this.width != null) {
            sb.append(", width=").append(this.width);
        }
        if (this.dynamic_cover != null) {
            sb.append(", dynamic_cover=").append(this.dynamic_cover);
        }
        if (this.origin_cover != null) {
            sb.append(", origin_cover=").append(this.origin_cover);
        }
        if (this.ratio != null) {
            sb.append(", ratio=").append(this.ratio);
        }
        if (this.download_addr != null) {
            sb.append(", download_addr=").append(this.download_addr);
        }
        if (this.has_watermark != null) {
            sb.append(", has_watermark=").append(this.has_watermark);
        }
        if (this.play_addr_lowbr != null) {
            sb.append(", play_addr_lowbr=").append(this.play_addr_lowbr);
        }
        if (!this.bit_rate.isEmpty()) {
            sb.append(", bit_rate=").append(this.bit_rate);
        }
        if (this.new_download_addr != null) {
            sb.append(", new_download_addr=").append(this.new_download_addr);
        }
        if (this.duration != null) {
            sb.append(", duration=").append(this.duration);
        }
        if (this.download_suffix_logo_addr != null) {
            sb.append(", download_suffix_logo_addr=").append(this.download_suffix_logo_addr);
        }
        if (this.has_download_suffix_logo_addr != null) {
            sb.append(", has_download_suffix_logo_addr=").append(this.has_download_suffix_logo_addr);
        }
        if (this.play_addr_265 != null) {
            sb.append(", play_addr_265=").append(this.play_addr_265);
        }
        if (this.play_addr_h264 != null) {
            sb.append(", play_addr_h264=").append(this.play_addr_h264);
        }
        if (this.ui_alike_download_addr != null) {
            sb.append(", ui_alike_download_addr=").append(this.ui_alike_download_addr);
        }
        if (this.caption_download_addr != null) {
            sb.append(", caption_download_addr=").append(this.caption_download_addr);
        }
        if (this.cdn_url_expired != null) {
            sb.append(", cdn_url_expired=").append(this.cdn_url_expired);
        }
        if (this.is_long_video != null) {
            sb.append(", is_long_video=").append(this.is_long_video);
        }
        if (this.video_model != null) {
            sb.append(", video_model=").append(this.video_model);
        }
        if (this.need_set_token != null) {
            sb.append(", need_set_token=").append(this.need_set_token);
        }
        if (this.misc_download_addrs != null) {
            sb.append(", misc_download_addrs=").append(this.misc_download_addrs);
        }
        if (this.token_auth != null) {
            sb.append(", token_auth=").append(this.token_auth);
        }
        if (this.play_addr_bytevc1 != null) {
            sb.append(", play_addr_bytevc1=").append(this.play_addr_bytevc1);
        }
        if (this.is_bytevc1 != null) {
            sb.append(", is_bytevc1=").append(this.is_bytevc1);
        }
        if (!this.big_thumbs.isEmpty()) {
            sb.append(", big_thumbs=").append(this.big_thumbs);
        }
        if (this.meta != null) {
            sb.append(", meta=").append(this.meta);
        }
        if (this.cla_info != null) {
            sb.append(", cla_info=").append(this.cla_info);
        }
        return sb.replace(0, 2, "VideoStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoStructV2)) {
            return false;
        }
        VideoStructV2 videoStructV2 = (VideoStructV2) obj;
        if (!unknownFields().equals(videoStructV2.unknownFields()) || !Internal.equals(this.play_addr, videoStructV2.play_addr) || !Internal.equals(this.cover, videoStructV2.cover) || !Internal.equals(this.height, videoStructV2.height) || !Internal.equals(this.width, videoStructV2.width) || !Internal.equals(this.dynamic_cover, videoStructV2.dynamic_cover) || !Internal.equals(this.origin_cover, videoStructV2.origin_cover) || !Internal.equals(this.ratio, videoStructV2.ratio) || !Internal.equals(this.download_addr, videoStructV2.download_addr) || !Internal.equals(this.has_watermark, videoStructV2.has_watermark) || !Internal.equals(this.play_addr_lowbr, videoStructV2.play_addr_lowbr) || !this.bit_rate.equals(videoStructV2.bit_rate) || !Internal.equals(this.new_download_addr, videoStructV2.new_download_addr) || !Internal.equals(this.duration, videoStructV2.duration) || !Internal.equals(this.download_suffix_logo_addr, videoStructV2.download_suffix_logo_addr) || !Internal.equals(this.has_download_suffix_logo_addr, videoStructV2.has_download_suffix_logo_addr) || !Internal.equals(this.play_addr_265, videoStructV2.play_addr_265) || !Internal.equals(this.play_addr_h264, videoStructV2.play_addr_h264) || !Internal.equals(this.ui_alike_download_addr, videoStructV2.ui_alike_download_addr) || !Internal.equals(this.caption_download_addr, videoStructV2.caption_download_addr) || !Internal.equals(this.cdn_url_expired, videoStructV2.cdn_url_expired) || !Internal.equals(this.is_long_video, videoStructV2.is_long_video) || !Internal.equals(this.video_model, videoStructV2.video_model) || !Internal.equals(this.need_set_token, videoStructV2.need_set_token) || !Internal.equals(this.misc_download_addrs, videoStructV2.misc_download_addrs) || !Internal.equals(this.token_auth, videoStructV2.token_auth) || !Internal.equals(this.play_addr_bytevc1, videoStructV2.play_addr_bytevc1) || !Internal.equals(this.is_bytevc1, videoStructV2.is_bytevc1) || !this.big_thumbs.equals(videoStructV2.big_thumbs) || !Internal.equals(this.meta, videoStructV2.meta) || !Internal.equals(this.cla_info, videoStructV2.cla_info)) {
            return false;
        }
        return true;
    }

    public VideoStructV2(UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Integer num, Integer num2, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, String str, UrlStructV2 urlStructV25, Boolean bool, UrlStructV2 urlStructV26, List<BitRateStructV2> list, UrlStructV2 urlStructV27, Integer num3, UrlStructV2 urlStructV28, Boolean bool2, UrlStructV2 urlStructV29, UrlStructV2 urlStructV210, UrlStructV2 urlStructV211, UrlStructV2 urlStructV212, Long l2, Integer num4, String str2, Boolean bool3, String str3, PlayTokenAuthStructV2 playTokenAuthStructV2, UrlStructV2 urlStructV213, Integer num5, List<BigThumbV2> list2, String str4, ClaStructV2 claStructV2) {
        this(urlStructV2, urlStructV22, num, num2, urlStructV23, urlStructV24, str, urlStructV25, bool, urlStructV26, list, urlStructV27, num3, urlStructV28, bool2, urlStructV29, urlStructV210, urlStructV211, urlStructV212, l2, num4, str2, bool3, str3, playTokenAuthStructV2, urlStructV213, num5, list2, str4, claStructV2, i.EMPTY);
    }

    public VideoStructV2(UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, Integer num, Integer num2, UrlStructV2 urlStructV23, UrlStructV2 urlStructV24, String str, UrlStructV2 urlStructV25, Boolean bool, UrlStructV2 urlStructV26, List<BitRateStructV2> list, UrlStructV2 urlStructV27, Integer num3, UrlStructV2 urlStructV28, Boolean bool2, UrlStructV2 urlStructV29, UrlStructV2 urlStructV210, UrlStructV2 urlStructV211, UrlStructV2 urlStructV212, Long l2, Integer num4, String str2, Boolean bool3, String str3, PlayTokenAuthStructV2 playTokenAuthStructV2, UrlStructV2 urlStructV213, Integer num5, List<BigThumbV2> list2, String str4, ClaStructV2 claStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.play_addr = urlStructV2;
        this.cover = urlStructV22;
        this.height = num;
        this.width = num2;
        this.dynamic_cover = urlStructV23;
        this.origin_cover = urlStructV24;
        this.ratio = str;
        this.download_addr = urlStructV25;
        this.has_watermark = bool;
        this.play_addr_lowbr = urlStructV26;
        this.bit_rate = Internal.immutableCopyOf("bit_rate", list);
        this.new_download_addr = urlStructV27;
        this.duration = num3;
        this.download_suffix_logo_addr = urlStructV28;
        this.has_download_suffix_logo_addr = bool2;
        this.play_addr_265 = urlStructV29;
        this.play_addr_h264 = urlStructV210;
        this.ui_alike_download_addr = urlStructV211;
        this.caption_download_addr = urlStructV212;
        this.cdn_url_expired = l2;
        this.is_long_video = num4;
        this.video_model = str2;
        this.need_set_token = bool3;
        this.misc_download_addrs = str3;
        this.token_auth = playTokenAuthStructV2;
        this.play_addr_bytevc1 = urlStructV213;
        this.is_bytevc1 = num5;
        this.big_thumbs = Internal.immutableCopyOf("big_thumbs", list2);
        this.meta = str4;
        this.cla_info = claStructV2;
    }
}
