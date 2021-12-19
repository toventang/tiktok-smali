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

public final class DisclaimerStructV2 extends Message<DisclaimerStructV2, Builder> {
    public static final ProtoAdapter<DisclaimerStructV2> ADAPTER = new ProtoAdapter_DisclaimerStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String title;

    public DisclaimerStructV2() {
    }

    static final class ProtoAdapter_DisclaimerStructV2 extends ProtoAdapter<DisclaimerStructV2> {
        static {
            Covode.recordClassIndex(101986);
        }

        public ProtoAdapter_DisclaimerStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, DisclaimerStructV2.class);
        }

        public final int encodedSize(DisclaimerStructV2 disclaimerStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, disclaimerStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(2, disclaimerStructV2.content) + disclaimerStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DisclaimerStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.title(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.content(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, DisclaimerStructV2 disclaimerStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, disclaimerStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, disclaimerStructV2.content);
            protoWriter.writeBytes(disclaimerStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<DisclaimerStructV2, Builder> {
        public String content;
        public String title;

        static {
            Covode.recordClassIndex(101985);
        }

        @Override // com.squareup.wire.Message.Builder
        public final DisclaimerStructV2 build() {
            return new DisclaimerStructV2(this.title, this.content, super.buildUnknownFields());
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101984);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.DisclaimerStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<DisclaimerStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.content = this.content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int i4 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        String str2 = this.content;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        int i6 = i5 + i4;
        this.hashCode = i6;
        return i6;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=").append(this.title);
        }
        if (this.content != null) {
            sb.append(", content=").append(this.content);
        }
        return sb.replace(0, 2, "DisclaimerStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DisclaimerStructV2)) {
            return false;
        }
        DisclaimerStructV2 disclaimerStructV2 = (DisclaimerStructV2) obj;
        if (!unknownFields().equals(disclaimerStructV2.unknownFields()) || !Internal.equals(this.title, disclaimerStructV2.title) || !Internal.equals(this.content, disclaimerStructV2.content)) {
            return false;
        }
        return true;
    }

    public DisclaimerStructV2(String str, String str2) {
        this(str, str2, i.EMPTY);
    }

    public DisclaimerStructV2(String str, String str2, i iVar) {
        super(ADAPTER, iVar);
        this.title = str;
        this.content = str2;
    }
}
