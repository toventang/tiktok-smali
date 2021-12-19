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

public final class MixStatusStructV2 extends Message<MixStatusStructV2, Builder> {
    public static final ProtoAdapter<MixStatusStructV2> ADAPTER = new ProtoAdapter_MixStatusStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer is_collected;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 1)
    public Integer status;

    public MixStatusStructV2() {
    }

    static final class ProtoAdapter_MixStatusStructV2 extends ProtoAdapter<MixStatusStructV2> {
        static {
            Covode.recordClassIndex(102115);
        }

        public ProtoAdapter_MixStatusStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MixStatusStructV2.class);
        }

        public final int encodedSize(MixStatusStructV2 mixStatusStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, mixStatusStructV2.status) + ProtoAdapter.INT32.encodedSizeWithTag(2, mixStatusStructV2.is_collected) + mixStatusStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MixStatusStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.status(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.is_collected(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MixStatusStructV2 mixStatusStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, mixStatusStructV2.status);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, mixStatusStructV2.is_collected);
            protoWriter.writeBytes(mixStatusStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102113);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.MixStatusStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MixStatusStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.status = this.status;
        builder.is_collected = this.is_collected;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public static final class Builder extends Message.Builder<MixStatusStructV2, Builder> {
        public Integer is_collected;
        public Integer status;

        static {
            Covode.recordClassIndex(102114);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MixStatusStructV2 build() {
            Integer num = this.status;
            if (num != null) {
                return new MixStatusStructV2(this.status, this.is_collected, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "status");
        }

        public final Builder is_collected(Integer num) {
            this.is_collected = num;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.status.hashCode()) * 37;
        Integer num = this.is_collected;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = hashCode + i2;
        this.hashCode = i4;
        return i4;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", status=").append(this.status);
        if (this.is_collected != null) {
            sb.append(", is_collected=").append(this.is_collected);
        }
        return sb.replace(0, 2, "MixStatusStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MixStatusStructV2)) {
            return false;
        }
        MixStatusStructV2 mixStatusStructV2 = (MixStatusStructV2) obj;
        if (!unknownFields().equals(mixStatusStructV2.unknownFields()) || !this.status.equals(mixStatusStructV2.status) || !Internal.equals(this.is_collected, mixStatusStructV2.is_collected)) {
            return false;
        }
        return true;
    }

    public MixStatusStructV2(Integer num, Integer num2) {
        this(num, num2, i.EMPTY);
    }

    public MixStatusStructV2(Integer num, Integer num2, i iVar) {
        super(ADAPTER, iVar);
        this.status = num;
        this.is_collected = num2;
    }
}
