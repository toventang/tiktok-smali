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

public final class PositionStructV2 extends Message<PositionStructV2, Builder> {
    public static final ProtoAdapter<PositionStructV2> ADAPTER = new ProtoAdapter_PositionStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer begin;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer end;

    public PositionStructV2() {
    }

    static final class ProtoAdapter_PositionStructV2 extends ProtoAdapter<PositionStructV2> {
        static {
            Covode.recordClassIndex(102169);
        }

        public ProtoAdapter_PositionStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, PositionStructV2.class);
        }

        public final int encodedSize(PositionStructV2 positionStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, positionStructV2.begin) + ProtoAdapter.INT32.encodedSizeWithTag(2, positionStructV2.end) + positionStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PositionStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.begin(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.end(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, PositionStructV2 positionStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, positionStructV2.begin);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, positionStructV2.end);
            protoWriter.writeBytes(positionStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<PositionStructV2, Builder> {
        public Integer begin;
        public Integer end;

        static {
            Covode.recordClassIndex(102168);
        }

        @Override // com.squareup.wire.Message.Builder
        public final PositionStructV2 build() {
            return new PositionStructV2(this.begin, this.end, super.buildUnknownFields());
        }

        public final Builder begin(Integer num) {
            this.begin = num;
            return this;
        }

        public final Builder end(Integer num) {
            this.end = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102167);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.PositionStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<PositionStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.begin = this.begin;
        builder.end = this.end;
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
        Integer num = this.begin;
        int i4 = 0;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        Integer num2 = this.end;
        if (num2 != null) {
            i4 = num2.hashCode();
        }
        int i6 = i5 + i4;
        this.hashCode = i6;
        return i6;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.begin != null) {
            sb.append(", begin=").append(this.begin);
        }
        if (this.end != null) {
            sb.append(", end=").append(this.end);
        }
        return sb.replace(0, 2, "PositionStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PositionStructV2)) {
            return false;
        }
        PositionStructV2 positionStructV2 = (PositionStructV2) obj;
        if (!unknownFields().equals(positionStructV2.unknownFields()) || !Internal.equals(this.begin, positionStructV2.begin) || !Internal.equals(this.end, positionStructV2.end)) {
            return false;
        }
        return true;
    }

    public PositionStructV2(Integer num, Integer num2) {
        this(num, num2, i.EMPTY);
    }

    public PositionStructV2(Integer num, Integer num2, i iVar) {
        super(ADAPTER, iVar);
        this.begin = num;
        this.end = num2;
    }
}
