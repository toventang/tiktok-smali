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

public final class BitmojiKitPermissionUpdate extends Message<BitmojiKitPermissionUpdate, Builder> {
    public static final ProtoAdapter<BitmojiKitPermissionUpdate> ADAPTER = new ProtoAdapter_BitmojiKitPermissionUpdate();
    public static final BitmojiKitPermissionUpdateStatus DEFAULT_STATUS = BitmojiKitPermissionUpdateStatus.UNKNOWN_BITMOJI_KIT_PERMISSION_UPDATE_STATUS;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase#ADAPTER", tag = 1)
    public final BitmojiKitEventBase bitmoji_kit_event_base;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPermissionUpdateStatus#ADAPTER", tag = 2)
    public final BitmojiKitPermissionUpdateStatus status;

    static final class ProtoAdapter_BitmojiKitPermissionUpdate extends ProtoAdapter<BitmojiKitPermissionUpdate> {
        static {
            Covode.recordClassIndex(35648);
        }

        public ProtoAdapter_BitmojiKitPermissionUpdate() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitPermissionUpdate.class);
        }

        public final int encodedSize(BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate) {
            return BitmojiKitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitPermissionUpdate.bitmoji_kit_event_base) + BitmojiKitPermissionUpdateStatus.ADAPTER.encodedSizeWithTag(2, bitmojiKitPermissionUpdate.status) + bitmojiKitPermissionUpdate.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPermissionUpdate$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPermissionUpdate redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPermissionUpdate r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPermissionUpdate$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = r2.bitmoji_kit_event_base
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase> r1 = com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = r2.bitmoji_kit_event_base
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase r0 = (com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase) r0
                r2.bitmoji_kit_event_base = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPermissionUpdate r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPermissionUpdate.ProtoAdapter_BitmojiKitPermissionUpdate.redact(com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPermissionUpdate):com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPermissionUpdate");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BitmojiKitPermissionUpdate decode(ProtoReader protoReader) {
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
                    try {
                        builder.status(BitmojiKitPermissionUpdateStatus.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate) {
            BitmojiKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitPermissionUpdate.bitmoji_kit_event_base);
            BitmojiKitPermissionUpdateStatus.ADAPTER.encodeWithTag(protoWriter, 2, bitmojiKitPermissionUpdate.status);
            protoWriter.writeBytes(bitmojiKitPermissionUpdate.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<BitmojiKitPermissionUpdate, Builder> {
        public BitmojiKitEventBase bitmoji_kit_event_base;
        public BitmojiKitPermissionUpdateStatus status;

        static {
            Covode.recordClassIndex(35647);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BitmojiKitPermissionUpdate build() {
            return new BitmojiKitPermissionUpdate(this.bitmoji_kit_event_base, this.status, super.buildUnknownFields());
        }

        public final Builder bitmoji_kit_event_base(BitmojiKitEventBase bitmojiKitEventBase) {
            this.bitmoji_kit_event_base = bitmojiKitEventBase;
            return this;
        }

        public final Builder status(BitmojiKitPermissionUpdateStatus bitmojiKitPermissionUpdateStatus) {
            this.status = bitmojiKitPermissionUpdateStatus;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35646);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPermissionUpdate$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BitmojiKitPermissionUpdate, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.bitmoji_kit_event_base = this.bitmoji_kit_event_base;
        builder.status = this.status;
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
        BitmojiKitPermissionUpdateStatus bitmojiKitPermissionUpdateStatus = this.status;
        if (bitmojiKitPermissionUpdateStatus != null) {
            i4 = bitmojiKitPermissionUpdateStatus.hashCode();
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
        if (this.status != null) {
            sb.append(", status=").append(this.status);
        }
        return sb.replace(0, 2, "BitmojiKitPermissionUpdate{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitPermissionUpdate)) {
            return false;
        }
        BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate = (BitmojiKitPermissionUpdate) obj;
        if (!unknownFields().equals(bitmojiKitPermissionUpdate.unknownFields()) || !Internal.equals(this.bitmoji_kit_event_base, bitmojiKitPermissionUpdate.bitmoji_kit_event_base) || !Internal.equals(this.status, bitmojiKitPermissionUpdate.status)) {
            return false;
        }
        return true;
    }

    public BitmojiKitPermissionUpdate(BitmojiKitEventBase bitmojiKitEventBase, BitmojiKitPermissionUpdateStatus bitmojiKitPermissionUpdateStatus) {
        this(bitmojiKitEventBase, bitmojiKitPermissionUpdateStatus, i.EMPTY);
    }

    public BitmojiKitPermissionUpdate(BitmojiKitEventBase bitmojiKitEventBase, BitmojiKitPermissionUpdateStatus bitmojiKitPermissionUpdateStatus, i iVar) {
        super(ADAPTER, iVar);
        this.bitmoji_kit_event_base = bitmojiKitEventBase;
        this.status = bitmojiKitPermissionUpdateStatus;
    }
}
