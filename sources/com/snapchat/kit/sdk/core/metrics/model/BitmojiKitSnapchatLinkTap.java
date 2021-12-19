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

public final class BitmojiKitSnapchatLinkTap extends Message<BitmojiKitSnapchatLinkTap, Builder> {
    public static final ProtoAdapter<BitmojiKitSnapchatLinkTap> ADAPTER = new ProtoAdapter_BitmojiKitSnapchatLinkTap();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase#ADAPTER", tag = 1)
    public final BitmojiKitEventBase bitmoji_kit_event_base;

    static final class ProtoAdapter_BitmojiKitSnapchatLinkTap extends ProtoAdapter<BitmojiKitSnapchatLinkTap> {
        static {
            Covode.recordClassIndex(35674);
        }

        public ProtoAdapter_BitmojiKitSnapchatLinkTap() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitSnapchatLinkTap.class);
        }

        public final int encodedSize(BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap) {
            return BitmojiKitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitSnapchatLinkTap.bitmoji_kit_event_base) + bitmojiKitSnapchatLinkTap.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = r2.bitmoji_kit_event_base
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase> r1 = com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = r2.bitmoji_kit_event_base
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase) r0
                r2.bitmoji_kit_event_base = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap.ProtoAdapter_BitmojiKitSnapchatLinkTap.redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap):com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BitmojiKitSnapchatLinkTap decode(ProtoReader protoReader) {
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

        public final void encode(ProtoWriter protoWriter, BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap) {
            BitmojiKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitSnapchatLinkTap.bitmoji_kit_event_base);
            protoWriter.writeBytes(bitmojiKitSnapchatLinkTap.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BitmojiKitSnapchatLinkTap, Builder> {
        public BitmojiKitEventBase bitmoji_kit_event_base;

        static {
            Covode.recordClassIndex(35673);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BitmojiKitSnapchatLinkTap build() {
            return new BitmojiKitSnapchatLinkTap(this.bitmoji_kit_event_base, super.buildUnknownFields());
        }

        public final Builder bitmoji_kit_event_base(BitmojiKitEventBase bitmojiKitEventBase) {
            this.bitmoji_kit_event_base = bitmojiKitEventBase;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35672);
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

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BitmojiKitSnapchatLinkTap, Builder> newBuilder() {
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
        return sb.replace(0, 2, "BitmojiKitSnapchatLinkTap{").append('}').toString();
    }

    public BitmojiKitSnapchatLinkTap(BitmojiKitEventBase bitmojiKitEventBase) {
        this(bitmojiKitEventBase, i.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitSnapchatLinkTap)) {
            return false;
        }
        BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap = (BitmojiKitSnapchatLinkTap) obj;
        if (!unknownFields().equals(bitmojiKitSnapchatLinkTap.unknownFields()) || !Internal.equals(this.bitmoji_kit_event_base, bitmojiKitSnapchatLinkTap.bitmoji_kit_event_base)) {
            return false;
        }
        return true;
    }

    public BitmojiKitSnapchatLinkTap(BitmojiKitEventBase bitmojiKitEventBase, i iVar) {
        super(ADAPTER, iVar);
        this.bitmoji_kit_event_base = bitmojiKitEventBase;
    }
}
