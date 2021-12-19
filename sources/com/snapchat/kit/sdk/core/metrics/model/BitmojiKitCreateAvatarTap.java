package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import k.i;

public final class BitmojiKitCreateAvatarTap extends Message<BitmojiKitCreateAvatarTap, Builder> {
    public static final ProtoAdapter<BitmojiKitCreateAvatarTap> ADAPTER = new ProtoAdapter_BitmojiKitCreateAvatarTap();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase#ADAPTER", tag = 1)
    public final BitmojiKitEventBase bitmoji_kit_event_base;

    static final class ProtoAdapter_BitmojiKitCreateAvatarTap extends ProtoAdapter<BitmojiKitCreateAvatarTap> {
        static {
            Covode.recordClassIndex(35642);
        }

        public ProtoAdapter_BitmojiKitCreateAvatarTap() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitCreateAvatarTap.class);
        }

        public final int encodedSize(BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap) {
            return BitmojiKitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitCreateAvatarTap.bitmoji_kit_event_base) + bitmojiKitCreateAvatarTap.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = r2.bitmoji_kit_event_base
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase> r1 = com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = r2.bitmoji_kit_event_base
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase) r0
                r2.bitmoji_kit_event_base = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap.ProtoAdapter_BitmojiKitCreateAvatarTap.redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap):com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BitmojiKitCreateAvatarTap decode(ProtoReader protoReader) {
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
                    builder.bitmoji_kit_event_base(BitmojiKitEventBase.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap) {
            BitmojiKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitCreateAvatarTap.bitmoji_kit_event_base);
            protoWriter.writeBytes(bitmojiKitCreateAvatarTap.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BitmojiKitCreateAvatarTap, Builder> {
        public BitmojiKitEventBase bitmoji_kit_event_base;

        static {
            Covode.recordClassIndex(35641);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BitmojiKitCreateAvatarTap build() {
            return new BitmojiKitCreateAvatarTap(this.bitmoji_kit_event_base, super.buildUnknownFields());
        }

        public final Builder bitmoji_kit_event_base(BitmojiKitEventBase bitmojiKitEventBase) {
            this.bitmoji_kit_event_base = bitmojiKitEventBase;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35640);
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BitmojiKitEventBase bitmojiKitEventBase = this.bitmoji_kit_event_base;
        if (bitmojiKitEventBase != null) {
            i2 = bitmojiKitEventBase.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = hashCode + i2;
        this.hashCode = i4;
        return i4;
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BitmojiKitCreateAvatarTap, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.bitmoji_kit_event_base = this.bitmoji_kit_event_base;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bitmoji_kit_event_base != null) {
            sb.append(", bitmoji_kit_event_base=").append(this.bitmoji_kit_event_base);
        }
        return sb.replace(0, 2, "BitmojiKitCreateAvatarTap{").append('}').toString();
    }

    public BitmojiKitCreateAvatarTap(BitmojiKitEventBase bitmojiKitEventBase) {
        this(bitmojiKitEventBase, i.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitCreateAvatarTap)) {
            return false;
        }
        BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap = (BitmojiKitCreateAvatarTap) obj;
        if (!unknownFields().equals(bitmojiKitCreateAvatarTap.unknownFields()) || !Internal.equals(this.bitmoji_kit_event_base, bitmojiKitCreateAvatarTap.bitmoji_kit_event_base)) {
            return false;
        }
        return true;
    }

    public BitmojiKitCreateAvatarTap(BitmojiKitEventBase bitmojiKitEventBase, i iVar) {
        super(ADAPTER, iVar);
        this.bitmoji_kit_event_base = bitmojiKitEventBase;
    }
}
