package com.ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class BoostStructV2 extends Message<BoostStructV2, Builder> {
    public static final ProtoAdapter<BoostStructV2> ADAPTER = new ProtoAdapter_BoostStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer boost_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String color;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String color_text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String label;

    public BoostStructV2() {
    }

    static final class ProtoAdapter_BoostStructV2 extends ProtoAdapter<BoostStructV2> {
        static {
            Covode.recordClassIndex(101932);
        }

        public ProtoAdapter_BoostStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, BoostStructV2.class);
        }

        public final int encodedSize(BoostStructV2 boostStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, boostStructV2.boost_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, boostStructV2.label) + ProtoAdapter.STRING.encodedSizeWithTag(3, boostStructV2.color) + ProtoAdapter.STRING.encodedSizeWithTag(4, boostStructV2.color_text) + boostStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BoostStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.boost_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.label(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.color(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.color_text(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BoostStructV2 boostStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, boostStructV2.boost_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, boostStructV2.label);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, boostStructV2.color);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, boostStructV2.color_text);
            protoWriter.writeBytes(boostStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101930);
    }

    public static final class Builder extends Message.Builder<BoostStructV2, Builder> {
        public Integer boost_type;
        public String color;
        public String color_text;
        public String label;

        static {
            Covode.recordClassIndex(101931);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BoostStructV2 build() {
            return new BoostStructV2(this.boost_type, this.label, this.color, this.color_text, super.buildUnknownFields());
        }

        public final Builder boost_type(Integer num) {
            this.boost_type = num;
            return this;
        }

        public final Builder color(String str) {
            this.color = str;
            return this;
        }

        public final Builder color_text(String str) {
            this.color_text = str;
            return this;
        }

        public final Builder label(String str) {
            this.label = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.BoostStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BoostStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.boost_type = this.boost_type;
        builder.label = this.label;
        builder.color = this.color;
        builder.color_text = this.color_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.boost_type;
        int i6 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        String str = this.label;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        String str2 = this.color;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        String str3 = this.color_text;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        int i10 = i9 + i6;
        this.hashCode = i10;
        return i10;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.boost_type != null) {
            sb.append(", boost_type=").append(this.boost_type);
        }
        if (this.label != null) {
            sb.append(", label=").append(this.label);
        }
        if (this.color != null) {
            sb.append(", color=").append(this.color);
        }
        if (this.color_text != null) {
            sb.append(", color_text=").append(this.color_text);
        }
        return sb.replace(0, 2, "BoostStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoostStructV2)) {
            return false;
        }
        BoostStructV2 boostStructV2 = (BoostStructV2) obj;
        if (!unknownFields().equals(boostStructV2.unknownFields()) || !Internal.equals(this.boost_type, boostStructV2.boost_type) || !Internal.equals(this.label, boostStructV2.label) || !Internal.equals(this.color, boostStructV2.color) || !Internal.equals(this.color_text, boostStructV2.color_text)) {
            return false;
        }
        return true;
    }

    public BoostStructV2(Integer num, String str, String str2, String str3) {
        this(num, str, str2, str3, i.EMPTY);
    }

    public BoostStructV2(Integer num, String str, String str2, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.boost_type = num;
        this.label = str;
        this.color = str2;
        this.color_text = str3;
    }
}
