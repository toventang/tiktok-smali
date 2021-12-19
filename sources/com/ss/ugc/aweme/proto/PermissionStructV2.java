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

public final class PermissionStructV2 extends Message<PermissionStructV2, Builder> {
    public static final ProtoAdapter<PermissionStructV2> ADAPTER = new ProtoAdapter_PermissionStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer follow_toast;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer original_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer share_toast;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer shop_toast;

    public PermissionStructV2() {
    }

    static final class ProtoAdapter_PermissionStructV2 extends ProtoAdapter<PermissionStructV2> {
        static {
            Covode.recordClassIndex(102157);
        }

        public ProtoAdapter_PermissionStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, PermissionStructV2.class);
        }

        public final int encodedSize(PermissionStructV2 permissionStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, permissionStructV2.follow_toast) + ProtoAdapter.INT32.encodedSizeWithTag(2, permissionStructV2.original_list) + ProtoAdapter.INT32.encodedSizeWithTag(3, permissionStructV2.shop_toast) + ProtoAdapter.INT32.encodedSizeWithTag(4, permissionStructV2.share_toast) + permissionStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PermissionStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.follow_toast(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.original_list(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.shop_toast(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.share_toast(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, PermissionStructV2 permissionStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, permissionStructV2.follow_toast);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, permissionStructV2.original_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, permissionStructV2.shop_toast);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, permissionStructV2.share_toast);
            protoWriter.writeBytes(permissionStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102155);
    }

    public static final class Builder extends Message.Builder<PermissionStructV2, Builder> {
        public Integer follow_toast;
        public Integer original_list;
        public Integer share_toast;
        public Integer shop_toast;

        static {
            Covode.recordClassIndex(102156);
        }

        @Override // com.squareup.wire.Message.Builder
        public final PermissionStructV2 build() {
            return new PermissionStructV2(this.follow_toast, this.original_list, this.shop_toast, this.share_toast, super.buildUnknownFields());
        }

        public final Builder follow_toast(Integer num) {
            this.follow_toast = num;
            return this;
        }

        public final Builder original_list(Integer num) {
            this.original_list = num;
            return this;
        }

        public final Builder share_toast(Integer num) {
            this.share_toast = num;
            return this;
        }

        public final Builder shop_toast(Integer num) {
            this.shop_toast = num;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.PermissionStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<PermissionStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.follow_toast = this.follow_toast;
        builder.original_list = this.original_list;
        builder.shop_toast = this.shop_toast;
        builder.share_toast = this.share_toast;
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
        Integer num = this.follow_toast;
        int i6 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 37;
        Integer num2 = this.original_list;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        Integer num3 = this.shop_toast;
        if (num3 != null) {
            i4 = num3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 37;
        Integer num4 = this.share_toast;
        if (num4 != null) {
            i6 = num4.hashCode();
        }
        int i10 = i9 + i6;
        this.hashCode = i10;
        return i10;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.follow_toast != null) {
            sb.append(", follow_toast=").append(this.follow_toast);
        }
        if (this.original_list != null) {
            sb.append(", original_list=").append(this.original_list);
        }
        if (this.shop_toast != null) {
            sb.append(", shop_toast=").append(this.shop_toast);
        }
        if (this.share_toast != null) {
            sb.append(", share_toast=").append(this.share_toast);
        }
        return sb.replace(0, 2, "PermissionStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PermissionStructV2)) {
            return false;
        }
        PermissionStructV2 permissionStructV2 = (PermissionStructV2) obj;
        if (!unknownFields().equals(permissionStructV2.unknownFields()) || !Internal.equals(this.follow_toast, permissionStructV2.follow_toast) || !Internal.equals(this.original_list, permissionStructV2.original_list) || !Internal.equals(this.shop_toast, permissionStructV2.shop_toast) || !Internal.equals(this.share_toast, permissionStructV2.share_toast)) {
            return false;
        }
        return true;
    }

    public PermissionStructV2(Integer num, Integer num2, Integer num3, Integer num4) {
        this(num, num2, num3, num4, i.EMPTY);
    }

    public PermissionStructV2(Integer num, Integer num2, Integer num3, Integer num4, i iVar) {
        super(ADAPTER, iVar);
        this.follow_toast = num;
        this.original_list = num2;
        this.shop_toast = num3;
        this.share_toast = num4;
    }
}
