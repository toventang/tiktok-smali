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

public final class GreenScreenMaterialV2 extends Message<GreenScreenMaterialV2, Builder> {
    public static final ProtoAdapter<GreenScreenMaterialV2> ADAPTER = new ProtoAdapter_GreenScreenMaterialV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String author_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public String effect_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long end_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String resource_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long start_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer type;

    public GreenScreenMaterialV2() {
    }

    static final class ProtoAdapter_GreenScreenMaterialV2 extends ProtoAdapter<GreenScreenMaterialV2> {
        static {
            Covode.recordClassIndex(102019);
        }

        public ProtoAdapter_GreenScreenMaterialV2() {
            super(FieldEncoding.LENGTH_DELIMITED, GreenScreenMaterialV2.class);
        }

        public final int encodedSize(GreenScreenMaterialV2 greenScreenMaterialV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, greenScreenMaterialV2.type) + ProtoAdapter.INT64.encodedSizeWithTag(2, greenScreenMaterialV2.start_time) + ProtoAdapter.INT64.encodedSizeWithTag(3, greenScreenMaterialV2.end_time) + ProtoAdapter.STRING.encodedSizeWithTag(4, greenScreenMaterialV2.resource_id) + ProtoAdapter.STRING.encodedSizeWithTag(5, greenScreenMaterialV2.author_name) + ProtoAdapter.STRING.encodedSizeWithTag(6, greenScreenMaterialV2.effect_id) + greenScreenMaterialV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GreenScreenMaterialV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.start_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.end_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.resource_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.author_name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.effect_id(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, GreenScreenMaterialV2 greenScreenMaterialV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, greenScreenMaterialV2.type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, greenScreenMaterialV2.start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, greenScreenMaterialV2.end_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, greenScreenMaterialV2.resource_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, greenScreenMaterialV2.author_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, greenScreenMaterialV2.effect_id);
            protoWriter.writeBytes(greenScreenMaterialV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102017);
    }

    public static final class Builder extends Message.Builder<GreenScreenMaterialV2, Builder> {
        public String author_name;
        public String effect_id;
        public Long end_time;
        public String resource_id;
        public Long start_time;
        public Integer type;

        static {
            Covode.recordClassIndex(102018);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GreenScreenMaterialV2 build() {
            return new GreenScreenMaterialV2(this.type, this.start_time, this.end_time, this.resource_id, this.author_name, this.effect_id, super.buildUnknownFields());
        }

        public final Builder author_name(String str) {
            this.author_name = str;
            return this;
        }

        public final Builder effect_id(String str) {
            this.effect_id = str;
            return this;
        }

        public final Builder end_time(Long l2) {
            this.end_time = l2;
            return this;
        }

        public final Builder resource_id(String str) {
            this.resource_id = str;
            return this;
        }

        public final Builder start_time(Long l2) {
            this.start_time = l2;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.GreenScreenMaterialV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GreenScreenMaterialV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.start_time = this.start_time;
        builder.end_time = this.end_time;
        builder.resource_id = this.resource_id;
        builder.author_name = this.author_name;
        builder.effect_id = this.effect_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.hashCode;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.type;
        int i8 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (hashCode + i2) * 37;
        Long l2 = this.start_time;
        if (l2 != null) {
            i3 = l2.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        Long l3 = this.end_time;
        if (l3 != null) {
            i4 = l3.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        String str = this.resource_id;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        String str2 = this.author_name;
        if (str2 != null) {
            i6 = str2.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 37;
        String str3 = this.effect_id;
        if (str3 != null) {
            i8 = str3.hashCode();
        }
        int i14 = i13 + i8;
        this.hashCode = i14;
        return i14;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=").append(this.type);
        }
        if (this.start_time != null) {
            sb.append(", start_time=").append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=").append(this.end_time);
        }
        if (this.resource_id != null) {
            sb.append(", resource_id=").append(this.resource_id);
        }
        if (this.author_name != null) {
            sb.append(", author_name=").append(this.author_name);
        }
        if (this.effect_id != null) {
            sb.append(", effect_id=").append(this.effect_id);
        }
        return sb.replace(0, 2, "GreenScreenMaterialV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GreenScreenMaterialV2)) {
            return false;
        }
        GreenScreenMaterialV2 greenScreenMaterialV2 = (GreenScreenMaterialV2) obj;
        if (!unknownFields().equals(greenScreenMaterialV2.unknownFields()) || !Internal.equals(this.type, greenScreenMaterialV2.type) || !Internal.equals(this.start_time, greenScreenMaterialV2.start_time) || !Internal.equals(this.end_time, greenScreenMaterialV2.end_time) || !Internal.equals(this.resource_id, greenScreenMaterialV2.resource_id) || !Internal.equals(this.author_name, greenScreenMaterialV2.author_name) || !Internal.equals(this.effect_id, greenScreenMaterialV2.effect_id)) {
            return false;
        }
        return true;
    }

    public GreenScreenMaterialV2(Integer num, Long l2, Long l3, String str, String str2, String str3) {
        this(num, l2, l3, str, str2, str3, i.EMPTY);
    }

    public GreenScreenMaterialV2(Integer num, Long l2, Long l3, String str, String str2, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.type = num;
        this.start_time = l2;
        this.end_time = l3;
        this.resource_id = str;
        this.author_name = str2;
        this.effect_id = str3;
    }
}
