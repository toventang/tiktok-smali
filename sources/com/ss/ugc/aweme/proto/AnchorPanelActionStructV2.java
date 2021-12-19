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

public final class AnchorPanelActionStructV2 extends Message<AnchorPanelActionStructV2, Builder> {
    public static final ProtoAdapter<AnchorPanelActionStructV2> ADAPTER = new ProtoAdapter_AnchorPanelActionStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer action_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 1)
    public UrlStructV2 icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String schema;

    public AnchorPanelActionStructV2() {
    }

    static final class ProtoAdapter_AnchorPanelActionStructV2 extends ProtoAdapter<AnchorPanelActionStructV2> {
        static {
            Covode.recordClassIndex(101851);
        }

        public ProtoAdapter_AnchorPanelActionStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AnchorPanelActionStructV2.class);
        }

        public final int encodedSize(AnchorPanelActionStructV2 anchorPanelActionStructV2) {
            return UrlStructV2.ADAPTER.encodedSizeWithTag(1, anchorPanelActionStructV2.icon) + ProtoAdapter.STRING.encodedSizeWithTag(2, anchorPanelActionStructV2.schema) + ProtoAdapter.INT32.encodedSizeWithTag(3, anchorPanelActionStructV2.action_type) + anchorPanelActionStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnchorPanelActionStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.icon(UrlStructV2.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.schema(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.action_type(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AnchorPanelActionStructV2 anchorPanelActionStructV2) {
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 1, anchorPanelActionStructV2.icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, anchorPanelActionStructV2.schema);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, anchorPanelActionStructV2.action_type);
            protoWriter.writeBytes(anchorPanelActionStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<AnchorPanelActionStructV2, Builder> {
        public Integer action_type;
        public UrlStructV2 icon;
        public String schema;

        static {
            Covode.recordClassIndex(101850);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AnchorPanelActionStructV2 build() {
            return new AnchorPanelActionStructV2(this.icon, this.schema, this.action_type, super.buildUnknownFields());
        }

        public final Builder action_type(Integer num) {
            this.action_type = num;
            return this;
        }

        public final Builder icon(UrlStructV2 urlStructV2) {
            this.icon = urlStructV2;
            return this;
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101849);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AnchorPanelActionStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AnchorPanelActionStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.icon = this.icon;
        builder.schema = this.schema;
        builder.action_type = this.action_type;
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
        UrlStructV2 urlStructV2 = this.icon;
        int i5 = 0;
        if (urlStructV2 != null) {
            i2 = urlStructV2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        String str = this.schema;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        Integer num = this.action_type;
        if (num != null) {
            i5 = num.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.icon != null) {
            sb.append(", icon=").append(this.icon);
        }
        if (this.schema != null) {
            sb.append(", schema=").append(this.schema);
        }
        if (this.action_type != null) {
            sb.append(", action_type=").append(this.action_type);
        }
        return sb.replace(0, 2, "AnchorPanelActionStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnchorPanelActionStructV2)) {
            return false;
        }
        AnchorPanelActionStructV2 anchorPanelActionStructV2 = (AnchorPanelActionStructV2) obj;
        if (!unknownFields().equals(anchorPanelActionStructV2.unknownFields()) || !Internal.equals(this.icon, anchorPanelActionStructV2.icon) || !Internal.equals(this.schema, anchorPanelActionStructV2.schema) || !Internal.equals(this.action_type, anchorPanelActionStructV2.action_type)) {
            return false;
        }
        return true;
    }

    public AnchorPanelActionStructV2(UrlStructV2 urlStructV2, String str, Integer num) {
        this(urlStructV2, str, num, i.EMPTY);
    }

    public AnchorPanelActionStructV2(UrlStructV2 urlStructV2, String str, Integer num, i iVar) {
        super(ADAPTER, iVar);
        this.icon = urlStructV2;
        this.schema = str;
        this.action_type = num;
    }
}
