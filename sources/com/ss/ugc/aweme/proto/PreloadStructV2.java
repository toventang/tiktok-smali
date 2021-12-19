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

public final class PreloadStructV2 extends Message<PreloadStructV2, Builder> {
    public static final ProtoAdapter<PreloadStructV2> ADAPTER = new ProtoAdapter_PreloadStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer comment;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Double comment_median_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 3)
    public Double comment_pro;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Double comment_thres;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public Integer model_v2;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public String predict_config;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer profile;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public Double profile_median_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 4)
    public Double profile_pro;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Double profile_thres;

    public PreloadStructV2() {
    }

    static final class ProtoAdapter_PreloadStructV2 extends ProtoAdapter<PreloadStructV2> {
        static {
            Covode.recordClassIndex(102172);
        }

        public ProtoAdapter_PreloadStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, PreloadStructV2.class);
        }

        public final int encodedSize(PreloadStructV2 preloadStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, preloadStructV2.comment) + ProtoAdapter.INT32.encodedSizeWithTag(2, preloadStructV2.profile) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, preloadStructV2.comment_pro) + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, preloadStructV2.profile_pro) + ProtoAdapter.DOUBLE.encodedSizeWithTag(5, preloadStructV2.comment_thres) + ProtoAdapter.DOUBLE.encodedSizeWithTag(6, preloadStructV2.profile_thres) + ProtoAdapter.DOUBLE.encodedSizeWithTag(7, preloadStructV2.comment_median_time) + ProtoAdapter.DOUBLE.encodedSizeWithTag(8, preloadStructV2.profile_median_time) + ProtoAdapter.INT32.encodedSizeWithTag(9, preloadStructV2.model_v2) + ProtoAdapter.STRING.encodedSizeWithTag(10, preloadStructV2.predict_config) + preloadStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PreloadStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.comment(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.profile(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.comment_pro(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 4:
                            builder.profile_pro(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.comment_thres(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.profile_thres(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.comment_median_time(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.profile_median_time(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.model_v2(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.predict_config(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, PreloadStructV2 preloadStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, preloadStructV2.comment);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, preloadStructV2.profile);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, preloadStructV2.comment_pro);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 4, preloadStructV2.profile_pro);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 5, preloadStructV2.comment_thres);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 6, preloadStructV2.profile_thres);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 7, preloadStructV2.comment_median_time);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 8, preloadStructV2.profile_median_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, preloadStructV2.model_v2);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, preloadStructV2.predict_config);
            protoWriter.writeBytes(preloadStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102170);
    }

    public static final class Builder extends Message.Builder<PreloadStructV2, Builder> {
        public Integer comment;
        public Double comment_median_time;
        public Double comment_pro;
        public Double comment_thres;
        public Integer model_v2;
        public String predict_config;
        public Integer profile;
        public Double profile_median_time;
        public Double profile_pro;
        public Double profile_thres;

        static {
            Covode.recordClassIndex(102171);
        }

        @Override // com.squareup.wire.Message.Builder
        public final PreloadStructV2 build() {
            return new PreloadStructV2(this.comment, this.profile, this.comment_pro, this.profile_pro, this.comment_thres, this.profile_thres, this.comment_median_time, this.profile_median_time, this.model_v2, this.predict_config, super.buildUnknownFields());
        }

        public final Builder comment(Integer num) {
            this.comment = num;
            return this;
        }

        public final Builder comment_median_time(Double d2) {
            this.comment_median_time = d2;
            return this;
        }

        public final Builder comment_pro(Double d2) {
            this.comment_pro = d2;
            return this;
        }

        public final Builder comment_thres(Double d2) {
            this.comment_thres = d2;
            return this;
        }

        public final Builder model_v2(Integer num) {
            this.model_v2 = num;
            return this;
        }

        public final Builder predict_config(String str) {
            this.predict_config = str;
            return this;
        }

        public final Builder profile(Integer num) {
            this.profile = num;
            return this;
        }

        public final Builder profile_median_time(Double d2) {
            this.profile_median_time = d2;
            return this;
        }

        public final Builder profile_pro(Double d2) {
            this.profile_pro = d2;
            return this;
        }

        public final Builder profile_thres(Double d2) {
            this.profile_thres = d2;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.PreloadStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<PreloadStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.comment = this.comment;
        builder.profile = this.profile;
        builder.comment_pro = this.comment_pro;
        builder.profile_pro = this.profile_pro;
        builder.comment_thres = this.comment_thres;
        builder.profile_thres = this.profile_thres;
        builder.comment_median_time = this.comment_median_time;
        builder.profile_median_time = this.profile_median_time;
        builder.model_v2 = this.model_v2;
        builder.predict_config = this.predict_config;
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
        Integer num = this.comment;
        int i12 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (hashCode + i2) * 37;
        Integer num2 = this.profile;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 37;
        Double d2 = this.comment_pro;
        if (d2 != null) {
            i4 = d2.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 37;
        Double d3 = this.profile_pro;
        if (d3 != null) {
            i5 = d3.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 37;
        Double d4 = this.comment_thres;
        if (d4 != null) {
            i6 = d4.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 37;
        Double d5 = this.profile_thres;
        if (d5 != null) {
            i7 = d5.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 37;
        Double d6 = this.comment_median_time;
        if (d6 != null) {
            i8 = d6.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 37;
        Double d7 = this.profile_median_time;
        if (d7 != null) {
            i9 = d7.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 37;
        Integer num3 = this.model_v2;
        if (num3 != null) {
            i10 = num3.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = (i20 + i10) * 37;
        String str = this.predict_config;
        if (str != null) {
            i12 = str.hashCode();
        }
        int i22 = i21 + i12;
        this.hashCode = i22;
        return i22;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.comment != null) {
            sb.append(", comment=").append(this.comment);
        }
        if (this.profile != null) {
            sb.append(", profile=").append(this.profile);
        }
        if (this.comment_pro != null) {
            sb.append(", comment_pro=").append(this.comment_pro);
        }
        if (this.profile_pro != null) {
            sb.append(", profile_pro=").append(this.profile_pro);
        }
        if (this.comment_thres != null) {
            sb.append(", comment_thres=").append(this.comment_thres);
        }
        if (this.profile_thres != null) {
            sb.append(", profile_thres=").append(this.profile_thres);
        }
        if (this.comment_median_time != null) {
            sb.append(", comment_median_time=").append(this.comment_median_time);
        }
        if (this.profile_median_time != null) {
            sb.append(", profile_median_time=").append(this.profile_median_time);
        }
        if (this.model_v2 != null) {
            sb.append(", model_v2=").append(this.model_v2);
        }
        if (this.predict_config != null) {
            sb.append(", predict_config=").append(this.predict_config);
        }
        return sb.replace(0, 2, "PreloadStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PreloadStructV2)) {
            return false;
        }
        PreloadStructV2 preloadStructV2 = (PreloadStructV2) obj;
        if (!unknownFields().equals(preloadStructV2.unknownFields()) || !Internal.equals(this.comment, preloadStructV2.comment) || !Internal.equals(this.profile, preloadStructV2.profile) || !Internal.equals(this.comment_pro, preloadStructV2.comment_pro) || !Internal.equals(this.profile_pro, preloadStructV2.profile_pro) || !Internal.equals(this.comment_thres, preloadStructV2.comment_thres) || !Internal.equals(this.profile_thres, preloadStructV2.profile_thres) || !Internal.equals(this.comment_median_time, preloadStructV2.comment_median_time) || !Internal.equals(this.profile_median_time, preloadStructV2.profile_median_time) || !Internal.equals(this.model_v2, preloadStructV2.model_v2) || !Internal.equals(this.predict_config, preloadStructV2.predict_config)) {
            return false;
        }
        return true;
    }

    public PreloadStructV2(Integer num, Integer num2, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Integer num3, String str) {
        this(num, num2, d2, d3, d4, d5, d6, d7, num3, str, i.EMPTY);
    }

    public PreloadStructV2(Integer num, Integer num2, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Integer num3, String str, i iVar) {
        super(ADAPTER, iVar);
        this.comment = num;
        this.profile = num2;
        this.comment_pro = d2;
        this.profile_pro = d3;
        this.comment_thres = d4;
        this.profile_thres = d5;
        this.comment_median_time = d6;
        this.profile_median_time = d7;
        this.model_v2 = num3;
        this.predict_config = str;
    }
}
