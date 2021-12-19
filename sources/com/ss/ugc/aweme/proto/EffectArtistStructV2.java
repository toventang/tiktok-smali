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

public final class EffectArtistStructV2 extends Message<EffectArtistStructV2, Builder> {
    public static final ProtoAdapter<EffectArtistStructV2> ADAPTER = new ProtoAdapter_EffectArtistStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer total;

    public EffectArtistStructV2() {
    }

    static final class ProtoAdapter_EffectArtistStructV2 extends ProtoAdapter<EffectArtistStructV2> {
        static {
            Covode.recordClassIndex(101998);
        }

        public ProtoAdapter_EffectArtistStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, EffectArtistStructV2.class);
        }

        public final int encodedSize(EffectArtistStructV2 effectArtistStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, effectArtistStructV2.total) + effectArtistStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final EffectArtistStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.total(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, EffectArtistStructV2 effectArtistStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, effectArtistStructV2.total);
            protoWriter.writeBytes(effectArtistStructV2.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<EffectArtistStructV2, Builder> {
        public Integer total;

        static {
            Covode.recordClassIndex(101997);
        }

        @Override // com.squareup.wire.Message.Builder
        public final EffectArtistStructV2 build() {
            return new EffectArtistStructV2(this.total, super.buildUnknownFields());
        }

        public final Builder total(Integer num) {
            this.total = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101996);
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.total;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = hashCode + i2;
        this.hashCode = i4;
        return i4;
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.EffectArtistStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<EffectArtistStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.total = this.total;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.total != null) {
            sb.append(", total=").append(this.total);
        }
        return sb.replace(0, 2, "EffectArtistStructV2{").append('}').toString();
    }

    public EffectArtistStructV2(Integer num) {
        this(num, i.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EffectArtistStructV2)) {
            return false;
        }
        EffectArtistStructV2 effectArtistStructV2 = (EffectArtistStructV2) obj;
        if (!unknownFields().equals(effectArtistStructV2.unknownFields()) || !Internal.equals(this.total, effectArtistStructV2.total)) {
            return false;
        }
        return true;
    }

    public EffectArtistStructV2(Integer num, i iVar) {
        super(ADAPTER, iVar);
        this.total = num;
    }
}
