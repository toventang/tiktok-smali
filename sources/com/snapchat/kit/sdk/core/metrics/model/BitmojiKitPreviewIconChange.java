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

public final class BitmojiKitPreviewIconChange extends Message<BitmojiKitPreviewIconChange, Builder> {
    public static final ProtoAdapter<BitmojiKitPreviewIconChange> ADAPTER = new ProtoAdapter_BitmojiKitPreviewIconChange();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase#ADAPTER", tag = 1)
    public final BitmojiKitEventBase bitmoji_kit_event_base;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String preview_sticker_id;

    static final class ProtoAdapter_BitmojiKitPreviewIconChange extends ProtoAdapter<BitmojiKitPreviewIconChange> {
        static {
            Covode.recordClassIndex(35653);
        }

        public ProtoAdapter_BitmojiKitPreviewIconChange() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitPreviewIconChange.class);
        }

        public final int encodedSize(BitmojiKitPreviewIconChange bitmojiKitPreviewIconChange) {
            return BitmojiKitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitPreviewIconChange.bitmoji_kit_event_base) + ProtoAdapter.STRING.encodedSizeWithTag(2, bitmojiKitPreviewIconChange.preview_sticker_id) + bitmojiKitPreviewIconChange.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPreviewIconChange$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPreviewIconChange redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPreviewIconChange r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPreviewIconChange$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = r2.bitmoji_kit_event_base
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase> r1 = com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = r2.bitmoji_kit_event_base
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase) r0
                r2.bitmoji_kit_event_base = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPreviewIconChange r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPreviewIconChange.ProtoAdapter_BitmojiKitPreviewIconChange.redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPreviewIconChange):com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPreviewIconChange");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BitmojiKitPreviewIconChange decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.bitmoji_kit_event_base(BitmojiKitEventBase.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.preview_sticker_id(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BitmojiKitPreviewIconChange bitmojiKitPreviewIconChange) {
            BitmojiKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitPreviewIconChange.bitmoji_kit_event_base);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bitmojiKitPreviewIconChange.preview_sticker_id);
            protoWriter.writeBytes(bitmojiKitPreviewIconChange.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BitmojiKitPreviewIconChange, Builder> {
        public BitmojiKitEventBase bitmoji_kit_event_base;
        public String preview_sticker_id;

        static {
            Covode.recordClassIndex(35652);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BitmojiKitPreviewIconChange build() {
            return new BitmojiKitPreviewIconChange(this.bitmoji_kit_event_base, this.preview_sticker_id, super.buildUnknownFields());
        }

        public final Builder bitmoji_kit_event_base(BitmojiKitEventBase bitmojiKitEventBase) {
            this.bitmoji_kit_event_base = bitmojiKitEventBase;
            return this;
        }

        public final Builder preview_sticker_id(String str) {
            this.preview_sticker_id = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35651);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPreviewIconChange$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BitmojiKitPreviewIconChange, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.bitmoji_kit_event_base = this.bitmoji_kit_event_base;
        builder.preview_sticker_id = this.preview_sticker_id;
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
        BitmojiKitEventBase bitmojiKitEventBase = this.bitmoji_kit_event_base;
        int i4 = 0;
        if (bitmojiKitEventBase != null) {
            i2 = bitmojiKitEventBase.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        String str = this.preview_sticker_id;
        if (str != null) {
            i4 = str.hashCode();
        }
        int i6 = i5 + i4;
        this.hashCode = i6;
        return i6;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bitmoji_kit_event_base != null) {
            sb.append(", bitmoji_kit_event_base=").append(this.bitmoji_kit_event_base);
        }
        if (this.preview_sticker_id != null) {
            sb.append(", preview_sticker_id=").append(this.preview_sticker_id);
        }
        return sb.replace(0, 2, "BitmojiKitPreviewIconChange{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitPreviewIconChange)) {
            return false;
        }
        BitmojiKitPreviewIconChange bitmojiKitPreviewIconChange = (BitmojiKitPreviewIconChange) obj;
        if (!unknownFields().equals(bitmojiKitPreviewIconChange.unknownFields()) || !Internal.equals(this.bitmoji_kit_event_base, bitmojiKitPreviewIconChange.bitmoji_kit_event_base) || !Internal.equals(this.preview_sticker_id, bitmojiKitPreviewIconChange.preview_sticker_id)) {
            return false;
        }
        return true;
    }

    public BitmojiKitPreviewIconChange(BitmojiKitEventBase bitmojiKitEventBase, String str) {
        this(bitmojiKitEventBase, str, i.EMPTY);
    }

    public BitmojiKitPreviewIconChange(BitmojiKitEventBase bitmojiKitEventBase, String str, i iVar) {
        super(ADAPTER, iVar);
        this.bitmoji_kit_event_base = bitmojiKitEventBase;
        this.preview_sticker_id = str;
    }
}
