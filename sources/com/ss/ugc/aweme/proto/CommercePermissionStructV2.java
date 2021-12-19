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

public final class CommercePermissionStructV2 extends Message<CommercePermissionStructV2, Builder> {
    public static final ProtoAdapter<CommercePermissionStructV2> ADAPTER = new ProtoAdapter_CommercePermissionStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer ad_link;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer star_atlas_order;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer top_item;

    public CommercePermissionStructV2() {
    }

    static final class ProtoAdapter_CommercePermissionStructV2 extends ProtoAdapter<CommercePermissionStructV2> {
        static {
            Covode.recordClassIndex(101971);
        }

        public ProtoAdapter_CommercePermissionStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CommercePermissionStructV2.class);
        }

        public final int encodedSize(CommercePermissionStructV2 commercePermissionStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, commercePermissionStructV2.top_item) + ProtoAdapter.INT32.encodedSizeWithTag(2, commercePermissionStructV2.ad_link) + ProtoAdapter.INT32.encodedSizeWithTag(3, commercePermissionStructV2.star_atlas_order) + commercePermissionStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CommercePermissionStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.top_item(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.ad_link(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.star_atlas_order(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CommercePermissionStructV2 commercePermissionStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, commercePermissionStructV2.top_item);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, commercePermissionStructV2.ad_link);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, commercePermissionStructV2.star_atlas_order);
            protoWriter.writeBytes(commercePermissionStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<CommercePermissionStructV2, Builder> {
        public Integer ad_link;
        public Integer star_atlas_order;
        public Integer top_item;

        static {
            Covode.recordClassIndex(101970);
        }

        @Override // com.squareup.wire.Message.Builder
        public final CommercePermissionStructV2 build() {
            return new CommercePermissionStructV2(this.top_item, this.ad_link, this.star_atlas_order, super.buildUnknownFields());
        }

        public final Builder ad_link(Integer num) {
            this.ad_link = num;
            return this;
        }

        public final Builder star_atlas_order(Integer num) {
            this.star_atlas_order = num;
            return this;
        }

        public final Builder top_item(Integer num) {
            this.top_item = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101969);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.CommercePermissionStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<CommercePermissionStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.top_item = this.top_item;
        builder.ad_link = this.ad_link;
        builder.star_atlas_order = this.star_atlas_order;
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
        Integer num = this.top_item;
        int i5 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 37;
        Integer num2 = this.ad_link;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        Integer num3 = this.star_atlas_order;
        if (num3 != null) {
            i5 = num3.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.top_item != null) {
            sb.append(", top_item=").append(this.top_item);
        }
        if (this.ad_link != null) {
            sb.append(", ad_link=").append(this.ad_link);
        }
        if (this.star_atlas_order != null) {
            sb.append(", star_atlas_order=").append(this.star_atlas_order);
        }
        return sb.replace(0, 2, "CommercePermissionStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommercePermissionStructV2)) {
            return false;
        }
        CommercePermissionStructV2 commercePermissionStructV2 = (CommercePermissionStructV2) obj;
        if (!unknownFields().equals(commercePermissionStructV2.unknownFields()) || !Internal.equals(this.top_item, commercePermissionStructV2.top_item) || !Internal.equals(this.ad_link, commercePermissionStructV2.ad_link) || !Internal.equals(this.star_atlas_order, commercePermissionStructV2.star_atlas_order)) {
            return false;
        }
        return true;
    }

    public CommercePermissionStructV2(Integer num, Integer num2, Integer num3) {
        this(num, num2, num3, i.EMPTY);
    }

    public CommercePermissionStructV2(Integer num, Integer num2, Integer num3, i iVar) {
        super(ADAPTER, iVar);
        this.top_item = num;
        this.ad_link = num2;
        this.star_atlas_order = num3;
    }
}
