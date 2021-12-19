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

public final class AwemeStatisticsStructV2 extends Message<AwemeStatisticsStructV2, Builder> {
    public static final ProtoAdapter<AwemeStatisticsStructV2> ADAPTER = new ProtoAdapter_AwemeStatisticsStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long comment_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long digg_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public Long download_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Long forward_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public Integer lose_comment_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public Integer lose_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Long play_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Long share_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public Long whatsapp_share_count;

    public AwemeStatisticsStructV2() {
    }

    static final class ProtoAdapter_AwemeStatisticsStructV2 extends ProtoAdapter<AwemeStatisticsStructV2> {
        static {
            Covode.recordClassIndex(101911);
        }

        public ProtoAdapter_AwemeStatisticsStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeStatisticsStructV2.class);
        }

        public final int encodedSize(AwemeStatisticsStructV2 awemeStatisticsStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, awemeStatisticsStructV2.aweme_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, awemeStatisticsStructV2.comment_count) + ProtoAdapter.INT64.encodedSizeWithTag(3, awemeStatisticsStructV2.digg_count) + ProtoAdapter.INT64.encodedSizeWithTag(4, awemeStatisticsStructV2.download_count) + ProtoAdapter.INT64.encodedSizeWithTag(5, awemeStatisticsStructV2.play_count) + ProtoAdapter.INT64.encodedSizeWithTag(6, awemeStatisticsStructV2.share_count) + ProtoAdapter.INT64.encodedSizeWithTag(7, awemeStatisticsStructV2.forward_count) + ProtoAdapter.INT32.encodedSizeWithTag(8, awemeStatisticsStructV2.lose_count) + ProtoAdapter.INT32.encodedSizeWithTag(9, awemeStatisticsStructV2.lose_comment_count) + ProtoAdapter.INT64.encodedSizeWithTag(10, awemeStatisticsStructV2.whatsapp_share_count) + awemeStatisticsStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AwemeStatisticsStructV2 decode(ProtoReader protoReader) {
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
                            builder.comment_count(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.digg_count(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.download_count(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.play_count(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.share_count(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.forward_count(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.lose_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.lose_comment_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.whatsapp_share_count(ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeStatisticsStructV2 awemeStatisticsStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, awemeStatisticsStructV2.aweme_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, awemeStatisticsStructV2.comment_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, awemeStatisticsStructV2.digg_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, awemeStatisticsStructV2.download_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, awemeStatisticsStructV2.play_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, awemeStatisticsStructV2.share_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, awemeStatisticsStructV2.forward_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, awemeStatisticsStructV2.lose_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, awemeStatisticsStructV2.lose_comment_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, awemeStatisticsStructV2.whatsapp_share_count);
            protoWriter.writeBytes(awemeStatisticsStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101909);
    }

    public static final class Builder extends Message.Builder<AwemeStatisticsStructV2, Builder> {
        public String aweme_id;
        public Long comment_count;
        public Long digg_count;
        public Long download_count;
        public Long forward_count;
        public Integer lose_comment_count;
        public Integer lose_count;
        public Long play_count;
        public Long share_count;
        public Long whatsapp_share_count;

        static {
            Covode.recordClassIndex(101910);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AwemeStatisticsStructV2 build() {
            return new AwemeStatisticsStructV2(this.aweme_id, this.comment_count, this.digg_count, this.download_count, this.play_count, this.share_count, this.forward_count, this.lose_count, this.lose_comment_count, this.whatsapp_share_count, super.buildUnknownFields());
        }

        public final Builder aweme_id(String str) {
            this.aweme_id = str;
            return this;
        }

        public final Builder comment_count(Long l2) {
            this.comment_count = l2;
            return this;
        }

        public final Builder digg_count(Long l2) {
            this.digg_count = l2;
            return this;
        }

        public final Builder download_count(Long l2) {
            this.download_count = l2;
            return this;
        }

        public final Builder forward_count(Long l2) {
            this.forward_count = l2;
            return this;
        }

        public final Builder lose_comment_count(Integer num) {
            this.lose_comment_count = num;
            return this;
        }

        public final Builder lose_count(Integer num) {
            this.lose_count = num;
            return this;
        }

        public final Builder play_count(Long l2) {
            this.play_count = l2;
            return this;
        }

        public final Builder share_count(Long l2) {
            this.share_count = l2;
            return this;
        }

        public final Builder whatsapp_share_count(Long l2) {
            this.whatsapp_share_count = l2;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AwemeStatisticsStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AwemeStatisticsStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.aweme_id = this.aweme_id;
        builder.comment_count = this.comment_count;
        builder.digg_count = this.digg_count;
        builder.download_count = this.download_count;
        builder.play_count = this.play_count;
        builder.share_count = this.share_count;
        builder.forward_count = this.forward_count;
        builder.lose_count = this.lose_count;
        builder.lose_comment_count = this.lose_comment_count;
        builder.whatsapp_share_count = this.whatsapp_share_count;
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
        String str = this.aweme_id;
        int i12 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (hashCode + i2) * 37;
        Long l2 = this.comment_count;
        if (l2 != null) {
            i3 = l2.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 37;
        Long l3 = this.digg_count;
        if (l3 != null) {
            i4 = l3.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 37;
        Long l4 = this.download_count;
        if (l4 != null) {
            i5 = l4.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 37;
        Long l5 = this.play_count;
        if (l5 != null) {
            i6 = l5.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 37;
        Long l6 = this.share_count;
        if (l6 != null) {
            i7 = l6.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 37;
        Long l7 = this.forward_count;
        if (l7 != null) {
            i8 = l7.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 37;
        Integer num = this.lose_count;
        if (num != null) {
            i9 = num.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 37;
        Integer num2 = this.lose_comment_count;
        if (num2 != null) {
            i10 = num2.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = (i20 + i10) * 37;
        Long l8 = this.whatsapp_share_count;
        if (l8 != null) {
            i12 = l8.hashCode();
        }
        int i22 = i21 + i12;
        this.hashCode = i22;
        return i22;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.aweme_id != null) {
            sb.append(", aweme_id=").append(this.aweme_id);
        }
        if (this.comment_count != null) {
            sb.append(", comment_count=").append(this.comment_count);
        }
        if (this.digg_count != null) {
            sb.append(", digg_count=").append(this.digg_count);
        }
        if (this.download_count != null) {
            sb.append(", download_count=").append(this.download_count);
        }
        if (this.play_count != null) {
            sb.append(", play_count=").append(this.play_count);
        }
        if (this.share_count != null) {
            sb.append(", share_count=").append(this.share_count);
        }
        if (this.forward_count != null) {
            sb.append(", forward_count=").append(this.forward_count);
        }
        if (this.lose_count != null) {
            sb.append(", lose_count=").append(this.lose_count);
        }
        if (this.lose_comment_count != null) {
            sb.append(", lose_comment_count=").append(this.lose_comment_count);
        }
        if (this.whatsapp_share_count != null) {
            sb.append(", whatsapp_share_count=").append(this.whatsapp_share_count);
        }
        return sb.replace(0, 2, "AwemeStatisticsStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeStatisticsStructV2)) {
            return false;
        }
        AwemeStatisticsStructV2 awemeStatisticsStructV2 = (AwemeStatisticsStructV2) obj;
        if (!unknownFields().equals(awemeStatisticsStructV2.unknownFields()) || !Internal.equals(this.aweme_id, awemeStatisticsStructV2.aweme_id) || !Internal.equals(this.comment_count, awemeStatisticsStructV2.comment_count) || !Internal.equals(this.digg_count, awemeStatisticsStructV2.digg_count) || !Internal.equals(this.download_count, awemeStatisticsStructV2.download_count) || !Internal.equals(this.play_count, awemeStatisticsStructV2.play_count) || !Internal.equals(this.share_count, awemeStatisticsStructV2.share_count) || !Internal.equals(this.forward_count, awemeStatisticsStructV2.forward_count) || !Internal.equals(this.lose_count, awemeStatisticsStructV2.lose_count) || !Internal.equals(this.lose_comment_count, awemeStatisticsStructV2.lose_comment_count) || !Internal.equals(this.whatsapp_share_count, awemeStatisticsStructV2.whatsapp_share_count)) {
            return false;
        }
        return true;
    }

    public AwemeStatisticsStructV2(String str, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Integer num, Integer num2, Long l8) {
        this(str, l2, l3, l4, l5, l6, l7, num, num2, l8, i.EMPTY);
    }

    public AwemeStatisticsStructV2(String str, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Integer num, Integer num2, Long l8, i iVar) {
        super(ADAPTER, iVar);
        this.aweme_id = str;
        this.comment_count = l2;
        this.digg_count = l3;
        this.download_count = l4;
        this.play_count = l5;
        this.share_count = l6;
        this.forward_count = l7;
        this.lose_count = num;
        this.lose_comment_count = num2;
        this.whatsapp_share_count = l8;
    }
}
