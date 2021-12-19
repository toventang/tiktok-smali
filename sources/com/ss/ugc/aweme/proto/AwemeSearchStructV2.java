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

public final class AwemeSearchStructV2 extends Message<AwemeSearchStructV2, Builder> {
    public static final ProtoAdapter<AwemeSearchStructV2> ADAPTER = new ProtoAdapter_AwemeSearchStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String challenge_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public String group_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public Integer label;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public Integer pattern_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Integer rank;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String search_word;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String sentence;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public Long value;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public Integer vb_rank;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Long vb_rank_value;

    public AwemeSearchStructV2() {
    }

    static final class ProtoAdapter_AwemeSearchStructV2 extends ProtoAdapter<AwemeSearchStructV2> {
        static {
            Covode.recordClassIndex(101905);
        }

        public ProtoAdapter_AwemeSearchStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeSearchStructV2.class);
        }

        public final int encodedSize(AwemeSearchStructV2 awemeSearchStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, awemeSearchStructV2.sentence) + ProtoAdapter.STRING.encodedSizeWithTag(2, awemeSearchStructV2.challenge_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, awemeSearchStructV2.search_word) + ProtoAdapter.INT64.encodedSizeWithTag(4, awemeSearchStructV2.value) + ProtoAdapter.INT32.encodedSizeWithTag(5, awemeSearchStructV2.vb_rank) + ProtoAdapter.INT64.encodedSizeWithTag(6, awemeSearchStructV2.vb_rank_value) + ProtoAdapter.INT32.encodedSizeWithTag(7, awemeSearchStructV2.rank) + ProtoAdapter.STRING.encodedSizeWithTag(8, awemeSearchStructV2.group_id) + ProtoAdapter.INT32.encodedSizeWithTag(9, awemeSearchStructV2.label) + ProtoAdapter.INT32.encodedSizeWithTag(10, awemeSearchStructV2.pattern_type) + awemeSearchStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AwemeSearchStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.sentence(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.challenge_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.search_word(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.value(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.vb_rank(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.vb_rank_value(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.rank(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.group_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.label(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.pattern_type(ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeSearchStructV2 awemeSearchStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, awemeSearchStructV2.sentence);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, awemeSearchStructV2.challenge_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, awemeSearchStructV2.search_word);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, awemeSearchStructV2.value);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, awemeSearchStructV2.vb_rank);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, awemeSearchStructV2.vb_rank_value);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, awemeSearchStructV2.rank);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, awemeSearchStructV2.group_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, awemeSearchStructV2.label);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, awemeSearchStructV2.pattern_type);
            protoWriter.writeBytes(awemeSearchStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101903);
    }

    public static final class Builder extends Message.Builder<AwemeSearchStructV2, Builder> {
        public String challenge_id;
        public String group_id;
        public Integer label;
        public Integer pattern_type;
        public Integer rank;
        public String search_word;
        public String sentence;
        public Long value;
        public Integer vb_rank;
        public Long vb_rank_value;

        static {
            Covode.recordClassIndex(101904);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AwemeSearchStructV2 build() {
            return new AwemeSearchStructV2(this.sentence, this.challenge_id, this.search_word, this.value, this.vb_rank, this.vb_rank_value, this.rank, this.group_id, this.label, this.pattern_type, super.buildUnknownFields());
        }

        public final Builder challenge_id(String str) {
            this.challenge_id = str;
            return this;
        }

        public final Builder group_id(String str) {
            this.group_id = str;
            return this;
        }

        public final Builder label(Integer num) {
            this.label = num;
            return this;
        }

        public final Builder pattern_type(Integer num) {
            this.pattern_type = num;
            return this;
        }

        public final Builder rank(Integer num) {
            this.rank = num;
            return this;
        }

        public final Builder search_word(String str) {
            this.search_word = str;
            return this;
        }

        public final Builder sentence(String str) {
            this.sentence = str;
            return this;
        }

        public final Builder value(Long l2) {
            this.value = l2;
            return this;
        }

        public final Builder vb_rank(Integer num) {
            this.vb_rank = num;
            return this;
        }

        public final Builder vb_rank_value(Long l2) {
            this.vb_rank_value = l2;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AwemeSearchStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AwemeSearchStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.sentence = this.sentence;
        builder.challenge_id = this.challenge_id;
        builder.search_word = this.search_word;
        builder.value = this.value;
        builder.vb_rank = this.vb_rank;
        builder.vb_rank_value = this.vb_rank_value;
        builder.rank = this.rank;
        builder.group_id = this.group_id;
        builder.label = this.label;
        builder.pattern_type = this.pattern_type;
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
        String str = this.sentence;
        int i12 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (hashCode + i2) * 37;
        String str2 = this.challenge_id;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 37;
        String str3 = this.search_word;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 37;
        Long l2 = this.value;
        if (l2 != null) {
            i5 = l2.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 37;
        Integer num = this.vb_rank;
        if (num != null) {
            i6 = num.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 37;
        Long l3 = this.vb_rank_value;
        if (l3 != null) {
            i7 = l3.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 37;
        Integer num2 = this.rank;
        if (num2 != null) {
            i8 = num2.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 37;
        String str4 = this.group_id;
        if (str4 != null) {
            i9 = str4.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 37;
        Integer num3 = this.label;
        if (num3 != null) {
            i10 = num3.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = (i20 + i10) * 37;
        Integer num4 = this.pattern_type;
        if (num4 != null) {
            i12 = num4.hashCode();
        }
        int i22 = i21 + i12;
        this.hashCode = i22;
        return i22;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sentence != null) {
            sb.append(", sentence=").append(this.sentence);
        }
        if (this.challenge_id != null) {
            sb.append(", challenge_id=").append(this.challenge_id);
        }
        if (this.search_word != null) {
            sb.append(", search_word=").append(this.search_word);
        }
        if (this.value != null) {
            sb.append(", value=").append(this.value);
        }
        if (this.vb_rank != null) {
            sb.append(", vb_rank=").append(this.vb_rank);
        }
        if (this.vb_rank_value != null) {
            sb.append(", vb_rank_value=").append(this.vb_rank_value);
        }
        if (this.rank != null) {
            sb.append(", rank=").append(this.rank);
        }
        if (this.group_id != null) {
            sb.append(", group_id=").append(this.group_id);
        }
        if (this.label != null) {
            sb.append(", label=").append(this.label);
        }
        if (this.pattern_type != null) {
            sb.append(", pattern_type=").append(this.pattern_type);
        }
        return sb.replace(0, 2, "AwemeSearchStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeSearchStructV2)) {
            return false;
        }
        AwemeSearchStructV2 awemeSearchStructV2 = (AwemeSearchStructV2) obj;
        if (!unknownFields().equals(awemeSearchStructV2.unknownFields()) || !Internal.equals(this.sentence, awemeSearchStructV2.sentence) || !Internal.equals(this.challenge_id, awemeSearchStructV2.challenge_id) || !Internal.equals(this.search_word, awemeSearchStructV2.search_word) || !Internal.equals(this.value, awemeSearchStructV2.value) || !Internal.equals(this.vb_rank, awemeSearchStructV2.vb_rank) || !Internal.equals(this.vb_rank_value, awemeSearchStructV2.vb_rank_value) || !Internal.equals(this.rank, awemeSearchStructV2.rank) || !Internal.equals(this.group_id, awemeSearchStructV2.group_id) || !Internal.equals(this.label, awemeSearchStructV2.label) || !Internal.equals(this.pattern_type, awemeSearchStructV2.pattern_type)) {
            return false;
        }
        return true;
    }

    public AwemeSearchStructV2(String str, String str2, String str3, Long l2, Integer num, Long l3, Integer num2, String str4, Integer num3, Integer num4) {
        this(str, str2, str3, l2, num, l3, num2, str4, num3, num4, i.EMPTY);
    }

    public AwemeSearchStructV2(String str, String str2, String str3, Long l2, Integer num, Long l3, Integer num2, String str4, Integer num3, Integer num4, i iVar) {
        super(ADAPTER, iVar);
        this.sentence = str;
        this.challenge_id = str2;
        this.search_word = str3;
        this.value = l2;
        this.vb_rank = num;
        this.vb_rank_value = l3;
        this.rank = num2;
        this.group_id = str4;
        this.label = num3;
        this.pattern_type = num4;
    }
}
