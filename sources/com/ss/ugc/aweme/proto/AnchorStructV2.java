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

public final class AnchorStructV2 extends Message<AnchorStructV2, Builder> {
    public static final ProtoAdapter<AnchorStructV2> ADAPTER = new ProtoAdapter_AnchorStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public String anchor_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AnchorCommonStructV2#ADAPTER", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public AnchorCommonStructV2 anchor_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer business_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AnchorShopLinkStructV2#ADAPTER", tag = 4)
    public AnchorShopLinkStructV2 shop_link;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer show_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AnchorWikipediaStructV2#ADAPTER", tag = 3)
    public AnchorWikipediaStructV2 wikipedia_info;

    public AnchorStructV2() {
    }

    static final class ProtoAdapter_AnchorStructV2 extends ProtoAdapter<AnchorStructV2> {
        static {
            Covode.recordClassIndex(101857);
        }

        public ProtoAdapter_AnchorStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AnchorStructV2.class);
        }

        public final int encodedSize(AnchorStructV2 anchorStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, anchorStructV2.show_type) + ProtoAdapter.INT32.encodedSizeWithTag(2, anchorStructV2.business_type) + AnchorWikipediaStructV2.ADAPTER.encodedSizeWithTag(3, anchorStructV2.wikipedia_info) + AnchorShopLinkStructV2.ADAPTER.encodedSizeWithTag(4, anchorStructV2.shop_link) + AnchorCommonStructV2.ADAPTER.encodedSizeWithTag(5, anchorStructV2.anchor_info) + ProtoAdapter.STRING.encodedSizeWithTag(6, anchorStructV2.anchor_id) + anchorStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnchorStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.show_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.business_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.wikipedia_info(AnchorWikipediaStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.shop_link(AnchorShopLinkStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.anchor_info(AnchorCommonStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.anchor_id(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AnchorStructV2 anchorStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, anchorStructV2.show_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, anchorStructV2.business_type);
            AnchorWikipediaStructV2.ADAPTER.encodeWithTag(protoWriter, 3, anchorStructV2.wikipedia_info);
            AnchorShopLinkStructV2.ADAPTER.encodeWithTag(protoWriter, 4, anchorStructV2.shop_link);
            AnchorCommonStructV2.ADAPTER.encodeWithTag(protoWriter, 5, anchorStructV2.anchor_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, anchorStructV2.anchor_id);
            protoWriter.writeBytes(anchorStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(101855);
    }

    public static final class Builder extends Message.Builder<AnchorStructV2, Builder> {
        public String anchor_id;
        public AnchorCommonStructV2 anchor_info;
        public Integer business_type;
        public AnchorShopLinkStructV2 shop_link;
        public Integer show_type;
        public AnchorWikipediaStructV2 wikipedia_info;

        static {
            Covode.recordClassIndex(101856);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AnchorStructV2 build() {
            return new AnchorStructV2(this.show_type, this.business_type, this.wikipedia_info, this.shop_link, this.anchor_info, this.anchor_id, super.buildUnknownFields());
        }

        public final Builder anchor_id(String str) {
            this.anchor_id = str;
            return this;
        }

        public final Builder anchor_info(AnchorCommonStructV2 anchorCommonStructV2) {
            this.anchor_info = anchorCommonStructV2;
            return this;
        }

        public final Builder business_type(Integer num) {
            this.business_type = num;
            return this;
        }

        public final Builder shop_link(AnchorShopLinkStructV2 anchorShopLinkStructV2) {
            this.shop_link = anchorShopLinkStructV2;
            return this;
        }

        public final Builder show_type(Integer num) {
            this.show_type = num;
            return this;
        }

        public final Builder wikipedia_info(AnchorWikipediaStructV2 anchorWikipediaStructV2) {
            this.wikipedia_info = anchorWikipediaStructV2;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.AnchorStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AnchorStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.show_type = this.show_type;
        builder.business_type = this.business_type;
        builder.wikipedia_info = this.wikipedia_info;
        builder.shop_link = this.shop_link;
        builder.anchor_info = this.anchor_info;
        builder.anchor_id = this.anchor_id;
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
        Integer num = this.show_type;
        int i8 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (hashCode + i2) * 37;
        Integer num2 = this.business_type;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        AnchorWikipediaStructV2 anchorWikipediaStructV2 = this.wikipedia_info;
        if (anchorWikipediaStructV2 != null) {
            i4 = anchorWikipediaStructV2.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        AnchorShopLinkStructV2 anchorShopLinkStructV2 = this.shop_link;
        if (anchorShopLinkStructV2 != null) {
            i5 = anchorShopLinkStructV2.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        AnchorCommonStructV2 anchorCommonStructV2 = this.anchor_info;
        if (anchorCommonStructV2 != null) {
            i6 = anchorCommonStructV2.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 37;
        String str = this.anchor_id;
        if (str != null) {
            i8 = str.hashCode();
        }
        int i14 = i13 + i8;
        this.hashCode = i14;
        return i14;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.show_type != null) {
            sb.append(", show_type=").append(this.show_type);
        }
        if (this.business_type != null) {
            sb.append(", business_type=").append(this.business_type);
        }
        if (this.wikipedia_info != null) {
            sb.append(", wikipedia_info=").append(this.wikipedia_info);
        }
        if (this.shop_link != null) {
            sb.append(", shop_link=").append(this.shop_link);
        }
        if (this.anchor_info != null) {
            sb.append(", anchor_info=").append(this.anchor_info);
        }
        if (this.anchor_id != null) {
            sb.append(", anchor_id=").append(this.anchor_id);
        }
        return sb.replace(0, 2, "AnchorStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnchorStructV2)) {
            return false;
        }
        AnchorStructV2 anchorStructV2 = (AnchorStructV2) obj;
        if (!unknownFields().equals(anchorStructV2.unknownFields()) || !Internal.equals(this.show_type, anchorStructV2.show_type) || !Internal.equals(this.business_type, anchorStructV2.business_type) || !Internal.equals(this.wikipedia_info, anchorStructV2.wikipedia_info) || !Internal.equals(this.shop_link, anchorStructV2.shop_link) || !Internal.equals(this.anchor_info, anchorStructV2.anchor_info) || !Internal.equals(this.anchor_id, anchorStructV2.anchor_id)) {
            return false;
        }
        return true;
    }

    public AnchorStructV2(Integer num, Integer num2, AnchorWikipediaStructV2 anchorWikipediaStructV2, AnchorShopLinkStructV2 anchorShopLinkStructV2, AnchorCommonStructV2 anchorCommonStructV2, String str) {
        this(num, num2, anchorWikipediaStructV2, anchorShopLinkStructV2, anchorCommonStructV2, str, i.EMPTY);
    }

    public AnchorStructV2(Integer num, Integer num2, AnchorWikipediaStructV2 anchorWikipediaStructV2, AnchorShopLinkStructV2 anchorShopLinkStructV2, AnchorCommonStructV2 anchorCommonStructV2, String str, i iVar) {
        super(ADAPTER, iVar);
        this.show_type = num;
        this.business_type = num2;
        this.wikipedia_info = anchorWikipediaStructV2;
        this.shop_link = anchorShopLinkStructV2;
        this.anchor_info = anchorCommonStructV2;
        this.anchor_id = str;
    }
}
