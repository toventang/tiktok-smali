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

public final class AwemeLabelStructV2 extends Message<AwemeLabelStructV2, Builder> {
    public static final ProtoAdapter<AwemeLabelStructV2> ADAPTER = new ProtoAdapter_AwemeLabelStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer label_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 1)
    public UrlStructV2 label_url;

    public AwemeLabelStructV2() {
    }

    static final class ProtoAdapter_AwemeLabelStructV2 extends ProtoAdapter<AwemeLabelStructV2> {
        static {
            Covode.recordClassIndex(101899);
        }

        public ProtoAdapter_AwemeLabelStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeLabelStructV2.class);
        }

        public final int encodedSize(AwemeLabelStructV2 awemeLabelStructV2) {
            return UrlStructV2.ADAPTER.encodedSizeWithTag(1, awemeLabelStructV2.label_url) + ProtoAdapter.INT32.encodedSizeWithTag(2, awemeLabelStructV2.label_type) + awemeLabelStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AwemeLabelStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.label_url(UrlStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.label_type(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AwemeLabelStructV2 awemeLabelStructV2) {
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 1, awemeLabelStructV2.label_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, awemeLabelStructV2.label_type);
            protoWriter.writeBytes(awemeLabelStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<AwemeLabelStructV2, Builder> {
        public Integer label_type;
        public UrlStructV2 label_url;

        static {
            Covode.recordClassIndex(101898);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AwemeLabelStructV2 build() {
            return new AwemeLabelStructV2(this.label_url, this.label_type, super.buildUnknownFields());
        }

        public final Builder label_type(Integer num) {
            this.label_type = num;
            return this;
        }

        public final Builder label_url(UrlStructV2 urlStructV2) {
            this.label_url = urlStructV2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101897);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AwemeLabelStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AwemeLabelStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.label_url = this.label_url;
        builder.label_type = this.label_type;
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
        UrlStructV2 urlStructV2 = this.label_url;
        int i4 = 0;
        if (urlStructV2 != null) {
            i2 = urlStructV2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        Integer num = this.label_type;
        if (num != null) {
            i4 = num.hashCode();
        }
        int i6 = i5 + i4;
        this.hashCode = i6;
        return i6;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.label_url != null) {
            sb.append(", label_url=").append(this.label_url);
        }
        if (this.label_type != null) {
            sb.append(", label_type=").append(this.label_type);
        }
        return sb.replace(0, 2, "AwemeLabelStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeLabelStructV2)) {
            return false;
        }
        AwemeLabelStructV2 awemeLabelStructV2 = (AwemeLabelStructV2) obj;
        if (!unknownFields().equals(awemeLabelStructV2.unknownFields()) || !Internal.equals(this.label_url, awemeLabelStructV2.label_url) || !Internal.equals(this.label_type, awemeLabelStructV2.label_type)) {
            return false;
        }
        return true;
    }

    public AwemeLabelStructV2(UrlStructV2 urlStructV2, Integer num) {
        this(urlStructV2, num, i.EMPTY);
    }

    public AwemeLabelStructV2(UrlStructV2 urlStructV2, Integer num, i iVar) {
        super(ADAPTER, iVar);
        this.label_url = urlStructV2;
        this.label_type = num;
    }
}
