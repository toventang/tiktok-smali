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

public final class CreativeKitShareStart extends Message<CreativeKitShareStart, Builder> {
    public static final ProtoAdapter<CreativeKitShareStart> ADAPTER = new ProtoAdapter_CreativeKitShareStart();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase#ADAPTER", tag = 1)
    public final CreativeKitEventBase creative_kit_event_base;

    static final class ProtoAdapter_CreativeKitShareStart extends ProtoAdapter<CreativeKitShareStart> {
        static {
            Covode.recordClassIndex(35699);
        }

        public ProtoAdapter_CreativeKitShareStart() {
            super(FieldEncoding.LENGTH_DELIMITED, CreativeKitShareStart.class);
        }

        public final int encodedSize(CreativeKitShareStart creativeKitShareStart) {
            return CreativeKitEventBase.ADAPTER.encodedSizeWithTag(1, creativeKitShareStart.creative_kit_event_base) + creativeKitShareStart.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart redact(com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase r0 = r2.creative_kit_event_base
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase> r1 = com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase r0 = r2.creative_kit_event_base
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase r0 = (com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase) r0
                r2.creative_kit_event_base = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart.ProtoAdapter_CreativeKitShareStart.redact(com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart):com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CreativeKitShareStart decode(ProtoReader protoReader) {
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
                    builder.creative_kit_event_base(CreativeKitEventBase.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CreativeKitShareStart creativeKitShareStart) {
            CreativeKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, creativeKitShareStart.creative_kit_event_base);
            protoWriter.writeBytes(creativeKitShareStart.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<CreativeKitShareStart, Builder> {
        public CreativeKitEventBase creative_kit_event_base;

        static {
            Covode.recordClassIndex(35698);
        }

        @Override // com.squareup.wire.Message.Builder
        public final CreativeKitShareStart build() {
            return new CreativeKitShareStart(this.creative_kit_event_base, super.buildUnknownFields());
        }

        public final Builder creative_kit_event_base(CreativeKitEventBase creativeKitEventBase) {
            this.creative_kit_event_base = creativeKitEventBase;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35697);
    }

    public final int hashCode() {
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CreativeKitEventBase creativeKitEventBase = this.creative_kit_event_base;
        if (creativeKitEventBase != null) {
            i2 = creativeKitEventBase.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = hashCode + i2;
        this.hashCode = i4;
        return i4;
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<CreativeKitShareStart, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.creative_kit_event_base = this.creative_kit_event_base;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.creative_kit_event_base != null) {
            sb.append(", creative_kit_event_base=").append(this.creative_kit_event_base);
        }
        return sb.replace(0, 2, "CreativeKitShareStart{").append('}').toString();
    }

    public CreativeKitShareStart(CreativeKitEventBase creativeKitEventBase) {
        this(creativeKitEventBase, i.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreativeKitShareStart)) {
            return false;
        }
        CreativeKitShareStart creativeKitShareStart = (CreativeKitShareStart) obj;
        if (!unknownFields().equals(creativeKitShareStart.unknownFields()) || !Internal.equals(this.creative_kit_event_base, creativeKitShareStart.creative_kit_event_base)) {
            return false;
        }
        return true;
    }

    public CreativeKitShareStart(CreativeKitEventBase creativeKitEventBase, i iVar) {
        super(ADAPTER, iVar);
        this.creative_kit_event_base = creativeKitEventBase;
    }
}
