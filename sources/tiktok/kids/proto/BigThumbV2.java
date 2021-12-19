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
import k.i;

/* access modifiers changed from: package-private */
public final class BigThumbV2 extends Message<BigThumbV2, Builder> {
    public static final ProtoAdapter<BigThumbV2> ADAPTER = new ProtoAdapter_BigThumbV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public Double duration;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public String fext;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long img_num;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String img_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Long img_x_len;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public Long img_x_size;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Long img_y_len;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Long img_y_size;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public Double interval;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String uri;

    static final class ProtoAdapter_BigThumbV2 extends ProtoAdapter<BigThumbV2> {
        static {
            Covode.recordClassIndex(106737);
        }

        public ProtoAdapter_BigThumbV2() {
            super(FieldEncoding.LENGTH_DELIMITED, BigThumbV2.class);
        }

        public final int encodedSize(BigThumbV2 bigThumbV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, bigThumbV2.img_num) + ProtoAdapter.STRING.encodedSizeWithTag(2, bigThumbV2.uri) + ProtoAdapter.STRING.encodedSizeWithTag(3, bigThumbV2.img_url) + ProtoAdapter.INT64.encodedSizeWithTag(4, bigThumbV2.img_x_size) + ProtoAdapter.INT64.encodedSizeWithTag(5, bigThumbV2.img_y_size) + ProtoAdapter.INT64.encodedSizeWithTag(6, bigThumbV2.img_x_len) + ProtoAdapter.INT64.encodedSizeWithTag(7, bigThumbV2.img_y_len) + ProtoAdapter.DOUBLE.encodedSizeWithTag(8, bigThumbV2.duration) + ProtoAdapter.DOUBLE.encodedSizeWithTag(9, bigThumbV2.interval) + ProtoAdapter.STRING.encodedSizeWithTag(10, bigThumbV2.fext) + bigThumbV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BigThumbV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.img_num(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.uri(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.img_url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.img_x_size(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.img_y_size(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.img_x_len(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.img_y_len(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.duration(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.interval(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.fext(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, BigThumbV2 bigThumbV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, bigThumbV2.img_num);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bigThumbV2.uri);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, bigThumbV2.img_url);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, bigThumbV2.img_x_size);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, bigThumbV2.img_y_size);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, bigThumbV2.img_x_len);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, bigThumbV2.img_y_len);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 8, bigThumbV2.duration);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 9, bigThumbV2.interval);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, bigThumbV2.fext);
            protoWriter.writeBytes(bigThumbV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(106735);
    }

    public static final class Builder extends Message.Builder<BigThumbV2, Builder> {
        public Double duration;
        public String fext;
        public Long img_num;
        public String img_url;
        public Long img_x_len;
        public Long img_x_size;
        public Long img_y_len;
        public Long img_y_size;
        public Double interval;
        public String uri;

        static {
            Covode.recordClassIndex(106736);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BigThumbV2 build() {
            return new BigThumbV2(this.img_num, this.uri, this.img_url, this.img_x_size, this.img_y_size, this.img_x_len, this.img_y_len, this.duration, this.interval, this.fext, super.buildUnknownFields());
        }

        public final Builder duration(Double d2) {
            this.duration = d2;
            return this;
        }

        public final Builder fext(String str) {
            this.fext = str;
            return this;
        }

        public final Builder img_num(Long l2) {
            this.img_num = l2;
            return this;
        }

        public final Builder img_url(String str) {
            this.img_url = str;
            return this;
        }

        public final Builder img_x_len(Long l2) {
            this.img_x_len = l2;
            return this;
        }

        public final Builder img_x_size(Long l2) {
            this.img_x_size = l2;
            return this;
        }

        public final Builder img_y_len(Long l2) {
            this.img_y_len = l2;
            return this;
        }

        public final Builder img_y_size(Long l2) {
            this.img_y_size = l2;
            return this;
        }

        public final Builder interval(Double d2) {
            this.interval = d2;
            return this;
        }

        public final Builder uri(String str) {
            this.uri = str;
            return this;
        }
    }

