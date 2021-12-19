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

public final class AnchorShopLinkStructV2 extends Message<AnchorShopLinkStructV2, Builder> {
    public static final ProtoAdapter<AnchorShopLinkStructV2> ADAPTER = new ProtoAdapter_AnchorShopLinkStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String keyword;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String url;

    public AnchorShopLinkStructV2() {
    }

    static final class ProtoAdapter_AnchorShopLinkStructV2 extends ProtoAdapter<AnchorShopLinkStructV2> {
        static {
            Covode.recordClassIndex(101854);
        }

        public ProtoAdapter_AnchorShopLinkStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AnchorShopLinkStructV2.class);
        }

        public final int encodedSize(AnchorShopLinkStructV2 anchorShopLinkStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, anchorShopLinkStructV2.keyword) + ProtoAdapter.STRING.encodedSizeWithTag(2, anchorShopLinkStructV2.url) + anchorShopLinkStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnchorShopLinkStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.keyword(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.url(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AnchorShopLinkStructV2 anchorShopLinkStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, anchorShopLinkStructV2.keyword);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, anchorShopLinkStructV2.url);
            protoWriter.writeBytes(anchorShopLinkStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<AnchorShopLinkStructV2, Builder> {
        public String keyword;
        public String url;

        static {
            Covode.recordClassIndex(101853);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AnchorShopLinkStructV2 build() {
            return new AnchorShopLinkStructV2(this.keyword, this.url, super.buildUnknownFields());
        }

        public final Builder keyword(String str) {
            this.keyword = str;
            return this;
        }

        public final Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101852);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AnchorShopLinkStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AnchorShopLinkStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.keyword = this.keyword;
        builder.url = this.url;
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
        String str = this.keyword;
        int i4 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        String str2 = this.url;
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
        if (this.keyword != null) {
            sb.append(", keyword=").append(this.keyword);
        }
        if (this.url != null) {
            sb.append(", url=").append(this.url);
        }
        return sb.replace(0, 2, "AnchorShopLinkStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnchorShopLinkStructV2)) {
            return false;
        }
        AnchorShopLinkStructV2 anchorShopLinkStructV2 = (AnchorShopLinkStructV2) obj;
        if (!unknownFields().equals(anchorShopLinkStructV2.unknownFields()) || !Internal.equals(this.keyword, anchorShopLinkStructV2.keyword) || !Internal.equals(this.url, anchorShopLinkStructV2.url)) {
            return false;
        }
        return true;
    }

    public AnchorShopLinkStructV2(String str, String str2) {
        this(str, str2, i.EMPTY);
    }

    public AnchorShopLinkStructV2(String str, String str2, i iVar) {
        super(ADAPTER, iVar);
        this.keyword = str;
        this.url = str2;
    }
}
