package com.ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class ShowTimeGapRspInfo extends Message<ShowTimeGapRspInfo, Builder> {
    public static final ProtoAdapter<ShowTimeGapRspInfo> ADAPTER = new ProtoAdapter_ShowTimeGapRspInfo();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String adgap_delta_by_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer downstream_range_end;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public Boolean enable_client_adgap_adjust;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public Boolean enable_fast_browse;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean enable_showtime_gap;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public Integer fast_browse_time_threshold;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public Integer min_gap;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public Integer single_vid_view_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Boolean use_fast_browse_model;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Integer viewed_vid_num;

    public ShowTimeGapRspInfo() {
    }

    static final class ProtoAdapter_ShowTimeGapRspInfo extends ProtoAdapter<ShowTimeGapRspInfo> {
        static {
            Covode.recordClassIndex(102208);
        }

        public ProtoAdapter_ShowTimeGapRspInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, ShowTimeGapRspInfo.class);
        }

        public final int encodedSize(ShowTimeGapRspInfo showTimeGapRspInfo) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, showTimeGapRspInfo.enable_client_adgap_adjust) + ProtoAdapter.BOOL.encodedSizeWithTag(2, showTimeGapRspInfo.enable_fast_browse) + ProtoAdapter.BOOL.encodedSizeWithTag(3, showTimeGapRspInfo.enable_showtime_gap) + ProtoAdapter.INT32.encodedSizeWithTag(4, showTimeGapRspInfo.downstream_range_end) + ProtoAdapter.STRING.encodedSizeWithTag(5, showTimeGapRspInfo.adgap_delta_by_time) + ProtoAdapter.BOOL.encodedSizeWithTag(6, showTimeGapRspInfo.use_fast_browse_model) + ProtoAdapter.INT32.encodedSizeWithTag(7, showTimeGapRspInfo.viewed_vid_num) + ProtoAdapter.INT32.encodedSizeWithTag(8, showTimeGapRspInfo.single_vid_view_time) + ProtoAdapter.INT32.encodedSizeWithTag(9, showTimeGapRspInfo.fast_browse_time_threshold) + ProtoAdapter.INT32.encodedSizeWithTag(10, showTimeGapRspInfo.min_gap) + showTimeGapRspInfo.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ShowTimeGapRspInfo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.enable_client_adgap_adjust(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.enable_fast_browse(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.enable_showtime_gap(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.downstream_range_end(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.adgap_delta_by_time(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.use_fast_browse_model(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.viewed_vid_num(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.single_vid_view_time(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.fast_browse_time_threshold(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.min_gap(ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ShowTimeGapRspInfo showTimeGapRspInfo) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, showTimeGapRspInfo.enable_client_adgap_adjust);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, showTimeGapRspInfo.enable_fast_browse);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, showTimeGapRspInfo.enable_showtime_gap);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, showTimeGapRspInfo.downstream_range_end);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, showTimeGapRspInfo.adgap_delta_by_time);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, showTimeGapRspInfo.use_fast_browse_model);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, showTimeGapRspInfo.viewed_vid_num);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, showTimeGapRspInfo.single_vid_view_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, showTimeGapRspInfo.fast_browse_time_threshold);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, showTimeGapRspInfo.min_gap);
            protoWriter.writeBytes(showTimeGapRspInfo.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102206);
    }

    public static final class Builder extends Message.Builder<ShowTimeGapRspInfo, Builder> {
        public String adgap_delta_by_time;
        public Integer downstream_range_end;
        public Boolean enable_client_adgap_adjust;
        public Boolean enable_fast_browse;
        public Boolean enable_showtime_gap;
        public Integer fast_browse_time_threshold;
        public Integer min_gap;
        public Integer single_vid_view_time;
        public Boolean use_fast_browse_model;
        public Integer viewed_vid_num;

        static {
            Covode.recordClassIndex(102207);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ShowTimeGapRspInfo build() {
            return new ShowTimeGapRspInfo(this.enable_client_adgap_adjust, this.enable_fast_browse, this.enable_showtime_gap, this.downstream_range_end, this.adgap_delta_by_time, this.use_fast_browse_model, this.viewed_vid_num, this.single_vid_view_time, this.fast_browse_time_threshold, this.min_gap, super.buildUnknownFields());
        }

        public final Builder adgap_delta_by_time(String str) {
            this.adgap_delta_by_time = str;
            return this;
        }

        public final Builder downstream_range_end(Integer num) {
            this.downstream_range_end = num;
            return this;
        }

        public final Builder enable_client_adgap_adjust(Boolean bool) {
            this.enable_client_adgap_adjust = bool;
            return this;
        }

        public final Builder enable_fast_browse(Boolean bool) {
            this.enable_fast_browse = bool;
            return this;
        }

        public final Builder enable_showtime_gap(Boolean bool) {
            this.enable_showtime_gap = bool;
            return this;
        }

        public final Builder fast_browse_time_threshold(Integer num) {
            this.fast_browse_time_threshold = num;
            return this;
        }

        public final Builder min_gap(Integer num) {
            this.min_gap = num;
            return this;
        }

        public final Builder single_vid_view_time(Integer num) {
            this.single_vid_view_time = num;
            return this;
        }

        public final Builder use_fast_browse_model(Boolean bool) {
            this.use_fast_browse_model = bool;
            return this;
        }

        public final Builder viewed_vid_num(Integer num) {
            this.viewed_vid_num = num;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.ShowTimeGapRspInfo$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ShowTimeGapRspInfo, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.enable_client_adgap_adjust = this.enable_client_adgap_adjust;
        builder.enable_fast_browse = this.enable_fast_browse;
        builder.enable_showtime_gap = this.enable_showtime_gap;
        builder.downstream_range_end = this.downstream_range_end;
        builder.adgap_delta_by_time = this.adgap_delta_by_time;
        builder.use_fast_browse_model = this.use_fast_browse_model;
        builder.viewed_vid_num = this.viewed_vid_num;
        builder.single_vid_view_time = this.single_vid_view_time;
        builder.fast_browse_time_threshold = this.fast_browse_time_threshold;
        builder.min_gap = this.min_gap;
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
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.enable_client_adgap_adjust;
        int i12 = 0;
        if (bool != null) {
            i2 = bool.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (hashCode + i2) * 37;
        Boolean bool2 = this.enable_fast_browse;
        if (bool2 != null) {
            i3 = bool2.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 37;
        Boolean bool3 = this.enable_showtime_gap;
        if (bool3 != null) {
            i4 = bool3.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 37;
        Integer num = this.downstream_range_end;
        if (num != null) {
            i5 = num.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 37;
        String str = this.adgap_delta_by_time;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 37;
        Boolean bool4 = this.use_fast_browse_model;
        if (bool4 != null) {
            i7 = bool4.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 37;
        Integer num2 = this.viewed_vid_num;
        if (num2 != null) {
            i8 = num2.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 37;
        Integer num3 = this.single_vid_view_time;
        if (num3 != null) {
            i9 = num3.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 37;
        Integer num4 = this.fast_browse_time_threshold;
        if (num4 != null) {
            i10 = num4.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = (i20 + i10) * 37;
        Integer num5 = this.min_gap;
        if (num5 != null) {
            i12 = num5.hashCode();
        }
        int i22 = i21 + i12;
        this.hashCode = i22;
        return i22;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.enable_client_adgap_adjust != null) {
            sb.append(", enable_client_adgap_adjust=").append(this.enable_client_adgap_adjust);
        }
        if (this.enable_fast_browse != null) {
            sb.append(", enable_fast_browse=").append(this.enable_fast_browse);
        }
        if (this.enable_showtime_gap != null) {
            sb.append(", enable_showtime_gap=").append(this.enable_showtime_gap);
        }
        if (this.downstream_range_end != null) {
            sb.append(", downstream_range_end=").append(this.downstream_range_end);
        }
        if (this.adgap_delta_by_time != null) {
            sb.append(", adgap_delta_by_time=").append(this.adgap_delta_by_time);
        }
        if (this.use_fast_browse_model != null) {
            sb.append(", use_fast_browse_model=").append(this.use_fast_browse_model);
        }
        if (this.viewed_vid_num != null) {
            sb.append(", viewed_vid_num=").append(this.viewed_vid_num);
        }
        if (this.single_vid_view_time != null) {
            sb.append(", single_vid_view_time=").append(this.single_vid_view_time);
        }
        if (this.fast_browse_time_threshold != null) {
            sb.append(", fast_browse_time_threshold=").append(this.fast_browse_time_threshold);
        }
        if (this.min_gap != null) {
            sb.append(", min_gap=").append(this.min_gap);
        }
        return sb.replace(0, 2, "ShowTimeGapRspInfo{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShowTimeGapRspInfo)) {
            return false;
        }
        ShowTimeGapRspInfo showTimeGapRspInfo = (ShowTimeGapRspInfo) obj;
        if (!unknownFields().equals(showTimeGapRspInfo.unknownFields()) || !Internal.equals(this.enable_client_adgap_adjust, showTimeGapRspInfo.enable_client_adgap_adjust) || !Internal.equals(this.enable_fast_browse, showTimeGapRspInfo.enable_fast_browse) || !Internal.equals(this.enable_showtime_gap, showTimeGapRspInfo.enable_showtime_gap) || !Internal.equals(this.downstream_range_end, showTimeGapRspInfo.downstream_range_end) || !Internal.equals(this.adgap_delta_by_time, showTimeGapRspInfo.adgap_delta_by_time) || !Internal.equals(this.use_fast_browse_model, showTimeGapRspInfo.use_fast_browse_model) || !Internal.equals(this.viewed_vid_num, showTimeGapRspInfo.viewed_vid_num) || !Internal.equals(this.single_vid_view_time, showTimeGapRspInfo.single_vid_view_time) || !Internal.equals(this.fast_browse_time_threshold, showTimeGapRspInfo.fast_browse_time_threshold) || !Internal.equals(this.min_gap, showTimeGapRspInfo.min_gap)) {
            return false;
        }
        return true;
    }

    public ShowTimeGapRspInfo(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, Boolean bool4, Integer num2, Integer num3, Integer num4, Integer num5) {
        this(bool, bool2, bool3, num, str, bool4, num2, num3, num4, num5, i.EMPTY);
    }

    public ShowTimeGapRspInfo(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, Boolean bool4, Integer num2, Integer num3, Integer num4, Integer num5, i iVar) {
        super(ADAPTER, iVar);
        this.enable_client_adgap_adjust = bool;
        this.enable_fast_browse = bool2;
        this.enable_showtime_gap = bool3;
        this.downstream_range_end = num;
        this.adgap_delta_by_time = str;
        this.use_fast_browse_model = bool4;
        this.viewed_vid_num = num2;
        this.single_vid_view_time = num3;
        this.fast_browse_time_threshold = num4;
        this.min_gap = num5;
    }
}
