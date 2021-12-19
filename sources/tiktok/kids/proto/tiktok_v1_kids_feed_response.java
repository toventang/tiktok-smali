package tiktok.kids.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.List;
import k.i;

public final class tiktok_v1_kids_feed_response extends Message<tiktok_v1_kids_feed_response, Builder> {
    public static final ProtoAdapter<tiktok_v1_kids_feed_response> ADAPTER = new ProtoAdapter_tiktok_v1_kids_feed_response();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public String DebugInfo;
    @WireField(adapter = "tiktok.kids.proto.AwemeStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public List<AwemeStructV2> aweme_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY)
    public Integer block_code;
    @WireField(adapter = "tiktok.kids.proto.ExtraStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public ExtraStructV2 extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer has_more;
    @WireField(adapter = "tiktok.kids.proto.LogPbStructV2#ADAPTER", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public LogPbStructV2 log_pb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long max_cursor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long min_cursor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Integer refresh_clear;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public String rid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer status_code;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_DEFAULT_WIFI_BITRATE)
    public String status_msg;

    public tiktok_v1_kids_feed_response() {
    }

    static final class ProtoAdapter_tiktok_v1_kids_feed_response extends ProtoAdapter<tiktok_v1_kids_feed_response> {
        static {
            Covode.recordClassIndex(106770);
        }

        public ProtoAdapter_tiktok_v1_kids_feed_response() {
            super(FieldEncoding.LENGTH_DELIMITED, tiktok_v1_kids_feed_response.class);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final tiktok_v1_kids_feed_response decode(ProtoReader protoReader) {
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
                            builder.refresh_clear(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.extra(ExtraStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.log_pb(LogPbStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.DebugInfo(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            builder.block_code(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            builder.status_msg(ProtoAdapter.STRING.decode(protoReader));
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

        public final int encodedSize(tiktok_v1_kids_feed_response tiktok_v1_kids_feed_response) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, tiktok_v1_kids_feed_response.status_code) + ProtoAdapter.INT64.encodedSizeWithTag(2, tiktok_v1_kids_feed_response.min_cursor) + ProtoAdapter.INT64.encodedSizeWithTag(3, tiktok_v1_kids_feed_response.max_cursor) + ProtoAdapter.INT32.encodedSizeWithTag(4, tiktok_v1_kids_feed_response.has_more) + AwemeStructV2.ADAPTER.asRepeated().encodedSizeWithTag(5, tiktok_v1_kids_feed_response.aweme_list) + ProtoAdapter.STRING.encodedSizeWithTag(6, tiktok_v1_kids_feed_response.rid) + ProtoAdapter.INT32.encodedSizeWithTag(7, tiktok_v1_kids_feed_response.refresh_clear) + ExtraStructV2.ADAPTER.encodedSizeWithTag(8, tiktok_v1_kids_feed_response.extra) + LogPbStructV2.ADAPTER.encodedSizeWithTag(9, tiktok_v1_kids_feed_response.log_pb) + ProtoAdapter.STRING.encodedSizeWithTag(10, tiktok_v1_kids_feed_response.DebugInfo) + ProtoAdapter.INT32.encodedSizeWithTag(11, tiktok_v1_kids_feed_response.block_code) + ProtoAdapter.STRING.encodedSizeWithTag(12, tiktok_v1_kids_feed_response.status_msg) + tiktok_v1_kids_feed_response.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, tiktok_v1_kids_feed_response tiktok_v1_kids_feed_response) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, tiktok_v1_kids_feed_response.status_code);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, tiktok_v1_kids_feed_response.min_cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, tiktok_v1_kids_feed_response.max_cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, tiktok_v1_kids_feed_response.has_more);
            AwemeStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, tiktok_v1_kids_feed_response.aweme_list);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, tiktok_v1_kids_feed_response.rid);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, tiktok_v1_kids_feed_response.refresh_clear);
            ExtraStructV2.ADAPTER.encodeWithTag(protoWriter, 8, tiktok_v1_kids_feed_response.extra);
            LogPbStructV2.ADAPTER.encodeWithTag(protoWriter, 9, tiktok_v1_kids_feed_response.log_pb);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, tiktok_v1_kids_feed_response.DebugInfo);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, tiktok_v1_kids_feed_response.block_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, tiktok_v1_kids_feed_response.status_msg);
            protoWriter.writeBytes(tiktok_v1_kids_feed_response.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(106768);
    }

    public static final class Builder extends Message.Builder<tiktok_v1_kids_feed_response, Builder> {
        public String DebugInfo;
        public List<AwemeStructV2> aweme_list = Internal.newMutableList();
        public Integer block_code;
        public ExtraStructV2 extra;
        public Integer has_more;
        public LogPbStructV2 log_pb;
        public Long max_cursor;
        public Long min_cursor;
        public Integer refresh_clear;
        public String rid;
        public Integer status_code;
        public String status_msg;

        static {
            Covode.recordClassIndex(106769);
        }

        @Override // com.squareup.wire.Message.Builder
        public final tiktok_v1_kids_feed_response build() {
            return new tiktok_v1_kids_feed_response(this.status_code, this.min_cursor, this.max_cursor, this.has_more, this.aweme_list, this.rid, this.refresh_clear, this.extra, this.log_pb, this.DebugInfo, this.block_code, this.status_msg, super.buildUnknownFields());
        }

        public final Builder DebugInfo(String str) {
            this.DebugInfo = str;
            return this;
        }

        public final Builder block_code(Integer num) {
            this.block_code = num;
            return this;
        }

        public final Builder extra(ExtraStructV2 extraStructV2) {
            this.extra = extraStructV2;
            return this;
        }

        public final Builder has_more(Integer num) {
            this.has_more = num;
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
    }

    /* Return type fixed from 'tiktok.kids.proto.tiktok_v1_kids_feed_response$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<tiktok_v1_kids_feed_response, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.status_code = this.status_code;
        builder.min_cursor = this.min_cursor;
        builder.max_cursor = this.max_cursor;
        builder.has_more = this.has_more;
        builder.aweme_list = Internal.copyOf("aweme_list", this.aweme_list);
        builder.rid = this.rid;
        builder.refresh_clear = this.refresh_clear;
        builder.extra = this.extra;
        builder.log_pb = this.log_pb;
        builder.DebugInfo = this.DebugInfo;
        builder.block_code = this.block_code;
        builder.status_msg = this.status_msg;
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
        int i12 = this.hashCode;
        if (i12 != 0) {
            return i12;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.status_code;
        int i13 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = (hashCode + i2) * 37;
        Long l2 = this.min_cursor;
        if (l2 != null) {
            i3 = l2.hashCode();
        } else {
            i3 = 0;
        }
        int i15 = (i14 + i3) * 37;
        Long l3 = this.max_cursor;
        if (l3 != null) {
            i4 = l3.hashCode();
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 37;
        Integer num2 = this.has_more;
        if (num2 != null) {
            i5 = num2.hashCode();
        } else {
            i5 = 0;
        }
        int hashCode2 = (((i16 + i5) * 37) + this.aweme_list.hashCode()) * 37;
        String str = this.rid;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (hashCode2 + i6) * 37;
        Integer num3 = this.refresh_clear;
        if (num3 != null) {
            i7 = num3.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 37;
        ExtraStructV2 extraStructV2 = this.extra;
        if (extraStructV2 != null) {
            i8 = extraStructV2.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 37;
        LogPbStructV2 logPbStructV2 = this.log_pb;
        if (logPbStructV2 != null) {
            i9 = logPbStructV2.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 37;
        String str2 = this.DebugInfo;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = (i20 + i10) * 37;
        Integer num4 = this.block_code;
        if (num4 != null) {
            i11 = num4.hashCode();
        } else {
            i11 = 0;
        }
        int i22 = (i21 + i11) * 37;
        String str3 = this.status_msg;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        int i23 = i22 + i13;
        this.hashCode = i23;
        return i23;
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
        if (this.block_code != null) {
            sb.append(", block_code=").append(this.block_code);
        }
        if (this.status_msg != null) {
            sb.append(", status_msg=").append(this.status_msg);
        }
        return sb.replace(0, 2, "tiktok_v1_kids_feed_response{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tiktok_v1_kids_feed_response)) {
            return false;
        }
        tiktok_v1_kids_feed_response tiktok_v1_kids_feed_response = (tiktok_v1_kids_feed_response) obj;
        if (!unknownFields().equals(tiktok_v1_kids_feed_response.unknownFields()) || !Internal.equals(this.status_code, tiktok_v1_kids_feed_response.status_code) || !Internal.equals(this.min_cursor, tiktok_v1_kids_feed_response.min_cursor) || !Internal.equals(this.max_cursor, tiktok_v1_kids_feed_response.max_cursor) || !Internal.equals(this.has_more, tiktok_v1_kids_feed_response.has_more) || !this.aweme_list.equals(tiktok_v1_kids_feed_response.aweme_list) || !Internal.equals(this.rid, tiktok_v1_kids_feed_response.rid) || !Internal.equals(this.refresh_clear, tiktok_v1_kids_feed_response.refresh_clear) || !Internal.equals(this.extra, tiktok_v1_kids_feed_response.extra) || !Internal.equals(this.log_pb, tiktok_v1_kids_feed_response.log_pb) || !Internal.equals(this.DebugInfo, tiktok_v1_kids_feed_response.DebugInfo) || !Internal.equals(this.block_code, tiktok_v1_kids_feed_response.block_code) || !Internal.equals(this.status_msg, tiktok_v1_kids_feed_response.status_msg)) {
            return false;
        }
        return true;
    }

    public tiktok_v1_kids_feed_response(Integer num, Long l2, Long l3, Integer num2, List<AwemeStructV2> list, String str, Integer num3, ExtraStructV2 extraStructV2, LogPbStructV2 logPbStructV2, String str2, Integer num4, String str3) {
        this(num, l2, l3, num2, list, str, num3, extraStructV2, logPbStructV2, str2, num4, str3, i.EMPTY);
    }

    public tiktok_v1_kids_feed_response(Integer num, Long l2, Long l3, Integer num2, List<AwemeStructV2> list, String str, Integer num3, ExtraStructV2 extraStructV2, LogPbStructV2 logPbStructV2, String str2, Integer num4, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.status_code = num;
        this.min_cursor = l2;
        this.max_cursor = l3;
        this.has_more = num2;
        this.aweme_list = Internal.immutableCopyOf("aweme_list", list);
        this.rid = str;
        this.refresh_clear = num3;
        this.extra = extraStructV2;
        this.log_pb = logPbStructV2;
        this.DebugInfo = str2;
        this.block_code = num4;
        this.status_msg = str3;
    }
}
