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

public final class aweme_v2_feed_response extends Message<aweme_v2_feed_response, Builder> {
    public static final ProtoAdapter<aweme_v2_feed_response> ADAPTER = new ProtoAdapter_aweme_v2_feed_response();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public String DebugInfo;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public List<AwemeStructV2> aweme_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 15)
    public Integer block_code;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = LiveRechargeAgeThresholdSetting.DEFAULT)
    public Boolean disable_adjust_for_cache;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 17)
    public Boolean enable_re_rank;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ExtraStructV2#ADAPTER", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public ExtraStructV2 extra;
    @WireField(adapter = "com.ss.ugc.aweme.proto.GuideWordV2#ADAPTER", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public GuideWordV2 guide_word;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = v.U)
    public Boolean has_ad;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer has_more;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Integer home_model;
    @WireField(adapter = "com.ss.ugc.aweme.proto.LogPbStructV2#ADAPTER", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public LogPbStructV2 log_pb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long max_cursor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long min_cursor;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = ABRConfig.ABR_STARTUP_MAX_BITRATE)
    public List<AwemeStructV2> preload_ads;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AwemeStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = 16)
    public List<AwemeStructV2> preload_awemes;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public Integer refresh_clear;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public String rid;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ShowTimeGapRspInfo#ADAPTER", tag = 19)
    public ShowTimeGapRspInfo showtime_gap_rsp_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer status_code;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_SELECT_SCENE)
    public String status_msg;

    public aweme_v2_feed_response() {
    }

    static final class ProtoAdapter_aweme_v2_feed_response extends ProtoAdapter<aweme_v2_feed_response> {
        static {
            Covode.recordClassIndex(102301);
        }

        public ProtoAdapter_aweme_v2_feed_response() {
            super(FieldEncoding.LENGTH_DELIMITED, aweme_v2_feed_response.class);
        }

        public final int encodedSize(aweme_v2_feed_response aweme_v2_feed_response) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, aweme_v2_feed_response.status_code) + ProtoAdapter.INT64.encodedSizeWithTag(2, aweme_v2_feed_response.min_cursor) + ProtoAdapter.INT64.encodedSizeWithTag(3, aweme_v2_feed_response.max_cursor) + ProtoAdapter.INT32.encodedSizeWithTag(4, aweme_v2_feed_response.has_more) + AwemeStructV2.ADAPTER.asRepeated().encodedSizeWithTag(5, aweme_v2_feed_response.aweme_list) + ProtoAdapter.STRING.encodedSizeWithTag(6, aweme_v2_feed_response.rid) + ProtoAdapter.INT32.encodedSizeWithTag(7, aweme_v2_feed_response.home_model) + ProtoAdapter.INT32.encodedSizeWithTag(8, aweme_v2_feed_response.refresh_clear) + ExtraStructV2.ADAPTER.encodedSizeWithTag(9, aweme_v2_feed_response.extra) + LogPbStructV2.ADAPTER.encodedSizeWithTag(10, aweme_v2_feed_response.log_pb) + ProtoAdapter.STRING.encodedSizeWithTag(11, aweme_v2_feed_response.DebugInfo) + GuideWordV2.ADAPTER.encodedSizeWithTag(12, aweme_v2_feed_response.guide_word) + AwemeStructV2.ADAPTER.asRepeated().encodedSizeWithTag(13, aweme_v2_feed_response.preload_ads) + ProtoAdapter.STRING.encodedSizeWithTag(14, aweme_v2_feed_response.status_msg) + ProtoAdapter.INT32.encodedSizeWithTag(15, aweme_v2_feed_response.block_code) + AwemeStructV2.ADAPTER.asRepeated().encodedSizeWithTag(16, aweme_v2_feed_response.preload_awemes) + ProtoAdapter.BOOL.encodedSizeWithTag(17, aweme_v2_feed_response.enable_re_rank) + ProtoAdapter.BOOL.encodedSizeWithTag(18, aweme_v2_feed_response.disable_adjust_for_cache) + ShowTimeGapRspInfo.ADAPTER.encodedSizeWithTag(19, aweme_v2_feed_response.showtime_gap_rsp_info) + ProtoAdapter.BOOL.encodedSizeWithTag(20, aweme_v2_feed_response.has_ad) + aweme_v2_feed_response.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final aweme_v2_feed_response decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.status_code(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.min_cursor(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.max_cursor(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.has_more(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.aweme_list.add(AwemeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.rid(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.home_model(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.refresh_clear(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.extra(ExtraStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.log_pb(LogPbStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.DebugInfo(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.guide_word(GuideWordV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            builder.preload_ads.add(AwemeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            builder.status_msg(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            builder.block_code(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 16:
                            builder.preload_awemes.add(AwemeStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 17:
                            builder.enable_re_rank(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            builder.disable_adjust_for_cache(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 19:
                            builder.showtime_gap_rsp_info(ShowTimeGapRspInfo.ADAPTER.decode(protoReader));
                            break;
                        case v.U:
                            builder.has_ad(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, aweme_v2_feed_response aweme_v2_feed_response) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, aweme_v2_feed_response.status_code);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, aweme_v2_feed_response.min_cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, aweme_v2_feed_response.max_cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, aweme_v2_feed_response.has_more);
            AwemeStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, aweme_v2_feed_response.aweme_list);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, aweme_v2_feed_response.rid);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, aweme_v2_feed_response.home_model);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, aweme_v2_feed_response.refresh_clear);
            ExtraStructV2.ADAPTER.encodeWithTag(protoWriter, 9, aweme_v2_feed_response.extra);
            LogPbStructV2.ADAPTER.encodeWithTag(protoWriter, 10, aweme_v2_feed_response.log_pb);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, aweme_v2_feed_response.DebugInfo);
            GuideWordV2.ADAPTER.encodeWithTag(protoWriter, 12, aweme_v2_feed_response.guide_word);
            AwemeStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 13, aweme_v2_feed_response.preload_ads);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, aweme_v2_feed_response.status_msg);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, aweme_v2_feed_response.block_code);
            AwemeStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 16, aweme_v2_feed_response.preload_awemes);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 17, aweme_v2_feed_response.enable_re_rank);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, aweme_v2_feed_response.disable_adjust_for_cache);
            ShowTimeGapRspInfo.ADAPTER.encodeWithTag(protoWriter, 19, aweme_v2_feed_response.showtime_gap_rsp_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, aweme_v2_feed_response.has_ad);
            protoWriter.writeBytes(aweme_v2_feed_response.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102299);
    }

    public static final class Builder extends Message.Builder<aweme_v2_feed_response, Builder> {
        public String DebugInfo;
        public List<AwemeStructV2> aweme_list = Internal.newMutableList();
        public Integer block_code;
        public Boolean disable_adjust_for_cache;
        public Boolean enable_re_rank;
        public ExtraStructV2 extra;
        public GuideWordV2 guide_word;
        public Boolean has_ad;
        public Integer has_more;
        public Integer home_model;
        public LogPbStructV2 log_pb;
        public Long max_cursor;
        public Long min_cursor;
        public List<AwemeStructV2> preload_ads = Internal.newMutableList();
        public List<AwemeStructV2> preload_awemes = Internal.newMutableList();
        public Integer refresh_clear;
        public String rid;
        public ShowTimeGapRspInfo showtime_gap_rsp_info;
        public Integer status_code;
        public String status_msg;

        static {
            Covode.recordClassIndex(102300);
        }

        @Override // com.squareup.wire.Message.Builder
        public final aweme_v2_feed_response build() {
            return new aweme_v2_feed_response(this.status_code, this.min_cursor, this.max_cursor, this.has_more, this.aweme_list, this.rid, this.home_model, this.refresh_clear, this.extra, this.log_pb, this.DebugInfo, this.guide_word, this.preload_ads, this.status_msg, this.block_code, this.preload_awemes, this.enable_re_rank, this.disable_adjust_for_cache, this.showtime_gap_rsp_info, this.has_ad, super.buildUnknownFields());
        }

        public final Builder DebugInfo(String str) {
            this.DebugInfo = str;
            return this;
        }

        public final Builder block_code(Integer num) {
            this.block_code = num;
            return this;
        }

        public final Builder disable_adjust_for_cache(Boolean bool) {
            this.disable_adjust_for_cache = bool;
            return this;
        }

        public final Builder enable_re_rank(Boolean bool) {
            this.enable_re_rank = bool;
            return this;
        }

        public final Builder extra(ExtraStructV2 extraStructV2) {
            this.extra = extraStructV2;
            return this;
        }

        public final Builder guide_word(GuideWordV2 guideWordV2) {
            this.guide_word = guideWordV2;
            return this;
        }

        public final Builder has_ad(Boolean bool) {
            this.has_ad = bool;
            return this;
        }

        public final Builder has_more(Integer num) {
            this.has_more = num;
            return this;
        }

        public final Builder home_model(Integer num) {
            this.home_model = num;
            return this;
        }

        public final Builder log_pb(LogPbStructV2 logPbStructV2) {
            this.log_pb = logPbStructV2;
            return this;
        }

        public final Builder max_cursor(Long l2) {
            this.max_cursor = l2;
            return this;
        }

        public final Builder min_cursor(Long l2) {
            this.min_cursor = l2;
            return this;
        }

        public final Builder refresh_clear(Integer num) {
            this.refresh_clear = num;
            return this;
        }

        public final Builder rid(String str) {
            this.rid = str;
            return this;
        }

        public final Builder showtime_gap_rsp_info(ShowTimeGapRspInfo showTimeGapRspInfo) {
            this.showtime_gap_rsp_info = showTimeGapRspInfo;
            return this;
        }

        public final Builder status_code(Integer num) {
            this.status_code = num;
            return this;
        }

        public final Builder status_msg(String str) {
            this.status_msg = str;
            return this;
        }

        public final Builder aweme_list(List<AwemeStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.aweme_list = list;
            return this;
        }

        public final Builder preload_ads(List<AwemeStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.preload_ads = list;
            return this;
        }

        public final Builder preload_awemes(List<AwemeStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.preload_awemes = list;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.aweme_v2_feed_response$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<aweme_v2_feed_response, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.status_code = this.status_code;
        builder.min_cursor = this.min_cursor;
        builder.max_cursor = this.max_cursor;
        builder.has_more = this.has_more;
        builder.aweme_list = Internal.copyOf("aweme_list", this.aweme_list);
        builder.rid = this.rid;
        builder.home_model = this.home_model;
        builder.refresh_clear = this.refresh_clear;
        builder.extra = this.extra;
        builder.log_pb = this.log_pb;
        builder.DebugInfo = this.DebugInfo;
        builder.guide_word = this.guide_word;
        builder.preload_ads = Internal.copyOf("preload_ads", this.preload_ads);
        builder.status_msg = this.status_msg;
        builder.block_code = this.block_code;
        builder.preload_awemes = Internal.copyOf("preload_awemes", this.preload_awemes);
        builder.enable_re_rank = this.enable_re_rank;
        builder.disable_adjust_for_cache = this.disable_adjust_for_cache;
        builder.showtime_gap_rsp_info = this.showtime_gap_rsp_info;
        builder.has_ad = this.has_ad;
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
        int i18 = this.hashCode;
        if (i18 != 0) {
            return i18;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.status_code;
        int i19 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i20 = (hashCode + i2) * 37;
        Long l2 = this.min_cursor;
        if (l2 != null) {
            i3 = l2.hashCode();
        } else {
            i3 = 0;
        }
        int i21 = (i20 + i3) * 37;
        Long l3 = this.max_cursor;
        if (l3 != null) {
            i4 = l3.hashCode();
        } else {
            i4 = 0;
        }
        int i22 = (i21 + i4) * 37;
        Integer num2 = this.has_more;
        if (num2 != null) {
            i5 = num2.hashCode();
        } else {
            i5 = 0;
        }
        int hashCode2 = (((i22 + i5) * 37) + this.aweme_list.hashCode()) * 37;
        String str = this.rid;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i23 = (hashCode2 + i6) * 37;
        Integer num3 = this.home_model;
        if (num3 != null) {
            i7 = num3.hashCode();
        } else {
            i7 = 0;
        }
        int i24 = (i23 + i7) * 37;
        Integer num4 = this.refresh_clear;
        if (num4 != null) {
            i8 = num4.hashCode();
        } else {
            i8 = 0;
        }
        int i25 = (i24 + i8) * 37;
        ExtraStructV2 extraStructV2 = this.extra;
        if (extraStructV2 != null) {
            i9 = extraStructV2.hashCode();
        } else {
            i9 = 0;
        }
        int i26 = (i25 + i9) * 37;
        LogPbStructV2 logPbStructV2 = this.log_pb;
        if (logPbStructV2 != null) {
            i10 = logPbStructV2.hashCode();
        } else {
            i10 = 0;
        }
        int i27 = (i26 + i10) * 37;
        String str2 = this.DebugInfo;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i28 = (i27 + i11) * 37;
        GuideWordV2 guideWordV2 = this.guide_word;
        if (guideWordV2 != null) {
            i12 = guideWordV2.hashCode();
        } else {
            i12 = 0;
        }
        int hashCode3 = (((i28 + i12) * 37) + this.preload_ads.hashCode()) * 37;
        String str3 = this.status_msg;
        if (str3 != null) {
            i13 = str3.hashCode();
        } else {
            i13 = 0;
        }
        int i29 = (hashCode3 + i13) * 37;
        Integer num5 = this.block_code;
        if (num5 != null) {
            i14 = num5.hashCode();
        } else {
            i14 = 0;
        }
        int hashCode4 = (((i29 + i14) * 37) + this.preload_awemes.hashCode()) * 37;
        Boolean bool = this.enable_re_rank;
        if (bool != null) {
            i15 = bool.hashCode();
        } else {
            i15 = 0;
        }
        int i30 = (hashCode4 + i15) * 37;
        Boolean bool2 = this.disable_adjust_for_cache;
        if (bool2 != null) {
            i16 = bool2.hashCode();
        } else {
            i16 = 0;
        }
        int i31 = (i30 + i16) * 37;
        ShowTimeGapRspInfo showTimeGapRspInfo = this.showtime_gap_rsp_info;
        if (showTimeGapRspInfo != null) {
            i17 = showTimeGapRspInfo.hashCode();
        } else {
            i17 = 0;
        }
        int i32 = (i31 + i17) * 37;
        Boolean bool3 = this.has_ad;
        if (bool3 != null) {
            i19 = bool3.hashCode();
        }
        int i33 = i32 + i19;
        this.hashCode = i33;
        return i33;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.status_code != null) {
            sb.append(", status_code=").append(this.status_code);
        }
        if (this.min_cursor != null) {
            sb.append(", min_cursor=").append(this.min_cursor);
        }
        if (this.max_cursor != null) {
            sb.append(", max_cursor=").append(this.max_cursor);
        }
        if (this.has_more != null) {
            sb.append(", has_more=").append(this.has_more);
        }
        if (!this.aweme_list.isEmpty()) {
            sb.append(", aweme_list=").append(this.aweme_list);
        }
        if (this.rid != null) {
            sb.append(", rid=").append(this.rid);
        }
        if (this.home_model != null) {
            sb.append(", home_model=").append(this.home_model);
        }
        if (this.refresh_clear != null) {
            sb.append(", refresh_clear=").append(this.refresh_clear);
        }
        if (this.extra != null) {
            sb.append(", extra=").append(this.extra);
        }
        if (this.log_pb != null) {
            sb.append(", log_pb=").append(this.log_pb);
        }
        if (this.DebugInfo != null) {
            sb.append(", DebugInfo=").append(this.DebugInfo);
        }
        if (this.guide_word != null) {
            sb.append(", guide_word=").append(this.guide_word);
        }
        if (!this.preload_ads.isEmpty()) {
            sb.append(", preload_ads=").append(this.preload_ads);
        }
        if (this.status_msg != null) {
            sb.append(", status_msg=").append(this.status_msg);
        }
        if (this.block_code != null) {
            sb.append(", block_code=").append(this.block_code);
        }
        if (!this.preload_awemes.isEmpty()) {
            sb.append(", preload_awemes=").append(this.preload_awemes);
        }
        if (this.enable_re_rank != null) {
            sb.append(", enable_re_rank=").append(this.enable_re_rank);
        }
        if (this.disable_adjust_for_cache != null) {
            sb.append(", disable_adjust_for_cache=").append(this.disable_adjust_for_cache);
        }
        if (this.showtime_gap_rsp_info != null) {
            sb.append(", showtime_gap_rsp_info=").append(this.showtime_gap_rsp_info);
        }
        if (this.has_ad != null) {
            sb.append(", has_ad=").append(this.has_ad);
        }
        return sb.replace(0, 2, "aweme_v2_feed_response{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aweme_v2_feed_response)) {
            return false;
        }
        aweme_v2_feed_response aweme_v2_feed_response = (aweme_v2_feed_response) obj;
        if (!unknownFields().equals(aweme_v2_feed_response.unknownFields()) || !Internal.equals(this.status_code, aweme_v2_feed_response.status_code) || !Internal.equals(this.min_cursor, aweme_v2_feed_response.min_cursor) || !Internal.equals(this.max_cursor, aweme_v2_feed_response.max_cursor) || !Internal.equals(this.has_more, aweme_v2_feed_response.has_more) || !this.aweme_list.equals(aweme_v2_feed_response.aweme_list) || !Internal.equals(this.rid, aweme_v2_feed_response.rid) || !Internal.equals(this.home_model, aweme_v2_feed_response.home_model) || !Internal.equals(this.refresh_clear, aweme_v2_feed_response.refresh_clear) || !Internal.equals(this.extra, aweme_v2_feed_response.extra) || !Internal.equals(this.log_pb, aweme_v2_feed_response.log_pb) || !Internal.equals(this.DebugInfo, aweme_v2_feed_response.DebugInfo) || !Internal.equals(this.guide_word, aweme_v2_feed_response.guide_word) || !this.preload_ads.equals(aweme_v2_feed_response.preload_ads) || !Internal.equals(this.status_msg, aweme_v2_feed_response.status_msg) || !Internal.equals(this.block_code, aweme_v2_feed_response.block_code) || !this.preload_awemes.equals(aweme_v2_feed_response.preload_awemes) || !Internal.equals(this.enable_re_rank, aweme_v2_feed_response.enable_re_rank) || !Internal.equals(this.disable_adjust_for_cache, aweme_v2_feed_response.disable_adjust_for_cache) || !Internal.equals(this.showtime_gap_rsp_info, aweme_v2_feed_response.showtime_gap_rsp_info) || !Internal.equals(this.has_ad, aweme_v2_feed_response.has_ad)) {
            return false;
        }
        return true;
    }

    public aweme_v2_feed_response(Integer num, Long l2, Long l3, Integer num2, List<AwemeStructV2> list, String str, Integer num3, Integer num4, ExtraStructV2 extraStructV2, LogPbStructV2 logPbStructV2, String str2, GuideWordV2 guideWordV2, List<AwemeStructV2> list2, String str3, Integer num5, List<AwemeStructV2> list3, Boolean bool, Boolean bool2, ShowTimeGapRspInfo showTimeGapRspInfo, Boolean bool3) {
        this(num, l2, l3, num2, list, str, num3, num4, extraStructV2, logPbStructV2, str2, guideWordV2, list2, str3, num5, list3, bool, bool2, showTimeGapRspInfo, bool3, i.EMPTY);
    }

    public aweme_v2_feed_response(Integer num, Long l2, Long l3, Integer num2, List<AwemeStructV2> list, String str, Integer num3, Integer num4, ExtraStructV2 extraStructV2, LogPbStructV2 logPbStructV2, String str2, GuideWordV2 guideWordV2, List<AwemeStructV2> list2, String str3, Integer num5, List<AwemeStructV2> list3, Boolean bool, Boolean bool2, ShowTimeGapRspInfo showTimeGapRspInfo, Boolean bool3, i iVar) {
        super(ADAPTER, iVar);
        this.status_code = num;
        this.min_cursor = l2;
        this.max_cursor = l3;
        this.has_more = num2;
        this.aweme_list = Internal.immutableCopyOf("aweme_list", list);
        this.rid = str;
        this.home_model = num3;
        this.refresh_clear = num4;
        this.extra = extraStructV2;
        this.log_pb = logPbStructV2;
        this.DebugInfo = str2;
        this.guide_word = guideWordV2;
        this.preload_ads = Internal.immutableCopyOf("preload_ads", list2);
        this.status_msg = str3;
        this.block_code = num5;
        this.preload_awemes = Internal.immutableCopyOf("preload_awemes", list3);
        this.enable_re_rank = bool;
        this.disable_adjust_for_cache = bool2;
        this.showtime_gap_rsp_info = showTimeGapRspInfo;
        this.has_ad = bool3;
    }
}
