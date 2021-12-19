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

public final class BitmojiKitEventBase extends Message<BitmojiKitEventBase, Builder> {
    public static final ProtoAdapter<BitmojiKitEventBase> ADAPTER = new ProtoAdapter_BitmojiKitEventBase();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.KitEventBase#ADAPTER", tag = 1)
    public final KitEventBase kit_event_base;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String sticker_picker_session_id;

    static final class ProtoAdapter_BitmojiKitEventBase extends ProtoAdapter<BitmojiKitEventBase> {
        static {
            Covode.recordClassIndex(35645);
        }

        public ProtoAdapter_BitmojiKitEventBase() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitEventBase.class);
        }

        public final int encodedSize(BitmojiKitEventBase bitmojiKitEventBase) {
            return KitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitEventBase.kit_event_base) + ProtoAdapter.STRING.encodedSizeWithTag(2, bitmojiKitEventBase.sticker_picker_session_id) + bitmojiKitEventBase.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.KitEventBase r0 = r2.kit_event_base
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.KitEventBase> r1 = com.snapchat.kit.sdk.core.metrics.model.KitEventBase.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.KitEventBase r0 = r2.kit_event_base
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.KitEventBase r0 = (com.snapchat.kit.sdk.core.metrics.model.KitEventBase) r0
                r2.kit_event_base = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.ProtoAdapter_BitmojiKitEventBase.redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase):com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BitmojiKitEventBase decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.kit_event_base(KitEventBase.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.sticker_picker_session_id(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BitmojiKitEventBase bitmojiKitEventBase) {
            KitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitEventBase.kit_event_base);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bitmojiKitEventBase.sticker_picker_session_id);
            protoWriter.writeBytes(bitmojiKitEventBase.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BitmojiKitEventBase, Builder> {
        public KitEventBase kit_event_base;
        public String sticker_picker_session_id;

        static {
            Covode.recordClassIndex(35644);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BitmojiKitEventBase build() {
            return new BitmojiKitEventBase(this.kit_event_base, this.sticker_picker_session_id, super.buildUnknownFields());
        }

        public final Builder kit_event_base(KitEventBase kitEventBase) {
            this.kit_event_base = kitEventBase;
            return this;
        }

        public final Builder sticker_picker_session_id(String str) {
            this.sticker_picker_session_id = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35643);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BitmojiKitEventBase, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.kit_event_base = this.kit_event_base;
        builder.sticker_picker_session_id = this.sticker_picker_session_id;
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
        KitEventBase kitEventBase = this.kit_event_base;
        int i4 = 0;
        if (kitEventBase != null) {
            i2 = kitEventBase.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 37;
        String str = this.sticker_picker_session_id;
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
        if (this.kit_event_base != null) {
            sb.append(", kit_event_base=").append(this.kit_event_base);
        }
        if (this.sticker_picker_session_id != null) {
            sb.append(", sticker_picker_session_id=").append(this.sticker_picker_session_id);
        }
        return sb.replace(0, 2, "BitmojiKitEventBase{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitEventBase)) {
            return false;
        }
        BitmojiKitEventBase bitmojiKitEventBase = (BitmojiKitEventBase) obj;
        if (!unknownFields().equals(bitmojiKitEventBase.unknownFields()) || !Internal.equals(this.kit_event_base, bitmojiKitEventBase.kit_event_base) || !Internal.equals(this.sticker_picker_session_id, bitmojiKitEventBase.sticker_picker_session_id)) {
            return false;
        }
        return true;
    }

    public BitmojiKitEventBase(KitEventBase kitEventBase, String str) {
        this(kitEventBase, str, i.EMPTY);
    }

    public BitmojiKitEventBase(KitEventBase kitEventBase, String str, i iVar) {
        super(ADAPTER, iVar);
        this.kit_event_base = kitEventBase;
        this.sticker_picker_session_id = str;
    }
}
