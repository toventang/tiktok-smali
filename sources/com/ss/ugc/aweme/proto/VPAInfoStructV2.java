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
public final class VPAInfoStructV2 extends Message<VPAInfoStructV2, Builder> {
    public static final ProtoAdapter<VPAInfoStructV2> ADAPTER = new ProtoAdapter_VPAInfoStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer show_info_bar_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public Boolean show_opt_out_button;

    static final class ProtoAdapter_VPAInfoStructV2 extends ProtoAdapter<VPAInfoStructV2> {
        static {
            Covode.recordClassIndex(102265);
        }

        public ProtoAdapter_VPAInfoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, VPAInfoStructV2.class);
        }

        public final int encodedSize(VPAInfoStructV2 vPAInfoStructV2) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, vPAInfoStructV2.show_opt_out_button) + ProtoAdapter.INT32.encodedSizeWithTag(2, vPAInfoStructV2.show_info_bar_type) + vPAInfoStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final VPAInfoStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.show_opt_out_button(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.show_info_bar_type(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, VPAInfoStructV2 vPAInfoStructV2) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, vPAInfoStructV2.show_opt_out_button);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, vPAInfoStructV2.show_info_bar_type);
            protoWriter.writeBytes(vPAInfoStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<VPAInfoStructV2, Builder> {
        public Integer show_info_bar_type;
        public Boolean show_opt_out_button;

        static {
            Covode.recordClassIndex(102264);
        }

        @Override // com.squareup.wire.Message.Builder
        public final VPAInfoStructV2 build() {
            return new VPAInfoStructV2(this.show_opt_out_button, this.show_info_bar_type, super.buildUnknownFields());
        }

        public final Builder show_info_bar_type(Integer num) {
            this.show_info_bar_type = num;
            return this;
        }

        public final Builder show_opt_out_button(Boolean bool) {
            this.show_opt_out_button = bool;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102263);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.VPAInfoStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<VPAInfoStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.show_opt_out_button = this.show_opt_out_button;
        builder.show_info_bar_type = this.show_info_bar_type;
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
        Boolean bool = this.show_opt_out_button;
        int i4 = 0;
        if (bool != null) {
            i2 = bool.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        Integer num = this.show_info_bar_type;
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
        if (this.show_opt_out_button != null) {
            sb.append(", show_opt_out_button=").append(this.show_opt_out_button);
        }
        if (this.show_info_bar_type != null) {
            sb.append(", show_info_bar_type=").append(this.show_info_bar_type);
        }
        return sb.replace(0, 2, "VPAInfoStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VPAInfoStructV2)) {
            return false;
        }
        VPAInfoStructV2 vPAInfoStructV2 = (VPAInfoStructV2) obj;
        if (!unknownFields().equals(vPAInfoStructV2.unknownFields()) || !Internal.equals(this.show_opt_out_button, vPAInfoStructV2.show_opt_out_button) || !Internal.equals(this.show_info_bar_type, vPAInfoStructV2.show_info_bar_type)) {
            return false;
        }
        return true;
    }

    public VPAInfoStructV2(Boolean bool, Integer num) {
        this(bool, num, i.EMPTY);
    }

    public VPAInfoStructV2(Boolean bool, Integer num, i iVar) {
        super(ADAPTER, iVar);
        this.show_opt_out_button = bool;
        this.show_info_bar_type = num;
    }
}
