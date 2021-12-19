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

public final class BitmojiKitStickerPickerClose extends Message<BitmojiKitStickerPickerClose, Builder> {
    public static final ProtoAdapter<BitmojiKitStickerPickerClose> ADAPTER = new ProtoAdapter_BitmojiKitStickerPickerClose();
    public static final Long DEFAULT_STICKER_PICKER_SESSION_DURATION_MILLIS = 0L;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase#ADAPTER", tag = 1)
    public final BitmojiKitEventBase bitmoji_kit_event_base;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = 2)
    public final Long sticker_picker_session_duration_millis;

    static final class ProtoAdapter_BitmojiKitStickerPickerClose extends ProtoAdapter<BitmojiKitStickerPickerClose> {
        static {
            Covode.recordClassIndex(35677);
        }

        public ProtoAdapter_BitmojiKitStickerPickerClose() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitStickerPickerClose.class);
        }

        public final int encodedSize(BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose) {
            return BitmojiKitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitStickerPickerClose.bitmoji_kit_event_base) + ProtoAdapter.UINT64.encodedSizeWithTag(2, bitmojiKitStickerPickerClose.sticker_picker_session_duration_millis) + bitmojiKitStickerPickerClose.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = r2.bitmoji_kit_event_base
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase> r1 = com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = r2.bitmoji_kit_event_base
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase) r0
                r2.bitmoji_kit_event_base = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose.ProtoAdapter_BitmojiKitStickerPickerClose.redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose):com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BitmojiKitStickerPickerClose decode(ProtoReader protoReader) {
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
                    builder.sticker_picker_session_duration_millis(ProtoAdapter.UINT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose) {
            BitmojiKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitStickerPickerClose.bitmoji_kit_event_base);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 2, bitmojiKitStickerPickerClose.sticker_picker_session_duration_millis);
            protoWriter.writeBytes(bitmojiKitStickerPickerClose.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BitmojiKitStickerPickerClose, Builder> {
        public BitmojiKitEventBase bitmoji_kit_event_base;
        public Long sticker_picker_session_duration_millis;

        static {
            Covode.recordClassIndex(35676);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BitmojiKitStickerPickerClose build() {
            return new BitmojiKitStickerPickerClose(this.bitmoji_kit_event_base, this.sticker_picker_session_duration_millis, super.buildUnknownFields());
        }

        public final Builder bitmoji_kit_event_base(BitmojiKitEventBase bitmojiKitEventBase) {
            this.bitmoji_kit_event_base = bitmojiKitEventBase;
            return this;
        }

        public final Builder sticker_picker_session_duration_millis(Long l2) {
            this.sticker_picker_session_duration_millis = l2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35675);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BitmojiKitStickerPickerClose, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.bitmoji_kit_event_base = this.bitmoji_kit_event_base;
        builder.sticker_picker_session_duration_millis = this.sticker_picker_session_duration_millis;
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
        Long l2 = this.sticker_picker_session_duration_millis;
        if (l2 != null) {
            i4 = l2.hashCode();
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
        if (this.sticker_picker_session_duration_millis != null) {
            sb.append(", sticker_picker_session_duration_millis=").append(this.sticker_picker_session_duration_millis);
        }
        return sb.replace(0, 2, "BitmojiKitStickerPickerClose{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitStickerPickerClose)) {
            return false;
        }
        BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose = (BitmojiKitStickerPickerClose) obj;
        if (!unknownFields().equals(bitmojiKitStickerPickerClose.unknownFields()) || !Internal.equals(this.bitmoji_kit_event_base, bitmojiKitStickerPickerClose.bitmoji_kit_event_base) || !Internal.equals(this.sticker_picker_session_duration_millis, bitmojiKitStickerPickerClose.sticker_picker_session_duration_millis)) {
            return false;
        }
        return true;
    }

    public BitmojiKitStickerPickerClose(BitmojiKitEventBase bitmojiKitEventBase, Long l2) {
        this(bitmojiKitEventBase, l2, i.EMPTY);
    }

    public BitmojiKitStickerPickerClose(BitmojiKitEventBase bitmojiKitEventBase, Long l2, i iVar) {
        super(ADAPTER, iVar);
        this.bitmoji_kit_event_base = bitmojiKitEventBase;
        this.sticker_picker_session_duration_millis = l2;
    }
}
