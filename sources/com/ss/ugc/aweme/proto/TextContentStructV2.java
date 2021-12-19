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

public final class TextContentStructV2 extends Message<TextContentStructV2, Builder> {
    public static final ProtoAdapter<TextContentStructV2> ADAPTER = new ProtoAdapter_TextContentStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String color;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String size;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String text;

    public TextContentStructV2() {
    }

    static final class ProtoAdapter_TextContentStructV2 extends ProtoAdapter<TextContentStructV2> {
        static {
            Covode.recordClassIndex(102232);
        }

        public ProtoAdapter_TextContentStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, TextContentStructV2.class);
        }

        public final int encodedSize(TextContentStructV2 textContentStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, textContentStructV2.text) + ProtoAdapter.STRING.encodedSizeWithTag(2, textContentStructV2.color) + ProtoAdapter.STRING.encodedSizeWithTag(3, textContentStructV2.size) + textContentStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final TextContentStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.text(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.color(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.size(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, TextContentStructV2 textContentStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, textContentStructV2.text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, textContentStructV2.color);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, textContentStructV2.size);
            protoWriter.writeBytes(textContentStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<TextContentStructV2, Builder> {
        public String color;
        public String size;
        public String text;

        static {
            Covode.recordClassIndex(102231);
        }

        @Override // com.squareup.wire.Message.Builder
        public final TextContentStructV2 build() {
            return new TextContentStructV2(this.text, this.color, this.size, super.buildUnknownFields());
        }

        public final Builder color(String str) {
            this.color = str;
            return this;
        }

        public final Builder size(String str) {
            this.size = str;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102230);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.TextContentStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<TextContentStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.text = this.text;
        builder.color = this.color;
        builder.size = this.size;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        String str2 = this.color;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        String str3 = this.size;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=").append(this.text);
        }
        if (this.color != null) {
            sb.append(", color=").append(this.color);
        }
        if (this.size != null) {
            sb.append(", size=").append(this.size);
        }
        return sb.replace(0, 2, "TextContentStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextContentStructV2)) {
            return false;
        }
        TextContentStructV2 textContentStructV2 = (TextContentStructV2) obj;
        if (!unknownFields().equals(textContentStructV2.unknownFields()) || !Internal.equals(this.text, textContentStructV2.text) || !Internal.equals(this.color, textContentStructV2.color) || !Internal.equals(this.size, textContentStructV2.size)) {
            return false;
        }
        return true;
    }

    public TextContentStructV2(String str, String str2, String str3) {
        this(str, str2, str3, i.EMPTY);
    }

    public TextContentStructV2(String str, String str2, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.text = str;
        this.color = str2;
        this.size = str3;
    }
}
