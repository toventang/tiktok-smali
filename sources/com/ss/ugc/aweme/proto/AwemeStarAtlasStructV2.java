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

/* access modifiers changed from: package-private */
public final class AwemeStarAtlasStructV2 extends Message<AwemeStarAtlasStructV2, Builder> {
    public static final ProtoAdapter<AwemeStarAtlasStructV2> ADAPTER = new ProtoAdapter_AwemeStarAtlasStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.StarAtlasLinkStructV2#ADAPTER", tag = 2)
    public StarAtlasLinkStructV2 link_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer review_status;

    static final class ProtoAdapter_AwemeStarAtlasStructV2 extends ProtoAdapter<AwemeStarAtlasStructV2> {
        static {
            Covode.recordClassIndex(101908);
        }

        public ProtoAdapter_AwemeStarAtlasStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeStarAtlasStructV2.class);
        }

        public final int encodedSize(AwemeStarAtlasStructV2 awemeStarAtlasStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, awemeStarAtlasStructV2.review_status) + StarAtlasLinkStructV2.ADAPTER.encodedSizeWithTag(2, awemeStarAtlasStructV2.link_info) + awemeStarAtlasStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AwemeStarAtlasStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.review_status(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.link_info(StarAtlasLinkStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AwemeStarAtlasStructV2 awemeStarAtlasStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, awemeStarAtlasStructV2.review_status);
            StarAtlasLinkStructV2.ADAPTER.encodeWithTag(protoWriter, 2, awemeStarAtlasStructV2.link_info);
            protoWriter.writeBytes(awemeStarAtlasStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<AwemeStarAtlasStructV2, Builder> {
        public StarAtlasLinkStructV2 link_info;
        public Integer review_status;

        static {
            Covode.recordClassIndex(101907);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AwemeStarAtlasStructV2 build() {
            return new AwemeStarAtlasStructV2(this.review_status, this.link_info, super.buildUnknownFields());
        }

        public final Builder link_info(StarAtlasLinkStructV2 starAtlasLinkStructV2) {
            this.link_info = starAtlasLinkStructV2;
            return this;
        }

        public final Builder review_status(Integer num) {
            this.review_status = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101906);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AwemeStarAtlasStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AwemeStarAtlasStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.review_status = this.review_status;
        builder.link_info = this.link_info;
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
        Integer num = this.review_status;
        int i4 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        StarAtlasLinkStructV2 starAtlasLinkStructV2 = this.link_info;
        if (starAtlasLinkStructV2 != null) {
            i4 = starAtlasLinkStructV2.hashCode();
        }
        int i6 = i5 + i4;
        this.hashCode = i6;
        return i6;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.review_status != null) {
            sb.append(", review_status=").append(this.review_status);
        }
        if (this.link_info != null) {
            sb.append(", link_info=").append(this.link_info);
        }
        return sb.replace(0, 2, "AwemeStarAtlasStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeStarAtlasStructV2)) {
            return false;
        }
        AwemeStarAtlasStructV2 awemeStarAtlasStructV2 = (AwemeStarAtlasStructV2) obj;
        if (!unknownFields().equals(awemeStarAtlasStructV2.unknownFields()) || !Internal.equals(this.review_status, awemeStarAtlasStructV2.review_status) || !Internal.equals(this.link_info, awemeStarAtlasStructV2.link_info)) {
            return false;
        }
        return true;
    }

    public AwemeStarAtlasStructV2(Integer num, StarAtlasLinkStructV2 starAtlasLinkStructV2) {
        this(num, starAtlasLinkStructV2, i.EMPTY);
    }

    public AwemeStarAtlasStructV2(Integer num, StarAtlasLinkStructV2 starAtlasLinkStructV2, i iVar) {
        super(ADAPTER, iVar);
        this.review_status = num;
        this.link_info = starAtlasLinkStructV2;
    }
}