    /* Return type fixed from 'tiktok.kids.proto.BigThumbV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BigThumbV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.img_num = this.img_num;
        builder.uri = this.uri;
        builder.img_url = this.img_url;
        builder.img_x_size = this.img_x_size;
        builder.img_y_size = this.img_y_size;
        builder.img_x_len = this.img_x_len;
        builder.img_y_len = this.img_y_len;
        builder.duration = this.duration;
        builder.interval = this.interval;
        builder.fext = this.fext;
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
        Long l2 = this.img_num;
        int i12 = 0;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (hashCode + i2) * 37;
        String str = this.uri;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 37;
        String str2 = this.img_url;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 37;
        Long l3 = this.img_x_size;
        if (l3 != null) {
            i5 = l3.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 37;
        Long l4 = this.img_y_size;
        if (l4 != null) {
            i6 = l4.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 37;
        Long l5 = this.img_x_len;
        if (l5 != null) {
            i7 = l5.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 37;
        Long l6 = this.img_y_len;
        if (l6 != null) {
            i8 = l6.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 37;
        Double d2 = this.duration;
        if (d2 != null) {
            i9 = d2.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 37;
        Double d3 = this.interval;
        if (d3 != null) {
            i10 = d3.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = (i20 + i10) * 37;
        String str3 = this.fext;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        int i22 = i21 + i12;
        this.hashCode = i22;
        return i22;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.img_num != null) {
            sb.append(", img_num=").append(this.img_num);
        }
        if (this.uri != null) {
            sb.append(", uri=").append(this.uri);
        }
        if (this.img_url != null) {
            sb.append(", img_url=").append(this.img_url);
        }
        if (this.img_x_size != null) {
            sb.append(", img_x_size=").append(this.img_x_size);
        }
        if (this.img_y_size != null) {
            sb.append(", img_y_size=").append(this.img_y_size);
        }
        if (this.img_x_len != null) {
            sb.append(", img_x_len=").append(this.img_x_len);
        }
        if (this.img_y_len != null) {
            sb.append(", img_y_len=").append(this.img_y_len);
        }
        if (this.duration != null) {
            sb.append(", duration=").append(this.duration);
        }
        if (this.interval != null) {
            sb.append(", interval=").append(this.interval);
        }
        if (this.fext != null) {
            sb.append(", fext=").append(this.fext);
        }
        return sb.replace(0, 2, "BigThumbV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BigThumbV2)) {
            return false;
        }
        BigThumbV2 bigThumbV2 = (BigThumbV2) obj;
        if (!unknownFields().equals(bigThumbV2.unknownFields()) || !Internal.equals(this.img_num, bigThumbV2.img_num) || !Internal.equals(this.uri, bigThumbV2.uri) || !Internal.equals(this.img_url, bigThumbV2.img_url) || !Internal.equals(this.img_x_size, bigThumbV2.img_x_size) || !Internal.equals(this.img_y_size, bigThumbV2.img_y_size) || !Internal.equals(this.img_x_len, bigThumbV2.img_x_len) || !Internal.equals(this.img_y_len, bigThumbV2.img_y_len) || !Internal.equals(this.duration, bigThumbV2.duration) || !Internal.equals(this.interval, bigThumbV2.interval) || !Internal.equals(this.fext, bigThumbV2.fext)) {
            return false;
        }
        return true;
    }

    public BigThumbV2(Long l2, String str, String str2, Long l3, Long l4, Long l5, Long l6, Double d2, Double d3, String str3) {
        this(l2, str, str2, l3, l4, l5, l6, d2, d3, str3, i.EMPTY);
    }

    public BigThumbV2(Long l2, String str, String str2, Long l3, Long l4, Long l5, Long l6, Double d2, Double d3, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.img_num = l2;
        this.uri = str;
        this.img_url = str2;
        this.img_x_size = l3;
        this.img_y_size = l4;
        this.img_x_len = l5;
        this.img_y_len = l6;
        this.duration = d2;
        this.interval = d3;
        this.fext = str3;
    }
}
